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


		deepAdminSuiteURL = "https://demo.velocitypayment.com/admin/imtiazdemo"
			deepUsername = GlobalVariable.AutoUserAdminSuite
			deepPassword = GlobalVariable.AutoPasswordAdminSuite
			
			println deepUsername
			println deepPassword
			


// Log into Admin Suite
CustomKeywords.'adminSuiteBootstrap.loginFunctionality.setDataAdminSuiteLogin'(deepUsername,deepPassword,deepAdminSuiteURL)

// Select Manage Emil Text to Pay Link
//WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_ManageEmailOrTextToPay'))

WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNav_ManageEmailOrTextToPay'))
WebUI.delay(2)

// Verify Static Text and Elements on Manage Emil Text to Pay Page

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/dd_SelectPaymentApplication'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/dd_SelectPaymentApplication'), 30)

WebUI.verifyOptionsPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/dd_SelectPaymentApplication'),['Change Me'])


WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/cal_StartDate'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/cal_StartDate'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/cal_EndDate'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/cal_EndDate'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/btn_Search'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/btn_Search'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/txt_ReceipientCompanyName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/txt_ReceipientCompanyName'), 30)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/btn_Filter'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/btn_Filter'), 30)

//WebUI.verifyTextPresent('Pay Notification', true)
WebUI.verifyTextPresent('Manage Email/Text to Pay', true)
WebUI.verifyTextPresent('Payment Application', true)
WebUI.verifyTextPresent('Start Date', true)
WebUI.verifyTextPresent('End Date', true)
WebUI.verifyTextPresent('Search Results', true)
WebUI.verifyTextPresent('Recipient/Company Name', true)
WebUI.verifyTextPresent('Link Create Date', true)
WebUI.verifyTextPresent('Link Expiry Date', true)
WebUI.verifyTextPresent('Bill Amount', true)
WebUI.verifyTextPresent('Status', true)
WebUI.verifyTextPresent('Payment ID', true)
WebUI.verifyTextPresent('Action', true)
WebUI.verifyTextPresent('No records found. Please perform a search', true)

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'), 5)







