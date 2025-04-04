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


// Get the Execution Profile like QA or Demo
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, cardNameV, al1V, al2V, zipV, cardTypeV, last4V

String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData\\Bootstrap\\VSP-Data-Prod.xlsx"
def numOfRows, dataFile, nameSheet


	
	
	nameSheet = "CreateModifyDeleteProfile"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData\\Bootstrap\\VSP-Data-Prod.xlsx", nameSheet, true)
	dataFileEmulator = "IWPTestData/EmulatorData"
	
	numOfRows = dataFile.getRowNumbers()
	println("Number of Records: " + numOfRows)


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		 
			ExecuteTC = dataFile.getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			appName = dataFile.getValue('AppNameProd', row)
			appID   = dataFile.getValue('AppIDProd', row)
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today


					// Log into Admin Suite
						CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()
					
					// Select the Payment Application Name
						WebUI.click(findTestObject(path_Dashboard + appName))
						
					// Select Create button
						WebUI.click(findTestObject(path_VT + 'a_Create'))
						
					// Call setDataCreateProfile method
						CustomKeywords.'vspBootstrap.CreateProfilePage.setDataCreateProfile_EF'(row,dataFile)
						
						WebUI.verifyTextPresent(("Profile successfully created"), true)
						
						
					// Select Modify Profile button to Modify Profile
						WebUI.click(findTestObject(path_ViewProfile + 'a_Modify Profile'))
						
						
					// Call setDataModifyProfile to Modify Profile
						CustomKeywords.'vspBootstrap.ModifyProfilePage.setDataModifyProfile_EF'(row,dataFile)
						
						
					// Verify Static Text and Fields
						WebUI.verifyTextPresent(("Profile Modification"), true)
						WebUI.verifyTextPresent(("Profile successfully modified."), true)
						WebUI.verifyTextPresent(("CompaneNameModified"), true)
						WebUI.verifyTextPresent(("Mrs. Bhaichung FG Bhutia Jr."), true)
						WebUI.verifyTextPresent(("47 Sasha ct"), true)
						WebUI.verifyTextPresent(("ARLINGTON ,  VA    22201  - 2587"), true)
						WebUI.verifyTextPresent(("Email: iahmed2@govolution.com"), true)
						WebUI.verifyTextPresent(("258-3697"), true)
						WebUI.verifyTextPresent(("Notes/Comments: This Profile has been modified"), true)
						
						
					// Select the Delete Profile button
						WebUI.click(findTestObject(path_ViewProfile + 'a_Delete Profile'))
						WebUI.verifyTextPresent(("This will delete all of the following information. Are you sure you want to do this?"), true)
						
					// Select the Delete button
						WebUI.click(findTestObject(path_DeleteProfileConfirm + 'button_Delete'))
						WebUI.verifyTextPresent(("No Search String"), true)
						WebUI.verifyTextPresent(("You must provide a search string of at least 2 characters"), true)
						
						if (WebUI.verifyTextPresent("No Search String", false))
							{
								println "No Search String text is present on the Receipt page"
								KeywordUtil.markPassed("Transaction Successful text is present on the Receipt page")
								resText = "Pass"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
	
							}
						else
							{
								println "No Search String text is not present on the Receipt page"
//										KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode')))
								resText = "Fail"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
							}
					
	
				}
	
				WebUI.closeBrowser()
		}
