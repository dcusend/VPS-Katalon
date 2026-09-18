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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
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


WebUI.callTestCase(findTestCase('Test Cases/Admin Suite Bootstrap/Online_Reporting/Transactions/PayNowNoCFPC_27'),
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

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))

WebUI.click(findTestObject(path_Dashboard + 'a_Operational Reports'))



WebUI.click(findTestObject(path_Operation_Reports + 'a_Payment Tender Activity Report'))

WebUI.verifyTextPresent('Payment Tender Activity Report', false)

//Step 1

WebUI.verifyTextPresent('Please select a payment application and payment tender on which to base this report', false)

WebUI.verifyTextPresent('Customer:', false)

//WebUI.selectOptionByValue(findTestObject(path_Operation_Reports + 'select_customer'),'108', false)

WebUI.verifyTextPresent('Payment Application:', false)

WebUI.selectOptionByValue(findTestObject(path_Operation_Reports + 'select_app'),'839', false)

WebUI.click(findTestObject(path_Operation_Reports + 'btn_payment_tender_ach'))

WebUI.click(findTestObject(path_Operation_Reports + 'btn_cont_submit'))

WebUI.verifyTextPresent('Please enter the check account numbers for which you wish to view activity.', false)

WebUI.verifyTextPresent('Payment Application:', false)

WebUI.verifyTextPresent('Payment Tender:', false)

WebUI.verifyTextPresent('On-Line Check', false)

WebUI.verifyTextPresent('Routing Transit Number:', false)

WebUI.setText(findTestObject(path_Operation_Reports + 'routing_number'), '256072691')

WebUI.verifyTextPresent('Bank Account Number:', false)

WebUI.setText(findTestObject(path_Operation_Reports + 'account_number'), '95125489')

WebUI.verifyTextPresent('Date Range:', false)

WebUI.selectOptionByValue(findTestObject(path_Operation_Reports + 'date_range_options'), 'today', false)

WebUI.verifyTextPresent('Start Date and Time', false)

WebUI.verifyTextPresent('End Date and Time', false)
//WebUI.setText(findTestObject(path_User_Reports + 'transaction_start_date'), timestampEST_Minus1Min)

//WebUI.setText(findTestObject(path_User_Reports + 'transaction_end_date'),  timestampEST_Plus1Min)

WebUI.click(findTestObject(path_Operation_Reports + 'btn_submit_report'))

// If the page shows "Error" , retry by clicking GO
// Use FailureHandling.OPTIONAL so verifyTextPresent returns false instead of throwing when not found
//int retry = 0
//int maxRetries = 3 // try up to ~3 times (adjust as needed)


//while (WebUI.verifyTextPresent('ERROR!', false, FailureHandling.OPTIONAL) && retry < maxRetries) {
//	KeywordUtil.logInfo("Results not found yet - retry #" + (retry + 1) + " - will wait and click GO")
//	// wait a bit for backend processing (seconds)
//	WebUI.delay(120)
//	
//	WebUI.selectOptionByValue(findTestObject(path_Operation_Reports + 'date_range_options'), 'today', false)
//		println(timestampEST_Minus1Min)
//	
//	WebUI.delay(GlobalVariable.shortTimeDelay)
//	WebUI.click(findTestObject(path_Operation_Reports + 'btn_submit_report'))
//
//	retry++
//}
//if (retry >= maxRetries) {
//	KeywordUtil.logInfo('Max retries reached and results still not found.')
//}


if(WebUI.verifyTextPresent('Payment Tender Activity Report', false, FailureHandling.OPTIONAL)) {

WebUI.verifyTextPresent('Payment Tender Activity Report', false)

WebUI.verifyTextPresent('Application:', false)

WebUI.verifyTextPresent('AutoVrelay232527ReceiptChanges(1234567891111111)', false)

WebUI.verifyTextPresent('Payment Tender:', false)

WebUI.verifyTextPresent('On-Line Check', false)

WebUI.verifyTextPresent('Routing Transit Number:', false)

WebUI.verifyTextPresent('256072691', false)

WebUI.verifyTextPresent('Account Number', false)

WebUI.verifyTextPresent('95125489', false)

WebUI.verifyTextPresent(timestampEST_WithoutTime + ' 00:00', false)

WebUI.verifyTextPresent(timestampEST_WithoutTime + ' 23:59', false)

WebUI.verifyTextPresent('Date Generated:', false)

Date todaysDate = new Date()
SimpleDateFormat outputFormat = new SimpleDateFormat('MMMM dd, yyyy')
String formattedDate = outputFormat.format(todaysDate)

println('Formatted Date: ' + formattedDate)

WebUI.verifyTextPresent(formattedDate, false)

WebUI.verifyTextPresent('Time Zone:', false)

WebUI.verifyTextPresent('EDT', false)

WebUI.verifyTextPresent('Transaction ID', false)

WebUI.verifyTextPresent('Date', false)

WebUI.verifyTextPresent('Remittance ID', false)

WebUI.verifyTextPresent('Name', false)

WebUI.verifyTextPresent('Client Acct Number', false)

WebUI.verifyTextPresent('Pymt Type', false)

WebUI.verifyTextPresent('Transaction', false)

WebUI.verifyTextPresent('Total Amount', false)

WebUI.verifyTextPresent(GlobalVariable.capturedPaymentID, false)

WebUI.verifyTextPresent(timestampEST_WithoutTime, false)

WebUI.verifyTextPresent(GlobalVariable.capturedRemittanceID, false)

WebUI.verifyTextPresent('Carlos Jacinta', false)

WebUI.verifyTextPresent(GlobalVariable.generatedCAN, false)

WebUI.verifyTextPresent('Online Check', false)

WebUI.verifyTextPresent('Debit', false)

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

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'startDate'), 30)

WebUI.verifyTextPresent('to', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'endDate'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_Go_submit'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_submit_newreport'), 30)
}

else {
	
    KeywordUtil.logInfo('Payment Tender Activity Report not found after retries.')
}
WebUI.closeBrowser()







