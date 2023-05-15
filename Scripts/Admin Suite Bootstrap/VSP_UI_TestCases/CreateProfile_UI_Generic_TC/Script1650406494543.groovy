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


// Get the Execution Profile like QA or Demo
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, cardNameV, al1V, al2V, zipV, cardTypeV, last4V

String resText = "Fail"
//String datText = today
//String resColumn = "Result"
//String datCloumn = "Date"
//String fileLoc = "C:\\KatalonData\\Bootstrap\\VT-Data.xlsx"
//def numOfRows, dataFile, nameSheet


	
//	nameSheet = "VT-AuthCapCredit-Generic"
//	numOfRows = findTestData('QA/Bootstrap/VT-TestData/VT-AuthCapCreditData-AllCF-Generic').getRowNumbers()
//	println("Number of Records: " + numOfRows)
//	dataFile = "QA/Bootstrap/VT-TestData/VT-AuthCapCreditData-AllCF-Generic"


switch(executionProfile)
{
	case "QAProfile":
			 appName = "a_Access AutoNoCFtp"
			 appID = "742"
	break
	
	case "QA2Profile":
			appName = "a_Access AutoNoCFtp"
			appID = "742"
	break
	
	case "DemoProfile":
			appName = "a_Access AutoNoCFtpDemo"
			appID = "4249"
	break
	
}


// Log into Admin Suite
	CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()

// Select the Payment Application Name			
	WebUI.click(findTestObject(path_Dashboard + appName))
	
// Select Create button
	WebUI.click(findTestObject(path_VT + 'a_Create'))
	
// Verify Elements and Static Text
	
	WebUI.verifyTextPresent('Create Profile', true)
	WebUI.verifyTextPresent('Indicates required fields', true)
	WebUI.verifyTextPresent('Enter Customer Name', true)
	WebUI.verifyTextPresent('Enter Customer Address', true)
	WebUI.verifyTextPresent('Additional Contact Information', true)
	WebUI.verifyTextPresent('Notes/Comments', true)
	
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_profileName'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_profileName'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_CompanyName'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_CompanyName'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'select_Title'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'select_Title'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_FirstName'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_FirstName'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_MiddleName'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_MiddleName'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_LastName'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_LastName'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'select_Suffix'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'select_Suffix'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_address1'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_address1'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_AddressLine2'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_AddressLine2'), 30)

	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'select_Country'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'select_Country'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_PostalCode'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_PostalCode'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_PostalCodeExt'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_PostalCodeExt'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_City'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_City'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'select_State'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'select_State'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_EmaiAddress'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_EmaiAddress'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_HomePhoneNumber_HomeAreaCode'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_HomePhoneNumber_HomeAreaCode'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_homePrefixNumber'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_homePrefixNumber'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_homeSuffixNumber'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_homeSuffixNumber'), 30)
	
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_MobilePhoneNumber_mobileAreaCode'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_MobilePhoneNumber_mobileAreaCode'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_mobilePrefixNumber'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_mobilePrefixNumber'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_mobileSuffixNumber'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_mobileSuffixNumber'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_WorkPhoneNumber_workAreaCode'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_WorkPhoneNumber_workAreaCode'), 30)

	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_workPrefixNumber'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_workPrefixNumber'), 30)

	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_workSuffixNumber'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_workSuffixNumber'), 30)

	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'input_Ext_workExtension'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'input_Ext_workExtension'), 30)
	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'textarea_NotesComments_note'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'textarea_NotesComments_note'), 30)

	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'button_Cancel'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'button_Cancel'), 30)

	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'button_Save'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'button_Save'), 30)

	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'button_Save  Add ACH'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'button_Save  Add ACH'), 30)

	
	WebUI.verifyElementVisible(findTestObject(path_CreateProfile + 'button_Save  Add Credit Card'))
	WebUI.verifyElementPresent(findTestObject(path_CreateProfile + 'button_Save  Add Credit Card'), 30)


	WebUI.closeBrowser()
	
	


