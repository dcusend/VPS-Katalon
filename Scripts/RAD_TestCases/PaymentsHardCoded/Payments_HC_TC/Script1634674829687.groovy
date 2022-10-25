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
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement


String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
//String fileLoc = "C:\\KatalonData\\RADTestData\\PaymentsHardCoded.xlsx"
String fileLoc = "KatalonData/RADTestData/PaymentsHardCoded.xlsx"
String nameSheet = "Sheet1"
String dataFile = "RADTestData/PaymentsHardCoded"

def ExecuteTC, Taxtype, PaymentType, FilingYear, PeriodEnding, FName, LName, SSN
def AL1, City, ZIP, FilingType, Withholding, Amount, CCNumber, CVV

//def i
//for (i = 1; i <= 5; i++)
//{
	def numOfRows = findTestData(dataFile).getRowNumbers()

	println("Number of Records: " + numOfRows)


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			PaymentType = findTestData(dataFile).getValue('PaymentType', row)
			FilingYear = findTestData(dataFile).getValue('FilingYear', row)
			PeriodEnding = findTestData(dataFile).getValue('PeriodEnding', row)
			FName = findTestData(dataFile).getValue('Fname', row)
			LName = findTestData(dataFile).getValue('Lname', row)
			SSN = findTestData(dataFile).getValue('SSN', row)
			BusName = findTestData(dataFile).getValue('BusName', row)
			AL1 = findTestData(dataFile).getValue('AL1', row)
			City = findTestData(dataFile).getValue('City', row)
			ZIP = findTestData(dataFile).getValue('ZIP', row)
			FilingType = findTestData(dataFile).getValue('FilingType', row)
			Withholding = findTestData(dataFile).getValue('Withholding', row)
			Amount = findTestData(dataFile).getValue('Amount', row)
			CCNumber = findTestData(dataFile).getValue('CCNumber', row)
			CVV = findTestData(dataFile).getValue('CVV', row)
			
			
			
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
					
					
					
					
					
					WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'),Taxtype , false)
					
					WebUI.delay(3)
					
					
