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

// Verify Login Page Static Text and Elements

	if (WebUI.verifyTextPresent('Create an Online Profile', false, FailureHandling.STOP_ON_FAILURE))
	{
		KeywordUtil.logInfo("On Payment Portal Page, Continue Verification")
		println "On Payment Portal Page, Continue Verification"
		
		
		
// Select Sign In link
		WebUI.click(findTestObject('Object Repository/MultiBill/PaymentPortalPage/btn_SignIn'), FailureHandling.STOP_ON_FAILURE)
		
// Select Need Help Signing in link
		WebUI.click(findTestObject('Object Repository/MultiBill/LoginPage/NeedHelpSigningIn'), FailureHandling.STOP_ON_FAILURE)
		
// Select Forgot YOur Username
		WebUI.click(findTestObject('Object Repository/MultiBill/LoginPage/ForgotYourUsername'), FailureHandling.STOP_ON_FAILURE)
		
// Verify if we are on Recover Username Page
		if (WebUI.verifyTextPresent('Recover Username', false, FailureHandling.STOP_ON_FAILURE))
		{
			WebUI.verifyTextPresent("Enter your email address and we'll send your username to your registered email", false, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyTextPresent("Email Address", false, FailureHandling.CONTINUE_ON_FAILURE)
			
			WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/ForgotYourUsernamePage/RecoveryEmailAddress'), 10, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/ForgotYourUsernamePage/btn_SendUsername'), 10, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/ForgotYourUsernamePage/BackToLogin'), 10, FailureHandling.CONTINUE_ON_FAILURE)

// Select Back to Login link			
			WebUI.click(findTestObject('Object Repository/MultiBill/ForgotYourUsernamePage/BackToLogin'), FailureHandling.STOP_ON_FAILURE)
			
// Verify Username text box on Login Page
			WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/LoginPage/Username'), 10, FailureHandling.CONTINUE_ON_FAILURE)
			
		}
		
		
	}
	else
		{
			KeywordUtil.markFailed("Not on Payment Portal Page, check for a possible defect")
		}