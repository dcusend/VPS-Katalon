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
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration as RC


def executionProfile = RC.getExecutionProfile()

def deepAdminSuiteURL, deepUsername, deepPassword


switch(executionProfile)
{
	case "QAProfile":
			 deepAdminSuiteURL = "https://qa.velocitypayment.com/admin/deep"
			 deepUsername = GlobalVariable.Username
			 deepPassword = GlobalVariable.Password
			 
			 println deepUsername
			 println deepPassword
			 		
		  break
		
	case "QA2Profile":
			deepAdminSuiteURL = "https://qa2.velocitypayment.com/admin/deep"
			deepUsername = GlobalVariable.Username
			deepPassword = GlobalVariable.Password
			
			println deepUsername
			println deepPassword
				
		  break
				
	case "DemoProfile":
			deepAdminSuiteURL = "https://demo.velocitypayment.com/admin/imtiazdemo"
			deepUsername = GlobalVariable.AutoUserAdminSuite
			deepPassword = GlobalVariable.AutoPasswordAdminSuite
			
			println deepUsername
			println deepPassword
			
		  break
		
	case "Production":
			deepAdminSuiteURL = "https://www.velocitypayment.com/admin/testcustomer"
			deepUsername = GlobalVariable.AutoUserAdminSuite
			deepPassword = GlobalVariable.AutoPasswordAdminSuite
			
			println deepUsername
			println deepPassword
			
	      break
	
	case "Upgrade":
			deepAdminSuiteURL = "https://Upgrade.velocitypayment.com/admin/testcustomer"
			deepUsername = GlobalVariable.AutoUserAdminSuite
			deepPassword = GlobalVariable.AutoPasswordAdminSuite
			
			println deepUsername
			println deepPassword
			
	      break
		 			
}

// Log into Admin Suite
CustomKeywords.'adminSuiteBootstrap.loginFunctionality.setDataAdminSuiteLogin'(deepUsername,deepPassword,deepAdminSuiteURL)

// Verify Links

WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'), 30)


//WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_ManageEmailOrTextToPay'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_ManageEmailOrTextToPay'), 30)


//WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_IssueEmailOrTextToPay'))
WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_IssueEmailOrTextToPay'), 30)

