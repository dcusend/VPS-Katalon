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


searchString = "Diana Abernethy"
//searchString = GlobalVariable.RegisterSearchString

WebUI.openBrowser(multibillRegisterURL)

WebUI.maximizeWindow()

WebUI.delay(2)

// Open multibill URL and populate search criteria
CustomKeywords.'multiBillPages.searchPage.setDataSearchString'(searchString)

WebUI.delay(2)

//select add to cart icon
CustomKeywords.'multiBillPages.searchPage.selectAddtoCart'()
WebUI.delay(2)

//click on ViewCart icon
CustomKeywords.'multiBillPages.searchPage.selectViewCart'()
WebUI.delay(2)

//select check out on cart content page
CustomKeywords.'multiBillPages.cartContentPage.selectCheckout'()
WebUI.delay(2)

// Verify Online Profile Static Text and Elements

	if (WebUI.verifyTextPresent('Create an Online Profile', false, FailureHandling.STOP_ON_FAILURE))
	{
		KeywordUtil.logInfo("On Payment Portal Page, Continue Verification")
		println "On Payment Portal Page, Continue Verification"
		
// Select Create Profile link
		WebUI.click(findTestObject('Object Repository/MultiBill/PaymentPortalPage/link_CreateProfile'), FailureHandling.STOP_ON_FAILURE)
		
// Verify static text on User Registration page			
			if (WebUI.verifyTextPresent('User Registration', false, FailureHandling.STOP_ON_FAILURE))
				{
					KeywordUtil.logInfo("On User Registration Page, Continue Verification")
					println "On User Registration Page, Continue Verification"
					
					
					WebUI.verifyTextPresent('Create an account to access additional features', false, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Username*', false, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Email Address*', false, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Cellphone Number', false, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Password*', false, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Confirm Password*', false, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('First Name', false, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Last Name', false, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('* Required fields', false, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Already have an account?', false, FailureHandling.CONTINUE_ON_FAILURE)
					
					WebUI.delay(2)
					WebUI.verifyTextPresent('Password Requirements:', false, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('At least 8 characters long', false, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('At least 1 lowercase letter', false, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('At least 1 uppercase letter', false, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('At least 1 number', false, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Cannot contain your username', false, FailureHandling.CONTINUE_ON_FAILURE)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/UserRegistrationPage/btn_Register'), 10, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/UserRegistrationPage/link_Login'), 10, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/UserRegistrationPage/PasswordPolicy'), 10, FailureHandling.CONTINUE_ON_FAILURE)
					
					
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/UserRegistrationPage/Username'), 10, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/UserRegistrationPage/Email'), 10, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/UserRegistrationPage/CellPhone'), 10, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/UserRegistrationPage/Password'), 10, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/UserRegistrationPage/ConfirmPassword'), 10, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/UserRegistrationPage/FirstName'), 10, FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/UserRegistrationPage/LastName'), 10, FailureHandling.CONTINUE_ON_FAILURE)
					
					
					
					
					
		
				}
				else
				{
					KeywordUtil.markFailed("Not on User Registration Page, check for a possible defect")
					println "Not on User Registration Page, check for a possible defect"
				}
		
	}
	else
	{
		KeywordUtil.markFailed("Not on Payment Portal Page, check for a possible defect")
	}