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




//#################################################
//
//This Test Case does a Sale and Void Keyboard Entry
//using VT-SaleVoidData-NoCF-Generic Data file
//and will execute for QA, Demo, Upgrade and Production
//bootstrap Virtual Terminal
//Environment needs to be selected for executing
//in each environment.
//#################################################



String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_VT = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/"
String path_SaleKB = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SaleKeyboard/"
String path_TestMinus = "Object Repository/Page_TestMinusAndAtSigns/"
String path_Receipt = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/Receipt/"
String path_CCSearch = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/CCCreditOrVoidSearch/"
String path_SearchResults = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SearchResults/"
String path_TranxDetails = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/TransactionDetails/"


String li_1 = GlobalVariable.vpos_Prefix
String li_2 = "/transactions/AuthCapForm/"
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, cardNameV, al1V, al2V, zipV, cardTypeV, last4V

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "C:\\KatalonData\\Bootstrap\\VT-Misc-Data.xlsx"
def numOfRows, dataFile, nameSheet


	
	nameSheet = "VT-SaleVoid-NoCF-Generic"
	numOfRows = findTestData('QA/Bootstrap/VT-TestData/VT-SaleVoidSearchCAN').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "QA/Bootstrap/VT-TestData/VT-SaleVoidSearchCAN"
	
	
	
	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
	
// Not sure if the Switch statement will work			
					
			switch(executionProfile)
			{
				case "QAProfile":
						 appName = findTestData(dataFile).getValue('AppName', row)
						 appID = findTestData(dataFile).getValue('AppID', row)
				break
				
				case "QA2Profile":
						appName = findTestData(dataFile).getValue('AppName', row)
						appID = findTestData(dataFile).getValue('AppID', row)
				break
				

			}

			
			//appID = findTestData(dataFile).getValue('AppID', row)
			//appName = findTestData(dataFile).getValue('AppName', row)
			
			String hrefAppID = li_1 + appID + li_2
			String hrefApp = li_1 + appID + "/"
			println("hrefApp : " + hrefApp)
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
					
										
					WebUI.click(findTestObject(path_Dashboard + appName))
					
						WebUI.click(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
						
						def saleKeyboardEntryLink = WebUI.modifyObjectProperty(findTestObject(path_VT + 'a_KeyboardEntry_Sale'),'href','equals',hrefAppID,true)
						WebUI.click(saleKeyboardEntryLink)
						
						WebUI.setText(findTestObject(path_SaleKB + 'input_CC_clientAccountNumber'), 'CAN666ab')
												
						CustomKeywords.'adminSuiteBootstrap.virtualTerminalSetData.saleKeyboard_DataDriven'(row,dataFile)
						
						if (WebUI.verifyTextPresent('Transaction Successful', true))
							{
													
					
								WebUI.click(findTestObject(path_Receipt + 'button_Continue'))
					
								//WebUI.click(findTestObject(path_VT + 'button_CCCreditOrVoid'))
								WebUI.click(findTestObject(path_VT + 'a_Search Transactions'))
					
								WebUI.selectOptionByLabel(findTestObject(path_CCSearch + 'select_SearchBy'),'Client Account Number' , false)
								WebUI.setText(findTestObject(path_CCSearch + 'input_Search By_searchValue'),'CAN666ab')
								WebUI.click(findTestObject(path_CCSearch + 'button_Submit'))
							
										
					
								WebUI.click(findTestObject(path_SearchResults + 'button_PaymentID'))
						
								WebUI.verifyTextPresent('Tender Type', true)
								WebUI.verifyTextPresent('Credit Card', true)
								WebUI.verifyTextPresent('Transaction Type', true)
								WebUI.verifyTextPresent('Authorization and Capture', true)
								WebUI.verifyTextPresent('Transaction Posted by', true)
								WebUI.verifyTextPresent('iahmed', true)
						
								WebUI.click(findTestObject(path_TranxDetails + 'a_Void this transaction'))
								
								WebUI.verifyTextPresent('The following transaction will be voided', true)
								WebUI.verifyTextPresent('Please press submit to continue', true)
								
								WebUI.click(findTestObject(path_TranxDetails + 'button_Submit'))
								
								WebUI.verifyTextPresent('Transaction Successful', true)
								WebUI.verifyTextPresent('Transaction Type', true)
								WebUI.verifyTextPresent('Void', true)
								
								WebUI.closeBrowser()
						
							}	
				}
		}


