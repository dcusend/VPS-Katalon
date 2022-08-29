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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.velocitypayment.com/vsecurity/login.jsp')

WebUI.setText(findTestObject('Object Repository/Misc/ChangePwdIssue/input_Username_user'), 'iahmed')

WebUI.setEncryptedText(findTestObject('Object Repository/Misc/ChangePwdIssue/input_Password_password'), 'ReH0Zrvn+OVqGz5NDrNXZg==')

WebUI.click(findTestObject('Object Repository/Misc/ChangePwdIssue/input_Password_button2'))

WebUI.click(findTestObject('Object Repository/Misc/ChangePwdIssue/a_Access User Management'))

WebUI.setText(findTestObject('Object Repository/Misc/ChangePwdIssue/input_Username_username'), 'test1234')

WebUI.click(findTestObject('Object Repository/Misc/ChangePwdIssue/input_Seach Type_button'))

WebUI.click(findTestObject('Object Repository/Misc/ChangePwdIssue/input_Seach Type_button'))

WebUI.click(findTestObject('Object Repository/Misc/ChangePwdIssue/input_Change Password_changePassword'))

WebUI.setEncryptedText(findTestObject('Object Repository/Misc/ChangePwdIssue/input_New Password_password'), 'SHTs9bxpSGUo5GEF5ZlxYA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Misc/ChangePwdIssue/input_Confirm Password_confirmPassword'), 'SHTs9bxpSGUo5GEF5ZlxYA==')

WebUI.click(findTestObject('Object Repository/Misc/ChangePwdIssue/input_Seach Type_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Misc/ChangePwdIssue/h3_User Account Modified'), 'User Account Modified')

WebUI.click(findTestObject('Object Repository/Misc/ChangePwdIssue/a_User Management'))

WebUI.closeBrowser()

