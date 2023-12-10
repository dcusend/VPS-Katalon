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
//String hrefAppID = "/admin/imtiaz/bootstrap/vpos/411/transactions/AuthOnlyForm/"
String appliID = "238"
String li_1 = "/admin/imtiaz/bootstrap/vpos/"
String li_2 = "/transactions/AuthOnlyForm/"
String hrefAppID = li_1 + appliID + li_2

System.out.println('hrefID is : ' + hrefAppID)



	CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
	
	WebUI.click(findTestObject(path_Dashboard + 'span_Payment'))
	
		WebUI.click(findTestObject(path_Dashboard + 'a_HelloWorld3'))
		
			WebUI.click(findTestObject(path_VT + 'button_Authorization Only'))
			
				//WebUI.click(findTestObject(path_VT + 'a_KeyboardEntry_Sale'))
				
				def authOnlyKeyboardEntryLink = WebUI.modifyObjectProperty(findTestObject(path_VT + 'a_KeyboardEntry_Sale'),'href','equals',hrefAppID,true)
				WebUI.click(authOnlyKeyboardEntryLink)
				
					WebUI.verifyTextPresent('Issue Transactions', true)
					WebUI.verifyTextPresent('Credit Card Authorization', true)
					WebUI.verifyTextPresent('Required fields are highlighted with an asterisk', true)
					WebUI.verifyTextPresent('Remittance ID', true)
					WebUI.verifyTextPresent('Bill/Invoice Information', true)
					WebUI.verifyTextPresent('Application: Hello World3', true)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_cardName'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_cardName'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'select_transactionCategory'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'select_transactionCategory'), 30)
					
					//WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input__cardNumber'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input__cardNumber'), 30)
					
					//WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input__cvv'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input__cvv'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'select_MM'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'select_MM'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'select_YYYY'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'select_YYYY'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input__address'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input__address'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input__address2'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input__address2'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'select_Country'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'select_Country'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input__zip'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input__zip'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input__city'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input__city'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'select_State'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'select_State'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_emailAddress'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_emailAddress'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_smsNumber'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_smsNumber'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_amount'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_amount'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_convenienceFee'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_convenienceFee'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_convenienceFeeType'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_convenienceFeeType'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_totalAmount'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_totalAmount'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_userDefined1'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_userDefined1'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_userDefined2'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_userDefined2'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_userDefined3'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_userDefined3'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_userDefined4'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_userDefined4'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'select_UDF5_DropDown'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'select_UDF5_DropDown'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'select_UDF6_DropDown'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'select_UDF6_DropDown'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_userDefined7'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_userDefined7'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_userDefined8'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_userDefined8'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_userDefined9'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_userDefined9'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'input_userDefined10'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'input_userDefined10'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'button_Submit'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'button_Submit'), 30)
					
					WebUI.verifyElementVisible(findTestObject(path_SaleKB + 'button_Reset_Auth'))
					WebUI.verifyElementPresent(findTestObject(path_SaleKB + 'button_Reset_Auth'), 30)