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



String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"

String path_Email = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_Email/"

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()

WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))
WebUI.click(findTestObject(path_Dashboard + 'a_Email Subscription'))

WebUI.verifyElementVisible(findTestObject(path_Email + 'h1_Email Subscription'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'h1_Email Subscription'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'h3_Delivery Format'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'h3_Delivery Format'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'h3_Email Subscription'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'h3_Email Subscription'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'h3_Name'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'h3_Name'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'h3_Report'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'h3_Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'h3_Report Subscription'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'h3_Report Subscription'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'h3_Schedule'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'h3_Schedule'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'h3_Subject Type'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'h3_Subject Type'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'h6_Available'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'h6_Available'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'h6_Selected'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'h6_Selected'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'input__subscriptionName'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'input__subscriptionName'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'input_Available_btnAllLeft'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'input_Available_btnAllLeft'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'input_Available_btnAllRight'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'input_Available_btnAllRight'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'input_Available_btnLeft'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'input_Available_btnLeft'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'input_Available_btnRight'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'input_Available_btnRight'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'label_Custom'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'label_Custom'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'label_Standard'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'label_Standard'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'select_delivery'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'select_delivery'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'select_Report'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'select_Report'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'select_Schedule'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'select_Schedule'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'select_Selected_emailTos'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'select_Selected_emailTos'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'div_User Email Address List'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'div_User Email Address List'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'div_Email To'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'div_Email To'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'button_Reset'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'button_Reset'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'button_Submit'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'button_Submit'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'a_Modify'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'a_Modify'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'a_Remove'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'a_Remove'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'a_Remove'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'a_Remove'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'td_ESR_txt'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'td_ESR_txt'), 30)

WebUI.verifyElementVisible(findTestObject(path_Email + 'select_namelist'))
WebUI.verifyElementPresent(findTestObject(path_Email + 'select_namelist'), 30)

WebUI.closeBrowser()


















