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
'Generated date: 11-Jul-2023 07:29:40 PM'
'File path: C:\\Users\\imtiaz\\Documents\\Sel-New\\Prod-AdminSuite-NonBootstrap\\Prod-AdminSuite-NonBootstrap.side'
'Generated by: iahmed@govolution.com'
'----------------------------------------------------'

String baseUrl = "https://www.velocitypayment.com/admin/testcustomer"

WebUI.openBrowser('')

WebUI.maximizeWindow()

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

"open | https://www.velocitypayment.com/admin/testcustomer |  | "
selenium.open("https://www.velocitypayment.com/admin/testcustomer")



"type | id=okta-signin-username | iahmed | "
selenium.type("id=okta-signin-username", "iahmed")

"type | id=okta-signin-password | Hello!2222222 | "
selenium.type("id=okta-signin-password", "Hello!2222222")

"click | id=okta-signin-submit |  | "
selenium.click("id=okta-signin-submit")



"selectWindow | null |  | "
selenium.selectWindow("null")

"verifyText | link=Access User Management | Access User Management | "
verifyEquals("Access User Management", selenium.getText("link=Access User Management"))

"click | link=Access User Management |  | "
selenium.click("link=Access User Management")

"verifyElementPresent | id=input-username-find |  | "
verifyTrue(selenium.isElementPresent("id=input-username-find"))

"click | link=Dashboard |  | "
selenium.click("link=Dashboard")

"click | link=Access BBP Parking Fees GovTest |  | "
selenium.click("link=Access BBP Parking Fees GovTest")

"click | link=Logout |  | "
selenium.click("link=Logout")

"verifyText | css=div.login-content > p | You have successfully logged out. | "
verifyEquals("You have successfully logged out.", selenium.getText("css=div.login-content > p"))

"verifyElementPresent | link=here |  | "
verifyTrue(selenium.isElementPresent("link=here"))

"click | link=here |  | "
selenium.click("link=here")

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

"click | link=Access View All Reports |  | "
selenium.click("link=Access View All Reports")

"click | link=Logout |  | "
selenium.click("link=Logout")

"click | link=here |  | "
selenium.click("link=here")

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

"click | link=Access Customer Service Representative |  | "
selenium.click("link=Access Customer Service Representative")

"click | link=Logout |  | "
selenium.click("link=Logout")

"click | link=here |  | "
selenium.click("link=here")

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

"click | link=Logout |  | "
selenium.click("link=Logout")

"verifyText | css=div.login-content > p | You have successfully logged out. | "
verifyEquals("You have successfully logged out.", selenium.getText("css=div.login-content > p"))

"verifyElementPresent | link=here |  | "
verifyTrue(selenium.isElementPresent("link=here"))

"verifyText | css=p.login-warning | exact:NOTE: If your computer may be accessed by others, please close your browser to protect your information. | "
verifyEquals("exact:NOTE: If your computer may be accessed by others, please close your browser to protect your information.", selenium.getText("css=p.login-warning"))