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

def executionProfile = RC.getExecutionProfile()

def deepAdminSuiteURL, deepUsername, deepPassword

def M_PaymentId, M_FilterText
		 
def fileLoc, numOfRows, dataFile, nameSheet, isRequiredTextPresent = false

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"

							//Manage Email or Text to Pay

switch(executionProfile)
{
	
	case "QAProfile":	
		deepAdminSuiteURL = "https://qa.velocitypayment.com/admin/deep"
		deepUsername = GlobalVariable.Username
		deepPassword = GlobalVariable.Password
	
	fileLoc = "KatalonData/EmailTextToPay/Manage_EmailText.xlsx"
	nameSheet = "ManageEmailText_Errors_Search"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/EmailTextToPay/Manage_EmailText.xlsx", nameSheet, true)
	
		break
		
	case "QA2Profile":	
		deepAdminSuiteURL = "https://qa2.velocitypayment.com/admin/deep"
		deepUsername = GlobalVariable.Username
		deepPassword = GlobalVariable.Password
		
	fileLoc = 'KatalonData/EmailTextToPay/Manage_EmailText.xlsx'
	nameSheet = 'ManageEmailText_Errors_Search'
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/EmailTextToPay/Manage_EmailText.xlsx', nameSheet, true)
		
		break
			
	case "DemoProfile":
			deepAdminSuiteURL = "https://demo.velocitypayment.com/admin/imtiazdemo"
			deepUsername = GlobalVariable.AutoUserAdminSuite
			deepPassword = GlobalVariable.AutoPasswordAdminSuite
		
	fileLoc = 'KatalonData/EmailTextToPay/Manage_EmailText_Demo.xlsx'
	nameSheet = 'ManageEmailText_Errors_Search'
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/EmailTextToPay/Manage_EmailText_Demo.xlsx', nameSheet, true)
	
		break
		
	case "Production":
		deepAdminSuiteURL = "https://www.velocitypayment.com/admin/testcustomer"
		deepUsername = GlobalVariable.AutoUserAdminSuite
		deepPassword = GlobalVariable.AutoPasswordAdminSuite
		
	fileLoc = 'KatalonData/EmailTextToPay/Manage_EmailText_Prod.xlsx'
	nameSheet = 'ManageEmailText_Errors_Search'
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/EmailTextToPay/Manage_EmailText_Prod.xlsx', nameSheet, true)

		break	
		
	case "Upgrade":
		deepAdminSuiteURL = "https://www.velocitypayment.com/admin/testcustomer"
		deepUsername = GlobalVariable.AutoUserAdminSuite
		deepPassword = GlobalVariable.AutoPasswordAdminSuite
		
	fileLoc = "KatalonData/EmailTextToPay/Manage_EmailText_Upgrade.xlsx"
	nameSheet = "ManageEmailText_Errors_Search"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/EmailTextToPay/Manage_EmailText_Upgrade.xlsx", nameSheet, true)
			
		
}
	

numOfRows = dataFile.getRowNumbers()
println("Number of Records: " + numOfRows)


// For each row in the spreadsheet, execute the given steps
for (def row = 1; row <= numOfRows; row++)
	{
	
		ExecuteTC = dataFile.getValue('Run', row)
		System.out.println('Value of Execute is : ' + ExecuteTC)
		
		
		if (ExecuteTC.equalsIgnoreCase("Y"))
			{
				System.out.println('Begin Record Number: ' + row)
	
				Date today = new Date()
				println (today)
				String datText = today
								
				M_PaymentId = dataFile.getValue("PaymentId", row)
				M_FilterText= dataFile.getValue("FilterText", row)
				ErrorMessage = dataFile.getValue("ErrorMessage", row)
				 				 								

// Log into Admin Suite
CustomKeywords.'adminSuiteBootstrap.loginFunctionality.setDataAdminSuiteLogin'(deepUsername,deepPassword,deepAdminSuiteURL)

///Menu
WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'))

//Select Manage Email/Text to Pay Link
		WebUI.delay(1)
		switch(executionProfile)
		{
			case "QAProfile":
				
					WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_ManageEmailOrTextToPay'))
						
					break
											
			case "QA2Profile":
				
					WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_ManageEmailOrTextToPay'))
						
					break
										
			case "DemoProfile":
				
					WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_ManageEmailOrTextToPay'))
						
					break
								
			case "Production":
				
					WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_ManageEmailOrTextToPay_Prod'))
						
					break
					
			case "Upgrade":
					
					WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_ManageEmailOrTextToPay_Prod'))
					
					break

					
		 }
		 
	
//Search Results
CustomKeywords.'issueEmailTextToPay.Manage_EmailText_ToPay.SearchResults'(M_PaymentId)

//Filter 
CustomKeywords.'issueEmailTextToPay.Manage_EmailText_ToPay.FilterResults'(M_FilterText)  //T_Filtertext is M_FilterText here


WebUI.delay(2)

if (WebUI.verifyTextPresent(ErrorMessage, false)) {
		isRequiredTextPresent = true
			println(isRequiredTextPresent)
		}
		else {
			isRequiredTextPresent = false
		}



if (isRequiredTextPresent == true)
	{
		println "All the relevant texts are present on Receipt Page"
		KeywordUtil.markPassed("All the relevant texts are present on Receipt Page")
		resText = "Pass"
		CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)

	}
else
	{
		println "Some texts are missing on the Receipt page"
		KeywordUtil.markFailed("Some texts are missing on the Receipt page")
		resText = "Fail"
		CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)

	}

		
	  }
  }

