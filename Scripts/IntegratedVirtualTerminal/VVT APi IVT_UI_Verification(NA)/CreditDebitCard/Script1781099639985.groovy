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
	
	def fileLoc, nameSheet, dataFile, numOfRows, isRequiredTextPresent= false
	

def executionProfile = RC.getExecutionProfile()


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
						  
		fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_Login.xlsx'
		nameSheet = 'SubmitRequest'
		dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_Login.xlsx', nameSheet, true)
	
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
	
				Date today = new Date()
				println (today)
				String datText = today
								
				 
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
							  
				 
// Login(Submit Request)
CustomKeywords.'ivtPages.IVTlogin.SetDataVVTApiIVTlogin'(Url, Environment, UserName, Password, PartnerToken, JSONBody)


						//Credit/Debit Card page verification


WebUI.verifyTextPresent('Payment Details', true)

WebUI.verifyTextPresent('Credit/Debit Card', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/label_CreditCard'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/label_CreditCard'), 10)
WebUI.click(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/label_CreditCard'))

WebUI.verifyTextPresent('Card Number', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_CardNumber'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_CardNumber'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_CardNumber'))

WebUI.verifyTextPresent('Expiration Date', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/select_MM'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/select_MM'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/select_MM'))
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/select_YYYY'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/select_YYYY'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/select_YYYY'))

WebUI.verifyTextPresent("Card Security Code", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_CardSecurityCode'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_CardSecurityCode'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_CardSecurityCode'))

WebUI.verifyTextPresent("Cardholder's Name", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_CardHolderName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_CardHolderName'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_CardHolderName'))

WebUI.executeJavaScript('window.scrollTo(0, document.body.scrollHeight)', null)

WebUI.verifyTextPresent('Billing Details', true)

WebUI.verifyTextPresent("Email Address", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_EmailAddress'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_EmailAddress'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_EmailAddress'))

WebUI.verifyTextPresent("Phone Number", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_PhoneNumber'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_PhoneNumber'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_PhoneNumber'))

WebUI.verifyTextPresent("Payment Date", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_PaymentDate'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_PaymentDate'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_PaymentDate'))

WebUI.verifyTextPresent("Country", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/select_Country'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/select_Country'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/select_Country'))

WebUI.verifyTextPresent("Address Line 1", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_AddressLine1'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_AddressLine1'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_AddressLine1'))

WebUI.verifyTextPresent("ZIP Code", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_ZipCode'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_ZipCode'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_ZipCode'))

WebUI.verifyTextPresent("State", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/select_State'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/select_State'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/select_State'))

WebUI.verifyTextPresent("City", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_City'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_City'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/input_City'))

WebUI.verifyTextPresent('Additional Details', true)

WebUI.verifyTextPresent("user_defined_1", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF1'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF1'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF1'))

WebUI.verifyTextPresent("user_defined_2", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF2'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF2'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF2'))

WebUI.verifyTextPresent("user_defined_3", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF3'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF3'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF3'))

WebUI.verifyTextPresent("user_defined_4", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF4'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF4'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF4'))

WebUI.verifyTextPresent("user_defined_5", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF5'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF5'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF5'))

WebUI.verifyTextPresent("user_defined_6", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF6'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF6'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF6'))

WebUI.verifyTextPresent("user_defined_7", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF7'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF7'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF7'))

WebUI.verifyTextPresent("user_defined_8", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF8'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF8'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF8'))

WebUI.verifyTextPresent("user_defined_9", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF9'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF9'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF9'))

WebUI.verifyTextPresent("user_defined_10", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF10'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF10'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/UDF10'))


WebUI.verifyTextPresent("Continue", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/button_Continue'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/button_Continue'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/button_Continue'))

WebUI.verifyTextPresent("Exit", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/button_Exit'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/button_Exit'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/button_Exit'))


	}
		
}
	