// Populate Tax Type/Filing Year 					
					switch (Taxtype)
					{
						case "Estimated Tax":
							WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PaymentType'),PaymentType,false)
							WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),FilingYear,false)
							//WebUI.setText(findTestObject(orPath_TaxPayer + '/input_PSSN'),SSN)
							//WebUI.setText(findTestObject(orPath_TaxPayer + '/input_reEnterPSSN'),SSN)
							//WebUI.waitForElementClickable(findTestObject('RAD_RecordAndPlay/input_concatSSN'),5)
							
							//WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),FName)
							
								if (PaymentType.equalsIgnoreCase("Personal"))
									{
										if (FilingType.equalsIgnoreCase("Y"))
											{
												WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),FName)
												WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),LName)
												WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatSSN'), SSN)
												WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatReSSN'), SSN)
												WebUI.check(findTestObject(orPath_FilingStatus + '/input_userType_Individual'))
											}
										else
											{
												WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatSSN'), SSN)
												WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatReSSN'), SSN)
												
												WebUI.scrollToElement(findTestObject(orPath_Amount + '/input__paymentAmount'), 3)
												WebUI.waitForElementClickable(findTestObject(orPath_FilingStatus + '/input_userType_Joint'),5)
												WebUI.check(findTestObject(orPath_FilingStatus + '/input_userType_Joint'))
												WebUI.delay(3)
												WebUI.setText(findTestObject(orPath_FilingStatus + '/input_jointFirstName'),"Katrina")
												WebUI.setText(findTestObject(orPath_FilingStatus + '/input_jointLastName'),"Stokes")
												WebUI.setText(findTestObject('Object Repository/RAD_RecordAndPlay/input_JointFilerSSN'),"123443210")
												WebUI.setText(findTestObject('Object Repository/RAD_RecordAndPlay/input_reTypeJointFilerSSN'),"123443210")
												
											}
									}
								else if (PaymentType.equalsIgnoreCase("Corporate"))
									{
										WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'),PeriodEnding,false)
										WebUI.setText(findTestObject(orPath_TaxPayer + '/input_businessName'),BusName)
										WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN'), '0fDtEjy4ijeV75Gl5M+mSg==')
										WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN_ReEnter'), '0fDtEjy4ijeV75Gl5M+mSg==')
									}
						break
						
						case "Personal Income Tax":
							WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),FilingYear,false)
							//WebUI.setText(findTestObject(orPath_TaxPayer + '/input_PSSN'),SSN)
							//WebUI.setText(findTestObject(orPath_TaxPayer + '/input_reEnterPSSN'),SSN)
							//WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),FName)
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),FName)
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),LName)
							WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatSSN'), SSN)
							WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatReSSN'), SSN)
							
							if (FilingType.equalsIgnoreCase("Y"))
								{
									WebUI.check(findTestObject(orPath_FilingStatus + '/input_userType_Individual'))
								}
							else
								{
									WebUI.scrollToElement(findTestObject(orPath_Amount + '/input__paymentAmount'), 3)
									WebUI.waitForElementClickable(findTestObject(orPath_FilingStatus + '/input_userType_Joint'),5)
									WebUI.check(findTestObject(orPath_FilingStatus + '/input_userType_Joint'))
									WebUI.delay(3)
									WebUI.setText(findTestObject(orPath_FilingStatus + '/input_jointFirstName'),"Sam")
									WebUI.setText(findTestObject(orPath_FilingStatus + '/input_jointLastName'),"Stokes")
									WebUI.setText(findTestObject('Object Repository/RAD_RecordAndPlay/input_JointFilerSSN'),"123453210")
									WebUI.setText(findTestObject('Object Repository/RAD_RecordAndPlay/input_reTypeJointFilerSSN'),"123453210")
								}
							
							break
							
						case "Extension Payments":
							WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PaymentType'),PaymentType,false)
							WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),FilingYear,false)
							//WebUI.setText(findTestObject(orPath_TaxPayer + '/input_PSSN'),SSN)
							//WebUI.setText(findTestObject(orPath_TaxPayer + '/input_reEnterPSSN'),SSN)
							//WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),FName)

							if (PaymentType.equalsIgnoreCase("Personal"))
								{
									if (FilingType.equalsIgnoreCase("Y"))
										{
											WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),FName)
											WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),LName)
											WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatSSN'), SSN)
											WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatReSSN'), SSN)
											WebUI.check(findTestObject(orPath_FilingStatus + '/input_userType_Individual'))
										}
									else
										{
											WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatSSN'), SSN)
											WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatReSSN'), SSN)
											WebUI.scrollToElement(findTestObject(orPath_Amount + '/input__paymentAmount'), 3)
											WebUI.waitForElementClickable(findTestObject(orPath_FilingStatus + '/input_userType_Joint'),5)
											WebUI.check(findTestObject(orPath_FilingStatus + '/input_userType_Joint'))
											WebUI.delay(3)
											WebUI.setText(findTestObject(orPath_FilingStatus + '/input_jointFirstName'),"Sam")
											WebUI.setText(findTestObject(orPath_FilingStatus + '/input_jointLastName'),"Stokes")
											WebUI.setText(findTestObject('Object Repository/RAD_RecordAndPlay/input_JointFilerSSN'),"123443210")
											WebUI.setText(findTestObject('Object Repository/RAD_RecordAndPlay/input_reTypeJointFilerSSN'),"123443210")
										}
								}
							else if (PaymentType.equalsIgnoreCase("Corporate"))
								{
									WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'),PeriodEnding,false)
									WebUI.setText(findTestObject(orPath_TaxPayer + '/input_businessName'),BusName)
									WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN'), '0fDtEjy4ijeV75Gl5M+mSg==')
									WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN_ReEnter'), '0fDtEjy4ijeV75Gl5M+mSg==')
								}
							break
							
						case "Sales and Use":
							WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),FilingYear,false)
							WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'),PeriodEnding,false)
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_businessName'),BusName)
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),FName)
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),LName)
							//WebUI.setText(findTestObject(orPath_TaxInfo + '/input_FEIN'),"325696543")
							//WebUI.setText(findTestObject(orPath_TaxInfo + '/input_ReTypeFEIN'),"325696543")
							WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN'), '0fDtEjy4ijeV75Gl5M+mSg==')
							WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN_ReEnter'), '0fDtEjy4ijeV75Gl5M+mSg==')
							WebUI.setText(findTestObject(orPath_TaxInfo + '/input_MDCRegistration'),"07640126")
							
							//WebUI.verifyElementVisible(findTestObject(orPath_TaxPayer + '/input_firstName'))
							if (WebUI.verifyElementVisible(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__GrossSales1'),FailureHandling.OPTIONAL))
									{
										WebUI.scrollToElement(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__GrossSales1'), 3)
										WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_BeforeJuly2021_Page/input__GrossSales1'),'100.00')
									}
									
							if (WebUI.verifyElementVisible(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_Page/input__GrossSales2'),FailureHandling.OPTIONAL))
									{
										WebUI.scrollToElement(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_Page/input__GrossSales2'), 3)
										WebUI.setText(findTestObject('Object Repository/RAD_Pages/SAU_MDForm202_Page/input__GrossSales2'),'100.00')
									}
							
							break
							
						case "Withholding Tax":
							WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'),FilingYear,false)
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_businessName'),BusName)
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),FName)
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),LName)
							//WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),FName)
							//WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),FName)
							//WebUI.setText(findTestObject(orPath_TaxInfo + '/input_FEIN'),"325695432")
							//WebUI.setText(findTestObject(orPath_TaxInfo + '/input_ReTypeFEIN'),"325695432")
							WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN'), 'xLVb905G4/sGR8qgNWNzNQ==')
							WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN_ReEnter'), 'xLVb905G4/sGR8qgNWNzNQ==')
							WebUI.setText(findTestObject(orPath_TaxInfo + '/input_MDCRegistration'),"07640126")
							
							
							if (Withholding.equalsIgnoreCase("Y"))
								{
									WebUI.scrollToElement(findTestObject(orPath_Landing + '/button_Continue'), 3)
									//WebUI.waitForElementClickable(findTestObject(orPath_Landing + '/input_acceleratedBasis_Yes'),5)
									WebUI.check(findTestObject(orPath_Withholding + '/input_acceleratedBasis_Yes'))
									WebUI.delay(3)
									def nowDate = new Date().format('MM/dd/yyyy')
									WebUI.executeJavaScript("document.getElementById('payDate').removeAttribute('readonly')", null)
									WebUI.setText(findTestObject(orPath_Withholding + '/input_PayDate'),nowDate)
									WebUI.setText(findTestObject(orPath_Withholding + '/input__WithholdingTaxReported'),"10.50")
									
								}
							else
								{
									WebUI.check(findTestObject(orPath_Withholding + '/input_acceleratedBasis_No'))
									WebUI.delay(3)
									WebUI.selectOptionByLabel(findTestObject(orPath_Withholding + '/select_Month'),"January",false)
									WebUI.setText(findTestObject(orPath_Withholding + '/input__WithholdingTaxReported'),"10.50")
									
								}
							
							break
					}
										
					
										
//	Populate Taxpayer
					if (PaymentType.equalsIgnoreCase("Personal"))
						{
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),FName)
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),LName)
						}
					//WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),FName)
															
					//WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),LName)
					
					
					
