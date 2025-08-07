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
import com.kms.katalon.core.configuration.RunConfiguration as RC




// Get the Execution Profile like QA or Demo
def executionProfile = RC.getExecutionProfile()

String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"

String path_RM = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/Role/"

String path_CVV = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/CVV/"

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()

WebUI.click(findTestObject(path_Dashboard + 'span_User Management'))
Thread.sleep(4000)
WebUI.click(findTestObject(path_Dashboard + 'a_CVV Policy'))

WebUI.verifyElementVisible(findTestObject(path_CVV + 'h1_CVV Policy Management'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'h1_CVV Policy Management'), 30)

WebUI.verifyElementVisible(findTestObject(path_CVV + 'p_text'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'p_text'), 30)

WebUI.verifyElementVisible(findTestObject(path_CVV + 'btn_Web Services Gateway'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'btn_Web Services Gateway'), 30)
WebUI.click(findTestObject(path_CVV + 'btn_Web Services Gateway'))

if(executionProfile == 'Production' || executionProfile == 'Upgrade') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_BBP Parking Fees GovTest'), 30)
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_CPS DualCF'), 30)
}
else if(executionProfile == 'DemoProfile') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_Change Me'), 30)
}

WebUI.verifyElementVisible(findTestObject(path_CVV + 'btn_Scheduled Payments'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'btn_Scheduled Payments'), 30)
WebUI.click(findTestObject(path_CVV + 'btn_Scheduled Payments'))
if(executionProfile == 'Production' || executionProfile == 'Upgrade') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_BBP Parking Fees GovTest'), 30)
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_CPS DualCF'), 30)
}
else if(executionProfile == 'DemoProfile') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_Change Me'), 30)
}

WebUI.verifyElementVisible(findTestObject(path_CVV + 'btn_CSR'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'btn_CSR'), 30)
WebUI.click(findTestObject(path_CVV + 'btn_CSR'))

if(executionProfile == 'Production' || executionProfile == 'Upgrade') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_BBP Parking Fees GovTest'), 30)
}
else if(executionProfile == 'DemoProfile') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_Change Me'), 30)
}

WebUI.verifyElementVisible(findTestObject(path_CVV + 'btn_Integrated Billing'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'btn_Integrated Billing'), 30)
WebUI.click(findTestObject(path_CVV + 'btn_Integrated Billing'))

if(executionProfile == 'Production' || executionProfile == 'Upgrade') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_BBP Parking Fees GovTest'), 30)
}
else if(executionProfile == 'DemoProfile') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_Change Me'), 30)
}
WebUI.verifyElementVisible(findTestObject(path_CVV + 'btn_Virtual Terminal'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'btn_Virtual Terminal'), 30)
WebUI.click(findTestObject(path_CVV + 'btn_Virtual Terminal'))
if(executionProfile == 'Production' || executionProfile == 'Upgrade') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_BBP Parking Fees GovTest'), 30)
}
else if(executionProfile == 'DemoProfile') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_Change Me'), 30)
}

WebUI.verifyElementVisible(findTestObject(path_CVV + 'btn_IVR'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'btn_IVR'), 30)
WebUI.click(findTestObject(path_CVV + 'btn_IVR'))
if(executionProfile == 'Production' || executionProfile == 'Upgrade') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_BBP Parking Fees GovTest'), 30)
}
else if(executionProfile == 'DemoProfile') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_Change Me'), 30)
}

WebUI.verifyElementVisible(findTestObject(path_CVV + 'btn_SERVICES'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'btn_SERVICES'), 30)
WebUI.click(findTestObject(path_CVV + 'btn_SERVICES'))
//WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementVisible(findTestObject(path_CVV + 'btn_Basic Web Payments'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'btn_Basic Web Payments'), 30)
WebUI.click(findTestObject(path_CVV + 'btn_Basic Web Payments'))
//WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_BBP Parking Fees GovTest'), 30)

WebUI.verifyElementVisible(findTestObject(path_CVV + 'btn_PRESTO'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'btn_PRESTO'), 30)
WebUI.click(findTestObject(path_CVV + 'btn_PRESTO'))

if(executionProfile == 'Production' || executionProfile == 'Upgrade') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_BBP Parking Fees GovTest'), 30)
}
else if(executionProfile == 'DemoProfile') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_Change Me'), 30)
}


WebUI.verifyElementVisible(findTestObject(path_CVV + 'btn_Multiple Bill Payment'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'btn_Multiple Bill Payment'), 30)
WebUI.click(findTestObject(path_CVV + 'btn_Multiple Bill Payment'))

if(executionProfile == 'Production' || executionProfile == 'Upgrade') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_BBP Parking Fees GovTest'), 30)
}
else if(executionProfile == 'DemoProfile') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_Change Me'), 30)
}

WebUI.verifyElementVisible(findTestObject(path_CVV + 'btn_Gateway'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'btn_Gateway'), 30)
WebUI.click(findTestObject(path_CVV + 'btn_Gateway'))
if(executionProfile == 'Production' || executionProfile == 'Upgrade') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_BBP Parking Fees GovTest'), 30)
}
else if(executionProfile == 'DemoProfile') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_Change Me'), 30)
}

WebUI.verifyElementVisible(findTestObject(path_CVV + 'btn_Basic Bill Presentment'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'btn_Basic Bill Presentment'), 30)
WebUI.click(findTestObject(path_CVV + 'btn_Basic Bill Presentment'))
if(executionProfile == 'Production' || executionProfile == 'Upgrade') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_BBP Parking Fees GovTest'), 30)
}
else if(executionProfile == 'DemoProfile') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_Change Me'), 30)
}


WebUI.verifyElementVisible(findTestObject(path_CVV + 'btn_Integrated Web Payments'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'btn_Integrated Web Payments'), 30)
WebUI.click(findTestObject(path_CVV + 'btn_Integrated Web Payments'))
if(executionProfile == 'Production' || executionProfile == 'Upgrade') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_BBP Parking Fees GovTest'), 30)
}
else if(executionProfile == 'DemoProfile') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_Change Me'), 30)
}

WebUI.verifyElementVisible(findTestObject(path_CVV + 'btn_Advanced Bill Presentment'))
WebUI.verifyElementPresent(findTestObject(path_CVV + 'btn_Advanced Bill Presentment'), 30)
WebUI.click(findTestObject(path_CVV + 'btn_Advanced Bill Presentment'))
if(executionProfile == 'Production' || executionProfile == 'Upgrade') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_BBP Parking Fees GovTest'), 30)
}
else if(executionProfile == 'DemoProfile') {
	WebUI.verifyElementPresent(findTestObject(path_CVV + 'a_Change Me'), 30)
}

WebUI.closeBrowser()