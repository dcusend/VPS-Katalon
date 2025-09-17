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
import com.kms.katalon.core.testdata.reader.ExcelFactory
import internal.GlobalVariable

//*******************Created by @Komal Mishra***************************************************

public class PendingBillPage {

	def udf1, udf2, udf3, udf4,AL1,AL2,ZIP,State,cardNumber,cvv,expMM,expYYYY,firstName,lastName,nickName,
	routingTransitNumber,typeOfAccount,accountNumber,confirmAccountNumber,companyName,businessTaxID

	String pathSharedData = "KatalonData/ABPTestData/NormalizedSharedData.xlsx"
	String nameID,ACHID,AddressID,AmountS, UDFID

	@Keyword
	def checkToPayMethod() {
		WebUI.click(findTestObject('Object Repository/ABP/BillsLabelPage/checkbox_CheckToPay'))
	}

	@Keyword
	def clickPaymentsMethod() {
		WebUI.click(findTestObject('Object Repository/ABP/BillsLabelPage/a_PaymentMethods'))
	}

	@Keyword
	def clickBillsLabel() {
		WebUI.click(findTestObject('Object Repository/ABP/BillsLabelPage/a_BillsLabel'))
	}

	@Keyword
	def clickUserList() {
		WebUI.click(findTestObject('Object Repository/ABP/BillsLabelPage/a_UserList'))
	}

