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

import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.RADurl)

String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
String orPath_TaxTypeFilingYear = "Object Repository/RAD_Pages/TaxTypeFilingYear_Page"
String orPath_TaxPayer = "Object Repository/RAD_Pages/Taxpayer_Page"
String orPath_AddressContact = "Object Repository/RAD_Pages/AddressAndContactInfo_Page"
String orPath_FilingStatus = "Object Repository/RAD_Pages/FilingStatus_Page"
String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
String orPath_TaxInfo = "Object Repository/RAD_Pages/TaxInfo_Page"




// Select Estimated Tax from the Main Index Page
		WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), "Existing Liability with Notice/Invoice Number", false)

		
// Select Fiduciary Tax from the Payment Type dropwown
		WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_TaxType_ExistingLiability'),'Tobacco Tax',false)
		
		
// Verify that Filing Year and Period Ending dropdowns are not visible
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'))
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'))

		
		
// Verify static text in Taxpayer section
		WebUI.verifyTextPresent('Taxpayer', true)
		WebUI.verifyTextPresent('Provide the following taxpayer information', true)
		WebUI.verifyTextPresent('Note: If you are paying on behalf of the Taxpayer, enter Taxpayer', true)
		WebUI.verifyTextPresent('information here. If you are making a payment for the Taxpayer, you will be required later to enter your own credit card, billing address and other pertinent information', true)

		
// Verify Business Name textbox is present under Taxpayer section
		WebUI.verifyElementVisible(findTestObject(orPath_TaxPayer + '/input_Note_businessName'))
		WebUI.verifyElementVisible(findTestObject(orPath_TaxPayer + '/input_BusinessRepfirstName'))
		WebUI.verifyElementVisible(findTestObject(orPath_TaxPayer + '/input_BusinessRepmiddleName'))
		WebUI.verifyElementVisible(findTestObject(orPath_TaxPayer + '/input_BusinessReplastName'))
		WebUI.verifyElementVisible(findTestObject(orPath_TaxPayer + '/input_BusinessRepsuffix'))
			
		
		
		
// Verify that the following fields are not present under Taxpayer section
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxPayer + '/input_firstName'))
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxPayer + '/input_middleName'))
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxPayer + '/input_lastName'))
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxPayer + '/input_suffix'))
		WebUI.verifyElementNotVisible(findTestObject('RAD_RecordAndPlay/input_concatSSN'))
		WebUI.verifyElementNotVisible(findTestObject('RAD_RecordAndPlay/input_concatReSSN'))

		
		
// Verify Address and Contact Information static text and fields are present
		WebUI.verifyTextPresent('Address and Contact Information', true)
		WebUI.verifyTextPresent('Enter the taxpayer', true)
		WebUI.verifyTextPresent('address and contact information', true)
		
		WebUI.verifyElementPresent(findTestObject(orPath_AddressContact + '/select_Country'), 30)
		WebUI.verifyElementPresent(findTestObject(orPath_AddressContact + '/input_streetAddress1'), 30)
		WebUI.verifyElementPresent(findTestObject(orPath_AddressContact + '/input_streetAddress2'), 30)
		WebUI.verifyElementPresent(findTestObject(orPath_AddressContact + '/input_city'), 30)
		WebUI.verifyElementPresent(findTestObject(orPath_AddressContact + '/select_State'), 30)
		WebUI.verifyElementPresent(findTestObject(orPath_AddressContact + '/input_zipCode'), 30)
		WebUI.verifyElementPresent(findTestObject(orPath_AddressContact + '/input_phoneNumber'), 30)
		WebUI.verifyElementPresent(findTestObject(orPath_AddressContact + '/input_eMailAddress'), 30)
		WebUI.verifyElementPresent(findTestObject(orPath_AddressContact + '/input_reEnterEMailAddress'), 30)
		WebUI.verifyOptionsPresent(findTestObject(orPath_AddressContact + '/select_Country'),['United States'])
		WebUI.verifyOptionsPresent(findTestObject(orPath_AddressContact + '/select_State'),['Alabama','District of Columbia','Maryland','Virginia','Wyoming'])
		
		def totalOptionsState = WebUI.getNumberOfTotalOption(findTestObject(orPath_AddressContact + '/select_State'))
		WebUI.verifyEqual(totalOptionsState, 52)
		
		
// Verify FEIN under Tax Information section
		WebUI.verifyTextPresent('Tax Information', true)
		//WebUI.verifyElementVisible(findTestObject(orPath_TaxInfo + '/input_TaxInformation_feinSsn'))
		//WebUI.verifyElementVisible(findTestObject(orPath_TaxInfo + '/input_TaxInformation_RefeinSsn'))
		WebUI.verifyElementPresent(findTestObject(orPath_TaxInfo + '/input_TaxInfo_feinSsn_Existing_New'),30)
		WebUI.verifyElementPresent(findTestObject(orPath_TaxInfo + '/input_TaxInfo_RetypefeinSsn_Existing_New'),30)


		
// Verify Notice Number and Re-Type Notice Number
		WebUI.verifyElementPresent(findTestObject(orPath_TaxInfo + '/input_NoticeInvoiceNumber'), 30)
		WebUI.verifyElementVisible(findTestObject(orPath_TaxInfo + '/input_NoticeInvoiceNumber'))
		WebUI.verifyElementPresent(findTestObject(orPath_TaxInfo + '/input_reTypeNoticeInvoiceNumber'), 30)
		WebUI.verifyElementVisible(findTestObject(orPath_TaxInfo + '/input_reTypeNoticeInvoiceNumber'))
		
// Verify the new Notice ID static text
		WebUI.verifyTextPresent('This is NOT the Notice ID', true)
		
		WebUI.verifyTextPresent('Notice Number or Invoice Number', true)
		WebUI.verifyTextPresent('Re-Type Notice Number or Invoice Number', true)
		
// Verify that MD Central Registration Number field is visible
		WebUI.verifyElementVisible(findTestObject(orPath_TaxInfo + '/input_MDCRegistrationEL'))
		
		
// Verify Filing Status section is not present
		WebUI.verifyElementNotVisible(findTestObject(orPath_FilingStatus + '/input_userType_Individual'))
		WebUI.verifyElementNotVisible(findTestObject(orPath_FilingStatus + '/input_userType_Joint'))

		
		
		
// Verify Payment Amount is present and visible
		WebUI.verifyTextPresent('Payment Amount', true)
		WebUI.verifyElementPresent(findTestObject(orPath_Amount + '/input__paymentAmount'), 30)
		WebUI.verifyElementVisible(findTestObject(orPath_Amount + '/input__paymentAmount'))
		
		
// Verify Sevice Fee static text
		WebUI.verifyTextPresent('Service Fee: This electronic government service includes a service/convenience fee. Click here for details', true)
		WebUI.verifyElementPresent(findTestObject(orPath_Amount + '/a_Click here for details'), 30)

		
		
// Verify Continue button is present
		WebUI.verifyElementPresent(findTestObject(orPath_Landing + '/button_Continue'), 30)
