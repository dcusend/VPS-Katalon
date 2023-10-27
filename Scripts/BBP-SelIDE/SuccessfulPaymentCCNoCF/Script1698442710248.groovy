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
softAssertion.assertEquals("Please verify the following information:", selenium.getText("css=span.vrelay-header"))
softAssertion.assertEquals(Pattern.matches('selenium.getText("css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)
selenium.click("name=confirmNotifyAction")
selenium.waitForPageToLoad("30000")
Thread.sleep(15000);
softAssertion.assertEquals("Successful Payment Receipt", selenium.getText("css=td > h2"))
softAssertion.assertEquals("Please print this receipt for your records", selenium.getText("css=td > p"))
softAssertion.assertEquals("$12.00", selenium.getText("//tr[14]/td[2]"))
softAssertion.assertEquals("Authorization and Capture", selenium.getText("//tr[15]/td[2]"))
softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[16]/td[2]")', "Visa.*"), true)
softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[16]/td[2]")', "HUNTER HELMS.*"), true)
softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "2311 york road.*"), true)
softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "Suite 600.*"), true)
softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "United States.*"), true)
softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "GAMBRILLS.*"), true)
softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "Maryland.*"), true)
softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "21054.*"), true)
softAssertion.assertEquals("UDF1 Data", selenium.getText("//tr[5]/td[2]"))
softAssertion.assertEquals("UDF2 Data1", selenium.getText("//tr[6]/td[2]"))
softAssertion.assertEquals("UDF3 Data1", selenium.getText("//tr[7]/td[2]"))
softAssertion.assertEquals("Purple", selenium.getText("//tr[8]/td[2]"))
softAssertion.assertEquals("Orange", selenium.getText("//tr[9]/td[2]"))
softAssertion.assertEquals("UDF6 Data1", selenium.getText("//tr[10]/td[2]"))
softAssertion.assertEquals("UDF7 Data1", selenium.getText("//tr[11]/td[2]"))
softAssertion.assertEquals("UDF8 Data1", selenium.getText("//tr[12]/td[2]"))
softAssertion.assertEquals("$3.65", selenium.getText("//tr[13]/td[2]"))
