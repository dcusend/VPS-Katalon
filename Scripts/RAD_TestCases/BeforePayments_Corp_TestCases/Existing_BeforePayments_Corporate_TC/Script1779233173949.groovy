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

import com.kms.katalon.core.configuration.RunConfiguration


String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/RADTestData/BeforePaymentsCorp.xlsx"
String nameSheet = "Existing"
String dataFile = "RADTestData/BeforePaymentsCorp_Existing"


String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
String orPath_TaxTypeFilingYear = "Object Repository/RAD_Pages/TaxTypeFilingYear_Page"
String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
String orPath_AddressContact = "Object Repository/RAD_Pages/AddressAndContactInfo_Page"
String orPath_Summary = "Object Repository/RAD_Pages/Summary_Page"
String orPath_PaymentConfirmation = "Object Repository/RAD_Pages/PaymentConfirmation_Page"
String orPath_ServiceFeesAccept = "Object Repository/RAD_Pages/ServiceFeeAccept_Page"
String orPath_PaymentEntry = "Object Repository/RAD_Pages/PaymentEntry_Page"
String orPath_TaxInfo = "Object Repository/RAD_Pages/TaxInfo_Page"

def ExecuteTC, TaxType, PaymentType, FilingYear, PeriodEndingMonth, feinSsn, CRN, MFLicNum

def execProfile = RunConfiguration.getExecutionProfile()

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
			MFLicNum = findTestData(dataFile).getValue('MFLicNum', row)
			
			
			
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
	
					

					
					WebUI.delay(10)
					
// Set Data FEIN
					
					if (feinSsn.equalsIgnoreCase("Y"))
					{
						
						WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_TaxInfo_feinSsn_Existing_New'), 'RigbBhfdqODKcAsiUrg+1Q==')
						WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_TaxInfo_RetypefeinSsn_Existing_New'), 'RigbBhfdqODKcAsiUrg+1Q==')
						
						
						//WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_TaxInfo_feinSsn_Existing'), 'RigbBhfdqODKcAsiUrg+1Q==')
						//WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_TaxInfo_RefeinSsn_Existing'), 'RigbBhfdqODKcAsiUrg+1Q==')
						
						//WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_TaxInfo_FeinSsn_New_2'), 'RigbBhfdqODKcAsiUrg+1Q==')
						//WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_TaxInfo_RetypeFeinSsn_New_2'), 'RigbBhfdqODKcAsiUrg+1Q==')
						
						
					}
					else
					{
						if (!TaxType.equalsIgnoreCase("Estate Tax"))
							{
								WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_concat(id(, , data, , ))_Data'),'RigbBhfdqODKcAsiUrg+1Q==')
								WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_concat(id(, , data, , ))_Data (1)'),'RigbBhfdqODKcAsiUrg+1Q==')
							}
					}
					
					
					
					
					
// Set Data Invoice Number
					CustomKeywords.'rad.getSetDataRAD.setDataRADNoticeInvoiceThirteen'()
					
// Set Data Motor Fuel License Number
			if (MFLicNum.equalsIgnoreCase("Y"))
				{
					CustomKeywords.'rad.getSetDataRAD.setDataRADMFLicNumSixExisting'()
				}
					

// Populate MD Central Registration Number for Sales & Use, Alcohol, Tire Recycling and Withholding Tax only
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
						
						
					
// Populate Decedent SSN and Retype Decedent SSN for Estate Tax					
					if (TaxType.equalsIgnoreCase("Estate Tax"))
						{
							CustomKeywords.'rad.getSetDataRAD.setDataRADDecedentSSN'()
						}
					
					
					
// Populate Amount
					
					WebUI.setText(findTestObject(orPath_Amount + '/input__paymentAmount'),"10.00")
					
					
					//WebUI.setText(findTestObject(orPath_AddressContact + '/input_streetAddress2'),"")
		
		
// Select Continue Button
					//WebUI.scrollToElement(findTestObject(orPath_Landing + '/button_Continue'), 3)
					//WebUI.waitForElementClickable(findTestObject(orPath_Landing + '/button_Continue'),5)
					WebUI.delay(5)
					WebUI.click(findTestObject(orPath_Landing + '/button_Continue'))
		
		
// Verify Summary on Confirmation page
					
					
					WebUI.delay(2)
					
					
							


					
// Select Proceed to Payment button
					WebUI.click(findTestObject(orPath_Summary + '/button_Proceed to Payment'))
					WebUI.delay(2)
					
