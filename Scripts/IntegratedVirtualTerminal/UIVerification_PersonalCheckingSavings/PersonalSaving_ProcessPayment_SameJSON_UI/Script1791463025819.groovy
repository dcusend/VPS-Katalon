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

	def fileLoc, nameSheet, dataFile, numOfRows, isRequiredTextPresent= false, submitData, parcelData, personalSavingsData
	
	

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


//retrieving Due Amount
DueAmount_Out = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount'),'value')
DueAmount_Out = "\$" + DueAmount_Out
println("Payment Amount = " + DueAmount_Out)


//'Personal Savings' section
WebUI.delay(2)
WebUI.verifyTextPresent('Personal Checking /Savings', true)
WebUI.click(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/label_PersonalCheckingSavings'))


fileLoc = 'KatalonData/IVT/IVT_SameJSON_UI.xlsx'
nameSheet = 'PersonalSav_SameJson_Ui'
personalSavingsData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/IVT/IVT_SameJSON_UI.xlsx', nameSheet, true)


numOfRows = personalSavingsData.getRowNumbers()
println("Number of Records: " + numOfRows)

for (def PersonalSavingsRow = 1; PersonalSavingsRow <= numOfRows; PersonalSavingsRow++)
{

	ExecuteTC = personalSavingsData.getValue('Execute', PersonalSavingsRow)
	System.out.println('Value of Execute is : ' + ExecuteTC)
	
	
	if (ExecuteTC.equalsIgnoreCase("Y"))
		{
			System.out.println('Begin Record Number: ' + PersonalSavingsRow)
			
			Date today = new Date()
			println (today)
			String datText = today
							
							  
			 RoutingNo_Out = personalSavingsData.getValue("RoutingNo", PersonalSavingsRow)
			 println(RoutingNo_Out)
			 RoutingNo_UI = '*****' + RoutingNo_Out.substring(RoutingNo_Out.length()-4)

			 AccountNo_Out = personalSavingsData.getValue("AccountNo", PersonalSavingsRow)
			 println(AccountNo_Out)
			 AccountNo_UI = '****' + AccountNo_Out.substring(AccountNo_Out.length()-4)
			 
			 ConfirmAccNo_Out = personalSavingsData.getValue("ConfirmAccNo", PersonalSavingsRow)
			 
			 AccType_Out = personalSavingsData.getValue("AccType", PersonalSavingsRow)
			 println(AccType_Out)
			 WebUI.selectOptionByLabel(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/select_AccountType'),AccType_Out,false)
			 AccType_UI = new Select(WebUI.findWebElement(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/select_AccountType'))).getFirstSelectedOption().getText().trim()
			 println(AccType_UI)
			 
			 FirstName_Out = personalSavingsData.getValue("FirstName", PersonalSavingsRow)
			 FirstName_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_FirstName'),'value')
			 
			 LastName_Out = personalSavingsData.getValue("LastName", PersonalSavingsRow)
			 LastName_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_LastName'),'value')
			 						  
			 Email_Out = personalSavingsData.getValue("Email", PersonalSavingsRow)
			 Email_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_EmailAddress'),'value')
			 
			 Phone_Out = personalSavingsData.getValue("Phone", PersonalSavingsRow)
			 Phone_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_Phone Number'),'value')
			 
			 //PaymentDate_Out = personalCheckingData.getValue("Date", PersonalCheckingRow)
			 PaymentDate_Out = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_PaymentDate'),'value')
			 println("Payment Date = " + PaymentDate_Out)

			 Country_Out = personalSavingsData.getValue("Country", PersonalSavingsRow)
			 Country_UI = WebUI.getText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/select_Country')).trim()
			 println("Country_UI=[" + Country_UI + "]")

			 Address_Out = personalSavingsData.getValue("Address", PersonalSavingsRow)
			 Address_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_AddressLine1'),'value')
			 
			 Zip_Out = personalSavingsData.getValue("Zip", PersonalSavingsRow)
			 Zip_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_ZipCode'),'value')
			 
			 State_Out = personalSavingsData.getValue("State", PersonalSavingsRow)
			 State_UI = new Select(WebUI.findWebElement(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/select_State'))).getFirstSelectedOption().getText().trim()
			 println("State_UI=[" + State_UI + "]")

			 City_Out = personalSavingsData.getValue("City", PersonalSavingsRow)
			 City_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_City'),'value')
			 
			 UDF1_Out = personalSavingsData.getValue("UDF1", PersonalSavingsRow)
			 UDF1_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF1'),'value')
			 
			 UDF2_Out = personalSavingsData.getValue("UDF2", PersonalSavingsRow)
			 UDF2_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF2'),'value')
			 
			 UDF3_Out = personalSavingsData.getValue("UDF3", PersonalSavingsRow)
			 UDF3_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF3'),'value')
			 
			 UDF4_Out = personalSavingsData.getValue("UDF4", PersonalSavingsRow)
			 UDF4_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF4'),'value')
			 
			 UDF5_Out = personalSavingsData.getValue("UDF5", PersonalSavingsRow)
			 UDF5_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF5'),'value')
			 
			 UDF6_Out = personalSavingsData.getValue("UDF6", PersonalSavingsRow)
			 UDF6_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF6'),'value')
			 
			 UDF7_Out = personalSavingsData.getValue("UDF7", PersonalSavingsRow)
			 UDF7_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF7'),'value')
			 
			 UDF8_Out = personalSavingsData.getValue("UDF8", PersonalSavingsRow)
			 UDF8_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF8'),'value')
			 
			 UDF9_Out = personalSavingsData.getValue("UDF9", PersonalSavingsRow)
			 UDF9_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF9'),'value')
			 
			 UDF10_Out = personalSavingsData.getValue("UDF10", PersonalSavingsRow)
			 UDF10_UI = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/UDF10'),'value')
			 

CustomKeywords.'ivtPages.PersonalCheckingSaving.SetDataPersonalCheckingSaving'(
				RoutingNo_Out, AccountNo_Out, ConfirmAccNo_Out, AccType_Out, FirstName_Out, LastName_Out,
				Email_Out, Phone_Out, PaymentDate_Out, Country_Out, Address_Out, Zip_Out, State_Out, City_Out,
				UDF1_Out, UDF2_Out, UDF3_Out, UDF4_Out, UDF5_Out, UDF6_Out, UDF7_Out, UDF8_Out, UDF9_Out, UDF10_Out)


//Continue
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/button_Continue'))
WebUI.waitForPageLoad(5)




											//PART 2- UI VERIFICATION


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
WebUI.verifyTextPresent('Process Payment', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/ProcessPayment'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/ProcessPayment'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/ProcessPayment'))

WebUI.verifyTextPresent('Modify', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/Modify'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/Modify'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/Modify'))

WebUI.verifyTextPresent('Exit', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/ExitButton'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/ExitButton'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/ExitButton'))


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
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/FirstName'),FirstName_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/LastName'),LastName_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/TypeOfAccount'),'Personal Savings') &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/RoutingNumber'),RoutingNo_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/AccountNumber'),AccountNo_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/PaymentDate'),PaymentDate_Out) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/Address1'),Address_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/Country'),Country_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/City'),City_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/State'),State_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/ZipCode'),Zip_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/Email'),Email_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/PhoneNo'),Phone_UI) &&	

	//'Bill/Invoice Details' section verification
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/PaymentAmount'),DueAmount_Out) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/UDF_1'),UDF1_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/UDF_2'),UDF2_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/UDF_3'),UDF3_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/UDF_4'),UDF4_UI) &&
	//WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/UDF_5'),UDF5_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/UDF_6'),UDF6_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/UDF_7'),UDF7_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/UDF_8'),UDF8_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/UDF_9'),UDF9_UI) &&
	WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/UDF_10'),UDF10_UI)) 
	
		
	{
	
		isRequiredTextPresent = true
		println("Personal Savings-Process Payment page attribute validations passed")
	
		KeywordUtil.markPassed("Personal Savings-Process Payment page attribute validations passed")
		resText = "Pass"
	
		CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,PersonalSavingsRow)

	
	} else {
	
		isRequiredTextPresent = false
		println("Personal Savings-Process Payment page attribute validations failed")
	
		KeywordUtil.markFailed("Personal Savings-Process Payment page attribute validations failed")
		resText = "Fail"
	
		CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,PersonalSavingsRow)
	}


	
 }
}







