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

selenium.type("name=application_id", "627")
selenium.type("name=message_version", ("1.5").toString())


//selenium.type("name=remittance_id", "sdfsdfsdfsdf")
def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
selenium.type("name=remittance_id", genRemIDVoid)


selenium.type("name=amount", ("20.00").toString())
selenium.type("name=taxAmount", ("1.59").toString())
selenium.type("name=clientAccountNumber", "abcdefr")
selenium.type("name=user_defined1", ("udf1 Cañon data").toString())
selenium.type("name=user_defined2", ("udf2 Cañon data Hello").toString())
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
selenium.type("name=userDefined2", ("udf2 data").toString())
selenium.type("name=userDefined3", ("udf3 Cañon data").toString())
selenium.type("name=userDefined5", ("udf5 data").toString())
selenium.type("name=userDefined6", ("udf6 data").toString())
selenium.type("name=userDefined8", ("udf8 data").toString())
selenium.type("name=billingName", ("Mark Cañon").toString())
selenium.type("id=cardNumber", "4111111111111111")
selenium.select("name=cardExpMonth", "label=04")
selenium.select("name=cardExpYear", "label=2025")
selenium.type("name=billingAddress", ("2311 york Cañon road").toString())
selenium.type("name=billingAddress2", ("suite Cañon 600").toString())
selenium.click("id=checkedAcceptCondition")
selenium.click("name=ccSubmit")
selenium.waitForPageToLoad("30000")




/*
 * softAssertion.assertEquals("udf1 Cañon data", selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr[3]/td[3]"))
 * softAssertion.assertEquals("udf3 Cañon data", selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr[5]/td[3]"))
 * softAssertion.assertEquals("Mark Cañon", selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr[13]/td[3]"))
 * softAssertion.assertEquals("2311 york Cañon road", selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr[19]/td[3]"))
 * softAssertion.assertEquals("suite Cañon 600", selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr[20]/td[3]"))
 * softAssertion.assertEquals(Pattern.matches('selenium.getText(
 * "css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)
 */


WebUI.verifyTextPresent(("udf1 Cañon data"), true)
WebUI.verifyTextPresent(("udf3 Cañon data"), true)
WebUI.verifyTextPresent(("Mark Cañon"), true)
WebUI.verifyTextPresent(("2311 york Cañon road"), true)
WebUI.verifyTextPresent(("suite Cañon 600"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)



selenium.click("name=confirmNotifyAction")
selenium.waitForPageToLoad("30000")
selenium.click("name=convFeeNotifyAction")
selenium.waitForPageToLoad("30000")
Thread.sleep(20000);



//softAssertion.assertEquals("udf1 Cañon data", selenium.getText("//div[@id='main-focus']/div/center/table/tbody/tr[4]/td[2]"))
//softAssertion.assertEquals("udf3 Cañon data", selenium.getText("//div[@id='main-focus']/div/center/table/tbody/tr[6]/td[2]"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")', "MARK CAÑON.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//div[@id='main-focus']/div/center/table/tbody/tr[18]/td[2]")', "2311 york Cañon road.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//div[@id='main-focus']/div/center/table/tbody/tr[18]/td[2]")', "suite Cañon 600.*"), true)


WebUI.verifyTextPresent(("udf1 Cañon data"), true)
WebUI.verifyTextPresent(("udf3 Cañon data"), true)
WebUI.verifyTextPresent(("MARK CAÑON.*"), true)


