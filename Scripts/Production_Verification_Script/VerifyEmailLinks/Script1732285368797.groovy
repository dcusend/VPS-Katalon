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

String path_RM = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/Role/"

String path_Email = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/Email/"

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.click(findTestObject(path_Dashboard + 'span_User Management'))

WebUI.click(findTestObject(path_Dashboard + 'a_Email Alerts'))

WebUI.verifyElementVisible(findTestObject(path_Email + 'h1_Email Alerts'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'h1_Email Alerts'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'p_text'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'p_text'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'div_Administrator'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'div_Administrator'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'div_Administrator'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'div_Administrator'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'text_alert'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'text_alert'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'text_ach'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'text_ach'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'text_cvv'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'text_cvv'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'text_file_upload'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'text_file_upload'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'text_files'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'text_files'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'text_role'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'text_role'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'text_role_modify'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'text_role_modify'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'text_user'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'text_user'), 30)

WebUI.closeBrowser()





