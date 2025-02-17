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

String path_Payment = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/"

CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()


WebUI.click(findTestObject(path_Dashboard + 'span_Payment'))
WebUI.click(findTestObject(path_Dashboard + 'a_Access AutoDualCFtpProd'))

WebUI.verifyElementVisible(findTestObject(path_Payment + 'a_Issue Transactions_Prod'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'a_Issue Transactions_Prod'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'a_Search Transactions_Prod'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'a_Search Transactions_Prod'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'h5_Credit Card'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'h5_Credit Card'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'h5_On-line Check'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'h5_On-line Check'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'button_Authorization  Capture (Sale)'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'button_Authorization  Capture (Sale)'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'button_Authorization Only'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'button_Authorization Only'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'button_Capture an Authorization'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'button_Capture an Authorization'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'button_CreditOrVoid_Generic'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'button_CreditOrVoid_Generic'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'button_ACH_CreditOrVoid_Generic'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'button_ACH_CreditOrVoid_Generic'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'button_Manual Authorization'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'button_Manual Authorization'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'button_Debit'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'button_Debit'), 30)

WebUI.click(findTestObject(path_Payment + 'button_Authorization  Capture (Sale)'))

WebUI.click(findTestObject(path_Payment + 'button_Authorization Only'))

WebUI.verifyElementVisible(findTestObject(path_Payment + 'a_Keyboard Entry_authonly_Prod'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'a_Keyboard Entry_authonly_Prod'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'a_PIN Pad Entry_authonly_Prod'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'a_PIN Pad Entry_authonly_Prod'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'a_Swipe_authonly_Prod'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'a_Swipe_authonly_Prod'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'a_Keyboard Entry_Prod'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'a_Keyboard Entry_Prod'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'a_PIN Pad Entry_Prod'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'a_PIN Pad Entry_Prod'), 30)

WebUI.verifyElementVisible(findTestObject(path_Payment + 'a_Swipe_Prod'))
WebUI.verifyElementPresent(findTestObject(path_Payment + 'a_Swipe_Prod'), 30)

WebUI.closeBrowser()



