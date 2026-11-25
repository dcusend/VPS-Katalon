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
nameSheet = "Sale"
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
								println "Transaction Successful text is present on the Receipt page"
								System.out.println('Pass Record Number: ' + row)
								resText = "Pass"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
							}
							else
							{
								println "Transaction Successful text is not present on the Receipt page"
								System.out.println('Fail Record Number: ' + row)
								resText = "Fail"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
								//KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/Page_VLinkReceipt/pre_STX')))
							}
					
					WebUI.closeBrowser()
				}
		}


