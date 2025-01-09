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


/*
 * String li_1 = GlobalVariable.vpos_Prefix String li_2 =
 * "/transactions/ACHCreditOrVoidSearch/" def executionProfile =
 * RC.getExecutionProfile() String appID
 */


String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_VT = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/"


/*
 * switch(executionProfile) { case "QAProfile": appName = "AutoCCOnly" appID =
 * "818" break
 * 
 * case "QA2Profile": appName = "AutoCCOnly" appID = "818" break
 * 
 * case "DemoProfile": appName = "AutoCCOnly" appID = "4735" break
 * 
 * case "Production": appName = "" appID = "" break
 * 
 * case "Upgrade": appName = "" appID = "" break }
 */


	CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
	
	WebUI.click(findTestObject(path_Dashboard + 'span_Payment'))
	
	WebUI.click(findTestObject(path_Dashboard + 'a_Access AutoCCOnly'))
	
		WebUI.verifyTextPresent('Credit Card', true)
		//WebUI.verifyTextPresent('No transactions are enabled for this V-POS deployment', true)
	
	
		//WebUI.verifyElementVisible(findTestObject(path_VT + 'a_Issue Transactions'))
		//WebUI.verifyElementPresent(findTestObject(path_VT + 'a_Issue Transactions'), 30)
		
		
		//WebUI.verifyElementVisible(findTestObject(path_VT + 'a_Search Transactions'))
		//WebUI.verifyElementPresent(findTestObject(path_VT + 'a_Search Transactions'), 30)
		
		
		WebUI.verifyElementVisible(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
		WebUI.verifyElementPresent(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'), 30)
		
		WebUI.verifyElementVisible(findTestObject(path_VT + 'button_Authorization Only'))
		WebUI.verifyElementPresent(findTestObject(path_VT + 'button_Authorization Only'), 30)
		
		
		
		
		WebUI.verifyElementVisible(findTestObject(path_VT + 'button_CreditOrVoid_Generic'))
		WebUI.verifyElementPresent(findTestObject(path_VT + 'button_CreditOrVoid_Generic'), 30)
		
		WebUI.verifyElementVisible(findTestObject(path_VT + 'button_Capture an Authorization'))
		WebUI.verifyElementPresent(findTestObject(path_VT + 'button_Capture an Authorization'), 30)
		
		WebUI.verifyElementVisible(findTestObject(path_VT + 'button_Manual Authorization'))
		WebUI.verifyElementPresent(findTestObject(path_VT + 'button_Manual Authorization'), 30)
		
		//WebUI.verifyElementVisible(findTestObject(path_VT + 'button_Debit'))
		//WebUI.verifyElementPresent(findTestObject(path_VT + 'button_Debit'), 30)
		
		
		WebUI.click(findTestObject(path_VT + 'button_Authorization Only'))
		
			WebUI.verifyElementVisible(findTestObject(path_VT + 'auth_Keyboard_Generic'))
			WebUI.verifyElementPresent(findTestObject(path_VT + 'auth_Keyboard_Generic'), 30)
			
			
			
			
		
		WebUI.click(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
		
			WebUI.verifyElementVisible(findTestObject(path_VT + 'sale_Keyboard_Generic'))
			WebUI.verifyElementPresent(findTestObject(path_VT + 'sale_Keyboard_Generic'), 30)
			
			
			// Verify that ACH links don't display
			
				WebUI.verifyElementNotVisible(findTestObject(path_VT + 'button_Debit'))
				WebUI.verifyElementNotPresent(findTestObject(path_VT + 'button_Debit'), 30)
				
				//WebUI.verifyElementNotVisible(findTestObject(path_VT + 'a_Personal'))
				WebUI.verifyElementNotPresent(findTestObject(path_VT + 'a_Personal'), 30)
				
				//WebUI.verifyElementNotVisible(findTestObject(path_VT + 'a_Corporate'))
				WebUI.verifyElementNotPresent(findTestObject(path_VT + 'a_Corporate'), 30)
				
				
				/*
				 * String hrefAppID = li_1 + appID + li_2 String hrefApp = li_1 + appID + "/"
				 * println("hrefApp : " + hrefApp)
				 * 
				 * def ach_CreditOrVoidLink = WebUI.modifyObjectProperty(findTestObject(path_VT
				 * + 'button_ACH_CreditOrVoid_Generic'),'href','equals',hrefAppID,true)
				 * //WebUI.click(saleKeyboardEntryLink)
				 * 
				 * WebUI.verifyElementNotVisible(findTestObject(ach_CreditOrVoidLink))
				 * WebUI.verifyElementNotPresent(findTestObject(ach_CreditOrVoidLink), 30)
				 */
		
	