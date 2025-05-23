import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.configuration.RunConfiguration as RC
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil


String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/IWPTestData/VRelay25Payments.xlsx"
def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false


	
	nameSheet = "PayNowCorpDCF"
	dataFile = "IWPTestData/IWP25PayNowCorpDCF"
	dataFileEmulator = "IWPTestData/EmulatorData"
	
	
	numOfRows = findTestData(dataFile).getRowNumbers()
	println("Number of Records: " + numOfRows)
	
	
	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					// Retrieve EmulatorData Foreign Key
					def EmulatorDataKey = findTestData(dataFile).getValue('EmulatorData', row)
					System.out.println('Value of Emulator Key is : ' + EmulatorDataKey)
					
					// Open Emulator URL and populate
					CustomKeywords.'iwpPages.emulatorIWP30.setDataEmulator_DD'(EmulatorDataKey)
					
					def testHarnessURL = GlobalVariable.urlTestHarness
					
					WebUI.openBrowser(testHarnessURL)
					WebUI.maximizeWindow()
					
					// Populate Test Harness
					CustomKeywords.'iwpPages.TestHarnessPage.setDataMethod'(row,dataFile)
					
					
					// Select Corporate Payment Method
//					WebUI.check(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCorporateCheck'))
					//Thread.sleep(1000)
					WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCorporateCheck'))
					
					// Select Continue on Confirm page
					WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))
					
					
					// Set Data on Credit Card Payment Entry page
					CustomKeywords.'iwpPages.achCorporatePaymentEntryPage.setDataCorporate'(row,dataFile)
					
					// Select Continue on Confirm page
					//WebUI.click(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmButton'))
					WebUI.click(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmAndSubmitACHButton'))
										
					
					Thread.sleep(5000)
					println('I am on real estate page')
					// Select Confirm on Convenience fees page
					
						if(WebUI.verifyTextPresent("Make a Real Estate Payment", false)) {
							isRequiredTextPresent = true
							println(isRequiredTextPresent)
						}
						else {
							isRequiredTextPresent = false
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("This transaction is subject to a Convenience Fees of \$2.00.", false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Payment Amount:  \$10.50", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
					
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Convenience Fees:  \$2.00", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Total Amount:  \$12.50", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Two transactions will appear on your bank statement, one in the amount of \$10.50 and one in the amount of \$2.00.", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
					
						Thread.sleep(10000)
						
					WebUI.click(findTestObject('Object Repository/IWP30/Page_ConvenienceFees/btn_convFeeNotifyAction'))
					Thread.sleep(10000)
					if (WebUI.verifyTextPresent("Successful Payment Receipt", false))
						{
							println "Successful Payment Receipt text is present on the Receipt page"
							KeywordUtil.markPassed("Successful Payment Receipt text is present on the Receipt page")
							resText = "Pass"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)

						}
					else
						{
							println "Successful Payment Receipt text is not present on the Receipt page"
							KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode')))
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
							println WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode'))
						}
						
					
					//assert WebUI.verifyTextPresent(("Successful Payment Receipt"), false) == true :  "Successful Payment Receipt text is present on the Receipt page thru Assert"
					

				}		
				WebUI.closeBrowser()		
		}