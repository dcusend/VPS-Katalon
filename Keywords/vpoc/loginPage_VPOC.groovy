package vpoc

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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class loginPage_VPOC {
	
	
	@Keyword
	def login_VPOC() {
		def gv_vpocURL = GlobalVariable.vpoc_URL
		def gv_username = GlobalVariable.Username
		def gv_password = GlobalVariable.Password
	
		System.out.println('URL : ' + gv_vpocURL)
		System.out.println('Username : ' + gv_username)
		System.out.println('Password : ' + gv_password)
	
	
		WebUI.openBrowser(gv_vpocURL)
	
		WebUI.maximizeWindow()
		
// Define the Test Objects for the login page elements
		TestObject username_VPOC = new TestObject('username_VPOC')
		username_VPOC.addProperty('id', ConditionType.EQUALS, 'okta-signin-username')
		
		TestObject password_VPOC = new TestObject('password_VPOC')
		password_VPOC.addProperty('id', ConditionType.EQUALS, 'okta-signin-password')
		
		TestObject signIn_VPOC = new TestObject('signIn_VPOC')
		signIn_VPOC.addProperty('id', ConditionType.EQUALS, 'okta-signin-submit')
		
// Populate the login fields and click the sign-in button
		WebUI.setText(username_VPOC,gv_username)
		WebUI.setText(password_VPOC,gv_password)
		WebUI.click(signIn_VPOC)
		
	
	}
	
	
	
	

}
