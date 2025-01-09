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

WebUI.openBrowser('')


WebUI.navigateToUrl(GlobalVariable.AdminSuiteURL)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Page_ProductionVerification/input_Username_user'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Page_ProductionVerification/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/input_Forgot password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/a_Access User Management'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/i_Test Customer_fa fa-user fa-lg'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/a_here'))

WebUI.setText(findTestObject('Object Repository/Page_ProductionVerification/input_Username_user'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Page_ProductionVerification/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/input_Forgot password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/a_Access BBP Parking Fees GovTest'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/i_Test Customer_fa fa-user fa-lg'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/span_Logout'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/a_here'))

WebUI.setText(findTestObject('Object Repository/Page_ProductionVerification/input_Username_user'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Page_ProductionVerification/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/input_Forgot password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/a_Access View All Reports'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/i_Test Customer_fa fa-user fa-lg (1)'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/span_Logout (1)'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/a_here'))

WebUI.setText(findTestObject('Object Repository/Page_ProductionVerification/input_Username_user'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Page_ProductionVerification/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/input_Forgot password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/a_Access Customer Service Representative'))

WebUI.setText(findTestObject('Object Repository/Page_ProductionVerification/input_Username_user (1)'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Page_ProductionVerification/input_Password_password (1)'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/input_Password_button2'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/a_Access VTPS-V-TPS test'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/i_Test Customer_fa fa-user fa-lg (2)'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/span_Logout (2)'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/a_here'))

WebUI.setText(findTestObject('Object Repository/Page_ProductionVerification/input_Username_user'), GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Page_ProductionVerification/input_Password_password'), GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/input_Forgot password_btn btn-primary btn-lg'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/a_Welcome to Notifications -'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/i_Test Customer_fa fa-user fa-lg'))

WebUI.click(findTestObject('Object Repository/Page_ProductionVerification/span_Logout'))

WebUI.closeBrowser()