// Select Pay by Corporate Check
									
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/RAD_Pages/SelectPaymentMethod/PayByCorporateCheck'), 30))
		{
					
			WebUI.click(findTestObject('Object Repository/RAD_Pages/SelectPaymentMethod/PayByCorporateCheck'))
			
			WebUI.click(findTestObject('Object Repository/RAD_Pages/SelectPaymentMethod/button_MakeAPayment'))
			WebUI.delay(2)
					
					
// On the VRelay page, confirm fields are prepopulated
					//WebUI.verifyTextPresent('Comptroller of Maryland', true)
					//WebUI.verifyTextPresent('Existing Liability', true)
					//WebUI.verifyTextPresent(TaxType, true)
					
					
					
				if (WebUI.verifyElementPresent(findTestObject('Object Repository/RAD_Pages/PaymentEntryCorp_Page/Company_Name'), 30))
					
				{
					
					WebUI.verifyTextPresent('Comptroller of Maryland', true)
					WebUI.verifyTextPresent('Revenue Administration Division', true)
					WebUI.verifyTextPresent('Payment Information', true)
					WebUI.verifyTextPresent('Type of Account', true)
					WebUI.verifyTextPresent('Corporate Checking', true)
					WebUI.verifyTextPresent('Employer Identification Number', true)
					
					
					
					def first_Name = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntryCorp_Page/Company_Name'), 'value')
					WebUI.verifyMatch("", first_Name, false)
					
					def RTN = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntryCorp_Page/RoutingTransitNumber'), 'value')
					WebUI.verifyMatch("", RTN, false)
					
					def AccountNumber = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntryCorp_Page/AccountNumber'), 'value')
					WebUI.verifyMatch("", AccountNumber, false)
					
					def AccountNumberConfirm = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntryCorp_Page/AccountNumberConfirm'), 'value')
					WebUI.verifyMatch("", AccountNumberConfirm, false)
					
					def EIN = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntryCorp_Page/EINnumber'), 'value')
					WebUI.verifyMatch("", EIN, false)
										
					def AL1 = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input_billingAddress'), 'value')
					WebUI.verifyMatch("2508 Mandan Terrace", AL1, false)
					
					def AL2 = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input_billingAddress2'), 'value')
					WebUI.verifyMatch("", AL2, false)
					
					def zipCode = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input_billingZip'), 'value')
					WebUI.verifyMatch("21054", zipCode, false)
					
					def city = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input_billingCity'), 'value')
					WebUI.verifyMatch("GAMBRILLS", city, false)
					
					def email = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input_emailAddress_ACH'), 'value')
					WebUI.verifyMatch("iahmed@govolution.com", email, false)
					
										
					def amount = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input_amount'), 'value')
					WebUI.verifyMatch("10.00", amount, false)
					
					def amountReadOnly = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input_amount'), 'readonly')
					WebUI.verifyMatch("true", amountReadOnly, false)
					
					WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/select_Country'), 'United States', false, 20)
					
					WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/select_State'), 'Maryland', false, 20)
					
					if (execProfile != "QAProfile" && execProfile != "QA2Profile")
						{
							if (WebUI.verifyElementPresent(findTestObject('Object Repository/RAD_Pages/PaymentEntryPersonal_Page/btn_Continue_ACH'), 30))
							{
								resText = "Pass"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
							}
							else
							{
								resText = "Fail"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
							}
						}
					
				if (execProfile == "QAProfile" || execProfile == "QA2Profile")
					
				{
// Fix this section for Corporate
					WebUI.setText(findTestObject('Object Repository/RAD_Pages/PaymentEntryPersonal_Page/RoutingTransitNumber'),'256072691')
					WebUI.click(findTestObject('Object Repository/RAD_Pages/PaymentEntryPersonal_Page/radioBox_Checking'))
					WebUI.setText(findTestObject('Object Repository/RAD_Pages/PaymentEntryPersonal_Page/AccountNumber'),'65896543')
					WebUI.setText(findTestObject('Object Repository/RAD_Pages/PaymentEntryPersonal_Page/AccountNumberConfirm'),'65896543')
					WebUI.click(findTestObject('Object Repository/RAD_Pages/PaymentEntryPersonal_Page/chkBox_AcceptCondition'))
					

// Select Continue on VRelay Payment Entry page
					WebUI.click(findTestObject('Object Repository/RAD_Pages/PaymentEntryPersonal_Page/btn_Continue_ACH'))
									

// Select Confirm on Payment Confirmation Page
					WebUI.click(findTestObject(orPath_PaymentConfirmation + '/input_N_confirmNotifyAction'))
					
										
// Verify text on Dual CF Page
					
					WebUI.delay(2)
					
					WebUI.verifyTextPresent('Service Fee Acceptance', true)
					WebUI.verifyTextPresent('This transaction is subject to a Service Fee of ', true)
					WebUI.verifyTextPresent('Payment Amount:', true)
					WebUI.verifyTextPresent('10.00', true)
					WebUI.verifyTextPresent('Service Fee:', true)
					WebUI.verifyTextPresent('1.00', true)
					WebUI.verifyTextPresent('Total Amount:', true)
					WebUI.verifyTextPresent('11.00', true)
					WebUI.verifyTextPresent('Two transactions will appear on your bank statement, one in the amount of', true)
					
					
					if (WebUI.verifyElementPresent(findTestObject(orPath_ServiceFeesAccept + '/input_convFeeNotifyAction'), 30))
						{
							resText = "Pass"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
							
							//if (execProfile == "QAProfile" || execProfile == "QA2Profile")
							//	{
									WebUI.click(findTestObject(orPath_ServiceFeesAccept + '/input_convFeeNotifyAction'))
									WebUI.delay(10)
									WebUI.verifyTextPresent('Successful Payment Receipt', true)
							//	}
						}
						else
						{
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						}
					}
				}
				
				else
				{
					resText = "Fail"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
					KeywordUtil.markFailed("Vrelay page does not display.  Tax Type is : " + TaxType)
				}
				
					
		}
		else
			{
				resText = "Fail"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
					KeywordUtil.markFailed("Select Payment Method page does not display.  Tax Type is : " + TaxType)
			}
					
	
				}
			
			
		}
		
