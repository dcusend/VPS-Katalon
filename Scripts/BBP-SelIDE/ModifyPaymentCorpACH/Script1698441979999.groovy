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
softAssertion.assertEquals("Please verify the following information:", selenium.getText("css=span.vrelay-header"))
softAssertion.assertEquals(Pattern.matches('selenium.getText("css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)

WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)


//softAssertion.assertEquals("$15.00", selenium.getText("//tr[5]/td[3]"))
//softAssertion.assertEquals("UDF2 Data3", selenium.getText("//tr[7]/td[3]"))
//softAssertion.assertEquals("UDF3 Data3", selenium.getText("//tr[8]/td[3]"))
//softAssertion.assertEquals("Purple", selenium.getText("//tr[9]/td[3]"))
//softAssertion.assertEquals("Orange", selenium.getText("//tr[10]/td[3]"))
//softAssertion.assertEquals("UDF6 Data3", selenium.getText("//tr[11]/td[3]"))
//softAssertion.assertEquals("UDF7 Data3", selenium.getText("//tr[12]/td[3]"))
//softAssertion.assertEquals("UDF8 Data3", selenium.getText("//tr[13]/td[3]"))
//softAssertion.assertEquals("My Company", selenium.getText("//tr[16]/td[3]"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[3]")', "2691"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[18]/td[3]")', '^exact:[\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]*3333$'), true)
//softAssertion.assertEquals("123456789", selenium.getText("//tr[19]/td[3]"))
//softAssertion.assertEquals("Corporate Checking", selenium.getText("//tr[20]/td[3]"))
//softAssertion.assertEquals("2311 york road", selenium.getText("//tr[21]/td[3]"))
//softAssertion.assertEquals("suite 600", selenium.getText("//tr[22]/td[3]"))
//softAssertion.assertEquals("United States", selenium.getText("//tr[23]/td[3]"))
//softAssertion.assertEquals("GAMBRILLS", selenium.getText("//tr[24]/td[3]"))
//softAssertion.assertEquals("Maryland", selenium.getText("//tr[25]/td[3]"))
//softAssertion.assertEquals("21054", selenium.getText("//tr[26]/td[3]"))
//softAssertion.assertEquals("iahmed@govolution.com", selenium.getText("//tr[28]/td[3]"))

WebUI.verifyTextPresent(("15.00"), true)
WebUI.verifyTextPresent(("UDF2 Data3"), true)
WebUI.verifyTextPresent(("UDF3 Data3"), true)
WebUI.verifyTextPresent(("Purple"), true)
WebUI.verifyTextPresent(("Orange"), true)
WebUI.verifyTextPresent(("UDF6 Data3"), true)
WebUI.verifyTextPresent(("UDF7 Data3"), true)
WebUI.verifyTextPresent(("UDF8 Data3"), true)
WebUI.verifyTextPresent(("My Company"), true)
WebUI.verifyTextPresent(("2691"), true)
WebUI.verifyTextPresent(("3333"), true)
WebUI.verifyTextPresent(("123456789"), true)
WebUI.verifyTextPresent(("Corporate Checking"), true)
WebUI.verifyTextPresent(("2311 york road"), true)
WebUI.verifyTextPresent(("suite 600"), true)
WebUI.verifyTextPresent(("United States"), true)
WebUI.verifyTextPresent(("GAMBRILLS"), true)
WebUI.verifyTextPresent(("Maryland"), true)
WebUI.verifyTextPresent(("21054"), true)
WebUI.verifyTextPresent(("iahmed@govolution.com"), true)


selenium.click("document.process.confirmNotifyAction[1]")
selenium.waitForPageToLoad("30000")
selenium.type("name=amount", ("20.00").toString())
selenium.type("name=userDefined2", ("UDF2 Data3 Modified").toString())
selenium.type("name=userDefined3", ("UDF3 Data3 Modified").toString())
selenium.select("name=variableField4DropdownGroupItemID", "label=Orange")
selenium.select("name=variableField5DropdownGroupItemID", "label=Purple")
selenium.type("name=userDefined6", ("UDF6 Data3 Modified").toString())
selenium.type("name=userDefined7", ("UDF7 Data3 Modified").toString())
selenium.type("name=userDefined8", ("UDF8 Data3 Modified").toString())
selenium.type("name=billingCompanyname", ("My Company Modified").toString())
selenium.type("id=routingNumber", "055002707")
selenium.type("id=accountNumber", "44444444")
selenium.type("id=confirmAccountNumber", "44444444")
selenium.type("name=ein", "589698745")
selenium.type("name=billingAddress", ("15 Main street").toString())
selenium.type("name=billingAddress2", ("Building 5").toString())
selenium.type("id=billing-zip-input", "22201")
selenium.type("name=emailAddress", ("imtiazster@gmail.com").toString())
selenium.click("name=achSubmit")
selenium.waitForPageToLoad("30000")
//softAssertion.assertEquals("$20.00", selenium.getText("//tr[5]/td[3]"))
//softAssertion.assertEquals("UDF2 Data3 Modified", selenium.getText("//tr[7]/td[3]"))
//softAssertion.assertEquals("UDF3 Data3 Modified", selenium.getText("//tr[8]/td[3]"))
//softAssertion.assertEquals("Orange", selenium.getText("//tr[9]/td[3]"))
//softAssertion.assertEquals("Purple", selenium.getText("//tr[10]/td[3]"))
//softAssertion.assertEquals("UDF6 Data3 Modified", selenium.getText("//tr[11]/td[3]"))
//softAssertion.assertEquals("UDF7 Data3 Modified", selenium.getText("//tr[12]/td[3]"))
//softAssertion.assertEquals("UDF8 Data3 Modified", selenium.getText("//tr[13]/td[3]"))
//softAssertion.assertEquals("My Company Modified", selenium.getText("//tr[16]/td[3]"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[3]")', "2707"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[18]/td[3]")', '^exact:[\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]*4444$'), true)
//softAssertion.assertEquals("589698745", selenium.getText("//tr[19]/td[3]"))
//softAssertion.assertEquals("Corporate Checking", selenium.getText("//tr[20]/td[3]"))
//softAssertion.assertEquals("15 Main street", selenium.getText("//tr[21]/td[3]"))
//softAssertion.assertEquals("Building 5", selenium.getText("//tr[22]/td[3]"))
//softAssertion.assertEquals("United States", selenium.getText("//tr[23]/td[3]"))
//softAssertion.assertEquals("ARLINGTON", selenium.getText("//tr[24]/td[3]"))
//softAssertion.assertEquals("Virginia", selenium.getText("//tr[25]/td[3]"))
//softAssertion.assertEquals("22201", selenium.getText("//tr[26]/td[3]"))
//softAssertion.assertEquals("imtiazster@gmail.com", selenium.getText("//tr[28]/td[3]"))

WebUI.verifyTextPresent(("20.00"), true)
WebUI.verifyTextPresent(("UDF2 Data3 Modified"), true)
WebUI.verifyTextPresent(("UDF3 Data3 Modified"), true)
WebUI.verifyTextPresent(("Orange"), true)
WebUI.verifyTextPresent(("Purple"), true)
WebUI.verifyTextPresent(("UDF6 Data3 Modified"), true)
WebUI.verifyTextPresent(("UDF7 Data3 Modified"), true)
WebUI.verifyTextPresent(("UDF8 Data3 Modified"), true)
WebUI.verifyTextPresent(("My Company Modified"), true)
WebUI.verifyTextPresent(("2707"), true)
WebUI.verifyTextPresent(("4444"), true)
WebUI.verifyTextPresent(("589698745"), true)
WebUI.verifyTextPresent(("Corporate Checking"), true)
WebUI.verifyTextPresent(("15 Main street"), true)
WebUI.verifyTextPresent(("Building 5"), true)
WebUI.verifyTextPresent(("United States"), true)
WebUI.verifyTextPresent(("ARLINGTON"), true)
WebUI.verifyTextPresent(("Virginia"), true)
WebUI.verifyTextPresent(("22201"), true)
WebUI.verifyTextPresent(("imtiazster@gmail.com"), true)


selenium.click("name=confirmNotifyAction")
selenium.waitForPageToLoad("30000")
Thread.sleep(15000);
//softAssertion.assertEquals("$20.00", selenium.getText("//tr[14]/td[2]"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[16]/td[2]")', "4444.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[16]/td[2]")', "2707.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[16]/td[2]")', "My Company Modified.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[16]/td[2]")', "589698745.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "15 Main street.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "Building 5.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "United States.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "ARLINGTON.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "Virginia.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "22201.*"), true)

WebUI.verifyTextPresent(("20.00"), true)
WebUI.verifyTextPresent(("4444"), true)
WebUI.verifyTextPresent(("2707"), true)
WebUI.verifyTextPresent(("My Company Modified"), true)
WebUI.verifyTextPresent(("589698745"), true)
WebUI.verifyTextPresent(("15 Main street"), true)
WebUI.verifyTextPresent(("Building 5"), true)
WebUI.verifyTextPresent(("United States"), true)
WebUI.verifyTextPresent(("ARLINGTON"), true)
WebUI.verifyTextPresent(("Virginia"), true)
WebUI.verifyTextPresent(("22201"), true)

