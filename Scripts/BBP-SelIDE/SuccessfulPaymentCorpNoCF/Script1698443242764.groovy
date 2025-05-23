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
selenium.click("xpath=(//input[@name='paymentMethod'])[3]")
selenium.click("css=input[type=\"submit\"]")
selenium.waitForPageToLoad("30000")
//softAssertion.assertEquals("Required fields are highlighted with an asterisk.", selenium.getText("css=span.required"))
//softAssertion.assertEquals("Please enter the following billing information about your payment:", selenium.getText("css=span.vrelay-header"))

WebUI.verifyTextPresent(("Required fields are highlighted with an asterisk."), true)
WebUI.verifyTextPresent(("Please enter the following billing information about your payment:"), true)


selenium.type("name=amount", ("15.00").toString())
selenium.type("name=userDefined2", ("UDF2 Data3").toString())
selenium.type("name=userDefined3", ("UDF3 Data3").toString())
selenium.select("name=variableField4DropdownGroupItemID", "label=Purple")
selenium.select("name=variableField5DropdownGroupItemID", "label=Orange")
selenium.type("name=userDefined6", ("UDF6 Data3").toString())
selenium.type("name=userDefined7", ("UDF7 Data3").toString())
selenium.type("name=userDefined8", ("UDF8 Data3").toString())
selenium.type("name=billingCompanyname", ("My Company").toString())
selenium.type("id=routingNumber", "256072691")
selenium.type("id=accountNumber", "33333333")
selenium.type("id=confirmAccountNumber", "33333333")
selenium.type("name=ein", "123456789")
selenium.type("name=billingAddress", ("2311 york road").toString())
selenium.type("name=billingAddress2", ("suite 600").toString())
selenium.type("id=billing-zip-input", "21054")
selenium.type("name=emailAddress", ("iahmed@govolution.com").toString())
selenium.click("id=checkedAcceptCondition")
selenium.click("name=achSubmit")
selenium.waitForPageToLoad("30000")
//softAssertion.assertEquals("Please verify the following information:", selenium.getText("css=span.vrelay-header"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)

WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)


selenium.click("name=confirmNotifyAction")
selenium.waitForPageToLoad("30000")
Thread.sleep(15000);
//softAssertion.assertEquals("Successful Payment Receipt", selenium.getText("css=td > h2"))
//softAssertion.assertEquals("Please print this receipt for your records", selenium.getText("css=td > p"))
//softAssertion.assertEquals("UDF1 Data", selenium.getText("//tr[5]/td[2]"))
//softAssertion.assertEquals("UDF2 Data3", selenium.getText("//tr[6]/td[2]"))
//softAssertion.assertEquals("UDF3 Data3", selenium.getText("//tr[7]/td[2]"))
//softAssertion.assertEquals("Purple", selenium.getText("//tr[8]/td[2]"))
//softAssertion.assertEquals("Orange", selenium.getText("//tr[9]/td[2]"))
//softAssertion.assertEquals("UDF6 Data3", selenium.getText("//tr[10]/td[2]"))
//softAssertion.assertEquals("UDF7 Data3", selenium.getText("//tr[11]/td[2]"))
//softAssertion.assertEquals("UDF8 Data3", selenium.getText("//tr[12]/td[2]"))
//softAssertion.assertEquals("$3.65", selenium.getText("//tr[13]/td[2]"))
//softAssertion.assertEquals("$15.00", selenium.getText("//tr[14]/td[2]"))
//softAssertion.assertEquals("Debit", selenium.getText("//tr[15]/td[2]"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[16]/td[2]")', "Corporate.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[16]/td[2]")', "Checking.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[16]/td[2]")', "2691.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[16]/td[2]")', "My Company.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[16]/td[2]")', "123456789.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "2311 york road.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "suite 600.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "United States.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "GAMBRILLS.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "Maryland.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "21054.*"), true)

WebUI.verifyTextPresent(("Successful Payment Receipt"), true)
WebUI.verifyTextPresent(("Please print this receipt for your records"), true)
WebUI.verifyTextPresent(("UDF1 Data"), true)
WebUI.verifyTextPresent(("UDF2 Data3"), true)
WebUI.verifyTextPresent(("UDF3 Data3"), true)
WebUI.verifyTextPresent(("Purple"), true)
WebUI.verifyTextPresent(("Orange"), true)
WebUI.verifyTextPresent(("UDF6 Data3"), true)
WebUI.verifyTextPresent(("UDF7 Data3"), true)
WebUI.verifyTextPresent(("UDF8 Data3"), true)
WebUI.verifyTextPresent(("\$3.65"), false)
WebUI.verifyTextPresent(("\$15.00"), false)
WebUI.verifyTextPresent(("Debit"), true)
WebUI.verifyTextPresent(("Corporate"), true)
WebUI.verifyTextPresent(("Checking"), true)
WebUI.verifyTextPresent(("2691"), true)
WebUI.verifyTextPresent(("My Company"), true)
WebUI.verifyTextPresent(("123456789"), true)
WebUI.verifyTextPresent(("2311 york road"), true)
WebUI.verifyTextPresent(("suite 600"), true)
WebUI.verifyTextPresent(("United States"), true)
WebUI.verifyTextPresent(("GAMBRILLS"), true)
WebUI.verifyTextPresent(("Maryland"), true)
WebUI.verifyTextPresent(("21054"), true)


