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

String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_VT = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/"





	CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
	
	WebUI.click(findTestObject(path_Dashboard + 'span_Payment'))
	
	WebUI.click(findTestObject(path_Dashboard + 'a_Access AutoACHOnly'))
	
		WebUI.verifyTextNotPresent('Credit Card', true)
		WebUI.verifyTextPresent('On-line Check', true)
	
		
		// Verify that ACH links are present on page
		
			WebUI.verifyElementVisible(findTestObject(path_VT + 'button_Debit'))
			WebUI.verifyElementPresent(findTestObject(path_VT + 'button_Debit'), 30)
			
			//WebUI.verifyElementVisible(findTestObject(path_VT + 'a_Personal'))
			WebUI.verifyElementPresent(findTestObject(path_VT + 'a_Personal'), 30)
			
			//WebUI.verifyElementVisible(findTestObject(path_VT + 'a_Corporate'))
			WebUI.verifyElementPresent(findTestObject(path_VT + 'a_Corporate'), 30)
			
			//WebUI.verifyElementVisible(findTestObject(path_VT + 'button_ACH_CreditOrVoid_Generic'))
			//WebUI.verifyElementPresent(findTestObject(path_VT + 'button_ACH_CreditOrVoid_Generic'), 30)
			
		
		// Verify that Credit Card links are not present on page
		
		//WebUI.verifyElementNotVisible(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
		WebUI.verifyElementNotPresent(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'), 30)
		
		//WebUI.verifyElementNotVisible(findTestObject(path_VT + 'button_Authorization Only'))
		WebUI.verifyElementNotPresent(findTestObject(path_VT + 'button_Authorization Only'), 30)
		
		
		
		
		//WebUI.verifyElementNotVisible(findTestObject(path_VT + 'button_CreditOrVoid_Generic'))
		WebUI.verifyElementNotPresent(findTestObject(path_VT + 'button_CreditOrVoid_Generic'), 30)
		
		//WebUI.verifyElementNotVisible(findTestObject(path_VT + 'button_Capture an Authorization'))
		WebUI.verifyElementNotPresent(findTestObject(path_VT + 'button_Capture an Authorization'), 30)
		
		//WebUI.verifyElementNotVisible(findTestObject(path_VT + 'button_Manual Authorization'))
		WebUI.verifyElementNotPresent(findTestObject(path_VT + 'button_Manual Authorization'), 30)
		
		
		
		
		//WebUI.click(findTestObject(path_VT + 'button_Authorization Only'))
		
			//WebUI.verifyElementNotVisible(findTestObject(path_VT + 'auth_Keyboard_Generic'))
			WebUI.verifyElementNotPresent(findTestObject(path_VT + 'auth_Keyboard_Generic'), 30)
			
			
			
			
		
		//WebUI.click(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
		
			//WebUI.verifyElementNotVisible(findTestObject(path_VT + 'sale_Keyboard_Generic'))
			WebUI.verifyElementNotPresent(findTestObject(path_VT + 'sale_Keyboard_Generic'), 30)
			
			
			
		