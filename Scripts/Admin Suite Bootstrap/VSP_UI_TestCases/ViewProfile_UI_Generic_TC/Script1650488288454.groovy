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


	
	nameSheet = "VerifyViewProfile"
	numOfRows = findTestData('QA/Bootstrap/VSP-Profile-TestData/VerifyViewProfile').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "QA/Bootstrap/VSP-Profile-TestData/VerifyViewProfile"


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
						
						
					// Select the Find Profile button
						WebUI.click(findTestObject(path_VT + 'a_Find Profile'))
						
					// Call setDataSearchProfile method
						CustomKeywords.'vspBootstrap.SearchProfilePage.setDataSearchProfile'(row,dataFile)

					// Verify Static text and Fields on View Profile Pre page
						WebUI.verifyTextPresent(("VerifyViewProfile"), true)
						WebUI.verifyTextPresent(("Administrative Profile"), true)
						WebUI.verifyTextPresent(("Company Name:  VVP Company"), true)
						WebUI.verifyTextPresent(("Title & First Name & Middle Name & Last Name & Suffix:  Mr. Joravar Maush Chaudhary Sr."), true)
						WebUI.verifyTextPresent(("Address Line 1:  596 VVP Avenue"), true)
						WebUI.verifyTextPresent(("Address Line 2:  Suite 6598"), true)
						WebUI.verifyTextPresent(("City & State & Zip Code: ARLINGTON ,  VA    22201 -1234"), true)
						WebUI.verifyTextPresent(("Country:  United States"), true)
						
						WebUI.verifyTextPresent(("VVP Visa"), true)
						WebUI.verifyTextPresent(("VVP Corporate"), true)
						WebUI.verifyTextPresent(("VVP Personal Savings"), true)
						WebUI.verifyTextPresent(("VVP Personal Checking"), true)
						WebUI.verifyTextPresent(("VVP Client Account"), true)
						WebUI.verifyTextPresent(("This is a View Profile Account"), true)
						
						WebUI.verifyElementVisible(findTestObject(path_ViewProfilePre + 'a_VerifyViewProfile'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfilePre + 'a_VerifyViewProfile'), 30)
						
						WebUI.verifyElementVisible(findTestObject(path_ViewProfilePre + 'a_View'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfilePre + 'a_View'), 30)
						
						WebUI.verifyElementVisible(findTestObject(path_ViewProfilePre + 'a_Edit'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfilePre + 'a_Edit'), 30)
						
						WebUI.verifyElementVisible(findTestObject(path_ViewProfilePre + 'a_Delete'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfilePre + 'a_Delete'), 30)
						
						WebUI.verifyElementVisible(findTestObject(path_ViewProfilePre + 'li_First'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfilePre + 'li_First'), 30)
						
						WebUI.verifyElementVisible(findTestObject(path_ViewProfilePre + 'li_Previous'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfilePre + 'li_Previous'), 30)
						
						WebUI.verifyElementVisible(findTestObject(path_ViewProfilePre + 'a_1'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfilePre + 'a_1'), 30)
						
						WebUI.verifyElementVisible(findTestObject(path_ViewProfilePre + 'li_Next'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfilePre + 'li_Next'), 30)
						
						WebUI.verifyElementVisible(findTestObject(path_ViewProfilePre + 'li_Last'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfilePre + 'li_Last'), 30)
						
						WebUI.verifyElementVisible(findTestObject(path_ViewProfilePre + 'a_AuthCap'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfilePre + 'a_AuthCap'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfilePre + 'a_Auth'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfilePre + 'a_Auth'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfilePre + 'a_DebitChecking'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfilePre + 'a_DebitChecking'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfilePre + 'a_DebitCorporate'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfilePre + 'a_DebitCorporate'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfilePre + 'a_DebitSavings'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfilePre + 'a_DebitSavings'), 30)

					// Select View Profile link
						WebUI.click(findTestObject(path_ViewProfilePre + 'a_VerifyViewProfile'))
						
					// Verify Static text and Fields on View Profile page
						WebUI.verifyTextPresent(("VVP Company"), true)
						WebUI.verifyTextPresent(("Mr. Joravar Maush Chaudhary Sr."), true)
						WebUI.verifyTextPresent(("596 VVP Avenue"), true)
						WebUI.verifyTextPresent(("Suite 6598"), true)
						WebUI.verifyTextPresent(("ARLINGTON ,  VA    22201  - 1234"), true)
						WebUI.verifyTextPresent(("United States"), true)
						WebUI.verifyTextPresent(("Email: iahmed55@govolution.com"), true)
						WebUI.verifyTextPresent(("628-0701"), true)
						WebUI.verifyTextPresent(("897-3589"), true)
						WebUI.verifyTextPresent(("894-7770 Ext:123"), true)
						WebUI.verifyTextPresent(("Notes/Comments: This is a Profile to Verify View Profile."), true)
						WebUI.verifyTextPresent(("Credit Cards"), true)
						WebUI.verifyTextPresent(("On-line Checks"), true)
						WebUI.verifyTextPresent(("Accounts"), true)
						WebUI.verifyTextPresent(("Payment Plans"), true)
						
						
						WebUI.verifyElementVisible(findTestObject(path_ViewProfile + 'a_Modify Profile'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfile + 'a_Modify Profile'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfile + 'a_Delete Profile'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfile + 'a_Delete Profile'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfile + 'a_Return to Main Menu'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfile + 'a_Return to Main Menu'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfile + 'a_AuthCap'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfile + 'a_AuthCap'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfile + 'a_Auth'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfile + 'a_Auth'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfile + 'button_Add Credit Card'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfile + 'button_Add Credit Card'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfile + 'button_Add ACH'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfile + 'button_Add ACH'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfile + 'button_Add Account'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfile + 'button_Add Account'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfile + 'button_Add Payment Plan'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfile + 'button_Add Payment Plan'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfile + 'a_VVP Visa'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfile + 'a_VVP Visa'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfile + 'a_VVP Corporate'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfile + 'a_VVP Corporate'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfile + 'a_VVP Personal Checking'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfile + 'a_VVP Personal Checking'), 30)

						WebUI.verifyElementVisible(findTestObject(path_ViewProfile + 'a_VVP Personal Savings'))
						WebUI.verifyElementPresent(findTestObject(path_ViewProfile + 'a_VVP Personal Savings'), 30)

						WebUI.closeBrowser()
						
				}
				
				
		}