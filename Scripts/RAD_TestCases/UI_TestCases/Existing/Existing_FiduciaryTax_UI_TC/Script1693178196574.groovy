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
		WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), "Existing Liability w/Notice Number", false)

		
// Select Fiduciary Tax from the Payment Type dropwown
		WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_TaxType_ExistingLiability'),'Fiduciary Tax',false)
		
		
// Verify that Filing Year and Period Ending dropdowns are not visible
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'))
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'))

		
		
// Verify that Business Name text box is not visible
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxPayer + '/input_Note_businessName'))
		
		
		
// Verify static text in Taxpayer section
		WebUI.verifyTextPresent('Taxpayer', true)
		WebUI.verifyTextPresent('Provide the following taxpayer information', true)
		WebUI.verifyTextPresent('Note: If you are paying on behalf of the Taxpayer, enter Taxpayer', true)
		WebUI.verifyTextPresent('information here. If you are making a payment for the Taxpayer, you will be required later to enter your own credit card, billing address and other pertinent information', true)

		
// Verify Taxpayer fields
		WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_firstName'), 30)
		WebUI.verifyElementVisible(findTestObject(orPath_TaxPayer + '/input_firstName'))
		
		WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_middleName'), 30)
		WebUI.verifyElementVisible(findTestObject(orPath_TaxPayer + '/input_middleName'))
		
	    WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_lastName'), 30)
	    WebUI.verifyElementVisible(findTestObject(orPath_TaxPayer + '/input_lastName'))
	   
	    WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_suffix'), 30)
	    WebUI.verifyElementVisible(findTestObject(orPath_TaxPayer + '/input_suffix'))
		
		
		
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
		
		
		TestObject existing_FEIN = new TestObject()
		existing_FEIN.setSelectorMethod(SelectorMethod.BASIC)
		existing_FEIN.addProperty("name", ConditionType.EQUALS, "taxTypeExisitingFEIN")
		existing_FEIN.addProperty("id", ConditionType.EQUALS, "taxTypeExisitingFEIN")
		
		
		TestObject existing_FEIN_Retype = new TestObject()
		existing_FEIN_Retype.setSelectorMethod(SelectorMethod.BASIC)
		existing_FEIN_Retype.addProperty("name", ConditionType.EQUALS, "reTaxTypeExisitingFEIN")
		existing_FEIN_Retype.addProperty("id", ConditionType.EQUALS, "reTaxTypeExisitingFEIN")
		
		
		
	
		
// Verify FEIN under Tax Information section
		WebUI.verifyTextPresent('Tax Information', true)
		WebUI.verifyElementPresent(existing_FEIN, 30)
		WebUI.verifyElementPresent(existing_FEIN_Retype, 30)



		
// Verify Notice Number and Re-Type Notice Number
		WebUI.verifyElementPresent(findTestObject(orPath_TaxInfo + '/input_NoticeInvoiceNumber'), 30)
		WebUI.verifyElementVisible(findTestObject(orPath_TaxInfo + '/input_NoticeInvoiceNumber'))
		
		WebUI.verifyElementPresent(findTestObject(orPath_TaxInfo + '/input_reTypeNoticeInvoiceNumber'), 30)
		WebUI.verifyElementVisible(findTestObject(orPath_TaxInfo + '/input_reTypeNoticeInvoiceNumber'))
		

	
// Verify Payment Amount is present and visible
		WebUI.verifyTextPresent('Payment Amount', true)
		WebUI.verifyElementPresent(findTestObject(orPath_Amount + '/input__paymentAmount'), 30)
		WebUI.verifyElementVisible(findTestObject(orPath_Amount + '/input__paymentAmount'))
		
		
// Verify Sevice Fee static text
		WebUI.verifyTextPresent('Service Fee: This electronic government service includes a service/convenience fee. Click here for details', true)
		WebUI.verifyElementPresent(findTestObject(orPath_Amount + '/a_Click here for details'), 30)

		
		
// Verify Continue button is present
		WebUI.verifyElementPresent(findTestObject(orPath_Landing + '/button_Continue'), 30)

		