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

String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_VT = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/"
String path_SaleKB = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SaleKeyboard/"
String path_TestMinus = "Object Repository/Page_TestMinusAndAtSigns/"
String path_Receipt = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/Receipt/"
String path_CCSearch = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/CCCreditOrVoidSearch/"
String path_SearchResults = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SearchResults/"
String path_TranxDetails = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/TransactionDetails/"


//String li_1 = GlobalVariable.vpos_Prefix
//String li_2 = "/transactions/AuthOnlyForm/"
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, cardNameV, al1V, al2V, zipV, cardTypeV, last4V

//String resText = "Fail"
//String datText = today
//String resColumn = "Result"
//String datCloumn = "Date"
//String fileLoc = "C:\\KatalonData\\Bootstrap\\VT-Data.xlsx"
def numOfRows, dataFile, nameSheet


	
//	nameSheet = "VT-AuthCapCredit-Generic"
	numOfRows = findTestData('QA/Bootstrap/VT-SearchTransactions-TestData/VT-SearchTransactions').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "QA/Bootstrap/VT-SearchTransactions-TestData/VT-SearchTransactions"


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
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
				
				case "Production":
						appName = findTestData(dataFile).getValue('AppNameProd', row)
						appID = findTestData(dataFile).getValue('AppIDProd', row)
				break
				
				case "Upgrade":
						appName = findTestData(dataFile).getValue('AppNameProd', row)
						appID = findTestData(dataFile).getValue('AppIDProd', row)
				break
			}
	
		CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
		
		WebUI.click(findTestObject(path_Dashboard + appName))
		
		WebUI.click(findTestObject(path_VT + 'a_Search Transactions'))
		
		
			// Verif static text on the page
				WebUI.verifyTextPresent('Transaction Search', true)
				WebUI.verifyTextPresent('Select the search date range, not to exceed 30 days', true)
				WebUI.verifyTextPresent('Time Zone : Eastern Standard Time', true)
				WebUI.verifyTextPresent('Credit Card Transactions', true)
				WebUI.verifyTextPresent('On-Line Check Transactions', true)
				WebUI.verifyTextPresent('Pinless Debit Transactions', true)
				WebUI.verifyTextPresent('Show Only Successful Transactions', true)
				WebUI.verifyTextPresent('Show Only Failure Transactions', true)
		
		
			// Verify the contents of Search By drop down
				WebUI.verifyOptionsPresent(findTestObject(path_CCSearch + 'select_SearchBy'), ['Remittance ID', 'Payment ID','CC last 4 digit','ACH last 4 digit'])
				WebUI.verifyOptionsPresent(findTestObject(path_CCSearch + 'select_SearchBy'), ['Email Address', 'Amount','Payer Name','Client Account Number'])
				WebUI.verifyOptionsPresent(findTestObject(path_CCSearch + 'select_SearchBy'), ['UDF Label: UDF1', 'UDF Label: UDF2','UDF Label: UDF3','UDF Label: UDF4','UDF Label: UDF5'])
				WebUI.verifyOptionsPresent(findTestObject(path_CCSearch + 'select_SearchBy'), ['UDF Label: UDF6', 'UDF Label: UDF7','UDF Label: UDF8','UDF Label: UDF9','UDF Label: UDF 10'])
		
				
			// Verify if the Search Value Text Box is present on the page
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'input_Search By_searchValue'),10)
				
			// Verify if Advanced Search checkbox and text is present
				WebUI.verifyTextPresent('Advanced Search', true)
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'input_Search Value_wildcard'),10)
		
				
			// Verify if Start and End Calendars are present
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'input_StartCalendar'),10)
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'input_EndCalendar'),10)
				
						
				
			// Verify if Credit Card Options are present
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'option_TransType'),10)
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'option_Credit_CC'),10)
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'option_Capture (Sale)'),10)
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'option_Void_CC'),10)
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'option_Authorization'),10)
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'option_Manual Authorization'),10)
				
				
				
			// Verify if Online Checks Options are present
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'option_Debit'),10)
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'option_Credit_ACH'),10)
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'option_Void_ACH'),10)
				
				
			// Verify if Pinless Debit Options are present
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'option_Pinless Debit'),10)
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'option_Pinless Credit'),10)
				
				
			// Verify if checkboxes for Show Only are present					
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'input_ShowOnlySuccessfulTransactions'),10)
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'input_ShowOnlyFailureTransactions'),10)
		
				
			// Verify if Submit button is present
				WebUI.verifyElementPresent(findTestObject(path_CCSearch + 'button_Submit'),10)
				
				
		}