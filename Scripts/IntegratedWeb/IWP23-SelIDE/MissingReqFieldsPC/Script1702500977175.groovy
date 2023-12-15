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
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
println("Begin Test: MissingReqFieldsPC")
//selenium.open("https://qa2.velocitypayment.com/agency/config.do?action=editor")

def emulatorURL = GlobalVariable.urlEmulator
selenium.open(emulatorURL)

selenium.selectWindow("null")
selenium.select("name=message_version", "label=2.3")
selenium.waitForPageToLoad("30000")
selenium.type("name=amount", ("10.00").toString())
selenium.type("name=client_account_number", "CAN12345")
selenium.type("name=action_type", "PayNow")
selenium.type("name=language", "en_US")
selenium.type("name=billing_firstname", "Mandy")
selenium.type("name=billing_lastname", "Iguera")
selenium.type("name=billing_address", ("56 World Center Drive").toString())
selenium.type("name=billing_address2", ("Suite 600").toString())
selenium.type("name=billing_country_id", "840")
selenium.type("name=billing_city", "Orlando")
selenium.type("name=billing_state", "NH")
selenium.type("name=billing_zip", "03106")
selenium.type("name=order_number", "PPPPOOOO")
selenium.type("name=user_defined1", "udf1")
selenium.type("name=user_defined2", "udf2")
selenium.type("name=user_defined3", "udf3")
selenium.type("name=user_defined4", ("Orange Label").toString())
selenium.type("name=user_defined5", ("Soccer Label").toString())
selenium.click("name=submit")
selenium.waitForPageToLoad("30000")
Thread.sleep(2000);
//selenium.open("https://dev-algorithm.govolution.com/vrelaytest/QA2/version_2_2/vrelaytest.html")

def testHarnessURL = GlobalVariable.urlTestHarness
selenium.open(testHarnessURL)

selenium.type("name=application_id", "635")
selenium.type("name=message_version", ("2.3").toString())
//String remID = selenium.getEval("  " + "Date.now")
//selenium.type("name=remittance_id", (remID).toString())

def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
selenium.type("name=remittance_id", genRemIDVoid)

selenium.click("css=input.formSubmit")
selenium.waitForPageToLoad("30000")
selenium.click("xpath=(//input[@name='paymentMethod'])[2]")
selenium.click("css=input[type=\"submit\"]")
selenium.waitForPageToLoad("30000")
selenium.type("name=amount", "")
selenium.type("name=userDefined2", ("udf2 data").toString())
selenium.type("name=userDefined3", "")
selenium.select("name=variableField4DropdownGroupItemID", "label=Purple")
selenium.select("name=variableField5DropdownGroupItemID", "--Select One--")
selenium.type("name=billingFirstname", "")
selenium.type("name=billingLastname", "")
selenium.type("id=routingNumber", "")
selenium.type("id=accountNumber", "")
selenium.type("id=confirmAccountNumber", "")
selenium.type("name=billingAddress", "")
selenium.type("name=billingAddress2", ("Room 1").toString())
selenium.type("id=billing-zip-input", "")
selenium.type("name=emailAddress", ("iahmed@govolution.com").toString())
selenium.click("name=achSubmit")
selenium.waitForPageToLoad("30000")

/*
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=div.main_col")', "Required fields are highlighted with an asterisk.*"),
 * true) softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=div.main_col")', "Amount is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=div.main_col")', "UDF3 Label is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=div.main_col")', "UDF5 Label is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=div.main_col")', "First name is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=div.main_col")', "Last name is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=div.main_col")', "Account number is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=div.main_col")',
 * "The Confirm Account Number field is a required field.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=div.main_col")', "Account type is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=div.main_col")', "Address Line 1 is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=div.main_col")', "ZIP Code is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=div.main_col")',
 * "You must review and accept the ACH terms and conditions in order to process an electronic debit transaction.*"
 * ), true)
 */
WebUI.verifyTextPresent(("Required fields are highlighted with an asterisk"), true)
WebUI.verifyTextPresent(("Amount is required"), true)
WebUI.verifyTextPresent(("UDF3 Label is required"), true)
WebUI.verifyTextPresent(("UDF5 Label is required"), true)
WebUI.verifyTextPresent(("First name is required"), true)
WebUI.verifyTextPresent(("Last name is required"), true)
WebUI.verifyTextPresent(("Account number is required"), true)
WebUI.verifyTextPresent(("The Confirm Account Number field is a required field"), true)
WebUI.verifyTextPresent(("Account type is required"), true)
WebUI.verifyTextPresent(("Address Line 1 is required"), true)
WebUI.verifyTextPresent(("ZIP Code is required"), true)
WebUI.verifyTextPresent(("You must review and accept the ACH terms and conditions in order to process an electronic debit transaction"), true)



println("End Test: MissingReqFieldsPC")
