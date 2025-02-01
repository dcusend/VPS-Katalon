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



	WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), "New Tax Return Amount Due", false)

	
	
	def totalOptionsPaymentType = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/RAD_Pages/Landing_Page/select_NewTaxReturnAmountDue_TaxType'))
	
// Updates for August 2023
	if (WebUI.verifyEqual(totalOptionsPaymentType, 24))
	
		{
			System.out.println('Total Options for Payment Type are correct: ' + totalOptionsPaymentType)
			KeywordUtil.markPassed("Total Options are correct for Payment Type")
		}
	else
		{
			System.out.println('Total Options for Payment Type are NOT correct: ' + totalOptionsPaymentType)
			KeywordUtil.markFailed("Total Options for Payment Type are NOT correct")
		}

	
		WebUI.verifyOptionsPresent(findTestObject('Object Repository/RAD_Pages/Landing_Page/select_NewTaxReturnAmountDue_TaxType'),['Fiduciary Tax','Personal Income Tax','PTE Non-Electing Non-S Corp','PTE Non-Electing S Corp','PTE Tax Electing Non-S Corp','PTE Tax Electing S Corp'])
		
		WebUI.verifyOptionsPresent(findTestObject('Object Repository/RAD_Pages/Landing_Page/select_NewTaxReturnAmountDue_TaxType'),['Admissions and Amusement Tax','Alcohol Tax','Bay Restoration Fee','Corporate Income Tax','Motor Fuel Tax'])
	
		WebUI.verifyOptionsPresent(findTestObject('Object Repository/RAD_Pages/Landing_Page/select_NewTaxReturnAmountDue_TaxType'),['Sales and Use Tax','Slots License Fee','Tire Recycling Fee','Tobacco Tax','Transportation Network Services'])
		
		WebUI.verifyOptionsPresent(findTestObject('Object Repository/RAD_Pages/Landing_Page/select_NewTaxReturnAmountDue_TaxType'),['Unclaimed Property','Withholding Tax'])
		
		WebUI.verifyOptionsPresent(findTestObject('Object Repository/RAD_Pages/Landing_Page/select_NewTaxReturnAmountDue_TaxType'),['Digital Advertising Gross Revenues','PTE Composite','Estate Tax','IFTA Tax'])
		
// Verify that Filing Year dropdown is present and visible
	WebUI.verifyElementPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'), 30)
	WebUI.verifyElementVisible(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'))
	

// Verify the contents of Filing Year dropdown
	def totalOptionsFilingYear = WebUI.getNumberOfTotalOption(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'))
	WebUI.verifyEqual(totalOptionsFilingYear, 4)
	WebUI.verifyOptionsPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),['Select','2024','2023','2022'])
	
			
			
// Verify Period Ending Month dropdown is not visible
	WebUI.verifyElementNotVisible(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'))

	
	
/*
 * #############################################
 * Verify Static Text is present on the page
 * ##############################################
 */
			
			
			
		WebUI.verifyTextPresent('Payment Type/Filing Year', true)
		
		WebUI.verifyTextPresent('Taxpayer', true)
		
		WebUI.verifyTextPresent('Provide the following taxpayer information', true)
		
		WebUI.verifyTextPresent('Note: If you are paying on behalf of the Taxpayer, enter Taxpayer', true)
		
		WebUI.verifyTextPresent('information here. If you are making a payment for the Taxpayer, you will be required later to enter your own credit card, billing address and other pertinent information', true)
		
		WebUI.verifyTextPresent('Address and Contact Information', true)
		
		WebUI.verifyTextPresent('Enter the taxpayer', true)
		
		WebUI.verifyTextPresent('address and contact information', true)
		
		//WebUI.verifyTextPresent('Filing Status', true)
		
		//WebUI.verifyTextPresent('Is this an Individual or Joint Filing?', true)
		
		//WebUI.verifyTextPresent('Filing type', true)
		
		//WebUI.verifyTextPresent('Individual Filing', true)
			
		//WebUI.verifyTextPresent('Joint Filing', true)
		
		WebUI.verifyTextPresent('Payment Amount', true)
		
		WebUI.verifyTextPresent('Service Fee: This electronic government service includes a service/convenience fee. Click here for details', true)
		
		WebUI.verifyElementPresent(findTestObject(orPath_Amount + '/a_Click here for details'), 30)
		
		//WebUI.click(findTestObject(orPath_Amount + '/a_Click here for details'))
		
		WebUI.verifyElementPresent(findTestObject(orPath_Landing + '/button_Continue'), 30)
		
		
/*
 *#############################################
 * Verify Taxpayer fields are present in
 * the Taxpayer section
 * ###########################################
 */
			 
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxPayer + '/input_Note_businessName'))
			
		WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_firstName'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_middleName'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_lastName'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_suffix'), 30)
		
		WebUI.verifyElementPresent(findTestObject('RAD_RecordAndPlay/input_concatSSN'), 30)
		
		WebUI.verifyElementPresent(findTestObject('RAD_RecordAndPlay/input_concatReSSN'), 30)
		
		
/*
 * ###############################################
 * Verify Address and Contact Information
 * fields are present in the
 * Address and Contact Information section
 * ###############################################
 */
			
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
		WebUI.verifyElementVisible(findTestObject(orPath_TaxInfo + '/input_FederalEIN-2'))
		WebUI.verifyElementVisible(findTestObject(orPath_TaxInfo + '/input_FederalEIN_ReEnter-2'))

	
// Verify that MD Central Registration Number field is visible
		//WebUI.verifyElementVisible(findTestObject(orPath_TaxInfo + '/input_MDCRegistrationEL'))
		
		
		
// Verify Payment Amount is present and visible
		WebUI.verifyTextPresent('Payment Amount', true)
		WebUI.verifyElementPresent(findTestObject(orPath_Amount + '/input__paymentAmount'), 30)
		WebUI.verifyElementVisible(findTestObject(orPath_Amount + '/input__paymentAmount'))
		
		
// Verify Sevice Fee static text
		WebUI.verifyTextPresent('Service Fee: This electronic government service includes a service/convenience fee. Click here for details', true)
		WebUI.verifyElementPresent(findTestObject(orPath_Amount + '/a_Click here for details'), 30)

		
		
// Verify Continue button is present
		WebUI.verifyElementPresent(findTestObject(orPath_Landing + '/button_Continue'), 30)

