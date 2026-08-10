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

WebUI.click(findTestObject(path_Reporting + 'Page_AllReports/' + 'a_Enterprise Transaction Summary Report'))

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.verifyTextPresent('Enterprise Transaction Summary Report', false)

WebUI.verifyTextPresent('Customer', false)

//Step 1
WebUI.verifyTextPresent('Customer List', false)

WebUI.verifyTextPresent('Available', false)

WebUI.verifyTextPresent('Selected', false)

WebUI.verifyOptionsPresent(findTestObject(path_Operation_Reports + 'customer_list_available'),['imtiaz'])

WebUI.selectOptionByValue(findTestObject(path_Operation_Reports + 'customer_list_available'), '108', false)

WebUI.click(findTestObject(path_Operation_Reports + 'btnRight'))

WebUI.verifyOptionsPresent(findTestObject(path_Operation_Reports + 'customer_list_selected'),['imtiaz'])

WebUI.verifyElementVisible(findTestObject(path_Operation_Reports + 'btnAllLeft'))

WebUI.verifyElementVisible(findTestObject(path_Operation_Reports + 'btnAllRight'))

WebUI.verifyElementVisible(findTestObject(path_Operation_Reports + 'btnRight'))

WebUI.verifyElementVisible(findTestObject(path_Operation_Reports + 'btnLeft'))


//Step 2
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


WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'startDate'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'endDate'), 30)

WebUI.verifyTextPresent('The Date Range are displayed in EDT', false)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_report'), 30)

WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_reset'), 30)

WebUI.closeBrowser()
