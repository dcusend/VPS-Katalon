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
String fileLoc = "KatalonData/IWPBootstrapData/vRelayPaymentsACH.xlsx"

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, EmulatorDataKey, AppID, MessageVersion, Amount, UDFID, NameID
def ACHID, CalDate, AddressID, EmailPhoneID, Notes

String path = fileLoc
nameSheet = "DCFCorpVerbiage"
dataFileEmulator = "IWPTestData/EmulatorData"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)
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
			
			EmulatorDataKey = dataFile.getValue("EmulatorData", row)
			Notes = dataFile.getValue("Notes", row)
			AppID = dataFile.getValue("AppID", row)
			MessageVersion = dataFile.getValue("MessageVersion", row)
			Amount = dataFile.getValue("Amount", row)
			UDFID = dataFile.getValue("UDFID", row)
			NameID = dataFile.getValue("NameID", row)
			ACHID = dataFile.getValue("ACHID", row)
			CalDate = dataFile.getValue("CalDate", row)
			AddressID = dataFile.getValue("AddressID", row)
			EmailPhoneID = dataFile.getValue("EmailPhoneID", row)
			
			// Open Emulator URL and populate
			
			 /*CustomKeywords.'iwpPages.emulatorIWP30.setDataEmulator_DD'(EmulatorDataKey)*/
			 
			
			def testHarnessURL = GlobalVariable.urlTestHarness
			
			WebUI.openBrowser(testHarnessURL)
			WebUI.maximizeWindow()
			
			// Populate Test Harness
			
			CustomKeywords.'iwpPages.TestHarnessPage.setDataMethodEF'(row, dataFile)
			
			CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByCorporate'()
			
			CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()
			
			CustomKeywords.'iwpPages.achCorporatePaymentEntryBootstrapPage.setDataACHMain'(NameID, ACHID, EmailPhoneID, AddressID, Amount, UDFID)
			
			CustomKeywords.'iwpPages.paymentConfirmationBootstrapPage.selectButtonConfirm'()
			
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
