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


String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"

String path_AllReports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_AllReports/"

String path_Transaction_Report = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_AllReports/Transaction_Activity_Report/"

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Dashboard + 'a_All Reports'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.verifyElementVisible(findTestObject(path_AllReports + 'a_Transaction Activity Report'))
WebUI.click(findTestObject(path_AllReports + 'a_Transaction Activity Report'))

WebUI.verifyTextPresent('Transaction Activity Report', false)


//Step 1
WebUI.verifyTextPresent('Step 1 :Please select one or more Customer.', false)

WebUI.verifyTextPresent('Customer List', false)

WebUI.verifyTextPresent('Available :', false)

WebUI.verifyTextPresent('Selected :', false)

//def totalOptionsCustomerList = WebUI.getNumberOfTotalOption(findTestObject(path_Transaction_Report + 'customer_list_available'))
//WebUI.verifyEqual(totalOptionsCustomerList, 4)

WebUI.verifyOptionsPresent(findTestObject(path_Transaction_Report + 'customer_list_available'),['imtiaz'])

WebUI.selectOptionByValue(findTestObject(path_Transaction_Report + 'customer_list_available'), '108', false)

WebUI.click(findTestObject(path_Transaction_Report + 'btnRight'))


//def totalOptionsCustomerListSelected = WebUI.getNumberOfTotalOption(findTestObject(path_Transaction_Report + 'customer_list_selected'))
//WebUI.verifyEqual(totalOptionsCustomerListSelected, 1)

WebUI.verifyOptionsPresent(findTestObject(path_Transaction_Report + 'customer_list_selected'),['imtiaz'])

WebUI.verifyElementVisible(findTestObject(path_Transaction_Report + 'btnAllLeft'))

WebUI.verifyElementVisible(findTestObject(path_Transaction_Report + 'btnAllRight'))

WebUI.verifyElementVisible(findTestObject(path_Transaction_Report + 'btnRight'))

WebUI.verifyElementVisible(findTestObject(path_Transaction_Report + 'btnLeft'))

//Step 2
WebUI.verifyTextPresent('Step 2 :Please select one or more payment applications on which to base this report.', false)

WebUI.verifyTextPresent('Payment Application List', false)

WebUI.verifyTextPresent('Available :', false)

WebUI.verifyTextPresent('Selected :', false)

WebUI.delay(GlobalVariable.shortTimeDelay)
//def totalAvailableAppList = WebUI.getNumberOfTotalOption(findTestObject(path_Transaction_Report + 'available_app_ids'))
//WebUI.verifyEqual(totalAvailableAppList, 0)

WebUI.verifyOptionsPresent(findTestObject(path_Transaction_Report + 'available_app_ids'),['AutoDualCFtpQA(1234567891111111)', 'AutoEncryptedUDF(1234567891111111)', 'AutoNoCFtp(1234567891111111)', 'AutoSingleCFtpQA(1234567891111111)'])

WebUI.selectOptionByValue(findTestObject(path_Transaction_Report + 'available_app_ids'), '744', false)

WebUI.click(findTestObject(path_Transaction_Report + 'app_btn_right'))

//def totalSelectedAppList = WebUI.getNumberOfTotalOption(findTestObject(path_Transaction_Report + 'selected_app_ids'))
//WebUI.verifyEqual(totalSelectedAppList, 0)

WebUI.verifyOptionsPresent(findTestObject(path_Transaction_Report + 'selected_app_ids'),['AutoDualCFtpQA(1234567891111111)'])

WebUI.verifyElementVisible(findTestObject(path_Transaction_Report + 'app_btn_allleft'))

WebUI.verifyElementVisible(findTestObject(path_Transaction_Report + 'app_btn_allright'))

WebUI.verifyElementVisible(findTestObject(path_Transaction_Report + 'app_btn_right'))

WebUI.verifyElementVisible(findTestObject(path_Transaction_Report + 'app_btn_left'))


//Step 3
WebUI.verifyTextPresent('Step 3 :', false)

WebUI.verifyTextPresent('Payment Tenders', false)

WebUI.verifyElementChecked(findTestObject(path_Transaction_Report + 'check_ccCard'), 10)

WebUI.verifyTextPresent('Credit/Branded Debit Card', false)

WebUI.verifyElementChecked(findTestObject(path_Transaction_Report + 'check_personalCheck'), 10)

