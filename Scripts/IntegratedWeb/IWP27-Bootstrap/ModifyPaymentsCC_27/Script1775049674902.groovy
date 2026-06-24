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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil


String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/IWPBootstrapData/VRelayPaymentsCC_27.xlsx"

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, EmulatorDataKey, AppID, MessageVersion, Amount, UDFID, NameID
def CardID, CalDate, AddressID, EmailPhoneID, Notes

String path = fileLoc
nameSheet = "ModifyPaymentsCC1"
dataFileEmulator = "IWPTestData/EmulatorData"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)

nameSheet2 = "ModifyPaymentsCC2"
dataFile2 = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet2, true)

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
				
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCCDate'(CalDate)
				
			// setData for Amount
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataAmount'(Amount)
			
			// setData for UDFs
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardUDF'(UDFID)
			
			// Select Customer CC Terms Checkbox
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.selectCheckboxCCTerms'()	
				
			// Select Continue Button
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.selectButtonContinue'()
				
					WebUI.delay(5)
					WebUI.verifyTextPresent(("udf data 2"), true)
					WebUI.verifyTextPresent(("Bridges Waters"), true)
					WebUI.verifyTextPresent(("0011"), true)
					WebUI.verifyTextPresent(("12/2028"), true)
					WebUI.verifyTextPresent(("698 manadan terrace"), true)
					WebUI.verifyTextPresent(("Suite 600"), true)
					WebUI.verifyTextPresent(("HOOKSETT"), true)
					WebUI.verifyTextPresent(("03106"), true)
										
					WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_Confirmation_Bootstrap/input_changePaymentMethodButton'))
					
					WebUI.delay(GlobalVariable.shortTimeDelay)
					
					// Select Credit Card Payment Method
					CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByCreditCard'()
					
					
					
					// Select Make a Payment Button
					CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()
					
					// Retrieve Foreign Keys
					EmulatorDataKey = dataFile2.getValue("EmulatorData", row)
					Notes = dataFile2.getValue("Notes", row)
					AppID = dataFile2.getValue("AppID", row)
					MessageVersion = dataFile2.getValue("MessageVersion", row)
					Amount = dataFile2.getValue("Amount", row)
					UDFID = dataFile2.getValue("UDFID", row)
					NameID = dataFile2.getValue("NameID", row)
					CardID = dataFile2.getValue("CardID", row)
					CalDate = dataFile2.getValue("CalDate", row)
					AddressID = dataFile2.getValue("AddressID", row)
					EmailPhoneID = dataFile2.getValue("EmailPhoneID", row)
					
					
				WebUI.delay(GlobalVariable.shortTimeDelay)
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
				
					WebUI.delay(GlobalVariable.shortTimeDelay)
					
					WebUI.verifyTextPresent(("udf data 2"), true)
					WebUI.verifyTextPresent(("Carlos Jacinta"), true)
					WebUI.verifyTextPresent(("0035"), true)
					WebUI.verifyTextPresent(("10/2028"), true)
					WebUI.verifyTextPresent(("698 manadan terrace"), true)
					WebUI.verifyTextPresent(("Suite 600"), true)
					WebUI.verifyTextPresent(("HOOKSETT"), true)
					WebUI.verifyTextPresent(("03106"), true)
					
					CustomKeywords.'iwpPages.paymentConfirmationBootstrapPage.selectButtonConfirm'()
					
					WebUI.delay(GlobalVariable.mediumTimeDelay)
					
					WebUI.verifyTextPresent(("udf data 2"), true)
					WebUI.verifyTextPresent(("CARLOS JACINTA"), true)
					WebUI.verifyTextPresent(("0035"), true)
					WebUI.verifyTextPresent(("10/2028"), true)
					WebUI.verifyTextPresent(("698 manadan terrace"), true)
					WebUI.verifyTextPresent(("Suite 600"), true)
					WebUI.verifyTextPresent(("HOOKSETT"), true)
					WebUI.verifyTextPresent(("03106"), true)
					
					
					WebUI.closeBrowser()
			}
			
	}

