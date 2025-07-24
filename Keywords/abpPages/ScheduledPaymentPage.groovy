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

public class ScheduledPaymentPage {

	def udf1, udf2, udf3, udf4,paymentMethod,paymentPlanType,paymentPlanFrequency
	
	@Keyword
	def selectPaymentMethod(paymentMethod) {
		println(paymentMethod)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/Page_SchedulePayment/select_PaymentMethod'), paymentMethod, false)
	}
	
	@Keyword
	def checkRadioPaymentPlanType(paymentPlanType) {
		WebUI.check(findTestObject('Object Repository/ABP/Page_SchedulePayment/radio_'+paymentPlanType))
	}
	
	@Keyword
	def selectPaymentPlanFrequency(paymentPlanFrequency) {
		println(paymentPlanFrequency)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/Page_SchedulePayment/select_PaymentPlanFrequency'), paymentPlanFrequency, false)
	}
	
	}
