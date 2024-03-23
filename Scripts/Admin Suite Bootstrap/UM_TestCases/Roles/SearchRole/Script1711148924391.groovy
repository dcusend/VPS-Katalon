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

String path_Role = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/Role/"
String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"



// Get the Execution Profile like QA or Demo
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)


String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/Bootstrap/UM-Data.xlsx"
def numOfRows, dataFile, nameSheet, dataFileEmulator


nameSheet = "SearchRole"
dataFile = "QA/Bootstrap/UM-TestData/SearchRole"
numOfRows = findTestData(dataFile).getRowNumbers()
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
					
					
				// Select the Role link
					WebUI.click(findTestObject(path_Role + 'a_Roles'))
					
				// Select the Find Role button
					WebUI.click(findTestObject(path_Role + 'a_FindRole'))
					
				// Set Data on Find Role page
					CustomKeywords.'adminSuiteBootstrap.findRole.setDataFindRole'(row,dataFile)
					
					if (WebUI.verifyElementPresent(findTestObject(path_Role + 'button_DeleteRole'), 30))
					{
						WebUI.verifyTextPresent('This role does not have any members', true)
						
						KeywordUtil.markPassed("Role was searched Successfully")
						resText = "Pass"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						CustomKeywords.'pages.CustomLogger.log_Logger'("Role got searched successfully","Pass")
						
					}
					else
					{
						CustomKeywords.'pages.CustomLogger.log_Logger'("Role was not found","Fail")
						KeywordUtil.markFailed("Role did not searched")
						resText = "Fail"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)

					}
						
					
					
			}






}