package abpPages

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

public class UserListPage {

	def firstName,lastName,password,confirmPassword,userName,email,wrongPassword,wrongUserName

	@Keyword
	def clickAddButton() {
		WebUI.click(findTestObject('Object Repository/ABP/Page_UserList/input_Add'))
	}

	@Keyword
	def clickEdit() {
		WebUI.click(findTestObject('Object Repository/ABP/Page_UserList/a_edit'))
	}

	@Keyword
	def clickSaveButton() {
		WebUI.click(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_save'))
	}

	@Keyword
	def generatefirstName() {
		firstName = org.apache.commons.lang.RandomStringUtils.random(8, true, false)

		return  firstName
	}

	@Keyword
	def generatelastName() {
		lastName = org.apache.commons.lang.RandomStringUtils.random(8, true, false)

		return  lastName
	}

	@Keyword
	def generateuserName() {
		userName = org.apache.commons.lang.RandomStringUtils.random(8, true, false)

		return  userName
	}

	@Keyword
	def generatePassword() {
		password = org.apache.commons.lang.RandomStringUtils.random(9,true,true) + "!"
		confirmPassword = password
		println(password + confirmPassword)
		return  password
	}

	@Keyword
	def selectRoleProfileOwner() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/select_Role'), "Profile Owner", false)
	}

	@Keyword
	def selectRolePayer() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/select_Role'), "Payer", false)
	}

	@Keyword
	def setDataPasswordConfirmPassword() {
		this.generatePassword()

		if ((!password.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_password'),password)
		}


		if ((!confirmPassword.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_confirmPassword'),confirmPassword)
		}
	}

	@Keyword
	def setDataWrongPassword(wrongPassword) {

		if ((!wrongPassword.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_password'),wrongPassword)
		}


		if ((!wrongPassword.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_confirmPassword'),wrongPassword)
		}
	}

	@Keyword
	def setDataFirstNameLastName() {
		this.generatefirstName()
		this.generatelastName()
		if ((!firstName.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_firstName'),firstName)
		}


		if ((!lastName.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_lastName'),lastName)
		}
	}

	@Keyword
	def setDataUserName() {
		this.generateuserName()
		if ((!userName.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_username'),userName)
		}
	}

	@Keyword
	def setDataWrongUserName(wrongUserName) {
		if ((!wrongUserName.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_username'),wrongUserName)
		}
	}

	@Keyword
	def setDataEmailConfirmEmail(email) {
		if ((!email.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_email'),email)
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_confirmEmail'),email)
		}
	}
}
