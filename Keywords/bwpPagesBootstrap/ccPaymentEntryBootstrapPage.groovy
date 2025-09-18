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

import com.kms.katalon.core.testdata.reader.ExcelFactory

import internal.GlobalVariable

public class ccPaymentEntryBootstrapPage {

	def cardholderName, cardNumber, cvv, expMM, expYYYY, AL1, AL2, ZIP, email, phone, amount, appID
	def udf1, udf2, udf3, udf4, udf5, udf6, udf7, udf8, udf9, udf10 ,ccDate

	String pathSharedData = "KatalonData/BWPBootstrapData/NormalizedSharedData.xlsx"
	String pathOR = "Object Repository/BWP_Bootstrap/Page_CCPaymentEntry/"


	@Keyword
	def setDataCCMain(nameID,CardID,EmailPhoneID,AddressID,AmountS, UDFID) {
		this.setDataCardName(nameID)
		this.setDataCardInfo(CardID)
		this.setDataCardAddress(AddressID)
		this.setDataCardEmailAndPhone(EmailPhoneID)
		this.setDataAmount(AmountS)
		this.setDataCardUDF(UDFID)
		this.selectCheckboxCCTerms()
		this.selectContinueButton()
	}

	//*********************************************************************************************

	/*GetData and SetData for Card Name
	 Takes the argument for Name ID and queries NormalizedSharedData spreadsheet for NameData*/


	//*********************************************************************************************

	@Keyword
	def getDataCardName(String nameIDG) {

		def dataFileCardName = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "NameData", true)

		def numOfRowsCardName = dataFileCardName.getRowNumbers()

