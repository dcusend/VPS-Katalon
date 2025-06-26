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
String fileLoc = "KatalonData/IWPTestData/DisplayCFData.xlsx"
def numOfRows, dataFile, nameSheet, dataFileEmulator, Amount,AppID, feesAccept,feeType, totalAmount, isRequiredTextPresent = true


	
	
	nameSheet = "PayByCorp-2.3"
	println("Number of Records: " + numOfRows)
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/IWPTestData/DisplayCFData.xlsx", nameSheet, true)
	
	numOfRows = dataFile.getRowNumbers()
	
	println(numOfRows)
	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			isRequiredTextPresent = true
			
			AppID = dataFile.getValue('AppID', row)
					
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
					
						//Emulator Amount on Confirm Page
					
						Amount = dataFile.getValue('EmulatorAmount', row)
						println(Amount)
						WebUI.verifyTextPresent(Amount, false)
					
					
					def stringArray, VerificationText
					if(Amount == '$5') {
						VerificationText =  "American Express, Service Fee = \$1.00, Discover, Service Fee = \$2.00, MasterCard, Service Fee = \$3.00, MasterCard Debit, Service Fee = \$4.00, Visa, Service Fee = \$5.00, Visa Debit, Service Fee = \$6.00, Personal Check, Service Fee = \$7.00, Corporate Check, Service Fee = \$8.00"						
						stringArray = VerificationText.split(",")
						System.out.println('string array ' +  stringArray)						
					}
					else if(Amount == '$200') {
						VerificationText =  "American Express, Service Fee = \$10.00, Discover, Service Fee = \$10.00, MasterCard, Service Fee = \$10.00, MasterCard Debit, Service Fee = \$10.00, Visa, Service Fee = \$10.00, Visa Debit, Service Fee = \$10.00, Personal Check, Service Fee = \$10.00, Corporate Check, Service Fee = \$10.00"
						stringArray = VerificationText.split(",")
						System.out.println('string array ' +  stringArray)
					}
					else if(Amount == '$10.50') {
						VerificationText =  "American Express, Service Fee = \$1.00, Discover, Service Fee = \$2.00, MasterCard, Service Fee = \$3.00, MasterCard Debit, Service Fee = \$4.00, Visa, Service Fee = \$5.00, Visa Debit, Service Fee = \$6.00, Personal Check, Service Fee = \$7.00, Corporate Check, Service Fee = \$8.00"						
						stringArray = VerificationText.split(",")
						System.out.println('string array ' +  stringArray)
					}

				
					for(def item in stringArray)
					{					 
					   if(isRequiredTextPresent == true) {
						   println(item.trim())
						   if(WebUI.verifyTextPresent(item.trim(),false)) {
							  isRequiredTextPresent = true
						   }
						   else {
							   isRequiredTextPresent = false
						   }
					   }				
					}
					
						System.out.println(isRequiredTextPresent)				
					
					// Select Corporate Payment Method
						WebUI.click(findTestObject('Object Repository/DisplayConvFees/Page_Choose_PaymentMethod/select_btn_Corp'))
					// Select Continue on Confirm page
						WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))
					
					
					 //Set Data on Credit Card Payment Entry page
						CustomKeywords.'iwpPages.achCorporatePaymentEntryBootstrapPage.setDataCorporate'(row,dataFile)

					
					Thread.sleep(1000)
					
					//Confirm Fees Accept Page
						feesAccept = dataFile.getValue('FeesAcceptance', row)
						totalAmount = dataFile.getValue('TotalAmount', row)
						feeType = dataFile.getValue('FeesType', row)
						confirmAmount = dataFile.getValue('ConfirmAmount', row)
						
				
					// Select Continue on Confirm page
						WebUI.click(findTestObject('Object Repository/DisplayConvFees/Page_Confirmation/btn_confirm'))
					
		
						if(WebUI.verifyTextPresent('CF Label', false)) {
							isRequiredTextPresent = true
							println(isRequiredTextPresent)
							
						}
						else {
							isRequiredTextPresent = false
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent('This transaction is subject to a CF Label of ' +  feesAccept, false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent('Payment Amount:', false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent(confirmAmount, false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent('CF Label:', false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent(feesAccept, false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent('Total Amount:', false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent(totalAmount, false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
													
					if(AppID == '920' || AppID == '921') {
						if(isRequiredTextPresent) {					
							if(WebUI.verifyTextPresent('One transaction in the amount of ' + totalAmount + ' will appear on your bank statement.', false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
					}
					else if(AppID == '914' || AppID == '915') {					
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent('Two transactions will appear on your bank statement, one in the amount of ' + confirmAmount + ' and one in the amount of ' + feesAccept, false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
					}
					
					WebUI.click(findTestObject('Object Repository/DisplayConvFees/Page_AcceptFees/btn_acceptfee'))
					
					Thread.sleep(8000)
	
					if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent('Amount:', false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent(confirmAmount, false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent('CF Label:', false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent(feesAccept, false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent('CF Label Type:', false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent(feeType, false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent('Total Amount:', false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent(totalAmount, false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}
						
					
					
					if (isRequiredTextPresent)
						{
							println "Relevant texts are present on all pages"
							KeywordUtil.markPassed("Relevant texts are present on all pages")
							resText = "Pass"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)

						}
					else
						{
							println "Relevant texts are not present on all pages"
//							KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode')))
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
							println WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode'))
						}

				}
				WebUI.closeBrowser()
		}