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

import internal.GlobalVariable

public class loginFunctionality {



	def gv_URL, gv_username, gv_password

	@Keyword
	def login_AdminSuite() {

		gv_URL = GlobalVariable.AdminSuiteURL
		gv_username = GlobalVariable.Username
		gv_password = GlobalVariable.Password

		System.out.println('URL : ' + gv_URL)
		System.out.println('Username : ' + gv_username)
		System.out.println('Password : ' + gv_password)


		WebUI.openBrowser(gv_URL)

		WebUI.maximizeWindow()

		if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username'),30)) {
			System.out.println('We are on Login Page, start populating the fields')

			WebUI.setText(findTestObject('Login_Page/Login_Username'), gv_username)

			WebUI.setText(findTestObject('Login_Page/Login_Password'), gv_password)

			WebUI.click(findTestObject('Login_Page/Login_Submit'))
		}

		else {
			System.out.println('Not on the Login Page, exiting test')
		}
	}
}
