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

import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import java.time.ZonedDateTime
import java.time.ZoneId

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.text.SimpleDateFormat
import java.util.Calendar

String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"

String path_Reporting = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/"

String path_Operation_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_Operational Reports/"

String path_User_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_User Reports/"


WebUI.callTestCase(findTestCase('Test Cases/Admin Suite Bootstrap/Online_Reporting/Transactions/CreateAutopayCC_2.5'),
	[:],
	FailureHandling.STOP_ON_FAILURE)


CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))

WebUI.click(findTestObject(path_Dashboard + 'a_Operational Reports'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Operation_Reports + 'a_Scheduled Payments Report'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.verifyTextPresent('Scheduled Payments Report', false)

//Step 1

WebUI.verifyTextPresent('Please select a payment application on which to base this report', false)

WebUI.verifyTextPresent('Customer:', false)

WebUI.selectOptionByLabel(findTestObject(path_Operation_Reports + 'select_customer'),'imtiaz', false)

WebUI.verifyTextPresent('Payment Application:', false)

WebUI.selectOptionByLabel(findTestObject(path_Operation_Reports + 'select_app'),'AutoDualCFtpQA(1234567891111111)', false)

WebUI.click(findTestObject(path_Operation_Reports + 'btn_report'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.verifyTextPresent('Scheduled Payments Report', false)	

WebUI.verifyTextPresent('Application:', false)

WebUI.verifyTextPresent('AutoDualCFtpQA(1234567891111111)', false)

WebUI.verifyTextPresent('Date Generated:', false)

// Record current time stamp and convert to EST
//ZoneId estZone = ZoneId.of("America/New_York")
//ZonedDateTime currentTimeEST = ZonedDateTime.now(estZone)
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
String todaysDate = LocalDate.now().format(formatter)
String futureDate = LocalDate.now().plusDays(7).format(formatter)

WebUI.verifyTextPresent(todaysDate + ' 00:00', false)

WebUI.verifyTextPresent(futureDate + ' 23:59', false)

WebUI.verifyTextPresent('Date Range:', false)

Date currentDate = new Date()
SimpleDateFormat outputFormat = new SimpleDateFormat('MMMM dd, yyyy')
String formattedDate = outputFormat.format(currentDate)

WebUI.verifyTextPresent(formattedDate, false)

WebUI.verifyTextPresent('Time Zone:', false)

WebUI.verifyTextPresent('EDT', false)

WebUI.verifyTextPresent('Process Date', false)

WebUI.verifyTextPresent('# of ACH Trxns', false)

WebUI.verifyTextPresent('ACH Amount', false)

WebUI.verifyTextPresent('# of CC/Debit Trxns', false)

WebUI.verifyTextPresent('CC/Debit Amount', false)

WebUI.verifyTextPresent('Total Trxns', false)

WebUI.verifyTextPresent('Total Amount', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_First_Pagination'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Last_Pagination'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Next_Pagination'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Previous_Pagination'), 30)

WebUI.verifyTextPresent('Export Options:', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_CSV'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_EXCEL'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_PDF'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_XML'), 30)

WebUI.verifyTextPresent('Adjust Dates:', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'startDate'), 30)

WebUI.verifyTextPresent('to', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'endDate'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_Go_submit'), 30)



TestObject date = new TestObject()
date.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, "//a[@href=\"spmdetail.do?&processDate=" + futureDate + "\"]")

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(date)

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.verifyTextPresent('Scheduled Payments Report', false)

WebUI.verifyTextPresent('Application', false)

WebUI.verifyTextPresent('AutoDualCFtpQA(1234567891111111)', false)

WebUI.verifyTextPresent('Date Range:', false)

WebUI.verifyTextPresent(futureDate + ' 00:00', false)

WebUI.verifyTextPresent(futureDate + ' 23:59', false)

WebUI.verifyTextPresent('Date Generated:', false)

WebUI.verifyTextPresent('Time Zone', false)

WebUI.verifyTextPresent('EDT', false)

WebUI.verifyTextPresent('Plan ID', false)

WebUI.verifyTextPresent(GlobalVariable.capturedPaymentID, false)

WebUI.verifyTextPresent('Process Date', false)

WebUI.verifyTextPresent(futureDate, false)

WebUI.verifyTextPresent('Application', false)

WebUI.verifyTextPresent('AutoDualCFtpQA', false)

WebUI.verifyTextPresent('Remittance ID', false)

WebUI.verifyTextPresent(GlobalVariable.capturedRemittanceID, false)

WebUI.verifyTextPresent('Name', false)

WebUI.verifyTextPresent('Bridges Waters', false)

WebUI.verifyTextPresent('Client Account Number', false)

WebUI.verifyTextPresent('Tender Type', false)

WebUI.verifyTextPresent('American Express', false)

WebUI.verifyTextPresent('Plan Type', false)

WebUI.verifyTextPresent('Installment Plan', false)

WebUI.verifyTextPresent('Amount', false)

WebUI.verifyTextPresent('$10.50', false)


WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_First_Pagination'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Last_Pagination'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Next_Pagination'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Previous_Pagination'), 30)


WebUI.verifyTextPresent('Export Options:', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_CSV'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_EXCEL'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_PDF'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_XML'), 30)

WebUI.verifyTextPresent('Adjust Dates:', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'adjust_date'), 30)


WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_summaryreport'), 30)


WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_Go_submit'), 30)
WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_submit_newreport'), 30)




