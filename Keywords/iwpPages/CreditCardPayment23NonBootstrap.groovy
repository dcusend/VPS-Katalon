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

public class CreditCardPayment23NonBootstrap {
	
	
	String 	Amount_In, CardNo_In, ExpM_In, ExpY_In, Email_In,
			UDF1_In, UDF2_In, UDF3_In, UDF4_In, UDF5_In, Name_In, AL1_In, AL2_In, Zip_In, Country_In, City_In, State_In
	
@Keyword
def setDataCCIWP(Amount_In, CardNo_In, ExpM_In, ExpY_In, Email_In,
				UDF1_In, UDF2_In, UDF3_In, UDF4_In, UDF5_In, Name_In, AL1_In, AL2_In, Zip_In, Country_In, City_In, State_In){

		if ((!Amount_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),Amount_In)
		}

		if ((!CardNo_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),CardNo_In)
		}

		if ((!ExpM_In.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),ExpM_In,false)
		}

		if ((!ExpY_In.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),ExpY_In,false)
		}

		if ((!Email_In.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/EmailAddress'),Email_In)
		}
		
											//NOT REQUIRED ITEMS
		
		//		if ((!UDF1_In.isEmpty())) {
		//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UDF1'),UDF1_In)
		//		}
		//
		//		if ((!UDF2_In.isEmpty())) {
		//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),UDF2_In)
		//		}
		//
		//		if ((!UDF3_In.isEmpty())) {
		//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),UDF3_In)
		//		}
		//
		//		if ((!UDF4_In.isEmpty())) {
		//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UDF4'),UDF4_In)
		//		}
		//
		//		if ((!UDF5_In.isEmpty())) {
		//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UDF5'),UDF5_In)
		//		}
		
		//		if ((!Name_In.isEmpty())) {
		//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'),Name_In)
		//		}
		
		//		if ((!AL1_In.isEmpty())) {
		//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),AL1_In)
		//		}
		
		//		if ((!AL2_In.isEmpty())) {
		//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),AL2_In)
		//		}
		
		//		if ((!Zip_In.isEmpty())) {
		//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),Zip_In)
		//		}
		
		//		if ((!Country_In.isEmpty())) {
		//			WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CountryDropDown'), Country_In, false)
		//		}
		//
		//		if ((!City_In.isEmpty())) {
		//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/City'),City_In)
		//		}
		//
		//		if ((!State_In.isEmpty())) {
		//			WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/State'), State_In, false)
		//		}



	}	

	
}
