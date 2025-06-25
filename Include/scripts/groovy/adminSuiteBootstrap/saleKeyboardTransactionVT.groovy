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
import cucumber.api.java.en.*

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement

import internal.GlobalVariable

public class saleKeyboardTransactionVT {



	@Given("User Logs into Admin Suite")
	def loginAdminSuite() {
		def adminSuiteURL = GlobalVariable.AdminSuiteURL

		WebUI.openBrowser(adminSuiteURL)

		WebUI.maximizeWindow()

		def adminSuite_username = GlobalVariable.Username
		def adminSuite_password = GlobalVariable.Password

		WebUI.setText(findTestObject('Login_Page/Login_Username_Okta'), adminSuite_username)
		WebUI.setText(findTestObject('Login_Page/Login_Password_Okta'), adminSuite_password)

		WebUI.click(findTestObject('Login_Page/Login_Submit_Okta'))

		if (WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/a_Access User Management'),30)) {
			println ("Login was successful, User is on Dashboard Page")
		}
		else {
			println ("Login was NOT successful, User is NOT on Dashboard Page")
		}
	}



	@When("User selects a Payment Application with No CF on Dashboard page")
	def selectPaymentAppwithNoCF() {

		WebUI.click(findTestObject("Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/a_Access AutoNoCFtp"))
	}


	@When("User selects a Payment Application with Single CF on Dashboard page")
	def selectPaymentAppWithSingleCF() {

		WebUI.click(findTestObject("Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/a_Access AutoSingleCFtpQA"))
	}



	@When("User selects a Payment Application with Dual CF on Dashboard page")
	def selectPaymentAppWithDualCF() {

		WebUI.click(findTestObject("Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/a_Access AutoDualCFtpQA"))
	}



	@And("User selects Sale link on Issue Transactions page")
	def selectSaleLink() {

		WebUI.click(findTestObject("Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/button_Authorization  Capture (Sale)"))
	}



	@And("User selects Keyboard Entry link on Issue Transactions page")
	def selectKeyboardEntryLink() {

		WebUI.click(findTestObject("Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/a_KeyboardEntry_Sale"))
	}


	//


	@And("User populates the Sale Keyboard Entry page")
	def setDataKeyboardEntrySale() {


		String path_SaleKB = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SaleKeyboard/"

		WebUI.setText(findTestObject(path_SaleKB + 'input_cardName'), "Cameron White")
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_transactionCategory'), "RETL", true)
		WebElement element = WebUiCommonHelper.findWebElement(findTestObject(path_SaleKB + 'input__cardNumber2'),30)
		WebUI.executeJavaScript("arguments[0].value ='"+ "4111111111111111" +"' "  , Arrays.asList(element))
		WebElement element2 = WebUiCommonHelper.findWebElement(findTestObject(path_SaleKB + 'input__cvv'),30)
		WebUI.executeJavaScript("arguments[0].value ='"+ "125" +"' ", Arrays.asList(element2))
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_MM'), "12", true)
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_YYYY'), "2028", true)
		WebUI.setText(findTestObject(path_SaleKB + 'input__address'), "2311 York road")
		WebUI.setText(findTestObject(path_SaleKB + 'input__address2'), "Suite 500")
		WebUI.setText(findTestObject(path_SaleKB + 'input__zip'), "21054")
		WebUI.setText(findTestObject(path_SaleKB + 'input_emailAddress'), "")

		//WebUI.setText(findTestObject(path_SaleKB + 'input_smsNumber'), "2408939844")


		WebUI.setText(findTestObject(path_SaleKB + 'input_amount'), "10.50")

		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined1'), "Test UDF1")
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined2'), "")
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined3'), "")
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined4'), "")
		WebUI.selectOptionByLabel(findTestObject(path_SaleKB + 'select_UDF5_DropDown'), "Orange", true)
		WebUI.selectOptionByLabel(findTestObject(path_SaleKB + 'select_UDF6_DropDown'), "Yellow", true)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined7'), "")
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined8'), "")
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined9'), "")
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined10'), "")
	}


	@And("User selects the Submit button on Sale Keyboard Entry page")
	def selectSubmitSaleKeyboardEntry() {

		WebUI.click(findTestObject("Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SaleKeyboard/button_Submit"))
	}



	@Then("User is presented with Sale Payment Receipt page")
	def verifySaleReceiptPage() {

		WebUI.verifyTextPresent('Transaction Successful', true)
	}



	@And("User verifies all the information is correct on Sale Payment Receipt page")
	def verifyReceiptContents() {

		WebUI.verifyTextPresent('Remittance ID', true)
		WebUI.verifyTextPresent('Received', true)
		WebUI.verifyTextPresent('Amount', true)
		WebUI.verifyTextPresent('Total Amount', true)
		WebUI.verifyTextPresent('Transaction Type', true)
		WebUI.verifyTextPresent('10.50', true)
		WebUI.verifyTextPresent('Authorization and Capture', true)
		WebUI.verifyTextPresent('Card Information', true)
	}



	@And("User verifies CF is not charged on Sale Payment Receipt page")
	def verifyCFnotCharged() {

		WebUI.verifyTextNotPresent('Single Transaction', true)
		WebUI.verifyTextNotPresent('Dual Transaction', true)
	}



	@And("User verifies Single CF is charged on Sale Payment Receipt page")
	def verifySingleCFCharged() {

		WebUI.verifyTextPresent('Single Transaction', true)
		WebUI.verifyTextNotPresent('Dual Transaction', true)
		WebUI.verifyTextPresent('15.50', true)
	}



	@And("User verifies Dual CF is charged on Sale Payment Receipt page")
	def verifyDualCFCharged() {

		WebUI.verifyTextNotPresent('Single Transaction', true)
		WebUI.verifyTextPresent('Dual Transaction', true)
		WebUI.verifyTextPresent('15.50', true)
	}
}
