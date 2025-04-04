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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory

// VT Paths
String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_VT = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/"



// VSP Paths
String path_CreateProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/CreateProfile/"
String path_AddAccount = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/AddAccount/"
String path_Add_ACH = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/AddACH/"
String path_Add_CC = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/AddCreditCard/"
String path_App_Plan = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/AddPaymentPlan/"
String path_DeleteProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/DeleteProfile/"
String path_ModifyProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/ModifyProfile/"
String path_ViewProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/View Profile/"
String path_VSPAuth = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/VSP_Auth/"
String path_VSPAuthCap = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/VSP_Authcap/"
String path_Debit = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/VSP_Debit/"
String path_DeleteProfileConfirm = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/DeleteProfileConfirm/"


// Get the Execution Profile like QA or Demo
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, cardNameV, al1V, al2V, zipV, cardTypeV, last4V

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData\\Bootstrap\\VSP-Payments-Data-Prod.xlsx"
def numOfRows, dataFile, nameSheet


	
	
	nameSheet = "CC-Payments-Auth"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData\\Bootstrap\\VSP-Payments-Data-Prod.xlsx", nameSheet, true)
	dataFileEmulator = "IWPTestData/EmulatorData"
	
	numOfRows = dataFile.getRowNumbers()
	println("Number of Records: " + numOfRows)


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = dataFile.getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			appName = dataFile.getValue('AppNameProd', row)
			appID   = dataFile.getValue('AppIDProd', row)
		
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today


					// Log into Admin Suite
						CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()
					
					// Select the Payment Application Name
						WebUI.click(findTestObject(path_Dashboard + appName))
						
					// Select the Find Profile button
						WebUI.click(findTestObject(path_VT + 'a_Find Profile'))

					// SetData to Find Profile
						String criteria, searchBy
						
					// GetData
						criteria = dataFile.getValue('ProfileName', row)
						
						
					// SetData
						String path_SearchProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/SearchProfile/"
						WebUI.setText(findTestObject(path_SearchProfile + 'input_Criteria'), criteria)
												
						WebUI.click(findTestObject(path_SearchProfile + 'button_Search'))
						
					// Select the Profile Name
						profNameLink = dataFile.getValue('ProfileNameLink', row)
						WebUI.click(findTestObject(path_ViewProfile + profNameLink))
						
					// Select the Authcap link
						WebUI.click(findTestObject(path_ViewProfile + 'a_Auth'))
						
					// Verify Static text
						WebUI.verifyTextPresent(("Credit Card Authorization"), true)
						WebUI.verifyTextPresent(("Required fields are highlighted with an asterisk"), true)
						WebUI.verifyTextPresent(("Remittance ID"), true)
						
					// Set Data on Sale page
						CustomKeywords.'vspBootstrap.SalePage.setDataSaleAndAuth_EF'(row,dataFile)
						
					// Verify Static text
						WebUI.verifyTextPresent('Transaction Successful', true)
						
						WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/Receipt/button_Continue'))
						WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/Receipt/button_Continue'), 20)
						
						WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/Receipt/button_Print'))
						WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/Receipt/button_Print'), 20)
						
						
						WebUI.verifyTextPresent('Remittance ID', true)
						WebUI.verifyTextPresent('Received', true)
						
						WebUI.verifyTextPresent('UDF1', true)
						WebUI.verifyTextPresent('UDF2', true)
						WebUI.verifyTextPresent('UDF3', true)
						WebUI.verifyTextPresent('UDF4', true)
						WebUI.verifyTextPresent('UDF5', true)
						WebUI.verifyTextPresent('UDF6', true)
						WebUI.verifyTextPresent('UDF7', true)
						WebUI.verifyTextPresent('UDF8', true)
						WebUI.verifyTextPresent('UDF9', true)
						WebUI.verifyTextPresent('UDF 10', true)
						
						WebUI.verifyTextPresent('Delhi', true)
						WebUI.verifyTextPresent('Chennai', true)
						WebUI.verifyTextPresent('Mumbai', true)
						WebUI.verifyTextPresent('Kanpur', true)
						WebUI.verifyTextPresent('Orange Recorded', true)
						WebUI.verifyTextPresent('Yellow Recorded', true)
						WebUI.verifyTextPresent('Kolkata', true)
						WebUI.verifyTextPresent('Pune', true)
						WebUI.verifyTextPresent('Bhavnagar', true)
						WebUI.verifyTextPresent('Noida', true)
						
						
						WebUI.verifyTextPresent('Amount', true)
						WebUI.verifyTextPresent('2.50', true)
						WebUI.verifyTextPresent('Authorization', true)
						WebUI.verifyTextPresent('Card Information', true)
						WebUI.verifyTextPresent('TANDON RAVENA', true)
						
						WebUI.verifyTextPresent('Address Line 1', true)
						WebUI.verifyTextPresent('Address Line 2', true)
						WebUI.verifyTextPresent('Country', true)
						WebUI.verifyTextPresent('City', true)
						WebUI.verifyTextPresent('State', true)
						WebUI.verifyTextPresent('ZIP Code', true)
						
						WebUI.verifyTextPresent('248 PhoolKaante road', true)
						WebUI.verifyTextPresent('Suite 678', true)
						WebUI.verifyTextPresent('United States', true)
						WebUI.verifyTextPresent('ARLINGTON', true)
						WebUI.verifyTextPresent('VA', true)
						WebUI.verifyTextPresent('22201', true)
						

						cardTypeV = dataFile.getValue('CardType', row)
						last4V = dataFile.getValue('Last4', row)
						WebUI.verifyTextPresent(cardTypeV, true)
						WebUI.verifyTextPresent(last4V, true)

						
						switch(appName)
							{
								case "a_Access AutoSingleCFtpProd":
									// For Single CF
										WebUI.verifyTextPresent('5.00', true)
										WebUI.verifyTextPresent('Single Transaction', true)
										WebUI.verifyTextPresent('7.50', true)
										WebUI.verifyTextPresent('Total Amount', true)
										WebUI.verifyTextPresent('Transaction Type', true)
								break
				
								case "a_Access AutoDualCFtpProd":
									// For Dual CF
										WebUI.verifyTextPresent('5.00', true)
										WebUI.verifyTextPresent('Dual Transaction', true)
										WebUI.verifyTextPresent('7.50', true)
										WebUI.verifyTextPresent('Total Amount', true)
										WebUI.verifyTextPresent('Transaction Type', true)
								break

								
							} 
						
							if (WebUI.verifyTextPresent("Transaction Successful", false))
								{
									println "Transaction Successful text is present on the Receipt page"
									KeywordUtil.markPassed("Transaction Successful text is present on the Receipt page")
									resText = "Pass"
									CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
		
								}
							else
								{
									println "Transaction Successful text is not present on the Receipt page"
	//										KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode')))
									resText = "Fail"
									CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
								}
						
				}			
						
				WebUI.closeBrowser()
	}