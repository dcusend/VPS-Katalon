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

// Verify Payment Portal Static Text and Elements

	if (WebUI.verifyTextPresent('Create an Online Profile', false, FailureHandling.STOP_ON_FAILURE))
	{
		KeywordUtil.logInfo("On Payment Portal Page, Continue Verification")
		println "On Payment Portal Page, Continue Verification"
		
		WebUI.verifyTextPresent('Set up your account for a personalized experience', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Make a real-time payment', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Create Stored Payment Methods', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Schedule Future-Dated Payments', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Enroll for Automatic Payment', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Login', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Access your existing account', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Login to your Online Profile', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Make a Guest Payment', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Quick payments without an account', false, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyTextPresent('Make a real-time payment', false, FailureHandling.CONTINUE_ON_FAILURE)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/PaymentPortalPage/link_CreateProfile'), 10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/PaymentPortalPage/btn_SignIn'), 10, FailureHandling.CONTINUE_ON_FAILURE)
		WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/PaymentPortalPage/btn_PayAsAGuest'), 10, FailureHandling.CONTINUE_ON_FAILURE)
		
		
	}
	else
	{
		KeywordUtil.markFailed("Not on Payment Portal Page, check for a possible defect")
	}