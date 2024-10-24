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
'Generated date: 11-Jul-2023 07:30:01 PM'
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

"click | id=User_Reports |  | "
selenium.click("id=User_Reports")

"pause | 2000 |  | "
Thread.sleep("2000")

"click | link=User Summary Report |  | "
selenium.click("link=User Summary Report")

"pause | 2000 |  | "
Thread.sleep("2000")

"verifyText | css=h2 | User Summary Report | "
verifyEquals("User Summary Report", selenium.getText("css=h2"))

"verifyText | css=#ou > p | Step 1: Please choose the start and end date. | "
verifyEquals("Step 1: Please choose the start and end date.", selenium.getText("css=#ou > p"))

"verifyText | css=label | Start Date and Time: | "
verifyEquals("Start Date and Time:", selenium.getText("css=label"))

"verifyText | //form[@id='ou']/label[2] | End Date and Time: | "
verifyEquals("End Date and Time:", selenium.getText("//form[@id='ou']/label[2]"))

"verifyElementPresent | id=startD |  | "
verifyTrue(selenium.isElementPresent("id=startD"))

"verifyElementPresent | id=endD |  | "
verifyTrue(selenium.isElementPresent("id=endD"))

"verifyElementPresent | id=cal-button-1 |  | "
verifyTrue(selenium.isElementPresent("id=cal-button-1"))

"verifyElementPresent | id=cal-button-2 |  | "
verifyTrue(selenium.isElementPresent("id=cal-button-2"))

"verifyText | id=ou | regexp:The Date Range are displayed in PDT.* | "
verifyTrue(selenium.getText("id=ou").matches("regexp:The Date Range are displayed in PDT..*"))

"verifyElementPresent | id=continuebutton |  | "
verifyTrue(selenium.isElementPresent("id=continuebutton"))

"verifyElementPresent | id=continuebutton |  | "
verifyTrue(selenium.isElementPresent("id=continuebutton"))

"click | id=User_Reports |  | "
selenium.click("id=User_Reports")

"pause | 2000 |  | "
Thread.sleep("2000")

"click | link=User Transaction Detail Report |  | "
selenium.click("link=User Transaction Detail Report")

"pause | 2000 |  | "
Thread.sleep("2000")

"verifyText | css=h2 | User Transaction Detail Report | "
verifyEquals("User Transaction Detail Report", selenium.getText("css=h2"))

"verifyText | css=#ou > p | Step 1: Please choose the start and end date. | "
verifyEquals("Step 1: Please choose the start and end date.", selenium.getText("css=#ou > p"))

"verifyText | css=label | Start Date and Time: | "
verifyEquals("Start Date and Time:", selenium.getText("css=label"))

"verifyText | //form[@id='ou']/label[2] | End Date and Time: | "
verifyEquals("End Date and Time:", selenium.getText("//form[@id='ou']/label[2]"))

"verifyElementPresent | id=startD |  | "
verifyTrue(selenium.isElementPresent("id=startD"))

"verifyElementPresent | id=endD |  | "
verifyTrue(selenium.isElementPresent("id=endD"))

"verifyElementPresent | id=cal-button-1 |  | "
verifyTrue(selenium.isElementPresent("id=cal-button-1"))

"verifyElementPresent | id=cal-button-2 |  | "
verifyTrue(selenium.isElementPresent("id=cal-button-2"))

"verifyText | id=ou | regexp:The Date Range are displayed in PDT.* | "
verifyTrue(selenium.getText("id=ou").matches("regexp:The Date Range are displayed in PDT..*"))

"verifyElementPresent | id=continuebutton |  | "
verifyTrue(selenium.isElementPresent("id=continuebutton"))

"verifyElementPresent | id=continuebutton |  | "
verifyTrue(selenium.isElementPresent("id=continuebutton"))

"click | id=User_Reports |  | "
selenium.click("id=User_Reports")

"pause | 2000 |  | "
Thread.sleep("2000")

"click | link=User Transaction Summary By Application Report |  | "
selenium.click("link=User Transaction Summary By Application Report")

"pause | 2000 |  | "
Thread.sleep("2000")

"verifyText | css=h2 | User Transaction Summary By Application Report | "
verifyEquals("User Transaction Summary By Application Report", selenium.getText("css=h2"))

"verifyText | css=#ou > p | Step 1: Please choose customers. | "
verifyEquals("Step 1: Please choose customers.", selenium.getText("css=#ou > p"))

"verifyText | css=h3 | Customer List | "
verifyEquals("Customer List", selenium.getText("css=h3"))

"verifyText | css=td | regexp:Available.* | "
verifyTrue(selenium.getText("css=td").matches("regexp:Available..*"))

"verifyElementPresent | name=availableParentCustomerIds |  | "
verifyTrue(selenium.isElementPresent("name=availableParentCustomerIds"))

"verifyElementPresent | name=right |  | "
verifyTrue(selenium.isElementPresent("name=right"))

"verifyElementPresent | xpath=(//input[@name='right'])[2] |  | "
verifyTrue(selenium.isElementPresent("xpath=(//input[@name='right'])[2]"))

"verifyElementPresent | name=left |  | "
verifyTrue(selenium.isElementPresent("name=left"))

