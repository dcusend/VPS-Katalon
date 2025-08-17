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




				// Log into Admin Suite
					CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
					
				// Select the User Management button
					WebUI.click(findTestObject(path_Dashboard + 'a_Access User Management'))
					
				// Select the Add User button
					WebUI.click(findTestObject(path_Users + 'a_Add User'))
					
	
					
					
				// SetData
					WebUI.setText(findTestObject(path_AddUser + 'input_Username'), "username2589")
					WebUI.setText(findTestObject(path_AddUser + 'input_FirstName'), "fname")
					WebUI.setText(findTestObject(path_AddUser + 'input_LastName'), "lname")
					WebUI.setText(findTestObject(path_AddUser + 'input_EmailAddress'), "iahmed@govolution.com")
					WebUI.setText(findTestObject(path_AddUser + 'input_Password'), "hello1111")
					WebUI.setText(findTestObject(path_AddUser + 'input_ConfirmPassword'), "hello1111")
					
					
				// Select No for Lock Account
					WebUI.check(findTestObject(path_AddUser + 'input_No_lock'))
						
					
				// Select the Create button
					WebUI.click(findTestObject(path_AddUser + 'button_Create'))
					Thread.sleep(5000)
				
					
				// Verify the Error Messages
					
					WebUI.verifyTextPresent("Error! Please provide the following required information as indicated below", true)
					WebUI.verifyTextPresent("Passwords must be at least 13 character(s) in length", false)
					WebUI.verifyTextPresent("Passwords must be no longer than 32 character(s) in length", false)
					WebUI.verifyTextPresent("Passwords must contain at least one lower case character", true)
					WebUI.verifyTextPresent("Passwords must contain at least one upper case character", true)
					WebUI.verifyTextPresent("Passwords must contain at least one numeric character", true)
					WebUI.verifyTextPresent("Passwords must contain at least one non-alphanumeric character", true)
					WebUI.verifyTextPresent("Passwords must not contain part of username", true)
					WebUI.verifyTextPresent("Passwords must not contain first name", true)
					WebUI.verifyTextPresent("Passwords must not be based on a word found in the dictionary", true)
					WebUI.verifyTextPresent("A password history will be maintained", true)
					WebUI.verifyTextPresent("You may not change your password to any one of the previous 4 password(s) used for your account", false)
					
					
					
					
					
				
					//WebUI.closeBrowser()
			
			
	
