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


	
	nameSheet = "VerifyCancelLabelDeferredPC"
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
					WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByPersonalCheck'))
					
					// Select Continue on Confirm page
					WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))
					
					
					// Set Data on Payment Entry page
					CustomKeywords.'iwpPages.achPersonalPaymentEntryPage.setDataACHPPM'(row,dataFile)
					
					// Select Continue on Confirm page
					WebUI.click(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmButton'))
					
					
					Thread.sleep(2000)
					if (WebUI.verifyTextPresent("Deferred", false))
						{
							
							WebUI.click(findTestObject('Object Repository/IWP30/Page_Receipt/ViewScheduledPaymentsButton'))
							
							WebUI.switchToWindowTitle('View Scheduled Payments')
							Thread.sleep(4000)
							
							if (WebUI.verifyTextPresent("View Scheduled Payments", false)) {
								WebUI.click(findTestObject('Object Repository/IWP30/Page_ScheduledPayments/cancel_payment'))
//								WebUI.click(paymentplan_cancelLink)
								
							}
							
							if (WebUI.verifyTextPresent("Cancel Payment Plan", false)) {
								WebUI.click(findTestObject('Object Repository/IWP30/Page_PaymentPlan/btn_cancel'))
								WebUI.acceptAlert()
							}
							
							
							if(WebUI.verifyTextPresent("Your payment plan has been successfully canceled", false)) {
							isRequiredTextPresent = true
							println(isRequiredTextPresent)
							}
							else {
								isRequiredTextPresent = false
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("CAN Label:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Please verify the following information:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Payment Information:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("UDF2 Label:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("UDF3 Label:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("UDF4 Label:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("UDF7 Label:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("UDF8 Label:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("UDF9 Label:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Account Information", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("First Name on Check:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Last Name on Check:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Routing Transit Number:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Account Number:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Type of Account:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
						
							
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Address Line 1:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Address Line 2:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Country:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("City:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("State:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("ZIP Code:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Email Address:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
					
				
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Payment Plan Information:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Payment Plan Type:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Payment Plan Status:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Payment Plan ID:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Payment Plan Start Date:", false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}
								
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent("Amount:", false)) {
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
							KeywordUtil.markFailed("Deferred is not present on page")
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						}
				}		
				WebUI.closeBrowser()		
	}