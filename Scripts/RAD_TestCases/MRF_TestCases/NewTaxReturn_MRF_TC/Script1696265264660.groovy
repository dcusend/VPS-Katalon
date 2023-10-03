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


import com.kms.katalon.core.configuration.RunConfiguration as RC
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/RADTestData/MRF.xlsx"
String nameSheet = "NewTaxReturn"
String dataFile = "RADTestData/MRF_NewTaxReturn"


String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
String orPath_TaxTypeFilingYear = "Object Repository/RAD_Pages/TaxTypeFilingYear_Page"
String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
String orPath_AddressContact = "Object Repository/RAD_Pages/AddressAndContactInfo_Page"
String orPath_Summary = "Object Repository/RAD_Pages/Summary_Page"
String orPath_PaymentConfirmation = "Object Repository/RAD_Pages/PaymentConfirmation_Page"
String orPath_ServiceFeesAccept = "Object Repository/RAD_Pages/ServiceFeeAccept_Page"
String orPath_PaymentEntry = "Object Repository/RAD_Pages/PaymentEntry_Page"

String orPath_TaxPayer = "Object Repository/RAD_Pages/Taxpayer_Page"

def ExecuteTC, TaxType, PaymentType, FilingYear, PeriodEndingMonth, feinSSN



def numOfRows = findTestData(dataFile).getRowNumbers()

	println("Number of Records: " + numOfRows)


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			TaxType = findTestData(dataFile).getValue('TaxType', row)
			PaymentType = findTestData(dataFile).getValue('PaymentType', row)
			FilingYear = findTestData(dataFile).getValue('Year', row)
			feinSSN = findTestData(dataFile).getValue('FeinSsn', row)
			
			
			
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					KeywordUtil.logInfo('Payment Type: New Tax Return Amount Due')
					KeywordUtil.logInfo('Tax Type: ' + TaxType)
					
					WebUI.openBrowser('')
					WebUI.maximizeWindow()
					WebUI.navigateToUrl(GlobalVariable.RADurl)
					
					
// Select Estimated Tax from the Main Index Page
					WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), "New Tax Return Amount Due", false)
			
					
// Select Fiduciary Tax from the Payment Type dropwown
					WebUI.selectOptionByLabel(findTestObject('Object Repository/RAD_Pages/Landing_Page/select_NewTaxReturnAmountDue_TaxType'),TaxType,false)
					
					
// Select Filing Year
					WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),FilingYear,false)
					
					
// Set Data Business Name
					WebUI.setText(findTestObject(orPath_TaxPayer + '/input_businessName')," ")
					
					
// Set Data Business Rep Name
					WebUI.setText(findTestObject(orPath_TaxPayer + '/input_BusinessRepfirstName')," ")
					
					WebUI.setText(findTestObject(orPath_TaxPayer + '/input_BusinessReplastName')," ")
					


					
					
// Set Data Address and Contact Information
					
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_streetAddress1')," ")
					
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_city')," ")
					
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_zipCode')," ")
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_phoneNumber')," ")
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_eMailAddress')," ")
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_reEnterEMailAddress')," ")
	

// Verify Error Messages
					resText = "Fail"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
					
					WebUI.verifyTextPresent('Enter business name', true,FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Enter business rep first name', true,FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Enter business rep last name', true,FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Enter address', true,FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Enter city', true,FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Enter ZIP code', true,FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Enter a valid phone number', true,FailureHandling.CONTINUE_ON_FAILURE)
					WebUI.verifyTextPresent('Enter Email', true,FailureHandling.CONTINUE_ON_FAILURE)
					
					resText = "Pass"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				}
			
			
		}
		
	