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

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.click(findTestObject(path_Dashboard + 'span_User Management'))
Thread.sleep(4000)
WebUI.click(findTestObject(path_Dashboard + 'a_Roles'))

WebUI.verifyElementVisible(findTestObject(path_RM + 'h1_Roles'))
WebUI.verifyElementPresent(findTestObject(path_RM + 'h1_Roles'), 30)

WebUI.verifyTextPresent('Total Roles', false)

WebUI.verifyTextPresent('Roles', false)

WebUI.verifyElementVisible(findTestObject(path_RM + 'div_Export'))
WebUI.verifyElementPresent(findTestObject(path_RM + 'div_Export'), 30)

WebUI.verifyElementVisible(findTestObject(path_RM + 'a_AddRole'))
WebUI.verifyElementPresent(findTestObject(path_RM + 'a_AddRole'), 30)

WebUI.verifyElementVisible(findTestObject(path_RM + 'a_FindRole'))
WebUI.verifyElementPresent(findTestObject(path_RM + 'a_FindRole'), 30)

WebUI.verifyElementVisible(findTestObject(path_RM + 'a_Administrator'))
WebUI.verifyElementPresent(findTestObject(path_RM + 'a_Administrator'), 30)

WebUI.verifyElementVisible(findTestObject(path_RM + 'a_1'))
WebUI.verifyElementPresent(findTestObject(path_RM + 'a_1'), 30)

WebUI.verifyElementVisible(findTestObject(path_RM + 'a_2'))
WebUI.verifyElementPresent(findTestObject(path_RM + 'a_2'), 30)

WebUI.verifyElementVisible(findTestObject(path_RM + 'li_First'))
WebUI.verifyElementPresent(findTestObject(path_RM + 'li_First'), 30)

WebUI.verifyElementVisible(findTestObject(path_RM + 'li_Prev'))
WebUI.verifyElementPresent(findTestObject(path_RM + 'li_Prev'), 30)

WebUI.verifyElementVisible(findTestObject(path_RM + 'a_Last'))
WebUI.verifyElementPresent(findTestObject(path_RM + 'a_Last'), 30)

WebUI.verifyElementVisible(findTestObject(path_RM + 'a_Next'))
WebUI.verifyElementPresent(findTestObject(path_RM + 'a_Next'), 30)

WebUI.closeBrowser()



