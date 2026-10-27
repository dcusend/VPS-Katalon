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

WebUI.click(findTestObject(path_Operation_Reports + 'a_Scheduled Payments Report'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.verifyTextPresent('Scheduled Payments Report', false)

//Step 1 

WebUI.verifyTextPresent('Please select a payment application on which to base this report', false)

WebUI.verifyTextPresent('Customer:', false)

WebUI.verifyOptionsPresent(findTestObject(path_Operation_Reports + 'select_customer'),['imtiaz'])

WebUI.verifyTextPresent('Payment Application:', false)

WebUI.verifyOptionsPresent(findTestObject(path_Operation_Reports + 'select_app'),['AASHU(1234567891111111)'])


WebUI.verifyTextPresent('Start Date and Time:', false)

WebUI.verifyTextPresent('End Date and Time:', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'startDate'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'endDate'), 30)

WebUI.verifyTextPresent('The Preset Time and Date Range are displayed in EDT.', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_report'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_reset'), 30)


