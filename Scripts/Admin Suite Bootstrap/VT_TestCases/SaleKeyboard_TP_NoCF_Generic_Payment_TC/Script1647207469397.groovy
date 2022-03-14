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


/*
 * def executionProfile = RC.getExecutionProfile() System.out.println
 * ("executionProfile : " + executionProfile)
 * 
 * String path_TestMinus = "Object Repository/Page_TestMinusAndAtSigns/"
 * 
 * String appHref, appName, appID
 * 
 * //String li_1 = "/admin/imtiazdemo/vpos/"
 * 
 * String li_1 = GlobalVariable.vpos_Prefix String li_2 =
 * "/transactions/AuthCapForm/"
 * 
 * appID = "742" //appName = "Access AutoNoCFtp"
 * 
 * 
 * WebUI.openBrowser('')
 * 
 * WebUI.navigateToUrl(GlobalVariable.AdminSuiteURL)
 * 
 * 
 * WebUI.maximizeWindow()
 * 
 * 
 * WebUI.setText(findTestObject('Object
 * Repository/Page_TestMinusAndAtSigns/input_Username_user'),
 * GlobalVariable.Username)
 * 
 * WebUI.setText(findTestObject('Object
 * Repository/Page_TestMinusAndAtSigns/input_Password_password'),
 * GlobalVariable.Password)
 * 
 * WebUI.click(findTestObject('Object
 * Repository/Page_TestMinusAndAtSigns/input_Password_button2'))
 * 
 * String hrefAppID = li_1 + appID + li_2 String hrefApp = li_1 + appID + "/"
 * println("hrefApp : " + hrefApp) ///admin/imtiaz/bootstrap/vpos/198/
 * 
 * //def appNameLink = WebUI.modifyObjectProperty(findTestObject(path_TestMinus
 * + 'a_Access CC Test-Bootstrap'),'text','equals',appName,true) def appNameLink
 * = WebUI.modifyObjectProperty(findTestObject(path_TestMinus +
 * 'appNameLink_Generic'),'href','equals',hrefApp,true)
 * 
 * WebUI.click(appNameLink)
 */


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
String fileLoc = "C:\\KatalonData\\Bootstrap\\VT-Data.xlsx"
def numOfRows, dataFile, nameSheet


if (executionProfile.equalsIgnoreCase("QAProfile"))
{
	 nameSheet = "VT-Sale-NoCF"
	 numOfRows = findTestData('QA/Bootstrap/VT-TestData/VT-SaleData-NoCF').getRowNumbers()
	
		println("Number of Records: " + numOfRows)
	
		 dataFile = "QA/Bootstrap/VT-TestData/VT-SaleData-NoCF"
}
else if(executionProfile.equalsIgnoreCase("DemoProfile"))
	{
		 nameSheet = "VT-Sale-NoCF-Demo"
		 numOfRows = findTestData('QA/Bootstrap/VT-TestData/VT-SaleData-NoCF-Demo').getRowNumbers()
		
			println("Number of Records: " + numOfRows)
		
			 dataFile = "QA/Bootstrap/VT-TestData/VT-SaleData-NoCF-Demo"
	}


	
	
	
	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			appName = findTestData(dataFile).getValue('AppName', row)
			appID = findTestData(dataFile).getValue('AppID', row)
			
			String hrefAppID = li_1 + appID + li_2
			String hrefApp = li_1 + appID + "/"
			
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
					
					def appNameLink = WebUI.modifyObjectProperty(findTestObject(path_TestMinus + 'appNameLink_Generic'),'href','equals',hrefApp,true)
					WebUI.click(appNameLink)
					
				}
		}


