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


//searchString = "Lenna Paprocki"
searchString = GlobalVariable.RegisterSearchString

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
		
// Select Login link
		WebUI.click(findTestObject('Object Repository/MultiBill/UserRegistrationPage/link_Login'), FailureHandling.STOP_ON_FAILURE)
		
		// Verify static text and elements on Login page
		
		if (WebUI.verifyTextPresent('Return to Portal', false, FailureHandling.STOP_ON_FAILURE))
			{
				KeywordUtil.logInfo("On Login Page, Continue Verification")
				println "On Login Page, Continue Verification"
				
				WebUI.verifyTextPresent('Username', false, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.verifyTextPresent('Password', false, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.verifyTextPresent('Need an account?', false, FailureHandling.CONTINUE_ON_FAILURE)
				
				WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/LoginPage/Username'), 10, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/LoginPage/Password'), 10, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/LoginPage/btn_SignIn'), 10, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/LoginPage/ForgotYourUsername'), 10, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/LoginPage/ForgotYourPassword'), 10, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/LoginPage/RegisterHere'), 10, FailureHandling.CONTINUE_ON_FAILURE)
				WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/LoginPage/ReturnToPortal'), 10, FailureHandling.CONTINUE_ON_FAILURE)
				
				
				
			}
			else
			{
				KeywordUtil.markFailed("Not on Login Page, check for a possible defect")
				println "Not on Login Page, check for a possible defect"
			}
					
		
		
		
	}
	else
		{
			KeywordUtil.markFailed("Not on Payment Portal Page, check for a possible defect")
		}