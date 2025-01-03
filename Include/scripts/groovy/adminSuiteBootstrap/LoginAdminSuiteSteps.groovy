package adminSuiteBootstrap

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

public class LoginAdminSuiteSteps {
	
	
//----------------------------------------------------------	
	@Given("User navigates to Admin Suite Login page")
	def navigateToAdminSuiteLoginPage()
	{
		
		def adminSuiteURL = GlobalVariable.AdminSuiteURL
		
		WebUI.openBrowser(adminSuiteURL)
		
		WebUI.maximizeWindow()
	}
	
//----------------------------------------------------------
	
	@When("User enters username and password")
	def enterCredentials()
	{
		
		def adminSuite_username = GlobalVariable.Username
		def adminSuite_password = GlobalVariable.Password
		
		WebUI.setText(findTestObject('Login_Page/Login_Username_Okta'), adminSuite_username)
		WebUI.setText(findTestObject('Login_Page/Login_Password_Okta'), adminSuite_password)
				
	}
	
//----------------------------------------------------------
	
	@And("User selects the Sign In button")
	def selectSignInButton()
	{
		WebUI.click(findTestObject('Login_Page/Login_Submit_Okta'))
			
	}
	
	
//----------------------------------------------------------
	
	@Then("User is navigated to Dashboard page")
	def verifyDashboardPage()
	{
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/a_Access User Management'),30))
			{
				println ("Login was successful, User is on Dashboard Page")
			}
		else
			{
				println ("Login was NOT successful, User is NOT on Dashboard Page")
			}
		
	}
		
	
	
//----------------------------------------------------------
	
	

	
	
	
}
