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

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
//String fileLoc = "C:\\KatalonData\\RADTestData\\PaymentsELHardCoded.xlsx"
String fileLoc = "KatalonData/RADTestData/PaymentsELHardCoded.xlsx"
String nameSheet = "Sheet1"
String dataFile = "RADTestData/PaymentsELHardCoded"

def ExecuteTC, Taxtype, TaxTypeEL, FName, LName
def AL1, City, ZIP, Amount, CCNumber, CVV, SSN, FilingYear, FEIN, businessName, notInvNumber

Random rand = new Random()

//def i
//for (i = 1; i <= 5; i++)
//{


	def numOfRows = findTestData(dataFile).getRowNumbers()

	println("Number of Records: " + numOfRows)


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			Taxtype = findTestData(dataFile).getValue('TaxType', row)
			TaxTypeEL = findTestData(dataFile).getValue('TaxTypeEL', row)
			//FilingYear = findTestData(dataFile).getValue('FilingYear', row)
			FName = findTestData(dataFile).getValue('Fname', row)
			LName = findTestData(dataFile).getValue('Lname', row)
			AL1 = findTestData(dataFile).getValue('AL1', row)
			City = findTestData(dataFile).getValue('City', row)
			ZIP = findTestData(dataFile).getValue('ZIP', row)
			Amount = findTestData(dataFile).getValue('Amount', row)
			CCNumber = findTestData(dataFile).getValue('CCNumber', row)
			CVV = findTestData(dataFile).getValue('CVV', row)
			SSN = findTestData(dataFile).getValue('SSN', row)
			notInvNumber = findTestData(dataFile).getValue('NotiInvoNumber', row)
			//FEIN = findTestData(dataFile).getValue('FEIN', row)
			businessName = findTestData(dataFile).getValue('BusName', row)
			
			
			
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
					
					WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'),Taxtype , false)
					
					WebUI.delay(1)
					
					WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_TaxType_ExistingLiability'),TaxTypeEL , false)
					
					//WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_FilingYear'), FilingYear, false)
					
// Populate Tax Payer
					
					
					if (TaxTypeEL.equalsIgnoreCase("Fiduciary Tax") || TaxTypeEL.equalsIgnoreCase("Personal Tax"))
						{
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),FName)
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),LName)
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_middleName'),"Johns")
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_suffix'),"Sr")
						}
					else
						{
							WebUI.setText(findTestObject(orPath_TaxPayer + '/input_businessName'),businessName)
						}
					

					
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
					
					
					
// Populate Tax Information
					
					
					if (TaxTypeEL.equalsIgnoreCase("Personal Tax"))
							{
								WebUI.setText(findTestObject(orPath_TaxInfo +'/input_TaxInfo_ExisitingSSN'),SSN)
								WebUI.setText(findTestObject(orPath_TaxInfo + '/input_TaxInfo_reTaxTypeExisitingSSN'),SSN)
							}

					WebUI.scrollToElement(findTestObject(orPath_Amount + '/input__paymentAmount'), 3)
					
					//if (!FEIN.isEmpty())
					//{
					//	WebUI.setText(findTestObject(orPath_TaxInfo + '/input_FEIN'), FEIN)
					//	WebUI.setText(findTestObject(orPath_TaxInfo + '/input_ReTypeFEIN'), FEIN)
					//}
					
					if (!TaxTypeEL.equalsIgnoreCase("Personal Tax"))
					{
						//WebUI.setText(findTestObject(orPath_TaxInfo + '/input_FEIN'), FEIN)
						//WebUI.setText(findTestObject(orPath_TaxInfo + '/input_ReTypeFEIN'), FEIN)
						
						//WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_ReEnterFEIN'), 'RigbBhfdqODKcAsiUrg+1Q==')
						//WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_ReEnterFEIN'), 'RigbBhfdqODKcAsiUrg+1Q==')
						
						WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_concat(id(, , data, , ))_Data'),'RigbBhfdqODKcAsiUrg+1Q==')
						
						WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_concat(id(, , data, , ))_Data (1)'),'RigbBhfdqODKcAsiUrg+1Q==')			
					}
					
					//WebUI.verifyElementPresent(findTestObject(orPath_TaxInfo + '/input_FEIN'), 30)
					//WebUI.verifyElementPresent(findTestObject(orPath_TaxInfo + '/input_ReTypeFEIN'), 30)
					//WebUI.waitForElementClickable(findTestObject(orPath_TaxInfo + '/input_FEIN'),5)
					WebUI.delay(1)
					//WebUI.setEncryptedText(findTestObject('Object Repository/RAD_RecordAndPlay/input_The Social Security Number and Re-ent_e292a4'),
					//	'RigbBhfdqODKcAsiUrg+1Q==')
					
					//WebUI.setEncryptedText(findTestObject('Object Repository/RAD_RecordAndPlay/input_Federal EIN_reTaxTypeExisitingFEIN'), 'RigbBhfdqODKcAsiUrg+1Q==')
					//WebUI.scrollToElement(findTestObject(orPath_TaxInfo + '/input_FEIN'), 3)
					//WebUI.waitForElementClickable(findTestObject(orPath_TaxInfo + '/input_FEIN'),5)
					//WebUI.setText(findTestObject(orPath_TaxInfo + '/input_FEIN'),"123456789")
					//WebUI.setText(findTestObject(orPath_TaxInfo + '/input_ReTypeFEIN'),"123456789")
					
					//WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FEIN'), 'RigbBhfdqODKcAsiUrg+1Q==')
					//WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_ReTypeFEIN'), 'RigbBhfdqODKcAsiUrg+1Q==')
					//def rand_Num = rand.nextInt(1000000000)
					
					WebUI.setText(findTestObject(orPath_TaxInfo + '/input_NoticeInvoiceNumber'),notInvNumber)
					WebUI.setText(findTestObject(orPath_TaxInfo + '/input_reTypeNoticeInvoiceNumber'),notInvNumber)
					
					if (TaxTypeEL.equalsIgnoreCase("Sales & Use Tax") || TaxTypeEL.equalsIgnoreCase("Withholding Tax"))
					{
						println("TaxTypeEL : " + TaxTypeEL)
						WebUI.setText(findTestObject(orPath_TaxInfo + '/input_MDCRegistrationEL'),'07640126')
					}
					
					
// Populate Amount
					WebUI.setText(findTestObject(orPath_Amount + '/input__paymentAmount'),Amount)
					
					
					
// Select Continue Button
					WebUI.scrollToElement(findTestObject(orPath_Landing + '/button_Continue'), 3)
					WebUI.waitForElementClickable(findTestObject(orPath_Landing + '/button_Continue'),5)
					WebUI.click(findTestObject(orPath_Landing + '/button_Continue'))
					
					
// Verify Summary on Confirmation page
					WebUI.verifyTextPresent('Review the information below and make any necessary corrections by clicking the', true)
					WebUI.verifyTextPresent('When you are confident that all the information is correct', true)
					
					
					
			
					
					
					
// Select Proceed to Payment button
					WebUI.delay(1)
					//WebUI.waitForElementClickable(findTestObject(orPath_PaymentEntry + '/button_ProceedtoPayment'),5)
					WebUI.click(findTestObject(orPath_PaymentReady + '/button_ProceedtoPayment'))
					
					
// Populate Payment Entry page
					//if (TaxTypeEL.equalsIgnoreCase("Fiduciary Tax") || TaxTypeEL.equalsIgnoreCase("Personal Tax"))
						//{
							WebUI.setText(findTestObject('Object Repository/RAD_Pages/PaymentEntry_Page/input__billingName'), 'Anthony Gonzalez')
						//}
					
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