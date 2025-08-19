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
	Thread.sleep(2000)
	
		WebUI.click(findTestObject(path_Dashboard + 'a_New Test VRelay'))
		Thread.sleep(2000)
		
			WebUI.verifyTextPresent('Credit Card', true)
			WebUI.verifyTextPresent('On-line Check', true)
		
		
			WebUI.verifyElementVisible(findTestObject(path_VT + 'a_Issue Transactions'))
			WebUI.verifyElementPresent(findTestObject(path_VT + 'a_Issue Transactions'), 30)
			
			
			WebUI.verifyElementVisible(findTestObject(path_VT + 'a_Search Transactions'))
			WebUI.verifyElementPresent(findTestObject(path_VT + 'a_Search Transactions'), 30)
			
			WebUI.verifyElementVisible(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
			WebUI.verifyElementPresent(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'), 30)
			
			WebUI.verifyElementVisible(findTestObject(path_VT + 'button_Authorization Only'))
			WebUI.verifyElementPresent(findTestObject(path_VT + 'button_Authorization Only'), 30)
			
			
			
			
			WebUI.verifyElementVisible(findTestObject(path_VT + 'button_CCCreditOrVoid-App411'))
			WebUI.verifyElementPresent(findTestObject(path_VT + 'button_CCCreditOrVoid-App411'), 30)
			
			WebUI.verifyElementVisible(findTestObject(path_VT + 'button_Capture an Authorization'))
			WebUI.verifyElementPresent(findTestObject(path_VT + 'button_Capture an Authorization'), 30)
			
			WebUI.verifyElementVisible(findTestObject(path_VT + 'button_Manual Authorization'))
			WebUI.verifyElementPresent(findTestObject(path_VT + 'button_Manual Authorization'), 30)
			
			WebUI.verifyElementVisible(findTestObject(path_VT + 'button_Debit'))
			WebUI.verifyElementPresent(findTestObject(path_VT + 'button_Debit'), 30)
			
			
			WebUI.click(findTestObject(path_VT + 'button_Authorization Only'))
			Thread.sleep(2000)
			
				WebUI.verifyElementVisible(findTestObject(path_VT + 'a_KeyboardEntry_Auth'))
				WebUI.verifyElementPresent(findTestObject(path_VT + 'a_KeyboardEntry_Auth'), 30)
				
				WebUI.verifyElementVisible(findTestObject(path_VT + 'a_PINPadEntry_Auth'))
				WebUI.verifyElementPresent(findTestObject(path_VT + 'a_PINPadEntry_Auth'), 30)
				
				
				WebUI.verifyElementVisible(findTestObject(path_VT + 'a_Swipe_Auth'))
				WebUI.verifyElementPresent(findTestObject(path_VT + 'a_Swipe_Auth'), 30)
				
				
				WebUI.verifyElementVisible(findTestObject(path_VT + 'a_IngenicoKeypadEntry_Auth'))
				WebUI.verifyElementPresent(findTestObject(path_VT + 'a_IngenicoKeypadEntry_Auth'), 30)
				
				
			
			WebUI.click(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
			Thread.sleep(2000)
			
				WebUI.verifyElementVisible(findTestObject(path_VT + 'a_KeyboardEntry_Sale'))
				WebUI.verifyElementPresent(findTestObject(path_VT + 'a_KeyboardEntry_Sale'), 30)
				
				WebUI.verifyElementVisible(findTestObject(path_VT + 'a_PINPadEntry_Sale'))
				WebUI.verifyElementPresent(findTestObject(path_VT + 'a_PINPadEntry_Sale'), 30)
				
				
				WebUI.verifyElementVisible(findTestObject(path_VT + 'a_Swipe_Sale'))
				WebUI.verifyElementPresent(findTestObject(path_VT + 'a_Swipe_Sale'), 30)
				
				
				WebUI.verifyElementVisible(findTestObject(path_VT + 'a_IngenicoKeypadEntry_Sale'))
				WebUI.verifyElementPresent(findTestObject(path_VT + 'a_IngenicoKeypadEntry_Sale'), 30)
			
			
			
			
				
			