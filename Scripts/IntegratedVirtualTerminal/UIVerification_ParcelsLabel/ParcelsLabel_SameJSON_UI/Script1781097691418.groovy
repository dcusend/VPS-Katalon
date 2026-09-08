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

def Amount, parcelData

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
							  
				 
// Login(Submit Request)
CustomKeywords.'ivtPages.IVTlogin.SetDataIVTlogin'(Url, Environment, UserName, Password, PartnerToken, JSONBody)
			
  }
}
			
					
//Parcels Label page verification
		
WebUI.delay(2)

fileLoc = 'KatalonData/IVT/IVT_SameJSON_UI.xlsx'
nameSheet = 'ParcelsLabel_SameJson_Ui'
parcelData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/IVT/IVT_SameJSON_UI.xlsx', nameSheet, true)


numOfRows = parcelData.getRowNumbers()
println("Number of Records: " + numOfRows)

for (def ParcelsRow = 1; ParcelsRow <= numOfRows; ParcelsRow++)
{

	ExecuteTC = parcelData.getValue('Execute', ParcelsRow)
	System.out.println('Value of Execute is : ' + ExecuteTC)
	
	
	if (ExecuteTC.equalsIgnoreCase("Y"))
		{
			System.out.println('Begin Record Number: ' + ParcelsRow)
			
			Date today = new Date()
			println (today)
			String datText = today
															  
			Amount = parcelData.getValue("Amount", ParcelsRow)
			 
			 
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

WebUI.verifyTextPresent('Due Amount', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount'))


//comparing Parcel table from excel to UI table
CustomKeywords.'ivtPages.ParcelsLabel.verifyParcelData'(JSONBody)

//Due Amount verification
Amount = WebUI.getAttribute(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount'), "value") 
println(Amount) 
WebUI.verifyEqual(Amount, parcelData.getValue("Amount", ParcelsRow))



//reporting in excel
WebUI.delay(2)
if (
		WebUI.verifyTextPresent('Parcels Label', true) &&
		
		WebUI.verifyTextPresent('Show', true) &&
		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Show'), 10) &&
		WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Show')) &&
		
		WebUI.verifyTextPresent('Reference Number', true) &&
		WebUI.verifyTextPresent('Quantity', true) &&
		WebUI.verifyTextPresent('Amount', true) &&
						
		WebUI.verifyTextPresent('Previous', true) &&
		WebUI.verifyTextPresent('Next', true) &&
		
		WebUI.verifyTextPresent('Due Amount', true) &&
		WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount')) &&
		WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount')) &&
		
		WebUI.verifyEqual(Amount, parcelData.getValue("Amount", ParcelsRow))
				
	) 

		{
		isRequiredTextPresent = true
		println(isRequiredTextPresent) 
		}

else{
	 isRequiredTextPresent = false
	}

	
	if (isRequiredTextPresent == true)
			{
				println "All the relevant texts are present on 'Parcels Label' Page"
				KeywordUtil.markPassed("All the relevant texts are present on Receipt Page")
				resText = "Pass"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,ParcelsRow)
		
			}
	else
			{
				println "Some texts are missing on the 'Parcels Label' page"
				KeywordUtil.markFailed("Some texts are missing on the Receipt page")
				resText = "Fail"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,ParcelsRow)
			}
	
	
	}
	
}


