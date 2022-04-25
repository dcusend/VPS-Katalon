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
String path_ViewProfilePre = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/ViewProfilePre/"
String path_SearchProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/SearchProfile/"


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


	
	nameSheet = "AddDeleteCCNotPrepopulated"
	numOfRows = findTestData('QA/Bootstrap/VSP-Profile-TestData/AddCCNotPrepopulated').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "QA/Bootstrap/VSP-Profile-TestData/AddCCNotPrepopulated"


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
						
					// Select Create button
						WebUI.click(findTestObject(path_VT + 'a_Create'))
						
					// Call setDataCreateProfile method
						CustomKeywords.'vspBootstrap.CreateProfilePage.setDataCreateProfile'(row,dataFile)
						
					
						WebUI.verifyTextPresent(("Profile successfully created"), true)
						
						
						
						
					// Retreive Profile name
						def profileName = GlobalVariable.ProfileName
						println("profileName : " + profileName)
						
						
						
					// Select Return to Main Menu button
						WebUI.click(findTestObject(path_ViewProfile + 'a_Return to Main Menu'))
						
						
						
					// Search for a Profile
					// Select the Find Profile button
						WebUI.click(findTestObject(path_VT + 'a_Find Profile'))
						
						WebUI.setText(findTestObject(path_SearchProfile + 'input_Criteria'), profileName)
						//WebUI.selectOptionByLabel(findTestObject(path_SearchProfile + 'select_SearchBy'), searchBy, true)
						WebUI.click(findTestObject(path_SearchProfile + 'button_Search'))
				
					
					// Select the View button
						WebUI.click(findTestObject(path_ViewProfilePre + 'a_View'))
						
						
					
					// Select the Add Credit Card button on the View Profile Pre page
						WebUI.click(findTestObject(path_ViewProfilePre + 'button_Add Credit Card'))
							
						
					// Call the setDataCreditCardNotPre method to Add a Credit Card
						CustomKeywords.'vspBootstrap.AddCreditCardPage.setDataCreditCardNotPre'(row,dataFile)
						
			
					// Verify the Static text and Fields
						WebUI.verifyTextPresent(("Payment Method Created"), true)
						WebUI.verifyTextPresent(("Payment method creation successful"), true)
											
						WebUI.verifyElementVisible(findTestObject(path_ViewProfile + 'a_nickNameCC'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfile + 'a_nickNameCC'), 30)
						
					// Select the Credit Card Nickname button 
						WebUI.click(findTestObject(path_ViewProfile + 'a_nickNameCC'))
						
					// VErify the Static and Dynamic text
						WebUI.verifyTextPresent(("Credit Card Billing Information"), true)
						
						def nickName = findTestData(dataFile).getValue('NickNameCC', row)
						WebUI.verifyTextPresent((nickName), true)
						
					// Select the Delete Credit Card button
						WebUI.click(findTestObject(path_ViewProfile + 'a_Delete Credit Card'))
						
					// Verify the Static text
						WebUI.verifyTextPresent(("Delete Credit Card Confirmation"), true)
						WebUI.verifyTextPresent(("This will delete the credit card account. Are you sure you want to do this?"), true)
						
					// Select the Congirm Delete button
						WebUI.click(findTestObject(path_ViewProfile + 'button_DeleteCCConfirm'))
						

					// Verify the Static text
						WebUI.verifyTextPresent(("Payment Method Deletion"), true)
						WebUI.verifyTextPresent(("Payment method was successfully deleted."), true)
						
						
					// Select the Delete Profile button
						WebUI.click(findTestObject(path_ViewProfile + 'a_Delete Profile'))
						WebUI.verifyTextPresent(("This will delete all of the following information. Are you sure you want to do this?"), true)
						
					// Select the Delete button
						WebUI.click(findTestObject(path_DeleteProfileConfirm + 'button_Delete'))
						WebUI.verifyTextPresent(("There were no results from your search"), true)
						
						
					
						WebUI.closeBrowser()
						 
						 
				}
	
	
		}
