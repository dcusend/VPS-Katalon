package bwpPagesBootstrap

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

public class selectPaymentMethodBootstrapPage {


	String pathSelectPM = "Object Repository/BWP_Bootstrap/Page_SelectPaymentMethod/"



	// Select Pay by Credit or Debit Card
	@Keyword
	def selectRadioPayByCreditCard() {
		if(findTestObject(pathSelectPM + 'PayByCreditCard')) {
			WebUI.check(findTestObject(pathSelectPM + 'PayByCreditCard'))
		}
	}



	// Select Pay by Personal Check
	@Keyword
	def selectRadioPayByPersonal() {
		WebUI.check(findTestObject(pathSelectPM + 'PayByPersonalCheck'))
	}



	// Select Pay by Corporate Check
	@Keyword
	def selectRadioPayByCorporate() {
		WebUI.check(findTestObject(pathSelectPM + 'PayByCorporateCheck'))
	}



	// Select Make a Payment Button
	@Keyword
	def selectButtonMakeAPayment() {
		WebUI.click(findTestObject(pathSelectPM + 'MakePaymentButton'))
	}
}
