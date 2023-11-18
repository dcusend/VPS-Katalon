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

import com.kms.katalon.core.configuration.RunConfiguration as RC

import internal.GlobalVariable

public class loginFunctionality {



	def gv_URL, gv_username, gv_password, username_DD, password_DD
	def executionProfile = RC.getExecutionProfile()

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

		//	WebUI.delay(10)

		//		if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username'),30)) {
		//			System.out.println('We are on Login Page, start populating the fields')


		//			if (executionProfile.equalsIgnoreCase("QAProfile"))
		//			{
		//				WebUI.setText(findTestObject('Login_Page/Login_Username'), gv_username)

		//				WebUI.setText(findTestObject('Login_Page/Login_Password'), gv_password)
		//
		//				WebUI.click(findTestObject('Login_Page/Login_Submit'))
		//			}

		switch(executionProfile)
		{
			case "QAProfile":
				if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username'),30)) {
					System.out.println('We are on Login Page, start populating the fields')

					WebUI.setText(findTestObject('Login_Page/Login_Username'), gv_username)

					WebUI.setText(findTestObject('Login_Page/Login_Password'), gv_password)

					WebUI.click(findTestObject('Login_Page/Login_Submit'))

				}
				break

			case "QA2Profile":
				if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username_Okta'),30)) {
					//if (WebUI.verifyElementVisible(findTestObject('Login_Page/Login_Username_Okta'))) {
					System.out.println('We are on Login Page, start populating the fields')
					
					//WebUI.setText(findTestObject('Object Repository/Login_Page/input_Username_usernameXXX'), gv_username)
					WebUI.setText(findTestObject('Login_Page/Login_Username_Okta'), gv_username)

					WebUI.setText(findTestObject('Login_Page/Login_Password_Okta'), gv_password)

					WebUI.click(findTestObject('Login_Page/Login_Submit_Okta'))

					//WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/span_CustomerDD_Okta2'))

					//WebUI.waitForElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/span_CustomerDD_Okta'), 5, FailureHandling.CONTINUE_ON_FAILURE)

