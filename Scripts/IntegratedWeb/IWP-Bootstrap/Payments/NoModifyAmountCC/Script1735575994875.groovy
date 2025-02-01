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
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
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
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil



String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/IWPBootstrapData/VRelayPaymentsCC.xlsx"

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, EmulatorDataKey, AppID, MessageVersion, Amount, UDFID, NameID
def CardID, CalDate, AddressID, EmailPhoneID, Notes

String path = fileLoc
nameSheet = "NoModifyAmountCC"
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
			CustomKeywords.'iwpPages.emulatorIWP30.setDataEmulator_DD'(EmulatorDataKey)
			
			def testHarnessURL = GlobalVariable.urlTestHarness
			
			println("About to open harness")
			
			WebUI.openBrowser(testHarnessURL)
			WebUI.maximizeWindow()
			
			// Populate Test Harness
			CustomKeywords.'iwpPages.TestHarnessPage.setDataMethodEF'(row,dataFile)
	
			// Select Credit Card Payment Method
				CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByCreditCard'()
			
			
			// Select Make a Payment Button
				CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()

				Thread.sleep(1000)
			
				/*if(WebUI.verifyElementNotPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input_amount'),30) && WebUI.verifyTextPresent( "\$10.50", false)) {*/
				
				if(WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input_amount'), "readonly", 'true', 20))
					{
						
					// setData for Cardholder Name
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardName'(NameID)
			
			// setData for Card Information
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardInfo'(CardID)
			
			// setData for Address
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardAddress'(AddressID)
			
			// setData for Email and Phone Number
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardEmailAndPhone'(EmailPhoneID)
				
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCCDate'(CalDate)
				
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
				
				Thread.sleep(20000)
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
//								KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode')))
								resText = "Fail"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
//								println WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode'))
							}				
					}
					else {
//						KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode')))
						resText = "Fail"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
//						println WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode'))
					}
					

				}		
				WebUI.closeBrowser()		
			}
