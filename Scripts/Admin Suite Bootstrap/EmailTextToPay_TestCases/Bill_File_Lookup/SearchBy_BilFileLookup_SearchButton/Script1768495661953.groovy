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

def executionProfile = RC.getExecutionProfile()

def deepAdminSuiteURL, deepUsername, deepPassword

def PaymentAppName, CAN, FirstName, LastORcompanyName, Look1, Look2, Look3

def fileLoc, numOfRows, dataFile, nameSheet, isRequiredTextPresent = false

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"


switch(executionProfile)
{
	case "QAProfile":
			 deepAdminSuiteURL = "https://qa.velocitypayment.com/admin/deep"
			 deepUsername = GlobalVariable.Username
			 deepPassword = GlobalVariable.Password
			 
		fileLoc = 'KatalonData/EmailTextToPay/BillFileLookUp_SearchButton.xlsx'
		nameSheet = 'SearchButton'
		dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/EmailTextToPay/BillFileLookUp_SearchButton.xlsx', nameSheet, true)		 		 
		
		break
		
	case "QA2Profile":
			deepAdminSuiteURL = "https://qa2.velocitypayment.com/admin/deep"	
			deepUsername = GlobalVariable.Username
			deepPassword = GlobalVariable.Password
			
		fileLoc = 'KatalonData/EmailTextToPay/BillFileLookUp_SearchButton.xlsx'
		nameSheet = 'SearchButton'
		dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/EmailTextToPay/BillFileLookUp_SearchButton.xlsx', nameSheet, true)
	
		break
				
	case "DemoProfile":
			deepAdminSuiteURL = "https://demo.velocitypayment.com/admin/imtiazdemo"
			deepUsername = GlobalVariable.AutoUserAdminSuite
			deepPassword = GlobalVariable.AutoPasswordAdminSuite
	fileLoc = 'KatalonData/EmailTextToPay/BillFileLookUp_SearchButton_Demo.xlsx'
	nameSheet = 'SearchButton'
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/EmailTextToPay/BillFileLookUp_SearchButton_Demo.xlsx', nameSheet, true)
		
		break	
		
	case "Production":
		deepAdminSuiteURL = "https://www.velocitypayment.com/admin/testcustomer"
		deepUsername = GlobalVariable.AutoUserAdminSuite
		deepPassword = GlobalVariable.AutoPasswordAdminSuite
		
	fileLoc = 'KatalonData/EmailTextToPay/BillFileLookUp_SearchButton_Prod.xlsx'
	nameSheet = 'SearchButton'
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/EmailTextToPay/BillFileLookUp_SearchButton_Prod.xlsx', nameSheet, true)

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
				
				 PaymentAppName = dataFile.getValue("PaymentAppName", row)
				 CAN = dataFile.getValue("CAN", row)
				 FirstName = dataFile.getValue("FirstName", row)
				 LastORcompanyName = dataFile.getValue("LastORcompanyName", row)
				 				 
switch(executionProfile)
{
	case "QAProfile":
				 Look1 = dataFile.getValue("Look1", row)
				 Look2 = dataFile.getValue("Look2", row)
				 Look3 = dataFile.getValue("Look3", row)						

			break
						
	case "QA2Profile":
				Look1 = dataFile.getValue("Look1", row)
				Look2 = dataFile.getValue("Look2", row)
				Look3 = dataFile.getValue("Look3", row)

			break			
		
	case "DemoProfile":
				Look1 = dataFile.getValue("AccountNumber", row)
				Look2 = dataFile.getValue("PhoneNumber", row)
				Look3 = dataFile.getValue("Lookup3Label", row)

			break		
	
	case "Production":
			Look1 = dataFile.getValue("AccountNumber", row)
			Look2 = dataFile.getValue("PhoneNumber", row)
			Look3 = dataFile.getValue("Lookup3Label", row)

		break				 
}				 
							
				 
// Log into Admin Suite
CustomKeywords.'adminSuiteBootstrap.loginFunctionality.setDataAdminSuiteLogin'(deepUsername,deepPassword,deepAdminSuiteURL)

// Select Issue Email or Text to Pay Link
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'))

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/Link_leftNav_IssueEmail_TaxtoPay'))

//Validating all scnearios
CustomKeywords.'issueEmailTextToPay.BillFileLookupPage.setDataBillFileLookup'(PaymentAppName, CAN, FirstName, LastORcompanyName, Look1, Look2, Look3)
//CustomKeywords.'issueEmailTextToPay.BillFileLookupPage.Search'()

WebUI.delay(2)

if (WebUI.verifyTextPresent('Search', false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}

if (isRequiredTextPresent) {
	if (WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/btn_Submit'),2)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}

if (isRequiredTextPresent) {
	if (WebUI.waitForElementNotClickable(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/btn_Submit'),2)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
		println "Search button is disabled"
	} else {
		isRequiredTextPresent = false
	}
}

	
	
	if (isRequiredTextPresent == true)
		{
			println "TC is Passed: Search button is disabled"
			KeywordUtil.markPassed("All the relevant texts are present on Receipt Page")
			resText = "Pass"
			CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
	
		}
	else
		{
			println "TC is Failed: Search button is not disabled"
			KeywordUtil.markFailed("Some texts are missing on the Receipt page")
			resText = "Fail"
			CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
	
		}

			}
	}		
//WebUI.closeBrowser()

