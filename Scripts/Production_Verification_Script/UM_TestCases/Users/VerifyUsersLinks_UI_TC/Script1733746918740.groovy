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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory


String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_VT = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/"
String path_UM = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/"
String path_Users = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/Users/"
String path_UserView = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/UserView/"

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/Bootstrap/UM-Data-Prod.xlsx"
def numOfRows, dataFile, nameSheet, dataFileEmulator, ExecuteTC


// Get the Execution Profile like QA or Demo
def executionProfile = RC.getExecutionProfile()
nameSheet = "FindCaseUser"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/Bootstrap/UM-Data-Prod.xlsx", nameSheet, true)
numOfRows = dataFile.getRowNumbers()
println("Number of Records: " + numOfRows)


	CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()
	
	WebUI.click(findTestObject(path_Dashboard + 'span_User Management'))
	
		WebUI.click(findTestObject(path_Dashboard + 'a_Users'))
		
			WebUI.verifyTextPresent('Users', true)
			WebUI.verifyTextPresent('Total Users', true)
			WebUI.verifyTextPresent('User Name', true)
			WebUI.verifyTextPresent('User ID', true)
		
		
			WebUI.verifyElementVisible(findTestObject(path_UM + 'button_Export_New'))
			WebUI.verifyElementPresent(findTestObject(path_UM + 'button_Export_New'), 30)
			
			WebUI.verifyElementVisible(findTestObject(path_UM + 'a_Find User'))
			WebUI.verifyElementPresent(findTestObject(path_UM + 'a_Find User'), 30)
			
			WebUI.verifyElementVisible(findTestObject(path_UM + 'a_Add User'))
			WebUI.verifyElementPresent(findTestObject(path_UM + 'a_Add User'), 30)
			
//			WebUI.verifyElementVisible(findTestObject(path_UM + 'a_CASEuser'))
//			WebUI.verifyElementPresent(findTestObject(path_UM + 'a_CASEuser'), 30)		
			
			WebUI.verifyElementVisible(findTestObject(path_UM + 'li_First'))
			WebUI.verifyElementPresent(findTestObject(path_UM + 'li_First'), 30)
			
			WebUI.verifyElementVisible(findTestObject(path_UM + 'li_Prev'))
			WebUI.verifyElementPresent(findTestObject(path_UM + 'li_Prev'), 30)
			
			WebUI.verifyElementVisible(findTestObject(path_UM + 'a_1'))
			WebUI.verifyElementPresent(findTestObject(path_UM + 'a_1'), 30)
			
//			WebUI.verifyElementVisible(findTestObject(path_UM + 'a_2'))
//			WebUI.verifyElementPresent(findTestObject(path_UM + 'a_2'), 30)
			
			WebUI.verifyElementVisible(findTestObject(path_UM + 'a_Next'))
			WebUI.verifyElementPresent(findTestObject(path_UM + 'a_Next'), 30)
			
			WebUI.verifyElementVisible(findTestObject(path_UM + 'a_Last'))
			WebUI.verifyElementPresent(findTestObject(path_UM + 'a_Last'), 30)
			
			// Select the Find User button
			WebUI.click(findTestObject(path_Users + 'a_Find User'))
			
			// For each row in the spreadsheet, execute the given steps
			for (def row = 1; row <= numOfRows; row++)
			{
				
				Date today = new Date()
				println (today)
				String datText = today
			// Call setData for FindUser
			CustomKeywords.'adminSuiteBootstrap.findUser.findUser_DD_EF_Profile'(row,dataFile, executionProfile)
			
			if (WebUI.verifyElementPresent(findTestObject(path_UserView + 'button_Modify'),30))
				{
			
					if(executionProfile == 'Production' || executionProfile == 'Upgrade') {
						WebUI.verifyTextPresent('CASEuser', true)
					}
					else if(executionProfile == 'DemoProfile' ) {
						WebUI.verifyTextPresent('CASEuserDemo', true)
					}
									
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