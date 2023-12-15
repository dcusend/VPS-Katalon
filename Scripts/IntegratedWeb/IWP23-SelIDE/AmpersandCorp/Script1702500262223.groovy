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
println("Begin Test: AmpersandCorp")
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
selenium.click("xpath=(//input[@name='paymentMethod'])[3]")
selenium.click("css=input[type=\"submit\"]")
selenium.waitForPageToLoad("30000")
selenium.type("name=amount", ("10.50").toString())
selenium.type("name=userDefined2", ("udf2 data").toString())
selenium.type("name=userDefined3", ("udf3 data").toString())
selenium.select("name=variableField4DropdownGroupItemID", "label=Purple")
selenium.select("name=variableField5DropdownGroupItemID", "label=Tennis")
selenium.type("name=billingCompanyname", ("CompName & Son MaintenanceA").toString())
selenium.type("id=routingNumber", "256072691")
selenium.type("id=accountNumber", "33333333")
selenium.type("id=confirmAccountNumber", "33333333")
selenium.type("name=ein", "123456789")
selenium.type("name=billingAddress", ("AddLine1 & Son Mai Johnson & Son Mai Johnson & S").toString())
selenium.type("name=billingAddress2", ("AddLine2 & Son Mai Johnson & Son Mai Johnson & S").toString())
selenium.type("id=billing-zip-input", "22201")
selenium.type("name=emailAddress", ("iahmed@govolution.com").toString())
selenium.click("id=checkedAcceptCondition")
selenium.click("name=achSubmit")
selenium.waitForPageToLoad("30000")

//softAssertion.assertEquals("Please verify the following information:", selenium.getText("css=span.vrelay-header"))
//softAssertion.assertEquals("$10.50", selenium.getText("css=td.payor_opt"))
//softAssertion.assertEquals("CompName & Son MaintenanceA", selenium.getText("//tr[11]/td[3]"))
//softAssertion.assertEquals("AddLine1 & Son Mai Johnson & Son Mai Johnson & S", selenium.getText("//tr[16]/td[3]"))
//softAssertion.assertEquals("AddLine2 & Son Mai Johnson & Son Mai Johnson & S", selenium.getText("//tr[17]/td[3]"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)

WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)
WebUI.verifyTextPresent(("\$10.50"), false)
WebUI.verifyTextPresent(("CompName & Son MaintenanceA"), true)
WebUI.verifyTextPresent(("AddLine1 & Son Mai Johnson & Son Mai Johnson & S"), true)
WebUI.verifyTextPresent(("AddLine2 & Son Mai Johnson & Son Mai Johnson & S"), true)

selenium.click("name=confirmNotifyAction")
selenium.waitForPageToLoad("30000")
Thread.sleep(8000);
//softAssertion.assertEquals("Successful Payment Receipt", selenium.getText("css=td > h2"))
//softAssertion.assertEquals("Please print this receipt for your records", selenium.getText("css=td > p"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=div.main_col")', "10.50.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=div.main_col")', "Debit.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=div.main_col")', "Corporate.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=div.main_col")', "Checking.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=div.main_col")', "CompName & Son MaintenanceA.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=div.main_col")', "AddLine1 & Son Mai Johnson & Son Mai Johnson & S.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=div.main_col")', "AddLine2 & Son Mai Johnson & Son Mai Johnson & S.*"), true)

WebUI.verifyTextPresent(("Successful Payment Receipt"), true)
WebUI.verifyTextPresent(("Please print this receipt for your records"), true)
WebUI.verifyTextPresent(("\$10.50"), false)
WebUI.verifyTextPresent(("Debit"), true)
WebUI.verifyTextPresent(("Corporate"), true)
WebUI.verifyTextPresent(("Checking"), true)
WebUI.verifyTextPresent(("CompName & Son MaintenanceA"), true)
WebUI.verifyTextPresent(("AddLine1 & Son Mai Johnson & Son Mai Johnson & S"), true)
WebUI.verifyTextPresent(("AddLine2 & Son Mai Johnson & Son Mai Johnson & S"), true)

println("End Test: AmpersandCorp")
