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
def numOfRows, dataFile, nameSheet, dataFileEmulator


	
	nameSheet = "NoOverPayErrorCorp"
	dataFile = "IWPTestData/IWP25NoOverPayErrorCorp"
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
					WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCorporateCheck'))
					
					// Select Continue on Confirm page
					WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))
					
					
					// Set Data on Credit Card Payment Entry page
					CustomKeywords.'iwpPages.achCorporatePaymentEntryPage.setDataCorporate'(row,dataFile)
					
					
					Thread.sleep(10000)
					if (WebUI.verifyTextPresent("Payment amounts more than 10.50 are not accepted", false))
						{
							println "Over Pay Error message shown"
							KeywordUtil.markPassed("Over Pay Error message shown")
							resText = "Pass"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)

						}
					else
						{
							println "Over Pay Error message not shown"
							KeywordUtil.markFailed("Over Pay Error message not shown")
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
//							println WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode'))
						}					
				}	
				WebUI.closeBrowser()	
		}