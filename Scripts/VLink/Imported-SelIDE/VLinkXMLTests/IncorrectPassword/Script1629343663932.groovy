

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
selenium.open("https://dev-algorithm.govolution.com/vlinktest/QA/version_2_0/authcap.html")
selenium.type("name=transaction_type", "104")
selenium.type("name=message_version", ("2.0C").toString())
//String remID = selenium.getEval("  " + "Date.now")
//selenium.type("name=remittance_id", (remID).toString())

def genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
//WebUI.setText(findTestObject('Object Repository/VLink/Page_CCSale/txt_RemID'),genRemID)

WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Remittance Id_remittance_id'), genRemID)


selenium.type("name=application_id", "180")
selenium.type("name=username", "junit")
selenium.type("name=password", "hello")
selenium.type("name=response_format", "fixed_width")
selenium.type("name=category", "ECOM")
selenium.type("name=transaction_id", "")
selenium.type("name=approval_code", "")
selenium.type("name=card_name", ("John Smith").toString())
selenium.type("name=card_address", ("2311 york road").toString())
selenium.type("name=card_address2", "")
selenium.type("name=card_city", "Arlington")
selenium.type("name=card_state", "VA")
selenium.type("name=card_zip", "22201")
selenium.type("name=country_id", "")
selenium.type("name=amount", ("10.00").toString())
selenium.type("name=card_number", "4111111111111111")
selenium.type("name=card_exmo", "12")
selenium.type("name=card_exyr", "2029")
selenium.type("name=cvv_data", "")
selenium.type("name=cvv_state", "")
selenium.type("name=track_data", "")
selenium.type("name=track_1_data", "")
selenium.type("name=track_2_data", "")
selenium.type("name=entry_mode", "manual")
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
selenium.waitForPageToLoad("30000")

Thread.sleep(2000)

selenium.selectWindow("null")
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=pre")', ".*Signon authentication error.*"), true)
WebUI.verifyTextPresent(("Signon authentication error."), true)
