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
String nameSheet = "Personal_EL"
String dataFile = "RADTestData/Summary_Personal_EL"


String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
String orPath_TaxTypeFilingYear = "Object Repository/RAD_Pages/TaxTypeFilingYear_Page"
String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
String orPath_AddressContact = "Object Repository/RAD_Pages/AddressAndContactInfo_Page"
String orPath_Summary = "Object Repository/RAD_Pages/Summary_Page"
String orPath_PaymentConfirmation = "Object Repository/RAD_Pages/PaymentConfirmation_Page"
String orPath_ServiceFeesAccept = "Object Repository/RAD_Pages/ServiceFeeAccept_Page"
String orPath_PaymentEntry = "Object Repository/RAD_Pages/PaymentEntry_Page"

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
					
					
					

				
						
// Set Name under Taxpayer
						CustomKeywords.'rad.getSetDataRAD.setDataRADNameOnly'()
						
						
// Set Data Address and Contact Information
						CustomKeywords.'rad.getSetDataRAD.setDataRADAddress'()
						
						

						
						
						
// Populate Decedent SSN and Retype Decedent SSN for Estate Tax
						if (TaxType.equalsIgnoreCase("Estate Tax"))
							{
								CustomKeywords.'rad.getSetDataRAD.setDataRADDecedentSSN'()
							}
						else
							{
								CustomKeywords.'rad.getSetDataRAD.setDataRADELSSN'()
							}
						
						
// Set Data Notice Number
						CustomKeywords.'rad.getSetDataRAD.setDataRADNoticeInvoiceThirteen'()
						
						
						
// Populate Amount
						
						WebUI.setText(findTestObject(orPath_Amount + '/input__paymentAmount'),"100.00")
						
						
						WebUI.setText(findTestObject(orPath_AddressContact + '/input_streetAddress2'),"")
			
			
// Select Continue Button
						WebUI.scrollToElement(findTestObject(orPath_Landing + '/button_Continue'), 3)
						WebUI.waitForElementClickable(findTestObject(orPath_Landing + '/button_Continue'),5)
						WebUI.click(findTestObject(orPath_Landing + '/button_Continue'))
			
			
// Verify Summary on Confirmation page
						
						
						WebUI.delay(2)
						
					
						
						
	// Verify static text on RAD  Summary page
											
						WebUI.verifyTextPresent('Summary', true)
						WebUI.verifyTextPresent('Review the information below and make any necessary corrections by clicking the', true)
						WebUI.verifyTextPresent('When you are confident that all the information is correct, click the', true)
						WebUI.verifyTextPresent('Payment Type/Filing Year', true)
						WebUI.verifyTextPresent('Payment Type:', true)
						WebUI.verifyTextPresent(PaymentType, true)
												
						WebUI.verifyTextPresent('Payer Information', true)
						WebUI.verifyTextPresent('Taxpayer Name:', true)
						
						switch (executionProfile)
						{
							case "QA2Profile":
									WebUI.verifyTextPresent('Jimmy Anderson', true)
									
									if (TaxType.equalsIgnoreCase("Estate Tax"))
										{
											WebUI.verifyTextPresent('xxxxx1234', true)
										}
									else
										{
											WebUI.verifyTextPresent('XXXXX1234', true)
										}
									
									
							break
							
							case "DemoProfile":
									WebUI.verifyTextPresent('Jimmy btes', true)
									
									if (TaxType.equalsIgnoreCase("Estate Tax"))
										{
											WebUI.verifyTextPresent('xxxxx6724', true)
										}
									else
										{
											WebUI.verifyTextPresent('XXXXX6724', true)
										}
									
									
							break
						}
						
						
						//WebUI.verifyTextPresent('Jimmy Anderson', true)
						
						WebUI.verifyTextPresent('Taxpayer Address:', true)
						WebUI.verifyTextPresent('2508 Mandan Terrace Gambrills Maryland 21054', true)
						WebUI.verifyTextPresent('Email:', true)
						WebUI.verifyTextPresent('iahmed@govolution.com', true)
						WebUI.verifyTextPresent('Phone:', true)
						WebUI.verifyTextPresent('(703) 894-5000', false)
						WebUI.verifyTextPresent('Tax Information', true)
						
						
						WebUI.verifyTextPresent('Notice Number:', true)
						WebUI.verifyTextPresent('1234567890123', true)
						//WebUI.verifyTextPresent('Notice Number:', true)
						WebUI.verifyTextPresent('Tax Type:', true)
						
						
						WebUI.verifyTextPresent('Payment Amount:', true)
						WebUI.verifyTextPresent('100.00', true)
						
						WebUI.verifyTextNotPresent('Federal EIN:', true)
						WebUI.verifyTextNotPresent('FEIN/SSN:', true)
						
						
						if (TaxType.equalsIgnoreCase("Estate Tax"))
							{
								WebUI.verifyTextPresent('Decedent SSN:', true)
								WebUI.verifyTextPresent('Estate Tax', true)
							}
						else
							{
								WebUI.verifyTextPresent('Social Security Number:', true)
								WebUI.verifyTextPresent('Personal Income Tax', true)
							}
							
							
						
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
			
						
						
