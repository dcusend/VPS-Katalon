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

String path_Operational = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_Operational Reports/"

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()

WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))
WebUI.click(findTestObject(path_Dashboard + 'a_Operational Reports'))

WebUI.verifyElementVisible(findTestObject(path_Operational + 'h1_Operational Reports'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'h1_Operational Reports'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Active Payment Plan Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Active Payment Plan Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Auto Pay Enrollments Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Auto Pay Enrollments Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Bill Statistics Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Bill Statistics Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Customer Profiles Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Customer Profiles Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Download Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Download Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Enterprise Transaction Summary Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Enterprise Transaction Summary Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Enterprise Transaction Summary Report by Payment Channel'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Enterprise Transaction Summary Report by Payment Channel'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Exceptions Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Exceptions Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_File Upload Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_File Upload Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Online Check Returns Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Online Check Returns Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Parcels Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Parcels Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Payment Account Activity Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Payment Account Activity Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Payment Tender Activity Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Payment Tender Activity Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Posting File Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Posting File Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_QuickBooks Integration'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_QuickBooks Integration'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Real Time Monitor Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Real Time Monitor Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Scheduled Payments Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Scheduled Payments Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Settlement Batch Activity Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Settlement Batch Activity Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Tender Type Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Tender Type Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Transaction Activity Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Transaction Activity Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Operational + 'a_Transaction Summary Report'))
WebUI.verifyElementPresent(findTestObject(path_Operational + 'a_Transaction Summary Report'), 30)

WebUI.closeBrowser()

