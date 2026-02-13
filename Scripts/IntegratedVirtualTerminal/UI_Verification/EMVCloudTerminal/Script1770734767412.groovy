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

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

def IntegratedVTurl

IntegratedVTurl = GlobalVariable.IntegratedVT

WebUI.openBrowser(IntegratedVTurl)
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/IntegratedVT/FeeLookupResponseForm/Submit'))

WebUI.verifyTextPresent('Payment Details', true)
println("user is in 'Payment Details' section")

WebUI.verifyTextPresent('EMV Cloud Terminal', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/label_EMVCloudTerminal'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/label_EMVCloudTerminal'), 10)
println("'EMV Cloud Terminal' tab is present in 'Payment Details' section")
WebUI.click(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/label_EMVCloudTerminal'))

WebUI.verifyTextPresent('Terminal Name', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_TerminalName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_TerminalName'), 10)
println("'Terminal Name' box is present in 'EMV Cloud Terminal' tab")

WebUI.verifyTextPresent('Select a terminal', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_Terminal'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_Terminal'), 10)
println("'Select a terminal' dropdown is present in 'EMV Cloud Terminal' tab")

WebUI.verifyTextPresent("Cardholder's Name", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_CardHolderName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_CardHolderName'), 10)
println("'Cardholder's Name' box is present in 'EMV Cloud Terminal' tab")

WebUI.executeJavaScript('window.scrollTo(0, document.body.scrollHeight)', null)

WebUI.verifyTextPresent('Billing Details', true)

WebUI.verifyTextPresent("Email Address", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_EmailAddress'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_EmailAddress'), 10)
println("'Email Address' box is present in 'EMV Cloud Terminal' tab")

WebUI.verifyTextPresent("Phone Number", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_PhoneNumber'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_PhoneNumber'), 10)
println("'Phone Number' box is present in 'EMV Cloud Terminal' tab")

WebUI.verifyTextPresent("Payment Date", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_PaymentDate'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_PaymentDate'), 10)
println("'Payment Date' box is present in 'EMV Cloud Terminal' tab")

WebUI.verifyTextPresent("Country", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_Country'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_Country'), 10)
println("'Country' dropdown is present in 'EMV Cloud Terminal' tab")

WebUI.verifyTextPresent("Address Line 1", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_AddressLine1'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_AddressLine1'), 10)
println("'Address Line 1' box is present in 'EMV Cloud Terminal' tab")

WebUI.verifyTextPresent("ZIP Code", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_ZipCode'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_ZipCode'), 10)
println("'ZIP Code' box is present in 'EMV Cloud Terminal' tab")

WebUI.verifyTextPresent("State", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_State'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_State'), 10)
println("'State' dropdown is present in 'EMV Cloud Terminal' tab")

WebUI.delay(1)
WebUI.verifyTextPresent("City", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_City'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_City'), 10)
println("'City' box is present in 'EMV Cloud Terminal' tab")

WebUI.verifyTextPresent('Additional Details', true)

WebUI.verifyTextPresent("Add a message", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_AddaMessage'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_AddaMessage'), 10)
println("'Add a message' box is present in 'EMV Cloud Terminal' tab")

WebUI.verifyTextPresent("Continue", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/button_Continue'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/button_Continue'), 10)
println("'Continue' button is present in 'EMV Cloud Terminal' tab")

WebUI.verifyTextPresent("Exit", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/button_Exit'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/button_Exit'), 10)
println("'Exit' button is present in 'EMV Cloud Terminal' tab")


