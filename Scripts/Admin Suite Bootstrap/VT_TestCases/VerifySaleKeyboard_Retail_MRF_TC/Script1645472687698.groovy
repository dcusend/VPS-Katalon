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
String path_SaleKB = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SaleKeyboard/"
//String hrefAppID = "/admin/imtiaz/bootstrap/vpos/238/transactions/AuthCapForm/"
String appliID = "742"
String li_1 = "/admin/imtiaz/bootstrap/vpos/"
String li_2 = "/transactions/AuthCapForm/"
String hrefAppID = li_1 + appliID + li_2

System.out.println('hrefID is : ' + hrefAppID)



	CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
	
	WebUI.click(findTestObject(path_Dashboard + 'span_Payment'))
	Thread.sleep(2000)
	
		WebUI.click(findTestObject(path_Dashboard + 'a_Access AutoNoCFtp'))
		Thread.sleep(2000)
		
			WebUI.click(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
			Thread.sleep(2000)
			
				//WebUI.click(findTestObject(path_VT + 'a_KeyboardEntry_Sale'))
				
				def saleKeyboardEntryLink = WebUI.modifyObjectProperty(findTestObject(path_VT + 'a_KeyboardEntry_Sale'),'href','equals',hrefAppID,true)
				WebUI.click(saleKeyboardEntryLink)
				Thread.sleep(2000)
				
				WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_transactionCategory'), 'RETL', true)
				
				WebUI.click(findTestObject(path_SaleKB + 'button_Submit'))
				Thread.sleep(2000)
				
						WebUI.verifyTextPresent('Card Name is required', true)
						WebUI.verifyTextPresent('Card Number is required', true)
						WebUI.verifyTextPresent('Card Expiration Month is required', true)
						WebUI.verifyTextPresent('Card Expiration Year is required', true)
						WebUI.verifyTextNotPresent('Address is required', true)
						WebUI.verifyTextNotPresent('ZIP Code is required', true)
						WebUI.verifyTextPresent('Amount is required', true)
						WebUI.verifyTextPresent('This field is required', true)
						WebUI.verifyTextPresent('This field is required', true)
						
						