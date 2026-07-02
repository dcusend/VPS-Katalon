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


WebUI.setText(to('name=application_id'), '628')
WebUI.setText(to('name=message_version'), '1.5')


def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
WebUI.setText(to('name=remittance_id'), genRemIDVoid)


WebUI.setText(to('name=amount'), '20.00')
WebUI.setText(to('name=taxAmount'), '1.59')
WebUI.setText(to('name=clientAccountNumber'), 'abcdefr')
WebUI.setText(to('name=user_defined1'), 'udf1 data Hello')
WebUI.setText(to('name=user_defined2'), 'udf2 data Hello')
WebUI.setText(to('name=user_defined3'), 'udf3 data Hello')
WebUI.setText(to('name=user_defined4'), 'udf4 data Hello')
WebUI.setText(to('name=user_defined5'), 'udf5 data Hello')
WebUI.setText(to('name=user_defined6'), 'udf6 data Hello')
WebUI.setText(to('name=user_defined7'), 'udf7 data Hello')
WebUI.setText(to('name=user_defined8'), 'udf8 data Hello')
WebUI.setText(to('name=user_defined9'), 'udf9 data Hello')
WebUI.setText(to('name=user_defined10'), 'udf10 data Hello')
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.click(to("xpath=(//input[@name='paymentMethod'])[2]"))
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.setText(to('id=billing-zip-input'), '22201')
WebUI.setText(to('name=amount'), '10.00')
WebUI.setText(to('name=userDefined2'), 'udf2 data')
WebUI.setText(to('name=userDefined3'), 'udf3 data')
WebUI.setText(to('name=userDefined5'), 'udf5 data')
WebUI.setText(to('name=billingFirstname'), 'Nicole')
WebUI.setText(to('name=billingLastname'), 'Chloe')
WebUI.setText(to('id=routingNumber'), '256072691')
WebUI.setText(to('id=accountNumber'), '11111111')
WebUI.setText(to('id=confirmAccountNumber'), '11111111')
WebUI.click(to('name=accountType'))
WebUI.setText(to('name=billingAddress'), '2311 york road')
WebUI.setText(to('name=billingAddress2'), 'suite 600')
WebUI.click(to('id=checkedAcceptCondition'))
WebUI.click(to('name=achSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)


WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)


WebUI.click(to('name=confirmNotifyAction'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

/*
 * //softAssertion.
 * assertEquals("This transaction is subject to a Convenience Fees of $1.00.",
 * selenium.getText("css=p")) softAssertion.assertEquals("Payment Amount:",
 * selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr/td/table/tbody/tr/td[2]"
 * )) //softAssertion.assertEquals("$10.00", selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr/td/table/tbody/tr/td[3]"
 * )) softAssertion.assertEquals("Convenience Fees:", selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]"
 * )) //softAssertion.assertEquals("$1.00", selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr/td/table/tbody/tr[2]/td[3]"
 * )) softAssertion.assertEquals("Total Amount:", selenium.getText("css=b"))
 * //softAssertion.assertEquals("$11.00", selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr/td/table/tbody/tr[4]/td[3]/b"
 * )) //softAssertion.
 * assertEquals("Two transactions will appear on your bank statement, one in the amount of $10.00 and one in the amount of $1.00."
 * , selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr/td/p[2]"))
 */
WebUI.verifyTextPresent(("Payment Amount:"), true)
WebUI.verifyTextPresent(("Convenience Fees:"), true)
WebUI.verifyTextPresent(("Total Amount:"), true)


WebUI.click(to('name=convFeeNotifyAction'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
Thread.sleep(20000);


/*
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "Amount:.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "10.00.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "Convenience Fees:.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "1.00.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "Convenience Fees Type:.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "Dual Transaction.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "Total Amount:.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "11.00.*"), true)
 */

WebUI.verifyTextPresent(("Amount:.*"), true)
WebUI.verifyTextPresent(("10.00.*"), true)
WebUI.verifyTextPresent(("Convenience Fees:.*"), true)
WebUI.verifyTextPresent(("1.00.*"), true)
WebUI.verifyTextPresent(("Convenience Fees Type:.*"), true)
WebUI.verifyTextPresent(("Dual Transaction.*"), true)
WebUI.verifyTextPresent(("Total Amount:.*"), true)
WebUI.verifyTextPresent(("11.00.*"), true)
