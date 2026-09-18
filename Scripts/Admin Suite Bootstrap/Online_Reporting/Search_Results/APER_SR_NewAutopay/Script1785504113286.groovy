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
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.text.SimpleDateFormat
import java.util.Calendar


String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/Bootstrap/Reporting.xlsx"

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, EmulatorDataKey, AppID, MessageVersion, Amount, UDFID, NameID
def CardID, CalDate, AddressID, EmailPhoneID, Notes

// VT Paths
String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"

//Reports Paths
String path_Reporting = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/"
String path_Operation_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_Operational Reports/"


String path = fileLoc
nameSheet = "APER_NewAutopay"
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
				CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonEnrollAutopay'()

			
			// setData for Cardholder Name
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardName'(NameID)
			
			// setData for Card Information
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardInfo'(CardID)
			
			// setData for Address
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardAddress'(AddressID)
			
			// setData for Email and Phone Number
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardEmailAndPhone'(EmailPhoneID)
				
			/*// setData for Amount
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataAmount'(Amount)*/
			
			// setData for UDFs
//				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardUDF'(UDFID)
			
			// Select Customer CC Terms Checkbox
//				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.selectCheckboxCCTerms'()
				
			// Select Continue Button
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.selectCheckboxStorePaymentMethod'()
				
			// Select Continue Button
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.selectButtonContinue'()
				
			// Select Confirm Button on Payment Confirmation Page
				CustomKeywords.'iwpPages.paymentConfirmationBootstrapPage.selectButtonConfirm'()
		
				def plan_id = WebUI.getText(findTestObject('Object Repository/IWP_Bootstrap/Page_CreateAutoPayPage/plan_id'))
				
				WebUI.closeBrowser()
				
				
				// Log into Admin Suite
				CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
				
				
				// Navigate to Reports Section and select Auto Pay Payment Plan Report to verify the report is generated successfully
				WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))
				
				WebUI.click(findTestObject(path_Dashboard + 'a_Operational Reports'))
				
				WebUI.click(findTestObject(path_Operation_Reports + 'a_Auto Pay Enrollments Report'))
				
				WebUI.verifyTextPresent('Please select a payment application on which to base this report.', false)
				
				WebUI.verifyOptionsPresent(findTestObject(path_Operation_Reports + 'select_customer'),['imtiaz'])
				
				WebUI.selectOptionByLabel(findTestObject(path_Operation_Reports + 'select_app'), 'AutoVrelay232527ReceiptChanges(1234567891111111)', false)
				
				WebUI.click(findTestObject(path_Operation_Reports + 'btn_Continue'))
				
				WebUI.delay(GlobalVariable.shortTimeDelay)
				WebUI.verifyTextPresent('Auto Pay Enrollments Report', false)
				
				WebUI.verifyTextPresent('Application:', false)
				
				WebUI.verifyTextPresent('AutoVrelay232527ReceiptChanges(1234567891111111)', false)
				
				WebUI.verifyTextPresent('Date Generated:', false)
				
				
				Date newDate = new Date()
				SimpleDateFormat dateGenerated = new SimpleDateFormat('MMMM dd, yyyy')
				String formattedDateGenerated = dateGenerated.format(newDate)
				
				WebUI.verifyTextPresent(formattedDateGenerated, false)
				
				WebUI.verifyTextPresent('Time Zone:', false)
									
				WebUI.verifyTextPresent('EDT', false)
				
	
				WebUI.verifyTextPresent('Plan ID', false)
				
				WebUI.verifyTextPresent(plan_id, false)
				
				WebUI.verifyTextPresent('Plan Start Date', false)
										
				
				Date todaysDate = new Date()
				SimpleDateFormat outputFormatNew = new SimpleDateFormat('MM/dd/yyyy')
				String formattedTodaysDate = outputFormatNew.format(todaysDate)
				
				println('Todays Date is : ' + formattedTodaysDate)
				WebUI.verifyTextPresent(formattedTodaysDate, false)
				
				WebUI.verifyTextPresent('Plan Max Amount', false)
				
				WebUI.verifyTextPresent('$0.00', false)
				
				WebUI.verifyTextPresent('Payer Name', false)
				
				WebUI.verifyTextPresent('Bridges Waters', false)
				
				WebUI.verifyTextPresent('Client Acct Number', false)
				
				WebUI.verifyTextPresent(GlobalVariable.generatedCAN, false)
				
				WebUI.verifyTextPresent('Payment Type', false)
				
				WebUI.verifyTextPresent('Credit Card', false)
				
				WebUI.verifyTextPresent('Tender Type', false)
				
				WebUI.verifyTextPresent('AX-1003', false)
				
				WebUI.verifyTextPresent('Plan Type', false)
				
				WebUI.verifyTextPresent('AUTO PAY', false)
				
				WebUI.verifyTextPresent('Expiration Date(MM-YYYY)', false)
				
				WebUI.verifyTextPresent('02-2028', false)
				
						
				WebUI.verifyTextPresent('Export Options:', false)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_CSV'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_EXCEL'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_PDF'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_XML'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_First_Pagination'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Last_Pagination'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Next_Pagination'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Previous_Pagination'), 30)
				
				
				WebUI.verifyTextPresent('Adjust Customer:', false)
				
				WebUI.verifyTextPresent('Payment Application:', false)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'select_customer'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'select_app'),30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_GO'), 30)
				
				WebUI.closeBrowser()
				
				
				
				WebUI.openBrowser(testHarnessURL)
				WebUI.maximizeWindow()
				
				WebUI.delay(GlobalVariable.longTimeDelay)
				
				// Populate Test Harness
				CustomKeywords.'iwpPages.TestHarnessPage.setDataMethodEF'(row,dataFile)
				
			
			//Click on Cancel Payment Button
			WebUI.click(findTestObject('Object Repository/Page_ManagePaymentPlan_Autopay/btn_modify'))
			WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/btn_savechanges'))
			
			if (WebUI.verifyTextPresent("Edits to your payment plan were completed successfully", false)) {
				WebUI.click(findTestObject('Object Repository/Page_ManagePaymentPlan_Autopay/btn_cancel'))
				WebUI.click(findTestObject('Object Repository/IWP30/Page_CancelPlan/btn_cancel'))
				WebUI.delay(GlobalVariable.shortTimeDelay)
				
				if (WebUI.verifyTextPresent("Your payment plan has been cancelled successfully", false)) {
					KeywordUtil.markPassed("Your payment plan has been successfully created and canceled")
					resText = "Pass"
					println row
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				}
				else {
					KeywordUtil.markFailed("Your payment plan is not created and cancelled")
					resText = "Fail"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				}
			
			}
			
			WebUI.closeBrowser()
			
				
				
		}		
		}