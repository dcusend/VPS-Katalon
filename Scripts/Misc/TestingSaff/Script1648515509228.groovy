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

WebUI.navigateToUrl('https://apps.pgcps.org/pls/apex/f?p=431:LOGIN_DESKTOP:30291242523013:::::')

WebUI.setText(findTestObject('Object Repository/Misc/Staffing/input_Username_P101_USERNAME'), 'nudrat.bushra')

WebUI.setEncryptedText(findTestObject('Object Repository/Misc/Staffing/input_Password_P101_PASSWORD'), '9D07DfNxKwa8at7A4HkTJg==')

WebUI.click(findTestObject('Object Repository/Misc/Staffing/button_Log In'))

WebUI.click(findTestObject('Object Repository/Misc/Staffing/span_current_a-Icon icon-menu-drop-down'))

WebUI.click(findTestObject('Object Repository/Misc/Staffing/span_ECC Department'))

WebUI.click(findTestObject('Object Repository/Misc/Staffing/button_Staffing Forms'))

WebUI.click(findTestObject('Object Repository/Misc/Staffing/span_Create'))

WebUI.click(findTestObject('Object Repository/Misc/Staffing/span_ECC Form'))

WebUI.setText(findTestObject('Object Repository/Misc/Staffing/input_Student Number_P19_ECC_STUDENT_NUMBER'), '124')

WebUI.click(findTestObject('Object Repository/Misc/Staffing/input_State Student ID_P19_ECC_STATE_STUDEN_d4c7f0'))

WebUI.click(findTestObject('Object Repository/Misc/Staffing/input_State Student ID_P19_ECC_STATE_STUDEN_d4c7f0'))

WebUI.click(findTestObject('Object Repository/Misc/Staffing/div_Student Number'))

WebUI.setText(findTestObject('Object Repository/Misc/Staffing/input_Student Number_P19_ECC_STUDENT_NUMBER'), '100')

WebUI.setText(findTestObject('Object Repository/Misc/Staffing/input_State Student ID_P19_ECC_STATE_STUDEN_d4c7f0'), '1001')

WebUI.click(findTestObject('Object Repository/Misc/Staffing/div_First Name_t-Form-inputContainer col col-4'))

WebUI.setText(findTestObject('Object Repository/Misc/Staffing/input_First Name_P19_ECC_FIRST_NAME'), 'firstname')

WebUI.setText(findTestObject('Object Repository/Misc/Staffing/input_Last Name_P19_ECC_LAST_NAME'), 'lastname')

WebUI.click(findTestObject('Object Repository/Misc/Staffing/span_Find'))

WebUI.closeBrowser()

