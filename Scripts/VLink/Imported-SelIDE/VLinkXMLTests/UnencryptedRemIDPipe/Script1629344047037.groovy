
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

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('https://www.google.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
int ran1 = selenium.getEval("  " + "Math.round (Math.random() * 99999)").toInteger()
println(ran1)
int ran2 = selenium.getEval(" var ran1 = \"" + ran1 + "\";var storedVars = { 'ran1': ran1 }; " + "Math.round (Math.random() * 999)").toInteger()
println(ran2)
int ran3 = selenium.getEval(" var ran1 = \"" + ran1 + "\";var ran2 = \"" + ran2 + "\";var storedVars = { 'ran1': ran1,'ran2': ran2 }; " + "Math.round (Math.random() * 9999)").toInteger()
println(ran3)
println(ran1 + "|" + ran2 + "|" + ran3)
selenium.open("https://dev-algorithm.govolution.com/vlinktest/QA/version_2_0/authcap.html")
selenium.type("name=transaction_type", "104")
selenium.type("name=message_version", ("2.0C").toString())
selenium.type("name=remittance_id", (ran1 + "|" + ran2 + "|" + ran3).toString())
selenium.type("name=application_id", "234")
selenium.type("name=username", "username")
selenium.type("name=password", "password")
selenium.type("name=response_format", "fixed_width")
selenium.type("name=category", "RETL")
selenium.type("name=transaction_id", "")
selenium.type("name=approval_code", "")
selenium.type("name=card_name", ("Jon Latham").toString())
selenium.type("name=card_address", ("2311 york road").toString())
selenium.type("name=card_address2", "")
selenium.type("name=card_city", "Arlington")
selenium.type("name=card_state", "VA")
selenium.type("name=card_zip", "22201")
selenium.type("name=country_id", "")
selenium.type("name=amount", ("3.00").toString())
selenium.type("name=card_number", "")
selenium.type("name=card_exmo", "")
selenium.type("name=card_exyr", "")
selenium.type("name=cvv_data", "")
selenium.type("name=cvv_state", "")
selenium.type("name=track_data", ("%B4012000033330026^FDMS TEST CARD&nbsp;&nbsp;&nbsp;/VISA^251210054321000000000000000&nbsp;&nbsp;150&nbsp;&nbsp;A?;4012000033330026=25121011000012345678?").toString())
selenium.type("name=track_1_data", "")
selenium.type("name=track_2_data", "")
selenium.type("name=entry_mode", "track")
selenium.type("name=email", "")
selenium.type("name=order_number", "")
selenium.type("name=tax_amount", "")
selenium.type("name=charge_description", "")
selenium.type("name=client_account_number", "")
selenium.type("name=bill_payment_indicator", "")
selenium.type("name=user_defined1", "")
selenium.type("name=user_defined2", "")
selenium.type("name=user_defined3", "")
selenium.type("name=user_defined4", "")
selenium.type("name=user_defined5", "")
selenium.type("name=user_defined6", "")
selenium.type("name=user_defined7", "")
selenium.type("name=user_defined8", "")
selenium.type("name=user_defined9", "")
selenium.type("name=user_defined10", "")
selenium.click("css=input[type=\"submit\"]")

Thread.sleep(2000)

selenium.waitForPageToLoad("30000")
softAssertion.assertEquals(selenium.isTextPresent("Transaction approved, no errors"), true)
WebUI.verifyTextPresent(("Transaction approved, no errors"), true)
String resText = selenium.getText("css=pre")
println(resText)
String tranID = selenium.getEval(" var ran1 = \"" + ran1 + "\";var ran2 = \"" + ran2 + "\";var ran3 = \"" + ran3 + "\";var resText = \"" + resText + "\";var storedVars = { 'ran1': ran1,'ran2': ran2,'ran3': ran3,'resText': resText }; " + "storedVars['resText'].substring(19,28).trim()")
println(tranID)


