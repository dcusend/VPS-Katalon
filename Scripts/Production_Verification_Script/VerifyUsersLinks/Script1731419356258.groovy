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

String path_UM = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/"

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()

WebUI.click(findTestObject(path_Dashboard + 'span_User Management'))

WebUI.click(findTestObject(path_Dashboard + 'a_Users'))

WebUI.verifyElementVisible(findTestObject(path_UM + 'h1_Users'))
WebUI.verifyElementPresent(findTestObject(path_UM + 'h1_Users'), 30)

WebUI.verifyTextPresent('Total Users', false)

WebUI.verifyElementVisible(findTestObject(path_UM + 'div_Export'))
WebUI.verifyElementPresent(findTestObject(path_UM + 'div_Export'), 30)

WebUI.verifyElementVisible(findTestObject(path_UM + 'a_Add User'))
WebUI.verifyElementPresent(findTestObject(path_UM + 'a_Add User'), 30)

WebUI.verifyElementVisible(findTestObject(path_UM + 'a_Find User'))
WebUI.verifyElementPresent(findTestObject(path_UM + 'a_Find User'), 30)

WebUI.verifyElementVisible(findTestObject(path_UM + 'a_aindurkar'))
WebUI.verifyElementPresent(findTestObject(path_UM + 'a_aindurkar'), 30)

WebUI.verifyTextPresent('Ashwity Indurkar', false)

WebUI.verifyElementVisible(findTestObject(path_UM + 'a_1'))
WebUI.verifyElementPresent(findTestObject(path_UM + 'a_1'), 30)

WebUI.verifyElementVisible(findTestObject(path_UM + 'a_2'))
WebUI.verifyElementPresent(findTestObject(path_UM + 'a_2'), 30)

WebUI.verifyElementVisible(findTestObject(path_UM + 'li_First'))
WebUI.verifyElementPresent(findTestObject(path_UM + 'li_First'), 30)

WebUI.verifyElementVisible(findTestObject(path_UM + 'li_Prev'))
WebUI.verifyElementPresent(findTestObject(path_UM + 'li_Prev'), 30)

WebUI.verifyElementVisible(findTestObject(path_UM + 'a_Last'))
WebUI.verifyElementPresent(findTestObject(path_UM + 'a_Last'), 30)

WebUI.verifyElementVisible(findTestObject(path_UM + 'a_Next'))
WebUI.verifyElementPresent(findTestObject(path_UM + 'a_Next'), 30)

WebUI.verifyElementVisible(findTestObject(path_UM + 'th_User Name'))
WebUI.verifyElementPresent(findTestObject(path_UM + 'th_User Name'), 30)

WebUI.verifyElementVisible(findTestObject(path_UM + 'th_User ID'))
WebUI.verifyElementPresent(findTestObject(path_UM + 'th_User ID'), 30)






