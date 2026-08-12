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

import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject


String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/RADTestData/MFInsNumLessThanSixError.xlsx"
String nameSheet = "MFInsNumLessThanSixError"
String dataFile = "RADTestData/MFInsNumLessThanSixError"

def ExecuteTC, Taxtype, Paymenttype, expectedErrorMsg



	def numOfRows = findTestData(dataFile).getRowNumbers()
	println("Number of Records: " + numOfRows)

	
	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			Taxtype = findTestData(dataFile).getValue('TaxType', row)
			Paymenttype = findTestData(dataFile).getValue('PaymentType', row)
			

			
						
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					Taxtype = findTestData(dataFile).getValue('TaxType', row)
					System.out.println('Taxtype value is : ' + Taxtype)
					
					
					
					
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
					String orPath_Withholding = "Object Repository/RAD_Pages/Withholding_Page"
					String orPath_Summary = "Object Repository/RAD_Pages/Summary_Page"
					String orPath_PaymentReady = "Object Repository/RAD_Pages/PaymentReady_Page"
					String orPath_PaymentEntry = "Object Repository/RAD_Pages/PaymentEntry_Page"
					String orPath_PaymentConfirmation = "Object Repository/RAD_Pages/PaymentConfirmation_Page"
					String orPath_ServiceFeesAccept = "Object Repository/RAD_Pages/ServiceFeeAccept_Page"
					
					
					// Populate Tax Type/Filing Year
					
					WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'),Paymenttype , false)
					
					WebUI.delay(2)
					
					
// Tax Type dropdown is different
					
					switch (Paymenttype)
					{
						
//						case "Existing Liability with Notice/Invoice Number":
//								WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_TaxType_ExistingLiability'),Taxtype , false)
//								WebUI.scrollToElement(findTestObject(orPath_Amount + '/input__paymentAmount'), 2, FailureHandling.CONTINUE_ON_FAILURE)
//								WebUI.setText(findTestObject(orPath_TaxInfo + '/input_MFLicenseExtLi'),"1234")
//								expectedErrorMsg = "Motor Fuel License Number must be 5 or 6 digits in length, with a value greater than zero"
//						
//						break
						
						
//						case "Quarterly Estimated Tax":
//								WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PaymentType'),Taxtype,false)
//								WebUI.scrollToElement(findTestObject(orPath_Amount + '/input__paymentAmount'), 2, FailureHandling.CONTINUE_ON_FAILURE)
//						
//						break
						
						
//						case "Extension Payments":
//								WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PaymentType'),Taxtype,false)
//								WebUI.scrollToElement(findTestObject(orPath_Amount + '/input__paymentAmount'), 2, FailureHandling.CONTINUE_ON_FAILURE)
//						
//						break
						
						
						case "New Tax Return Amount Due":
								WebUI.selectOptionByLabel(findTestObject('Object Repository/RAD_Pages/Landing_Page/select_NewTaxReturnAmountDue_TaxType'),Taxtype,false)
								WebUI.scrollToElement(findTestObject(orPath_Amount + '/input__paymentAmount'), 2, FailureHandling.CONTINUE_ON_FAILURE)
								WebUI.setText(findTestObject(orPath_TaxInfo + '/input_MotorFuelInsNum'),"12345")
								expectedErrorMsg = "Motor Fuel Inspection Number must be 6 digits in length, with a value greater than zero"
						
						break
						
						
					}
					

					WebUI.delay(1)
					
	

					WebUI.setText(findTestObject(orPath_Amount + '/input__paymentAmount'),"")
					
					WebUI.delay(2)
					
					WebUI.verifyTextPresent(expectedErrorMsg, true)
					
					if (WebUI.verifyTextPresent(expectedErrorMsg, true))
						{
							println "Error Message is present on the page"
							System.out.println('Pass Record Number: ' + row)
							resText = "Pass"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						}
					else
						{
							println "Error Message is NOT present on the page"
							System.out.println('Fail Record Number: ' + row)
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						}
					
						
				}
			
			
		}