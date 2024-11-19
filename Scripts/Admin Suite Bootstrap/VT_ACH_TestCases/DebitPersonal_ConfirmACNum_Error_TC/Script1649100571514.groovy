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




//#################################################
//
//This Test Case does an ACH Personla Debit Entry
//using VT-DebitData-NoCF-Generic Data file
//and will execute for QA, Demo, Upgrade and Production
//bootstrap Virtual Terminal
//Environment needs to be selected for executing
//in each environment.
//#################################################



String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_VT = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/"
String path_DebitPersonal = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/ACHPersonal/"


String li_1 = GlobalVariable.vpos_Prefix
String li_2 = "/transactions/AuthCapForm/"
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, cardNameV, al1V, al2V, zipV, accType, last4V

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "C:\\KatalonData\\Bootstrap\\VT-Misc-Data.xlsx"
def numOfRows, dataFile, nameSheet


	
	nameSheet = "ConfirmAcNumError"
	numOfRows = findTestData('QA/Bootstrap/VT-ACH-TestData/VT-DebitData-ConfAcNumError').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "QA/Bootstrap/VT-ACH-TestData/VT-DebitData-ConfAcNumError"
	
	
	
	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			
			switch(executionProfile)
			{
				case "QAProfile":
						 appName = findTestData(dataFile).getValue('AppNameQA', row)
						 appID = findTestData(dataFile).getValue('AppIDQA', row)
				break
				
				case "QA2Profile":
						appName = findTestData(dataFile).getValue('AppNameQA', row)
						appID = findTestData(dataFile).getValue('AppIDQA', row)
				break
				
				case "DemoProfile":
						appName = findTestData(dataFile).getValue('AppNameDemo', row)
						appID = findTestData(dataFile).getValue('AppIDDemo', row)
				break
				
				case "Production":
						appName = findTestData(dataFile).getValue('AppNameProd', row)
						appID = findTestData(dataFile).getValue('AppIDProd', row)
				break
				
				case "Upgrade":
						appName = findTestData(dataFile).getValue('AppNameProd', row)
						appID = findTestData(dataFile).getValue('AppIDProd', row)
				break
			}
			
			
			
			String hrefAppID = li_1 + appID + li_2
			String hrefApp = li_1 + appID + "/"
			println("hrefApp : " + hrefApp)
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
					
										
					WebUI.click(findTestObject(path_Dashboard + appName))
					
					WebUI.click(findTestObject(path_VT + 'button_Debit'))
					
					WebUI.click(findTestObject(path_VT + 'a_Personal'))
					
					
					// Get Confirm Account Number data and populate
					def confirmAcNum = findTestData(dataFile).getValue('ConfirmAcNum', row)
					WebUI.setText(findTestObject(path_DebitPersonal + 'input_confirmAccountNumber'), confirmAcNum)
						

					CustomKeywords.'adminSuiteBootstrap.debitPersonalsetData.debitPersonal_DataDriven'(row,dataFile)
					
						// Get Error Message and compare
						def confirmError = findTestData(dataFile).getValue('ErrorMessage', row)
						WebUI.verifyTextPresent(confirmError, true)
						
						
						
						
					
					WebUI.closeBrowser()
				}
		}


