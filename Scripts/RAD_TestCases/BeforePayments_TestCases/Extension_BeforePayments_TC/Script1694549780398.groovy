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
String fileLoc = "KatalonData/RADTestData/BeforePayments.xlsx"
String nameSheet = "Extension"
String dataFile = "RADTestData/BeforePayments_Extension"


String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
String orPath_TaxTypeFilingYear = "Object Repository/RAD_Pages/TaxTypeFilingYear_Page"
String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
String orPath_AddressContact = "Object Repository/RAD_Pages/AddressAndContactInfo_Page"
String orPath_Summary = "Object Repository/RAD_Pages/Summary_Page"
String orPath_PaymentConfirmation = "Object Repository/RAD_Pages/PaymentConfirmation_Page"
String orPath_ServiceFeesAccept = "Object Repository/RAD_Pages/ServiceFeeAccept_Page"
String orPath_PaymentEntry = "Object Repository/RAD_Pages/PaymentEntry_Page"

def ExecuteTC, TaxType, PaymentType, FilingYear, PeriodEndingMonth, feinSSN

def execProfile = RunConfiguration.getExecutionProfile()


def numOfRows = findTestData(dataFile).getRowNumbers()

	println("Number of Records: " + numOfRows)


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			TaxType = findTestData(dataFile).getValue('TaxType', row)
			PaymentType = findTestData(dataFile).getValue('PaymentType', row)
			FilingYear = findTestData(dataFile).getValue('Year', row)
			PeriodEndingMonth = findTestData(dataFile).getValue('Month', row)
			feinSSN = findTestData(dataFile).getValue('FeinSsn', row)
			
			
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					KeywordUtil.logInfo('Payment Type: Extension Payments')
					KeywordUtil.logInfo('Tax Type: ' + TaxType)
					
					WebUI.openBrowser('')
					WebUI.maximizeWindow()
					WebUI.navigateToUrl(GlobalVariable.RADurl)
					
					
// Select Estimated Tax from the Main Index Page
					WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), "Extension Payments", false)
			
					
// Select Fiduciary Tax from the Payment Type dropwown
					WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PaymentType'),TaxType,false)
					
					
// Select Filing Year and Month
					WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),FilingYear,false)
					
					
// Select Period Ending Month for Corporate Income Tax only
					
					switch (TaxType)
					{
						case "Corporate Income Tax":
								WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'),PeriodEndingMonth,false)
						break
					
					}
					
// Set Data Business Name
					CustomKeywords.'rad.getSetDataRAD.setDataRADBusinessName'()
					
					
// Set Data Business Rep Name
					CustomKeywords.'rad.getSetDataRAD.setDataRADBusinessRep'()
					
					
					
					
// Set Data Address and Contact Information
					CustomKeywords.'rad.getSetDataRAD.setDataRADAddress'()
					
					
