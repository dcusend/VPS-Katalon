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


String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/IWPBootstrapData/VRelayPaymentsCC.xlsx"
String fileLoc2 = "KatalonData/IWPBootstrapData/vRelayPaymentsACH.xlsx"

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, EmulatorDataKey, AppID, MessageVersion, Amount, UDFID, NameID
def CardID, CalDate, AddressID, EmailPhoneID, Notes, ACHID

String path = fileLoc
nameSheet = "PayNowCCNoCF"
dataFileEmulator = "IWPTestData/EmulatorData"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)


String path2 = fileLoc2
nameSheet2 = "PayNowCorpNoCF"
dataFileEmulator = "IWPTestData/EmulatorData"
dataFile2 = ExcelFactory.getExcelDataWithDefaultSheet(path2, nameSheet2, true)

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
	
					WebUI.delay(GlobalVariable.shortTimeDelay)
					
					WebUI.verifyTextPresent(("Payment Confirmation"), true)
					
					WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_Confirmation_Bootstrap/input_changePaymentMethodButton'))
					
					WebUI.delay(GlobalVariable.shortTimeDelay)
					
					// Select Corporate Payment Method
					CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByCorporate'()
					
					// Select Make a Payment Button
					CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()
											
					
					Notes = dataFile2.getValue("Notes", row)
					AppID = dataFile2.getValue("AppID", row)
					MessageVersion = dataFile2.getValue("MessageVersion", row)
					Amount = dataFile2.getValue("Amount", row)
					UDFID = dataFile2.getValue("UDFID", row)
					NameID = dataFile2.getValue("NameID", row)
					ACHID = dataFile2.getValue("ACHID", row)
					CalDate = dataFile2.getValue("CalDate", row)
					AddressID = dataFile2.getValue("AddressID", row)
					EmailPhoneID = dataFile2.getValue("EmailPhoneID", row)
					
				// setData for Corp Payment Entry Page
					CustomKeywords.'iwpPages.achCorporatePaymentEntryBootstrapPage.setDataACHMain'(NameID, ACHID, EmailPhoneID, AddressID, Amount, UDFID)
										
					WebUI.delay(GlobalVariable.shortTimeDelay)
					WebUI.verifyTextPresent(("Payment Confirmation"), true)
					WebUI.verifyTextPresent(("Corporate Checking"), true)
					
					CustomKeywords.'iwpPages.paymentConfirmationBootstrapPage.selectButtonConfirm'()
					
					WebUI.delay(GlobalVariable.shortTimeDelay)
					WebUI.verifyTextPresent(("Debit"), true)
					WebUI.verifyTextPresent(("Corporate Checking"), true)
					
					
//					if (WebUI.verifyTextPresent("Corporate Checking", false)) {
//						KeywordUtil.markPassed("Your payment plan has been successfully changed from CC to Corp")
//						resText = "Pass"
//						println row
//						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
//					}
//					else {
//						KeywordUtil.markFailed("Your payment plan has not been changed from CC to Corp")
//						resText = "Fail"
//						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
//					}
					WebUI.closeBrowser()
					
			}
			
	}

