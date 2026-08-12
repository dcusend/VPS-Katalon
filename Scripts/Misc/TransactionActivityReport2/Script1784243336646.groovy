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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
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

WebUI.selectOptionByValue(findTestObject(path_Transaction_Report + 'customer_list_available'), '108', false)

TestObject customerBtnRightObject = new TestObject('customerBtnRightObject')
customerBtnRightObject.addProperty('id', ConditionType.EQUALS, 'btnRight')

WebUI.click(customerBtnRightObject)

WebUI.delay(GlobalVariable.shortTimeDelay)
WebUI.selectOptionByValue(findTestObject(path_Transaction_Report + 'available_app_ids'), '744', false)

WebUI.delay(GlobalVariable.shortTimeDelay)

TestObject appBtnRightObject = new TestObject('appBtnRightObject')
appBtnRightObject.addProperty('xpath', ConditionType.EQUALS,
		"//input[@type='button' and @value='>' and contains(@onclick,'availableApplicationIds') and contains(@onclick,'applicationIds')]")

WebUI.click(appBtnRightObject)

WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.selectOptionByLabel(findTestObject(path_Transaction_Report + 'date_range_options'),'Today',false)
WebUI.delay(GlobalVariable.shortTimeDelay)

WebUI.click(findTestObject(path_Transaction_Report + 'btn_Continue'))
WebUI.delay(GlobalVariable.shortTimeDelay)


TestObject amountCellObject = new TestObject('amountCellObject')
amountCellObject.addProperty('xpath', ConditionType.EQUALS,"//td[contains(@style,'text-align: right') and contains(@style,'vertical-align: text-top') and normalize-space()='\$21.50']")

WebUI.verifyElementPresent(amountCellObject, GlobalVariable.shortTimeDelay)
WebUI.verifyElementText(amountCellObject, '$21.50')




