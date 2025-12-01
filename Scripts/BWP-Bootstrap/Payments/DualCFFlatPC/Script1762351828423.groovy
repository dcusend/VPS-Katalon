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

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, EmulatorDataKey, AppID, MessageVersion, Amount, UDFID, NameID
def CardID, CalDate, AddressID, EmailPhoneID, Notes

String path = fileLoc
nameSheet = "DualCFFlatPC"
dataFileEmulator = "BWPTestData/EmulatorData"
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
					
				// Select Credit Card Payment Method
					CustomKeywords.'bwpPagesBootstrap.selectPaymentMethodBootstrapPage.selectRadioPayByPersonal'()
								
				// Select Make a Payment Button
					CustomKeywords.'bwpPagesBootstrap.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()
					
				// setData for CC Payment Entry Page
					CustomKeywords.'bwpPagesBootstrap.achPersonalPaymentEntryBootstrapPage.setDataACHMain'(NameID, ACHID, EmailPhoneID, AddressID, Amount, UDFID, AppID)
				
					
					//Select  Confirm Button
					CustomKeywords.'bwpPagesBootstrap.paymentConfirmationBootstrapPage.selectButtonConfirm'()
					
					WebUI.delay(2)
					//Select Accept Fee and Confirm Payment
					CustomKeywords.'bwpPagesBootstrap.convenienceFeesBootstrapPage.selectAcceptFeeAndProcessPayment'()
					
					WebUI.delay(8)
					
					WebUI.verifyTextPresent(("Successful Payment Receipt"), true)
					WebUI.verifyTextPresent(("Amount:"), true)
					WebUI.verifyTextPresent(("10.00"), true)
					WebUI.verifyTextPresent(("Convenience Fees:"), true)
					WebUI.verifyTextPresent(("1.00"), true)
					WebUI.verifyTextPresent(("Convenience Fees Type:"), true)
					WebUI.verifyTextPresent(("Dual Transaction"), true)
					WebUI.verifyTextPresent(("Total Amount:"), true)
					WebUI.verifyTextPresent(("11.00"), true)
					
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
						
						WebUI.closeBrowser()
					
			}
			
	}

