package vspBootstrap

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

public class AddPaymentPlanPage {

	String planAmount, udf1, udf2, paymentMethod, paymentPlanType, planTypeFrequency, noOfPayments, duration
	
		String path_Add_PP = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/AddPaymentPlan/"
		
		
		
	@Keyword
    def setDataPaymentPlanInstallment(int rowS, dataFileS) {
		
		
		planAmount = dataFileS.getValue('PlanAmount', rowS)
		paymentMethod = dataFileS.getValue('PaymentMethod', rowS)
		paymentPlanType = dataFileS.getValue('PaymentPlanType', rowS)
		planTypeFrequency = dataFileS.getValue('PlanTypeFrequency', rowS)
		noOfPayments = dataFileS.getValue('NoOfPayments', rowS)
		
		
		WebUI.setText(findTestObject(path_Add_PP + 'input_totalAmount'), planAmount)
		WebUI.selectOptionByLabel(findTestObject(path_Add_PP + 'select_SelectPaymentMethod'), paymentMethod, false)
		WebUI.check(findTestObject(path_Add_PP + 'input_InstallmentPlan'))
		WebUI.selectOptionByLabel(findTestObject(path_Add_PP + 'select_Frequency'), planTypeFrequency, false)
		WebUI.setText(findTestObject(path_Add_PP + 'input_numberOfPayments'), noOfPayments)
		
		WebUI.click(findTestObject(path_Add_PP + 'button_Save'))
	}
	
	
	
	@Keyword
	def setDataPaymentPlanRecurring(int rowS, dataFileS) {
		
		planAmount = dataFileS.getValue('PlanAmount', rowS)
		paymentMethod = dataFileS.getValue('PaymentMethod', rowS)
		paymentPlanType = dataFileS.getValue('PaymentPlanType', rowS)
		planTypeFrequency = dataFileS.getValue('PlanTypeFrequency', rowS)
		noOfPayments = dataFileS.getValue('NoOfPayments', rowS)
		
		
		WebUI.setText(findTestObject(path_Add_PP + 'input_totalAmount'), planAmount)
		WebUI.selectOptionByLabel(findTestObject(path_Add_PP + 'select_SelectPaymentMethod'), paymentMethod, false)
		WebUI.check(findTestObject(path_Add_PP + 'input_RecurringPlan'))
		WebUI.selectOptionByLabel(findTestObject(path_Add_PP + 'select_Frequency'), planTypeFrequency, false)
		WebUI.check(findTestObject(path_Add_PP + 'input_payments_until_2'))	
		WebUI.setText(findTestObject(path_Add_PP + 'input_Until a total of_numberOfPaymentsForRecurring'), noOfPayments)
		WebUI.click(findTestObject(path_Add_PP + 'button_Save'))
		
	}
}
