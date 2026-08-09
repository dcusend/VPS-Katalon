package issueEmailTextToPay

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.Locale
import com.kms.katalon.core.testobject.ConditionType
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


public class ManualEntryPage_CANAmount {


	String T_PaymentApp, T_CAN, T_Amount, T_FirstName, T_LastName, T_Email, T_Phone, T_CompanyName, T_AddressLine1, T_AddressLine2,
	T_City, T_State, T_ZipCode, T_UDF1,T_UDF2,T_UDF3,T_UDF4,T_UDF5,T_UDF6,T_UDF7,T_UDF8,T_UDF9,T_UDF10, T_DueDate, T_CANUsed, T_AmountUsed
			

	@Keyword
	def setDataManualEntry(T_PaymentApp,T_CANUsed, T_AmountUsed, T_CAN, T_Amount, T_FirstName, T_LastName, T_Email, T_Phone, T_CompanyName, T_DueDate, T_AddressLine1, T_AddressLine2,
			T_City, T_State, T_ZipCode, T_UDF1,T_UDF2,T_UDF3,T_UDF4,T_UDF5,T_UDF6,T_UDF7,T_UDF8,T_UDF9,T_UDF10 ) {


		WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/btn_ManualEntryTab'))

	//to select a Payment Application
		WebUI.delay(2)
		if (T_PaymentApp != "") {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/dd_PaymentApplication'), T_PaymentApp, false)
		}

		
	//CAN & Amount logic
		String finalCAN = ""
		String finalAmount = ""
		
		if (T_CANUsed.equalsIgnoreCase("Y")) {
			finalCAN = T_CAN
			println (finalCAN)
		} else {			
			int randomCAN = (Math.random() * 90000000) + 10000000   // Generate random 8-digit number CAN
			finalCAN = randomCAN.toString()
			println (finalCAN)
		}
		
		if (T_AmountUsed.equalsIgnoreCase("Y")) {
			finalAmount = T_Amount
			println (finalAmount)
		} else {			
			double randomAmount = Math.random() * 999.99         // Generate random Amount between 0.00 and 999.99
			finalAmount = String.format("%.2f", randomAmount)
			println (finalAmount)
		}						
				
		WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_CAN'), finalCAN)
		
		WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_Amount'), finalAmount)					
		
		
		
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
			
		
	//Due Date				
		if (T_DueDate.equalsIgnoreCase("Y")) {      		//from excel sheet
			
			// Get current day
			String day = LocalDate.now().getDayOfMonth().toString()
		
			// Open date picker
			WebUI.waitForElementClickable(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/DueDate'),10)
			WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/DueDate'))
		
			// Create dynamic object for the day	
			TestObject dayObj = new TestObject('currentDay')
			dayObj.addProperty("xpath",ConditionType.EQUALS,"//div[contains(@class,'datepicker')]//td[not(contains(@class,'old')) and not(contains(@class,'new')) and text()='" + day + "']")
							
			// Click the current date
			WebUI.click(dayObj)
		
		} else if (T_DueDate.equalsIgnoreCase("N")) {      //from excel sheet
			WebUI.comment("DueDate flag is N – skipping date selection.")		
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

	//this logic is made to work scorlling smoother on page
	if (T_PaymentApp != "") {
		if (T_UDF1 != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF1'), T_UDF1)
		}
		else
		{
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF1'), '')
		}
			
		if (T_UDF2 != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF2'), T_UDF2)
		}
		else
		{
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF2'), '')
		}

		if (T_UDF3 != "") {
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF3'), T_UDF3)
		}
		else
		{
			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/ManualEntry/txt_UDF3'), '')
		}
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
}
