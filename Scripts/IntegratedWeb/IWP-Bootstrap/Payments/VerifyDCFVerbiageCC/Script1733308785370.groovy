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
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/IWPBootstrapData/VRelayPaymentsCC.xlsx"

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, EmulatorDataKey, AppID, MessageVersion, Amount, UDFID, NameID
def CardID, CalDate, AddressID, EmailPhoneID, Notes

String path = fileLoc
nameSheet = "DCFCCVerbiage"
dataFileEmulator = "IWPTestData/EmulatorData"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)


//excelData = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)

numOfRows = dataFile.getRowNumbers()


println ("Number of Rows : " + numOfRows)


for (def row = 1; row <= numOfRows; row++)
{

	ExecuteTC = dataFile.getValue("Execute", row)
	
	if (ExecuteTC.equalsIgnoreCase("Y"))
		{
			System.out.println('Begin Record Number: ' + row)

			Date today = new Date()
			println (today)
			String datText = today
			
			// Retrieve Foreign Keys
			EmulatorDataKey = dataFile.getValue("EmulatorData", row)
			Notes = dataFile.getValue("Notes", row)
			AppID = dataFile.getValue("AppID", row)
			MessageVersion = dataFile.getValue("MessageVersion", row)
			Amount = dataFile.getValue("Amount", row)
			UDFID = dataFile.getValue("UDFID", row)
			NameID = dataFile.getValue("NameID", row)
			CardID = dataFile.getValue("CardID", row)
			CalDate = dataFile.getValue("CalDate", row)
			AddressID = dataFile.getValue("AddressID", row)
			EmailPhoneID = dataFile.getValue("EmailPhoneID", row)
			
	
			// Open Emulator URL and populate
			//CustomKeywords.'iwpPages.emulatorIWP30.setDataEmulator_DD'(EmulatorDataKey)//
			
			def testHarnessURL = GlobalVariable.urlTestHarness
			
			WebUI.openBrowser(testHarnessURL)
			WebUI.maximizeWindow()
			
			// Populate Test Harness
			CustomKeywords.'iwpPages.TestHarnessPage.setDataMethodEF'(row,dataFile)
	
			// Select Credit Card Payment Method
				CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByCreditCard'()
			
			
			// Select Make a Payment Button
				CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()

			
			// setData for Cardholder Name
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardName'(NameID)
			
			// setData for Card Information
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardInfo'(CardID)
			
			// setData for Address
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardAddress'(AddressID)
			
			// setData for Email and Phone Number
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardEmailAndPhone'(EmailPhoneID)
				
			// setData for Amount
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataAmount'(Amount)
			
			// setData for UDFs
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardUDF'(UDFID)
			
			// Select Customer CC Terms Checkbox
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.selectCheckboxCCTerms'()
				
			// Select Continue Button
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.selectButtonContinue'()
				
			// Select Confirm Button on Payment Confirmation Page
				CustomKeywords.'iwpPages.paymentConfirmationBootstrapPage.selectButtonConfirm'()
			
				/*
				 * //Select Accept Fee and Confirm Payment
				 * CustomKeywords.'iwpPages.ConvenienceFeesBootstrapPage.
				 * selectAcceptFeeAndProcessPayment'()
				 */
				if (WebUI.verifyTextPresent(("Convenience Fees Acceptance"), false)) {
					
					if (WebUI.verifyTextPresent(("This transaction is subject to a Convenience Fees of \$2.00"), false)) {
						isRequiredTextPresent = true
						println(isRequiredTextPresent)
					}
					else {
						isRequiredTextPresent = false
					}
					if(isRequiredTextPresent) {
						if(WebUI.verifyTextPresent(("Payment Amount"),false)) {
							isRequiredTextPresent = true
							println(isRequiredTextPresent)
							
						}
						else {
							isRequiredTextPresent = false
						}
					}	
						if(isRequiredTextPresent) {
							if(WebUI.verifyTextPresent(("Convenience Fees"), false)) {
								isRequiredTextPresent = true
								println(isRequiredTextPresent)
								
							}
							else {
								isRequiredTextPresent = false
							}
						}	
							if(isRequiredTextPresent) {
								if(WebUI.verifyTextPresent(("\$10.50"), false)) {
									isRequiredTextPresent = true
									println(isRequiredTextPresent)
									
								}
								else {
									isRequiredTextPresent = false
								}
							}	
							if(isRequiredTextPresent) {
									if(WebUI.verifyTextPresent(("Total Amount"), false)) {
										isRequiredTextPresent = true
										println(isRequiredTextPresent)
										
									}
								else {
										isRequiredTextPresent = false
									}
							}	
							if(isRequiredTextPresent) {
										if(WebUI.verifyTextPresent(("\$12.50"), false)) {
											isRequiredTextPresent = true
											println(isRequiredTextPresent)
											
										}
							else {
											isRequiredTextPresent = false
										}
							}		
										
							if(isRequiredTextPresent) {
											if(WebUI.verifyTextPresent(("Two transactions will appear on your bank statement, one in the amount of \$10.50 and one in the amount of \$2.00"), false)) {
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
											KeywordUtil.markFailed("Convenience Fees Acceptance not present on page")
											resText = "Fail"
											CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
										}
								}
					}
				
