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
import java.util.Calendar

String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"

String path_Reporting = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/"

String path_Operation_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_Operational Reports/"

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))

WebUI.click(findTestObject(path_Dashboard + 'a_Operational Reports'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Operation_Reports + 'a_Online Check Returns Report'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.verifyTextPresent('Online Check Returns Report', false)

WebUI.selectOptionByValue(findTestObject(path_Operation_Reports + 'select_customer'),'108', false)

WebUI.selectOptionByLabel(findTestObject(path_Operation_Reports + 'select_app'), 'AutoDualCFtpQA(1234567891111111)', false)

WebUI.click(findTestObject(path_Operation_Reports + 'btn_Continue'))

WebUI.selectOptionByValue(findTestObject(path_Operation_Reports + 'date_range_options'), 'today', false)

WebUI.click(findTestObject(path_Operation_Reports + 'btn_report'))

WebUI.delay(GlobalVariable.shortTimeDelay)


WebUI.verifyTextPresent('Online Check Returns Report', false)

WebUI.verifyTextPresent('Application', false)

WebUI.verifyTextPresent('AutoDualCFtpQA(1234567891111111)', false)

WebUI.verifyTextPresent('Date Range:', false)

Date todaysDate = new Date()
println(todaysDate)

// Calculate previous month's first and last dates
Calendar calendar = Calendar.getInstance()
calendar.setTime(todaysDate)

SimpleDateFormat dateOnlyFormat = new SimpleDateFormat('MM/dd/yyyy')
String formattedTodaysDate = dateOnlyFormat.format(todaysDate)
				

WebUI.verifyTextPresent(formattedTodaysDate + ' 00:00 — ' + formattedTodaysDate + ' 23:59.', false)

WebUI.verifyTextPresent('Date Generated:', false)

SimpleDateFormat outputFormat = new SimpleDateFormat('MMMM dd, yyyy')
String formattedDate = outputFormat.format(todaysDate)

println('Formatted Date: ' + formattedDate)


WebUI.verifyTextPresent('EDT', false)


WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_First_Pagination'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Last_Pagination'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Next_Pagination'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Previous_Pagination'), 30)


WebUI.verifyTextPresent('Return Date', false)

WebUI.verifyTextPresent('Total Amount', false)

WebUI.verifyTextPresent('Payment ID', false)

WebUI.verifyTextPresent('Remittance ID', false)

WebUI.verifyTextPresent('Return Code', false)

WebUI.verifyTextPresent('Return Reason', false)

WebUI.verifyTextPresent('Account Name', false)

WebUI.verifyTextPresent('Client Account Number', false)

WebUI.verifyTextPresent('Original Payment Date', false)

WebUI.verifyTextPresent('Email Address', false)


WebUI.verifyTextPresent('Adjust Dates:', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'startDate'), 30)

WebUI.verifyTextPresent('to', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'endDate'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_GO'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_newreport'), 30)