	@Keyword
	def selectPaymentMethodCC() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/BillsLabelPage/select_PaymentMethod'), "Credit Card", false)
	}

	@Keyword
	def selectPaymentMethodPersonalChecking() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/BillsLabelPage/select_PaymentMethod'), "Personal Checking", false)
	}
	@Keyword
	def selectPaymentMethodPersonalSavings() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/BillsLabelPage/select_PaymentMethod'), "Personal Savings", false)
	}
	@Keyword
	def selectPaymentMethodBusinessChecking() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/BillsLabelPage/select_PaymentMethod'), "Business Checking", false)
	}
	@Keyword
	def selectPaymentMethodCheck() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/BillsLabelPage/select_PaymentMethod'), "Check", false)
	}

	@Keyword
	def clickAccountProfile() {
		WebUI.click(findTestObject('Object Repository/ABP/BillsLabelPage/a_AccountProfile'))
	}

	@Keyword
	def clickSchedulePaymentIcon() {
		WebUI.click(findTestObject('Object Repository/ABP/BillsLabelPage/img_SchedulePaymentIcon'))
	}

	//*********************************************************************************************

	/*GetData and SetData for UDF like udf1, udf2 and udf4
	 Takes the argument for Address ID and queries NormalizedSharedData spreadsheet for Address Data*/


	//*********************************************************************************************

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

			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/input__UDF1'), udf1)
		}

		if(!udf2.isEmpty()) {

			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/input__UDF2'), udf2)
		}

		if(!udf4.isEmpty()) {

			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/input_UDF4'), udf4)
		}
	}

	//*********************************************************************************************

	/*GetData and SetData for Address like AL1, AL2 and ZIP
	 Takes the argument for Address ID and queries NormalizedSharedData spreadsheet for Address Data*/


	//*********************************************************************************************

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
			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/input_AddressLine1'),AL1)
		}


		if ((!AL2.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/input_AddressLine2'),AL2)
		}


		if ((!ZIP.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/input_ZipCode'),ZIP)
		}
	}

	//*********************************************************************************************

	/*GetData and SetData for Card Information like cardNumber, CVV and expiry Month & Year
	 Takes the argument for Address ID and queries NormalizedSharedData spreadsheet for Address Data*/


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
			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryCC/input_cardAccountNumber'),cardNumber)
		}


		if ((!cvv.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryCC/input_cvv'),cvv)
		}


		if ((!expMM.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryCC/select_Month'),expMM,false)
		}


		if ((!expYYYY.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryCC/select_Year'),expYYYY,false)
		}
	}

	def getPersonalACHData(String ACHIDG) {
		def dataFileACHData = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "ACHData", true)

		def numOfRowsACHData = dataFileACHData.getRowNumbers()

		for (def row = 1; row <= numOfRowsACHData; row++) {


			def ID = dataFileACHData.getValue("ID", row)
			println(ID+ACHIDG)

			if (ID.equals(ACHIDG)) {
				routingTransitNumber = dataFileACHData.getValue("RoutingNumber", row)
				accountNumber = dataFileACHData.getValue("AccountNumber", row)
				confirmAccountNumber = dataFileACHData.getValue("ConfirmAccountNumber", row)
			}
		}
	}
	@Keyword
	def setPersonalACHData(String ACHIDS) {

		this.getPersonalACHData(ACHIDS)

		if ((!routingTransitNumber.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryACHPersonal/input_routingNumber'),routingTransitNumber)
		}
		if ((!accountNumber.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryACHPersonal/input_AccountNumber'),accountNumber)
		}

		if ((!confirmAccountNumber.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryACHPersonal/input_ConfirmAccountNumber'),confirmAccountNumber)
		}
	}

	//*********************************************************************************************

	/*GetData and SetData for First and Last name
	 Takes the argument for Name ID and queries NormalizedSharedData spreadsheet for NameData*/

	//*********************************************************************************************
	@Keyword
	def getFirstNameLastName(String nameIDG) {
		def dataFileCardName = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "NameData", true)

		def numOfRowsCardName = dataFileCardName.getRowNumbers()

		for (def row = 1; row <= numOfRowsCardName; row++) {


			def ID = dataFileCardName.getValue("ID", row)

			if (ID.equals(nameIDG)) {
				firstName = dataFileCardName.getValue("FirstName", row)
				lastName = dataFileCardName.getValue("LastName", row)
			}
		}
	}
	@Keyword
	def setFirstNameLastName(String nameIDS) {

		this.getFirstNameLastName(nameIDS)

		if ((!firstName.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryACHPersonal/input_firstName'),firstName)
		}
		if ((!lastName.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryACHPersonal/input_lastName'),lastName)
		}
	}

	@Keyword
	def getDataCompanyNameID(String NameIDG) {

		println(NameIDG)

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

		println(NameIDS)

		this.getDataCompanyNameID(NameIDS)

		if(!companyName.isEmpty()) {

			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryCorporate/input_companyName'),companyName)
		}
	}

	def getDataACHCorp(String ACHIDG) {
		def dataFileACHData = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "ACHData", true)

		def numOfRowsACHData = dataFileACHData.getRowNumbers()

		for (def row = 1; row <= numOfRowsACHData; row++) {


			def ID = dataFileACHData.getValue("ID", row)
			println(ID+ACHIDG)

			if (ID.equals(ACHIDG)) {
				routingTransitNumber = dataFileACHData.getValue("RoutingNumber", row)
				accountNumber = dataFileACHData.getValue("AccountNumber", row)
				confirmAccountNumber = dataFileACHData.getValue("ConfirmAccountNumber", row)
				businessTaxID = dataFileACHData.getValue("EIN", row)
			}
		}
	}
	@Keyword
	def setDataACHCorp(String ACHIDS) {

		this.getDataACHCorp(ACHIDS)

		if ((!routingTransitNumber.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryACHPersonal/input_routingNumber'),routingTransitNumber)
		}
		if ((!accountNumber.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryACHPersonal/input_AccountNumber'),accountNumber)
		}

		if ((!confirmAccountNumber.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryACHPersonal/input_ConfirmAccountNumber'),confirmAccountNumber)
		}

		if((!businessTaxID.isEmpty())) {

			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryCorporate/input_BusinessTaxID'),businessTaxID)
		}
	}

	@Keyword
	def getDataNickNameID(String NameIDG) {

		def dataFileCardName = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "NameData", true)

		def numOfRowsCardName = dataFileCardName.getRowNumbers()

		for (def row = 1; row <= numOfRowsCardName; row++) {


			def ID = dataFileCardName.getValue("ID", row)

			if (ID.equals(NameIDG)) {
				nickName = dataFileCardName.getValue("NickName", row)
			}
		}
	}


	@Keyword
	def setDataNickNameID(String NameIDS) {

		this.getDataNickNameID(NameIDS)

		if(!nickName.isEmpty()) {

			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/input_NickName'),nickName)
		}
	}

	@Keyword
	def selectPaymentMethodNickName(String nickNameIDS) {
		println(nickName)
		this.getDataNickNameID(nickNameIDS)
		if(!nickName.isEmpty()) {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/BillsLabelPage/select_PaymentMethod'),nickName, false)
		}
	}

	@Keyword
	def uncheckSavePaymentMethod() {

		WebUI.uncheck(findTestObject('Object Repository/ABP/BillsLabelPage/checkbox_savePaymentMethod'))
	}

	@Keyword
	def clickNextButtonMethod() {

		WebUI.click(findTestObject('Object Repository/ABP/BillsLabelPage/input_Next'))
	}

	@Keyword
	def clickACHTermsConditionsButtonMethod() {

		WebUI.click(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryACHPersonal/input_ACHTermsConditions'))
	}
}



