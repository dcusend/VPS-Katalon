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
String fileLoc = "KatalonData/RADTestData/Summary.xlsx"
String nameSheet = "Existing"
String dataFile = "RADTestData/Summary_Existing"


String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
String orPath_TaxTypeFilingYear = "Object Repository/RAD_Pages/TaxTypeFilingYear_Page"
String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
String orPath_AddressContact = "Object Repository/RAD_Pages/AddressAndContactInfo_Page"
String orPath_Summary = "Object Repository/RAD_Pages/Summary_Page"
String orPath_PaymentConfirmation = "Object Repository/RAD_Pages/PaymentConfirmation_Page"
String orPath_ServiceFeesAccept = "Object Repository/RAD_Pages/ServiceFeeAccept_Page"
String orPath_PaymentEntry = "Object Repository/RAD_Pages/PaymentEntry_Page"
String orPath_TaxInfo = "Object Repository/RAD_Pages/TaxInfo_Page"

def ExecuteTC, TaxType, PaymentType, FilingYear, PeriodEndingMonth, feinSsn, CRN



def numOfRows = findTestData(dataFile).getRowNumbers()

	println("Number of Records: " + numOfRows)


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			TaxType = findTestData(dataFile).getValue('TaxType', row)
			PaymentType = findTestData(dataFile).getValue('PaymentType', row)
			feinSsn = findTestData(dataFile).getValue('FEINSSN', row)
			CRN = findTestData(dataFile).getValue('CRN', row)
			
			
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					KeywordUtil.logInfo('Payment Type: Existing Liability with Notice/Invoice Number')
					KeywordUtil.logInfo('Tax Type: ' + TaxType)
					
					WebUI.openBrowser('')
					WebUI.maximizeWindow()
					WebUI.navigateToUrl(GlobalVariable.RADurl)
					
					
// Select Estimated Tax from the Main Index Page
					WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), "Existing Liability with Notice/Invoice Number", false)
			
					
// Select Fiduciary Tax from the Payment Type dropwown
					WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_TaxType_ExistingLiability'),TaxType,false)
					
					

					
// Set Data Business Name
					CustomKeywords.'rad.getSetDataRAD.setDataRADBusinessName'()
					
					
// Set Data Business Rep Name
					CustomKeywords.'rad.getSetDataRAD.setDataRADBusinessRep'()
					
					
// Set Data Address and Contact Information
					CustomKeywords.'rad.getSetDataRAD.setDataRADAddress'()
	
					

					
					
					
// Set Data FEIN
					
					if (feinSsn.equalsIgnoreCase("Y"))
					{
						//WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_TaxInfo_feinSsn_Existing'), 'RigbBhfdqODKcAsiUrg+1Q==')
						//WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_TaxInfo_RefeinSsn_Existing'), 'RigbBhfdqODKcAsiUrg+1Q==')
						
						//WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_TaxInfo_feinSsn_Existing'), 'px0FNUagnh7G/CVR/QiY+A==')
						//WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_TaxInfo_RefeinSsn_Existing'), 'px0FNUagnh7G/CVR/QiY+A==')
						
						WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_TaxInfo_feinSsn_Existing_New'), 'px0FNUagnh7G/CVR/QiY+A==')
						WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_TaxInfo_RetypefeinSsn_Existing_New'), 'px0FNUagnh7G/CVR/QiY+A==')
						
					}
					else
					{
						//WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_concat(id(, , data, , ))_Data'),'RigbBhfdqODKcAsiUrg+1Q==')
						//WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_concat(id(, , data, , ))_Data (1)'),'RigbBhfdqODKcAsiUrg+1Q==')
						
						WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_concat(id(, , data, , ))_Data'),'px0FNUagnh7G/CVR/QiY+A==')
						WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_concat(id(, , data, , ))_Data (1)'),'px0FNUagnh7G/CVR/QiY+A==')
						
					}
					
					
					
					
					
// Set Data Invoice Number
					CustomKeywords.'rad.getSetDataRAD.setDataRADNoticeInvoiceThirteen'()
					

// Populate MD Central Registration Number for some Tax Types
					/*
					 * switch (TaxType) { case "Sales & Use Tax":
					 * CustomKeywords.'rad.getSetDataRAD.setDataExistingRADMDCRN'() break
					 * 
					 * 
					 * case "Withholding Tax":
					 * CustomKeywords.'rad.getSetDataRAD.setDataExistingRADMDCRN'() break
					 * 
					 * 
					 * case "Tire Recycling Fee":
					 * CustomKeywords.'rad.getSetDataRAD.setDataExistingRADMDCRN'() break
					 * 
					 * case "Alcohol Tax":
					 * CustomKeywords.'rad.getSetDataRAD.setDataExistingRADMDCRN'() break
					 * 
					 * }
					 */

					if (CRN.equalsIgnoreCase("Y"))
						{
							CustomKeywords.'rad.getSetDataRAD.setDataExistingRADMDCRN'()
						}
					
									
					
