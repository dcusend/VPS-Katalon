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

	
	def Url, Environment, UserName, Password, PartnerToken, JSONBody
	
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
			 			 
		fileLoc = 'KatalonData/IVT/IVT_SameJSON_E2E.xlsx'
		nameSheet = 'Submit_SameJson'
		dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/IVT/IVT_SameJSON_E2E.xlsx', nameSheet, true)
	
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



//Personal Checking
WebUI.delay(2)
WebUI.verifyTextPresent('Personal Checking /Savings', true)
WebUI.click(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/label_PersonalCheckingSavings'))


fileLoc = 'KatalonData/IVT/IVT_SameJSON_E2E.xlsx'
nameSheet = 'PersonalChecking_SameJson'
personalCheckingData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/IVT/IVT_SameJSON_E2E.xlsx', nameSheet, true)


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

			 AccountNo_Out = personalCheckingData.getValue("AccountNo", PersonalCheckingRow)
			 println(AccountNo_Out)
			 
			 ConfirmAccNo_Out = personalCheckingData.getValue("ConfirmAccNo", PersonalCheckingRow)
			 
			 AccType_Out = personalCheckingData.getValue("AccType", PersonalCheckingRow)
						 
			 FirstName_Out = personalCheckingData.getValue("FirstName", PersonalCheckingRow)
			 
			 LastName_Out = personalCheckingData.getValue("LastName", PersonalCheckingRow)
						  
			 Email_Out = personalCheckingData.getValue("Email", PersonalCheckingRow)
			 
			 Phone_Out = personalCheckingData.getValue("Phone", PersonalCheckingRow)
			 
			 //PaymentDate_Out = personalCheckingData.getValue("Date", PersonalCheckingRow)
			 
			 Country_Out = personalCheckingData.getValue("Country", PersonalCheckingRow)
						  
			 Address_Out = personalCheckingData.getValue("Address", PersonalCheckingRow)
						  
			 Zip_Out = personalCheckingData.getValue("Zip", PersonalCheckingRow)
						  
			 State_Out = personalCheckingData.getValue("State", PersonalCheckingRow)
			 
			 City_Out = personalCheckingData.getValue("City", PersonalCheckingRow)
			 
			 UDF1_Out = personalCheckingData.getValue("UDF1", PersonalCheckingRow)
			 println(UDF1_Out)
			 
			 UDF2_Out = personalCheckingData.getValue("UDF2", PersonalCheckingRow)
						  
			 UDF3_Out = personalCheckingData.getValue("UDF3", PersonalCheckingRow)
			 
			 UDF4_Out = personalCheckingData.getValue("UDF4", PersonalCheckingRow)
						  
			 UDF5_Out = personalCheckingData.getValue("UDF5", PersonalCheckingRow)
						  
			 UDF6_Out = personalCheckingData.getValue("UDF6", PersonalCheckingRow)
			 
			 UDF7_Out = personalCheckingData.getValue("UDF7", PersonalCheckingRow)
			 
			 UDF8_Out = personalCheckingData.getValue("UDF8", PersonalCheckingRow)
			 
			 UDF9_Out = personalCheckingData.getValue("UDF9", PersonalCheckingRow)
			 
			 UDF10_Out = personalCheckingData.getValue("UDF10", PersonalCheckingRow)
						  

CustomKeywords.'ivtPages.PersonalCheckingSaving.SetDataPersonalCheckingSaving'(
				RoutingNo_Out, AccountNo_Out, ConfirmAccNo_Out, AccType_Out, FirstName_Out, LastName_Out,
				Email_Out, Phone_Out, PaymentDate_Out, Country_Out, Address_Out, Zip_Out, State_Out, City_Out,
				UDF1_Out, UDF2_Out, UDF3_Out, UDF4_Out, UDF5_Out, UDF6_Out, UDF7_Out, UDF8_Out, UDF9_Out, UDF10_Out)


//Continue
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/button_Continue'))


//Pop up handling
WebUI.delay(4)
WebUI.executeJavaScript("""let buttons = document.querySelectorAll('button');
    					buttons.forEach(btn => {
        				if(btn.innerText.trim() === 'X')
						{
        			   		 btn.click(); } 
						}); """, null)



//Modify
WebUI.click(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/Modify'))

WebUI.setText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_AccountNumber'), '1234567')
WebUI.setText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_ConfirmAccountNumber'), '1234567')
WebUI.setText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_FirstName'), 'Bharat')
WebUI.setText(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/input_LastName'), 'Bhushan')

WebUI.click(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/button_Continue'))


//Process Payment
WebUI.waitForPageLoad(5)
WebUI.click(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/ProcessPayment'))
WebUI.waitForPageLoad(10)
WebUI.delay(5)

//Print button
//WebUI.click(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Print'))
WebUI.verifyTextPresent("Print", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Print'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Print'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/PersonalCheckingSavings/CheckingSavings_PaymentInformation/CheckingSavings_PaymentConfirmation/Print'))



//reporting in excel
WebUI.delay(2)
if (
	WebUI.verifyTextPresent('Payment Successful', false) &&
	WebUI.verifyTextPresent('BHARAT BHUSHAN', false) &&
	WebUI.verifyTextPresent('567', false))
 
		{	
		isRequiredTextPresent = true
		println(isRequiredTextPresent) 
		}

else {
	isRequiredTextPresent = false
	}

	
	 if (isRequiredTextPresent == true)
			{
				println "Payment is successful and user is landed on 'Print' page"
				KeywordUtil.markPassed("All the relevant texts are present on Receipt Page")
				resText = "Pass"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,PersonalCheckingRow)
		
			}
	 else
			{
				println "Payment is not successful and user is not landed on 'Print' page"
				KeywordUtil.markFailed("Some texts are missing on the Receipt page")
				resText = "Fail"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,PersonalCheckingRow)
			}


	}
}