WebUI.verifyTextPresent('Personal Checking/Savings', false)

WebUI.verifyElementChecked(findTestObject(path_Transaction_Report + 'check_corpCheck'), 10)

WebUI.verifyTextPresent('Corporate Checking', false)

WebUI.verifyElementChecked(findTestObject(path_Transaction_Report + 'check_paperCheck'), 10)

WebUI.verifyTextPresent('Paper Check', false)

WebUI.verifyTextPresent('Cash', false)


//Step 4
WebUI.verifyTextPresent('Step 4 :', false)

WebUI.verifyTextPresent('Payment Channels', false)

WebUI.verifyTextPresent('Web', false)

WebUI.verifyTextPresent('Point of Sale', false)

WebUI.verifyTextPresent('IVR', false)

WebUI.verifyTextPresent('Gateway', false)


//Step 5
WebUI.verifyTextPresent('Step 5 :', false)

WebUI.verifyTextPresent('Transaction Types', false)

WebUI.verifyElementChecked(findTestObject(path_Transaction_Report + 'check_ccSale'), 10)

WebUI.verifyTextPresent('CC Sale', false)

WebUI.verifyElementChecked(findTestObject(path_Transaction_Report + 'check_ccAuth'), 10)

WebUI.verifyTextPresent('CC Authorization', false)

WebUI.verifyElementChecked(findTestObject(path_Transaction_Report + 'check_ccCap'), 10)

WebUI.verifyTextPresent('CC Capture', false)

WebUI.verifyElementChecked(findTestObject(path_Transaction_Report + 'check_ccCredit'), 10)

WebUI.verifyTextPresent('CC Credit', false)

WebUI.verifyElementChecked(findTestObject(path_Transaction_Report + 'check_ccVoid'), 10)

WebUI.verifyTextPresent('CC Void', false)

WebUI.verifyElementChecked(findTestObject(path_Transaction_Report + 'check_achDeb'), 10)

WebUI.verifyTextPresent('ACH Debit', false)

WebUI.verifyElementChecked(findTestObject(path_Transaction_Report + 'check_achCredit'), 10)

WebUI.verifyTextPresent('ACH Credit', false)

WebUI.verifyElementChecked(findTestObject(path_Transaction_Report + 'check_achVoid'), 10)

WebUI.verifyTextPresent('ACH Void', false)


//Step 6
WebUI.verifyTextPresent('Step 6:Please choose the start and end date. The selected date range cannot exceed 31 days in duration.', false)

WebUI.verifyTextPresent('Date Range:', false)

def totalOptionsDateRange = WebUI.getNumberOfTotalOption(findTestObject(path_Transaction_Report + 'date_range_options'))
WebUI.verifyEqual(totalOptionsDateRange, 7)

WebUI.verifyOptionsPresent(findTestObject(path_Transaction_Report + 'date_range_options'),['-- Select a Predefined Range --','Today','Yesterday','This Week','Last Week','This Month','Last Month'])

WebUI.verifyTextPresent('Start Date and Time:', false)
String startDate = WebUI.getAttribute(findTestObject(path_Transaction_Report + 'transaction_start_date'), 'value')

Date yesterdaysDate = new Date() - 1
println(yesterdaysDate)
println(yesterdaysDate.format("MM/dd/yyyy"))

WebUI.verifyMatch(startDate, yesterdaysDate.format("MM/dd/yyyy") + " 00:00", false)

WebUI.verifyTextPresent('End Date and Time:', false)

String endDate = WebUI.getAttribute(findTestObject(path_Transaction_Report + 'transaction_end_date'), 'value')

WebUI.verifyMatch(endDate, yesterdaysDate.format("MM/dd/yyyy") + " 23:59", false)

WebUI.verifyTextPresent('The Date Range are displayed in EDT', false)


//Step 7
WebUI.verifyTextPresent('Step 7 :Please select the type of transactions that should be included within this report', false)

WebUI.verifyElementChecked(findTestObject(path_Transaction_Report + 'check_successful_transaction'), 10)

WebUI.verifyTextPresent('Include only successful transactions', false)

WebUI.verifyElementNotChecked(findTestObject(path_Transaction_Report + 'check_failure_transaction'), 10)

WebUI.verifyTextPresent('Include only failure transactions', false)


WebUI.verifyElementPresent(findTestObject(path_Transaction_Report + 'btn_Continue'), 30)



