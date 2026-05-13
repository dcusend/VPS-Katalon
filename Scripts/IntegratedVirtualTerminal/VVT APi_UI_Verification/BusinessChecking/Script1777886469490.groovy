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
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.util.KeywordUtil
import java.text.DecimalFormat
import java.util.Random
import org.apache.commons.lang.RandomStringUtils

def IVTUrl, IVTUserName, IVTPassword, IVTPartnerToken, 
	resText, datText, resColumn, datCloumn, fileLoc, nameSheet, row, isRequiredTextPresent= false

def executionProfile = RC.getExecutionProfile()

IVTUrl = GlobalVariable.IVTUrl

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(IVTUrl)

//IVTUserName= GlobalVariable.IVTUserName
//
//IVTPassword= GlobalVariable.IVTPassword
//
//IVTPartnerToken= GlobalVariable.IVTPartnerToken


WebUI.verifyTextPresent('Payment Details', true)

WebUI.verifyTextPresent('Business Checking', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/label_BusinessChecking'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/label_BusinessChecking'), 10)
WebUI.click(findTestObject('Object Repository/IntegratedVT/BusinessChecking/label_BusinessChecking'))

WebUI.verifyTextPresent('Routing Transit Number', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_RoutingNumber'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_RoutingNumber'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_RoutingNumber'))

WebUI.verifyTextPresent('Account Number', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AccountNumber'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AccountNumber'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AccountNumber'))

WebUI.verifyTextPresent("Confirm Account Number", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_ConfirmAccountNumber'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_ConfirmAccountNumber'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_ConfirmAccountNumber'))

WebUI.executeJavaScript('window.scrollTo(0, document.body.scrollHeight)', null)

WebUI.verifyTextPresent("Business Name", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_BusinessName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_BusinessName'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_BusinessName'))

WebUI.verifyTextPresent("First Name", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_FirstName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_FirstName'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_FirstName'))

WebUI.verifyTextPresent("Last Name", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_LastName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_LastName'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_LastName'))

WebUI.verifyTextPresent('Billing Details', true)

WebUI.verifyTextPresent("Email Address", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_EmailAddress'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_EmailAddress'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_EmailAddress'))

WebUI.verifyTextPresent("Phone Number", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_PhoneNumber'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_PhoneNumber'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_PhoneNumber'))

WebUI.verifyTextPresent("Payment Date", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_PaymentDate'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_PaymentDate'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_PaymentDate'))

WebUI.verifyTextPresent("Country", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/select_Country'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/select_Country'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/select_Country'))

WebUI.verifyTextPresent("Address Line 1", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AddressLine1'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AddressLine1'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AddressLine1'))

WebUI.verifyTextPresent("ZIP Code", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_ZipCode'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_ZipCode'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_ZipCode'))

WebUI.verifyTextPresent("State", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/select_State'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/select_State'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/select_State'))

WebUI.verifyTextPresent("City", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_City'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_City'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_City'))

WebUI.verifyTextPresent('Additional Details', true)

WebUI.verifyTextPresent("user_defined_1", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF1'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF1'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF1'))

WebUI.verifyTextPresent("user_defined_2", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF2'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF2'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF2'))

WebUI.verifyTextPresent("user_defined_3", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF3'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF3'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF3'))

WebUI.verifyTextPresent("user_defined_4", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF4'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF4'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF4'))

WebUI.verifyTextPresent("user_defined_5", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF5'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF5'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF5'))

WebUI.verifyTextPresent("user_defined_6", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF6'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF6'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF6'))

WebUI.verifyTextPresent("user_defined_7", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF7'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF7'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF7'))

WebUI.verifyTextPresent("user_defined_8", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF8'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF8'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF8'))

WebUI.verifyTextPresent("user_defined_9", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF9'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF9'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF9'))

WebUI.verifyTextPresent("user_defined_10", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF10'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF10'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF10'))


WebUI.verifyTextPresent("Continue", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/button_Continue'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/button_Continue'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/button_Continue'))

WebUI.verifyTextPresent("Exit", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/button_Exit'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/button_Exit'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/button_Exit'))




