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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil


// Read the Execution Profile
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
KeywordUtil.logInfo('executionProfile : " + executionProfile')


// Variables for writing Execution Result and Date/Time Stamp to Excel Spreadsheet
String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/Bootstrap/VT-Data.xlsx"
def numOfRows, dataFile, nameSheet


// Specify Data File	
nameSheet = "VT-Sale-CC"
numOfRows = findTestData('QA/Bootstrap/VT-TestData/VT-Sale-CC').getRowNumbers()
println("Number of Records: " + numOfRows)
dataFile = "QA/Bootstrap/VT-TestData/VT-Sale-CC"


// Variables for retriving test data from Excel Spreadsheet
def AppID, AppName, CardName, TranxCategory, CardNumber, CSC, ExpMM, ExpYYYY, AL1, AL2, ZIP, Amount, Email, Phone
def UDF1, UDF2, UDF3, UDF4, UDF5, UDF6, UDF7, UDF8, UDF9, UDF10
def CardType, Last4, CardNameV, ExecuteTC, VP1
def out_Username, out_Password, out_URL

String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_VT = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/"
String path_SaleKB = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SaleKeyboard/"


// For each row in the spreadsheet, execute the given steps
for (def row = 1; row <= numOfRows; row++)
	{
	
		ExecuteTC = findTestData(dataFile).getValue('Execute', row)
		System.out.println('Value of Execute is : ' + ExecuteTC)
		
		if (ExecuteTC.equalsIgnoreCase("Y"))
			{
				System.out.println('Begin Record Number: ' + row)
	
				Date today = new Date()
				println (today)
				String datText = today
				
				
// Get Username, Password and URL from corresponding Profile
				out_Username = GlobalVariable.Username
				out_Password = GlobalVariable.Password
				out_URL = GlobalVariable.AdminSuiteURL
				
				
// Get Data from Excel Spreadsheet
				
				AppID = findTestData(dataFile).getValue('AppID', row)
				AppName = findTestData(dataFile).getValue('AppName', row)
				CardName = findTestData(dataFile).getValue('CardName', row)
				TranxCategory = findTestData(dataFile).getValue('TranxCategory', row)
				CardNumber = findTestData(dataFile).getValue('CardNumber', row)
				
				CSC = findTestData(dataFile).getValue('CSC', row)
				ExpMM = findTestData(dataFile).getValue('ExpMM', row)
				ExpYYYY = findTestData(dataFile).getValue('ExpYYYY', row)
				AL1 = findTestData(dataFile).getValue('AL1', row)
				AL2 = findTestData(dataFile).getValue('AL2', row)
				
				ZIP = findTestData(dataFile).getValue('ZIP', row)
				Email = findTestData(dataFile).getValue('Email', row)
				Phone = findTestData(dataFile).getValue('Phone', row)
				
				Amount = findTestData(dataFile).getValue('Amount', row)
				UDF1 = findTestData(dataFile).getValue('UDF1', row)
				UDF2 = findTestData(dataFile).getValue('UDF2', row)
				UDF3 = findTestData(dataFile).getValue('UDF3', row)
				
				UDF4 = findTestData(dataFile).getValue('UDF4', row)
				UDF5 = findTestData(dataFile).getValue('UDF5', row)
				UDF6 = findTestData(dataFile).getValue('UDF6', row)
				UDF7 = findTestData(dataFile).getValue('UDF7', row)
				UDF8 = findTestData(dataFile).getValue('UDF8', row)
				
				UDF9 = findTestData(dataFile).getValue('UDF9', row)
				UDF10 = findTestData(dataFile).getValue('UDF10', row)
				CardType = findTestData(dataFile).getValue('CardType', row)
				CardNameV = findTestData(dataFile).getValue('CardNameV', row)
				VP1 = findTestData(dataFile).getValue('VP1', row)
				
				
// Log into Admin Suite				
				CustomKeywords.'adminSuiteBootstrap.loginFunctionality.setDataAdminSuiteLogin'(out_Username, out_Password, out_URL)
				
// Select Payment Application Link				
				WebUI.click(findTestObject(path_Dashboard + AppName))
				
// Select Auth and Capture link/button
				WebUI.click(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
				
// Select Keyboard Entry link
				WebUI.click(findTestObject(path_VT + 'a_KeyboardEntry_Sale'))
				
// Populate Credit Card Sale Page
				CustomKeywords.'adminSuiteBootstrap.virtualTerminalSetData.setDataSaleKeyboard'(CardName, TranxCategory, CardNumber, CSC, ExpMM, ExpYYYY, AL1, AL2, ZIP, Email, Phone, Amount, UDF1, UDF2, UDF3, UDF4, UDF5, UDF6, UDF7, UDF8, UDF9, UDF10)
				
// Verify Transaction Successful text is present on the Receipt
				WebUI.verifyTextPresent(VP1, true)
				
				
// Insert Pass/Fail and Date Time in the Wxcel Spreadsheet
				if (WebUI.verifyTextPresent(VP1, true))
					{
						resText = "Pass"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						KeywordUtil.markPassed("The following Verifiation Passed : " + VP1)
						
					}
					else
					{
						resText = "Fail"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						KeywordUtil.markFailed("The following Verifiation Failed : " + VP1)
					}
				
			
			
				
			}
	}