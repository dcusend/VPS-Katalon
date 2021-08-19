import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.openqa.selenium.Keys as Keys

/* This test case will perform the following steps:
 * 		OPen the Vrelay 3.0 Emulator and populate the data from the provided Excel spreadsheet.
 * 		Open the QA test harness and populate all the necessary web pages.
 * 		Submit a Credit Card PayNow payment and verify static data on Receipt page.
 * 
 * 	
 */
	def numOfRows = findTestData('IWPTestData/IWP30PayNowCC').getRowNumbers()

	println(numOfRows)

	def dataFile = "IWPTestData/IWP30PayNowCC"


// For each row in the spreadsheet, execute the given steps	
for (def row = 1; row <= numOfRows; row++) {
  
//=======================================	
	
//Step1	Open Browser with Emulator URL
    //WebUI.openBrowser('https://qa.velocitypayment.com/agency/config.do?action=editor')
	WebUI.openBrowser(GlobalVariable.urlEmulator)
    WebUI.maximizeWindow()
//========================================	

//Step2 Get Emulator data from spreadsheet and populate data		
    CustomKeywords.'iwpPages.emulatorIWP30.getSetData'(row,dataFile)

    //CustomKeywords.'iwpPages.emulatorIWP30.setData'()
    WebUI.closeBrowser()
	
//=======================================

//Step3 Open Browser with QA Test Harness		
    //WebUI.openBrowser('https://dev-algorithm.govolution.com/vrelaytest/QA/version_2_2/vrelaytest.html')
	WebUI.openBrowser(GlobalVariable.urlTestHarness)
	WebUI.maximizeWindow()
	
//=======================================

//Step4 Get TestHarness data from spreadsheet and populate data
	
	CustomKeywords.'iwpPages.TestHarnessPage.setDataMethod'(row,dataFile)

//=======================================
	
//Step5 Verify if we are on the Select Payment Method page and populate the page
	
	if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCreditCard'), 30))
	{
		println("We are on Select Payment Method page, start populating")
		WebUI.check(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCreditCard'))
		Thread.sleep(1000)
		
		WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))
		
	}
	else
	{
		println("Not on Select Payment Method page")
	}
	
//=======================================
	
//Step6 Verify if we are on Credit Card Payment Entry page and populate the page
	
	CustomKeywords.'iwpPages.ccPaymentEntryPage.setDataCCPM'(row,dataFile)
	
//=======================================
	
// Step7 On the Confirmation page Verify static text and select Confirm button

				
		if (WebUI.verifyTextPresent(("Please verify the following information"), false))
			{
				println "Please verify the following information text is present on the Confirmation page"
			}
		else {"Please verify the following information text is not present on the Confirmation page"}
				
				
				
		if (WebUI.verifyTextPresent(("Is this information correct?"), false))
			{
				println "Is this information correct text is present on the Confirmation page"
			}
		else {println "Is this information correct text is not present on the Confirmation page"}
				
				
				
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmButton'),30))
			{
				WebUI.click(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmButton'))
						
			}
		else {println  "Confirm button is missing on the Confirmation page"}
	
	
//=======================================
	
//Step8 On the Receipt page Verify the Statis text
		
		Thread.sleep(10000)
		
		
		if (WebUI.verifyTextPresent(("Successful Payment Receipt"), false))
			{
				println "Successful Payment Receipt text is present on the Receipt page"
			}
		else {"Successful Payment Receipt text is not present on the Receipt page"}
		
		
		if (WebUI.verifyTextPresent(("Please print this receipt for your records"), false))
			{
				println "Please print this receipt for your records text is present on the Receipt page"
			}
		else {"Please print this receipt for your records text is not present on the Receipt page"}
		
		
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_Receipt/ExitButton'),30))
			{
				println "Exit Button is present on the Receipt page"
			}
		else {println "Exit button is not present on the Receipt page"}
			
//=======================================
	

		WebUI.closeBrowser()
		
}