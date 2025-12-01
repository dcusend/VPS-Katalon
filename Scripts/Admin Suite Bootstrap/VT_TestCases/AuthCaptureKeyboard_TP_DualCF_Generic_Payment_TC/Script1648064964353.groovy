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
//This Test Case does a Auth and Capture Keyboard Entry
//using VT-AuthCaptureData-DualCF-Generic Data file
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
String li_2 = "/transactions/AuthOnlyForm/"
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, cardNameV, al1V, al2V, zipV, cardTypeV, last4V

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "C:\\KatalonData\\Bootstrap\\VT-Data.xlsx"
def numOfRows, dataFile, nameSheet


	
	nameSheet = "VT-AuthCapture-DualCF-Generic"
	numOfRows = findTestData('QA/Bootstrap/VT-TestData/VT-AuthCaptureData-DualCF-Generic').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "QA/Bootstrap/VT-TestData/VT-AuthCaptureData-DualCF-Generic"
	
	
	
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
					Thread.sleep(2000)
					
						//WebUI.click(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
						
						WebUI.click(findTestObject(path_VT + 'button_Authorization Only'))
						Thread.sleep(2000)
						
																
						//def authOnlyKeyboardEntryLink = WebUI.modifyObjectProperty(findTestObject(path_VT + 'a_KeyboardEntry_Sale'),'href','equals',hrefAppID,true)
						def authOnlyKeyboardEntryLink = WebUI.modifyObjectProperty(findTestObject(path_VT + 'a_KeyboardEntry_Auth'),'href','equals',hrefAppID,true)
						WebUI.click(authOnlyKeyboardEntryLink)
						Thread.sleep(2000)
						
						
						
						CustomKeywords.'adminSuiteBootstrap.virtualTerminalSetData.saleKeyboard_DataDriven'(row,dataFile)
						Thread.sleep(2000)
						
						if (WebUI.verifyTextPresent('Transaction Successful', true))
						{
							
							def sdf = WebUI.getText(findTestObject(path_Receipt + 'td_AutoNoC031622113752957Ahm'))
							
				
							System.out.println('sdf: ' + sdf)
				
							//def remID = sdf.substring(55, 81).trim()
							
							def remID = sdf
				
							System.out.println('remID: ' + remID)
				
				
							WebUI.click(findTestObject(path_Receipt + 'button_Continue'))
							Thread.sleep(2000)
				
							
							WebUI.click(findTestObject(path_VT + 'a_Search Transactions'))
							Thread.sleep(2000)
				
							WebUI.setText(findTestObject(path_CCSearch + 'input_Search By_searchValue'),remID)
							WebUI.click(findTestObject(path_CCSearch + 'option_Authorization'))
							Thread.sleep(2000)
							WebUI.click(findTestObject(path_CCSearch + 'button_Submit'))
							Thread.sleep(2000)
				
					
									
							def fgr = WebUI.getText(findTestObject(path_SearchResults + 'div_Payment ID'))
							def payID = fgr.substring(89,98).trim()
							System.out.println('payID: '+payID)
					
												
							WebUI.click(findTestObject(path_SearchResults + 'button_PaymentID'))
							Thread.sleep(2000)
					
							WebUI.verifyTextPresent('Tender Type', true)
							WebUI.verifyTextPresent('Credit Card', true)
							WebUI.verifyTextPresent('Transaction Type', true)
							WebUI.verifyTextPresent('Authorization', true)
							WebUI.verifyTextPresent('Transaction Posted by', true)
							WebUI.verifyTextPresent('iahmed', true)
					
							WebUI.click(findTestObject(path_TranxDetails + 'a_Capture this transaction'))
							Thread.sleep(2000)
					
							WebUI.verifyTextPresent('Credit Card Capture', true)
							
							def captureAmount = findTestData(dataFile).getValue('CaptureAmount', row)
							WebUI.setText(findTestObject(path_SaleKB + 'input_amountCapture'), captureAmount)
							
							def amountWithCF = findTestData(dataFile).getValue('AmountwithCF', row)
							
							
							
							WebUI.click(findTestObject(path_TranxDetails + 'button_Submit'))
							//Thread.sleep(2000)
							WebUI.delay(5)
							
							WebUI.verifyTextPresent('Transaction Successful', true)
							WebUI.verifyTextPresent('Transaction Type', true)
							WebUI.verifyTextPresent('Capture', true)
							
							WebUI.verifyTextPresent('Amount', true)
							WebUI.verifyTextPresent('Service Fee', true)
							WebUI.verifyTextPresent('Service Fee Type', true)
							WebUI.verifyTextPresent('Total Amount', true)
							
							
							WebUI.verifyTextPresent(captureAmount, true)
							WebUI.verifyTextPresent('5.00', true)
							WebUI.verifyTextPresent('Dual Transaction', true)
							WebUI.verifyTextPresent(amountWithCF, true)
							
							
							
							WebUI.closeBrowser()
						}
						
					
				}
		}


