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
WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'))

WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/Link_leftNav_IssueEmail_TaxtoPay'))


def PaymentAppName = "DeepWebPay485" 

def CAN = ""

def Name = ""

def Look1 =""

def Look2 =""

def Look3 =""

CustomKeywords.'issueEmailTextToPay.BillFileLookupPage.setDataBillFileLookup'(PaymentAppName, CAN, Name, Look1, Look2, Look3)

CustomKeywords.'issueEmailTextToPay.BillFileLookupPage.Search'()

//WebUI.verifyTextPresent('Found 1 Bill File Record(s) Matching the Search Criteria.', false)

WebUI.verifyTextPresent('Search Results', false)
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Radio_button'), 2)
WebUI.verifyElementClickable(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Radio_button'))
WebUI.verifyTextPresent('Select', false)
WebUI.verifyTextPresent('Name', false)
WebUI.verifyTextPresent('Account Number', false)
WebUI.verifyTextPresent('Amount Due', false)
WebUI.verifyTextPresent('Email', false)
WebUI.verifyTextPresent('Phone', false)
//WebUI.verifyTextPresent('Jesse Gonzalez', false)
//WebUI.verifyTextPresent('50020006', false)
//WebUI.verifyTextPresent('$85.50', false)

WebUI.verifyTextPresent('Send Payment Link', false)
WebUI.verifyTextPresent('Email Address', false)
WebUI.verifyTextPresent('Phone Number', false)
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Email_address'),2)
WebUI.verifyElementClickable(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Email_address'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Phone_number'),2)
WebUI.verifyElementClickable(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Phone_number'))
WebUI.verifyTextPresent('At least one contact method (email or phone) must be provided', false)
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Send_payment_link'),2)
WebUI.verifyElementClickable(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Send_payment_link'))



