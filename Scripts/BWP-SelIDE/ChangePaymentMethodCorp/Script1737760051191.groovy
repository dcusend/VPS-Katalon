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

def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)

WebUI.setText(to('name=application_id'), '623')
WebUI.setText(to('name=message_version'), '1.5')
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
WebUI.click(to('name=changePaymentMethodButton'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.verifyTextPresent('Select Payment Method', true)
WebUI.verifyTextPresent('Pay by Credit or Debit Card', true)

WebUI.click(to('name=paymentMethod'))
WebUI.verifyElementPresent(to('name=paymentMethod'), pageLoadTimeoutSeconds)
WebUI.verifyTextPresent('Pay by Personal Check', true)

WebUI.click(to("xpath=(//input[@name='paymentMethod'])[2]"))
WebUI.verifyElementPresent(to("xpath=(//input[@name='paymentMethod'])[2]"), pageLoadTimeoutSeconds)
WebUI.verifyTextPresent('Pay by Corporate Check', true)

WebUI.click(to("xpath=(//input[@name='paymentMethod'])[3]"))
WebUI.verifyElementPresent(to("xpath=(//input[@name='paymentMethod'])[3]"), pageLoadTimeoutSeconds)
WebUI.verifyElementPresent(to('css=input[type="submit"]'), pageLoadTimeoutSeconds)