// Populate Address and Contact Information					
					WebUI.selectOptionByLabel(findTestObject(orPath_AddressContact + '/select_Country'),"United States",false)
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_streetAddress1'),AL1)
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_streetAddress2'),"")
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_city'),City)
					WebUI.selectOptionByLabel(findTestObject(orPath_AddressContact + '/select_State'),"Maryland",false)
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_zipCode'),ZIP)
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_phoneNumber'),"(703) 894-5000")
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_eMailAddress'),"iahmed@govolution.com")
					WebUI.setText(findTestObject(orPath_AddressContact + '/input_reEnterEMailAddress'),"iahmed@govolution.com")
					
					
// Populate Amount
								
					WebUI.setText(findTestObject(orPath_Amount + '/input__paymentAmount'),Amount)
					
					
// Select Continue Button				
					WebUI.scrollToElement(findTestObject(orPath_Landing + '/button_Continue'), 3)
					WebUI.waitForElementClickable(findTestObject(orPath_Landing + '/button_Continue'),5)
					WebUI.click(findTestObject(orPath_Landing + '/button_Continue'))
					
					
// Verify Summary on Confirmation page
					WebUI.verifyTextPresent('Review the information below and make any necessary corrections by clicking the', true)
					WebUI.verifyTextPresent('When you are confident that all the information is correct', true)
					
					//WebUI.scrollToElement(findTestObject(orPath_Summary + '/button_Continue_Summary'), 3)
					//WebUI.waitForElementClickable(findTestObject(orPath_Summary + '/button_Proceed to Payment'),5)
					WebUI.delay(1)
					//WebUI.click(findTestObject(orPath_Summary + '/button_Continue_Summary'))
					WebUI.click(findTestObject(orPath_Summary + '/button_Proceed to Payment'))
					//WebElement element = WebUiCommonHelper.findWebElement(findTestObject(orPath_Summary + '/button_Continue_Summary'),30)
					//WebUI.executeJavaScript("arguments[0].click", Arrays.asList(element))
					
					
// Select Proceed to Payment button
//					WebUI.delay(3)
//				//WebUI.waitForElementClickable(findTestObject(orPath_PaymentEntry + '/button_ProceedtoPayment'),5)
//				WebUI.click(findTestObject(orPath_PaymentReady + '/button_ProceedtoPayment'))
					
					
// Populate Payment Entry page
					if (PaymentType.equalsIgnoreCase("Corporate"))
						{
							WebUI.setText(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input__billingName'), 'Anthony Gonzalez')
						}
					WebUI.setText(findTestObject(orPath_PaymentEntry + '/input__cardNumber'),CCNumber)
					WebUI.setText(findTestObject(orPath_PaymentEntry + '/input__spc'),CVV)
					WebUI.selectOptionByLabel(findTestObject(orPath_PaymentEntry + '/select_MM'),"12",false)
					WebUI.selectOptionByLabel(findTestObject(orPath_PaymentEntry + '/select_YYYY'),"2023",false)
					WebUI.click(findTestObject(orPath_PaymentEntry + '/input_Field_ccSubmit'))
					
					
					
					
// Select Confirm on Payment Confirmation Page
					WebUI.click(findTestObject(orPath_PaymentConfirmation + '/input_N_confirmNotifyAction'))
					

// Select Accept Fee
					WebUI.click(findTestObject(orPath_ServiceFeesAccept + '/input_convFeeNotifyAction'))
					
					
// Verify Successful Payment					
					WebUI.delay(10)
					
					
					WebUI.verifyTextPresent('Successful Payment Receipt', true)
					
					if (WebUI.verifyTextPresent('Successful Payment Receipt', true))
						{
							println "Transaction was Successful"
							System.out.println('Pass Record Number: ' + row)
							resText = "Pass"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						}
					else
						{
							println "Transaction was NOT Successful"
							System.out.println('Fail Record Number: ' + row)
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						}
				}
		
		
		}
		
//}		