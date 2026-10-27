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

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.text.SimpleDateFormat


String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"

String path_Reporting = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/"

String path_Operation_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_Operational Reports/"

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))

WebUI.click(findTestObject(path_Dashboard + 'a_Operational Reports'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Operation_Reports + 'a_Bill Statistics Report'))

WebUI.verifyTextPresent('Bill Statistics Report', false)

WebUI.selectOptionByValue(findTestObject(path_Operation_Reports + 'date_range_options'), 'lastMonth', false)

WebUI.click(findTestObject(path_Operation_Reports + 'btn_report'))

WebUI.verifyTextPresent('Bill Statistics Report', false)

WebUI.verifyTextPresent('Date Range:', false)

Date todaysDate = new Date()
println(todaysDate)

// Calculate previous month's first and last dates
Calendar calendar = Calendar.getInstance()
calendar.setTime(todaysDate)
calendar.add(Calendar.MONTH, -1)  // Go back one month

// Get first day of previous month
calendar.set(Calendar.DAY_OF_MONTH, 1)
Date previousMonthFirstDate = calendar.getTime()
SimpleDateFormat dateOnlyFormat = new SimpleDateFormat('MM/dd/yyyy')
String previousMonthFirst = dateOnlyFormat.format(previousMonthFirstDate)
println('Previous Month First Date: ' + previousMonthFirst)

// Get last day of previous month
calendar.add(Calendar.MONTH, 1)  // Go forward to current month
calendar.add(Calendar.DAY_OF_MONTH, -1)  // Go back one day to last day of previous month
Date previousMonthLastDate = calendar.getTime()
String previousMonthLast = dateOnlyFormat.format(previousMonthLastDate)
println('Previous Month Last Date: ' + previousMonthLast)


WebUI.verifyTextPresent(previousMonthFirst + ' 00:00 — ' + previousMonthLast + ' 23:59.', false)

WebUI.verifyTextPresent('Date Generated:', false)

SimpleDateFormat outputFormat = new SimpleDateFormat('MMMM dd, yyyy')
String formattedDate = outputFormat.format(todaysDate)

println('Formatted Date: ' + formattedDate)

WebUI.verifyTextPresent(formattedDate, false)

WebUI.verifyTextPresent('EDT', false)


WebUI.verifyTextPresent('items found, displaying all items.', false)

WebUI.verifyTextPresent('Created During This Time', false)

WebUI.verifyTextPresent('Opted In/Out During This Time', false)

WebUI.verifyTextPresent('#Profiles Created', false)

WebUI.verifyTextPresent('#Profiles Opted Out', false)

WebUI.verifyTextPresent('#Profiles Opted In', false)

WebUI.verifyTextPresent('# Bills for Profiles', false)

WebUI.verifyTextPresent('# Bills Opted Out', false)

WebUI.verifyTextPresent('# Bills Opted In', false)

WebUI.verifyTextPresent('24', false)

WebUI.verifyTextPresent('0', false)

WebUI.verifyTextPresent('24', false)

WebUI.verifyTextPresent('0', false)

WebUI.verifyTextPresent('0', false)

WebUI.verifyTextPresent('0', false)

WebUI.verifyTextPresent('Created Date', false)

WebUI.verifyTextPresent('Profile Name', false)

WebUI.verifyTextPresent('Address Line 1', false)

WebUI.verifyTextPresent('Opted In/Out', false)

WebUI.verifyTextPresent('Last Opted Date', false)

WebUI.verifyTextPresent('# Bills', false)



WebUI.verifyTextPresent('Export Options:', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_CSV'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_EXCEL'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_PDF'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_XML'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_First_Pagination'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Last_Pagination'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Next_Pagination'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Previous_Pagination'), 30)

WebUI.verifyTextPresent('All times are displayed in EDT.', false)

WebUI.verifyTextPresent('Adjust Dates:', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'startDate'), 30)

WebUI.verifyTextPresent('to', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'endDate'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_GO'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_newreport'), 30)

WebUI.closeBrowser()

