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

WebUI.navigateToUrl('https://qa.velocitypayment.com/client/rad/index.html')

WebUI.maximizeWindow()

WebUI.selectOptionByValue(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/select_Select    Estimated Tax    Personal _7587a1'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/select_Select202220212020'), 
    '2021', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'), 
    '01', true)

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_Note_businessName'), 'Some Business')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_Enter business name_firstName'), 
    'Lokhandwala')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_Enter first name_middleName'), 
    'K')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_Middle Name_lastName'), 
    'Express')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_Enter last name_suffix'), 
    'Sr')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_Select a country_streetAddress1'), 
    '458 Beltsville rd')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_Enter address_streetAddress2'), 
    'suite 100')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_Street Address 2_city'), 
    'Timonium')

WebUI.selectOptionByValue(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/select_SelectAlabamaAlaskaArizonaArkansasCa_90914a'), 
    'MD', true)

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_Select a state_zipCode'), 
    '21093')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_Enter ZIP code_phoneNumber'), 
    '(703) 894-5000')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_Enter a phone number_eMailAddress'), 
    'iahmed@govolution.com')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_Enter Email_reEnterEMailAddress'), 
    'iahmed@govolution.com')


WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_FederalEIN'), '0fDtEjy4ijeV75Gl5M+mSg==')
WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_FederalEIN_ReEnter'), '0fDtEjy4ijeV75Gl5M+mSg==')
WebUI.setText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_MDCRegistration'),"07640126")





WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__GrossSales1'), '3000.00')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__TaxableSales1'), '100.00')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__CarRental1'), '100.00')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__TruckRental1'), '100.00')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__AlcoholSales1'), '100.00')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__Purchases1'), '100.00')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__AlcoholPurchases1'), '100.00')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__Refund1'), '100.00')

//WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__Penalty1'), '100.00')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__PenaltyInterest1'), '100.00')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__E911Fee1'), '25.00')

//WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__E911Discount1'), '100.00')

WebUI.scrollToElement(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_Page/button_Continue'), 3)
WebUI.waitForElementClickable(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_Page/button_Continue'),5)

WebUI.click(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_Page/button_Continue'))

WebUI.click(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_Page/button_Proceed to Payment'))

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__cardNumber'), '4111111111111111')

WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__spc'), '123')

WebUI.selectOptionByValue(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/select_MM010203040506070809101112'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/select_YYYY20212022202320242025202620272028_8c4dd4'), 
    '2026', true)

WebUI.click(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_BillInvoice Details_ccSubmit'))

WebUI.click(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_163.50_confirmNotifyAction'))

WebUI.click(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input_167.51_convFeeNotifyAction'))

WebUI.delay(10)

WebUI.verifyTextPresent('Successful Payment Receipt', true)

WebUI.closeBrowser()

