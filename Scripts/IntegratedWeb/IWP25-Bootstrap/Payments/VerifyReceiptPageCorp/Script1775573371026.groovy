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
nameSheet = "VerifyPaymentReceiptCorp"
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
			
			 CustomKeywords.'iwpPages.emulatorIWP30.setDataEmulator_DD'(EmulatorDataKey)
			 
			
			def testHarnessURL = GlobalVariable.urlTestHarness
			
			WebUI.openBrowser(testHarnessURL)
			WebUI.maximizeWindow()
			
			// Populate Test Harness
			
			CustomKeywords.'iwpPages.TestHarnessPage.setDataMethodEF'(row, dataFile)
			
			CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByCorporate'()
			
			CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()
			
			WebUI.delay(GlobalVariable.shortTimeDelay)
					
			CustomKeywords.'iwpPages.achCorporatePaymentEntryBootstrapPage.setDataACHMain'(NameID, ACHID, EmailPhoneID, AddressID, Amount, UDFID)
			
			CustomKeywords.'iwpPages.paymentConfirmationBootstrapPage.selectButtonConfirm'()
			
			
			WebUI.delay(GlobalVariable.longTimeDelay)
			
						
				WebUI.verifyTextPresent(("Successful Payment Receipt"), false)
				
				WebUI.verifyTextPresent(("Payment Information"), false)
				
				WebUI.verifyTextPresent(("Remittance ID"), false)
				
				WebUI.verifyTextPresent(("Payment ID"), false)
				
				WebUI.verifyTextPresent(("Transaction Type"), false)
				
				WebUI.verifyTextPresent(("Debit"), false)
				
				WebUI.verifyTextPresent(("Account Type"), false)
				
				WebUI.verifyTextPresent(("Corporate Checking"), false)
				
				WebUI.verifyTextPresent(("Company's Name:"),false)
			
			WebUI.verifyTextPresent(('Smith Company'),false)
			
			WebUI.verifyTextPresent(('Routing Number:'),false)
			
			WebUI.verifyTextPresent(('*****2691'),false)
			
			WebUI.verifyTextPresent(('Account Number:'),false)
			
			WebUI.verifyTextPresent(('****5489'),false)
			
			WebUI.verifyTextPresent(('Employer Identification Number (EIN):'),false)
			
			WebUI.verifyTextPresent(('999999999'),false)
			
					
			WebUI.verifyTextPresent(('Address Line 1:'),false)
			
			WebUI.verifyTextPresent(('258 Underwood rd'),false)
			
			WebUI.verifyTextPresent(('Address Line 2:'),false)
			
			WebUI.verifyTextPresent(('Suite 600'),false)
			
			WebUI.verifyTextPresent(('Country:'),false)
			
			WebUI.verifyTextPresent(('United States'),false)
			
			WebUI.verifyTextPresent(('City:'),false)
			
			WebUI.verifyTextPresent(('ARLINGTON'),false)
			
			WebUI.verifyTextPresent(('State:'),false)
			
			WebUI.verifyTextPresent(('Virginia'),false)
			
			WebUI.verifyTextPresent(('ZIP Code:'),false)
			
			WebUI.verifyTextPresent(('22201'),false)
		
			
			WebUI.verifyTextPresent(('Account Information'),false)
			
			WebUI.verifyTextPresent(('Tax Amount:'),false)
			
			WebUI.verifyTextPresent(('$0.00'),false)
			
			WebUI.verifyTextPresent(('Amount:'),false)
			
			WebUI.verifyTextPresent(('$10.50'),false)
			
			WebUI.verifyTextPresent(('UDF1 Label:'),false)
			
			WebUI.verifyTextPresent(('udf data 1'),false)
			
			WebUI.verifyTextPresent(('UDF2 Label:'),false)
			
			WebUI.verifyTextPresent(('udf data 2'),false)
			
			WebUI.verifyTextPresent(('UDF3 Label:'),false)
			
			WebUI.verifyTextPresent(('udf data 3'),false)
			
			WebUI.verifyTextPresent(('UDF4 Label:'),false)
			
			WebUI.verifyTextPresent(('udf data 4'),false)
			
			WebUI.verifyTextPresent(('UDF6 Label:'),false)
			
			WebUI.verifyTextPresent(('udf data 6'),false)
			
			WebUI.verifyTextPresent(('UDF7 Label:'),false)
			
			WebUI.verifyTextPresent(('Orange'),false)
			
			WebUI.verifyTextPresent(('UDF8 Label:'),false)
			
			WebUI.verifyTextPresent(('Soccer'),false)
			
			WebUI.verifyTextPresent(('UDF9 Label:'),false)
			
			WebUI.verifyTextPresent(('udf data 9'),false)
			
			
			if (WebUI.verifyTextPresent(("Successful Payment Receipt"), false))
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
		}
		
		WebUI.closeBrowser()
		
}
