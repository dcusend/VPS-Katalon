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
String fileLoc = "KatalonData/RADTestData/SSNMismatchLastNameError.xlsx"
String nameSheet = "Personal_EL"
String dataFile = "RADTestData/SSNMismatchLastNameError_Peronal_EL"


String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
String orPath_TaxTypeFilingYear = "Object Repository/RAD_Pages/TaxTypeFilingYear_Page"
String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
String orPath_AddressContact = "Object Repository/RAD_Pages/AddressAndContactInfo_Page"
String orPath_Summary = "Object Repository/RAD_Pages/Summary_Page"
String orPath_PaymentConfirmation = "Object Repository/RAD_Pages/PaymentConfirmation_Page"
String orPath_ServiceFeesAccept = "Object Repository/RAD_Pages/ServiceFeeAccept_Page"
String orPath_PaymentEntry = "Object Repository/RAD_Pages/PaymentEntry_Page"
String orPath_TaxPayer = "Object Repository/RAD_Pages/Taxpayer_Page"
String orPath_TaxInfo = "Object Repository/RAD_Pages/TaxInfo_Page"

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
					WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_TaxType_ExistingLiability'),TaxType,false)
					
					
					
					WebUI.delay(2)
					
					WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),'Gaikwadi')
						

						
						
						
// Populate Decedent SSN and Retype Decedent SSN for Estate Tax
						if (TaxType.equalsIgnoreCase("Estate Tax"))
							{
								WebUI.setText(findTestObject(orPath_TaxInfo +'/input_DecedentSSN'),'123451234')
								WebUI.setText(findTestObject(orPath_TaxInfo + '/input_ReTypeDecedentSSN'),'')
							}
						else
							{
								WebUI.setText(findTestObject(orPath_TaxInfo +'/input_TaxInfo_ExisitingSSN'),'123451234')
								WebUI.setText(findTestObject(orPath_TaxInfo + '/input_TaxInfo_reTaxTypeExisitingSSN'),'')
							}
						
							WebUI.delay(2)
							
							
						if (WebUI.verifyTextPresent('SSN and Last Name do not match our records', true))
							{
								println "SSN and Last Name do not match our records"
								System.out.println('Pass Record Number: ' + row)
								resText = "Pass"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
							}
						else
							{
								println "SSN and Last Name do not match our records text is NOT present on " + TaxType + "page"
								System.out.println('Fail Record Number: ' + row)
								resText = "Fail"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
							}
			
			
		
					}
				
				
			}
			
						
						
