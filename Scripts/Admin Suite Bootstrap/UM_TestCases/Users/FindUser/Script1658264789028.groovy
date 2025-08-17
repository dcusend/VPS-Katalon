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


String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_Users = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/Users/"
String path_UserView = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/UserView/"

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


nameSheet = "FindUser"
dataFile = "QA/Bootstrap/UM-TestData/FindUser"
numOfRows = findTestData('QA/Bootstrap/UM-TestData/FindUser').getRowNumbers()
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
					
				// Select the Find User button
					WebUI.click(findTestObject(path_Users + 'a_Find User'))
					
				// Call setData for FindUser
					CustomKeywords.'adminSuiteBootstrap.findUser.findUser_DD'(row,dataFile)
					Thread.sleep(5000)
					
					if (WebUI.verifyElementPresent(findTestObject(path_UserView + 'button_Modify'),30))
						{
							
							WebUI.verifyTextPresent('Email Address', true)
							WebUI.verifyTextPresent('iahmed@govolution.com', true)
							WebUI.verifyTextPresent('Username', true)
							WebUI.verifyTextPresent('chragui', true)
							WebUI.verifyTextPresent('Account Status', true)
							WebUI.verifyTextPresent('Active', true)
							WebUI.verifyTextPresent('Christinado Aguillerezo', true)
							
							CustomKeywords.'pages.CustomLogger.log_Logger'("User was found","Pass")
							KeywordUtil.markPassed("User was found")
							resText = "Pass"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
		
							
						}
					else
						{
							//log.logFailed("User was not able to login")
							CustomKeywords.'pages.CustomLogger.log_Logger'("User was not found","Fail")
							KeywordUtil.markFailed("User was not found")
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
							
						}

						WebUI.closeBrowser()
			}
			
	}