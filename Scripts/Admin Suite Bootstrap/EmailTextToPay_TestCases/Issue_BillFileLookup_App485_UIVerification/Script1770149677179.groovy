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

println deepUsername
println deepPassword

// Log into Admin Suite
CustomKeywords.'adminSuiteBootstrap.loginFunctionality.setDataAdminSuiteLogin'(deepUsername,deepPassword,deepAdminSuiteURL)

// Select Issue Email or Text to Pay Link
//WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_IssueEmailOrTextToPay'))


WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNav_IssueEmailOrTextToPay'))
WebUI.delay(2)

//WebUI.verifyTextPresent('Pay Notification', true)
WebUI.verifyTextPresent('Issue Email/Text to Pay', true)
WebUI.verifyTextPresent('Payment Application', true)
WebUI.verifyTextPresent('Client Account Number', true)
WebUI.verifyTextPresent('First Name', true)
WebUI.verifyTextPresent('Last / Company Name', true)

// Select 485 Payment Application from the drop down
WebUI.selectOptionByLabel(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/dd_PaymentApplication'),'DeepWebPay485' ,false)
WebUI.delay(2)

// Verify Manual Entry link/button is present
WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/btn_ManualEntryTab'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/btn_ManualEntryTab'), 30)

// Verify Payment Application dropdown is present
WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/dd_PaymentApplication'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/dd_PaymentApplication'), 30)

// Verify CAN is present
WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_CAN'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_CAN'), 30)

// Verify Name is present
WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_FirstName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_FirstName'), 30)

// Verify Last/Compane Name is present
WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_LastCompanyName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_LastCompanyName'), 30)

// Verify Lookup1 is present
//WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_Lookup1'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_Lookup1'), 30)

// Verify Lookup2 is present
//WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_Lookup2'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_Lookup2'), 30)

// Verify Lookup3 is present
//WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_Lookup3'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_Lookup3'), 30)

WebUI.verifyTextPresent('Lookup485 1', true)
WebUI.verifyTextPresent('Lookup485 2', true)
WebUI.verifyTextPresent('Lookup485 3', true)

// Verify Search button is present
WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/btn_Submit'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/btn_Submit'), 30)

// Verify left NAV
WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'), 5)

