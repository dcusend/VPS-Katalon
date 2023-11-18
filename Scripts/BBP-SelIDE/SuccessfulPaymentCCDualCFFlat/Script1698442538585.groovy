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

dCFBBPURL = GlobalVariable.DCFBBPURL
selenium.open(dCFBBPURL)


//selenium.open("/vbillslookup/lookup/testvbillsautodcf")
selenium.type("id=field1", "101110")
selenium.type("id=field2", "101111")
selenium.click("name=Test")
Thread.sleep(2000);
selenium.click("name=paysubmit")
selenium.waitForPageToLoad("30000")
selenium.click("name=paymentMethod")
selenium.click("css=input[type=\"submit\"]")
selenium.waitForPageToLoad("30000")
selenium.type("name=amount", ("10.00").toString())
selenium.type("name=userDefined2", ("UDF2 Data1").toString())
selenium.type("name=userDefined3", ("UDF3 Data1").toString())
selenium.type("name=userDefined5", ("UDF5 Data1").toString())
selenium.type("name=userDefined6", ("UDF6 Data1").toString())
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


selenium.click("name=confirmNotifyAction")
selenium.waitForPageToLoad("30000")
//softAssertion.assertEquals("This transaction is subject to a Convenience Fees of $2.00.", selenium.getText("css=td.payor_opt > p"))
//softAssertion.assertEquals("Payment Amount:", selenium.getText("//td[2]"))
//softAssertion.assertEquals("$10.00", selenium.getText("//td[3]"))
//softAssertion.assertEquals("Convenience Fees:", selenium.getText("//tr[2]/td[2]"))
//softAssertion.assertEquals("$2.00", selenium.getText("//tr[2]/td[3]"))
//softAssertion.assertEquals("Total Amount:", selenium.getText("css=b"))
//softAssertion.assertEquals("$12.00", selenium.getText("//td[3]/b"))
//softAssertion.assertEquals("Two transactions will appear on your bank statement, one in the amount of $10.00 and one in the amount of $2.00.", selenium.getText("//td/p[2]"))
	
WebUI.verifyTextPresent(("This transaction is subject to a Convenience Fees of \$2.00."), false)
WebUI.verifyTextPresent(("Payment Amount:"), true)
WebUI.verifyTextPresent(("\$10.00"), false)
WebUI.verifyTextPresent(("Convenience Fees:"), true)
WebUI.verifyTextPresent(("\$2.00"), false)
WebUI.verifyTextPresent(("Total Amount:"), true)
WebUI.verifyTextPresent(("\$12.00"), false)
WebUI.verifyTextPresent(("Two transactions will appear on your bank statement, one in the amount of \$10.00 and one in the amount of \$2.00."), false)

	
	

selenium.click("name=convFeeNotifyAction")
selenium.waitForPageToLoad("30000")
Thread.sleep(15000);
//softAssertion.assertEquals("$10.00", selenium.getText("//tr[12]/td[2]"))
//softAssertion.assertEquals("$2.00", selenium.getText("//tr[13]/td[2]"))
//softAssertion.assertEquals("Dual Transaction", selenium.getText("//tr[14]/td[2]"))
//softAssertion.assertEquals("$12.00", selenium.getText("//tr[16]/td[2]"))
//softAssertion.assertEquals("Authorization and Capture", selenium.getText("//tr[17]/td[2]"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[18]/td[2]")', "Visa.*"), true)

WebUI.verifyTextPresent(("\$10.00"), false)
WebUI.verifyTextPresent(("\$2.00"), false)
WebUI.verifyTextPresent(("Dual Transaction"), true)
WebUI.verifyTextPresent(("\$12.00"), false)
WebUI.verifyTextPresent(("Authorization and Capture"), true)
WebUI.verifyTextPresent(("Visa"), true)


