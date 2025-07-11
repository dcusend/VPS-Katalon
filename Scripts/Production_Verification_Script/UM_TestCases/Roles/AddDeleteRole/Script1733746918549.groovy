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

String path_Role = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/Role/"
String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"



// Get the Execution Profile like QA or Demo
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)


String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/Bootstrap/UM-Data-Prod.xlsx"
def numOfRows, dataFile, nameSheet, dataFileEmulator, ExecuteTC


nameSheet = "AddDeleteRole"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/Bootstrap/UM-Data-Prod.xlsx", nameSheet, true)

numOfRows = dataFile.getRowNumbers()
println("Number of Records: " + numOfRows)



// For each row in the spreadsheet, execute the given steps
for (def row = 1; row <= numOfRows; row++)
	{
	
			if(executionProfile == 'Production' || executionProfile == 'Upgrade') {				
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
					
					
				// Select the Role link
					WebUI.click(findTestObject(path_Role + 'a_Roles'))
					
					
				// Select the Add Role button
					WebUI.click(findTestObject(path_Role + 'a_AddRole'))
					
				// Set Data on Add Role page
					CustomKeywords.'adminSuiteBootstrap.addRole.setDataAddRoleEF'(row,dataFile)
					
					
					if (WebUI.verifyTextPresent('Role Created', true))
					{
						KeywordUtil.markPassed("Role was Created Successfully")
						resText = "Pass"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						CustomKeywords.'pages.CustomLogger.log_Logger'("Role got created successfully","Pass")
						
						// Select the Delete button
						WebUI.click(findTestObject(path_Role + 'button_DeleteRole'))
						
						// Select Delete on Delete Role popup
						WebUI.click(findTestObject(path_Role + 'button_DeletePopup'))
						
						// Select okay on the popup
						//WebUI.delay(5)
					    //WebUI.verifyTextPresent('was successfully deleted', true)
						WebUI.click(findTestObject(path_Role + 'button_OkayPopup'))
						
						// Search if the Role got deleted
						WebUI.click(findTestObject(path_Role + 'a_FindRole'))
						
						// Set Data on Find Role page
						CustomKeywords.'adminSuiteBootstrap.findRole.setDataFindRoleEF'(row,dataFile)
						
						// Verify Role was not found
						WebUI.verifyTextPresent('No roles with the name', true)
											
					}
					else
					{
						CustomKeywords.'pages.CustomLogger.log_Logger'("Role did not got created, can't delete","Fail")
						KeywordUtil.markFailed("Role did not got created, can't delete")
						resText = "Fail"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)

					}
					
					
					WebUI.closeBrowser()
			}
			
			
			
	}