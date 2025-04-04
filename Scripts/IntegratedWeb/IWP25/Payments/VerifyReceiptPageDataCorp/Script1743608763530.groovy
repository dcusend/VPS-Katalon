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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory



String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/IWPTestData/VRelay25PaymentsExtension.xlsx"
def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false


	
	nameSheet = "VerifyReceiptPageDataCorp"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/IWPTestData/VRelay25PaymentsExtension.xlsx", nameSheet, true)
	dataFileEmulator = "IWPTestData/EmulatorData"
	
	
	numOfRows = dataFile.getRowNumbers()
	println("Number of Records: " + numOfRows)
	
	
	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = dataFile.getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					// Retrieve EmulatorData Foreign Key
					def EmulatorDataKey = dataFile.getValue('EmulatorData', row)
					System.out.println('Value of Emulator Key is : ' + EmulatorDataKey)
					
					// Open Emulator URL and populate
					CustomKeywords.'iwpPages.emulatorIWP30.setDataEmulator_DD'(EmulatorDataKey)
					
					def testHarnessURL = GlobalVariable.urlTestHarness
					
					WebUI.openBrowser(testHarnessURL)
					WebUI.maximizeWindow()
					
					// Populate Test Harness
					CustomKeywords.'iwpPages.TestHarnessPage.setDataMethodEF'(row,dataFile)
					
					
					// Select Credit Card Payment Method
					WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCorporateCheck'))
					
					// Select Continue on Confirm page
					WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))
					
					
					// Set Data on Payment Entry page
					CustomKeywords.'iwpPages.achCorporatePaymentEntryPage.setDataCorporate'(row,dataFile)
					
					// Select Continue on Confirm page
//					WebUI.click(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmButton'))
					WebUI.click(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmAndSubmitACHButton'))
					
					
					
					Thread.sleep(2000)
					if (WebUI.verifyTextPresent("Your payment plan has been successfully created", false))
						{
								
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Jasmine", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Patrinol", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("258 Underwood rd", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Suite 600", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("840", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Arlington", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("VA", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("22201", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Some Company", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("udf data 1", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("udf data 2", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("udf data 3", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("udf data 4", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("udf data 5", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("udf data 6", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Orange", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Soccer", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("udf data 9", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("udf data 10", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							
							if (isRequiredTextPresent == true)
								{
									println "All the relevant texts are present on Receipt Page"
									KeywordUtil.markPassed("All the relevant texts are present on Receipt Page")
									resText = "Pass"
									CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
		
								}
							else
								{
									println "Some texts are missing on the Receipt page"
	//								KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode')))
									resText = "Fail"
									CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
	//								println WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode'))
								}
						}
					else
						{
							KeywordUtil.markFailed("Some texts are missing on the Receipt page")
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						}
				}		
				WebUI.closeBrowser()		
	}