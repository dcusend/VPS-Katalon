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





String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
String orPath_TaxTypeFilingYear = "Object Repository/RAD_Pages/TaxTypeFilingYear_Page"
String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
String orPath_AddressContact = "Object Repository/RAD_Pages/AddressAndContactInfo_Page"
String orPath_Summary = "Object Repository/RAD_Pages/Summary_Page"
String orPath_PaymentConfirmation = "Object Repository/RAD_Pages/PaymentConfirmation_Page"
String orPath_ServiceFeesAccept = "Object Repository/RAD_Pages/ServiceFeeAccept_Page"
String orPath_PaymentEntry = "Object Repository/RAD_Pages/PaymentEntry_Page"
String orPath_TaxPayer = "Object Repository/RAD_Pages/Taxpayer_Page"


WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(GlobalVariable.RADurl)


// Select Estimated Tax from the Main Index Page
WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), "Quarterly Estimated Tax", false)


// Select Fiduciary Tax from the Payment Type dropwown
WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PaymentType'),"Fiduciary Tax",false)

WebUI.setText(findTestObject(orPath_TaxPayer + '/input_businessName')," ")

def result

//def result = WebUI.getCSSValue(findTestObject(orPath_TaxPayer + '/input_businessName'),'')

//result = WebUI.getText(findTestObject(orPath_TaxPayer + '/input_businessName'))

result = WebUI.getAttribute(findTestObject(orPath_TaxPayer + '/input_businessName'), 'maxlength')




println result


WebUI.setText(findTestObject(orPath_AddressContact + '/input_streetAddress1')," ")

result = "Fail"

WebUI.verifyTextPresent('Enter bussiness name',true,FailureHandling.STOP_ON_FAILURE)
WebUI.verifyTextPresent('Enter address', true,FailureHandling.STOP_ON_FAILURE)

result = "Pass"

println result
