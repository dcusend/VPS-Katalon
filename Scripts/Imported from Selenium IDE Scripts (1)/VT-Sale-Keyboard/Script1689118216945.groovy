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
'Generated date: 11-Jul-2023 07:30:16 PM'
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

"click | link=Access BWP License Fees GovTest |  | "
selenium.click("link=Access BWP License Fees GovTest")

"pause | 2000 |  | "
Thread.sleep("2000")

"click | link=Authorization & Capture (Sale) - Keyboard Entry |  | "
selenium.click("link=Authorization & Capture (Sale) - Keyboard Entry")

"pause | 2000 |  | "
Thread.sleep("2000")

"type | id=clientAcctNumber | 33333101 | "
selenium.type("id=clientAcctNumber", "33333101")

"type | id=card_name | Jason Holder | "
selenium.type("id=card_name", "Jason Holder")

"type | id=address | 45 Marina Drive | "
selenium.type("id=address", "45 Marina Drive")

"type | id=address2 |  | "
selenium.type("id=address2", "")

"type | id=zip | 22201 | "
selenium.type("id=zip", "22201")

"type | id=cardNumber | 4111111111111111 | "
selenium.type("id=cardNumber", "4111111111111111")

"select | name=cardExpMonth | 10 | "
selenium.select("name=cardExpMonth", "10")

"select | name=cardExpYear | 2025 | "
selenium.select("name=cardExpYear", "2025")

"select | id=transactionCategory | label=Mail Order/Telephone Order | "
selenium.select("id=transactionCategory", "label=Mail Order/Telephone Order")

"type | id=amount | 1.50 | "
selenium.type("id=amount", "1.50")

"type | id=emailAddressText |  | "
selenium.type("id=emailAddressText", "")

"type | id=userDefined1 | udf1 | "
selenium.type("id=userDefined1", "udf1")

"type | id=userDefined2 | udf2 | "
selenium.type("id=userDefined2", "udf2")

"type | id=userDefined3 | udf3 | "
selenium.type("id=userDefined3", "udf3")

"type | id=userDefined4 | udf4 | "
selenium.type("id=userDefined4", "udf4")

"type | id=userDefined5 | udf5 | "
selenium.type("id=userDefined5", "udf5")

"type | id=userDefined6 | udf6 | "
selenium.type("id=userDefined6", "udf6")

"pause | 4000 |  | "
Thread.sleep("4000")

"click | id=submit1 |  | "
selenium.click("id=submit1")

"pause | 2000 |  | "
Thread.sleep("2000")

"verifyText | css=#maincontent-2col > h3 | Transaction Successful | "
verifyEquals("Transaction Successful", selenium.getText("css=#maincontent-2col > h3"))

"verifyText | id=maincontent-2col | regexp:The transaction has been successfully processed.* | "
verifyTrue(selenium.getText("id=maincontent-2col").matches("regexp:The transaction has been successfully processed..*"))

"verifyText | id=maincontent-2col | regexp:To print a receipt, please&nbsp;&nbsp;click here.* | "
verifyTrue(selenium.getText("id=maincontent-2col").matches("regexp:To print a receipt, please&nbsp;&nbsp;click here..*"))

"verifyElementPresent | link=click here |  | "
verifyTrue(selenium.isElementPresent("link=click here"))

"verifyElementPresent | xpath=(//a[contains(text(),'click here')])[2] |  | "
verifyTrue(selenium.isElementPresent("xpath=(//a[contains(text(),'click here')])[2]"))

"click | link=Logout |  | "
selenium.click("link=Logout")

"pause | 2000 |  | "
Thread.sleep("2000")
