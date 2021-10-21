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
String orPath_MDForm202 = "Object Repository/RAD_Pages/MarylandForm202_Page"



	WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), "Sales and Use", false)


/*
 * 	#########################################################################
 * Verify Fields are present on the Maryland Form 202 section
 * 
 * 	########################################################################
 */
		

		WebUI.verifyElementPresent(findTestObject(orPath_MDForm202 + '/input__Line3'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_MDForm202 + '/input__Line4a'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_MDForm202 + '/input__Line5a'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_MDForm202 + '/input__Line6a'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_MDForm202 + '/input__Line8a'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_MDForm202 + '/input__Line12a'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_MDForm202 + '/input__Line13a'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_MDForm202 + '/input__Line15'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_MDForm202 + '/input__Line17a'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_MDForm202 + '/input__Line17b'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_MDForm202 + '/input__Line19a'), 30)
		
		WebUI.verifyElementPresent(findTestObject(orPath_MDForm202 + '/input__Line19b'), 30)
		
		