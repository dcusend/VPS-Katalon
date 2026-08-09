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

import com.kms.katalon.core.util.KeywordUtil as KeywordUtil


def multibillRegisterURL=GlobalVariable.MultiBillRegisterURL


//searchString = "Donette Foller"



WebUI.openBrowser(multibillRegisterURL)

WebUI.maximizeWindow()

WebUI.delay(2)


// Select Manage Profile
	WebUI.click(findTestObject('Object Repository/MultiBill/MultibillSearch/btn_ManageProfile'), FailureHandling.STOP_ON_FAILURE)
	
// Login to the Portal
	if (WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/LoginPage/Username'), 10, FailureHandling.STOP_ON_FAILURE))
	{
		WebUI.setText(findTestObject('Object Repository/MultiBill/LoginPage/Username'), "iahmedups")
		WebUI.setText(findTestObject('Object Repository/MultiBill/LoginPage/Password'), "American2026@")
		WebUI.click(findTestObject('Object Repository/MultiBill/LoginPage/btn_SignIn'), FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
		
// Verify the saved payment method	
		WebUI.verifyTextPresent('Select Payment Method', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Select a Stored Payment Method', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/MultibillSearch/radioButton_Visa4111'), 10, FailureHandling.CONTINUE_ON_FAILURE)
		
// Select Visa Payment Method
		WebUI.click(findTestObject('Object Repository/MultiBill/MultibillSearch/radioButton_Visa4111'), FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
		
// Select Manage Payment Method button
		WebUI.click(findTestObject('Object Repository/MultiBill/MultibillSearch/btn_ManagePaymentMethod'), FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
		
// Verify static text and elements
		WebUI.verifyTextPresent('Manage Payment Method', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Account Holder Name:', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Card Type:', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Card Number:', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Card Expiration:', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Address Line 1:', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Country:', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('ZIP Code:', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('City:', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('State:', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Rozella Ostrosky', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Visa', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent("41**********1111", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent("3/2028", false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('17 Morena Blvd', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('United States', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('93012', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('CAMARILLO', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('California', false, FailureHandling.CONTINUE_ON_FAILURE)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/MultibillSearch/btn_EditPaymentMethod'), 10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/MultibillSearch/btn_DeletePaymentMethod'), 10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/MultibillSearch/btn_Back'), 10, FailureHandling.CONTINUE_ON_FAILURE)
		
		
	}

