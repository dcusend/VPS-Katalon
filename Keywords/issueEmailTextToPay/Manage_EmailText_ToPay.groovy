package issueEmailTextToPay

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.text.SimpleDateFormat
import java.util.Calendar
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
import org.openqa.selenium.Keys as Keys

public class Manage_EmailText_ToPay {


	String T_PaymentApp, T_CAN, T_Amount, T_FirstName, T_LastName, T_Email, T_Phone, T_CompanyName, T_AddressLine1, T_AddressLine2,
	T_City, T_State, T_ZipCode, T_UDF1,T_UDF2,T_UDF3,T_UDF4,T_UDF5,T_UDF6,T_UDF7,T_UDF8,T_UDF9,T_UDF10,
	T_PaymentId, T_FilterText 
	
	def partialFirstName, partialLastName, partialCompName

//Part 1 Manual Entry page
	
	@Keyword
	def setDataManualEntry(T_PaymentApp, T_CAN, T_Amount, T_FirstName, T_LastName, T_Email, T_Phone, T_CompanyName, T_AddressLine1, T_AddressLine2,
			T_City, T_State, T_ZipCode, T_UDF1,T_UDF2,T_UDF3,T_UDF4,T_UDF5,T_UDF6,T_UDF7,T_UDF8,T_UDF9,T_UDF10) {


		WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/btn_ManualEntryTab'))

		//to select a Payment Application
		WebUI.delay(2)
		if (T_PaymentApp != "") {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/dd_PaymentApplication'), T_PaymentApp, false)
		}

		if (T_CAN != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_CAN'), T_CAN)
		}

		if (T_Amount != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_Amount'), T_Amount)
		}

		if (T_FirstName != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_FirstName'), T_FirstName)
		}

		if (T_LastName != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_LastName'), T_LastName)
		}

		if (T_Email != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_EmailAddress'), T_Email)
		}

		if (T_Phone != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_PhoneNumber'), T_Phone)
		}

		if (T_CompanyName != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_CompanyName'), T_CompanyName)
		}

		if (T_AddressLine1 != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_Address1'), T_AddressLine1)
		}

		if (T_AddressLine2 != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_Address2'), T_AddressLine2)
		}

		if (T_City != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_City'), T_City)
		}
	
		// to move cursor/tab out
		if (T_ZipCode != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_ZipCode'), T_ZipCode)
			WebUI.sendKeys(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_ZipCode'), Keys.chord(Keys.TAB)) 
		}
		
		WebUI.delay(2)
		if (T_State != "") {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/select_State'), T_State, false)
		}

		if (T_UDF1 != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF1'), T_UDF1)
		}

		if (T_UDF2 != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF2'), T_UDF2)
		}

		if (T_UDF3 != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF3'), T_UDF3)
		}

		//		if (T_UDF4 != "") {
		//			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF4'), T_UDF4)
		//		}
		//
		//		if (T_UDF5 != "") {
		//			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF5'), T_UDF5)
		//		}
		//
		//		if (T_UDF6 != "") {
		//			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF6'), T_UDF6)
		//		}
		//
		//		if (T_UDF7 != "") {
		//			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF7'), T_UDF7)
		//		}
		//
		//		if (T_UDF8 != "") {
		//			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF8'), T_UDF8)
		//		}
		//
		//		if (T_UDF9 != "") {
		//			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF9'), T_UDF9)
		//		}
		//
		//		if (T_UDF10 != "") {
		//			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF10'), T_UDF10)
		//		}
	}

	
	@Keyword
	def SendPaymentLink () {
		WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/btn_SendPaymentLink'))
	}	
	
	
//Part 2 Manage Email or Text to Pay	
	
	@Keyword
	def SearchResults(T_PaymentId) {
			
		WebUI.delay(1)
		if (T_PaymentId != "") {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/dd_SelectPaymentApplication'), T_PaymentId, false)
		}
		
		 WebUI.delay(1)
		WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/btn_Search'))
	}	
		

	@Keyword
	def FilterResults(T_FilterText) {			

		if (T_FilterText != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/FilterInputBox'), T_FilterText)
		}		
		
		WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/btn_Filter'))
		
	}
	
	
	@Keyword
	def WithoutSearch(T_PaymentId) {
			
		WebUI.delay(1)
		if (T_PaymentId != "") {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/dd_SelectPaymentApplication'), T_PaymentId, false)
		WebUI.delay(1)
		}
	}

	
	
	@Keyword
  	def DatesVerification() {
	  
	  // Get current date and format it as MM/dd/yyyy (adjust the format if needed)
	  SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy")
	  Date currentDate = new Date()
	  String currentDateStr = dateFormat.format(currentDate)
	  
	  // Get the date 3 days from now
	  Calendar calendar = Calendar.getInstance()
	  calendar.add(Calendar.DAY_OF_YEAR, 3)
	  Date expiryDate = calendar.getTime()
	  String expiryDateStr = dateFormat.format(expiryDate)
	  
	  // Get the Link Create Date and Link Expiry Date from the web page
	  String linkCreateDate = WebUI.getText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/LinkCreateDate'))
	  String linkExpiryDate = WebUI.getText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/LinkExpireDate'))
	  
	  // Validate Link Create Date is current date
	  if (linkCreateDate == currentDateStr) {
		  println("Link Create Date is correct: " + linkCreateDate)
	  } else {
		  println("Link Create Date is incorrect. Expected: " + currentDateStr + ", but got: " + linkCreateDate)
	  }
	  
	  // Validate Link Expiry Date is current date + 3 days
	  if (linkExpiryDate == expiryDateStr) {
		  println("Link Expiry Date is correct: " + linkExpiryDate)
	  } else {
		  println("Link Expiry Date is incorrect. Expected: " + expiryDateStr + ", but got: " + linkExpiryDate)
	  }
	     
	}
  
}
