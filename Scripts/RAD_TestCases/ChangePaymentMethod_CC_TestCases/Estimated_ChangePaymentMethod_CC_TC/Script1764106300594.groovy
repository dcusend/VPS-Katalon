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
String fileLoc = "KatalonData/RADTestData/ChangePaymentMethod.xlsx"
String nameSheet = "Estimated"
String dataFile = "RADTestData/ChangePaymentMethod_Estimated"


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
					
					KeywordUtil.logInfo('Payment Type: Quarterly Estimated Tax')
					KeywordUtil.logInfo('Tax Type: ' + TaxType)
					
					WebUI.openBrowser('')
					WebUI.maximizeWindow()
					WebUI.navigateToUrl(GlobalVariable.RADurl)
					
					
// Select Estimated Tax from the Main Index Page
					WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), "Quarterly Estimated Tax", false)
			
					
// Select Fiduciary Tax from the Payment Type dropwown
					WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PaymentType'),TaxType,false)
					
					
// Select Filing Year and Month
					WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),FilingYear,false)
					WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'),PeriodEndingMonth,false)
					
// Set Data Business Name
					CustomKeywords.'rad.getSetDataRAD.setDataRADBusinessName'()
					
					
// Set Data Business Rep Name
					CustomKeywords.'rad.getSetDataRAD.setDataRADBusinessRep'()
					
					
// Set Data Address and Contact Information
					CustomKeywords.'rad.getSetDataRAD.setDataRADAddress'()
				
					WebUI.delay(10)
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
					
					WebUI.setText(findTestObject(orPath_Amount + '/input__paymentAmount'),"10.00")
					
					
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_streetAddress2'),"")
		
		
// Select Continue Button
					WebUI.scrollToElement(findTestObject(orPath_Landing + '/button_Continue'), 3)
					WebUI.waitForElementClickable(findTestObject(orPath_Landing + '/button_Continue'),5)
					WebUI.delay(5)
					WebUI.click(findTestObject(orPath_Landing + '/button_Continue'))
					WebUI.delay(2)
		

				
		

					
// Select Proceed to Payment button					
					WebUI.click(findTestObject(orPath_Summary + '/button_Proceed to Payment'))
					WebUI.delay(2)
					
// Select Pay by Credit or Debit Card
									
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/RAD_Pages/SelectPaymentMethod/PayByCreditCard'), 30))
		{
					
			WebUI.click(findTestObject('Object Repository/RAD_Pages/SelectPaymentMethod/PayByCreditCard'))
			
			WebUI.click(findTestObject('Object Repository/RAD_Pages/SelectPaymentMethod/button_MakeAPayment'))
			WebUI.delay(2)
			
// On the VRelay page, select Change Payment Metod button
					
					
				if (WebUI.verifyElementPresent(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input__billingName'), 30))
					
				{
					
					WebUI.click(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/btn_ChangePaymentMethod'))
					WebUI.delay(2)
					

// Verify that Select Payment Method page displays
					
					def isRequiredTextPresent = false
					
					
					if(WebUI.verifyTextPresent('Select Payment Method', true))
						{
							isRequiredTextPresent = true
						}
					else
						{
							isRequiredTextPresent = false
						}
					
						
						
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyTextPresent('Please Choose the Method of Payment', true))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
						
						
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyElementPresent(findTestObject('Object Repository/RAD_Pages/SelectPaymentMethod/PayByCreditCard'), 30))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
						
					
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyElementPresent(findTestObject('Object Repository/RAD_Pages/SelectPaymentMethod/PayByPersonalCheck'), 30))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
					
					
							
						if(isRequiredTextPresent)
							{
									if(WebUI.verifyElementPresent(findTestObject('Object Repository/RAD_Pages/SelectPaymentMethod/PayByCorporateCheck'), 30))
										{
											isRequiredTextPresent = true
										}
									else
										{
											isRequiredTextPresent = false
										}
							}
							
							
							if (isRequiredTextPresent)
								{
									println "All the static text and elements are present"
									KeywordUtil.markPassed("All the static text and elements are present")
									resText = "Pass"
									CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				
								}
							else
								{
									println "One or more static text or elements are missing for Tax Type " + TaxType
									KeywordUtil.markFailed("One or more static text or elements are missing for Tax Type " + TaxType)
									resText = "Fail"
									CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
								}
							
					
					
					
					//resText = "Pass"
					//CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				}
					
				else
					{
						resText = "Fail"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						KeywordUtil.markFailed("Credit Card Payment Entry page does not display.  Tax Type is : Estimated " + TaxType)
					
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
			
			
		
		
    