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

// VT Paths
String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"

// Get the Execution Profile like QA or Demo
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, username_from, password_from


nameSheet = "UsernameCase"
dataFile = "QA/Bootstrap/UM-TestData/UsernameCase"
numOfRows = findTestData('QA/Bootstrap/UM-TestData/UsernameCase').getRowNumbers()
println("Number of Records: " + numOfRows)


// For each row in the spreadsheet, execute the given steps
for (def row = 1; row <= numOfRows; row++)
	{
	
		ExecuteTC = findTestData(dataFile).getValue('Execute', row)
		System.out.println('Value of Execute is : ' + ExecuteTC)
		
		if (ExecuteTC.equalsIgnoreCase("Y"))
			{
				System.out.println('Begin Record Number: ' + row)
				
				//KeywordLogger log = new KeywordLogger()
				
				// Get Username and Password from datafile
				username_from = findTestData(dataFile).getValue('Username', row)
				password_from = findTestData(dataFile).getValue('Password', row)
				
				// Log into Admin Suite
				CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_DD'(username_from,password_from)
				
				// Verify if User Management Link appears on the page
				if (WebUI.verifyElementPresent(findTestObject(path_Dashboard + 'a_Access User Management'),30))
				{
					//log.logPassed("User was able to login, Username is not case sensitive")
					CustomKeywords.'pages.CustomLogger.log_Logger'("User was able to login, Username is not case sensitive","Pass")
					
				}
				else 
				{
					//log.logFailed("User was not able to login")
					CustomKeywords.'pages.CustomLogger.log_Logger'("User was not able to login","Fail")
				}
				
				WebUI.closeBrowser()
			}
			
	}