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

import pages.GenerateRandom
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory




String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_Users = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/Users/"
String path_UserView = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/UserView/"
String path_ModifyUser = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/ModifyUser/"


// Get the Execution Profile like QA or Demo
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, cardNameV, al1V, al2V, zipV, cardTypeV

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/Bootstrap/UM-Data-Prod.xlsx"
def numOfRows, dataFile, nameSheet, dataFileEmulator


nameSheet = "ModifyUserPwd"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/Bootstrap/UM-Data-Prod.xlsx", nameSheet, true)
numOfRows = dataFile.getRowNumbers()
println("Number of Records: " + numOfRows)


// For each row in the spreadsheet, execute the given steps
for (def row = 1; row <= numOfRows; row++)
	{
	
		ExecuteTC = dataFile.getValue('Execute', row)
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
					CustomKeywords.'adminSuiteBootstrap.findUser.findUser_DD_EF'(row,dataFile)
					
					if (WebUI.verifyElementPresent(findTestObject(path_UserView + 'button_Modify'),30))
						{
							
							WebUI.verifyTextPresent('ToBeModUser', true)
							
							
							
							// Select Modify User button
							WebUI.click(findTestObject(path_ModifyUser + 'button_Modify_UserView'))
							
							
							// Modify User's Password
							WebUI.check(findTestObject(path_ModifyUser + 'input_Yes_changePassword'))
							
							// Get New Password Specifications from Excel
							def PasswordSpChar = dataFile.getValue('PasswordSpChar', row)
							def PasswordLength = dataFile.getValue('PasswordLength', row)
							lenPassword = Integer.parseInt(PasswordLength)
							
							// Build Password as per Specification from Excel
							def buildPassword = CustomKeywords.'pages.GenerateRandom.getRandomAlphaNumCustomLength'(lenPassword)
							def FinalPassword = buildPassword + PasswordSpChar
							println "Final Password is : " + FinalPassword
							
							
							// Set New Password
							WebUI.setText(findTestObject(path_ModifyUser + 'input_New Password'),FinalPassword)
							WebUI.setText(findTestObject(path_ModifyUser + 'input_Confirm Password'),FinalPassword)
							
							// Select Modify button
							WebUI.click(findTestObject(path_ModifyUser + 'button_Update'))
							
							Thread.sleep(5000)
							
							
							if (WebUI.verifyTextPresent('User Account Modified The user account for', true))
								{
									
									WebUI.verifyTextPresent('was successfully modified', true)
									
									KeywordUtil.markPassed("User Password was Modified Successfully")
									resText = "Pass"
									CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
									
									
								}
							else
								{
								KeywordUtil.markPassed("User Password was NOT Modified")
								resText = "Fail"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
			
								}
							
							
						}
					else
						{
							//log.logFailed("User was not able to login")
							CustomKeywords.'pages.CustomLogger.log_Logger'("User was not found","Fail")
							KeywordUtil.markPassed("User was not found")
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
		
						}

						WebUI.closeBrowser()
			}
			
	}