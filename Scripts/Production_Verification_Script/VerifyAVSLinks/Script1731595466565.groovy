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

String path_AVS = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/AVS/"

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()

WebUI.click(findTestObject(path_Dashboard + 'span_User Management'))

WebUI.click(findTestObject(path_Dashboard + 'a_AVS Policy'))

WebUI.verifyElementVisible(findTestObject(path_AVS + 'h1_AVS Policy Management'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'h1_AVS Policy Management'), 30)

WebUI.verifyElementVisible(findTestObject(path_AVS + 'p_text'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'p_text'), 30)

WebUI.verifyElementVisible(findTestObject(path_AVS + 'btn_Web Services Gateway'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'btn_Web Services Gateway'), 30)
WebUI.click(findTestObject(path_AVS + 'btn_Web Services Gateway'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_BBP Parking Fees GovTest'), 30)
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_CPS DualCF'), 30)


WebUI.verifyElementVisible(findTestObject(path_AVS + 'btn_Scheduled Payments'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'btn_Scheduled Payments'), 30)
WebUI.click(findTestObject(path_AVS + 'btn_Scheduled Payments'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_BBP Parking Fees GovTest'), 30)
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_CPS DualCF'), 30)

WebUI.verifyElementVisible(findTestObject(path_AVS + 'btn_CSR'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'btn_CSR'), 30)
WebUI.click(findTestObject(path_AVS + 'btn_CSR'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementVisible(findTestObject(path_AVS + 'btn_Integrated Billing'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'btn_Integrated Billing'), 30)
WebUI.click(findTestObject(path_AVS + 'btn_Integrated Billing'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementVisible(findTestObject(path_AVS + 'btn_Virtual Terminal'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'btn_Virtual Terminal'), 30)
WebUI.click(findTestObject(path_AVS + 'btn_Virtual Terminal'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementVisible(findTestObject(path_AVS + 'btn_IVR'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'btn_IVR'), 30)
WebUI.click(findTestObject(path_AVS + 'btn_IVR'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementVisible(findTestObject(path_AVS + 'btn_SERVICES'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'btn_SERVICES'), 30)
WebUI.click(findTestObject(path_AVS + 'btn_SERVICES'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementVisible(findTestObject(path_AVS + 'btn_Basic Web Payments'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'btn_Basic Web Payments'), 30)
WebUI.click(findTestObject(path_AVS + 'btn_Basic Web Payments'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementVisible(findTestObject(path_AVS + 'btn_PRESTO'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'btn_PRESTO'), 30)
WebUI.click(findTestObject(path_AVS + 'btn_PRESTO'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementVisible(findTestObject(path_AVS + 'btn_Multiple Bill Payment'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'btn_Multiple Bill Payment'), 30)
WebUI.click(findTestObject(path_AVS + 'btn_Multiple Bill Payment'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementVisible(findTestObject(path_AVS + 'btn_Gateway'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'btn_Gateway'), 30)
WebUI.click(findTestObject(path_AVS + 'btn_Gateway'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementVisible(findTestObject(path_AVS + 'btn_Basic Bill Presentment'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'btn_Basic Bill Presentment'), 30)
WebUI.click(findTestObject(path_AVS + 'btn_Basic Bill Presentment'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementVisible(findTestObject(path_AVS + 'btn_Integrated Web Payments'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'btn_Integrated Web Payments'), 30)
WebUI.click(findTestObject(path_AVS + 'btn_Integrated Web Payments'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementVisible(findTestObject(path_AVS + 'btn_Advanced Bill Presentment'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'btn_Advanced Bill Presentment'), 30)
WebUI.click(findTestObject(path_AVS + 'btn_Advanced Bill Presentment'))
WebUI.verifyElementPresent(findTestObject(path_AVS + 'a_BBP Parking Fees GovTest'), 30)

WebUI.closeBrowser()











