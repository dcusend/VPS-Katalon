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

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import java.time.ZonedDateTime
import java.time.ZoneId

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.text.SimpleDateFormat
import java.util.Calendar
import java.net.URLEncoder



String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"

String path_AllReports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_AllReports/"

String path_Transaction_Report = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_AllReports/Transaction_Activity_Report/"

String path_Operation_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_Operational Reports/"


WebUI.callTestCase(findTestCase('Test Cases/Admin Suite Bootstrap/Online_Reporting/Transactions/PayNowNoCFPS_27'),
	[:],
	FailureHandling.STOP_ON_FAILURE)


// Record current time stamp and convert to EST
ZoneId estZone = ZoneId.of("America/New_York")
ZonedDateTime currentTimeEST = ZonedDateTime.now(estZone)
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm")
DateTimeFormatter formatterWithoutTime = DateTimeFormatter.ofPattern("MM/dd/yyyy")
String timestampEST = currentTimeEST.format(formatter)
String timestampEST_WithoutTime = currentTimeEST.format(formatterWithoutTime)
println("Current timestamp in EST: " + timestampEST)

// Subtract 1 minute from the timestamp
ZonedDateTime timestampEST_minus1 = currentTimeEST.minusMinutes(1)
String timestampEST_Minus1Min = timestampEST_minus1.format(formatter)
println("Timestamp minus 1 minute in EST: " + timestampEST_Minus1Min)

// Add 1 minute from the timestamp
ZonedDateTime timestampEST_plus1 = currentTimeEST.plusMinutes(1)
String timestampEST_Plus1Min = timestampEST_plus1.format(formatter)
println("Timestamp minus 1 minute in EST: " + timestampEST_Plus1Min)

String encodedDateParam = URLEncoder.encode(timestampEST_WithoutTime, 'UTF-8')
String startDateParam = URLEncoder.encode(timestampEST_Minus1Min, 'UTF-8').replace('+', '%20')
String endDateParam = URLEncoder.encode(timestampEST_Plus1Min, 'UTF-8').replace('+', '%20')
String tidParam = GlobalVariable.capturedPaymentID ?: '12240724'

println('Encoded date parameter: ' + encodedDateParam)
println('Encoded start date: ' + startDateParam)
println('Encoded end date: ' + endDateParam)


CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Dashboard + 'a_All Reports'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.verifyElementVisible(findTestObject(path_AllReports + 'a_Transaction Activity Report'))
WebUI.click(findTestObject(path_AllReports + 'a_Transaction Activity Report'))

WebUI.verifyTextPresent('Transaction Activity Report', false)

WebUI.verifyTextPresent('Please select one or more Customer.', false)

WebUI.selectOptionByValue(findTestObject(path_Transaction_Report + 'select_customer'), '108', false)

WebUI.verifyTextPresent('Please select one or more payment applications on which to base this report.', false)

WebUI.selectOptionByValue(findTestObject(path_Transaction_Report + 'selected_app_ids'), '839', false)

WebUI.verifyTextPresent('Please select a date range for this report.', false)

WebUI.verifyTextPresent('The Date Range is displayed in MST', false)

WebUI.selectOptionByValue(findTestObject(path_Transaction_Report + 'date_range_options'), 'today', false)

WebUI.setText(findTestObject(path_Transaction_Report + 'transaction_start_date'), timestampEST_Minus1Min)

WebUI.setText(findTestObject(path_Transaction_Report + 'transaction_end_date'), timestampEST_Plus1Min)

WebUI.verifyTextPresent('Please select payment types, transaction action, and payment channels for this report.', false)

WebUI.verifyTextPresent('Credit / Debit Card',  false)

WebUI.uncheck(findTestObject(path_Transaction_Report + 'check_cc_credit'))

WebUI.uncheck(findTestObject(path_Transaction_Report + 'check_cc_payment'))

//WebUI.uncheck(findTestObject(path_Transaction_Report + 'check_oc_payment'))
//
//WebUI.uncheck(findTestObject(path_Transaction_Report + 'check_oc_credit'))

WebUI.click(findTestObject(path_Transaction_Report + 'btn_Continue'))

WebUI.verifyTextPresent('Transaction Activity Report', false)

WebUI.verifyTextPresent('Application:', false)

WebUI.verifyTextPresent('AutoVrelay232527ReceiptChanges(1234567891111111 )', false)

WebUI.verifyTextPresent('Date Range:', false)

WebUI.verifyTextPresent(timestampEST_Minus1Min , false)

WebUI.verifyTextPresent(timestampEST_Plus1Min , false)

WebUI.verifyTextPresent('Date Generated:', false)

Date todaysDate = new Date()
SimpleDateFormat outputFormat = new SimpleDateFormat('MMMM dd, yyyy')
String formattedDate = outputFormat.format(todaysDate)

println('Formatted Date: ' + formattedDate)

WebUI.verifyTextPresent(formattedDate, false)

WebUI.verifyTextPresent('Time Zone:', false)

WebUI.verifyTextPresent('EDT', false)

WebUI.verifyTextPresent('Tender Type', false)

WebUI.verifyTextPresent('#Trans', false)

WebUI.verifyTextPresent('Total Sales', false)

WebUI.verifyTextPresent('Total Credits', false)

WebUI.verifyTextPresent('Net Totals', false)

WebUI.verifyTextPresent('On-Line Check', false)


WebUI.verifyTextPresent('Summary', false)

WebUI.verifyTextPresent('Transaction ID', false)

