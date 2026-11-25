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

import com.kms.katalon.core.testdata.reader.ExcelFactory


//#################################################
//
//This Test Case does a Auth Keyboard Entry
//using VT-AuthData-SingleCF-Generic Data file
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
String fileLoc = "KatalonData/SplitSettlement/VTSplitSettlementData.xlsx"
def numOfRows, dataFile, nameSheet


String path = fileLoc
nameSheet = "SaleVoid"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)

numOfRows = dataFile.getRowNumbers()
println("Number of Records: " + numOfRows)
	
	
	
	
	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = dataFile.getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			
			switch(executionProfile)
			{
				case "QAProfile":
						 appName = dataFile.getValue('AppNameQA', row)
						 appID = dataFile.getValue('AppIDQA', row)
				break
				
				case "QA2Profile":
						appName = dataFile.getValue('AppNameQA', row)
						appID = dataFile.getValue('AppIDQA', row)
				break
				
				case "DemoProfile":
						appName = dataFile.getValue('AppNameDemo', row)
						appID = dataFile.getValue('AppIDDemo', row)
				break
				
				case "Production":
						appName = dataFile.getValue('AppNameProd', row)
						appID = dataFile.getValue('AppIDProd', row)
				break
				
				case "Upgrade":
						appName = dataFile.getValue('AppNameProd', row)
						appID = dataFile.getValue('AppIDProd', row)
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
					WebUI.delay(2)
					
						WebUI.click(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
						Thread.sleep(2000)
						
						def saleKeyboardEntryLink = WebUI.modifyObjectProperty(findTestObject(path_VT + 'a_KeyboardEntry_Sale'),'href','equals',hrefAppID,true)
						WebUI.click(saleKeyboardEntryLink)
						Thread.sleep(2000)
						
						
						
						CustomKeywords.'adminSuiteBootstrap.virtualTerminalSetData.genericKeyboard_DataDriven_EF_NoUDF'(row,dataFile)
						WebUI.delay(2)
						
						
						
						if (WebUI.verifyTextPresent(("Transaction Successful"), true))
							{
								// Successful Sale Transaction, now Void the Sale
								
								def sdf = WebUI.getText(findTestObject(path_Receipt + 'td_AutoNoC031622113752957Ahm'))
								
					
								System.out.println('sdf: ' + sdf)
					
								//def remID = sdf.substring(55, 81).trim()
								
								def remID = sdf
					
								System.out.println('remID: ' + remID)
					
					
								WebUI.click(findTestObject(path_Receipt + 'button_Continue'))
								Thread.sleep(2000)
					
								//WebUI.click(findTestObject(path_VT + 'button_CCCreditOrVoid'))
								WebUI.click(findTestObject(path_VT + 'a_Search Transactions'))
								Thread.sleep(2000)
					
								WebUI.setText(findTestObject(path_CCSearch + 'input_Search By_searchValue'),remID)
								WebUI.click(findTestObject(path_CCSearch + 'button_Submit'))
								Thread.sleep(2000)
					
						
										
								def fgr = WebUI.getText(findTestObject(path_SearchResults + 'div_Payment ID'))
								def payID = fgr.substring(89,98).trim()
								System.out.println('payID: '+payID)
						
								//def remIDLink = WebUI.modifyObjectProperty(findTestObject(path_SearchResults + 'button_PaymentID'),'text','equals',payID,true)
								//WebUI.click(remIDLink)
						
								WebUI.click(findTestObject(path_SearchResults + 'button_PaymentID'))
								Thread.sleep(2000)
						
														
								WebUI.click(findTestObject(path_TranxDetails + 'a_Void this transaction'))
								Thread.sleep(2000)
								
								
								
								WebUI.click(findTestObject(path_TranxDetails + 'button_Submit'))
								Thread.sleep(2000)
								
									if (WebUI.verifyTextPresent('Transaction Successful', true))
									{
										println "Transaction Successful text is present on the Receipt page for Void Transaction"
										System.out.println('Pass Record Number: ' + row)
										resText = "Pass"
										CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
									}
									else
									{
										println "Transaction Successful text is not present on the Receipt page for Void Transaction"
										System.out.println('Fail Record Number: ' + row)
										resText = "Fail"
										CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
									}
								
								
								
								
							}
							else
							{
								println "Transaction Successful text is not present on the Receipt page, Can't Void the Sale"
								System.out.println('Fail Record Number: ' + row)
								resText = "Fail"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
								//KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/Page_VLinkReceipt/pre_STX')))
							}
					
					WebUI.closeBrowser()
				}
		}


