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



String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"



String path_Reporting = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/"

String path_Operation_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_Operational Reports/"

String path_User_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_User Reports/"


WebUI.callTestCase(findTestCase('Test Cases/Admin Suite Bootstrap/Online_Reporting/Transactions/PayNowNoCFCC_27'),
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

//WebUI.callTestCase(findTestCase('Test Cases/Admin Suite Bootstrap/Online_Reporting/Transactions/PayNowNoCFCC_27'),
//	[:],
//	FailureHandling.STOP_ON_FAILURE)


CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))

WebUI.click(findTestObject(path_Dashboard + 'a_Operational Reports'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Operation_Reports + 'a_Parcels Report'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.verifyTextPresent('Parcels Report', false)


//Step 1
WebUI.verifyTextPresent('Step 1 :Please select one or more Customer.', false)

WebUI.verifyOptionsPresent(findTestObject(path_Operation_Reports + 'customer_list_available'),['imtiaz'])

WebUI.selectOptionByValue(findTestObject(path_Operation_Reports + 'customer_list_available'), '108', false)

WebUI.click(findTestObject(path_Operation_Reports + 'btnRight'))

WebUI.verifyOptionsPresent(findTestObject(path_Operation_Reports + 'customer_list_selected'),['imtiaz'])

//Step 2
WebUI.verifyTextPresent('Step 2 :Please select one or more payment applications on which to base this report.', false)

WebUI.verifyOptionsPresent(findTestObject(path_Operation_Reports + 'available_app_ids'),['AutoVrelay232527ReceiptChanges(1234567891111111)'])

WebUI.selectOptionByValue(findTestObject(path_Operation_Reports + 'available_app_ids'), '839', false)

WebUI.click(findTestObject(path_Operation_Reports + 'app_btn_right'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.verifyOptionsPresent(findTestObject(path_Operation_Reports + 'select_appid'),['AutoVrelay232527ReceiptChanges(1234567891111111)'])

//Step 3
WebUI.verifyTextPresent('Step 3:Please choose the start and end date. The selected date range cannot exceed 31 days in duration.', false)

CustomKeywords.'customClasses.predefinedDateRange.selectDateRange'('today')

String startDate = WebUI.getAttribute(findTestObject(path_User_Reports + 'transaction_start_date'), 'value')

Date todaysDate = new Date()
	
WebUI.setText(findTestObject(path_User_Reports + 'transaction_start_date'), timestampEST_Minus1Min)

WebUI.setText(findTestObject(path_User_Reports + 'transaction_end_date'),  timestampEST_Plus1Min)

WebUI.click(findTestObject(path_Operation_Reports + 'btn_Continue'))

WebUI.delay(GlobalVariable.shortTimeDelay)

// Verify Text on Parcels Report Page

WebUI.verifyTextPresent('Parcels Report', false)

WebUI.verifyTextPresent('Application:', false)

WebUI.verifyTextPresent('AutoVrelay232527ReceiptChanges(1234567891111111 )', false)

WebUI.verifyTextPresent('Date Range:', false)

WebUI.verifyTextPresent(timestampEST_Minus1Min, false)

WebUI.verifyTextPresent(timestampEST_Plus1Min , false)

WebUI.verifyTextPresent('Date Generated:', false)

SimpleDateFormat outputFormat = new SimpleDateFormat('MMMM dd, yyyy')
String formattedDate = outputFormat.format(todaysDate)

println('Formatted Date: ' + formattedDate)

WebUI.verifyTextPresent(formattedDate, false)

WebUI.verifyTextPresent('Time Zone:', false)
WebUI.verifyTextPresent('EDT', false)

WebUI.verifyTextPresent('Tender Type', false)

WebUI.verifyTextPresent('#Tran', false)

WebUI.verifyTextPresent('Total Sales', false)

WebUI.verifyTextPresent('Total Credits', false)

WebUI.verifyTextPresent('Net Totals', false)

WebUI.verifyTextPresent('Visa Debit', false)

WebUI.verifyTextPresent('Discover', false)

WebUI.verifyTextPresent('MasterCard Debit', false)

WebUI.verifyTextPresent('American Express', false)

WebUI.verifyTextPresent('1', false)

WebUI.verifyTextPresent('$10.50', false)

WebUI.verifyTextPresent('$0.00', false)

WebUI.verifyTextPresent('$10.50', false)

WebUI.verifyTextPresent('MasterCard', false)

WebUI.verifyTextPresent('Visa', false)

WebUI.verifyTextPresent('On-Line Check', false)

WebUI.verifyTextPresent('Totals', false)

WebUI.verifyTextPresent('1', false)

WebUI.verifyTextPresent('$10.50', false)

WebUI.verifyTextPresent('$0.00', false)

WebUI.verifyTextPresent('$10.50', false)

WebUI.verifyTextPresent('Summary', false)

WebUI.verifyTextPresent('Payment ID', false)

WebUI.verifyTextPresent('Status', false)

WebUI.verifyTextPresent('Date', false)

WebUI.verifyTextPresent('Remittance ID', false)

WebUI.verifyTextPresent('Client Account Number', false)

WebUI.verifyTextPresent('Tender', false)

WebUI.verifyTextPresent('# Parcels', false)

WebUI.verifyTextPresent('Total Amount', false)

WebUI.verifyTextPresent(GlobalVariable.capturedPaymentID, false)

WebUI.verifyTextPresent('Status', false)

WebUI.verifyTextPresent(timestampEST_WithoutTime, false)

WebUI.verifyTextPresent('Bridges Waters', false)

WebUI.verifyTextPresent('AX', false)

WebUI.verifyTextPresent('1', false)

WebUI.verifyTextPresent('$10.50', false)


String parcelId = GlobalVariable.capturedPaymentID 

String expandXPath = "//img[@src='_admin/images/plus.gif' and contains(@onclick, \"expandParcel('${parcelId}')\")]"
println("Expand icon XPath: " + expandXPath)

TestObject expandParcelImg = new TestObject('expandParcelImg')
expandParcelImg.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, expandXPath)

WebUI.waitForElementVisible(expandParcelImg, 10)
WebUI.click(expandParcelImg)

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.verifyTextPresent('Item No', false)

WebUI.verifyTextPresent('Description', false)

WebUI.verifyTextPresent('Amount', false)

WebUI.verifyTextPresent('1234', false)

WebUI.verifyTextPresent('Whole Wheat', false)

WebUI.verifyTextPresent('$5', false)



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

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_GO'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_newreport'), 30)

WebUI.closeBrowser()



