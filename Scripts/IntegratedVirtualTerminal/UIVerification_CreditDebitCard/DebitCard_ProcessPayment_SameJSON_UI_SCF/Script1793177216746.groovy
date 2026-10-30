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
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.util.KeywordUtil
import java.text.DecimalFormat
import java.util.Random
import org.apache.commons.lang.RandomStringUtils
import org.openqa.selenium.Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import java.awt.Robot
import java.awt.event.KeyEvent
import org.openqa.selenium.chrome.ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.support.ui.Select

	
	def Url, Environment, UserName, Password, PartnerToken, JSONBody
	
	def DueAmount_Out
	
	def DebitCard_UI, ExpirationDate_UI, Email_UI, Phone_UI, Country_UI, Address_UI, Zip_UI, State_UI, City_UI,
		UDF1_UI, UDF2_UI, UDF3_UI, UDF4_UI, UDF5_UI, UDF6_UI, UDF7_UI, UDF8_UI, UDF9_UI, UDF10_UI
	
	def	CardNo_Out, ExpMM_Out, ExpYYYY_Out, SecurityCode_Out, Name_Out,
		Email_Out, Phone_Out, PaymentDate_Out, Country_Out, Address_Out, Zip_Out, State_Out, City_Out,
		UDF1_Out, UDF2_Out, UDF3_Out, UDF4_Out, UDF5_Out, UDF6_Out, UDF7_Out, UDF8_Out, UDF9_Out, UDF10_Out

	def fileLoc, nameSheet, dataFile, numOfRows, isRequiredTextPresent= false, submitData, parcelData, creditDebitData
	
	

def executionProfile = RC.getExecutionProfile()

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"


switch(executionProfile)
{
	case "QAProfile":
			 Url = "https://dev-algorithm.govolution.com/vvtapi/VVTAPI_FORM_POST_TEST_PAGE.html"
			 UserName = GlobalVariable.IVTUserName
			 Password = GlobalVariable.IVTPassword
			 PartnerToken= GlobalVariable.IVTPartnerToken
						  
		fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_Login.xlsx'
		nameSheet = 'SubmitRequest'
		dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_Login.xlsx', nameSheet, true)
		
		break
		
	case "QA2Profile":
			 Url = "https://dev-algorithm.govolution.com/vvtapi/VVTAPI_FORM_POST_TEST_PAGE.html"
			 UserName = GlobalVariable.IVTUserName
			 Password = GlobalVariable.IVTPassword
			 PartnerToken= GlobalVariable.IVTPartnerToken
						  
		fileLoc = 'KatalonData/IVT/IVT_SameJSON_UI_SCF.xlsx'
		nameSheet = 'Submit_SameJson_Ui_SCF'
		dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/IVT/IVT_SameJSON_UI_SCF.xlsx', nameSheet, true)
	
		break
				
	case "DemoProfile":
			 Url = "https://dev-algorithm.govolution.com/vvtapi/VVTAPI_FORM_POST_TEST_PAGE.html"
			 UserName = GlobalVariable.IVTUserName
			 Password = GlobalVariable.IVTPassword
			 PartnerToken= GlobalVariable.IVTPartnerToken
						  
		fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_Login.xlsx'
		nameSheet = 'SubmitRequest'
		dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_Login.xlsx', nameSheet, true)

		break
		
	case "Production":
			 Url = "https://dev-algorithm.govolution.com/vvtapi/VVTAPI_FORM_POST_TEST_PAGE.html"
			 UserName = GlobalVariable.IVTUserName
			 Password = GlobalVariable.IVTPassword
			 PartnerToken= GlobalVariable.IVTPartnerToken
						  
		fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_Login.xlsx'
		nameSheet = 'SubmitRequest'
		dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_Login.xlsx', nameSheet, true)

		break
			
}


numOfRows = dataFile.getRowNumbers()
println("Number of Records: " + numOfRows)


// For each row in the spreadsheet, execute the given steps
for (def row = 1; row <= numOfRows; row++)
	{
	
		ExecuteTC = dataFile.getValue('Execute', row)
		System.out.println('Value of Execute is : ' + ExecuteTC)
		
		
		if (ExecuteTC.equalsIgnoreCase("Y"))
			{
				System.out.println('Begin Record Number: ' + row)
	
								
				 
switch(executionProfile)
{
	case "QAProfile":
				 Environment = dataFile.getValue("Environment", row)
				 JSONBody = dataFile.getValue("JSONBody", row)

			break
						
	case "QA2Profile":
				 Environment = dataFile.getValue("Environment", row)
				 JSONBody = dataFile.getValue("JSONBody", row)

			break
		
	case "DemoProfile":
				 Environment = dataFile.getValue("Environment", row)
				 JSONBody = dataFile.getValue("JSONBody", row)

			break
			
	case "Production":
				 Environment = dataFile.getValue("Environment", row)
				 JSONBody = dataFile.getValue("JSONBody", row)

			break
				 

	}
 }
			
}
							  
				 
// Login(Submit Request)
CustomKeywords.'ivtPages.IVTlogin.SetDataIVTlogin'(Url, Environment, UserName, Password, PartnerToken, JSONBody)

							
							//PART 1- ENTER DATA

