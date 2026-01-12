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


searchString = "Donette Foller"



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
		
		
		
// Select Login Now link
		WebUI.click(findTestObject('Object Repository/MultiBill/PaymentPortalPage/link_LoginNow'), FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
		
// Login to the Portal
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/LoginPage/Username'), 10, FailureHandling.STOP_ON_FAILURE))
		{
			WebUI.setText(findTestObject('Object Repository/MultiBill/LoginPage/Username'), "dfoller")
			WebUI.setText(findTestObject('Object Repository/MultiBill/LoginPage/Password'), "Welcome46@")
			WebUI.click(findTestObject('Object Repository/MultiBill/LoginPage/btn_SignIn'), FailureHandling.STOP_ON_FAILURE)
			WebUI.delay(5)
			
// Verify that Select Payment Method Page displays after Login
			WebUI.verifyTextPresent('Select Payment Method', false, FailureHandling.STOP_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_SelectPaymentMethod_Bootstrap/input_Pay by Credit or Debit Card'), 10, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_SelectPaymentMethod_Bootstrap/input_Pay by Personal Check'), 10, FailureHandling.CONTINUE_ON_FAILURE)
			WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_SelectPaymentMethod_Bootstrap/input_Pay by Corporate Check'), 10, FailureHandling.CONTINUE_ON_FAILURE)
			
			
		}
		
	}