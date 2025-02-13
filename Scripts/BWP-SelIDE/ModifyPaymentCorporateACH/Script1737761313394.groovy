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

def bwpURL = GlobalVariable.BWPURL
selenium.open(bwpURL)



selenium.type("name=application_id", "623")
selenium.type("name=message_version", ("1.5").toString())


//selenium.type("name=remittance_id", "sdfsdfsdfsdf")
def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
selenium.type("name=remittance_id", genRemIDVoid)


selenium.type("name=amount", ("10.00").toString())
selenium.type("name=taxAmount", ("1.59").toString())
selenium.type("name=clientAccountNumber", "1234567")
selenium.type("name=user_defined1", ("udf1 data").toString())
selenium.type("name=user_defined2", ("udf2 data").toString())
selenium.type("name=user_defined3", ("udf3 data").toString())
selenium.type("name=user_defined4", ("udf4 data").toString())
selenium.type("name=user_defined5", ("udf5 data").toString())
selenium.type("name=user_defined6", ("udf6 data").toString())
selenium.type("name=user_defined7", ("udf7 data").toString())
selenium.type("name=user_defined8", ("udf8 data").toString())
selenium.type("name=user_defined9", ("udf9 data").toString())
selenium.type("name=user_defined10", ("udf10 data").toString())
selenium.click("css=input[type=\"submit\"]")
selenium.waitForPageToLoad("30000")
selenium.click("xpath=(//input[@name='paymentMethod'])[3]")
selenium.click("css=input[type=\"submit\"]")
selenium.waitForPageToLoad("30000")
selenium.type("id=billing-zip-input", "22201")
selenium.type("name=amount", ("10.00").toString())
selenium.type("name=userDefined1", ("udf1 data").toString())
selenium.type("name=userDefined2", ("udf2 data").toString())
selenium.type("name=userDefined3", ("udf3 data").toString())
selenium.select("name=variableField4DropdownGroupItemID", "label=Vanilla")
selenium.select("name=variableField5DropdownGroupItemID", "label=Chocolate")
selenium.type("name=userDefined6", ("udf6 data").toString())
selenium.type("name=userDefined7", ("udf7 data").toString())
selenium.type("name=userDefined8", ("udf8 data").toString())
selenium.type("name=userDefined9", ("udf9 data").toString())
selenium.type("name=billingCompanyname", ("My Company").toString())
selenium.type("id=routingNumber", "256072691")
selenium.type("id=accountNumber", "33333333")
selenium.type("id=confirmAccountNumber", "33333333")
selenium.type("name=ein", "123456789")
selenium.type("name=billingAddress", ("2311 york road").toString())
selenium.type("name=billingAddress2", ("suite 600").toString())
selenium.type("name=emailAddress", ("iahmed@govolution.com").toString())
selenium.click("id=checkedAcceptCondition")
selenium.click("name=achSubmit")
selenium.waitForPageToLoad("30000")



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


selenium.click("document.process.confirmNotifyAction[1]")
selenium.waitForPageToLoad("30000")
selenium.type("id=billing-zip-input", "03106")
selenium.type("name=amount", ("20.00").toString())
selenium.type("name=userDefined3", ("udf3 data Modified").toString())
selenium.select("name=variableField5DropdownGroupItemID", "label=Strawberry")
selenium.type("name=billingCompanyname", ("Minka Group").toString())
selenium.type("id=routingNumber", "055002707")
selenium.type("id=accountNumber", "44444444")
selenium.type("id=confirmAccountNumber", "44444444")
selenium.type("name=ein", "987654321")
selenium.type("name=billingAddress", ("15 Elm Street").toString())
selenium.type("name=billingAddress2", ("Building 2").toString())
selenium.type("name=emailAddress", ("imtiazster@gmail.com").toString())
selenium.click("name=achSubmit")
selenium.waitForPageToLoad("30000")



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



selenium.click("name=confirmNotifyAction")
selenium.waitForPageToLoad("30000")
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