WebUI.verifyTextPresent('Success', false)

WebUI.verifyTextPresent('Date', false)

WebUI.verifyTextPresent('Remittance ID', false)

WebUI.verifyTextPresent('Name', false)

WebUI.verifyTextPresent('Client Account Number', false)

WebUI.verifyTextPresent('Pymt Type', false)

WebUI.verifyTextPresent('Transaction', false)

WebUI.verifyTextPresent('Total Amount', false)

WebUI.verifyTextPresent(GlobalVariable.capturedPaymentID, false)

WebUI.verifyTextPresent('Success', false)

WebUI.verifyTextPresent(timestampEST_WithoutTime, false)

WebUI.verifyTextPresent(GlobalVariable.capturedRemittanceID, false)

WebUI.verifyTextPresent('Carlos Jacinta', false)

WebUI.verifyTextPresent('Online Check', false)

WebUI.verifyTextPresent('Debit', false)
//WebUI.verifyTextPresent(GlobalVariable.generatedCAN, false)

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

String transDetailUrl = "https://qa2.velocitypayment.com/admin/imtiaz/bootstrap/vclerk/reports/transdetail.do" +
    "?null&url=dailyact.do?&label=Return+to+Report" +
    "&selectedTimeZone=America%2FNew_York" +
    "&tid=${GlobalVariable.capturedPaymentID}" +
    "&appID=839" +
    "&customerID=108" +
    "&startDateStr=${startDateParam}" +
    "&endDateStr=${endDateParam}" +
    "&failedT=false&successT=true"

String transDetailXPath = "//a[@href=\"${transDetailUrl}\"]"

TestObject planID = new TestObject()
planID.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, transDetailXPath)

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(planID)

WebUI.verifyTextPresent('Transaction Details', false)

WebUI.verifyTextPresent('General Information', false)

WebUI.verifyTextPresent('Transaction ID', false)

WebUI.verifyTextPresent(GlobalVariable.capturedPaymentID, false)

WebUI.verifyTextPresent('Tender Type', false)

WebUI.verifyTextPresent('Online Check', false)

WebUI.verifyTextPresent('Transaction Type', false)

WebUI.verifyTextPresent('Debit', false)

WebUI.verifyTextPresent('Remittance ID', false)

WebUI.verifyTextPresent(GlobalVariable.capturedRemittanceID, false)

WebUI.verifyTextPresent('Client Account Number', false)

WebUI.verifyTextPresent('Tax Amount', false)

WebUI.verifyTextPresent('$0.00', false)

WebUI.verifyTextPresent('Total Amount', false)

WebUI.verifyTextPresent('$10.50', false)

WebUI.verifyTextPresent('Transaction Date', false)

WebUI.verifyTextPresent(formattedDate, false)

WebUI.verifyTextPresent('Parent Transaction', false)

WebUI.verifyTextPresent('Status', false)

WebUI.verifyTextPresent('Success', false)

WebUI.verifyTextPresent('Fail Message', false)

WebUI.verifyTextPresent('Received Via', false)

WebUI.verifyTextPresent('Integrated Web Payments', false)

WebUI.verifyTextPresent('Transaction Posted by', false)

WebUI.verifyTextPresent('Email', false)

WebUI.verifyTextPresent('iahmed1@govolution.com', false)

WebUI.verifyTextPresent('Check Account Information', false)

WebUI.verifyTextPresent('Company', false)

WebUI.verifyTextPresent("Checkwriter's Name", false)

WebUI.verifyTextPresent('Carlos Jacinta', false)

WebUI.verifyTextPresent('Address Line 1', false)

WebUI.verifyTextPresent('698 manadan terrace', false)

WebUI.verifyTextPresent('Address Line 2', false)

WebUI.verifyTextPresent('Suite 600', false)

WebUI.verifyTextPresent('City', false)

WebUI.verifyTextPresent('HOOKSETT', false)

WebUI.verifyTextPresent('State', false)

WebUI.verifyTextPresent('NH', false)

WebUI.verifyTextPresent('ZIP Code', false)

WebUI.verifyTextPresent('03106', false)

WebUI.verifyTextPresent('Country', false)

WebUI.verifyTextPresent('United States', false)

WebUI.verifyTextPresent('Account Type', false)

WebUI.verifyTextPresent('Savings', false)

WebUI.verifyTextPresent('Check Type', false)

WebUI.verifyTextPresent('Personal', false)

WebUI.verifyTextPresent('Partial Account Number', false)

WebUI.verifyTextPresent('5489', false)

WebUI.verifyTextPresent('Routing Transit Number', false)

WebUI.verifyTextPresent('*****2691', false)

WebUI.verifyTextPresent('Custom Information', false)

WebUI.verifyTextPresent('Payment Application', false)

WebUI.verifyTextPresent('AutoVrelay232527ReceiptChanges', false)

WebUI.verifyTextPresent('UDF1', false)

WebUI.verifyTextPresent('udf data 1', false)

WebUI.verifyTextPresent('UDF2', false)

WebUI.verifyTextPresent('udf data 2', false)

WebUI.verifyTextPresent('UDF3', false)

WebUI.verifyTextPresent('udf data 3', false)

WebUI.verifyTextPresent('UDF4', false)

WebUI.verifyTextPresent('udf data 4', false)

WebUI.verifyTextPresent('UDF5', false)

WebUI.verifyTextPresent('udf data 5', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'credit_btn'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'parcels_btn'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'print_btn'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'report_btn'), 30)













