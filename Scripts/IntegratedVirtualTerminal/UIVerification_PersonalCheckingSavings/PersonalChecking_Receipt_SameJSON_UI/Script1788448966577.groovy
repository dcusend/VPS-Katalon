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
import org.openqa.selenium.support.ui.Select

	
	def Url, Environment, UserName, Password, PartnerToken, JSONBody
	
	def DueAmount_Out
	
	def FirstName_UI, LastName_UI, RoutingNo_UI, AccountNo_UI, AccType_UI, Email_UI, Phone_UI, Country_UI, Address_UI, Zip_UI, State_UI, City_UI,
		UDF1_UI, UDF2_UI, UDF3_UI, UDF4_UI, UDF5_UI, UDF6_UI, UDF7_UI, UDF8_UI, UDF9_UI, UDF10_UI
	
	def	RoutingNo_Out, AccountNo_Out, ConfirmAccNo_Out, AccType_Out, FirstName_Out, LastName_Out,
		Email_Out, Phone_Out, PaymentDate_Out, Country_Out, Address_Out, Zip_Out, State_Out, City_Out,
		UDF1_Out, UDF2_Out, UDF3_Out, UDF4_Out, UDF5_Out, UDF6_Out, UDF7_Out, UDF8_Out, UDF9_Out, UDF10_Out

	def fileLoc, nameSheet, dataFile, numOfRows, isRequiredTextPresent= false, submitData, parcelData, personalCheckingData
	
	

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
			 			 
		fileLoc = 'KatalonData/IVT/IVT_SameJSON_UI.xlsx'
		nameSheet = 'Submit_SameJson_Ui'
		dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/IVT/IVT_SameJSON_UI.xlsx', nameSheet, true)
	
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



//retrieving RemittanceId
println("Expected RemittanceId = " + GlobalVariable.IVTRemittanceId)

//retrieving Due Amount
DueAmount_Out = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount'),'value')
DueAmount_Out = "\$" + DueAmount_Out
println("Payment Amount = " + DueAmount_Out)


