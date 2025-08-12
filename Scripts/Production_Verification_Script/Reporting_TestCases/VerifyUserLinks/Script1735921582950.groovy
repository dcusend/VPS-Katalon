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

String path_User = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_User Reports/"

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))
Thread.sleep(4000)
WebUI.click(findTestObject(path_Dashboard + 'a_User Reports'))

WebUI.verifyElementVisible(findTestObject(path_User + 'h1_User Reports'))
WebUI.verifyElementPresent(findTestObject(path_User + 'h1_User Reports'), 30)

WebUI.verifyElementVisible(findTestObject(path_User + 'a_User Summary Report'))
WebUI.verifyElementPresent(findTestObject(path_User + 'a_User Summary Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_User + 'a_User Transaction Detail Report'))
WebUI.verifyElementPresent(findTestObject(path_User + 'a_User Transaction Detail Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_User + 'a_User Transaction Summary By Application Report'))
WebUI.verifyElementPresent(findTestObject(path_User + 'a_User Transaction Summary By Application Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_User + 'a_User Transaction Summary By Tender Type Report'))
WebUI.verifyElementPresent(findTestObject(path_User + 'a_User Transaction Summary By Tender Type Report'), 30)


WebUI.closeBrowser()