// Populate Amount
					
					WebUI.setText(findTestObject(orPath_Amount + '/input__paymentAmount'),"100.00")
					
					
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_streetAddress2'),"")
		
		
// Select Continue Button
					WebUI.scrollToElement(findTestObject(orPath_Landing + '/button_Continue'), 3)
					WebUI.waitForElementClickable(findTestObject(orPath_Landing + '/button_Continue'),5)
					WebUI.click(findTestObject(orPath_Landing + '/button_Continue'))
		
		
// Verify Summary on Confirmation page
					
					
					WebUI.delay(2)
					
					
							
				
					
					
// Verify static text on RAD Quarterly Estimated Summary page
										
					WebUI.verifyTextPresent('Summary', true)
					WebUI.verifyTextPresent('Review the information below and make any necessary corrections by clicking the', true)
					WebUI.verifyTextPresent('When you are confident that all the information is correct, click the', true)
					WebUI.verifyTextPresent('Payment Type/Filing Year', true)
					WebUI.verifyTextPresent('Payment Type:', true)
					WebUI.verifyTextPresent('Existing Liability with Notice/Invoice Number', true)
					
					WebUI.verifyTextPresent('Payer Information', true)
					WebUI.verifyTextPresent('Taxpayer Name:', true)
					
// This is Defect 7194, Leave this code as it till the defect is fixed. 					
					if (!TaxType.equalsIgnoreCase("Sales & Use Tax"))
					{
						WebUI.verifyTextPresent('My Company', true)
					}
					
					WebUI.verifyTextPresent('Business Rep Name:', true)
					WebUI.verifyTextPresent('BusRepFname BusRepLname', true)
					
					WebUI.verifyTextPresent('Taxpayer Address:', true)
					WebUI.verifyTextPresent('2508 Mandan Terrace Gambrills Maryland 21054', true)
					WebUI.verifyTextPresent('Email:', true)
					WebUI.verifyTextPresent('iahmed@govolution.com', true)
					WebUI.verifyTextPresent('Phone:', true)
					WebUI.verifyTextPresent('(703) 894-5000', false)
					WebUI.verifyTextPresent('Tax Information', true)
					
					if (feinSsn.equalsIgnoreCase("Y"))
						{
							WebUI.verifyTextPresent('FEIN/SSN:', true)
							WebUI.verifyTextNotPresent('Federal EIN:', true)
							//WebUI.verifyTextPresent('XXXXX6789', true)
						}
					else
						{
							WebUI.verifyTextPresent('Federal EIN:', true)
							WebUI.verifyTextNotPresent('FEIN/SSN:', true)
								
						}
						
						
					
					WebUI.verifyTextPresent('XXXXX0532', true)
					
					WebUI.verifyTextPresent('Notice Or Invoice Number:', true)
					WebUI.verifyTextPresent('1234567890123', true)
					WebUI.verifyTextPresent('Tax Type:', true)
					WebUI.verifyTextPresent(TaxType, true)
					
					
					/*
					 * switch (TaxType) { case "Sales & Use Tax": WebUI.verifyTextPresent('MD
					 * Central Registration Number#:', true) WebUI.verifyTextPresent('07640126',
					 * true) break
					 * 
					 * 
					 * case "Withholding Tax": WebUI.verifyTextPresent('MD Central Registration
					 * Number#:', true) WebUI.verifyTextPresent('07640126', true) break
					 * 
					 * 
					 * case "Tire Recycling Fee": WebUI.verifyTextPresent('MD Central Registration
					 * Number#:', true) WebUI.verifyTextPresent('07640126', true) break
					 * 
					 * 
					 * case "Alcohol Tax": WebUI.verifyTextPresent('MD Central Registration
					 * Number#:', true) WebUI.verifyTextPresent('07640126', true) break
					 * 
					 * }
					 */
					
					if (CRN.equalsIgnoreCase("Y"))
						{
							WebUI.verifyTextPresent('MD Central Registration Number#:', true)
							WebUI.verifyTextPresent('07640126', true)
						}
					
						
						
						
					WebUI.verifyTextPresent('Payment Amount:', true)
					WebUI.verifyTextPresent('100.00', true)
					
					
					if (WebUI.verifyElementVisible(findTestObject(orPath_Summary + '/button_Proceed to Payment')))
						{
							resText = "Pass"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						}
					else
						{
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						}

					
// Select Proceed to Payment button
					WebUI.click(findTestObject(orPath_Summary + '/button_Proceed to Payment'))
					
					
					
					
					
					
	
				}
			
			
		}
		