"verifyElementPresent | xpath=(//input[@name='left'])[2] |  | "
verifyTrue(selenium.isElementPresent("xpath=(//input[@name='left'])[2]"))

"verifyText | //form[@id='ou']/table/tbody/tr[2]/td[3] | exact:Selected: | "
verifyEquals("exact:Selected:", selenium.getText("//form[@id='ou']/table/tbody/tr[2]/td[3]"))

"verifyText | //form[@id='ou']/p[2] | Step 2: Please choose the start and end date. | "
verifyEquals("Step 2: Please choose the start and end date.", selenium.getText("//form[@id='ou']/p[2]"))

"verifyText | css=label | Start Date and Time: | "
verifyEquals("Start Date and Time:", selenium.getText("css=label"))

"verifyText | //form[@id='ou']/label[2] | End Date and Time: | "
verifyEquals("End Date and Time:", selenium.getText("//form[@id='ou']/label[2]"))

"verifyElementPresent | id=startD |  | "
verifyTrue(selenium.isElementPresent("id=startD"))

"verifyElementPresent | id=endD |  | "
verifyTrue(selenium.isElementPresent("id=endD"))

"verifyElementPresent | id=cal-button-1 |  | "
verifyTrue(selenium.isElementPresent("id=cal-button-1"))

"verifyElementPresent | id=cal-button-2 |  | "
verifyTrue(selenium.isElementPresent("id=cal-button-2"))

"verifyText | id=ou | regexp:Step 1: Please choose customers.* | "
verifyTrue(selenium.getText("id=ou").matches("regexp:Step 1: Please choose customers..*"))

"verifyElementPresent | id=continuebutton |  | "
verifyTrue(selenium.isElementPresent("id=continuebutton"))

"verifyElementPresent | id=continuebutton |  | "
verifyTrue(selenium.isElementPresent("id=continuebutton"))

"click | id=User_Reports |  | "
selenium.click("id=User_Reports")

"pause | 2000 |  | "
Thread.sleep("2000")

"click | link=User Transaction Summary By Tender Type Report |  | "
selenium.click("link=User Transaction Summary By Tender Type Report")

"pause | 2000 |  | "
Thread.sleep("2000")

"verifyText | css=h2 | User Transaction Summary By Tender Type Report | "
verifyEquals("User Transaction Summary By Tender Type Report", selenium.getText("css=h2"))

"verifyText | css=#ou > p | Step 1: Please choose customers. | "
verifyEquals("Step 1: Please choose customers.", selenium.getText("css=#ou > p"))

"verifyText | css=h3 | Customer List | "
verifyEquals("Customer List", selenium.getText("css=h3"))

"verifyText | css=td | regexp:Available.* | "
verifyTrue(selenium.getText("css=td").matches("regexp:Available..*"))

"verifyElementPresent | name=availableParentCustomerIds |  | "
verifyTrue(selenium.isElementPresent("name=availableParentCustomerIds"))

"verifyElementPresent | name=right |  | "
verifyTrue(selenium.isElementPresent("name=right"))

"verifyElementPresent | xpath=(//input[@name='right'])[2] |  | "
verifyTrue(selenium.isElementPresent("xpath=(//input[@name='right'])[2]"))

"verifyElementPresent | name=left |  | "
verifyTrue(selenium.isElementPresent("name=left"))

"verifyElementPresent | xpath=(//input[@name='left'])[2] |  | "
verifyTrue(selenium.isElementPresent("xpath=(//input[@name='left'])[2]"))

"verifyText | //form[@id='ou']/table/tbody/tr[2]/td[3] | exact:Selected: | "
verifyEquals("exact:Selected:", selenium.getText("//form[@id='ou']/table/tbody/tr[2]/td[3]"))

"verifyText | //form[@id='ou']/p[2] | Step 2: Please choose the start and end date. | "
verifyEquals("Step 2: Please choose the start and end date.", selenium.getText("//form[@id='ou']/p[2]"))

"verifyText | css=label | Start Date and Time: | "
verifyEquals("Start Date and Time:", selenium.getText("css=label"))

"verifyText | //form[@id='ou']/label[2] | End Date and Time: | "
verifyEquals("End Date and Time:", selenium.getText("//form[@id='ou']/label[2]"))

"verifyElementPresent | id=startD |  | "
verifyTrue(selenium.isElementPresent("id=startD"))

"verifyElementPresent | id=endD |  | "
verifyTrue(selenium.isElementPresent("id=endD"))

"verifyElementPresent | id=cal-button-1 |  | "
verifyTrue(selenium.isElementPresent("id=cal-button-1"))

"verifyElementPresent | id=cal-button-2 |  | "
verifyTrue(selenium.isElementPresent("id=cal-button-2"))

"verifyText | id=ou | regexp:The Date Range are displayed in PDT.* | "
verifyTrue(selenium.getText("id=ou").matches("regexp:The Date Range are displayed in PDT..*"))

"verifyElementPresent | id=continuebutton |  | "
verifyTrue(selenium.isElementPresent("id=continuebutton"))

"verifyElementPresent | id=continuebutton |  | "
verifyTrue(selenium.isElementPresent("id=continuebutton"))

"click | link=Logout |  | "
selenium.click("link=Logout")
