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

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'span_User Management'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'span_User Management'), 30)

WebUI.click(findTestObject(path_Dashboard + 'span_User Management'))
Thread.sleep(4000)
WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'a_Users'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_Users'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'a_Roles'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_Roles'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'a_Products'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_Products'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'a_AVS Policy'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_AVS Policy'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'a_CVV Policy'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_CVV Policy'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'a_Email Alerts'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_Email Alerts'), 30)

WebUI.closeBrowser()