package iwpPages

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

public class PersonalCheckPayment23NonBootstarp {
	
	
	String Amount_In, FirstName_In, LastName_In, Routing_In, Acc_In, ConfirmAcc_In, AL1_In, AL2_In, Zip_In, 
		   UDF1_In, UDF2_In, UDF3_In, UDF4_In, UDF5_In, Country_In, City_In, State_In, Email_In 
	def AccType_Checking_In, AccType_Saving_In
	
@Keyword
def setDataPCIWP(Amount_In, FirstName_In, LastName_In, Routing_In, Acc_In, ConfirmAcc_In, AccType_Checking_In, AL1_In,AL2_In, Zip_In, 
					AccType_Saving_In,UDF1_In, UDF2_In, UDF3_In, UDF4_In, UDF5_In, Country_In, City_In, State_In, Email_In){
	
		if ((!Amount_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Amount'),Amount_In)
		}

		if ((!FirstName_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Firstname'),FirstName_In)
		}

		if ((!LastName_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Lastname'),LastName_In)
		}

		if ((!Routing_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_routingNumber'),Routing_In)
		}

		if ((!Acc_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_accountNumber'),Acc_In)
		}

		if ((!ConfirmAcc_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_confirmAccountNumber'),ConfirmAcc_In)
		}
		
		
		//Checking or Saving
if (!AccType_Checking_In.isEmpty()) {
	WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/AccType_Checking'))
}
else if (!AccType_Saving_In.isEmpty()) {
	WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/AccType_Saving'))
}

		if ((!AL1_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_AL1'),AL1_In)
		}

		if ((!AL2_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_AL2'),AL2_In)
		}

		if ((!Zip_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_ZIP'),Zip_In)
		}

									//NOT REQUIRED ITEMS
//		if ((!UDF1_In.isEmpty())) {
//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/UDF1'),UDF1_In)
//		}
//
//		if ((!UDF2_In.isEmpty())) {
//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_UDF2'),UDF2_In)
//		}
//		
//		if ((!UDF3_In.isEmpty())) {
//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_UDF3'),UDF3_In)
//		}
//		
//		if ((!UDF4_In.isEmpty())) {
//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/UDF4'),UDF4_In)
//		}
//		
//		if ((!UDF5_In.isEmpty())) {
//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/UDF5'),UDF5_In)
//		}
//		
//		if ((!Country_In.isEmpty())) {
//			WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/Country'), Country_In, false)
//		}
//		
//		if ((!City_In.isEmpty())) {
//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/City'),City_In)
//		}
//		
//		if ((!State_In.isEmpty())) {
//			WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/State'), State_In, false)
//		}
//		
//		if ((!Email_In.isEmpty())) {
//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Email'),Email_In)
//		}
//		
		
	}	

	
}
