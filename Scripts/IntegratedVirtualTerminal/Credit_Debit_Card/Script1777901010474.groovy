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

def Show, DueAmount, CardNo_Out, Expiry_Out, SecurityCode_Out, Name_Out,
	Email_Out, Phone_Out, PaymentDate_Out, Country_Out, Address_Out, Zip_Out, State_Out, City_Out,
	UDF1_Out, UDF2_Out, UDF3_Out, UDF4_Out, UDF5_Out, UDF6_Out, UDF7_Out, UDF8_Out, UDF9_Out, UDF10_Out

def fileLoc, nameSheet, numOfRows, isRequiredTextPresent= false, submitData, parcelData, creditDebitData

def executionProfile = RC.getExecutionProfile()


switch(executionProfile)
{
case "QAProfile":
		 Url = "https://dev-algorithm.govolution.com/vvtapi/VVTAPI_FORM_POST_TEST_PAGE.html"
		 UserName = GlobalVariable.IVTUserName
		 Password = GlobalVariable.IVTPassword
		 PartnerToken= GlobalVariable.IVTPartnerToken
					  
	fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx'
	nameSheet = 'SubmitRequest'
	submitData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx', nameSheet, true)
	
	break
	
case "QA2Profile":
		 Url = "https://dev-algorithm.govolution.com/vvtapi/VVTAPI_FORM_POST_TEST_PAGE.html"
		 UserName = GlobalVariable.IVTUserName
		 Password = GlobalVariable.IVTPassword
		 PartnerToken= GlobalVariable.IVTPartnerToken
					  
	fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx'
	nameSheet = 'SubmitRequest'
	submitData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx', nameSheet, true)

	break
			
case "DemoProfile":
		 Url = "https://dev-algorithm.govolution.com/vvtapi/VVTAPI_FORM_POST_TEST_PAGE.html"
		 UserName = GlobalVariable.IVTUserName
		 Password = GlobalVariable.IVTPassword
		 PartnerToken= GlobalVariable.IVTPartnerToken
					  
	fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx'
	nameSheet = 'SubmitRequest'
	submitData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx', nameSheet, true)

	break
	
case "Production":
		 Url = "https://dev-algorithm.govolution.com/vvtapi/VVTAPI_FORM_POST_TEST_PAGE.html"
		 UserName = GlobalVariable.IVTUserName
		 Password = GlobalVariable.IVTPassword
		 PartnerToken= GlobalVariable.IVTPartnerToken
					  
	fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx'
	nameSheet = 'SubmitRequest'
	submitData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx', nameSheet, true)

	break
		
}

          				
							//Part 1- VVTApiIVT login


numOfRows = submitData.getRowNumbers()
println("Number of Records: " + numOfRows)


// For each row in the spreadsheet, execute the given steps
for (def row = 1; row <= numOfRows; row++)
{

	ExecuteTC = submitData.getValue('Execute', row)
	System.out.println('Value of Execute is : ' + ExecuteTC)
	
	
	if (ExecuteTC.equalsIgnoreCase("Y"))
		{
			System.out.println('Begin Record Number: ' + row)
							
			 
				Environment = submitData.getValue("Environment", row)
				JSONBody   = submitData.getValue("JSONBody", row)
									  
			 
// Login(Submit Request)
CustomKeywords.'ivtPages.VVTApiIVTlogin.SetDataVVTApiIVTlogin'(Url, Environment, UserName, Password, PartnerToken, JSONBody)

		

							//Part 2- Parcels Label page validation


WebUI.verifyTextPresent('Parcels Label', true)

fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx'
nameSheet = 'ParcelsLabel'
parcelData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx', nameSheet, true)


numOfRows = parcelData.getRowNumbers()
println("Number of Records: " + numOfRows)

for (def ParcelsRow = 1; ParcelsRow <= numOfRows; ParcelsRow++)
{

	ExecuteTC = parcelData.getValue('Execute', ParcelsRow)
	System.out.println('Value of Execute is : ' + ExecuteTC)
	
	
	if (ExecuteTC.equalsIgnoreCase("Y"))
		{
			System.out.println('Begin Record Number: ' + ParcelsRow)
							
			 					 
			 Show = parcelData.getValue("Show", ParcelsRow)
			 println(Show)
			 DueAmount = parcelData.getValue("DueAmount", ParcelsRow)
			 println(DueAmount)
		 
CustomKeywords.'ivtPages.ParcelsLabel.SetDataParcelsLabel'(Show, DueAmount )

		 

							//Part 3- Credit/Debit Card page validation

		 
WebUI.verifyTextPresent('Credit/Debit Card', true)
WebUI.click(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/label_CreditCard'))

fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx'
nameSheet = 'CreditDebitCard'
creditDebitData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx', nameSheet, true)









//WebUI.click(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/button_Continue'))

//WebUI.click(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/button_Exit'))

		}

	}

		}
		
}
