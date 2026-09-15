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



//Credit Card
WebUI.delay(2)
WebUI.verifyTextPresent('Credit/Debit Card', true)
WebUI.click(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/label_CreditCard'))


fileLoc = 'KatalonData/IVT/IVT_SameJSON_E2E.xlsx'
nameSheet = 'CreditCard_SameJson'
creditDebitData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/IVT/IVT_SameJSON_E2E.xlsx', nameSheet, true)


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

			 ExpMM_Out = creditDebitData.getValue("ExpMM", CrediDebitRow)
			 
			 ExpYYYY_Out = creditDebitData.getValue("ExpYYYY", CrediDebitRow)
			 
			 SecurityCode_Out = creditDebitData.getValue("SecurityCode", CrediDebitRow)
						 
			 //Generate random name
			 Name_Out = RandomStringUtils.randomAlphabetic(10)
			 println(Name_Out)
						  
			 Email_Out = creditDebitData.getValue("Email", CrediDebitRow)
			 
			 Phone_Out = creditDebitData.getValue("Phone", CrediDebitRow)
			 
			 //PaymentDate_Out = creditDebitData.getValue("Date", CrediDebitRow)
			 
			 Country_Out = creditDebitData.getValue("Country", CrediDebitRow)
						  
			 Address_Out = creditDebitData.getValue("Address", CrediDebitRow)
						  
			 Zip_Out = creditDebitData.getValue("Zip", CrediDebitRow)
						  
			 State_Out = creditDebitData.getValue("State", CrediDebitRow)
			 
			 City_Out = creditDebitData.getValue("City", CrediDebitRow)
			 
			 UDF1_Out = creditDebitData.getValue("UDF1", CrediDebitRow)
			 println(UDF1_Out)
			 
			 UDF2_Out = creditDebitData.getValue("UDF2", CrediDebitRow)
						  
			 UDF3_Out = creditDebitData.getValue("UDF3", CrediDebitRow)
			 
			 UDF4_Out = creditDebitData.getValue("UDF4", CrediDebitRow)
						  
			 UDF5_Out = creditDebitData.getValue("UDF5", CrediDebitRow)
						  
			 UDF6_Out = creditDebitData.getValue("UDF6", CrediDebitRow)
			 
			 UDF7_Out = creditDebitData.getValue("UDF7", CrediDebitRow)
			 
			 UDF8_Out = creditDebitData.getValue("UDF8", CrediDebitRow)
			 
			 UDF9_Out = creditDebitData.getValue("UDF9", CrediDebitRow)
			 
			 UDF10_Out = creditDebitData.getValue("UDF10", CrediDebitRow)
						  

CustomKeywords.'ivtPages.CreditDebitCard.SetDataDebitCreditCard'(
				CardNo_Out, ExpMM_Out, ExpYYYY_Out, SecurityCode_Out, Name_Out,
				Email_Out, Phone_Out, PaymentDate_Out, Country_Out, Address_Out, Zip_Out, State_Out, City_Out,
				UDF1_Out, UDF2_Out, UDF3_Out, UDF4_Out, UDF5_Out, UDF6_Out, UDF7_Out, UDF8_Out, UDF9_Out, UDF10_Out)


//Continue
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/button_Continue'))


//Pop up handling
WebUI.delay(4)
WebUI.executeJavaScript("""let buttons = document.querySelectorAll('button');
    					buttons.forEach(btn => {
        				if(btn.innerText.trim() === 'X')
						{
        			   		 btn.click(); } 
						}); """, null)

//Process Payment
WebUI.waitForPageLoad(5)
WebUI.click(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/AcceptFee_ProcessPayment'))
WebUI.waitForPageLoad(10)
WebUI.delay(5)

//Print button
//WebUI.click(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CreditDebit_PaymentConfirmation/Print'))
WebUI.verifyTextPresent("Print", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CreditDebit_PaymentConfirmation/Print'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CreditDebit_PaymentConfirmation/Print'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CreditDebit_PaymentConfirmation/Print'))



//reporting in excel
WebUI.delay(2)
if (
	WebUI.verifyTextPresent('Payment Successful', false)) {
	
		isRequiredTextPresent = true
		println(isRequiredTextPresent) }

else {
	isRequiredTextPresent = false
	}

	
	 if (isRequiredTextPresent == true)
			{
				println "Payment is successful and user is landed on 'Print' page"
				KeywordUtil.markPassed("All the relevant texts are present on Receipt Page")
				resText = "Pass"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,CrediDebitRow)
		
			}
	 else
			{
				println "Payment is not successful and user is not landed on 'Print' page"
				KeywordUtil.markFailed("Some texts are missing on the Receipt page")
				resText = "Fail"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,CrediDebitRow)
			}


	}
}




