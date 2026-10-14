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
	
	def FirstName_UI, LastName_UI, BusinessName_UI, RoutingNo_UI, AccountNo_UI, Email_UI, Phone_UI, Country_UI, Address_UI, Zip_UI, State_UI, City_UI,
		UDF1_UI, UDF2_UI, UDF3_UI, UDF4_UI, UDF5_UI, UDF6_UI, UDF7_UI, UDF8_UI, UDF9_UI, UDF10_UI
	
	def	RoutingNo_Out, AccountNo_Out, ConfirmAccNo_Out, BusinessName_Out, FirstName_Out, LastName_Out,
		Email_Out, Phone_Out, PaymentDate_Out, Country_Out, Address_Out, Zip_Out, State_Out, City_Out,
		UDF1_Out, UDF2_Out, UDF3_Out, UDF4_Out, UDF5_Out, UDF6_Out, UDF7_Out, UDF8_Out, UDF9_Out, UDF10_Out

	def fileLoc, nameSheet, dataFile, numOfRows, isRequiredTextPresent= false, submitData, parcelData, businessCheckingData
	
	

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


//Business Checking section
WebUI.delay(2)
WebUI.verifyTextPresent('Business Checking', true)
WebUI.click(findTestObject('Object Repository/IntegratedVT/BusinessChecking/label_BusinessChecking'))


fileLoc = 'KatalonData/IVT/IVT_SameJSON_UI.xlsx'
nameSheet = 'BusinessCheck_SameJson_Ui'
businessCheckingData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/IVT/IVT_SameJSON_UI.xlsx', nameSheet, true)


numOfRows = businessCheckingData.getRowNumbers()
println("Number of Records: " + numOfRows)

