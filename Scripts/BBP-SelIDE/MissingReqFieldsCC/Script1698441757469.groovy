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
selenium.open("/vbillslookup/lookup/testvbillsauto")
selenium.type("id=field1", "111150")
selenium.type("id=field2", "111151")
selenium.click("name=Test")
Thread.sleep(2000);
selenium.click("name=paysubmit")
selenium.waitForPageToLoad("30000")
selenium.click("name=paymentMethod")
selenium.click("css=input[type=\"submit\"]")
selenium.waitForPageToLoad("30000")
softAssertion.assertEquals("Required fields are highlighted with an asterisk.", selenium.getText("css=span.required"))
softAssertion.assertEquals("Please enter the following information about your payment:", selenium.getText("css=span.vrelay-header"))
selenium.type("name=amount", "")
selenium.type("name=userDefined2", ("UDF2 Data1").toString())
selenium.type("name=userDefined3", "")
selenium.select("name=variableField4DropdownGroupItemID", "label=Purple")
selenium.select("name=variableField5DropdownGroupItemID", "label=--Select One--")
selenium.type("name=userDefined6", ("UDF6 Data1").toString())
selenium.type("name=userDefined7", "")
selenium.type("name=userDefined8", ("UDF8 Data1").toString())
selenium.type("name=billingName", "")
selenium.type("id=cardNumber", "")
selenium.type("id=spc", "")
selenium.select("name=cardExpMonth", "label=MM")
selenium.select("name=cardExpYear", "label=YYYY")
selenium.type("name=billingAddress", "")
selenium.type("name=billingAddress2", ("Suite 600").toString())
selenium.type("id=billing-zip-input", "")
selenium.type("name=emailAddress", ("iahmed@govolution.com").toString())
selenium.click("name=ccSubmit")
selenium.waitForPageToLoad("30000")
softAssertion.assertEquals("Amount is required", selenium.getText("css=span.vrelay-error"))
softAssertion.assertEquals("UDF3 is required", selenium.getText("//form[@id='process']/table/tbody/tr[8]/td[3]/span"))
softAssertion.assertEquals("UDF5 is required", selenium.getText("//form[@id='process']/table/tbody/tr[10]/td[3]/span"))
softAssertion.assertEquals("UDF7 is required", selenium.getText("//form[@id='process']/table/tbody/tr[12]/td[3]/span"))
softAssertion.assertEquals("Card name is required", selenium.getText("//form[@id='process']/table/tbody/tr[15]/td[3]/span"))
softAssertion.assertEquals("Card number is required", selenium.getText("//form[@id='process']/table/tbody/tr[17]/td[3]/span"))
softAssertion.assertEquals("Card Security Code is required", selenium.getText("//form[@id='process']/table/tbody/tr[19]/td[3]/span"))
softAssertion.assertEquals("Card expiration date is required", selenium.getText("//form[@id='process']/table/tbody/tr[20]/td[3]/span"))
softAssertion.assertEquals("Card address Line 1 is required", selenium.getText("//form[@id='process']/table/tbody/tr[22]/td[3]/span"))
softAssertion.assertEquals("Card ZIP Code is required", selenium.getText("id=billing-zip-input-err-from-formbean"))
softAssertion.assertEquals("You must review and accept the Credit Card terms and conditions in order to process a credit transaction.", selenium.getText("//form[@id='process']/table/tbody/tr[31]/td[2]/span"))