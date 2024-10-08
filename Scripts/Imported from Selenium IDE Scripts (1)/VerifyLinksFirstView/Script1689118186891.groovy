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
'Generated date: 11-Jul-2023 07:29:46 PM'
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

"click | link=Access FirstView |  | "
selenium.click("link=Access FirstView")

"pause | 2000 |  | "
Thread.sleep("2000")

"verifyText | css=h1 | Online Reports | "
verifyEquals("Online Reports", selenium.getText("css=h1"))

"verifyElementPresent | id=Operational_Reports |  | "
verifyTrue(selenium.isElementPresent("id=Operational_Reports"))

"verifyElementPresent | id=Audit_Reports |  | "
verifyTrue(selenium.isElementPresent("id=Audit_Reports"))

"verifyElementPresent | id=User_Reports |  | "
verifyTrue(selenium.isElementPresent("id=User_Reports"))

"verifyElementPresent | id=allr |  | "
verifyTrue(selenium.isElementPresent("id=allr"))

"verifyElementPresent | link=Email Subscription |  | "
verifyTrue(selenium.isElementPresent("link=Email Subscription"))

"verifyElementPresent | link=FirstView |  | "
verifyTrue(selenium.isElementPresent("link=FirstView"))

"verifyElementPresent | link=Full Screen View |  | "
verifyTrue(selenium.isElementPresent("link=Full Screen View"))

"verifyElementPresent | id=UserName |  | "
verifyTrue(selenium.isElementPresent("id=UserName"))

"verifyElementPresent | id=Password |  | "
verifyTrue(selenium.isElementPresent("id=Password"))

"verifyElementPresent | id=RememberMe |  | "
verifyTrue(selenium.isElementPresent("id=RememberMe"))

"verifyElementPresent | link=Forgot Password |  | "
verifyTrue(selenium.isElementPresent("link=Forgot Password"))

"verifyElementPresent | link=Forgot Username |  | "
verifyTrue(selenium.isElementPresent("link=Forgot Username"))

"verifyElementPresent | css=input.btn.btn-default |  | "
verifyTrue(selenium.isElementPresent("css=input.btn.btn-default"))

"verifyElementPresent | link=New Account |  | "
verifyTrue(selenium.isElementPresent("link=New Account"))

"click | link=Logout |  | "
selenium.click("link=Logout")