					//WebUI.selectOptionByLabel(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/span_CustomerDD_Okta'),"imtiaz" , true)


				}
				break

			case "DemoProfile":
				if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username'),30)) {
					System.out.println('We are on Login Page, start populating the fields')

					WebUI.setText(findTestObject('Login_Page/Login_Username'), gv_username)

					WebUI.setText(findTestObject('Login_Page/Login_Password'), gv_password)

					WebUI.click(findTestObject('Login_Page/Login_Submit'))

				}
				break

			case "Demo2Profile":
				if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username_Okta'),30)) {
					System.out.println('We are on Login Page, start populating the fields')

					//WebUI.setText(findTestObject('Login_Page/Login_Username'), gv_username)

					//WebUI.setText(findTestObject('Login_Page/Login_Password'), gv_password)

					//WebUI.click(findTestObject('Login_Page/Login_Submit'))

					WebUI.setText(findTestObject('Login_Page/Login_Username_Okta'), gv_username)

					WebUI.setText(findTestObject('Login_Page/Login_Password_Okta'), gv_password)

					WebUI.click(findTestObject('Login_Page/Login_Submit_Okta'))


				}
				break

			case "Upgrade":
				if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username_Okta'),30)) {
					System.out.println('We are on Login Page, start populating the fields')

					//WebUI.setText(findTestObject('Login_Page/Login_Username'), gv_username)

					//WebUI.setText(findTestObject('Login_Page/Login_Password'), gv_password)

					//WebUI.click(findTestObject('Login_Page/Login_Submit'))

					WebUI.setText(findTestObject('Login_Page/Login_Username_Okta'), gv_username)

					WebUI.setText(findTestObject('Login_Page/Login_Password_Okta'), gv_password)

					WebUI.click(findTestObject('Login_Page/Login_Submit_Okta'))


				}
				break

			case "Production":
				if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username_Okta'),30)) {
					System.out.println('We are on Login Page, start populating the fields')

					//WebUI.setText(findTestObject('Login_Page/Login_Username'), gv_username)

					//WebUI.setText(findTestObject('Login_Page/Login_Password'), gv_password)

					//WebUI.click(findTestObject('Login_Page/Login_Submit'))

					WebUI.setText(findTestObject('Login_Page/Login_Username_Okta'), gv_username)

					WebUI.setText(findTestObject('Login_Page/Login_Password_Okta'), gv_password)

					WebUI.click(findTestObject('Login_Page/Login_Submit_Okta'))


				}
				break


		}

	}



	//		}

	//		else {
	//			System.out.println('Not on the Login Page, exiting test')
	//		}
	//	}


	@Keyword
	def login_AdminSuite_DD(String username, String password) {

		gv_URL = GlobalVariable.AdminSuiteURL
		username_DD = username
		password_DD = password


		System.out.println('URL : ' + gv_URL)
		System.out.println('Username : ' + username)
		System.out.println('Password : ' + password)


		WebUI.openBrowser(gv_URL)

		WebUI.maximizeWindow()

		//		if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username'),30)) {
		//			System.out.println('We are on Login Page, start populating the fields')

		//			WebUI.setText(findTestObject('Login_Page/Login_Username'), username_DD)

		//			WebUI.setText(findTestObject('Login_Page/Login_Password'), password_DD)

		//			WebUI.click(findTestObject('Login_Page/Login_Submit'))
		//		}

		//		else {
		//			System.out.println('Not on the Login Page, exiting test')
		//		}


		switch(executionProfile)
		{
			case "QAProfile":
				if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username'),30)) {
					System.out.println('We are on Login Page, start populating the fields')

					WebUI.setText(findTestObject('Login_Page/Login_Username'), username_DD)

					WebUI.setText(findTestObject('Login_Page/Login_Password'), password_DD)

					WebUI.click(findTestObject('Login_Page/Login_Submit'))

				}
				break

			case "QA2Profile":
				if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username_Okta'),30)) {
					System.out.println('We are on Login Page, start populating the fields')

					WebUI.setText(findTestObject('Login_Page/Login_Username_Okta'), username_DD)

					WebUI.setText(findTestObject('Login_Page/Login_Password_Okta'), password_DD)

					WebUI.click(findTestObject('Login_Page/Login_Submit_Okta'))

					//WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/span_CustomerDD_Okta2'))

					//WebUI.waitForElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/span_CustomerDD_Okta'), 5, FailureHandling.CONTINUE_ON_FAILURE)

					//WebUI.selectOptionByLabel(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/span_CustomerDD_Okta'),"imtiaz" , true)


				}
				break

			case "DemoProfile":
				if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username'),30)) {
					System.out.println('We are on Login Page, start populating the fields')

					WebUI.setText(findTestObject('Login_Page/Login_Username'), username_DD)

					WebUI.setText(findTestObject('Login_Page/Login_Password'), password_DD)

					WebUI.click(findTestObject('Login_Page/Login_Submit'))

				}
				break

			case "Demo2Profile":
				if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username'),30)) {
					System.out.println('We are on Login Page, start populating the fields')

					WebUI.setText(findTestObject('Login_Page/Login_Username'), username_DD)

					WebUI.setText(findTestObject('Login_Page/Login_Password'), password_DD)

					WebUI.click(findTestObject('Login_Page/Login_Submit'))

				}
				break

			case "Upgrade":
				if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username'),30)) {
					System.out.println('We are on Login Page, start populating the fields')

					WebUI.setText(findTestObject('Login_Page/Login_Username'), username_DD)

					WebUI.setText(findTestObject('Login_Page/Login_Password'), password_DD)

					WebUI.click(findTestObject('Login_Page/Login_Submit'))

				}
				break

			case "Production":
				if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username'),30)) {
					System.out.println('We are on Login Page, start populating the fields')

					WebUI.setText(findTestObject('Login_Page/Login_Username'), username_DD)

					WebUI.setText(findTestObject('Login_Page/Login_Password'), password_DD)

					WebUI.click(findTestObject('Login_Page/Login_Submit'))

				}
				break


		}



	}
}
