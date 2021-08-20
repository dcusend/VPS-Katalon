/*
 * import static
 * com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint import
 * static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase import
 * static com.kms.katalon.core.testdata.TestDataFactory.findTestData import
 * static com.kms.katalon.core.testobject.ObjectRepository.findTestObject import
 * static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
 * import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint import
 * com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
 * import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
 * import com.kms.katalon.core.model.FailureHandling as FailureHandling import
 * com.kms.katalon.core.testcase.TestCase as TestCase import
 * com.kms.katalon.core.testdata.TestData as TestData import
 * com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW import
 * com.kms.katalon.core.testobject.TestObject as TestObject import
 * com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS import
 * com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI import
 * com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows import
 * internal.GlobalVariable as GlobalVariable import org.openqa.selenium.Keys as
 * Keys
 */

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
 /* selenium.forXml("file://C:/Users/iahmed/Documents/SeleniumTests/Vlink/VLinkXMLTests/SaleVoidTestData.xml") */
 selenium.open("https://dev-algorithm.govolution.com/vlinktest/QA/version_2_0/authcap.html")
 println("Begin Record Number: ${rn}")
 selenium.type("name=transaction_type", ("${tranType}").toString())
 selenium.type("name=message_version", ("${msgVer}").toString())
 String remID = selenium.getEval("  " + "Date.now")
 selenium.type("name=remittance_id", (remID).toString())
 selenium.type("name=application_id", ("${appID}").toString())
 selenium.type("name=username", ("${userName}").toString())
 selenium.type("name=password", ("${password}").toString())
 selenium.type("name=response_format", ("${responseFormat}").toString())
 selenium.type("name=category", ("${category}").toString())
 selenium.type("name=transaction_id", ("${tranID}").toString())
 selenium.type("name=approval_code", ("${apprCode}").toString())
 selenium.type("name=card_name", ("${name}").toString())
 selenium.type("name=card_address", ("${al1}").toString())
 selenium.type("name=card_address2", ("${al2}").toString())
 selenium.type("name=card_city", ("${city}").toString())
 selenium.type("name=card_state", ("${state}").toString())
 selenium.type("name=card_zip", ("${zip}").toString())
 selenium.type("name=country_id", ("${country}").toString())
 selenium.type("name=amount", ("${amount}").toString())
 selenium.type("name=card_number", ("${cardnumber}").toString())
 selenium.type("name=card_exmo", ("${month}").toString())
 selenium.type("name=card_exyr", ("${year}").toString())
 selenium.type("name=cvv_data", ("${cvv}").toString())
 selenium.type("name=cvv_state", ("${cvvState}").toString())
 selenium.type("name=track_data", ("${trackData}").toString())
 selenium.type("name=track_1_data", ("${track1Data}").toString())
 selenium.type("name=track_2_data", ("${track2Data}").toString())
 selenium.type("name=entry_mode", ("${entryMode}").toString())
 selenium.type("name=email", ("${email}").toString())
 selenium.type("name=order_number", ("${orderNum}").toString())
 selenium.type("name=tax_amount", ("${tax}").toString())
 selenium.type("name=charge_description", ("${charge}").toString())
 selenium.type("name=client_account_number", ("${CAN}").toString())
 selenium.type("name=bill_payment_indicator", ("${BillPayInd}").toString())
 selenium.type("name=user_defined1", ("${udf1}").toString())
 selenium.type("name=user_defined2", ("${udf2}").toString())
 selenium.type("name=user_defined3", ("${udf3}").toString())
 selenium.type("name=user_defined4", ("${udf4}").toString())
 selenium.type("name=user_defined5", ("${udf5}").toString())
 selenium.type("name=user_defined6", ("${udf6}").toString())
 selenium.type("name=user_defined7", ("${udf7}").toString())
 selenium.type("name=user_defined8", ("${udf8}").toString())
 selenium.type("name=user_defined9", ("${udf9}").toString())
 selenium.type("name=user_defined10", ("${udf10}").toString())
 selenium.click("css=input[type=\"submit\"]")
 selenium.waitForPageToLoad("30000")
 softAssertion.assertEquals(selenium.isTextPresent("${expText}"), true)
 String resText = selenium.getText("css=pre")
 println(resText)
 String tranID = selenium.getEval(" var remID = \"" + remID + "\";var resText = \"" + resText + "\";var storedVars = { 'remID': remID,'resText': resText }; " + "storedVars['resText'].substring(19,27).trim()")
 println(tranID)
 selenium.open("https://dev-algorithm.govolution.com/vlinktest/QA/version_2_0/CC_void.html")
 selenium.type("name=transaction_type", ("${tTypeVoid}").toString())
 selenium.type("name=message_version", ("${mvVoid}").toString())
 String remIDVoid = selenium.getEval(" var remID = \"" + remID + "\";var resText = \"" + resText + "\";var tranID = \"" + tranID + "\";var storedVars = { 'remID': remID,'resText': resText,'tranID': tranID }; " + "Date.now")
 selenium.type("name=remittance_id", (remIDVoid).toString())
 selenium.type("name=application_id", ("${appIDVoid}").toString())
 selenium.type("name=username", ("${userVoid}").toString())
 selenium.type("name=password", ("${pwdVoid}").toString())
 selenium.type("name=response_format", ("${resFormVoid}").toString())
 selenium.type("name=transaction_id", (tranID).toString())
 selenium.type("name=original_transaction_type", ("${origtTypeVoid}").toString())
 selenium.type("name=track_data", ("${trackDataVoid}").toString())
 selenium.type("name=track_1_data", ("${track1DataVoid}").toString())
 selenium.type("name=track_2_data", ("${track2DataVoid}").toString())
 selenium.type("name=tax_amount", ("${taxVoid}").toString())
 selenium.type("name=client_account_number", ("${CANVoid}").toString())
 selenium.click("css=input[type=\"submit\"]")
 selenium.waitForPageToLoad("30000")
 softAssertion.assertEquals(selenium.isTextPresent("Transaction approved, no errors"), true)
 String resTextVoid = selenium.getText("css=pre")
 println(resTextVoid)
 String tranIDVoid = selenium.getEval(" var remID = \"" + remID + "\";var resText = \"" + resText + "\";var tranID = \"" + tranID + "\";var remIDVoid = \"" + remIDVoid + "\";var resTextVoid = \"" + resTextVoid + "\";var storedVars = { 'remID': remID,'resText': resText,'tranID': tranID,'remIDVoid': remIDVoid,'resTextVoid': resTextVoid }; " + "storedVars['resTextVoid'].substring(19,27).trim()")
 println(tranIDVoid)
 println("End Record Number: ${rn}")
 /* selenium.endForXml() */
 