//'Personal Checking' section
WebUI.delay(2)
WebUI.verifyTextPresent('Personal Checking /Savings', true)
WebUI.click(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/label_PersonalCheckingSavings'))


fileLoc = 'KatalonData/IVT/IVT_SameJSON_UI.xlsx'
nameSheet = 'PersonalCheck_SameJson_Ui'
personalCheckingData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/IVT/IVT_SameJSON_UI.xlsx', nameSheet, true)


numOfRows = personalCheckingData.getRowNumbers()
println("Number of Records: " + numOfRows)

for (def PersonalCheckingRow = 1; PersonalCheckingRow <= numOfRows; PersonalCheckingRow++)
{

	ExecuteTC = personalCheckingData.getValue('Execute', PersonalCheckingRow)
	System.out.println('Value of Execute is : ' + ExecuteTC)
	
	
	if (ExecuteTC.equalsIgnoreCase("Y"))
		{
			System.out.println('Begin Record Number: ' + PersonalCheckingRow)
			
			Date today = new Date()
			println (today)
			String datText = today
							
							  
			 RoutingNo_Out = personalCheckingData.getValue("RoutingNo", PersonalCheckingRow)
			 println(RoutingNo_Out)
			 RoutingNo_UI = '*****' + RoutingNo_Out.substring(RoutingNo_Out.length()-4)

			 AccountNo_Out = personalCheckingData.getValue("AccountNo", PersonalCheckingRow)
			 println(AccountNo_Out)
			 AccountNo_UI = '****' + AccountNo_Out.substring(AccountNo_Out.length()-4)
			 
			 ConfirmAccNo_Out = personalCheckingData.getValue("ConfirmAccNo", PersonalCheckingRow)
			 
			 AccType_Out = personalCheckingData.getValue("AccType", PersonalCheckingRow)
			 println(AccType_Out)
			 WebUI.selectOptionByLabel(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/select_AccountType'),AccType_Out,false)
			 AccType_UI = new Select(WebUI.findWebElement(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/select_AccountType'))).getFirstSelectedOption().getText().trim()
			 println(AccType_UI)
			 
			 FirstName_Out = personalCheckingData.getValue("FirstName", PersonalCheckingRow)
			 FirstName_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_FirstName'),'value')
			 
			 LastName_Out = personalCheckingData.getValue("LastName", PersonalCheckingRow)
			 LastName_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_LastName'),'value')
			 						  
			 Email_Out = personalCheckingData.getValue("Email", PersonalCheckingRow)
			 Email_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_EmailAddress'),'value')
			 
			 Phone_Out = personalCheckingData.getValue("Phone", PersonalCheckingRow)
			 Phone_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_Phone Number'),'value')
			 
			 //PaymentDate_Out = personalCheckingData.getValue("Date", PersonalCheckingRow)
			 PaymentDate_Out = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_PaymentDate'),'value')
			 println("Payment Date = " + PaymentDate_Out)

			 Country_Out = personalCheckingData.getValue("Country", PersonalCheckingRow)
			 Country_UI = WebUI.getText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/select_Country')).trim()
			 println("Country_UI=[" + Country_UI + "]")

			 Address_Out = personalCheckingData.getValue("Address", PersonalCheckingRow)
			 Address_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_AddressLine1'),'value')
			 
			 Zip_Out = personalCheckingData.getValue("Zip", PersonalCheckingRow)
			 Zip_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_ZipCode'),'value')
			 
			 State_Out = personalCheckingData.getValue("State", PersonalCheckingRow)
			 State_UI = new Select(WebUI.findWebElement(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/select_State'))).getFirstSelectedOption().getText().trim()
			 println("State_UI=[" + State_UI + "]")

			 City_Out = personalCheckingData.getValue("City", PersonalCheckingRow)
			 City_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_City'),'value')
			 
			 UDF1_Out = personalCheckingData.getValue("UDF1", PersonalCheckingRow)
			 UDF1_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF1'),'value')
			 
			 UDF2_Out = personalCheckingData.getValue("UDF2", PersonalCheckingRow)
			 UDF2_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF2'),'value')
			 
			 UDF3_Out = personalCheckingData.getValue("UDF3", PersonalCheckingRow)
			 UDF3_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF3'),'value')
			 
			 UDF4_Out = personalCheckingData.getValue("UDF4", PersonalCheckingRow)
			 UDF4_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF4'),'value')
			 
			 UDF5_Out = personalCheckingData.getValue("UDF5", PersonalCheckingRow)
			 UDF5_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF5'),'value')
			 
			 UDF6_Out = personalCheckingData.getValue("UDF6", PersonalCheckingRow)
			 UDF6_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF6'),'value')
			 
			 UDF7_Out = personalCheckingData.getValue("UDF7", PersonalCheckingRow)
			 UDF7_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF7'),'value')
			 
			 UDF8_Out = personalCheckingData.getValue("UDF8", PersonalCheckingRow)
			 UDF8_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF8'),'value')
			 
			 UDF9_Out = personalCheckingData.getValue("UDF9", PersonalCheckingRow)
			 UDF9_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF9'),'value')
			 
			 UDF10_Out = personalCheckingData.getValue("UDF10", PersonalCheckingRow)
			 UDF10_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF10'),'value')
			 

CustomKeywords.'ivtPages.PersonalCheckingSaving.SetDataPersonalCheckingSaving'(
				RoutingNo_Out, AccountNo_Out, ConfirmAccNo_Out, AccType_Out, FirstName_Out, LastName_Out,
				Email_Out, Phone_Out, PaymentDate_Out, Country_Out, Address_Out, Zip_Out, State_Out, City_Out,
				UDF1_Out, UDF2_Out, UDF3_Out, UDF4_Out, UDF5_Out, UDF6_Out, UDF7_Out, UDF8_Out, UDF9_Out, UDF10_Out)


//Continue
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/button_Continue'))
WebUI.waitForPageLoad(5)


//Process Payment
WebUI.click(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/ProcessPayment'))
WebUI.waitForPageLoad(10)




											//PART 2- UI VERIFICATION


WebUI.verifyTextPresent('Payment Successful', true)

//'Parcels Label' page verification
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

CustomKeywords.'ivtPages.ParcelsLabel.verifyShowDropDown'()  		//'Show' drop down on Process Payment has same Class as it has on Payment Entry page
 
CustomKeywords.'ivtPages.ParcelsLabel.verifyParcelData'(JSONBody)  //comparing Parcel Table data on Process Payment page directly from the Json


//bottom buttons verification
WebUI.verifyTextPresent('Print', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Print'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Print'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Print'))

WebUI.verifyTextPresent('Exit', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/EXIT'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/EXIT'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/EXIT'))


//only printing the expected values
println """
NOTE: only showing expected values

FirstName_UI=${FirstName_UI}
LastName_UI=${LastName_UI}
AccType_UI=${AccType_UI}
RoutingNo_UI=${RoutingNo_UI}
AccountNo_UI=${AccountNo_UI}
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
UDF7_UI=${UDF7_UI}
UDF8_UI=${UDF8_UI}
UDF9_UI=${UDF9_UI}
UDF10_UI=${UDF10_UI}
"""


println('VERIFICATION BETWEEN ACTUAL AND EXPECTED VALUES\n\n')
WebUI.delay(2)
if(
	
	//'Payment Information' section verification
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Remittance'),GlobalVariable.IVTRemittanceId) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/TransactionType'),'Debit') &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/AccountType'),'Personal Checking') &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/AccountName'),"${FirstName_UI} ${LastName_UI}".toUpperCase()) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/RoutingNo'),RoutingNo_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/AccountNo'),AccountNo_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/PaymentDate'),PaymentDate_Out) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Address'),Address_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/COUNTRY'),Country_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/CITY'),City_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/STATE'),State_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/ZIP'),Zip_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/MAIL'),Email_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Phone'),Phone_UI) &&	

	//'Bill/Invoice Details' section verification
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/PayAmount'),DueAmount_Out) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/TotalAmt'),DueAmount_Out) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Udf1'),UDF1_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Udf2'),UDF2_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Udf3'),UDF3_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Udf4'),UDF4_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Udf5'),UDF5_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Udf6'),UDF6_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Udf7'),UDF7_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Udf8'),UDF8_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Udf9'),UDF9_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Udf10'),UDF10_UI)) 
	
		
	{
	
		isRequiredTextPresent = true
		println("Personal Checking-Receipt page attribute validations passed")
	
		KeywordUtil.markPassed("Personal Checking-Receipt page attribute validations passed")
		resText = "Pass"
	
		CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,PersonalCheckingRow)

	
	} else {
	
		isRequiredTextPresent = false
		println("Personal Checking-Receipt page attribute validations failed")
	
		KeywordUtil.markFailed("Personal Checking-Receipt page attribute validations failed")
		resText = "Fail"
	
		CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,PersonalCheckingRow)
	}


	
 }
}







