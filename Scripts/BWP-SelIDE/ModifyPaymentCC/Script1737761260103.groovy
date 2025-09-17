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


selenium.type("name=amount", ("20.00").toString())
selenium.type("name=taxAmount", ("1.59").toString())
selenium.type("name=clientAccountNumber", "abcdefr")
selenium.type("name=user_defined1", ("udf1 data Hello").toString())
selenium.type("name=user_defined2", ("udf2 data Hello").toString())
selenium.type("name=user_defined3", ("udf3 data Hello").toString())
selenium.type("name=user_defined4", ("udf4 data Hello").toString())
selenium.type("name=user_defined5", ("udf5 data Hello").toString())
selenium.type("name=user_defined6", ("udf6 data Hello").toString())
selenium.type("name=user_defined7", ("udf7 data Hello").toString())
selenium.type("name=user_defined8", ("udf8 data Hello").toString())
selenium.type("name=user_defined9", ("udf9 data Hello").toString())
selenium.type("name=user_defined10", ("udf10 data Hello").toString())
selenium.click("css=input[type=\"submit\"]")
selenium.waitForPageToLoad("30000")
selenium.click("name=paymentMethod")
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
selenium.type("name=billingName", ("Mark Zober").toString())
selenium.type("id=cardNumber", "4111111111111111")
selenium.type("id=spc", "111")
selenium.select("name=cardExpMonth", "label=04")
selenium.select("name=cardExpYear", "label=2028")
selenium.type("name=billingAddress", ("2311 york road").toString())
selenium.type("name=billingAddress2", ("suite 600").toString())
selenium.type("name=emailAddress", ("iahmed@govolution.com").toString())
selenium.click("id=checkedAcceptCondition")
selenium.click("name=ccSubmit")
selenium.waitForPageToLoad("30000")



/*
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "udf1 data.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Vanilla.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Mark Zober.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Visa.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "1111.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "4/2028.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "2311 york road.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "ARLINGTON.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Virginia.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "22201.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "iahmed@govolution.com.*"), true)
 */


WebUI.verifyTextPresent(("udf1 data.*"), true)
WebUI.verifyTextPresent(("Vanilla.*"), true)
WebUI.verifyTextPresent(("Mark Zober.*"), true)
WebUI.verifyTextPresent(("Visa.*"), true)
WebUI.verifyTextPresent(("1111.*"), true)
WebUI.verifyTextPresent(("4/2028.*"), true)
WebUI.verifyTextPresent(("2311 york road.*"), true)
WebUI.verifyTextPresent(("ARLINGTON.*"), true)
WebUI.verifyTextPresent(("Virginia.*"), true)
WebUI.verifyTextPresent(("22201.*"), true)
WebUI.verifyTextPresent(("iahmed@govolution.com.*"), true)


selenium.click("document.process.confirmNotifyAction[1]")
selenium.waitForPageToLoad("30000")
selenium.type("name=userDefined1", ("udf1 data Modified").toString())
selenium.select("name=variableField5DropdownGroupItemID", "label=Strawberry")
selenium.type("id=billing-zip-input", "21054")
selenium.type("name=billingName", ("Roger Philips").toString())
selenium.type("id=cardNumber", "5424000000000015")
selenium.type("id=spc", "234")
selenium.select("name=cardExpMonth", "label=06")
selenium.select("name=cardExpYear", "label=2029")
selenium.type("name=billingAddress", ("15 Elm Street").toString())
selenium.type("name=emailAddress", ("imtiazster@gmail.com").toString())
selenium.click("name=ccSubmit")
selenium.waitForPageToLoad("30000")



/*
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "udf1 data Modified.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Vanilla.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Roger Philips.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "MasterCard.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "0015.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "6/2029.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "15 Elm Street.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "GAMBRILLS.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Maryland.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "21054.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "imtiazster@gmail.com.*"), true)
 */


WebUI.verifyTextPresent(("udf1 data Modified.*"), true)
WebUI.verifyTextPresent(("Vanilla.*"), true)
WebUI.verifyTextPresent(("Roger Philips.*"), true)
WebUI.verifyTextPresent(("MasterCard.*"), true)
WebUI.verifyTextPresent(("0015.*"), true)
WebUI.verifyTextPresent(("6/2029.*"), true)
WebUI.verifyTextPresent(("15 Elm Street.*"), true)
WebUI.verifyTextPresent(("GAMBRILLS.*"), true)
WebUI.verifyTextPresent(("Maryland.*"), true)
WebUI.verifyTextPresent(("21054.*"), true)
WebUI.verifyTextPresent(("imtiazster@gmail.com.*"), true)



selenium.click("name=confirmNotifyAction")
selenium.waitForPageToLoad("30000")
Thread.sleep(12000);


/*
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "MasterCard.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "ROGER PHILIPS.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "0015.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "15 Elm Street.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "GAMBRILLS.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "MD.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "21054.*"), true)
 */


WebUI.verifyTextPresent(("ROGER PHILIPS.*"), true)
WebUI.verifyTextPresent(("MasterCard.*"), true)
WebUI.verifyTextPresent(("0015.*"), true)
//WebUI.verifyTextPresent(("6/2029.*"), true)
WebUI.verifyTextPresent(("15 Elm Street.*"), true)
WebUI.verifyTextPresent(("GAMBRILLS.*"), true)
WebUI.verifyTextPresent(("MD.*"), true)
WebUI.verifyTextPresent(("21054.*"), true)
