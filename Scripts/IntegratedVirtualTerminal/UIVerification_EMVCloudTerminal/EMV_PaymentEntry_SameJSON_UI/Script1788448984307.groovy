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
		nameSheet = 'EMV_SameJson_Ui'
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
CustomKeywords.'ivtPages.IVTlogin.SetDataIVTlogin'(Url, Environment, UserName, Password, PartnerToken, JSONBody)


//EMV page verification

WebUI.verifyTextPresent('Payment Details', true)

WebUI.verifyTextPresent('EMV Cloud Terminal', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/label_EMVCloudTerminal'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/label_EMVCloudTerminal'), 10)
WebUI.click(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/label_EMVCloudTerminal'))

WebUI.verifyTextPresent('Terminal Name', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_TerminalName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_TerminalName'), 10)
//WebUI.verifyElementText(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/label_TerminalName'), 'Counter-001')

WebUI.verifyTextPresent('Select a terminal', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_Terminal'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_Terminal'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_Terminal'))

WebUI.verifyTextPresent("Cardholder's Name", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_CardHolderName'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_CardHolderName'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_CardHolderName'))

WebUI.executeJavaScript('window.scrollTo(0, document.body.scrollHeight)', null)

WebUI.verifyTextPresent('Billing Details', true)

WebUI.verifyTextPresent("Email Address", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_EmailAddress'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_EmailAddress'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_EmailAddress'))

WebUI.verifyTextPresent("Phone Number", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_PhoneNumber'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_PhoneNumber'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_PhoneNumber'))

WebUI.verifyTextPresent("Payment Date", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_PaymentDate'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_PaymentDate'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_PaymentDate'))

WebUI.verifyTextPresent("Country", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_Country'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_Country'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_Country'))

WebUI.verifyTextPresent("Address Line 1", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_AddressLine1'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_AddressLine1'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_AddressLine1'))

WebUI.verifyTextPresent("ZIP Code", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_ZipCode'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_ZipCode'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_ZipCode'))

WebUI.verifyTextPresent("State", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_State'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_State'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_State'))

WebUI.delay(1)
WebUI.verifyTextPresent("City", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_City'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_City'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_City'))

WebUI.verifyTextPresent('Additional Details', true)

WebUI.verifyTextPresent("UDF1", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF1'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF1'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF1'))

WebUI.verifyTextPresent("UDF2", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF2'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF2'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF2'))

WebUI.verifyTextPresent("UDF3", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF3'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF3'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF3'))

WebUI.verifyTextPresent("UDF4", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF4'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF4'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF4'))

WebUI.verifyTextPresent("UDF5", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF5'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF5'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF5'))

WebUI.verifyTextPresent("UDF6", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF6'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF6'), 10)
//WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF6'))

WebUI.verifyTextPresent("UDF7", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF7'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF7'), 10)
//WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF7'))

WebUI.verifyTextPresent("UDF8", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF8'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF8'), 10)
//WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF8'))

WebUI.verifyTextPresent("UDF9", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF9'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF9'), 10)
//WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF9'))

WebUI.verifyTextPresent("UDF10", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF10'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF10'), 10)
//WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF10'))

WebUI.verifyTextPresent("Continue", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/button_Continue'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/button_Continue'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/button_Continue'))

WebUI.verifyTextPresent("Exit", true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/button_Exit'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/button_Exit'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/button_Exit'))


//reporting in excel
WebUI.delay(2)
if((((((((((((((((((
	
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_TerminalName'),'value', 'Counter-001', 10, FailureHandling.OPTIONAL) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_EmailAddress'),'value', 'jane@email.com', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_PhoneNumber'),'value', '111-222-3333', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_PaymentDate'),'value', '09/10/2026', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_Country'),'value', 'US', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_AddressLine1'),'value', '123 Main St', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_ZipCode'),'value', '22201', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/select_State'),'value', 'VA', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/input_City'),'value', 'Arlington', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF1'),'value', 'value 1', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF2'),'value', 'value 2', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF3'),'value', 'value 3', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF4'),'value', 'value 4', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF5'),'value', 'value 5', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF6'),'value', 'value 6', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF7'),'value', 'value 7', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF8'),'value', 'value 8', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF9'),'value', 'value 9', 10, FailureHandling.OPTIONAL)) && 
	WebUI.verifyElementAttributeValue(findTestObject('Object Repository/IntegratedVT/EMVCloudTerminal/UDF10'),'value', 'value 10', 10, FailureHandling.OPTIONAL)) 
	
	{
	
		isRequiredTextPresent = true	
		println("All attribute validations passed")
	
		KeywordUtil.markPassed("All EMV attribute validations passed")
		resText = "Pass"
	
		CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)

	
	} else {
	
		isRequiredTextPresent = false	
		println("One or more attribute validations failed")
	
		KeywordUtil.markFailed("One or more EMV attribute validations failed")	
		resText = "Fail"
	
		CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
	}


 }
}