//retrieving Due Amount
DueAmount_Out = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount'),'value')
DueAmount_Out = "\$" + DueAmount_Out
println("Payment Amount = " + DueAmount_Out)


//Debit Card section
WebUI.delay(2)
WebUI.verifyTextPresent('Credit/Debit Card', true)
WebUI.click(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/label_CreditCard'))


fileLoc = 'KatalonData/IVT/IVT_SameJSON_UI_SCF.xlsx'
nameSheet = 'DebitCard_SameJson_Ui_SCF'
creditDebitData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/IVT/IVT_SameJSON_UI_SCF.xlsx', nameSheet, true)


numOfRows = creditDebitData.getRowNumbers()
println("Number of Records: " + numOfRows)

for (def CrediDebitRow = 1; CrediDebitRow <= numOfRows; CrediDebitRow++)
{

	ExecuteTC = creditDebitData.getValue('Execute', CrediDebitRow)
	System.out.println('Value of Execute is : ' + ExecuteTC)
	
	
	if (ExecuteTC.equalsIgnoreCase("Y"))
		{
			System.out.println('Begin Record Number: ' + CrediDebitRow)
			
			Date today = new Date()
			println (today)
			String datText = today
							
											  
			 CardNo_Out = creditDebitData.getValue("CardNo", CrediDebitRow)
			 println(CardNo_Out)
			 DebitCard_UI = '************' + CardNo_Out.substring(CardNo_Out.length()-4)
			 
			 ExpMM_Out = creditDebitData.getValue("ExpMM", CrediDebitRow)
			 ExpYYYY_Out = creditDebitData.getValue("ExpYYYY", CrediDebitRow)
			 ExpirationDate_UI = ExpMM_Out + '/' + ExpYYYY_Out
			 
			 SecurityCode_Out = creditDebitData.getValue("SecurityCode", CrediDebitRow)
						 
			 //Generate random name
			 Name_Out = RandomStringUtils.randomAlphabetic(10)
			 println(Name_Out)
						  
			 Email_Out = creditDebitData.getValue("Email", CrediDebitRow)
			 Email_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_EmailAddress'),'value')
			 
			 Phone_Out = creditDebitData.getValue("Phone", CrediDebitRow)
			 Phone_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_PhoneNumber'),'value')
			 
			 //PaymentDate_Out = creditDebitData.getValue("Date", CrediDebitRow)
			 PaymentDate_Out = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_PaymentDate'),'value')
			 println("Payment Date = " + PaymentDate_Out)
			 
			 Country_Out = creditDebitData.getValue("Country", CrediDebitRow)
			 Country_UI = WebUI.getText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/select_Country')).trim()
			 println("Country_UI=[" + Country_UI + "]")
						  
			 Address_Out = creditDebitData.getValue("Address", CrediDebitRow)
			 Address_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_AddressLine1'),'value')
						  
			 Zip_Out = creditDebitData.getValue("Zip", CrediDebitRow)
			 Zip_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_ZipCode'),'value')
						  
			 State_Out = creditDebitData.getValue("State", CrediDebitRow)
			 State_UI = new Select(WebUI.findWebElement(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/select_State'))).getFirstSelectedOption().getText().trim()
			 println("State_UI=[" + State_UI + "]")

			 City_Out = creditDebitData.getValue("City", CrediDebitRow)
			 City_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_City'),'value')
			 
			 UDF1_Out = creditDebitData.getValue("UDF1", CrediDebitRow)
			 UDF1_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF1'),'value')
			 
			 UDF2_Out = creditDebitData.getValue("UDF2", CrediDebitRow)
			 UDF2_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF2'),'value')
						  
			 UDF3_Out = creditDebitData.getValue("UDF3", CrediDebitRow)
			 UDF3_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF3'),'value')
			 
			 UDF4_Out = creditDebitData.getValue("UDF4", CrediDebitRow)
			 UDF4_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF4'),'value')
						  
			 UDF5_Out = creditDebitData.getValue("UDF5", CrediDebitRow)
			 UDF5_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF5'),'value')
						  
			 UDF6_Out = creditDebitData.getValue("UDF6", CrediDebitRow)
			 UDF6_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF6'),'value')
			 
			 UDF7_Out = creditDebitData.getValue("UDF7", CrediDebitRow)
			 UDF7_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF7'),'value')
			 
			 UDF8_Out = creditDebitData.getValue("UDF8", CrediDebitRow)
			 UDF8_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF8'),'value')
			 
			 UDF9_Out = creditDebitData.getValue("UDF9", CrediDebitRow)
			 UDF9_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF9'),'value')
			 
			 UDF10_Out = creditDebitData.getValue("UDF10", CrediDebitRow)
			 UDF10_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF10'),'value')
						  

CustomKeywords.'ivtPages.CreditDebitCard.SetDataDebitCreditCard'(
				CardNo_Out, ExpMM_Out, ExpYYYY_Out, SecurityCode_Out, Name_Out,
				Email_Out, Phone_Out, PaymentDate_Out, Country_Out, Address_Out, Zip_Out, State_Out, City_Out,
				UDF1_Out, UDF2_Out, UDF3_Out, UDF4_Out, UDF5_Out, UDF6_Out, UDF7_Out, UDF8_Out, UDF9_Out, UDF10_Out)


//Continue
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/button_Continue'))

					 
						//PART 2- UI VERIFICATION

//'Parcels Label' section verification

WebUI.waitForPageLoad(5)
WebUI.verifyTextPresent('Parcels Label', true)

WebUI.verifyTextPresent('Show', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Show'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Show'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Show'))

WebUI.verifyTextPresent('Reference Number', true)
WebUI.verifyTextPresent('Quantity', true)
WebUI.verifyTextPresent('Amount', true)

WebUI.verifyTextPresent('Previous', true)
WebUI.verifyTextPresent('Next', true)

WebUI.verifyTextPresent('Showing 1 to 3 of 3 entries', true)

CustomKeywords.'ivtPages.ParcelsLabel.verifyShowDropDown'()         //'Show' drop down on Process Payment has same Class as it has on Payment Entry page

CustomKeywords.'ivtPages.ParcelsLabel.verifyParcelData'(JSONBody)   //comparing Parcel Table data on Process Payment page directly from the Json


//bottom buttons verification

WebUI.verifyTextPresent('Accept Fee and Process Payment', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/ProcessPayment'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/ProcessPayment'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/ProcessPayment'))

WebUI.verifyTextPresent('Modify', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/Modify'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/Modify'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/Modify'))

WebUI.verifyTextPresent('Exit', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/EXIT'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/EXIT'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/EXIT'))

//only printing the expected values
println """
NOTE: only showing expected values

Name_Out=${Name_Out}
DebitCard_UI=${DebitCard_UI}
ExpirationDate_UI=${ExpirationDate_UI}
PaymentDate_Out=${PaymentDate_Out}
Address_UI=${Address_UI}
Country_UI=${Country_UI}
City_UI=${City_UI}
State_UI=${State_UI}
Zip_UI=${Zip_UI}
Email_UI=${Email_UI}
Phone_UI=${Phone_UI}
DueAmount_Out=${DueAmount_Out}
UDF1_UI=${UDF1_UI}
UDF2_UI=${UDF2_UI}
UDF3_UI=${UDF3_UI}
UDF4_UI=${UDF4_UI}
UDF5_UI=${UDF5_UI}
UDF6_UI=${UDF6_UI}
UDF9_UI=${UDF9_UI}
UDF10_UI=${UDF10_UI}
"""
	
println('VERIFICATION BETWEEN ACTUAL AND EXPECTED VALUES\n\n')
WebUI.delay(2)
if(
	
	//'Payment Information' section verification
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CardHolderName'),Name_Out) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CardNumber'),DebitCard_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/ExpirationDate'),ExpirationDate_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/PaymentDate'),PaymentDate_Out) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/Address'),Address_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/Country'),Country_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/City'),City_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/State'),State_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/Zip'),Zip_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/Email'),Email_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/Phone'),Phone_UI) &&
	
	//'Bill/Invoice Details' section verification
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/PaymentAmount'),DueAmount_Out) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/UDF1'),UDF1_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/UDF2'),UDF2_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/UDF3'),UDF3_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/UDF4'),UDF4_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/UDF5'),UDF5_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/UDF6'),UDF6_UI) &&
	//WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/UDF7'),UDF7_UI) &&
	//WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/UDF8'),UDF8_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/UDF9'),UDF9_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/UDF10'),UDF10_UI) &&
	
	//'SCF' section verification
	WebUI.verifyTextPresent('Service Fee Acceptance', false) &&
	WebUI.verifyTextPresent('This transaction is subject to a Service Fee of $2.00.', false) &&
	WebUI.verifyTextPresent('Payment Amount:', false) &&
	WebUI.verifyTextPresent('$20.00', false) &&
	WebUI.verifyTextPresent('Service Fee:', false) &&
	WebUI.verifyTextPresent('$2.00', false) &&
	WebUI.verifyTextPresent('Total Amount:', false) &&
	WebUI.verifyTextPresent('$22.00', false) &&
	WebUI.verifyTextPresent('One transaction in the amount of $22.00 will appear on your bank statement.', false))
	
		
	{
	
		isRequiredTextPresent = true
		println("Debit Card-Process Payment page attribute validations passed")
	
		KeywordUtil.markPassed("Debit Card-Process Payment page attribute validations passed")
		resText = "Pass"
	
		CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,CrediDebitRow)

	
	} else {
	
		isRequiredTextPresent = false
		println("Debit Card-Process Payment page attribute validations failed")
	
		KeywordUtil.markFailed("Debit Card-Process Payment page attribute validations failed")
		resText = "Fail"
	
		CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,CrediDebitRow)
	}


	
 }
}
