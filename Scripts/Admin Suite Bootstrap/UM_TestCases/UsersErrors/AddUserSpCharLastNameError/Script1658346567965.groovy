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

import pages.GenerateRandom

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
String appName, appID, spUsername

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/Bootstrap/UM-Data.xlsx"
def numOfRows, dataFile, nameSheet, dataFileEmulator

nameSheet = "CreateUserSCLNameErr"
dataFile = "QA/Bootstrap/UM-TestData/CreateUserSCLNameErr"
numOfRows = findTestData('QA/Bootstrap/UM-TestData/CreateUserSCLNameErr').getRowNumbers()
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
				
				//def buildUsername = genRand.getRandomAlpha()
				def buildUsername = CustomKeywords.'pages.GenerateRandom.getRandomAlpha'()
				
				def prefixUsername = findTestData(dataFile).getValue('Lastname', row)
					
				
				spUsername = prefixUsername + buildUsername
				
				
				// Populate Add User page
				WebUI.setText(findTestObject(path_AddUser + 'input_EmailAddress'), 'iahmed@govolution.com')
				WebUI.setText(findTestObject(path_AddUser + 'input_Username'), buildUsername)
				WebUI.setText(findTestObject(path_AddUser + 'input_FirstName'), 'Ashley')
				WebUI.setText(findTestObject(path_AddUser + 'input_LastName'), spUsername)
				WebUI.setText(findTestObject(path_AddUser + 'input_Password'), 'hello6666')
				WebUI.setText(findTestObject(path_AddUser + 'input_ConfirmPassword'), 'hello6666')
				WebUI.check(findTestObject(path_AddUser + 'input_No_lock'))
				
				// Select the Create button
				WebUI.click(findTestObject(path_AddUser + 'button_Create'))
				Thread.sleep(10000)
				
				// Verify Static Text
				if (WebUI.verifyTextPresent('Error! Please provide the following required information as indicated below', true))
				{
					WebUI.verifyTextPresent('Last name can not contain "+"," -", "=" or "@"', false)
					KeywordUtil.markPassed("Last name can not contain")
					resText = "Pass"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)

				}
				else
				{
					KeywordUtil.markFailed("Last name can not contain")
					resText = "Fail"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
					
				}
				
				WebUI.closeBrowser()
				
			}
			
	}			