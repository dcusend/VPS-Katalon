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
'Generated date: 11-Jul-2023 04:22:51 PM'
'File path: C:\\Users\\imtiaz\\Documents\\Sel-New\\CPSVantivTSYSWWW\\Vlink-Prod.side'
'Generated by: iahmed@govolution.com'
'----------------------------------------------------'

String baseUrl = "https://dev-algorithm.govolution.com/vlinktest/"

WebUI.openBrowser('')

selenium = new KatalonWebDriverBackedSelenium(baseUrl)

"echo | Begin SaleFifthThirdFrame |  | "
System.out.println("Begin SaleFifthThirdFrame")

"open | Production/version_2_0/authcap.html |  | "
selenium.open("Production/version_2_0/authcap.html")

"type | name=transaction_type | 104 | "
selenium.type("name=transaction_type", "104")

"type | name=message_version | 2.0C | "
selenium.type("name=message_version", "2.0C")

def genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)

"type | name=remittance_id | remID | "
selenium.type("name=remittance_id", genRemID)

"type | name=application_id | 2248 | "
selenium.type("name=application_id", "2248")

"type | name=username | username | "
selenium.type("name=username", "username")

"type | name=password | password | "
selenium.type("name=password", "password")

"type | name=response_format | fixed_width | "
selenium.type("name=response_format", "fixed_width")

"type | name=category | ECOM | "
selenium.type("name=category", "ECOM")

"type | name=transaction_id |  | "
selenium.type("name=transaction_id", "")

"type | name=approval_code |  | "
selenium.type("name=approval_code", "")

"type | name=card_name | James Smith | "
selenium.type("name=card_name", "James Smith")

"type | name=card_address | 2000 14th Street N | "
selenium.type("name=card_address", "2000 14th Street N")

"type | name=card_address2 | Suite 600 | "
selenium.type("name=card_address2", "Suite 600")

"type | name=card_city | Arlington | "
selenium.type("name=card_city", "Arlington")

"type | name=card_state | VA | "
selenium.type("name=card_state", "VA")

"type | name=card_zip | 22201 | "
selenium.type("name=card_zip", "22201")

"type | name=country_id | 840 | "
selenium.type("name=country_id", "840")

"type | name=amount | 0.11 | "
selenium.type("name=amount", "0.11")

"type | name=card_number | 5567080011582646 | "
selenium.type("name=card_number", "5567080011582646")

"type | name=card_exmo | 03 | "
selenium.type("name=card_exmo", "03")

"type | name=card_exyr | 2026 | "
selenium.type("name=card_exyr", "2026")

"type | name=cvv_data |  | "
selenium.type("name=cvv_data", "")

"type | name=cvv_state |  | "
selenium.type("name=cvv_state", "")

"type | name=track_data |  | "
selenium.type("name=track_data", "")

"type | name=track_1_data |  | "
selenium.type("name=track_1_data", "")

"type | name=track_2_data |  | "
selenium.type("name=track_2_data", "")

"type | name=entry_mode | manual | "
selenium.type("name=entry_mode", "manual")

"type | name=email |  | "
selenium.type("name=email", "")

"type | name=order_number |  | "
selenium.type("name=order_number", "")

"type | name=tax_amount | 6.57 | "
selenium.type("name=tax_amount", "6.57")

"type | name=charge_description |  | "
selenium.type("name=charge_description", "")

"type | name=client_account_number | 852852 | "
selenium.type("name=client_account_number", "852852")

"type | name=bill_payment_indicator |  | "
selenium.type("name=bill_payment_indicator", "")

"type | name=user_defined1 | udf1 | "
selenium.type("name=user_defined1", "udf1")

"type | name=user_defined2 | udf2 | "
selenium.type("name=user_defined2", "udf2")

"type | name=user_defined3 | udf3 | "
selenium.type("name=user_defined3", "udf3")

"type | name=user_defined4 | udf4 | "
selenium.type("name=user_defined4", "udf4")

"type | name=user_defined5 | udf5 | "
selenium.type("name=user_defined5", "udf5")

"type | name=user_defined6 | udf6 | "
selenium.type("name=user_defined6", "udf6")

"type | name=user_defined7 | udf7 | "
selenium.type("name=user_defined7", "udf7")

"type | name=user_defined8 | udf8 | "
selenium.type("name=user_defined8", "udf8")

"type | name=user_defined9 | udf9 | "
selenium.type("name=user_defined9", "udf9")

"type | name=user_defined10 | udf10 | "
selenium.type("name=user_defined10", "udf10")

"click | css=input[type=submit] |  | "
selenium.click("css=input[type='submit']")

"pause | 2000 |  | "


"verifyText | css=pre | regexp:Transaction failed.* | "
verifyTrue(selenium.getText("css=pre").matches("regexp:Transaction failed..*"))

"verifyText | css=pre | regexp:105Processor reported error.* | "
verifyTrue(selenium.getText("css=pre").matches("regexp:105Processor reported error..*"))

