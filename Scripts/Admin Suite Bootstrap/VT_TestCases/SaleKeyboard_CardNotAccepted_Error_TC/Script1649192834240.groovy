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

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement


//#################################################
//
//This Test Case does a Sale Keyboard Entry
//using VT-SaleData-NoCF-Generic Data file
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
String appName, appID, cardNameV, al1V, al2V, zipV, cardTypeV, last4V, phoneNumber, amount

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "C:\\KatalonData\\Bootstrap\\VT-Misc-Data.xlsx"
def numOfrow, dataFile, nameSheet


	
	nameSheet = "Sale-CardNotAccepted"
	numOfrow = findTestData('QA/Bootstrap/VT-TestData/VT-SaleCardNotAccepted').getRowNumbers()
	println("Number of Records: " + numOfrow)
	dataFile = "QA/Bootstrap/VT-TestData/VT-SaleCardNotAccepted"
	
	
	
	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfrow; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
// Not sure if Switch statement will work
			
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
			
			
			//appName = findTestData(dataFile).getValue('AppName', row)
			//appID = findTestData(dataFile).getValue('AppID', row)
			
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
					
						WebUI.click(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
						Thread.sleep(2000)
						
						def saleKeyboardEntryLink = WebUI.modifyObjectProperty(findTestObject(path_VT + 'a_KeyboardEntry_Sale'),'href','equals',hrefAppID,true)
						WebUI.click(saleKeyboardEntryLink)
						Thread.sleep(2000)
						
						//CustomKeywords.'adminSuiteBootstrap.virtualTerminalSetData.saleKeyboard_DataDriven'(row,dataFile)
						
						
						// GetData
						cardName = findTestData(dataFile).getValue('CardName', row)
						transCat = findTestData(dataFile).getValue('TranxCategory', row)
						cardNumber = findTestData(dataFile).getValue('CardNumber', row)
						CSC = findTestData(dataFile).getValue('CSC', row)
						expM = findTestData(dataFile).getValue('ExpMM', row)
						expY = findTestData(dataFile).getValue('ExpYYYY', row)
						al1 = findTestData(dataFile).getValue('AL1', row)
						al2 = findTestData(dataFile).getValue('AL2', row)
						zipCode = findTestData(dataFile).getValue('ZIP', row)
						emailAddress = findTestData(dataFile).getValue('Email', row)
						phoneNumber = findTestData(dataFile).getValue('Phone', row)
						amount = findTestData(dataFile).getValue('Amount', row)
				
						
						
						
						
						
						// SetData
						WebUI.setText(findTestObject(path_SaleKB + 'input_cardName'), cardName)
						WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_transactionCategory'), transCat, true)
						WebElement element = WebUiCommonHelper.findWebElement(findTestObject(path_SaleKB + 'input__cardNumber2'),30)
						WebUI.executeJavaScript("arguments[0].value ='"+ cardNumber+"' "  , Arrays.asList(element))
						WebElement element2 = WebUiCommonHelper.findWebElement(findTestObject(path_SaleKB + 'input__cvv'),30)
						WebUI.executeJavaScript("arguments[0].value ='"+ CSC+"' ", Arrays.asList(element2))
						WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_MM'), expM, true)
						WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_YYYY'), expY, true)
						WebUI.setText(findTestObject(path_SaleKB + 'input__address'), al1)
						WebUI.setText(findTestObject(path_SaleKB + 'input__address2'), al2)
						WebUI.setText(findTestObject(path_SaleKB + 'input__zip'), zipCode)
						WebUI.setText(findTestObject(path_SaleKB + 'input_emailAddress'), emailAddress)
						//WebUI.setText(findTestObject(path_SaleKB + 'input_smsNumber'), phoneNumber)
						WebUI.setText(findTestObject(path_SaleKB + 'input_amount'), amount)
				
						
				
						WebUI.click(findTestObject(path_SaleKB + 'button_Submit'))
						Thread.sleep(2000)
						
						
						
						
						
						WebUI.verifyTextPresent('Transaction Failed', true)
						WebUI.verifyTextPresent('Reason: The credit card type you submitted is not supported. Please choose a different card type', true)
						
						
					
					WebUI.closeBrowser()
				}
		}


