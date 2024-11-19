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

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()



WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'span_Dashboard'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'span_Dashboard'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'span_User Management'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'span_User Management'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'span_Payment'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'span_Payment'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'span_Reporting'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'span_Reporting'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'span_IVR Call Metrics'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'span_IVR Call Metrics'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'span_Call Center'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'span_Call Center'), 30)


WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'h5_User Management'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'h5_User Management'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'h5_Payment Management'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'h5_Payment Management'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'h5_Call Center'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'h5_Call Center'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'h5_Online Reporting'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'h5_Online Reporting'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'h5_IVR Call Metrics'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'h5_IVR Call Metrics'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'a_Access User Management'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_Access User Management'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'a_Access Email Subscription'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_Access Email Subscription'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'a_Access FirstView'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_Access FirstView'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'a_Access View All Reports'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_Access View All Reports'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'a_Access CPS DualCF'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_Access CPS DualCF'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'a_Access Test App TSYS CPS'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_Access Test App TSYS CPS'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'a_Access Customer Service Representative'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_Access Customer Service Representative'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'a_Access IVR Call Metrics'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_Access IVR Call Metrics'), 30)

WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'span_Test Customer'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'span_Test Customer'), 30)


WebUI.verifyElementVisible(findTestObject(path_Dashboard + 'p_footer'))
WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'p_footer'), 30)

WebUI.closeBrowser()

