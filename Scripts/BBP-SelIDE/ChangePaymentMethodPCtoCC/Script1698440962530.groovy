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

bbpURL = GlobalVariable.BBPURL

selenium.open(bbpURL)



//selenium.open("/vbillslookup/lookup/testvbillsauto")
selenium.type("id=field1", "111150")
selenium.type("id=field2", "111151")
selenium.click("name=Test")
Thread.sleep(2000);
selenium.click("name=paysubmit")
selenium.waitForPageToLoad("30000")
selenium.click("xpath=(//input[@name='paymentMethod'])[2]")
selenium.click("css=input[type=\"submit\"]")
selenium.waitForPageToLoad("30000")
//softAssertion.assertEquals("Required fields are highlighted with an asterisk.", selenium.getText("css=span.required"))
//softAssertion.assertEquals("Please enter the following billing information about your payment:", selenium.getText("css=span.vrelay-header"))

WebUI.verifyTextPresent(("Required fields are highlighted with an asterisk."), true)
WebUI.verifyTextPresent(("Please enter the following billing information about your payment:"), true)


selenium.type("name=amount", ("13.00").toString())
selenium.type("name=userDefined2", ("UDF2 Data2").toString())
selenium.type("name=userDefined3", ("UDF3 Data2").toString())
selenium.select("name=variableField4DropdownGroupItemID", "label=Purple")
selenium.select("name=variableField5DropdownGroupItemID", "label=Orange")
selenium.type("name=userDefined6", ("UDF6 Data2").toString())
selenium.type("name=userDefined7", ("UDF7 Data2").toString())
selenium.type("name=userDefined8", ("UDF8 Data2").toString())
selenium.type("name=billingFirstname", "Molly")
selenium.type("name=billingLastname", "Hunter")
selenium.type("id=routingNumber", "256072691")
selenium.type("id=accountNumber", "11111111")
selenium.type("id=confirmAccountNumber", "11111111")
selenium.click("name=accountType")
selenium.type("name=billingAddress", ("2311 york road").toString())
selenium.type("name=billingAddress2", ("Suite 600").toString())
selenium.type("id=billing-zip-input", "21054")
selenium.type("name=emailAddress", ("iahmed@govolution.com").toString())
selenium.click("id=checkedAcceptCondition")
selenium.click("name=achSubmit")
selenium.waitForPageToLoad("30000")
//softAssertion.assertEquals("Please verify the following information:", selenium.getText("css=span.vrelay-header"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)

WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)


//softAssertion.assertEquals("Personal Checking", selenium.getText("//tr[20]/td[3]"))

WebUI.verifyTextPresent(("Personal Checking"), true)

selenium.click("name=changePaymentMethodButton")
selenium.waitForPageToLoad("30000")
selenium.click("name=paymentMethod")
selenium.click("css=input[type=\"submit\"]")
selenium.waitForPageToLoad("30000")
selenium.type("name=amount", ("12.00").toString())
selenium.type("name=userDefined2", ("UDF2 Data1").toString())
selenium.type("name=userDefined3", ("UDF3 Data1").toString())
selenium.select("name=variableField4DropdownGroupItemID", "label=Purple")
selenium.select("name=variableField5DropdownGroupItemID", "label=Orange")
selenium.type("name=userDefined6", ("UDF6 Data1").toString())
selenium.type("name=userDefined7", ("UDF7 Data1").toString())
selenium.type("name=userDefined8", ("UDF8 Data1").toString())
selenium.type("name=billingName", ("Hunter Helms").toString())
selenium.type("id=cardNumber", "4111111111111111")
selenium.type("id=spc", "123")
selenium.select("name=cardExpMonth", "label=04")
selenium.select("name=cardExpYear", "label=2025")
selenium.type("name=billingAddress", ("2311 york road").toString())
selenium.type("name=billingAddress2", ("Suite 600").toString())
selenium.type("id=billing-zip-input", "21054")
selenium.type("name=emailAddress", ("iahmed@govolution.com").toString())
selenium.click("id=checkedAcceptCondition")
selenium.click("name=ccSubmit")
selenium.waitForPageToLoad("30000")
//softAssertion.assertEquals("Please verify the following information:", selenium.getText("css=span.vrelay-header"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)

WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)


//softAssertion.assertEquals("Visa", selenium.getText("//tr[16]/td[3]"))

WebUI.verifyTextPresent(("Visa"), true)

selenium.click("name=confirmNotifyAction")
selenium.waitForPageToLoad("30000")
Thread.sleep(15000);
//softAssertion.assertEquals("Authorization and Capture", selenium.getText("//tr[15]/td[2]"))

WebUI.verifyTextPresent(("Authorization and Capture"), true)

