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
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class achCorporatePaymentEntryBootstrapPage {

	def companyName,routingTransitNumber,accountNumber,confirmAccountNumber,EIN, AL1, AL2, ZIP, email, phone, amount
	def udf1, udf2, udf3, udf4, udf5, udf6, udf7, udf8, udf9, udf10,ccDate

	String pathSharedData = "KatalonData/IWPBootstrapData/NormalizedSharedData.xlsx"
	String pathOR = "Object Repository/IWP_Bootstrap/Page_PaymentEntryCorporate_Bootstrap/"
	String nameID,ACHID,EmailPhoneID,AddressID,AmountS, UDFID


	@Keyword
	def setDataACHMain(nameID,ACHID,EmailPhoneID,AddressID,AmountS, UDFID) {
		this.setDataCompanyNameID(nameID)
		this.setDataACH(ACHID)
		this.setDataAddress(AddressID)
		this.setDataEmailAndPhone(EmailPhoneID)
		this.setDataUDF(UDFID)
		this.selectCheckboxStoredPaymentMethod()
		this.selectCheckboxACHTANDC()
		this.selectContinueButton()
	}

	@Keyword
	def setDataACHDefferedMain(nameID,ACHID,EmailPhoneID,AddressID,AmountS, UDFID,ccDate) {
		this.setDataCompanyNameID(nameID)
		this.setDataACH(ACHID)
		this.setDataAddress(AddressID)
		this.setDataEmailAndPhone(EmailPhoneID)
		this.setDataUDF(UDFID)
		this.setDataCCDate(ccDate)
		this.selectCheckboxStoredPaymentMethod()
		this.selectCheckboxACHTANDC()
		this.selectContinueButton()
	}


	@Keyword
	def getDataCompanyNameID(String NameIDG) {

		def dataFileCardName = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "NameData", true)

		def numOfRowsCardName = dataFileCardName.getRowNumbers()

		for (def row = 1; row <= numOfRowsCardName; row++) {


			def ID = dataFileCardName.getValue("ID", row)

			if (ID.equals(NameIDG)) {
				companyName = dataFileCardName.getValue("CompanyName", row)
			}
		}
	}


	@Keyword
	def setDataCompanyNameID(String NameIDS) {

		this.getDataCompanyNameID(NameIDS)

		if(!companyName.isEmpty()) {

			WebUI.setText(findTestObject(pathOR+'input_billingCompanyname'),companyName)
		}
	}

	def getDataACH(String ACHIDG) {
		def dataFileACHData = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "ACHData", true)

		def numOfRowsACHData = dataFileACHData.getRowNumbers()

		for (def row = 1; row <= numOfRowsACHData; row++) {


			def ID = dataFileACHData.getValue("ID", row)
			println(ID+ACHIDG)

			if (ID.equals(ACHIDG)) {
				routingTransitNumber = dataFileACHData.getValue("RoutingNumber", row)
				accountNumber = dataFileACHData.getValue("AccountNumber", row)
				confirmAccountNumber = dataFileACHData.getValue("ConfirmAccountNumber", row)
				EIN = dataFileACHData.getValue("EIN", row)
			}
		}
	}
	@Keyword
	def setDataACH(String ACHIDS) {

		this.getDataACH(ACHIDS)

		if ((!routingTransitNumber.isEmpty())) {
			WebUI.setText(findTestObject(pathOR+'input_routingNumber'),routingTransitNumber)
		}
		if ((!accountNumber.isEmpty())) {
			WebUI.setText(findTestObject(pathOR+'input_accountNumber'),accountNumber)
		}
		if ((!confirmAccountNumber.isEmpty())) {
			WebUI.setText(findTestObject(pathOR+'input_confirmAccountNumber'),confirmAccountNumber)
		}

		if((!EIN.isEmpty())) {

			WebUI.setText(findTestObject(pathOR+'input_EIN'),EIN)
		}
	}

	@Keyword
	def getDataAddress(String AddressIDG) {

		def dataFileAddress = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "AddressData", true)

		def numOfRowsAddress = dataFileAddress.getRowNumbers()

		for (def row = 1; row <= numOfRowsAddress; row++) {

			def ID = dataFileAddress.getValue("ID", row)

			if (ID.equals(AddressIDG)) {

				AL1 = dataFileAddress.getValue("AL1", row)
				AL2 = dataFileAddress.getValue("AL2", row)
				ZIP = dataFileAddress.getValue("ZIP", row)
			}
		}
	}



	@Keyword
	def setDataAddress(String AddressIDS) {

		this.getDataAddress(AddressIDS)

		if ((!AL1.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'input_billingAddress'),AL1)
		}


		if ((!AL2.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'input_billingAddress2'),AL2)
		}


		if ((!ZIP.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'input_billingZip'),ZIP)
		}
	}

	//****************************************************************************************


	//****************************************************************************************
	@Keyword
	def getDataEmailAndPhone(String EmailPhoneIDG) {

		def dataFileEmailPhone = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "EmailAndPhoneData", true)

		def numOfRowsEmailPhone = dataFileEmailPhone.getRowNumbers()

		for (def row = 1;row<=numOfRowsEmailPhone;row++) {

			def ID = dataFileEmailPhone.getValue("ID", row)

			if (ID.equals(EmailPhoneIDG)) {
				email = dataFileEmailPhone.getValue("Email", row)
				phone = dataFileEmailPhone.getValue("Phone", row)
			}
		}
	}

	@Keyword
	def setDataEmailAndPhone(String EmailPhoneIDS) {

		this.getDataEmailAndPhone(EmailPhoneIDS)

		if(!email.isEmpty()) {

			WebUI.setText(findTestObject(pathOR + 'input_emailAddress'), email)
		}
		if(!phone.isEmpty()) {

			WebUI.setText(findTestObject(pathOR + 'input_emailAddress'), phone)
		}
	}

	//**************************************************************************************



	//**************************************************************************************

	@Keyword
	def setDataAmount(String AmountS) {
		amount = AmountS

		if ((!amount.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'input_amount'),amount)
		}
	}

	//****************************************************************************************

	@Keyword

	def setDataCCDate(String ccDateS) {
		ccDate = ccDateS
		if(!ccDate.isEmpty()) {
			//This js script is written to set the future date
			String js = '''
	 document.getElementById('processDate').value = '12/31/2026'
	 '''
			WebUI.executeJavaScript(js, null)
		}
		else {
			println("CCDate is not present in the Excel Spreadsheet")
		}
	}

	//*****************************************************************************************

	@Keyword
	def getDataUDF(String UDFG) {

		def dataFileUDF = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "UDFData", true)
		def numOfRowsUDF = dataFileUDF.getRowNumbers()

		for (def row = 1 ; row<=numOfRowsUDF ;row++) {

			def ID = dataFileUDF.getValue("ID", row)

			if(ID.equals(UDFG)) {
				udf1 =dataFileUDF.getValue("UDF1", row)
				udf2 =dataFileUDF.getValue("UDF2", row)
				udf3 =dataFileUDF.getValue("UDF3", row)
				udf4 =dataFileUDF.getValue("UDF4", row)
				udf5 =dataFileUDF.getValue("UDF5", row)
				udf6 =dataFileUDF.getValue("UDF6", row)
				udf7 =dataFileUDF.getValue("UDF7", row)
				udf8 =dataFileUDF.getValue("UDF8", row)
				udf9 =dataFileUDF.getValue("UDF9", row)
				udf10 =dataFileUDF.getValue("UDF10",row)
			}
		}
	}

	@Keyword
	def setDataUDF(String UDFS) {

		this.getDataUDF(UDFS)

		if(!udf2.isEmpty()) {

			WebUI.setText(findTestObject(pathOR + 'input_userDefined2'), udf2)
		}

		if(!udf2.isEmpty()) {

			WebUI.setText(findTestObject(pathOR + 'input_userDefined3'), udf3)
		}

		if(!udf7.isEmpty()) {

			WebUI.selectOptionByLabel(findTestObject(pathOR+'select_userDefined7'), udf7, false)
		}
		if(!udf8.isEmpty()) {

			WebUI.selectOptionByLabel(findTestObject(pathOR+'select_userDefined8'), udf8, false)
		}
	}

	//***********************************************************************************************


	//***********************************************************************************************

	@Keyword
	def selectCheckboxStoredPaymentMethod() {

		WebUI.check(findTestObject(pathOR+'input_achSavePaymentMethod'))
	}

	//**********************************************************************************************

	//**********************************************************************************************

	@Keyword
	def selectCheckboxACHTANDC() {

		WebUI.check(findTestObject(pathOR+'input_checkedAcceptCondition'))
	}

	//**********************************************************************************************


	//**********************************************************************************************

	@Keyword
	def selectContinueButton() {

		WebUI.click(findTestObject(pathOR+'input_Continue'))
	}

	//*********************************************************************************************

	//*********************************************************************************************

	@Keyword
	def selectChangePaymentMethodButton() {

		WebUI.click(findTestObject(pathOR+'input_changePaymentMethodButton'))
	}
}


