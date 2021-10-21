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

	WebUI.maximizeWindow()

	WebUI.navigateToUrl(GlobalVariable.RADurl)
	
	String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
	String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
	String orPath_FilingStatus = "Object Repository/RAD_Pages/FilingStatus_Page"

	WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), "Extension Payments", false)
	
	WebUI.scrollToElement(findTestObject(orPath_Landing + '/button_Continue'), 3)
	
	WebUI.waitForElementClickable(findTestObject(orPath_Landing + '/button_Continue'),5)
	
	WebUI.click(findTestObject(orPath_Landing + '/button_Continue'))
	
	
	
/*
 * ######################################################################
 * 	Verify the Missing Required Fields
 * 	Error Messages
 * ######################################################################
 */
	
	
// Tax Type Filing Year Error Message
	WebUI.verifyTextPresent('Select a filing year', true)
	
	WebUI.verifyTextPresent('Select a payment type', true)
	
	
// Taxpayer Error Message
	WebUI.verifyTextPresent('Enter first name', true)
	
	WebUI.verifyTextPresent('Enter last name', true)
	
	WebUI.verifyTextPresent('Please enter a valid SSN with 9 digits', true)
	
	WebUI.verifyTextPresent('The SSN and Re-type SSN do not match', true)
	
	
//	Address and Contact Information Error Message
	WebUI.verifyTextPresent('Select a country', true)
	
	WebUI.verifyTextPresent('Enter address', true)
	
	WebUI.verifyTextPresent('Enter city', true)
	
	WebUI.verifyTextPresent('Select a state', true)
	
	WebUI.verifyTextPresent('Enter ZIP code', true)
	
	WebUI.verifyTextPresent('Enter a phone number', true)
	
	WebUI.verifyTextPresent('Enter Email', true)
	
	WebUI.verifyTextPresent('The Email and Re-enter email do not match', true)
	
	
//	Payment Amount Error Message
	WebUI.verifyTextPresent('Payment amount must be greater than zero and less than 10,000,000', true)
	
	

// Joint Filing Error Message
	WebUI.scrollToElement(findTestObject(orPath_Amount + '/input__paymentAmount'), 3)
	
	WebUI.waitForElementClickable(findTestObject(orPath_FilingStatus + '/input_userType_Joint'),5)
	
	WebUI.click(findTestObject(orPath_FilingStatus + '/input_userType_Joint'))
	
	WebUI.scrollToElement(findTestObject(orPath_Amount + '/input__paymentAmount'), 3)
	
	WebUI.click(findTestObject(orPath_Landing + '/button_Continue'))
	
	WebUI.verifyTextPresent('Enter joint payer first name', true)
	
	WebUI.verifyTextPresent('Enter joint payer last name', true)
	
	WebUI.verifyTextPresent('Enter joint payer social security number', true)
	
	WebUI.verifyTextPresent('The joint payer SSN and Re-enter SSN do not match', true)
		