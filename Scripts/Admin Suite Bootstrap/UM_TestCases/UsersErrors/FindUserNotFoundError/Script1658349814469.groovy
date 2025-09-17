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

String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_Users = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/Users/"
String path_UserView = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/UserView/"
String path_FindUser = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/FindUser/"

// Get the Execution Profile like QA or Demo
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, cardNameV, al1V, al2V, zipV, cardTypeV




				// Log into Admin Suite
					CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
					
				// Select the User Management button
					WebUI.click(findTestObject(path_Dashboard + 'a_Access User Management'))
					
				// Select the Find User button
					WebUI.click(findTestObject(path_Users + 'a_Find User'))
					
				// SetData
					WebUI.setText(findTestObject(path_FindUser + 'input_Username'), "dfer564wdf")
					WebUI.setText(findTestObject(path_FindUser + 'input_FirstName'), "")
					WebUI.setText(findTestObject(path_FindUser + 'input_LastName'), "")
					//WebUI.selectOptionByLabel(findTestObject(path_FindUser + 'select_SearchType'),searchTypeFU , false)
			
				// Select the Submit button
					WebUI.click(findTestObject(path_FindUser + 'button_Search'))
					Thread.sleep(10000)
					
				// Verify the Error Message
					WebUI.verifyTextPresent("INFO! No user accounts were found that have a username of", true)


					WebUI.closeBrowser()
			
			
	