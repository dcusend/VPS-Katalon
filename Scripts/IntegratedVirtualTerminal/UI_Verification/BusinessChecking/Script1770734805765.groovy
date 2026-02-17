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

WebUI.setText(findTestObject('Object Repository/IntegratedVT/FeeLookupResponseForm/AgencyId'), '1')
WebUI.click(findTestObject('Object Repository/IntegratedVT/FeeLookupResponseForm/Submit'))

WebUI.verifyTextPresent('Payment Details', true)
println("user is in 'Payment Details' section")

WebUI.verifyTextPresent('Business Checking', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/label_BusinessChecking'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/label_BusinessChecking'), 10)
println("'Business Checking' tab is present in 'Payment Details' section")
WebUI.click(findTestObject('Object Repository/IntegratedVT/BusinessChecking/label_BusinessChecking'))

WebUI.verifyTextPresent('Routing Transit Number', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_RoutingNumber'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_RoutingNumber'), 10)
println("'Routing Transit Number' box is present in 'Business Checking' tab")

WebUI.verifyTextPresent('Account Number', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AccountNumber'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AccountNumber'), 10)
println("'Account Number' box is present in 'Business Checking' tab")

WebUI.verifyTextPresent("Confirm Account Number", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_ConfirmAccountNumber'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_ConfirmAccountNumber'), 10)
println("'Confirm Account Number' box is present in 'Business Checking' tab")

WebUI.executeJavaScript('window.scrollTo(0, document.body.scrollHeight)', null)

WebUI.verifyTextPresent("Business Name", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_BusinessName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_BusinessName'), 10)
println("'Business Name' dropdown is present in 'Business Checking' tab")

WebUI.verifyTextPresent("First Name", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_FirstName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_FirstName'), 10)
println("'First Name' box is present in 'Business Checking' tab")

WebUI.verifyTextPresent("Last Name", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_LastName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_LastName'), 10)
println("'Last Name' box is present in 'Business Checking' tab")

WebUI.verifyTextPresent('Billing Details', true)

WebUI.verifyTextPresent("Email Address", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_EmailAddress'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_EmailAddress'), 10)
println("'Email Address' box is present in 'Business Checking' tab")

WebUI.verifyTextPresent("Phone Number", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_PhoneNumber'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_PhoneNumber'), 10)
println("'Phone Number' box is present in 'Business Checking' tab")

WebUI.verifyTextPresent("Payment Date", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_PaymentDate'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_PaymentDate'), 10)
println("'Payment Date' box is present in 'Business Checking' tab")

WebUI.verifyTextPresent("Country", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/select_Country'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/select_Country'), 10)
println("'Country' dropdown is present in 'Business Checking' tab")

WebUI.verifyTextPresent("Address Line 1", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AddressLine1'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AddressLine1'), 10)
println("'Address Line 1' box is present in 'Business Checking' tab")

WebUI.verifyTextPresent("ZIP Code", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_ZipCode'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_ZipCode'), 10)
println("'ZIP Code' box is present in 'Business Checking' tab")

WebUI.verifyTextPresent("State", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/select_State'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/select_State'), 10)
println("'State' dropdown is present in 'Business Checking' tab")

WebUI.verifyTextPresent("City", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_City'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_City'), 10)
println("'City' box is present in 'Business Checking' tab")

WebUI.verifyTextPresent('Additional Details', true)

WebUI.verifyTextPresent("Add a message", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AddaMessage'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AddaMessage'), 10)
println("'Add a message' box is present in 'Business Checking' tab")

WebUI.verifyTextPresent("Continue", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/button_Continue'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/button_Continue'), 10)
println("'Continue' button is present in 'Business Checking' tab")

WebUI.verifyTextPresent("Exit", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/button_Exit'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/button_Exit'), 10)
println("'Exit' button is present in 'Business Checking' tab")


