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
String fileLoc = "KatalonData/Bootstrap/Reporting.xlsx"

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, EmulatorDataKey, AppID, MessageVersion, Amount, UDFID, NameID
def ACHID, CalDate, AddressID, EmailPhoneID, Notes

String path = fileLoc
nameSheet = "SPR_Deferred_PC"
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
			
			CustomKeywords.'iwpPages.TestHarnessPage.setDataMethodEF'(row,dataFile)
			
			
			// Select Pay by Personal Check Payment Method 
			
			CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByPersonal'()
			
			// Select Make a Payment Method
			
			CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()
			
			// Populate First name Last Name 
			
//			CustomKeywords.'iwpPages.achPersonalPaymentEntryBootstrapPage.setDataACHDefferedMain'(NameID, ACHID, EmailPhoneID, AddressID, Amount, UDFID,CalDate)
			
			
			
			  CustomKeywords.'iwpPages.achPersonalPaymentEntryBootstrapPage.setFirstNameLastName'(NameID)
			  
			  //Set data for Account Details
			  
			  CustomKeywords.'iwpPages.achPersonalPaymentEntryBootstrapPage.setACHData'(ACHID)
			  
			  //Set data for Address
			  
			  CustomKeywords.'iwpPages.achPersonalPaymentEntryBootstrapPage.setAddressData'(AddressID)
			  
			  //Set Data for Email and Phone
			  
			  CustomKeywords.'iwpPages.achPersonalPaymentEntryBootstrapPage.setEmailAndPhoneData'(EmailPhoneID)
			 
			  //Set Data for CalDate
			  CustomKeywords.'iwpPages.achPersonalPaymentEntryBootstrapPage.setDataCCDate'(CalDate)
			  
			  //Set data for Amount
			  
//			  CustomKeywords.'iwpPages.achPersonalPaymentEntryBootstrapPage.setDataAmount'(Amount)
			  
			  
			  //Set Data for UDF Fields
			  
			  CustomKeywords.'iwpPages.achPersonalPaymentEntryBootstrapPage.setUDFData'(UDFID)
			 
			  
			  // Select ACH Terms and Conditions
			  
			  CustomKeywords.'iwpPages.achPersonalPaymentEntryBootstrapPage.selectCheckboxACHTANDC'()
			  
			  //Click on continue button
			  
			  CustomKeywords.'iwpPages.achPersonalPaymentEntryBootstrapPage.ntinueButton'()
			 
				
			// Select Confirm Button on Payment Confirmation Page
			CustomKeywords.'iwpPages.paymentConfirmationBootstrapPage.selectButtonConfirm'()
			
			//Select Accept Fee and Confirm Payment
			CustomKeywords.'iwpPages.ConvenienceFeesBootstrapPage.selectAcceptFeeAndProcessPayment'()
			
			WebUI.delay(GlobalVariable.mediumTimeDelay)
			if (WebUI.verifyTextPresent("Deferred", false))
				{
//					println "Deferred is present on page. Deferred Pay is created"
					
					def plan_id = WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/deferred_plan_id'))
					
					GlobalVariable.capturedPaymentID = plan_id
					
					def remittance_id = WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/deferred_remittance_id'))
					println "Deferred is present on page. Deferred Pay is created"
					
					GlobalVariable.capturedRemittanceID = remittance_id
				
					println (plan_id)
					
					println (remittance_id)
				
			
				}
			else
				{
					KeywordUtil.markFailed("Deferred is not present on page")
					resText = "Fail"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				}
		
				WebUI.closeBrowser()
			
		
		}
}