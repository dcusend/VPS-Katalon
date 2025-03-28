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
String nameSheet = "Personal_IND"
String dataFile = "RADTestData/MRF_Personal_IND"


String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
String orPath_TaxTypeFilingYear = "Object Repository/RAD_Pages/TaxTypeFilingYear_Page"
String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
String orPath_AddressContact = "Object Repository/RAD_Pages/AddressAndContactInfo_Page"
String orPath_Summary = "Object Repository/RAD_Pages/Summary_Page"
String orPath_PaymentConfirmation = "Object Repository/RAD_Pages/PaymentConfirmation_Page"
String orPath_ServiceFeesAccept = "Object Repository/RAD_Pages/ServiceFeeAccept_Page"
String orPath_PaymentEntry = "Object Repository/RAD_Pages/PaymentEntry_Page"

String orPath_TaxPayer = "Object Repository/RAD_Pages/Taxpayer_Page"

def ExecuteTC, TaxType, PaymentType, FilingYear, PeriodEndingMonth

def executionProfile = RC.getExecutionProfile()

def numOfRows = findTestData(dataFile).getRowNumbers()

	println("Number of Records: " + numOfRows)


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			TaxType = findTestData(dataFile).getValue('TaxType', row)
			PaymentType = findTestData(dataFile).getValue('PaymentType', row)
			FilingYear = findTestData(dataFile).getValue('Year', row)
			
			
			
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					KeywordUtil.logInfo('Payment Type: ' + PaymentType)
					KeywordUtil.logInfo('Tax Type: ' + TaxType)
					
					WebUI.openBrowser('')
					WebUI.maximizeWindow()
					WebUI.navigateToUrl(GlobalVariable.RADurl)
					
					
// Select Payment Type from the Main Index Page
					WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), PaymentType, false)
			
					
// Select Tax Type Tax from the Tax Type dropwown
					
					
					switch (PaymentType)
					{
						case "Quarterly Estimated Tax":
								WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PaymentType'),TaxType,false)
						break
						
						
										
						case "Extension Payments":
								WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PaymentType'),TaxType,false)
						break
		
		
						case "New Tax Return Amount Due":
								WebUI.selectOptionByLabel(findTestObject('Object Repository/RAD_Pages/Landing_Page/select_NewTaxReturnAmountDue_TaxType'),TaxType,false)
						break
						
					
					}
					
					
					
// Select Filing Year
					
				
						if ((!FilingYear.isEmpty()))
						{
							WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),FilingYear,false)
						}
						else {println("Year is not present in the Excel Spreadsheet")}
					
				
						
// Set Data SSN and Name under Taxpayer
						WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName')," ")
						WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName')," ")
						
						
						if (TaxType.equalsIgnoreCase("Estate Tax"))
							{
								WebUI.setText(findTestObject(orPath_TaxPayer + '/input_NewTax_DecedentSSN'), " ")
								WebUI.setText(findTestObject(orPath_TaxPayer + '/input_NewTax_ReTypeDecedentSSN'), " ")
							}
						else
							{
								WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatSSN'), " ")
								WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatReSSN'), " ")
							}
						
						
						
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
						
						WebUI.verifyTextPresent('Enter first name', true,FailureHandling.CONTINUE_ON_FAILURE)
						WebUI.verifyTextPresent('Enter last name', true,FailureHandling.CONTINUE_ON_FAILURE)
						
						WebUI.verifyTextPresent('Enter address', true,FailureHandling.CONTINUE_ON_FAILURE)
						WebUI.verifyTextPresent('Enter city', true,FailureHandling.CONTINUE_ON_FAILURE)
						WebUI.verifyTextPresent('Enter ZIP code', true,FailureHandling.CONTINUE_ON_FAILURE)
						WebUI.verifyTextPresent('Enter a valid phone number', true,FailureHandling.CONTINUE_ON_FAILURE)
						WebUI.verifyTextPresent('Enter Email', true,FailureHandling.CONTINUE_ON_FAILURE)
						
						
						
						if (TaxType.equalsIgnoreCase("Estate Tax"))
							{
								WebUI.verifyTextPresent('Please enter a valid Decedent SSN with 9 digits', true,FailureHandling.CONTINUE_ON_FAILURE)
								WebUI.verifyTextPresent('Re-type Decedent SSN Validation Error', true,FailureHandling.CONTINUE_ON_FAILURE)
							}
						else
							{
								WebUI.verifyTextPresent('Please enter a valid SSN with 9 digits', true,FailureHandling.CONTINUE_ON_FAILURE)
								WebUI.verifyTextPresent('Re-type SSN Validation Error', true,FailureHandling.CONTINUE_ON_FAILURE)
							}
						
						
						
						resText = "Pass"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)

					}
				
				
			}
			
						
						
