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

String path_Operation_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_Operational Reports/"





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

WebUI.selectOptionByValue(findTestObject(path_Transaction_Report + 'selected_app_ids'), '1113', false)

WebUI.verifyElementPresent(findTestObject(path_Transaction_Report + 'paymentchannel_gateway'), 10)











