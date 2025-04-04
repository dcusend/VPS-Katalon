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


	
	nameSheet = "VerifyConfirmPageLabelsPS"
	dataFile = "IWPTestData/IWP25VerifyConfirmPageLabelsPS"
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
					
					
					// Select PersonalCheck Payment Method
					WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByPersonalCheck'))
					
					// Select Continue on Confirm page
					WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))
					
					
					// Set Data on Payment Entry page
					CustomKeywords.'iwpPages.achPersonalPaymentEntryPage.setDataACHPPM'(row,dataFile)
					
					
					Thread.sleep(5000)
						if(WebUI.verifyTextPresent("Make a Real Estate Payment", false)) {
							isRequiredTextPresent = true
							println(isRequiredTextPresent)
						}
						else {
							isRequiredTextPresent = false
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Confirm Payment Information", false)) {
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
							}
							else {
								isRequiredTextPresent = false
							}
						}
					
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Payment Information:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Tax Amount:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Amount:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("UDF2 Label:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("UDF3 Label:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("UDF4 Label:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("UDF7 Label:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("UDF8 Label:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("UDF9 Label:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("UDF9 Label:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Account Information:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("First Name on Check:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Last Name on Check:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Routing Transit Number:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Account Number:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}	
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Type of Account:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Payment Date:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Address Line 1:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Country:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("City:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("State:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("ZIP Code:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Email Address:", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent("Is this information correct?", false)) {
								isRequiredTextPresent = true
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						
						
						
						if (isRequiredTextPresent == true)
							{
								println "All the relevant texts are present on Confirm Page"
								KeywordUtil.markPassed("All the relevant texts are present on Confirm Page")
								resText = "Pass"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
	
							}
						else
							{
								println "Some texts are missing on the Confirm page"
//								KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode')))
								resText = "Fail"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
//								println WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode'))
							}
						
						
							// Select Continue on Confirm page
						   WebUI.click(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmAndSubmitACHButton'))
						
				}
				WebUI.closeBrowser()
		}