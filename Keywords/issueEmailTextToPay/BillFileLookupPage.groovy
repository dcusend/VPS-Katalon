package issueEmailTextToPay

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

public class BillFileLookupPage {


	String PaymentApp, ClientAccNo, NameFirst, Last_CompanyName, Lookup1,Lookup2,Lookup3

	@Keyword
	def setDataBillFileLookup(PaymentApp, ClientAccNo, NameFirst, Last_CompanyName, Lookup1,Lookup2,Lookup3) {

		//WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/dd_PaymentApplication'))

		//to select a Payment Application from drop down
		WebUI.delay(2)
		if (PaymentApp != "") {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/dd_PaymentApplication'), PaymentApp, false)
		}
		
		WebUI.delay(2)
		if (ClientAccNo != "") {

			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_CAN'), ClientAccNo)
		}

		if (NameFirst != "") {

			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/firstName'), NameFirst)
		}

		if (Last_CompanyName != "") {

			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/lastORcompanyName'), Last_CompanyName)
		}

		if (Lookup1 != "") {

			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_Lookup1'), Lookup1)
		}


		if (Lookup2 != "") {

			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_Lookup2'), Lookup2)
		}


		if (Lookup3 != "") {

			WebUI.setText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/txt_Lookup3'), Lookup3)
		}
	}

	@Keyword
	def Search () {
		WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillFileLookup/btn_Submit'))
	}
}
