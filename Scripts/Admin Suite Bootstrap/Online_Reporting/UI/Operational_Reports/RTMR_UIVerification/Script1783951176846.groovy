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

String path_Reporting = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/"

String path_Operation_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_Operational Reports/"

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))

WebUI.click(findTestObject(path_Dashboard + 'a_Operational Reports'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Operation_Reports + 'a_Real Time Monitor Report'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.verifyTextPresent('Real-Time Monitor', false)

WebUI.verifyTextPresent('Application', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'rtm_app_id'), 30)

WebUI.verifyOptionsPresent(findTestObject(path_Operation_Reports + 'rtm_app_id'),['AASHU(1234567891111111)'])

Date todaysDate = new Date()

println("Today's date is: " + todaysDate.format("MM/dd/yyyy"))
WebUI.verifyTextPresent('All date/times are in Eastern Standard Time Time Zone.', false)

WebUI.verifyTextPresent('Monitor Last Updated at ' + todaysDate.format("MM/dd/yyyy"), false)

WebUI.verifyTextPresent('Transaction ID', false)

WebUI.verifyTextPresent('Transaction Date', false)

WebUI.verifyTextPresent('Status', false)

WebUI.verifyTextPresent('Transaction Type', false)

WebUI.verifyTextPresent('Application Name', false)

WebUI.verifyTextPresent('Payer Name', false)

WebUI.verifyTextPresent('Client Account Number', false)

WebUI.verifyTextPresent('Payment Amount', false)

WebUI.verifyTextPresent('Action', false)

//WebUI.closeBrowser()



