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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory



// VT Paths
String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_Users = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/Users/"
String path_UserView = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/UserView/"
String path_DeleteUser = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/DeleteUser/"
String path_ModifyUser = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/ModifyUser/"


// Get the Execution Profile like QA or Demo
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, cardNameV, al1V, al2V, zipV, cardTypeV

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datColumn = "Date"
String fileLoc = "KatalonData/Bootstrap/UM-Data-Prod.xlsx"
def numOfRows, dataFile, nameSheet, dataFileEmulator, ExecuteTC



nameSheet = "ModifyUser"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/Bootstrap/UM-Data-Prod.xlsx", nameSheet, true)
numOfRows = dataFile.getRowNumbers()
println("Number of Records: " + numOfRows)


// For each row in the spreadsheet, execute the given steps
for (def row = 1; row <= numOfRows; row++)
	{
	
			if(executionProfile == 'Production'  || executionProfile == 'Upgrade') {				
				ExecuteTC = dataFile.getValue('ExecuteProd', row)
				resColumn = 'ResultProd'
				datColumn = 'DateProd'
				
				System.out.println('Value of Execute is : ' + ExecuteTC)
			}
			else if(executionProfile == 'DemoProfile') {
					ExecuteTC = dataFile.getValue('ExecuteDemo', row)
					resColumn = 'ResultDemo'
					datColumn = 'DateDemo'
					
					System.out.println('Value of Execute is : ' + ExecuteTC)
			}
		
		if (ExecuteTC.equalsIgnoreCase("Y"))
			{
				System.out.println('Begin Record Number: ' + row)
	
				Date today = new Date()
				println (today)
				String datText = today


				// Log into Admin Suite
					CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()
					
				// Select the User Management button
					WebUI.click(findTestObject(path_Dashboard + 'a_Access User Management'))
					
				// Select the Add User button
					WebUI.click(findTestObject(path_Users + 'a_Add User'))
					
				// Call setData for AddUser
					CustomKeywords.'adminSuiteBootstrap.addUser.setDataAddUserEF'(row,dataFile)
					
					if (WebUI.verifyTextPresent('User Account Created A user account for', true))
					{
						
						WebUI.verifyTextPresent('was successfully created', true)
					
						
						// Select Modify User button
						WebUI.click(findTestObject(path_ModifyUser + 'button_Modify_UserView'))
						
						// Populate ModifyUser page
						WebUI.setText(findTestObject(path_ModifyUser + 'input_First Name_firstName'), 'ModifiedFname')
						WebUI.setText(findTestObject(path_ModifyUser + 'input_Last Name_lastName'), 'ModifiedLname')
						WebUI.setText(findTestObject(path_ModifyUser + 'input_Email Address_emailAddress'), 'imtiazster@gmail.com')
						WebUI.setText(findTestObject(path_ModifyUser + 'input_Cell Phone Number_cellPhoneNumber'), '7038945000')
						
						// Select Modify button
						WebUI.click(findTestObject(path_ModifyUser + 'button_Update'))
						
						
						// Verify the Static text					
						if (WebUI.verifyTextPresent('User Account Modified The user account for', true))
							{
								
								WebUI.verifyTextPresent('was successfully modified', true)												
								WebUI.verifyTextPresent('ModifiedFname', true)
								WebUI.verifyTextPresent('ModifiedLname', true)
								WebUI.verifyTextPresent('imtiazster@gmail.com', true)
								//WebUI.verifyTextPresent('7038945000', true)
								
								KeywordUtil.markPassed("User was Modified Successfully")
								resText = "Pass"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datColumn,fileLoc,nameSheet,row)								
							}
						else
						{
							KeywordUtil.markPassed("User was NOT Modified")
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datColumn,fileLoc,nameSheet,row)
		
						}
						
						
						
						// Delete User
						WebUI.click(findTestObject(path_UserView + 'button_Delete'))
					
						// Select Okay on Confirmation
						//WebUI.click(findTestObject(path_DeleteUser + 'button_Okay_First'))
						WebUI.click(findTestObject(path_DeleteUser + 'button_DeleteUser_Delete'))
						
									
						// Select another Okay
						//WebUI.click(findTestObject(path_DeleteUser + 'button_Okay_Last'))
						WebUI.click(findTestObject(path_DeleteUser + 'button_DeleteUser_Okay'))
					}
					
					else 
					{
						//KeywordLogger log = new KeywordLogger()
						//log.logWarning("User did not got created, can't delete")
						CustomKeywords.'pages.CustomLogger.log_Logger'("User did not got created, can't delete","Warning")
						CustomKeywords.'pages.CustomLogger.log_Logger'("User did not got created, can't delete","Fail")
						KeywordUtil.markFailed("User did not got created, can't delete")
						resText = "Fail"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datColumn,fileLoc,nameSheet,row)
						
					}
					
					WebUI.closeBrowser()
			}
		
		
	}
