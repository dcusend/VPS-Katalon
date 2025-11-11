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
String fileLoc = "KatalonData/BWPBootstrapData/BWPACHData.xlsx"
String fileLoc2 = "KatalonData/BWPBootstrapData/BWPCCData.xlsx"

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, EmulatorDataKey, AppID, MessageVersion, Amount, UDFID, NameID
def CardID, CalDate, AddressID, EmailPhoneID, Notes, ACHID

String path = fileLoc
nameSheet = "PayNowCorpNoCF"
dataFileEmulator = "BWPTestData/EmulatorData"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)

String path2 = fileLoc2
nameSheet2 = "PayNowCCNoCF"
dataFileEmulator = "BWPTestData/EmulatorData"
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
				ACHID = dataFile.getValue("ACHID", row)
				CalDate = dataFile.getValue("CalDate", row)
				AddressID = dataFile.getValue("AddressID", row)
				EmailPhoneID = dataFile.getValue("EmailPhoneID", row)
				
				
				// Open Emulator URL and populate
				CustomKeywords.'bwpPagesBootstrap.emulatorBootstrapPage.setDataEmulator_DD'(EmulatorDataKey)
				
				// Select Corporate Payment Method
				CustomKeywords.'bwpPagesBootstrap.selectPaymentMethodBootstrapPage.selectRadioPayByCorporate'()
													
				// Select Make a Payment Button
					CustomKeywords.'bwpPagesBootstrap.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()
					
					// setData for Corp Payment Entry Page
					CustomKeywords.'bwpPagesBootstrap.achCorporatePaymentEntryBootstrapPage.setDataACHMain'(NameID, ACHID, EmailPhoneID, AddressID, Amount, UDFID, AppID)
					
					WebUI.verifyTextPresent(("Payment Confirmation"), true)
					WebUI.verifyTextPresent(("Corporate Checking"), true)
					
					WebUI.click(findTestObject('Object Repository/BWP_Bootstrap/Page_CCPaymentEntry/ChangePaymentMethodButton'))
					
					// Select Credit Card Payment Method
					CustomKeywords.'bwpPagesBootstrap.selectPaymentMethodBootstrapPage.selectRadioPayByCreditCard'()
					
					// Select Make a Payment Button
					CustomKeywords.'bwpPagesBootstrap.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()
										
					
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
					

					// setData for CC Payment Entry Page
					CustomKeywords.'bwpPagesBootstrap.ccPaymentEntryBootstrapPage.setDataCCMain'(NameID, CardID, EmailPhoneID, AddressID, Amount, UDFID, AppID)
				
					WebUI.delay(3)
					WebUI.verifyTextPresent(("Payment Confirmation"), true)
					
					CustomKeywords.'bwpPagesBootstrap.paymentConfirmationBootstrapPage.selectButtonConfirm'()
					
					WebUI.delay(5)
					WebUI.verifyTextPresent(("Successful Payment Receipt"), true)
//					WebUI.verifyTextPresent(("Corporate Checking"), true)
					
					WebUI.closeBrowser()
					
			}
			
	}

