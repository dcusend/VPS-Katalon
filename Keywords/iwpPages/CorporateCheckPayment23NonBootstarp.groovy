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

public class CorporateCheckPayment23NonBootstarp {
	
	
	String Amount_In, UDF2_In, UDF3_In, UDF4_In, UDF5_In,CompName_In, RNo_In, AccNo_In, ConfirmAccNo_In, EIN_IN, AddL1_In, AddL2_In, Zip_In, Email_In,
			Country_In, City_In, State_In 
	
@Keyword
def setDataCorpCheckIWP(Amount_In, UDF2_In, UDF3_In, UDF4_In, UDF5_In,CompName_In, RNo_In, AccNo_In, ConfirmAccNo_In, EIN_IN, AddL1_In, AddL2_In, Zip_In, Email_In,
						Country_In, City_In, State_In){

		if ((!Amount_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_Amount'),Amount_In)
		}

		if ((!UDF2_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_UDF2'),UDF2_In)
		}

		if ((!UDF3_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_UDF3'),UDF3_In)
		}
		
		if ((!UDF4_In.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/UDF4'),UDF4_In, false)
		}

		if ((!UDF5_In.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/UDF5'),UDF5_In, false)
		}

		if ((!CompName_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/input_CompanyName'),CompName_In)
		}

		if ((!RNo_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_routingNumber'),RNo_In)
		}

		if ((!AccNo_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_accountNumber'),AccNo_In)
		}

		if ((!ConfirmAccNo_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_confirmAccountNumber'),ConfirmAccNo_In)
		}

		if ((!EIN_IN.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/input_EIN'),EIN_IN)
		}

		if ((!AddL1_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_AL1'),AddL1_In)
		}

		if ((!AddL2_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_AL2'),AddL2_In)
		}
		
		if ((!Zip_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_ZIP'),Zip_In)
		}

		if ((!Email_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_Email'),Email_In)
		}

				
				//NOT REQUIRED ITEMS
		//
		//		if ((!Country_In.isEmpty())) {
		//			WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/Country'), Country_In, false)
		//		}
		//
		//		if ((!City_In.isEmpty())) {
		//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/City'),City_In)
		//		}
		//
		//		if ((!State_In.isEmpty())) {
		//			WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/State'), State_In, false)
		//		}
		
		
	}	

	
}
