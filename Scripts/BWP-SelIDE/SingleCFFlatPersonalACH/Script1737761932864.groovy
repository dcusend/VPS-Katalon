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
selenium.click("xpath=(//input[@name='paymentMethod'])[2]")
selenium.click("css=input[type=\"submit\"]")
selenium.waitForPageToLoad("30000")
selenium.type("id=billing-zip-input", "22201")
selenium.type("name=amount", ("10.00").toString())
selenium.type("name=userDefined2", ("udf2 data").toString())
selenium.type("name=userDefined3", ("udf3 data").toString())
selenium.type("name=userDefined5", ("udf5 data").toString())
selenium.type("name=userDefined6", ("udf6 data").toString())
selenium.type("name=userDefined8", ("udf8 data").toString())
selenium.type("name=billingFirstname", "Nicole")
selenium.type("name=billingLastname", "Chloe")
selenium.type("id=routingNumber", "256072691")
selenium.type("id=accountNumber", "11111111")
selenium.type("id=confirmAccountNumber", "11111111")
selenium.click("name=accountType")
selenium.type("name=billingAddress", ("2311 york road").toString())
selenium.type("name=billingAddress2", ("suite 600").toString())
selenium.click("id=checkedAcceptCondition")
selenium.click("name=achSubmit")
selenium.waitForPageToLoad("30000")



//softAssertion.assertEquals("Please verify the following information:", selenium.getText("css=span.vrelay-header"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)


WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)



selenium.click("name=confirmNotifyAction")
selenium.waitForPageToLoad("30000")




/*
 * //softAssertion.
 * assertEquals("This transaction is subject to a Convenience Fees of $1.00.",
 * selenium.getText("css=p")) softAssertion.assertEquals("Payment Amount:",
 * selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr/td/table/tbody/tr/td[2]"
 * )) //softAssertion.assertEquals("$10.00", selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr/td/table/tbody/tr/td[3]"
 * )) softAssertion.assertEquals("Convenience Fees:", selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr/td/table/tbody/tr[2]/td[2]"
 * )) //softAssertion.assertEquals("$1.00", selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr/td/table/tbody/tr[2]/td[3]"
 * )) softAssertion.assertEquals("Total Amount:", selenium.getText("css=b"))
 * //softAssertion.assertEquals("$11.00", selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr/td/table/tbody/tr[4]/td[3]/b"
 * )) //softAssertion.
 * assertEquals("One transaction in the amount of $11.00 will appear on your bank statement."
 * , selenium.getText(
 * "//div[@id='main-focus']/div/center/form/table/tbody/tr/td/p[2]"))
 */

WebUI.verifyTextPresent(("Payment Amount:"), true)
WebUI.verifyTextPresent(("Convenience Fees:"), true)
WebUI.verifyTextPresent(("Total Amount:"), true)




selenium.click("name=convFeeNotifyAction")
selenium.waitForPageToLoad("30000")
Thread.sleep(20000);




/*
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "Amount:.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "10.00.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "Convenience Fees:.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "1.00.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "Convenience Fees Type:.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "Single Transaction.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "Total Amount:.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("css=center")',
 * "11.00.*"), true)
 */


WebUI.verifyTextPresent(("Successful Payment Receipt"), true)
WebUI.verifyTextPresent(("Amount:.*"), true)
WebUI.verifyTextPresent(("10.00.*"), true)
WebUI.verifyTextPresent(("Convenience Fees:.*"), true)
WebUI.verifyTextPresent(("1.00.*"), true)
WebUI.verifyTextPresent(("Convenience Fees Type:.*"), true)
WebUI.verifyTextPresent(("Single Transaction.*"), true)
WebUI.verifyTextPresent(("Total Amount:.*"), true)
WebUI.verifyTextPresent(("11.00.*"), true)





