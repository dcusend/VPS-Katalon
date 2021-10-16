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
String orPath_TaxInfo = "Object Repository/RAD_Pages/TaxInfo_Page"
String orPath_Withholding = "Object Repository/RAD_Pages/Withholding_Page"
String orPath_FilingStatus = "Object Repository/RAD_Pages/FilingStatus_Page"
String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"



WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), "Withholding Tax", false)




/* xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
* Verify the fields are present in the Tax Type/Filing Year section
*
* xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
*/


	
	WebUI.verifyElementPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'), 30)
		
		
	def totalOptionsFilingYear = WebUI.getNumberOfTotalOption(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'))
		
	WebUI.verifyEqual(totalOptionsFilingYear, 4)
		
				
		
	WebUI.verifyOptionsPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),['2022','2021','2020'])
	
	
/*
* #############################################
* Verify Static Text is present on the page
* ##############################################
*/
	
	
	
	WebUI.verifyTextPresent('Tax Type/Filing Year', true)
	
	WebUI.verifyTextPresent('Taxpayer', true)
	
	WebUI.verifyTextPresent('Provide the following taxpayer information', true)
	
	WebUI.verifyTextPresent('Note: If you are paying on behalf of the Taxpayer, enter Taxpayer', true)
	
	WebUI.verifyTextPresent('information here. If you are making a payment for the Taxpayer, you will be required later to enter your own credit card, billing address and other pertinent information', true)
	
	WebUI.verifyTextPresent('Address and Contact Information', true)
	
	WebUI.verifyTextPresent('Enter the taxpayer', true)
	
	WebUI.verifyTextPresent('address and contact information', true)
	
	WebUI.verifyTextPresent('Tax Information', true)
	
	WebUI.verifyTextPresent('Withholding', true)
	
	WebUI.verifyTextPresent('Are you filing on an accelerated basis?', true)
	
	WebUI.verifyTextPresent('Yes', true)
	
	WebUI.verifyTextPresent('No', true)
	
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
	 
	WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_businessName'), 30)
	
	WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_firstName'), 30)
	
	WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_middleName'), 30)
	
	WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_lastName'), 30)
	
	WebUI.verifyElementPresent(findTestObject(orPath_TaxPayer + '/input_suffix'), 30)
	
	
	
	
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
	
	
	
/*
 * #######################################################################
 * Verify Tax Information fields are present 
 * in the Tax Information section 
 * #######################################################################
 */
	
	
	WebUI.verifyElementPresent(findTestObject(orPath_TaxInfo + '/input_FEIN'), 30)
	
	WebUI.verifyElementPresent(findTestObject(orPath_TaxInfo + '/input_ReTypeFEIN'), 30)
	
	WebUI.verifyElementPresent(findTestObject(orPath_TaxInfo + '/input_MDCRegistration'), 30)
	
	
	
/*
 * #################################################################
 * Verify Withholding fields are present
 * in the Withholding section
 * #################################################################
 */
	
	WebUI.scrollToElement(findTestObject(orPath_Withholding + '/input_acceleratedBasis_Yes'), 3)
	
	WebUI.verifyElementPresent(findTestObject(orPath_Withholding + '/input_acceleratedBasis_Yes'), 30)
	
	WebUI.verifyElementPresent(findTestObject(orPath_Withholding + '/input_acceleratedBasis_No'), 30)
	
	WebUI.verifyElementPresent(findTestObject(orPath_Withholding + '/input_PayDate'), 30)
	
	WebUI.verifyElementPresent(findTestObject(orPath_Withholding + '/input__WithholdingTaxReported'), 30)
	
	
	WebUI.scrollToElement(findTestObject(orPath_Withholding + '/input_acceleratedBasis_No'), 3)
	
	WebUI.click(findTestObject(orPath_Withholding + '/input_acceleratedBasis_No'))
	
	
	WebUI.verifyElementPresent(findTestObject(orPath_Withholding + '/select_Month'), 30)
	
	WebUI.verifyElementPresent(findTestObject(orPath_Withholding + '/input__WithholdingTaxReported'), 30)
	
	
	def totalOptionsPeriodEnding = WebUI.getNumberOfTotalOption(findTestObject(orPath_Withholding + '/select_Month'))
		
	WebUI.verifyEqual(totalOptionsPeriodEnding, 13)
		
	WebUI.verifyOptionsPresent(findTestObject(orPath_Withholding + '/select_Month'),['January','February','March','April','May','June'])
	
	WebUI.verifyOptionsPresent(findTestObject(orPath_Withholding + '/select_Month'),['July','August','September','October','November','December'])
	
	
	
	
/*
* ####################################################
* Verify Payment Amount field is present
* in the Payment Amount section
* ###################################################
*/
	
	WebUI.verifyElementPresent(findTestObject(orPath_Amount + '/input__paymentAmount'), 30)
	
	

	
	
// ####################################################
	