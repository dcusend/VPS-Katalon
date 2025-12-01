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
import com.kms.katalon.core.testdata.reader.ExcelFactory

public class ScheduledPaymentPage {

	def udf1, udf2, udf3, udf4,paymentMethod,paymentPlanType,paymentPlanFrequency,dividePaymentPlanBy

	String pathSharedData = "KatalonData/ABPTestData/NormalizedSharedData.xlsx"
	String UDFID

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
		if(!paymentPlanFrequency.isEmpty()) {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/Page_SchedulePayment/select_PaymentPlanFrequency'), paymentPlanFrequency, false)
	}} 

	@Keyword
	def checkRadioDivideYourPaymentPlan(dividePaymentPlanBy) {
		WebUI.check(findTestObject('Object Repository/ABP/Page_SchedulePayment/radio_'+dividePaymentPlanBy))
	}

	@Keyword
	def getDataUDF(String UDFG) {

		def dataFileUDF = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "UDFData", true)
		def numOfRowsUDF = dataFileUDF.getRowNumbers()

		for (def row = 1 ; row<=numOfRowsUDF ;row++) {

			def ID = dataFileUDF.getValue("ID", row)

			if(ID.equals(UDFG)) {
				udf1 =dataFileUDF.getValue("UDF1", row)
				udf2 =dataFileUDF.getValue("UDF2", row)
				//udf3 =dataFileUDF.getValue("UDF3", row)
				udf4 =dataFileUDF.getValue("UDF4", row)
			}
		}
	}
	@Keyword
	def setDataUDF(String UDFS) {

		this.getDataUDF(UDFS)

		if(!udf1.isEmpty()) {

			WebUI.setText(findTestObject('Object Repository/ABP/Page_SchedulePayment/input_UDF1'), udf1)
		}

		if(!udf2.isEmpty()) {

			WebUI.setText(findTestObject('Object Repository/ABP/Page_SchedulePayment/input_UDF2'), udf2)
		}

		if(!udf4.isEmpty()) {

			WebUI.setText(findTestObject('Object Repository/ABP/Page_SchedulePayment/input_UDF4'), udf4)
		}
	}

	@Keyword
	def clickSaveButton() {

		WebUI.click(findTestObject('Object Repository/ABP/Page_SchedulePayment/input_Save'))
	}
	@Keyword
	def clickACHTANDConditionsButton() {

		WebUI.check(findTestObject('Object Repository/ABP/Page_SchedulePayment/input_ACHTermsConditions'))
	}
}
