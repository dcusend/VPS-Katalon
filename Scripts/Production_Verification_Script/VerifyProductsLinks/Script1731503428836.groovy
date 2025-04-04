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

String path_Product = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/Product/"

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.click(findTestObject(path_Dashboard + 'span_User Management'))

WebUI.click(findTestObject(path_Dashboard + 'a_Products'))

WebUI.verifyElementVisible(findTestObject(path_Product + 'h1_Products'))
WebUI.verifyElementPresent(findTestObject(path_Product + 'h1_Products'), 30)

WebUI.verifyElementVisible(findTestObject(path_Product + 'h1_Product List'))
WebUI.verifyElementPresent(findTestObject(path_Product + 'h1_Product List'), 30)

WebUI.verifyElementVisible(findTestObject(path_Product + 'p_text'))
WebUI.verifyElementPresent(findTestObject(path_Product + 'p_text'), 30)

WebUI.verifyElementVisible(findTestObject(path_Product + 'btn_Customer Service Representative'))
WebUI.verifyElementPresent(findTestObject(path_Product + 'btn_Customer Service Representative'), 30)

WebUI.verifyElementVisible(findTestObject(path_Product + 'btn_Scheduled Payments'))
WebUI.verifyElementPresent(findTestObject(path_Product + 'btn_Scheduled Payments'), 30)

WebUI.verifyElementVisible(findTestObject(path_Product + 'btn_CSR_Prod'))
WebUI.verifyElementPresent(findTestObject(path_Product + 'btn_CSR_Prod'), 30)

WebUI.verifyElementVisible(findTestObject(path_Product + 'btn_Integrated Billing'))
WebUI.verifyElementPresent(findTestObject(path_Product + 'btn_Integrated Billing'), 30)

WebUI.verifyElementVisible(findTestObject(path_Product + 'btn_Virtual Terminal'))
WebUI.verifyElementPresent(findTestObject(path_Product + 'btn_Virtual Terminal'), 30)

WebUI.verifyElementVisible(findTestObject(path_Product + 'btn_IVR'))
WebUI.verifyElementPresent(findTestObject(path_Product + 'btn_IVR'), 30)

WebUI.verifyElementVisible(findTestObject(path_Product + 'btn_Integrated Billing Customer'))
WebUI.verifyElementPresent(findTestObject(path_Product + 'btn_Integrated Billing Customer'), 30)

WebUI.verifyElementVisible(findTestObject(path_Product + 'btn_Online Reporting'))
WebUI.verifyElementPresent(findTestObject(path_Product + 'btn_Online Reporting'), 30)

WebUI.verifyElementVisible(findTestObject(path_Product + 'btn_User Management'))
WebUI.verifyElementPresent(findTestObject(path_Product + 'btn_User Management'), 30)

WebUI.click(findTestObject(path_Product + 'btn_Scheduled Payments'))

WebUI.verifyElementPresent(findTestObject(path_Product + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementPresent(findTestObject(path_Product + 'a_CPS DualCF'), 30)


WebUI.click(findTestObject(path_Product + 'btn_CSR_Prod'))

WebUI.verifyElementPresent(findTestObject(path_Product + 'a_BBP Parking Fees GovTest'), 30)


WebUI.click(findTestObject(path_Product + 'btn_Integrated Billing'))

WebUI.verifyElementPresent(findTestObject(path_Product + 'a_BBP Parking Fees GovTest'), 30)

WebUI.click(findTestObject(path_Product + 'btn_Virtual Terminal'))

WebUI.verifyElementPresent(findTestObject(path_Product + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementPresent(findTestObject(path_Product + 'a_CPS DualCF'), 30)

WebUI.click(findTestObject(path_Product + 'btn_IVR'))

WebUI.verifyElementPresent(findTestObject(path_Product + 'a_BBP Parking Fees GovTest'), 30)

WebUI.closeBrowser()



