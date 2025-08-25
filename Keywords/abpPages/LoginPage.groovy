package abpPages
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
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

public class LoginPage {

	def username,password,emailAddress,usernameLabel,billType,lookup1,lookup2,lookup3

	String pathOR = "Object Repository/ABP/LoginABP/"

	//This method will retrieve username and password and perform login to ABP application
	@Keyword
	def setLoginDataMethod(username,password) {
		println(username + password)
		WebUI.setText(findTestObject(pathOR+'input_username'), username)
		WebUI.setText(findTestObject(pathOR+'input_password'), password)
		WebUI.click(findTestObject('Object Repository/ABP/LoginABP/input_loginBtn'))
	}
	//This method will click on the link of forgot user name
	@Keyword
	def clickForgotUsername() {
		WebUI.click(findTestObject('Object Repository/ABP/LoginABP/a_forgotUsername'))
	}

	//This method will click on the link of forgot user name
	@Keyword
	def clickForgotPassword() {
		WebUI.click(findTestObject('Object Repository/ABP/LoginABP/a_forgotPassword'))
	}

	//This method will get email address from user and perform forgot username method
	@Keyword
	def setForgotUsernameDataMethod(emailAddress ) {
		WebUI.setText(findTestObject('Object Repository/ABP/Page_ForgotUsername/input_email'), emailAddress)
		WebUI.click(findTestObject('Object Repository/ABP/Page_ForgotUsername/input_Continue'))
	}

	//This method will get email address and user name from user and perform forgot password method
	@Keyword
	def setForgotPasswordDataMethod(emailAddress,usernameLabel) {
		WebUI.setText(findTestObject('Object Repository/ABP/Page_ForgotPassword/input_userName'), usernameLabel)
		WebUI.setText(findTestObject('Object Repository/ABP/Page_ForgotUsername/input_email'), emailAddress)
		WebUI.click(findTestObject('Object Repository/ABP/Page_ForgotUsername/input_Continue'))
	}

	//this method will click on register and pay method
	@Keyword
	def clickRegisterPayMethod(){
		WebUI.click(findTestObject('Object Repository/ABP/LoginABP/input_RegisterPay'))
	}

	//this method will select the bill type
	@Keyword
	def selectBillTypeMethod(billType){
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/LoginABP/select_BillType'),billType, false)
	}

	//this method will click on Pay as a guest button
	@Keyword
	def clickPayAsGuest(){
		WebUI.click(findTestObject('Object Repository/ABP/LoginABP/input__guestBillSubmitBtn'))
	}

	//this method will set data for lookup fields
	@Keyword
	def setDataLookUpField(lookup1,lookup2,lookup3) {
		WebUI.setText(findTestObject('Object Repository/ABP/LoginABP/input__billLookupForm.lookupValue1'), lookup1)
		WebUI.setText(findTestObject('Object Repository/ABP/LoginABP/input__billLookupForm.lookupValue2'), lookup2)
		WebUI.setText(findTestObject('Object Repository/ABP/LoginABP/input__billLookupForm.lookupValue3'), lookup3)
	}
}
