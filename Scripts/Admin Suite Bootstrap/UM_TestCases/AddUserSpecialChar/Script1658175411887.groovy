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


nameSheet = "CreateUserSpChar"
dataFile = "QA/Bootstrap/UM-TestData/CreateUserSpChar"
numOfRows = findTestData('QA/Bootstrap/UM-TestData/CreateUserSpChar').getRowNumbers()
println("Number of Records: " + numOfRows)


// For each row in the spreadsheet, execute the given steps
for (def row = 1; row <= numOfRows; row++)
	{
	
		ExecuteTC = findTestData(dataFile).getValue('Execute', row)
		System.out.println('Value of Execute is : ' + ExecuteTC)
		
		if (ExecuteTC.equalsIgnoreCase("Y"))
			{
				System.out.println('Begin Record Number: ' + row)
				
				// Log into Admin Suite
				CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
				
				// Select the User Management button
				WebUI.click(findTestObject(path_Dashboard + 'a_Access User Management'))
				
				// Select the Add User button
				WebUI.click(findTestObject(path_Users + 'a_Add User'))
				
				
				def buildUsername = CustomKeywords.'pages.GenerateRandom.getRandomAlpha'()
				
				def prefixUsername = findTestData(dataFile).getValue('Username', row)
				
					
				spUsername = buildUsername + prefixUsername + buildUsername
				
	
				
				// Populate Add User page
				WebUI.setText(findTestObject(path_AddUser + 'input_EmailAddress'), 'iahmed@govolution.com')
				WebUI.setText(findTestObject(path_AddUser + 'input_Username'), spUsername)
				WebUI.setText(findTestObject(path_AddUser + 'input_FirstName'), 'Ashley')
				WebUI.setText(findTestObject(path_AddUser + 'input_LastName'), 'Luka')
				WebUI.setText(findTestObject(path_AddUser + 'input_Password'), 'hello6666')
				WebUI.setText(findTestObject(path_AddUser + 'input_ConfirmPassword'), 'hello6666')
				WebUI.check(findTestObject(path_AddUser + 'input_No_lock'))
				
				// Select the Create button
				WebUI.click(findTestObject(path_AddUser + 'button_Create'))
				
				// Verify Static Text
				if (WebUI.verifyTextPresent('User Account Created A user account for', true))
				{
					
					WebUI.verifyTextPresent('was successfully created', true)
				
					// Delete User
					WebUI.click(findTestObject(path_UserView + 'button_Delete'))
				
					// Select Okay on Confirmation
					WebUI.click(findTestObject(path_DeleteUser + 'button_Okay_First'))
					
								
					// Select another Okay
					WebUI.click(findTestObject(path_DeleteUser + 'button_Okay_Last'))
				}
				
				else 
				{
					KeywordLogger log = new KeywordLogger()
					log.logWarning("User did not got created, can't delete")
				}
				
				//WebUI.closeBrowser()
				
			}
			
	}			