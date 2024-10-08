import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium
import static com.kms.katalon.core.webui.driver.KatalonWebDriverBackedSelenium.*

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.Keys
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import static org.junit.Assert.*
import java.util.concurrent.Callable
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

'----------------------------------------------------'
'This test case script is generated by Katalon Studio'
'Generated date: 11-Jul-2023 07:29:48 PM'
'File path: C:\\Users\\imtiaz\\Documents\\Sel-New\\Prod-AdminSuite-NonBootstrap\\Prod-AdminSuite-NonBootstrap.side'
'Generated by: iahmed@govolution.com'
'----------------------------------------------------'

String baseUrl = ""

WebUI.openBrowser('')

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

"open | https://www.velocitypayment.com/admin/testcustomer |  | "
selenium.open("https://www.velocitypayment.com/admin/testcustomer")

"pause | 2000 |  | "
Thread.sleep("2000")

"type | id=okta-signin-username | iahmed | "
selenium.type("id=okta-signin-username", "iahmed")

"type | id=okta-signin-password | Hello!2222222 | "
selenium.type("id=okta-signin-password", "Hello!2222222")

"click | id=okta-signin-submit |  | "
selenium.click("id=okta-signin-submit")

"pause | 2000 |  | "
Thread.sleep("2000")

"click | link=IVR Call Metrics |  | "
selenium.click("link=IVR Call Metrics")

"pause | 2000 |  | "
Thread.sleep("2000")

"verifyTitle | V-TPS - Main Menu [Test Customer] |  | "
verifyEquals("V-TPS - Main Menu [Test Customer]", selenium.getTitle())

"verifyText | css=label | exact:Customer: | "
verifyEquals("exact:Customer:", selenium.getText("css=label"))

"verifyElementPresent | id=customerId |  | "
verifyTrue(selenium.isElementPresent("id=customerId"))

"verifyText | //form[@id='reportForm']/label[2] | IVR Phone Number: | "
verifyEquals("IVR Phone Number:", selenium.getText("//form[@id='reportForm']/label[2]"))

"verifyElementPresent | id=ivrPhoneNumber |  | "
verifyTrue(selenium.isElementPresent("id=ivrPhoneNumber"))

"verifyText | //form[@id='reportForm']/label[3] | Start Date and Time: | "
verifyEquals("Start Date and Time:", selenium.getText("//form[@id='reportForm']/label[3]"))

"verifyElementPresent | id=startD |  | "
verifyTrue(selenium.isElementPresent("id=startD"))

"verifyElementPresent | id=cal-button-1 |  | "
verifyTrue(selenium.isElementPresent("id=cal-button-1"))

"verifyText | //form[@id='reportForm']/label[4] | End Date and Time: | "
verifyEquals("End Date and Time:", selenium.getText("//form[@id='reportForm']/label[4]"))

"verifyElementPresent | id=endD |  | "
verifyTrue(selenium.isElementPresent("id=endD"))

"verifyElementPresent | id=cal-button-2 |  | "
verifyTrue(selenium.isElementPresent("id=cal-button-2"))

"verifyElementPresent | //form[@id='reportForm']/label[5] |  | "
verifyTrue(selenium.isElementPresent("//form[@id='reportForm']/label[5]"))

"verifyText | id=timezone | PDT | "
verifyEquals("PDT", selenium.getText("id=timezone"))

"verifyElementPresent | id=submitButton |  | "
verifyTrue(selenium.isElementPresent("id=submitButton"))

"verifyElementPresent | id=resetButton |  | "
verifyTrue(selenium.isElementPresent("id=resetButton"))

"click | link=Logout |  | "
selenium.click("link=Logout")
