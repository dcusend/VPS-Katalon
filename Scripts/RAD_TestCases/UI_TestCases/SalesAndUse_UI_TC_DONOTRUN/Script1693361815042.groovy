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
String orPath_SalesTaxReturnInfo = "Object Repository/RAD_Pages/SalesTaxReturnInfo_Page"



WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), "Sales and Use", false)




/* xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
* Verify the fields are present in the Tax Type/Filing Year section
*
* xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
*/

// Filing Year
	
	WebUI.verifyElementPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'), 30)
		
		
	def totalOptionsFilingYear = WebUI.getNumberOfTotalOption(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'))
		
	WebUI.verifyEqual(totalOptionsFilingYear, 4)
		
			
	WebUI.verifyOptionsPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),['2021','2022','2023'])
	
	
	
// Period Ending
	
	
	WebUI.verifyElementPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'), 30)
	
	
	def totalOptionsPeriodEnding = WebUI.getNumberOfTotalOption(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'))
	
	WebUI.verifyEqual(totalOptionsPeriodEnding, 13)
	
		
	WebUI.verifyOptionsPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'),['January','February','March','April','May','June'])
	
	WebUI.verifyOptionsPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'),['July','August','September','October','November','December'])
	
		
	
	
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
	
	WebUI.verifyTextPresent('Sales Tax Return Information', true)
	
	WebUI.verifyTextPresent('Check here if you are a marketplace facilitator', true)
	
	WebUI.verifyTextPresent('Check here if you are a person that engages in the business of an out-of-state vendor and in the previous calendar year you either', true)
	
	WebUI.verifyTextPresent('in gross revenue from the sale of tangible personal property or taxable services delivered in the State', true)
	
	WebUI.verifyTextPresent('sold tangible personal property or taxable services for delivery into the State in 200 or more separate transactions', true)
	
	WebUI.verifyTextPresent('Maryland Form 202', true)
	
	WebUI.verifyTextPresent('Refer to your Maryland Sales Tax Instructions to complete the following', true)
	
	WebUI.verifyTextPresent('Lines 19.a. through 19.c. are for returns with period end dates later than 7-1-2013', true)
	
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
	
	
	//WebUI.verifyElementPresent(findTestObject(orPath_TaxInfo + '/input_FEIN'), 30)
	
	//WebUI.verifyElementPresent(findTestObject(orPath_TaxInfo + '/input_ReTypeFEIN'), 30)
	
	WebUI.verifyElementVisible(findTestObject(orPath_TaxInfo + '/input_FederalEIN'))
	WebUI.verifyElementVisible(findTestObject(orPath_TaxInfo + '/input_FederalEIN_ReEnter'))
	
	
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/RAD_RecordAndPlay/input_MDCRegistration'), 30)
	
	
	
/*
 * ########################################################################
 * Verify Sales Tax Return Information checkboxes
 * are present in the Sales Tax Return Information section
 * ########################################################################	
 */
	
	WebUI.verifyElementPresent(findTestObject(orPath_SalesTaxReturnInfo + '/input_MarketplaceFacilitator'), 30)
	
	WebUI.verifyElementPresent(findTestObject(orPath_SalesTaxReturnInfo + '/input_OutOfStateVendor'), 30)
	
	
	
	
	
/*
* ####################################################################
* Verify Payment Amount and Payment Amount Due fields are present
* in the Payment Amount section
* #####################################################################
*/
	
	WebUI.verifyElementPresent(findTestObject(orPath_Amount + '/input__paymentAmount'), 30)
	
	WebUI.verifyElementPresent(findTestObject(orPath_Amount + '/input__PaymentDue1'), 30)

	
	
// ####################################################
	
	
// Select 2 Years in the Past
// All 12 months should be displayed
	
	WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),"2021",false)
	
	
	def totalOptionsPeriodEnding2 = WebUI.getNumberOfTotalOption(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'))
	
	WebUI.verifyEqual(totalOptionsPeriodEnding2, 13)
	
	//WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'), 'January', false, 30)
	//WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'), 'February', false, 30)
	//WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'), 'March', false, 30)
	//WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'), 'April', false, 30)
	//WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'), 'May', false, 30)
	//WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'), 'June', false, 30)
		
	WebUI.verifyOptionsPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'),['January','February','March','April','May','June'])
	WebUI.verifyOptionsPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'),['July','August','September','October','November','December'])
	
	
// Select 1 Year in the Past
// All Months should be displayed
	
	WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),"2022",false)
	
	
	def totalOptionsPeriodEnding3 = WebUI.getNumberOfTotalOption(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'))
	
	WebUI.verifyEqual(totalOptionsPeriodEnding3, 13)
			
	WebUI.verifyOptionsPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'),['January','February','March','April','May','June'])
	
	WebUI.verifyOptionsPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'),['July','August','September','October','November','December'])
	
	
// Select Current Year
// Only First 6 months should be displayed
	
	WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),"2023",false)
	
	
	def totalOptionsPeriodEnding4 = WebUI.getNumberOfTotalOption(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'))
	
	WebUI.verifyEqual(totalOptionsPeriodEnding4, 7)
			
	WebUI.verifyOptionsPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'),['January','February','March','April','May','June'])
	
	//WebUI.verifyOptionsPresent(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'),['July','August','September','October','November','December'])
	
	WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'), 'July', false, 30)
	WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'), 'August', false, 30)
	WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'), 'September', false, 30)
	WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'), 'October', false, 30)
	WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'), 'November', false, 30)
	WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'), 'December', false, 30)
			
	
// Select Next Year
// Only first 6 months should be displayed
	
	/*
	 * WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear +
	 * '/select_FilingYear'),"2022",false)
	 * 
	 * 
	 * def totalOptionsPeriodEnding5 =
	 * WebUI.getNumberOfTotalOption(findTestObject(orPath_TaxTypeFilingYear +
	 * '/select_PeriodEnding'))
	 * 
	 * WebUI.verifyEqual(totalOptionsPeriodEnding5, 7)
	 * 
	 * WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear +
	 * '/select_PeriodEnding'), 'July', false, 30)
	 * WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear +
	 * '/select_PeriodEnding'), 'August', false, 30)
	 * WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear +
	 * '/select_PeriodEnding'), 'September', false, 30)
	 * WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear +
	 * '/select_PeriodEnding'), 'October', false, 30)
	 * WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear +
	 * '/select_PeriodEnding'), 'November', false, 30)
	 * WebUI.verifyOptionNotPresentByValue(findTestObject(orPath_TaxTypeFilingYear +
	 * '/select_PeriodEnding'), 'December', false, 30)
	 * 
	 * WebUI.verifyOptionsPresent(findTestObject(orPath_TaxTypeFilingYear +
	 * '/select_PeriodEnding'),['January','February','March','April','May','June'])
	 */
	
	