for (def BusinessCheckingRow = 1; BusinessCheckingRow <= numOfRows; BusinessCheckingRow++)
{

	ExecuteTC = businessCheckingData.getValue('Execute', BusinessCheckingRow)
	System.out.println('Value of Execute is : ' + ExecuteTC)
	
	
	if (ExecuteTC.equalsIgnoreCase("Y"))
		{
			System.out.println('Begin Record Number: ' + BusinessCheckingRow)
			
			Date today = new Date()
			println (today)
			String datText = today
							
							  
			 RoutingNo_Out = businessCheckingData.getValue("RoutingNo", BusinessCheckingRow)
			 println(RoutingNo_Out)
			 RoutingNo_UI = '*****' + RoutingNo_Out.substring(RoutingNo_Out.length()-4)

			 AccountNo_Out = businessCheckingData.getValue("AccountNo", BusinessCheckingRow)
			 println(AccountNo_Out)
			 AccountNo_UI = '****' + AccountNo_Out.substring(AccountNo_Out.length()-4)
			 
			 ConfirmAccNo_Out = businessCheckingData.getValue("ConfirmAccNo", BusinessCheckingRow)
			 
			 BusinessName_Out = businessCheckingData.getValue("BusinessName", BusinessCheckingRow)
			 BusinessName_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_BusinessName'),'value')
						 
			 FirstName_Out = businessCheckingData.getValue("FirstName", BusinessCheckingRow)
			 FirstName_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_FirstName'),'value')
			 
			 LastName_Out = businessCheckingData.getValue("LastName", BusinessCheckingRow)
			 LastName_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_LastName'),'value')
						  
			 Email_Out = businessCheckingData.getValue("Email", BusinessCheckingRow)
			 Email_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_EmailAddress'),'value')
			 
			 Phone_Out = businessCheckingData.getValue("Phone", BusinessCheckingRow)
			 Phone_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_PhoneNumber'),'value')
			 
			 //PaymentDate_Out = businessCheckingData.getValue("Date", BusinessCheckingRow)
			 PaymentDate_Out = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_PaymentDate'),'value')
			 println("Payment Date = " + PaymentDate_Out)
			 
			 Country_Out = businessCheckingData.getValue("Country", BusinessCheckingRow)
			 Country_UI = WebUI.getText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/select_Country')).trim()
			 println("Country_UI=[" + Country_UI + "]")

			 Address_Out = businessCheckingData.getValue("Address", BusinessCheckingRow)
			 Address_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AddressLine1'),'value')
			 
			 Zip_Out = businessCheckingData.getValue("Zip", BusinessCheckingRow)
			 Zip_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_ZipCode'),'value')
			 
			 State_Out = businessCheckingData.getValue("State", BusinessCheckingRow)
			 State_UI = new Select(WebUI.findWebElement(findTestObject('Object Repository/IntegratedVT/BusinessChecking/select_State'))).getFirstSelectedOption().getText().trim()
			 println("State_UI=[" + State_UI + "]")

			 City_Out = businessCheckingData.getValue("City", BusinessCheckingRow)
			 City_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_City'),'value')
			 
			 UDF1_Out = businessCheckingData.getValue("UDF1", BusinessCheckingRow)
			 UDF1_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF1'),'value')
			 
			 UDF2_Out = businessCheckingData.getValue("UDF2", BusinessCheckingRow)
			 UDF2_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF2'),'value')
						  
			 UDF3_Out = businessCheckingData.getValue("UDF3", BusinessCheckingRow)
			 UDF3_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF3'),'value')
			 
			 UDF4_Out = businessCheckingData.getValue("UDF4", BusinessCheckingRow)
			 UDF4_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF4'),'value')
						  
			 UDF5_Out = businessCheckingData.getValue("UDF5", BusinessCheckingRow)
			 UDF5_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF5'),'value')
						  
			 UDF6_Out = businessCheckingData.getValue("UDF6", BusinessCheckingRow)
			 UDF6_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF6'),'value')
			 
			 UDF7_Out = businessCheckingData.getValue("UDF7", BusinessCheckingRow)
			 UDF7_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF7'),'value')
			 
			 UDF8_Out = businessCheckingData.getValue("UDF8", BusinessCheckingRow)
			 UDF8_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF8'),'value')
			 
			 UDF9_Out = businessCheckingData.getValue("UDF9", BusinessCheckingRow)
			 UDF9_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF9'),'value')
			 
			 UDF10_Out = businessCheckingData.getValue("UDF10", BusinessCheckingRow)
			 UDF10_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF10'),'value')
						  

CustomKeywords.'ivtPages.BusinessChecking.SetDataBusinessChecking'(
				RoutingNo_Out, AccountNo_Out, ConfirmAccNo_Out, BusinessName_Out, FirstName_Out, LastName_Out,
				Email_Out, Phone_Out, PaymentDate_Out, Country_Out, Address_Out, Zip_Out, State_Out, City_Out,
				UDF1_Out, UDF2_Out, UDF3_Out, UDF4_Out, UDF5_Out, UDF6_Out, UDF7_Out, UDF8_Out, UDF9_Out, UDF10_Out)


//Continue
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/IntegratedVT/BusinessChecking/button_Continue'))


//Process Payment
WebUI.waitForPageLoad(5)
WebUI.click(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/ProcessPayment'))
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
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Print'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Print'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Print'))

WebUI.verifyTextPresent('Exit', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/ExitButton'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/ExitButton'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/ExitButton'))


//only printing the expected values
println """
NOTE: only showing expected values

FirstName_UI=${FirstName_UI}
LastName_UI=${LastName_UI}
BusinessName_UI=${BusinessName_UI}
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
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/RemittanceId'),GlobalVariable.IVTRemittanceId) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/TransactionType'),'Debit') &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/AccountType'),'Business Checking') &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/NameOnAccount'),"${FirstName_UI} ${LastName_UI}".toUpperCase()) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Business_Name'),BusinessName_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/RoutingNo'),RoutingNo_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/AccNumber'),AccountNo_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Payment_Date'),PaymentDate_Out) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Address1'),Address_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/COUNTRY'),Country_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/CITY'),City_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/STATE'),State_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Zip'),Zip_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Mail'),Email_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/PhoneNo'),Phone_UI) &&	

	//'Bill/Invoice Details' section verification
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/PaymentAmt'),DueAmount_Out) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/TotalAmt'),DueAmount_Out) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Udf_1'),UDF1_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Udf_2'),UDF2_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Udf_3'),UDF3_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Udf_4'),UDF4_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Udf_5'),UDF5_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Udf_6'),UDF6_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Udf_7'),UDF7_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Udf_8'),UDF8_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Udf_9'),UDF9_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/BusinessChecking_PaymentInformation/BusinessChecking_PaymentConfirmation/Udf_10'),UDF10_UI)) 
	
		
	{
	
		isRequiredTextPresent = true
		println("Business Checking-Receipt page attribute validations passed")
	
		KeywordUtil.markPassed("Business Checking-Receipt page attribute validations passed")
		resText = "Pass"
	
		CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,BusinessCheckingRow)

	
	} else {
	
		isRequiredTextPresent = false
		println("Business Checking-Receipt page attribute validations failed")
	
		KeywordUtil.markFailed("Business Checking-Receipt page attribute validations failed")
		resText = "Fail"
	
		CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,BusinessCheckingRow)
	}


	
 }
}



