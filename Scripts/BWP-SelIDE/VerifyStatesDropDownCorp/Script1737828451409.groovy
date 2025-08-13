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
selenium.click("xpath=(//input[@name='paymentMethod'])[3]")
selenium.click("css=input[type=\"submit\"]")
selenium.waitForPageToLoad("30000")
//softAssertion.assertEquals("--Select One-- Armed Forces Americas Armed Forces Europe Armed Forces Canada Armed Forces Africa Armed Forces Middle East Armed Forces Pacific Alabama Alaska American Samoa Arizona Arkansas California Colorado Connecticut Delaware District of Columbia Federated States of Micronesia Florida Georgia Guam Hawaii Idaho Illinois Indiana Iowa Kansas Kentucky Louisiana Maine Maryland Massachusetts Michigan Minnesota Mississippi Missouri Montana Nebraska Nevada New Hampshire New Jersey New Mexico New York North Carolina North Dakota Northern Mariana Islands Ohio Oklahoma Oregon Palau Pennsylvania Puerto Rico Rhode Island South Carolina South Dakota Tennessee Texas Utah Vermont Virgin Islands Virginia Washington West Virginia Wisconsin Wyoming Marshall Island", selenium.getText("id=billingState-select"))


WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_BWP/stateDropDown'), 'Arizona', false, 10)
WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_BWP/stateDropDown'), 'California', false, 10)
WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_BWP/stateDropDown'), 'Connecticut', false, 10)
WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_BWP/stateDropDown'), 'Massachusetts', false, 10)
WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_BWP/stateDropDown'), 'North Dakota', false, 10)
WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_BWP/stateDropDown'), 'Tennessee', false, 10)
WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_BWP/stateDropDown'), 'Pennsylvania', false, 10)


