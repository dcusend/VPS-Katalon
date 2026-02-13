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


def executionProfile = RC.getExecutionProfile()

def deepAdminSuiteURL, deepUsername, deepPassword


switch(executionProfile)
{
	case "QAProfile":
			 deepAdminSuiteURL = "https://qa.velocitypayment.com/admin/deep"
		
		break

	case "QA2Profile":
			deepAdminSuiteURL = "https://qa2.velocitypayment.com/admin/deep"
	
		break
}



//Retreive  Username and Password from Profile
deepUsername = GlobalVariable.Username
deepPassword = GlobalVariable.Password



// Log into Admin Suite
CustomKeywords.'adminSuiteBootstrap.loginFunctionality.setDataAdminSuiteLogin'(deepUsername,deepPassword,deepAdminSuiteURL)

// Select Issue Email or Text to Pay Link
WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_IssueEmailOrTextToPay'))

WebUI.verifyTextPresent('Pay Notification', true)
WebUI.verifyTextPresent('Issue Email/Text to Pay', true)

// Select Manual Entry button
WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/btn_ManualEntryTab'))

WebUI.delay(3)

WebUI.verifyTextPresent('Pay Notification', true)
WebUI.verifyTextPresent('Issue Email/Text to Pay', true)

// Verify Bill Lookup button
WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/btn_BillFileLookup'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/btn_BillFileLookup'), 30)


WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/dd_PaymentApplication'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/dd_PaymentApplication'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_CAN'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_CAN'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_Amount'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_Amount'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_FirstName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_FirstName'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_LastName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_LastName'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_CompanyName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_CompanyName'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_Address1'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_Address1'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_Address2'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_Address2'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_City'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_City'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_State'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_State'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_ZipCode'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_ZipCode'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_EmailAddress'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_EmailAddress'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_PhoneNumber'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_PhoneNumber'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/btn_SendPaymentLink'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/btn_SendPaymentLink'), 30)

WebUI.verifyTextPresent('At least one contact method (email or phone) must be provided', false)

// Verify left NAV
WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'), 5)
