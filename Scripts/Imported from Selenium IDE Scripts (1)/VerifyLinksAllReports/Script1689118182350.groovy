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
'Generated date: 11-Jul-2023 07:29:42 PM'
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

"click | link=Access View All Reports |  | "
selenium.click("link=Access View All Reports")

"pause | 2000 |  | "
Thread.sleep("2000")

"click | id=allr |  | "
selenium.click("id=allr")

"pause | 2000 |  | "
Thread.sleep("2000")

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

"verifyElementPresent | link=Active Payment Plan Report |  | "
verifyTrue(selenium.isElementPresent("link=Active Payment Plan Report"))

"verifyElementPresent | link=Auto Pay Enrollments Report |  | "
verifyTrue(selenium.isElementPresent("link=Auto Pay Enrollments Report"))

"verifyElementPresent | link=Bill Statistics Report |  | "
verifyTrue(selenium.isElementPresent("link=Bill Statistics Report"))

"verifyElementPresent | link=Customer Profiles Report |  | "
verifyTrue(selenium.isElementPresent("link=Customer Profiles Report"))

"verifyElementPresent | link=Download Report |  | "
verifyTrue(selenium.isElementPresent("link=Download Report"))

"verifyElementPresent | link=Enterprise Transaction Summary Report by Payment Channel |  | "
verifyTrue(selenium.isElementPresent("link=Enterprise Transaction Summary Report by Payment Channel"))

"verifyElementPresent | link=Enterprise Transaction Summary By Tender Type Report |  | "
verifyTrue(selenium.isElementPresent("link=Enterprise Transaction Summary By Tender Type Report"))

"verifyElementPresent | link=Enterprise Transaction Summary Report |  | "
verifyTrue(selenium.isElementPresent("link=Enterprise Transaction Summary Report"))

"verifyElementPresent | link=Exceptions Report |  | "
verifyTrue(selenium.isElementPresent("link=Exceptions Report"))

"verifyElementPresent | link=File Upload Report |  | "
verifyTrue(selenium.isElementPresent("link=File Upload Report"))

"verifyElementPresent | link=Online Check Returns Report |  | "
verifyTrue(selenium.isElementPresent("link=Online Check Returns Report"))

"verifyElementPresent | link=Parcels Report |  | "
verifyTrue(selenium.isElementPresent("link=Parcels Report"))

"verifyElementPresent | link=Payment Account Activity Report |  | "
verifyTrue(selenium.isElementPresent("link=Payment Account Activity Report"))

"verifyElementPresent | link=Payment Tender Activity Report |  | "
verifyTrue(selenium.isElementPresent("link=Payment Tender Activity Report"))

"verifyElementPresent | link=Posting File Report |  | "
verifyTrue(selenium.isElementPresent("link=Posting File Report"))

"verifyElementPresent | link=QuickBooks Integration |  | "
verifyTrue(selenium.isElementPresent("link=QuickBooks Integration"))

"verifyElementPresent | link=Role History Report |  | "
verifyTrue(selenium.isElementPresent("link=Role History Report"))

"verifyElementPresent | link=Scheduled Payments Report |  | "
verifyTrue(selenium.isElementPresent("link=Scheduled Payments Report"))

"verifyElementPresent | link=Settlement Batch Activity Report |  | "
verifyTrue(selenium.isElementPresent("link=Settlement Batch Activity Report"))

"verifyElementPresent | link=Transaction Activity Report |  | "
verifyTrue(selenium.isElementPresent("link=Transaction Activity Report"))

"verifyElementPresent | link=Transaction Summary Report |  | "
verifyTrue(selenium.isElementPresent("link=Transaction Summary Report"))

"verifyElementPresent | link=User Actions Report |  | "
verifyTrue(selenium.isElementPresent("link=User Actions Report"))

"verifyElementPresent | link=User History Report |  | "
verifyTrue(selenium.isElementPresent("link=User History Report"))

"verifyElementPresent | link=User Summary Report |  | "
verifyTrue(selenium.isElementPresent("link=User Summary Report"))

"verifyElementPresent | link=User Transaction Detail Report |  | "
verifyTrue(selenium.isElementPresent("link=User Transaction Detail Report"))

"verifyElementPresent | link=User Transaction Summary By Application Report |  | "
verifyTrue(selenium.isElementPresent("link=User Transaction Summary By Application Report"))

"verifyElementPresent | link=User Transaction Summary By Tender Type Report |  | "
verifyTrue(selenium.isElementPresent("link=User Transaction Summary By Tender Type Report"))

"click | link=Logout |  | "
selenium.click("link=Logout")