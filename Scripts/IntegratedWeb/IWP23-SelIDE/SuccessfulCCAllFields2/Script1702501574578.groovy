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
println("Begin Test: SuccessfulCCAllFields2")
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
selenium.selectWindow("null")
selenium.click("name=paymentMethod")
selenium.click("css=input[type=\"submit\"]")
selenium.waitForPageToLoad("30000")
selenium.type("name=amount", ("11.50").toString())
selenium.type("name=userDefined2", ("udf2 new").toString())
selenium.type("name=userDefined3", ("udf3 new").toString())
selenium.select("name=variableField4DropdownGroupItemID", "label=Purple")
selenium.select("name=variableField5DropdownGroupItemID", "label=Tennis")
selenium.type("name=billingName", ("Leslie Howard").toString())
selenium.type("id=cardNumber", "5424000000000015")
selenium.type("id=spc", "568")
selenium.select("name=cardExpMonth", "label=02")
selenium.select("name=cardExpYear", "label=2028")
selenium.type("name=billingAddress", ("778 Main street").toString())
selenium.type("name=billingAddress2", ("Unit 2").toString())
selenium.type("id=billing-zip-input", "22201")
selenium.type("name=emailAddress", ("imtiazster@gmail.com").toString())
selenium.click("id=checkedAcceptCondition")
selenium.click("name=ccSubmit")
selenium.waitForPageToLoad("30000")


/*
 * softAssertion.assertEquals("Please verify the following information:",
 * selenium.getText("css=span.vrelay-header"))
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[12]/td[3]"
 * )',
 * '^exact:[\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\
 * S]*[\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]*0015$'), true)
 * softAssertion.assertEquals("2/2028", selenium.getText("//tr[14]/td[3]"))
 * softAssertion.assertEquals("imtiazster@gmail.com",
 * selenium.getText("//tr[24]/td[3]"))
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)
 * softAssertion.assertEquals(selenium.isElementPresent(
 * "document.process.confirmNotifyAction[1]"), true)
 * softAssertion.assertEquals(selenium.isElementPresent(
 * "name=changePaymentMethodButton"), true)
 */

WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)
WebUI.verifyTextPresent(("0015"), true)
WebUI.verifyTextPresent(("2/2028"), true)
WebUI.verifyTextPresent(("imtiazster@gmail.com"), true)


selenium.click("name=confirmNotifyAction")
selenium.waitForPageToLoad("30000")
Thread.sleep(8000);



/*
 * softAssertion.assertEquals("Successful Payment Receipt",
 * selenium.getText("css=td > h2"))
 * softAssertion.assertEquals("Please print this receipt for your records",
 * selenium.getText("css=td > p"))
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "udf1.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "udf2 new.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "udf3 new.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "Purple Label.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "Tennis Label.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=div.main_col")', "11.50.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "Authorization and Capture.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "MasterCard.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "LESLIE HOWARD.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "0015.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "778 Main street.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "Unit 2.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "United States.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "ARLINGTON.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "VA.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=tbody")',
 * "22201.*"), true)
 */

WebUI.verifyTextPresent(("Successful Payment Receipt"), true)
WebUI.verifyTextPresent(("Please print this receipt for your records"), true)
WebUI.verifyTextPresent(("udf1"), true)
WebUI.verifyTextPresent(("udf2 new"), true)
WebUI.verifyTextPresent(("udf3 new"), true)
WebUI.verifyTextPresent(("Purple Label"), true)
WebUI.verifyTextPresent(("Tennis Label"), true)
WebUI.verifyTextPresent(("11.50"), true)
WebUI.verifyTextPresent(("Authorization and Capture"), true)
WebUI.verifyTextPresent(("MasterCard"), true)
WebUI.verifyTextPresent(("LESLIE HOWARD"), true)
WebUI.verifyTextPresent(("0015"), true)
WebUI.verifyTextPresent(("778 Main street"), true)
WebUI.verifyTextPresent(("Unit 2"), true)
WebUI.verifyTextPresent(("United States"), true)
WebUI.verifyTextPresent(("ARLINGTON"), true)
WebUI.verifyTextPresent(("VA"), true)
WebUI.verifyTextPresent(("22201"), true)



println("End Test: SuccessfulCCAllFields2")
