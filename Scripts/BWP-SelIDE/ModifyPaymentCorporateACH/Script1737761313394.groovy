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

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
String baseUrl = 'https://www.google.com/'
int pageLoadTimeoutSeconds = 30

def to = { String locator -> CustomKeywords.'customClasses.LegacyLocatorUtils.testObjectFromLegacyLocator'(locator) }

def bwpURL = GlobalVariable.BWPURL
if (bwpURL?.startsWith('http://') || bwpURL?.startsWith('https://')) {
	WebUI.navigateToUrl(bwpURL)
} else {
	WebUI.navigateToUrl(baseUrl + bwpURL)
}



WebUI.setText(to('name=application_id'), '623')
WebUI.setText(to('name=message_version'), '1.5')


def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
WebUI.setText(to('name=remittance_id'), genRemIDVoid)


WebUI.setText(to('name=amount'), '10.00')
WebUI.setText(to('name=taxAmount'), '1.59')
WebUI.setText(to('name=clientAccountNumber'), '1234567')
WebUI.setText(to('name=user_defined1'), 'udf1 data')
WebUI.setText(to('name=user_defined2'), 'udf2 data')
WebUI.setText(to('name=user_defined3'), 'udf3 data')
WebUI.setText(to('name=user_defined4'), 'udf4 data')
WebUI.setText(to('name=user_defined5'), 'udf5 data')
WebUI.setText(to('name=user_defined6'), 'udf6 data')
WebUI.setText(to('name=user_defined7'), 'udf7 data')
WebUI.setText(to('name=user_defined8'), 'udf8 data')
WebUI.setText(to('name=user_defined9'), 'udf9 data')
WebUI.setText(to('name=user_defined10'), 'udf10 data')
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.click(to("xpath=(//input[@name='paymentMethod'])[3]"))
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.setText(to('id=billing-zip-input'), '22201')
WebUI.setText(to('name=amount'), '10.00')
WebUI.setText(to('name=userDefined1'), 'udf1 data')
WebUI.setText(to('name=userDefined2'), 'udf2 data')
WebUI.setText(to('name=userDefined3'), 'udf3 data')
WebUI.selectOptionByLabel(to('name=variableField4DropdownGroupItemID'), 'Vanilla', false)
WebUI.selectOptionByLabel(to('name=variableField5DropdownGroupItemID'), 'Chocolate', false)
WebUI.setText(to('name=userDefined6'), 'udf6 data')
WebUI.setText(to('name=userDefined7'), 'udf7 data')
WebUI.setText(to('name=userDefined8'), 'udf8 data')
WebUI.setText(to('name=userDefined9'), 'udf9 data')
WebUI.setText(to('name=billingCompanyname'), 'My Company')
WebUI.setText(to('id=routingNumber'), '256072691')
WebUI.setText(to('id=accountNumber'), '33333333')
WebUI.setText(to('id=confirmAccountNumber'), '33333333')
WebUI.setText(to('name=ein'), '123456789')
WebUI.setText(to('name=billingAddress'), '2311 york road')
WebUI.setText(to('name=billingAddress2'), 'suite 600')
WebUI.setText(to('name=emailAddress'), 'iahmed@govolution.com')
WebUI.click(to('id=checkedAcceptCondition'))
WebUI.click(to('name=achSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)



/*
 * softAssertion.assertEquals("Please verify the following information:",
 * selenium.getText("css=span.vrelay-header"))
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "10.00.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "udf3 data.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "My Company.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "3333.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "123456789.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Corporate Checking.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "2311 york road.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "suite 600.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "ARLINGTON.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Virginia.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "22201.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "iahmed@govolution.com.*"), true)
 */


WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)
WebUI.verifyTextPresent(("10.00.*"), true)
WebUI.verifyTextPresent(("udf3 data.*"), true)
WebUI.verifyTextPresent(("My Company.*"), true)
WebUI.verifyTextPresent(("3333.*"), true)
WebUI.verifyTextPresent(("123456789.*"), true)
WebUI.verifyTextPresent(("Corporate Checking.*"), true)
WebUI.verifyTextPresent(("2311 york road.*"), true)
WebUI.verifyTextPresent(("suite 600.*"), true)
WebUI.verifyTextPresent(("ARLINGTON.*"), true)
WebUI.verifyTextPresent(("Virginia.*"), true)
WebUI.verifyTextPresent(("22201.*"), true)
WebUI.verifyTextPresent(("iahmed@govolution.com.*"), true)


WebUI.click(to("xpath=(//input[@name='confirmNotifyAction'])[2]"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.setText(to('id=billing-zip-input'), '03106')
WebUI.setText(to('name=amount'), '20.00')
WebUI.setText(to('name=userDefined3'), 'udf3 data Modified')
WebUI.selectOptionByLabel(to('name=variableField5DropdownGroupItemID'), 'Strawberry', false)
WebUI.setText(to('name=billingCompanyname'), 'Minka Group')
WebUI.setText(to('id=routingNumber'), '055002707')
WebUI.setText(to('id=accountNumber'), '44444444')
WebUI.setText(to('id=confirmAccountNumber'), '44444444')
WebUI.setText(to('name=ein'), '987654321')
WebUI.setText(to('name=billingAddress'), '15 Elm Street')
WebUI.setText(to('name=billingAddress2'), 'Building 2')
WebUI.setText(to('name=emailAddress'), 'imtiazster@gmail.com')
WebUI.click(to('name=achSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)



/*
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "20.00.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "udf3 data Modified.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Strawberry.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Minka Group.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "4444.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "987654321.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Corporate Checking.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "15 Elm Street.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Building 2.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "HOOKSETT.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "New Hampshire.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "03106.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "imtiazster@gmail.com.*"), true)
 */


WebUI.verifyTextPresent(("20.00.*"), true)
WebUI.verifyTextPresent(("udf3 data Modified.*"), true)
WebUI.verifyTextPresent(("Strawberry.*"), true)
WebUI.verifyTextPresent(("Minka Group.*"), true)
WebUI.verifyTextPresent(("4444.*"), true)
WebUI.verifyTextPresent(("987654321.*"), true)
WebUI.verifyTextPresent(("Corporate Checking.*"), true)
WebUI.verifyTextPresent(("15 Elm Street.*"), true)
WebUI.verifyTextPresent(("Building 2.*"), true)
WebUI.verifyTextPresent(("HOOKSETT.*"), true)
WebUI.verifyTextPresent(("New Hampshire.*"), true)
WebUI.verifyTextPresent(("03106.*"), true)
WebUI.verifyTextPresent(("imtiazster@gmail.com.*"), true)



WebUI.click(to('name=confirmNotifyAction'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
Thread.sleep(20000);




/*
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "udf3 data Modified.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Strawberry Type.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "20.00.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Debit.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Corporate.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Checking.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "4444.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "2707.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Minka Group.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "987654321.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "15 Elm Street.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Building 2.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "HOOKSETT.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "New Hampshire.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "03106.*"), true)
 */


WebUI.verifyTextPresent(("udf3 data Modified.*"), true)
WebUI.verifyTextPresent(("Strawberry Type.*"), true)
WebUI.verifyTextPresent(("20.00.*"), true)
WebUI.verifyTextPresent(("Debit.*"), true)
WebUI.verifyTextPresent(("Corporate.*"), true)
WebUI.verifyTextPresent(("Checking.*"), true)
WebUI.verifyTextPresent(("4444.*"), true)
WebUI.verifyTextPresent(("2707.*"), true)
WebUI.verifyTextPresent(("Minka Group.*"), true)
WebUI.verifyTextPresent(("987654321.*"), true)
WebUI.verifyTextPresent(("15 Elm Street.*"), true)
WebUI.verifyTextPresent(("Building 2.*"), true)
WebUI.verifyTextPresent(("HOOKSETT.*"), true)
WebUI.verifyTextPresent(("New Hampshire.*"), true)
WebUI.verifyTextPresent(("03106.*"), true)