		for (def row = 1; row <= numOfRowsCardName; row++) {


			def ID = dataFileCardName.getValue("ID", row)

			if (ID.equals(nameIDG)) {
				cardholderName = dataFileCardName.getValue("CardholderName", row)
			}
		}
	}



	@Keyword
	def setDataCardName(String nameIDS) {

		this.getDataCardName(nameIDS)

		if ((!cardholderName.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'Card_Name'),cardholderName)
		}
	}


	//*********************************************************************************************

	/*END*/


	//*********************************************************************************************





	//*********************************************************************************************

	/*GetData and SetData for Card Information like Card Number, CVV and Expiration Date
	 Takes the argument for Card ID and queries NormalizedSharedData spreadsheet for Card Data*/


	//*********************************************************************************************


	@Keyword
	def getDataCardInfo(String CardIDG) {

		def dataFileCardInfo = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "CardData", true)

		def numOfRowsCardInfo = dataFileCardInfo.getRowNumbers()

		for (def row = 1; row <= numOfRowsCardInfo; row++) {

			def ID = dataFileCardInfo.getValue("ID", row)

			if (ID.equals(CardIDG)) {

				cardNumber = dataFileCardInfo.getValue("CardNumber", row)
				cvv = dataFileCardInfo.getValue("CVV", row)
				expMM = dataFileCardInfo.getValue("ExpMM", row)
				expYYYY = dataFileCardInfo.getValue("ExpYYYY", row)
			}
		}
	}



	@Keyword
	def setDataCardInfo(String CardIDS) {
		this.getDataCardInfo(CardIDS)



		if ((!cardNumber.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'CardNumber'),cardNumber)
		}


		if ((!cvv.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'SPC'),cvv)
		}


		if ((!expMM.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject(pathOR + 'Month'),expMM,false)
		}


		if ((!expYYYY.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject(pathOR + 'Year'),expYYYY,false)
		}
	}



	//*********************************************************************************************

	/*END*/


	//*********************************************************************************************



	//*********************************************************************************************

	/*GetData and SetData for Address like AL1, AL2 and ZIP
	 Takes the argument for Address ID and queries NormalizedSharedData spreadsheet for Address Data*/


	//*********************************************************************************************


	@Keyword
	def getDataCardAddress(String AddressIDG) {

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
	def setDataCardAddress(String AddressIDS) {

		this.getDataCardAddress(AddressIDS)

		if ((!AL1.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'AL1'),AL1)
		}


		if ((!AL2.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'AL2'),AL2)
		}


		if ((!ZIP.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'ZIP'),ZIP)
		}
	}




	//*********************************************************************************************

	/*END*/

	//*********************************************************************************************



	//*********************************************************************************************

	/*GetData and SetData for Email and Phone Number
	 Takes the argument for EmailPhone ID and queries NormalizedSharedData spreadsheet for EmailAndPhone Data*/


	//*********************************************************************************************



	@Keyword
	def getDataCardEmailAndPhone(String EmailPhoneIDG) {

		def dataFileEmailPhone = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "EmailAndPhoneData", true)

		def numOfRowsEmailPhone = dataFileEmailPhone.getRowNumbers()

		for (def row = 1; row <= numOfRowsEmailPhone; row++) {

			def ID = dataFileEmailPhone.getValue("ID", row)

			if (ID.equals(EmailPhoneIDG)) {

				email = dataFileEmailPhone.getValue("Email", row)
				//phone = dataFileEmailPhone.getValue("Phone", row)
			}
		}
	}



	@Keyword
	def setDataCardEmailAndPhone(String EmailPhoneIDS) {

		this.getDataCardEmailAndPhone(EmailPhoneIDS)

		if ((!email.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'input_emailAddress'),email)
		}
	}




	//*********************************************************************************************

	/*END*/

	//*********************************************************************************************




	//*********************************************************************************************

	/*SetData for Amount
	 Takes the argument for Dollar Amount and populates it in the Amount field*/


	//*********************************************************************************************


	@Keyword
	def setDataAmount(String AmountS) {
		amount = AmountS

		if ((!amount.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'Amount'),amount)
		}
	}



	//*********************************************************************************************

	/*END*/

	//*********************************************************************************************



	//*********************************************************************************************

	/*SetData for UDF 1 to 10
	 Takes the argument for UDF ID and queries NormalizedSharedData spreadsheet for UDF Data*/


	//*********************************************************************************************


	@Keyword
	def getDataCardUDF(String UDFIDG) {

		def dataFileUDF = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "UDFData", true)

		def numOfRowsUDF = dataFileUDF.getRowNumbers()


		for (def row = 1; row <= numOfRowsUDF; row++) {

			def ID = dataFileUDF.getValue("ID", row)

			if (ID.equals(UDFIDG)) {

				udf1 = dataFileUDF.getValue("UDF1", row)
				udf2 = dataFileUDF.getValue("UDF2", row)
				udf3 = dataFileUDF.getValue("UDF3", row)
				udf4 = dataFileUDF.getValue("UDF4", row)
				udf5 = dataFileUDF.getValue("UDF5", row)
				udf6 = dataFileUDF.getValue("UDF6", row)
				udf7 = dataFileUDF.getValue("UDF7", row)
				udf8 = dataFileUDF.getValue("UDF8", row)
				udf9 = dataFileUDF.getValue("UDF9", row)
				udf10 = dataFileUDF.getValue("UDF10", row)
			}
		}
	}



	@Keyword
	def setDataCardUDF(String UDFIDS) {
		this.getDataCardUDF(UDFIDS)

			if(!udf3.isEmpty()) {

				WebUI.setText(findTestObject(pathOR + 'txt_UDF3'), udf3)
			}

			if(!udf5.isEmpty()) {

				WebUI.setText(findTestObject(pathOR + 'txt_UDF5'), udf5)
			}

			if(!udf8.isEmpty()) {

				WebUI.selectOptionByLabel(findTestObject(pathOR + 'txt_UDF8'), udf8, false)
			}
			if(!udf9.isEmpty()) {

				WebUI.selectOptionByLabel(findTestObject(pathOR + 'txt_UDF9 '), udf9, false)
			}
	}

	//*********************************************************************************************

	/*END*/

	//*********************************************************************************************


	// placeholder for PaymentDate for Deferred

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


	// Select Store Payment Method checkbox
	@Keyword
	def selectCheckboxStorePaymentMethod() {
		WebUI.check(findTestObject(pathOR + 'input_ccSavePaymentMethod'))
	}


	// Select Customer CC Terms checkbox
	@Keyword
	def selectCheckboxCCTerms() {
		WebUI.check(findTestObject(pathOR + 'input_checkedAcceptCondition'))
	}


	// Select Continue button
		@Keyword
		def selectContinueButton() {

			WebUI.click(findTestObject(pathOR + 'input_Continue'))
		}

	// placeholder for selecting Change Payment Method button


	// placeholder for selecting Exit button
}
