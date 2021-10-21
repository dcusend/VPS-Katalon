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


// Select Marketplace Facilitator Checkbox

		WebUI.scrollToElement(findTestObject(orPath_SalesTaxReturnInfo + '/input_OutOfStateVendor'), 3)

		WebUI.click(findTestObject(orPath_SalesTaxReturnInfo + '/input_MarketplaceFacilitator'))
		
		WebUI.verifyTextPresent('Maryland Form 202F', true)
		
		WebUI.verifyTextPresent('To be completed by marketplace facilitator. Refer to your Maryland Sales Tax Instructions to complete the following.', true)
		
		WebUI.verifyTextPresent('Maryland Form 202', true)
		
		WebUI.verifyTextPresent('Refer to your Maryland Sales Tax Instructions to complete the following', true)
		
		WebUI.verifyTextPresent('Maryland Form 202', true)
		
		WebUI.verifyTextPresent('Refer to your Maryland Sales Tax Instructions to complete the following', true)