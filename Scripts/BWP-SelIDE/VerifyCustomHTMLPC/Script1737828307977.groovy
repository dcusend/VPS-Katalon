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
selenium.click("xpath=(//input[@name='paymentMethod'])[2]")
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
selenium.type("name=billingFirstname", "Mark")
selenium.type("name=billingLastname", "Zober")
selenium.type("id=routingNumber", "256072691")
selenium.type("id=accountNumber", "11111111")
selenium.type("id=confirmAccountNumber", "11111111")
selenium.click("name=accountType")
selenium.type("name=billingAddress", ("2311 york road").toString())
selenium.type("name=billingAddress2", ("suite 600").toString())
selenium.type("name=emailAddress", ("iahmed@govolution.com").toString())
selenium.click("id=checkedAcceptCondition")




//softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")', "This the ACH Custom HTML. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox.*"), true)
//softAssertion.assertEquals("This the ACH Custom HTML. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox.", selenium.getText("css=center > table > tbody > tr > td.payor_opt"))


WebUI.verifyTextPresent(("This the ACH Custom HTML. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox.*"), true)
WebUI.verifyTextPresent(("This the ACH Custom HTML. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox."), true)



selenium.click("name=achSubmit")
selenium.waitForPageToLoad("30000")



//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)
//softAssertion.assertEquals("This the ACH Custom HTML. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox.", selenium.getText("css=center > table > tbody > tr > td.payor_opt"))

WebUI.verifyTextPresent(("Is this information correct"), true)
WebUI.verifyTextPresent(("This the ACH Custom HTML. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox."), true)




selenium.click("name=confirmNotifyAction")
selenium.waitForPageToLoad("30000")
Thread.sleep(20000);



//softAssertion.assertEquals("Successful Payment Receipt", selenium.getText("css=h2"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=section")', '^exact:Thank you for your business\\. Questions[\\s\\S] Please contact Stein Sperling Vanessa L\\. Seward at 301-838-3248 or vseward@steinsperling\\.com\\.$'), true)

WebUI.verifyTextPresent(("Successful Payment Receipt"), true)
WebUI.verifyTextPresent(("Thank you for your business"), true)
WebUI.verifyTextPresent(("Please contact Stein Sperling Vanessa"), true)


