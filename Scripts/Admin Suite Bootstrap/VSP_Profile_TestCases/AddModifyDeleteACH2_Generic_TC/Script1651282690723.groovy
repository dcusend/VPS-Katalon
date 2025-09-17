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

// VT Paths
String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_VT = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/"



// VSP Paths
String path_CreateProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/CreateProfile/"
String path_AddAccount = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/AddAccount/"
String path_Add_ACH = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/AddACH/"
String path_Add_CC = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/AddCreditCard/"
String path_App_Plan = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/AddPaymentPlan/"
String path_DeleteProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/DeleteProfile/"
String path_ModifyProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/ModifyProfile/"
String path_ViewProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/View Profile/"
String path_VSPAuth = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/VSP_Auth/"
String path_VSPAuthCap = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/VSP_Authcap/"
String path_Debit = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/VSP_Debit/"
String path_DeleteProfileConfirm = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/DeleteProfileConfirm/"
String path_ModifyACH = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/ModifyACH/"


// Get the Execution Profile like QA or Demo
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, cardNameV, al1V, al2V, zipV, cardTypeV, last4V

//String resText = "Fail"
//String datText = today
//String resColumn = "Result"
//String datCloumn = "Date"
//String fileLoc = "C:\\KatalonData\\Bootstrap\\VT-Data.xlsx"
//def numOfRows, dataFile, nameSheet


	
	nameSheet = "AddModifyDeleteACH"
	numOfRows = findTestData('QA/Bootstrap/VSP-Profile-TestData/AddModifyDeleteACH').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "QA/Bootstrap/VSP-Profile-TestData/AddModifyDeleteACH"


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			
			switch(executionProfile)
			{
				case "QAProfile":
						 appName = findTestData(dataFile).getValue('AppNameQA', row)
						 appID = findTestData(dataFile).getValue('AppIDQA', row)
				break
				
				case "QA2Profile":
						appName = findTestData(dataFile).getValue('AppNameQA', row)
						appID = findTestData(dataFile).getValue('AppIDQA', row)
				break
				
				case "DemoProfile":
						appName = findTestData(dataFile).getValue('AppNameDemo', row)
						appID = findTestData(dataFile).getValue('AppIDDemo', row)
				break
				
			}

			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today


					// Log into Admin Suite
						CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
					
					// Select the Payment Application Name
						WebUI.click(findTestObject(path_Dashboard + appName))
						Thread.sleep(2000)
						
					// Select Create button
						WebUI.click(findTestObject(path_VT + 'a_Create'))
						Thread.sleep(2000)
						
					// Call setDataCreateProfile method
						CustomKeywords.'vspBootstrap.CreateProfilePage.setDataCreateProfile'(row,dataFile)
						Thread.sleep(2000)
												
						WebUI.verifyTextPresent(("Profile successfully created"), true)
						
					
					// Select Add ACH button
						WebUI.click(findTestObject(path_ViewProfile + 'button_Add ACH'))
						Thread.sleep(2000)
						
						
					// Call the setDataAddACH method to Add an ACH
						CustomKeywords.'vspBootstrap.AddACHPage.setDataAddACH'(row,dataFile)
						Thread.sleep(2000)
						
			
					// Verify the Static text and Fields
							WebUI.verifyTextPresent(("Payment Method Created"), true)
							WebUI.verifyTextPresent(("Payment method creation successful"), true)
											
						
						
					// Select the Edit button
						WebUI.click(findTestObject(path_ViewProfile + 'a_Edit_ACH'))
						Thread.sleep(2000)
						
					// Change Nickname to Modify ACH
						def nicknameMod = findTestData(dataFile).getValue('NicknameACHMod', row)
						WebUI.setText(findTestObject(path_ModifyACH + 'input_nickName'), nicknameMod)
						WebUI.click(findTestObject(path_ModifyACH + 'button_Modify'))
						Thread.sleep(2000)
						
					// Verify Static text
						WebUI.verifyTextPresent(("Payment Method Modification"), true)
						WebUI.verifyTextPresent(("Payment method successfully modified"), true)
						WebUI.verifyTextPresent((nicknameMod), true)
						
						
						
					// Select the Delete ACH button
						WebUI.click(findTestObject(path_ViewProfile + 'a_DeleteACH2'))
						Thread.sleep(2000)
						
					// Verify the Static text
						WebUI.verifyTextPresent(("Delete Bank Account Confirmation"), true)
						WebUI.verifyTextPresent(("This will delete the bank account. Are you sure you want to do this?"), true)
						
					// Select the Congirm Delete button
						WebUI.click(findTestObject(path_ViewProfile + 'button_DeleteACHConfirm'))
						Thread.sleep(2000)
						

					// Verify the Static text
						WebUI.verifyTextPresent(("Payment Method Deletion"), true)
						WebUI.verifyTextPresent(("Payment method was successfully deleted."), true)

						
						
						
					// Select the Delete Profile button
						WebUI.click(findTestObject(path_ViewProfile + 'a_Delete Profile'))
						Thread.sleep(2000)
						WebUI.verifyTextPresent(("This will delete all of the following information. Are you sure you want to do this?"), true)
						
					// Select the Delete button
						WebUI.click(findTestObject(path_DeleteProfileConfirm + 'button_Delete'))
						Thread.sleep(2000)
						WebUI.verifyTextPresent(("No Search String"), true)
						WebUI.verifyTextPresent(("You must provide a search string of at least 2 characters"), true)
						
					
						WebUI.closeBrowser()
						 
						 
				}
	
	
		}
