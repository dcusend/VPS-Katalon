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

String path_Audit_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_Audit Reports/"

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Dashboard + 'a_Risk ManagementAudit Reports'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Audit_Reports + 'a_Role History Report'))

WebUI.verifyTextPresent('Role History Report', false)

WebUI.verifyTextPresent('The report will only contain information on actions that have taken place on or after October 26, 2011', false)

//Step 1
WebUI.verifyTextPresent('Step 1:Please choose the start and end date', false)

WebUI.verifyTextPresent('Date Range:', false)

WebUI.verifyTextPresent('Start Date and Time:', false)

WebUI.verifyTextPresent('End Date and Time:', false)

CustomKeywords.'customClasses.predefinedDateRange.verifyPredefinedDateRangeOptions'()


CustomKeywords.'customClasses.predefinedDateRange.selectDateRange'('today')

CustomKeywords.'customClasses.predefinedDateRange.selectDateRange'('yesterday')

CustomKeywords.'customClasses.predefinedDateRange.selectDateRange'('thisWeek')

CustomKeywords.'customClasses.predefinedDateRange.selectDateRange'('lastWeek')

CustomKeywords.'customClasses.predefinedDateRange.selectDateRange'('thisMonth')

CustomKeywords.'customClasses.predefinedDateRange.selectDateRange'('lastMonth')

CustomKeywords.'customClasses.predefinedDateRange.selectDateRange'('thisYear')


WebUI.verifyElementPresent(findTestObject(path_Audit_Reports + 'startDate'), 30)

WebUI.verifyElementPresent(findTestObject(path_Audit_Reports + 'endDate'), 30)


WebUI.verifyTextPresent('Step 2 :Please select one role on which to base this report', false)

WebUI.verifyTextPresent('Role:', false)

WebUI.verifyOptionsPresent(findTestObject(path_Audit_Reports + 'select_role'),['Administrator'])

WebUI.verifyElementPresent(findTestObject(path_Audit_Reports + 'btn_report_continue'), 30)

WebUI.closeBrowser()
