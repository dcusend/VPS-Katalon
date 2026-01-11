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
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.testdata.reader.ExcelFactory

import internal.GlobalVariable

public class achPersonalPaymentEntryBootstrapPage {

	def firstName,lastName,routingTransitNumber,typeOfAccount,accountNumber,confirmAccountNumber, AL1, AL2, ZIP, email, phone, amount, appID
	def udf1, udf2, udf3, udf4, udf5, udf6, udf7, udf8, udf9, udf10,ccDate

	String pathSharedData = "KatalonData/BWPBootstrapData/NormalizedSharedData.xlsx"
	String pathOR = "Object Repository/BWP_Bootstrap/Page_ACHPersonalPaymentEntry/"
	String nameID,ACHID,EmailPhoneID,AddressID,AmountS, UDFID

	@Keyword
	def setDataACHMain(nameID,ACHID,EmailPhoneID,AddressID,AmountS, UDFID, AppID) {
		appID = AppID
		this.setFirstNameLastName(nameID)
		this.setACHData(ACHID)
		this.setAddressData(AddressID)
		this.setEmailAndPhoneData(EmailPhoneID)
		this.setUDFData(UDFID)
		//		this.selectCheckboxStoredPaymentMethod()

		//Dont check the checkbox on MissingReqFields testcase
		if(ACHID != '7') {
			this.selectCheckboxACHTANDC()
		}
		this.selectContinueButton()
	}
	
	
	@Keyword
	def setDataACHMainWithoutCheckboxAndSubmit(nameID,ACHID,EmailPhoneID,AddressID,AmountS, UDFID, AppID) {
		appID = AppID
		this.setFirstNameLastName(nameID)
		this.setACHData(ACHID)
		this.setAddressData(AddressID)
		this.setEmailAndPhoneData(EmailPhoneID)
		this.setUDFData(UDFID)

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
			WebUI.setText(findTestObject(pathOR+ 'txt_FirstName'),firstName)
		}
		if ((!lastName.isEmpty())) {
			WebUI.setText(findTestObject(pathOR+ 'txt_LastName'),lastName)
		}
	}
	//*********************************************************************************************

	/*GetData and SetData for Address like AL1, AL2 and ZIP
	 Takes the argument for Address ID and queries NormalizedSharedData spreadsheet for Address Data*/


	//*********************************************************************************************
	def getACHData(String ACHIDG) {
		def dataFileACHData = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "ACHData", true)

		def numOfRowsACHData = dataFileACHData.getRowNumbers()

		for (def row = 1; row <= numOfRowsACHData; row++) {


			def ID = dataFileACHData.getValue("ID", row)
			println(ID+ACHIDG)

			if (ID.equals(ACHIDG)) {
				routingTransitNumber = dataFileACHData.getValue("RoutingNumber", row)
				typeOfAccount = dataFileACHData.getValue("TypeOfAccount", row)
				accountNumber = dataFileACHData.getValue("AccountNumber", row)
				confirmAccountNumber = dataFileACHData.getValue("ConfirmAccountNumber", row)
			}
		}
	}
	@Keyword
	def setACHData(String ACHIDS) {

		this.getACHData(ACHIDS)

		if ((!routingTransitNumber.isEmpty())) {
			WebUI.setText(findTestObject(pathOR+ 'txt_routingNumber'),routingTransitNumber)
		}

		if ((!accountNumber.isEmpty())) {
			if(appID == '951') {
				WebUI.setText(findTestObject(pathOR + 'txt_accountNumber_password'),accountNumber)
				WebUI.delay(2)
			}
			else {
				WebUI.setText(findTestObject(pathOR + 'txt_accountNumber'),accountNumber)
			}
		}

		if(!typeOfAccount.isEmpty()) {

			if(typeOfAccount.equals("2")) {
				def typeOfAccountName = "Saving"

				WebUI.click(findTestObject(pathOR + 'rd_AccountType_Savings'))
			}else if (typeOfAccount.equals("1")) {

				def typeOfAccountName = "Checking"

				WebUI.click(findTestObject(pathOR+ 'rd_AccountType_Checking'))
			}
		}
		else {
			System.out.println("Type of account is empty.Please provide the value and try to rerun")
			KeywordUtil.logInfo("Type of account is empty.Please provide the value and try to rerun")
		}

		if ((!confirmAccountNumber.isEmpty())) {
			if(appID == '951') {
				WebUI.setText(findTestObject(pathOR+ 'txt_confirmAccountNumber_password'),confirmAccountNumber)
				WebUI.delay(2)
			}
			else {
				WebUI.setText(findTestObject(pathOR+ 'txt_confirmAccountNumber'),confirmAccountNumber)
			}
		}
	}
	@Keyword
	def getAddressData(String AddressIDG) {

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
	def setAddressData(String AddressIDS) {

		this.getAddressData(AddressIDS)

		if ((!AL1.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'txt_AL1'),AL1)
		}


		if ((!AL2.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'txt_AL2'),AL2)
		}


		if ((!ZIP.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'ZIP'),ZIP)
		}
	}

	//****************************************************************************************


	//****************************************************************************************
	@Keyword
	def getEmailAndPhoneData(String EmailPhoneIDG) {

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
	def setEmailAndPhoneData(String EmailPhoneIDS) {

		this.getEmailAndPhoneData(EmailPhoneIDS)

		if(!email.isEmpty()) {
			if(appID == '951' || appID == '952') {
			}
			else {
				WebUI.setText(findTestObject(pathOR + 'input_emailAddress'), email)
			}
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


	//*****************************************************************************************

	@Keyword
	def getUDFData(String UDFG) {

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
	def setUDFData(String UDFS) {

		this.getUDFData(UDFS)

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

	//***********************************************************************************************
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

	//***********************************************************************************************

	@Keyword
	def selectCheckboxStoredPaymentMethod() {

		WebUI.check(findTestObject(pathOR+'input_achSavePaymentMethod'))
	}

	//**********************************************************************************************

	//**********************************************************************************************

	@Keyword
	def selectCheckboxACHTANDC() {

		WebUI.check(findTestObject(pathOR + 'TermConditionCheckbox'))
	}

	//**********************************************************************************************


	//**********************************************************************************************

	@Keyword
	def selectContinueButton() {

		WebUI.click(findTestObject(pathOR + 'btn_Continue'))
	}

	//*********************************************************************************************

	//*********************************************************************************************

	@Keyword
	def selectChangePaymentMethodButton() {

		WebUI.click(findTestObject(pathOR+'input_changePaymentMethodButton'))
	}


	//*********************************************************************************************

	//*********************************************************************************************
}
