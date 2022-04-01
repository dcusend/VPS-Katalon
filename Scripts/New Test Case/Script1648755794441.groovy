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

WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/ACHPersonal/input_Username_user'), 
    'iahmed')

WebUI.setEncryptedText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/ACHPersonal/input_Password_password'), 
    'ReH0Zrvn+OVqGz5NDrNXZg==')

WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/ACHPersonal/button_Debit'))

WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/ACHPersonal/a_Personal'))

WebUI.setText(findTestObject('AdminSuiteBootstrap_Pages/VT_Bootstrap/ACHPersonal/input_accountNumber'), 
    '123456')

WebUI.setText(findTestObject('AdminSuiteBootstrap_Pages/VT_Bootstrap/ACHPersonal/input_routingNumber'), 
    '256072691')

WebUI.closeBrowser()

