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

//################################################################


String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_VT = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/"
String path_SaleKB = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SaleKeyboard/"
String path_Receipt = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/Receipt/"
String path_CCSearch = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/CCCreditOrVoidSearch/"
String path_SearchResults = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SearchResults/"
String path_TranxDetails = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/TransactionDetails/"

//String hrefAppID = "/admin/imtiaz/bootstrap/vpos/238/transactions/AuthCapForm/"
//String appliID = "742"
String li_1 = "/admin/imtiaz/bootstrap/vpos/"
String li_2 = "/transactions/AuthCapForm/"

String appName, appID, cardNameV, al1V, al2V, zipV, cardTypeV, last4V

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "C:\\KatalonData\\Bootstrap\\VT-Data.xlsx"
String nameSheet = "VT-SaleVoid-NoCF"

	def numOfRows = findTestData('QA/Bootstrap/VT-TestData/VT-SaleVoidData-NoCF').getRowNumbers()

	println("Number of Records: " + numOfRows)

	def dataFile = "QA/Bootstrap/VT-TestData/VT-SaleVoidData-NoCF"
	
	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			appName = findTestData(dataFile).getValue('AppName', row)
			appID = findTestData(dataFile).getValue('AppID', row)
			
			String hrefAppID = li_1 + appID + li_2
			
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
					
					WebUI.click(findTestObject(path_Dashboard + 'span_Payment'))
					
						WebUI.click(findTestObject(path_Dashboard + appName))
					
							WebUI.click(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
						
														
								def saleKeyboardEntryLink = WebUI.modifyObjectProperty(findTestObject(path_VT + 'a_KeyboardEntry_Sale'),'href','equals',hrefAppID,true)
								WebUI.click(saleKeyboardEntryLink)
					
								CustomKeywords.'adminSuiteBootstrap.virtualTerminalSetData.saleKeyboard_DataDriven'(row,dataFile)
								
						if (WebUI.verifyTextPresent('Transaction Successful', true))
							{
								def sdf = WebUI.getText(findTestObject(path_Receipt + 'div_Issue Transactions'))
					
								//System.out.println('sdf: ' + sdf)
					
								def remID = sdf.substring(55, 81).trim()
					
								System.out.println('remID: ' + remID)
					
					
								WebUI.click(findTestObject(path_Receipt + 'button_Continue'))
					
								//WebUI.click(findTestObject(path_VT + 'button_CCCreditOrVoid'))
								WebUI.click(findTestObject(path_VT + 'a_Search Transactions'))
					
								WebUI.setText(findTestObject(path_CCSearch + 'input_Search By_searchValue'),remID)
								WebUI.click(findTestObject(path_CCSearch + 'button_Submit'))
					
						
										
								def fgr = WebUI.getText(findTestObject(path_SearchResults + 'div_Payment ID'))
								def payID = fgr.substring(89,97).trim()
								System.out.println('payID: '+payID)
						
								def remIDLink = WebUI.modifyObjectProperty(findTestObject(path_SearchResults + 'button_PaymentID'),'text','equals',payID,true)
								WebUI.click(remIDLink)
						
						
						
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
						
							}
					
				}
				
				
				
	}								