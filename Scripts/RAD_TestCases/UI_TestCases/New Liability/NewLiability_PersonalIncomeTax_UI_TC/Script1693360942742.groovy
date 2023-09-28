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
		WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), "New Tax Return Amount Due", false)

		
// Select Fiduciary Tax from the Payment Type dropwown
		WebUI.selectOptionByLabel(findTestObject('Object Repository/RAD_Pages/Landing_Page/select_NewTaxReturnAmountDue_TaxType'),'Personal Income Tax',false)
		
	
	
	
/* xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
 * Verify the fields are present in the Tax Type/Filing Year section
 *
 * xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
 */
	

		
	WebUI.verifyElementPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'), 30)
				
				
			
		def totalOptionsFilingYear = WebUI.getNumberOfTotalOption(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'))
			
		WebUI.verifyEqual(totalOptionsFilingYear, 4)
			
						
		WebUI.verifyOptionsPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),['2020','2021','2022'])
		
		
		
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
		
		WebUI.verifyTextPresent('Filing Status', true)
		
		WebUI.verifyTextPresent('Is this an Individual or Joint Filing?', true)
		
		WebUI.verifyTextPresent('Filing type', true)
		
		WebUI.verifyTextPresent('Individual Filing', true)
		
		WebUI.verifyTextPresent('Joint Filing', true)
		
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
		 
		WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_firstName'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_middleName'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_lastName'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_suffix'), 30)
		
//		WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_PSSN'), 30)
		
//		WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_reEnterPSSN'), 30)
		
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
		
		
		
// Verify that Notice or Invoice Number is not present
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxInfo + '/input_NoticeInvoiceNumber'))
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxInfo + '/input_reTypeNoticeInvoiceNumber'))
		
		
// Verify FEIN under Tax Information section is NOT visible
		//WebUI.verifyTextPresent('Tax Information', true)
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxInfo + '/input_FederalEIN-2'))
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxInfo + '/input_FederalEIN_ReEnter-2'))
		
		
// Verify that MD Central Registration Number field is NOT visible
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxInfo + '/input_MDCRegistrationEL'))
		
		
// Verify Business Name textbox is NOT present under Taxpayer section
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxPayer + '/input_Note_businessName'))
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxPayer + '/input_BusinessRepfirstName'))
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxPayer + '/input_BusinessRepmiddleName'))
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxPayer + '/input_BusinessReplastName'))
		WebUI.verifyElementNotVisible(findTestObject(orPath_TaxPayer + '/input_BusinessRepsuffix'))
		
		
/*
 * ######################################################
 * Verify Filing Status fields are present
 * in the Filing Status section
 * ######################################################
 */
		
		
		WebUI.verifyElementPresent(findTestObject(orPath_FilingStatus + '/input_userType_Individual'), 30)
		WebUI.verifyElementVisible(findTestObject(orPath_FilingStatus + '/input_userType_Individual'))
		WebUI.verifyElementPresent(findTestObject(orPath_FilingStatus + '/input_userType_Joint'), 30)
		WebUI.verifyElementVisible(findTestObject(orPath_FilingStatus + '/input_userType_Joint'))
		
		
/*
 * ####################################################
 * Verify Payment Amount field is present
 * in the Payment Amount section
 * ###################################################
 */
		
		WebUI.verifyElementPresent(findTestObject(orPath_Amount + '/input__paymentAmount'), 30)
		
		
		
/*
* #########################################################
* Verify Joint Filing fields are present
* in the Filing Status section
* ###########################################################
*/
		
		WebUI.delay(10)
				
		//WebUI.scrollToElement(findTestObject(orPath_FilingStatus + '/input_userType_Joint'), 3)
		
		WebUI.scrollToElement(findTestObject(orPath_Amount + '/input__paymentAmount'), 3)
		
		WebUI.waitForElementClickable(findTestObject(orPath_FilingStatus + '/input_userType_Joint'),5)
		
		WebUI.click(findTestObject(orPath_FilingStatus + '/input_userType_Joint'))
				
		WebUI.verifyTextPresent('Provide the following information for the joint filer', true)
				
		WebUI.verifyElementPresent(findTestObject(orPath_FilingStatus + '/input_jointFirstName'), 30)
				
		WebUI.verifyElementPresent(findTestObject(orPath_FilingStatus + '/input_jointMiddleName'), 30)
				
		WebUI.verifyElementPresent(findTestObject(orPath_FilingStatus + '/input_jointLastName'), 30)
				
		WebUI.verifyElementPresent(findTestObject(orPath_FilingStatus + '/input_jointSuffix'), 30)
				
//		WebUI.verifyElementPresent(findTestObject(orPath_FilingStatus + '/input_jointSSN'), 30)
				
//		WebUI.verifyElementPresent(findTestObject(orPath_FilingStatus + '/input_reEnterjointSSN'), 30)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/RAD_RecordAndPlay/input_JointFilerSSN'), 30)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/RAD_RecordAndPlay/input_reTypeJointFilerSSN'), 30)
				
				
		
// Verify Payment Amount is present and visible
		WebUI.verifyTextPresent('Payment Amount', true)
		WebUI.verifyElementPresent(findTestObject(orPath_Amount + '/input__paymentAmount'), 30)
		WebUI.verifyElementVisible(findTestObject(orPath_Amount + '/input__paymentAmount'))
		
		
// Verify Sevice Fee static text
		WebUI.verifyTextPresent('Service Fee: This electronic government service includes a service/convenience fee. Click here for details', true)
		WebUI.verifyElementPresent(findTestObject(orPath_Amount + '/a_Click here for details'), 30)

		
		
// Verify Continue button is present
		WebUI.verifyElementPresent(findTestObject(orPath_Landing + '/button_Continue'), 30)

		
		
// ####################################################