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
//This Test Case does an ACH Corporate Debit Entry
//using VT-DebitData-NoCF-Generic Data file
//and will execute for QA, Demo, Upgrade and Production
//bootstrap Virtual Terminal
//Environment needs to be selected for executing
//in each environment.
//#################################################



String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_VT = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/"


String li_1 = GlobalVariable.vpos_Prefix
String li_2 = "/transactions/AuthCapForm/"
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, cardNameV, al1V, al2V, zipV, accType, last4V, ein

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "C:\\KatalonData\\Bootstrap\\VT-ACH-Data.xlsx"
def numOfRows, dataFile, nameSheet


	
	nameSheet = "VT-ACHCorp-NoCF-Generic"
	numOfRows = findTestData('QA/Bootstrap/VT-ACH-TestData/VT-DebitDataCorp-NoCF-Generic').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "QA/Bootstrap/VT-ACH-TestData/VT-DebitDataCorp-NoCF-Generic"
	
	
	
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
					Thread.sleep(2000)
					
					WebUI.click(findTestObject(path_VT + 'button_Debit'))
					Thread.sleep(2000)
					
					WebUI.click(findTestObject(path_VT + 'a_Corporate'))
					Thread.sleep(2000)
						
						
					CustomKeywords.'adminSuiteBootstrap.debitCorporatesetData.debitCorporate_DataDriven'(row,dataFile)
					Thread.sleep(2000)
					
						
						WebUI.verifyTextPresent('Transaction Successful', true)
						
						
						
						WebUI.verifyTextPresent('Remittance ID', true)
						WebUI.verifyTextPresent('Received', true)
						
						WebUI.verifyTextPresent('UDF1', true)
						WebUI.verifyTextPresent('UDF2', true)
						WebUI.verifyTextPresent('UDF3', true)
						WebUI.verifyTextPresent('UDF4', true)
						WebUI.verifyTextPresent('UDF5', true)
						WebUI.verifyTextPresent('UDF6', true)
						WebUI.verifyTextPresent('UDF7', true)
						WebUI.verifyTextPresent('UDF8', true)
						WebUI.verifyTextPresent('UDF9', true)
						WebUI.verifyTextPresent('UDF 10', true)
						
						WebUI.verifyTextPresent('Australia', true)
						WebUI.verifyTextPresent('Denmark', true)
						WebUI.verifyTextPresent('Sweden', true)
						WebUI.verifyTextPresent('Austria', true)
						WebUI.verifyTextPresent('Orange Recorded', true)
						WebUI.verifyTextPresent('Yellow Recorded', true)
						WebUI.verifyTextPresent('Norway', true)
						WebUI.verifyTextPresent('Netherlands', true)
						WebUI.verifyTextPresent('Switzerland', true)
						WebUI.verifyTextPresent('France', true)
						
						
						WebUI.verifyTextPresent('Amount', true)
						
						WebUI.verifyTextPresent('Total Amount', true)
						WebUI.verifyTextPresent('Transaction Type', true)
						
						WebUI.verifyTextPresent('12.50', true)
						
						
						WebUI.verifyTextPresent('Debit', true)
						
						WebUI.verifyTextPresent('Check Information', true)
						WebUI.verifyTextPresent('Account Type', true)
						WebUI.verifyTextPresent('Account Number', true)
						WebUI.verifyTextPresent('Routing Number', true)
						WebUI.verifyTextPresent('2691', true)
						
						
														
						
						al1V = findTestData(dataFile).getValue('AL1', row)
						al2V = findTestData(dataFile).getValue('AL2', row)
						last4V = findTestData(dataFile).getValue('Last4', row)
						ein = findTestData(dataFile).getValue('EmployeeID', row)
						
												
						
						
						WebUI.verifyTextPresent('Address Line 1', true)
						WebUI.verifyTextPresent('Address Line 2', true)
						WebUI.verifyTextPresent('Country', true)
						WebUI.verifyTextPresent('City', true)
						WebUI.verifyTextPresent('State', true)
						WebUI.verifyTextPresent('ZIP Code', true)
						
						
						WebUI.verifyTextPresent(al1V, true)
						WebUI.verifyTextPresent(al2V, true)
						WebUI.verifyTextPresent('United States', true)
						WebUI.verifyTextPresent('ARLINGTON', true)
						WebUI.verifyTextPresent('Virginia', true)
						WebUI.verifyTextPresent('22201', true)
						
						WebUI.verifyTextPresent('Checking', true)
						WebUI.verifyTextPresent(last4V, true)
						WebUI.verifyTextPresent('Employer Identification Number', true)
						WebUI.verifyTextPresent('EIN', true)
						WebUI.verifyTextPresent(ein, true)
						
					
					WebUI.closeBrowser()
				}
		}


