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

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil


// VT Paths
String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_Users = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/Users/"
String path_UserView = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/UserView/"
String path_DeleteUser = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/DeleteUser/"
String path_AddUser = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/AddUser/"


// Get the Execution Profile like QA or Demo
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, cardNameV, al1V, al2V, zipV, cardTypeV

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/Bootstrap/UM-Data.xlsx"
def numOfRows, dataFile, nameSheet, dataFileEmulator



nameSheet = "CreateUserErrors"
dataFile = "QA/Bootstrap/UM-TestData/CreateUserErrors"
numOfRows = findTestData('QA/Bootstrap/UM-TestData/CreateUserErrors').getRowNumbers()
println("Number of Records: " + numOfRows)


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
				
	

				// Log into Admin Suite
					CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
					
				// Select the User Management button
					WebUI.click(findTestObject(path_Dashboard + 'a_Access User Management'))
					
				// Select the Add User button
					WebUI.click(findTestObject(path_Users + 'a_Add User'))
					
				// GetData
					def userName = findTestData(dataFile).getValue('Username', row)
					def firstName = findTestData(dataFile).getValue('Firstname', row)
					def lastName = findTestData(dataFile).getValue('Lastname', row)
					def email = findTestData(dataFile).getValue('Email', row)
					def pwd = findTestData(dataFile).getValue('Password', row)
					def confirPwd = findTestData(dataFile).getValue('ConfirmPassword', row)
					def lockAC = findTestData(dataFile).getValue('Lock', row)
					def errorMsg = findTestData(dataFile).getValue('ErrorMsg', row)
					
					
				// SetData
					WebUI.setText(findTestObject(path_AddUser + 'input_Username'), userName)
					WebUI.setText(findTestObject(path_AddUser + 'input_FirstName'), firstName)
					WebUI.setText(findTestObject(path_AddUser + 'input_LastName'), lastName)
					WebUI.setText(findTestObject(path_AddUser + 'input_EmailAddress'), email)
					WebUI.setText(findTestObject(path_AddUser + 'input_Password'), pwd)
					WebUI.setText(findTestObject(path_AddUser + 'input_ConfirmPassword'), confirPwd)
					
					if (lockAC.equalsIgnoreCase("N"))
						{
							// Select No for Lock Account
							WebUI.check(findTestObject(path_AddUser + 'input_No_lock'))
						}
					else if (lockAC.equalsIgnoreCase("Y"))
						{
							// Select Yes for Lock Account
							WebUI.check(findTestObject(path_AddUser + 'input_Yes_lock'))
						}
					else
						{
							// Select No for Lock Account
							WebUI.check(findTestObject(path_AddUser + 'input_No_lock'))
						}
					
				// Select the Create button
					WebUI.click(findTestObject(path_AddUser + 'button_Create'))
				
					
				// Verify the Error Messages
					if (WebUI.verifyTextPresent(errorMsg, true))
					{
						CustomKeywords.'pages.CustomLogger.log_Logger'("User did not got created, received Error","Pass")
						KeywordUtil.markPassed("User did not got created, received Error")
						resText = "Pass"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
	
					}
					else
					{
						CustomKeywords.'pages.CustomLogger.log_Logger'("Error did not match or User got created, check Test Data","Fail")
						KeywordUtil.markFailed("Error did not match or User got created, check Test Data")
						resText = "Fail"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						
					}
				
					WebUI.closeBrowser()
			}
			
	}
