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

// This Test Case works only in QA2 environment

// Log into VPOC
	CustomKeywords.'vpoc.loginPage_VPOC.login_VPOC'()
	WebUI.delay(GlobalVariable.shortTimeDelay)

// Navigate to URL with Customer ID 177    WebUI.navigateToUrl('https://qa2.velocitypayment.com/vpoc/customer/products/index.do?id=177')
	
		
// Select the "New VTPS Customer Deployment" button	
	WebUI.click(findTestObject('VPOC/Product_Deployment_Page/input_New_VTPS_Customer_Deployment'))
	WebUI.delay(GlobalVariable.shortTimeDelay)
	
// Verify Static Text
	WebUI.verifyTextPresent('DNIS:', true)
	WebUI.verifyTextPresent('Customer ID:', true)
	WebUI.verifyTextPresent('177', true)
	WebUI.verifyTextPresent('IVR Type:', true)
	WebUI.verifyTextPresent('Velocity', true)
	WebUI.verifyTextPresent('CertPay', true)
	WebUI.verifyTextPresent('Number of Applications Mapped:', true)
	WebUI.verifyTextPresent('No IVR application deployed yet.', true)
	WebUI.verifyTextPresent('Default Application ID:', true)
	WebUI.verifyTextPresent('Operator Enable:', true)
	WebUI.verifyTextPresent('True', true)
	WebUI.verifyTextPresent('False', true)
	WebUI.verifyTextPresent('Languages:', true)
	WebUI.verifyTextPresent('DNIS', true)
	WebUI.verifyTextPresent('English \\(en_US\\)', true)
	WebUI.verifyTextPresent('Spanish \\(esp_US\\)', true)
	WebUI.verifyTextPresent('Russian \\(ru_US\\)', true)
	WebUI.verifyTextPresent('Language 4', true)
	WebUI.verifyTextPresent('Language 5', true)
	WebUI.verifyTextPresent('Number of Languages:', true)
	WebUI.verifyTextPresent('0', true)
	
	
// Verify Elements
	WebUI.verifyElementPresent(findTestObject('VPOC/VTPS_Customer_Product/input_DNIS'), 10)
	WebUI.verifyElementPresent(findTestObject('VPOC/VTPS_Customer_Product/radio_ivrType_Velocity'), 10)
	WebUI.verifyElementPresent(findTestObject('VPOC/VTPS_Customer_Product/radio_ivrType_CertPay'), 10)
	WebUI.verifyElementPresent(findTestObject('VPOC/VTPS_Customer_Product/radio_operatorEnable_true'), 10)
	WebUI.verifyElementPresent(findTestObject('VPOC/VTPS_Customer_Product/radio_operatorEnable_false'), 10)
	WebUI.verifyElementPresent(findTestObject('VPOC/VTPS_Customer_Product/checkbox_language1_en_US'), 10)
	WebUI.verifyElementPresent(findTestObject('VPOC/VTPS_Customer_Product/checkbox_language2_esp_US'), 10)
	WebUI.verifyElementPresent(findTestObject('VPOC/VTPS_Customer_Product/checkbox_language3_ru_US'), 10)
	WebUI.verifyElementPresent(findTestObject('VPOC/VTPS_Customer_Product/checkbox_language4'), 10)
	WebUI.verifyElementPresent(findTestObject('VPOC/VTPS_Customer_Product/checkbox_language5'), 10)
	WebUI.verifyElementPresent(findTestObject('VPOC/VTPS_Customer_Product/button_Continue'), 10)
	WebUI.verifyElementPresent(findTestObject('VPOC/VTPS_Customer_Product/button_Clear_Form'), 10)
	
	
// Verify the value of DNIS text box is blank    WebUI.verifyElementAttributeValue(findTestObject('VPOC/VTPS_Customer_Product/input_DNIS'), 'value', '', 10)
	
// Verify that ivrtype velocity check is checked by default    WebUI.verifyElementChecked(findTestObject('VPOC/VTPS_Customer_Product/radio_ivrType_Velocity'), 10)
	
// Verify that ivrtype certpay checkbox is not checked by default    WebUI.verifyElementNotChecked(findTestObject('VPOC/VTPS_Customer_Product/radio_ivrType_CertPay'), 10)
	
// Verify that operator enabled true is not checked by default    WebUI.verifyElementNotChecked(findTestObject('VPOC/VTPS_Customer_Product/radio_operatorEnable_true'), 10)
	
// Verify that operator enabled false is checked by default
	WebUI.verifyElementChecked(findTestObject('VPOC/VTPS_Customer_Product/radio_operatorEnable_false'), 10)
		
		
// Verify that all language checkboxes are not checked by default    WebUI.verifyElementNotChecked(findTestObject('VPOC/VTPS_Customer_Product/checkbox_language1_en_US'), 10)    WebUI.verifyElementNotChecked(findTestObject('VPOC/VTPS_Customer_Product/checkbox_language2_esp_US'), 10)    WebUI.verifyElementNotChecked(findTestObject('VPOC/VTPS_Customer_Product/checkbox_language3_ru_US'), 10)    WebUI.verifyElementNotChecked(findTestObject('VPOC/VTPS_Customer_Product/checkbox_language4'), 10)    WebUI.verifyElementNotChecked(findTestObject('VPOC/VTPS_Customer_Product/checkbox_language5'), 10)
	
	