// Set Data FEIN
					if (feinSSN.equalsIgnoreCase("Y"))
					{
						CustomKeywords.'rad.getSetDataRAD.setDataRADFEINSSN'()
					}
					else
					{
						CustomKeywords.'rad.getSetDataRAD.setDataRADFEIN'()
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
					
					
							
					/*
					 * if (WebUI.verifyTextPresent('Review the information below and make any
					 * necessary corrections by clicking the', true)) { println
					 * "Transaction was Successful" System.out.println('Pass Record Number: ' + row)
					 * resText = "Pass"
					 * CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn
					 * ,fileLoc,nameSheet,row) } else { println "Transaction was NOT Successful"
					 * System.out.println('Fail Record Number: ' + row) resText = "Fail"
					 * CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn
					 * ,fileLoc,nameSheet,row) }
					 */
		
					
					
// Verify static text on RAD Quarterly Estimated Summary page
										
					/*
					 * WebUI.verifyTextPresent('Summary', true) WebUI.verifyTextPresent('Review the
					 * information below and make any necessary corrections by clicking the', true)
					 * WebUI.verifyTextPresent('When you are confident that all the information is
					 * correct, click the', true) WebUI.verifyTextPresent('Payment Type/Filing
					 * Year', true) WebUI.verifyTextPresent('Payment Type:', true)
					 * WebUI.verifyTextPresent('Extension Payments', true)
					 * WebUI.verifyTextPresent('Filing Year:', true)
					 * WebUI.verifyTextPresent(FilingYear, true)
					 * 
					 * 
					 * switch (TaxType) { case "Corporate Income Tax":
					 * WebUI.verifyTextPresent('Period Ending:', true)
					 * WebUI.verifyTextPresent(PeriodEndingMonth, true) break
					 * 
					 * }
					 * 
					 * 
					 * 
					 * WebUI.verifyTextPresent('Payer Information', true)
					 * WebUI.verifyTextPresent('Taxpayer Name:', true) WebUI.verifyTextPresent('My
					 * Company', true) WebUI.verifyTextPresent('Business Rep Name:', true)
					 * WebUI.verifyTextPresent('BusRepFname BusRepLname', true)
					 * WebUI.verifyTextPresent('Taxpayer Address:', true)
					 * WebUI.verifyTextPresent('2508 Mandan Terrace Gambrills Maryland 21054', true)
					 * WebUI.verifyTextPresent('Email:', true)
					 * WebUI.verifyTextPresent('iahmed@govolution.com', true)
					 * WebUI.verifyTextPresent('Phone:', true) WebUI.verifyTextPresent('(703)
					 * 894-5000', false) WebUI.verifyTextPresent('Tax Information', true)
					 * WebUI.verifyTextPresent('Federal EIN:', true)
					 * WebUI.verifyTextPresent('Payment Amount:', true)
					 * WebUI.verifyTextPresent('100.00', true)
					 */

					
// Select Proceed to Payment button
					WebUI.click(findTestObject(orPath_Summary + '/button_Proceed to Payment'))
					
					
					
// On the VRelay page, confirm fields are prepopulated
					
					
				if (WebUI.verifyElementPresent(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input__billingName'), 30))
						
					{
					
					WebUI.verifyTextPresent('Comptroller of Maryland', true)
					WebUI.verifyTextPresent('Revenue Administration Division', true)
					WebUI.verifyTextPresent('Payment Information', true)
					
					def card_Name = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input__billingName'), 'value')
					WebUI.verifyMatch("BusRepFname BusRepLname", card_Name, false)
					
					def AL1 = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input_billingAddress'), 'value')
					WebUI.verifyMatch("2508 Mandan Terrace", AL1, false)
					
					def AL2 = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input_billingAddress2'), 'value')
					WebUI.verifyMatch("", AL2, false)
					
					def zipCode = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input_billingZip'), 'value')
					WebUI.verifyMatch("21054", zipCode, false)
					
					def city = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input_billingCity'), 'value')
					WebUI.verifyMatch("GAMBRILLS", city, false)
					
					def email = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input_emailAddress'), 'value')
					WebUI.verifyMatch("iahmed@govolution.com", email, false)
					
					def amount = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input_amount'), 'value')
					WebUI.verifyMatch("100.00", amount, false)
					
					def amountReadOnly = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input_amount'), 'readonly')
					WebUI.verifyMatch("true", amountReadOnly, false)
					
					WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/select_Country'), 'United States', false, 20)
					
					WebUI.verifyOptionSelectedByLabel(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/select_State'), 'Maryland', false, 20)
					
					
					//WebUI.setText(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input__billingName'), 'Anthony Gonzalez')
					WebUI.setText(findTestObject(orPath_PaymentEntry + '/input__cardNumber'),'4111111111111111')
					WebUI.setText(findTestObject(orPath_PaymentEntry + '/input__spc'),'123')
					WebUI.selectOptionByLabel(findTestObject(orPath_PaymentEntry + '/select_MM'),"12",false)
					WebUI.selectOptionByLabel(findTestObject(orPath_PaymentEntry + '/select_YYYY'),"2028",false)
					

// Select Continue on VRelay Payment Entry page
					WebUI.click(findTestObject(orPath_PaymentEntry + '/input_Field_ccSubmit'))
									

// Select Confirm on Payment Confirmation Page
					WebUI.click(findTestObject(orPath_PaymentConfirmation + '/input_N_confirmNotifyAction'))
					
										
// Verify text on Dual CF Page
					
					
					
					WebUI.verifyTextPresent('Service Fee Acceptance', true)
					WebUI.verifyTextPresent('This transaction is subject to a Service Fee of ', true)
					WebUI.verifyTextPresent('Payment Amount:', true)
					WebUI.verifyTextPresent('100.00', true)
					WebUI.verifyTextPresent('Service Fee:', true)
					WebUI.verifyTextPresent('2.45', true)
					WebUI.verifyTextPresent('Total Amount:', true)
					WebUI.verifyTextPresent('102.45', true)
					WebUI.verifyTextPresent('Two transactions will appear on your bank statement, one in the amount of', true)
					
					
						if (WebUI.verifyElementPresent(findTestObject(orPath_ServiceFeesAccept + '/input_convFeeNotifyAction'), 30))
						{
							resText = "Pass"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
							
							if (execProfile == "QAProfile" || execProfile == "QA2Profile")
								{
									WebUI.click(findTestObject(orPath_ServiceFeesAccept + '/input_convFeeNotifyAction'))
									WebUI.delay(10)
									WebUI.verifyTextPresent('Successful Payment Receipt', true)
								}
						}
						else
						{
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						}
					
				}
				
				else
				{
					resText = "Fail"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				}
				
					
					
					
	
				}
			
			
		}
		
	
