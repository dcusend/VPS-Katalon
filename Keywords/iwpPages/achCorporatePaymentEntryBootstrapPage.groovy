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



	def companyName,routingTransitNumber,accountNumber,confirmAccountNumber,EIN, AL1, AL2, ZIP, email, phone, amount, appID
	def udf1, udf2, udf3, udf4, udf5, udf6, udf7, udf8, udf9, udf10,ccDate, MV

	String pathSharedData = "KatalonData/IWPBootstrapData/NormalizedSharedData.xlsx"
	String pathOR = "Object Repository/IWP_Bootstrap/Page_PaymentEntryCorporate_Bootstrap/"
	String nameID,ACHID,EmailPhoneID,AddressID,AmountS, udfID



	@Keyword
	def setDataACHMain(nameID,ACHID,EmailPhoneID,AddressID,AmountS, udfID) {
		this.setDataCompanyNameID(nameID)
		this.setDataACH(ACHID)
		this.setDataAddress(AddressID)
		this.setDataEmailAndPhone(EmailPhoneID)
		this.setDataudf(udfID)
		this.selectCheckboxStoredPaymentMethod()
		this.selectCheckboxACHTANDC()
		this.selectContinueButton()
	}

	@Keyword
	def setDataACHDefferedMain(nameID,ACHID,EmailPhoneID,AddressID,AmountS, udfID,ccDate) {
		this.setDataCompanyNameID(nameID)
		this.setDataACH(ACHID)
		this.setDataAddress(AddressID)
		this.setDataEmailAndPhone(EmailPhoneID)
		this.setDataudf(udfID)
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
	def getDataudf(String udfG) {

		def dataFileudf = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "udfData", true)
		def numOfRowsudf = dataFileudf.getRowNumbers()

		for (def row = 1 ; row<=numOfRowsudf ;row++) {

			def ID = dataFileudf.getValue("ID", row)

			if(ID.equals(udfG)) {
				udf1 =dataFileudf.getValue("UDF1", row)
				udf2 =dataFileudf.getValue("UDF2", row)
				udf3 =dataFileudf.getValue("UDF3", row)
				udf4 =dataFileudf.getValue("UDF4", row)
				udf5 =dataFileudf.getValue("UDF5", row)
				udf6 =dataFileudf.getValue("UDF6", row)
				udf7 =dataFileudf.getValue("UDF7", row)
				udf8 =dataFileudf.getValue("UDF8", row)
				udf9 =dataFileudf.getValue("UDF9", row)
				udf10 =dataFileudf.getValue("UDF10",row)
			}
		}
	}

	@Keyword
	def setDataudf(String udfS) {

		this.getDataudf(udfS)

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


	//*********************************************************************************************

	//*********************************************************************************************




	@Keyword
	def getDataCorporateEF(int rowM, dataFileM) {

		companyName = dataFileM.getValue('CompanyName', rowM)
		println(companyName)

		EIN = dataFileM.getValue('EIN', rowM)
		println(EIN)

		amount = dataFileM.getValue('Amount', rowM)
		println(amount)

		udf1 = dataFileM.getValue('UDF1', rowM)
		println(udf1)

		udf2 = dataFileM.getValue('UDF2', rowM)
		println(udf2)

		udf3 = dataFileM.getValue('UDF3', rowM)
		println(udf3)

		udf4 = dataFileM.getValue('UDF4', rowM)
		println(udf4)

		udf5 = dataFileM.getValue('UDF5', rowM)
		println(udf5)

		udf6 = dataFileM.getValue('UDF6', rowM)
		println(udf6)

		udf7 = dataFileM.getValue('UDF7', rowM)
		println(udf7)

		udf8 = dataFileM.getValue('UDF8', rowM)
		println(udf8)

		udf9 = dataFileM.getValue('UDF9', rowM)
		println(udf9)

		udf10 = dataFileM.getValue('UDF10', rowM)
		println(udf10)

		routingTransitNumber = dataFileM.getValue('RTN', rowM)
		println(routingTransitNumber)

		accountNumber = dataFileM.getValue('ACNumber', rowM)
		println(accountNumber)

		confirmAccountNumber = dataFileM.getValue('CACNumber', rowM)
		println(confirmAccountNumber)

		ccDate = dataFileM.getValue('CCDate', rowM)
		println(ccDate)

		AL1 = dataFileM.getValue('AL1', rowM)
		println(AL1)

		AL2 = dataFileM.getValue('AL2', rowM)
		println(AL2)

		ZIP = dataFileM.getValue('ZIP', rowM)
		println(ZIP)

		email = dataFileM.getValue('Email', rowM)
		println(email)

		MV = dataFileM.getValue('MessageVersion', rowM)
		println(MV)

		appID = dataFileM.getValue('AppID', rowM)
		println(appID)
		// End of getData
	}




	@Keyword
	def setDataCorporate(int rowS, dataFileS) {

		def String datafile_class = dataFileS.getClass()
		if(datafile_class.contains('com.kms.katalon.core.testdata.reader.SheetPOI')) {
			this.getDataCorporateEF(rowS, dataFileS)
		}



		// Verify if we are on ACH Corporate Payment Entry page and populate the page

		if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_accountNumber'), 30)) {

			println("We are on ACH Corporate Payment Entry page, start populating")

			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/input_CompanyName'),30)) {
				if ((!companyName.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/input_CompanyName'),companyName)
				}
				else {
					println("CompanyName is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("CompanyName field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			}

			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/input_EIN'),30)) {
				if ((!EIN.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/input_EIN'),EIN)
				}
				else {
					println("EIN is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("EIN field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_Amount'),30)) {
			//				if ((!Amount.isEmpty())) {
			//					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_Amount'),Amount)
			//				}
			//				else {
			//					println("Amount is not present in the Excel Spreadsheet")
			//				}
			//			}
			//			else {
			//				println("Amount field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_Amount'),30)) {
			if ((!amount.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_Amount'),amount)
			}
			else {
				println("Amount is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("Amount field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_udf2'),30)) {
			if ((!udf2.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_udf2'),udf2)
			}
			else {
				println("udf2 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("udf2 field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_udf3'),30)) {
			if ((!udf3.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_udf3'),udf3)
			}
			else {
				println("udf3 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("udf3 field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			//			}


			if (MV != "2.3") {

				//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/dd_udf7'),30)) {
				if ((!udf7.isEmpty())) {
					WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/dd_udf7'),udf7, false)
				}
				else {
					println("udf7 is not present in the Excel Spreadsheet")
				}
				//			}
				//			else {
				//				println("udf7 field is either missing or not modifiable on ACH Corporate Payment Entry Page")
				//			}



				//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/dd_udf8'),30)) {
				if ((!udf8.isEmpty())) {
					WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/dd_udf8'),udf8, false)
				}
				else {
					println("udf8 is not present in the Excel Spreadsheet")
				}
				//			}
				//			else {
				//				println("udf8 field is either missing or not modifiable on ACH Corporate Payment Entry Page")
				//			}
			}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_routingNumber'),30)) {
				if ((!routingTransitNumber.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_routingNumber'),routingTransitNumber)
				}
				else {
					println("RTN is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("RTN field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			}


			if(appID == '914' || appID == '915' || appID == '937' || appID == '939' ) {
				if (WebUI.verifyElementPresent(findTestObject('Object Repository/DisplayConvFees/Page_DataEntryPage/input__accountNumber'),30)) {
					println(accountNumber)
					if ((!accountNumber.isEmpty())) {
						println(accountNumber)
						WebUI.setText(findTestObject('Object Repository/DisplayConvFees/Page_DataEntryPage/input__accountNumber'),accountNumber)
						Thread.sleep(2000)
					}
					else {
						println("Account Number is not present in the Excel Spreadsheet")
					}
				}
				else {
					println("Account Number field is either missing or not modifiable on ACH Corporate Payment Entry Page")
				}



				if (WebUI.verifyElementPresent(findTestObject('Object Repository/DisplayConvFees/Page_DataEntryPage/input__confirmAccountNumber'),30)) {
					println(accountNumber)
					if ((!confirmAccountNumber.isEmpty())) {
						println(accountNumber)
						WebUI.setText(findTestObject('Object Repository/DisplayConvFees/Page_DataEntryPage/input__confirmAccountNumber'),confirmAccountNumber)
						Thread.sleep(2000)
					}
					else {
						println("Confirm Account Number is not present in the Excel Spreadsheet")
					}
				}
				else {
					println("Confirm Account Number field is either missing or not modifiable on ACH Corporate Payment Entry Page")
				}
			}
			else if(appID == '920' || appID == '921' || appID == '936' || appID == '938' || appID == '944') {
				if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_accountNumber'),30)) {
					if ((!accountNumber.isEmpty())) {
						WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_accountNumber'),accountNumber)
					}
					else {
						println("Account Number is not present in the Excel Spreadsheet")
					}
				}
				else {
					println("Account Number field is either missing or not modifiable on ACH Corporate Payment Entry Page")
				}



				if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_confirmAccountNumber'),30)) {
					if ((!confirmAccountNumber.isEmpty())) {
						WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_confirmAccountNumber'),confirmAccountNumber)
					}
					else {
						println("Confirm Account Number is not present in the Excel Spreadsheet")
					}
				}
				else {
					println("Confirm Account Number field is either missing or not modifiable on ACH Corporate Payment Entry Page")
				}
			}



			if ((!ccDate.isEmpty())) {
				//This js script is written to set the future date
				String js = '''
				   document.getElementById('processDate').value = '08/09/2025'
				  '''
				WebUI.executeJavaScript(js, null)
			}
			else {
				println("CCDate is not present in the Excel Spreadsheet")
			}


			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_AL1'),30)) {
			if ((!AL1.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_AL1'),AL1)
			}
			else {
				println("AL1 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("AL1 field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			//			}


			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_AL2'),30)) {
			if ((!AL2.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_AL2'),AL2)
			}
			else {
				println("AL2 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("AL2 field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_ZIP'),30)) {
			if ((!ZIP.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_ZIP'),ZIP)
			}
			else {
				println("ZIP is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("ZIP field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			//			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_Email'),30)) {
				if ((!email.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_Email'),email)
				}
				else {
					println("Email is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Email field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/cb_TermsAndCond'),30)) {
				WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/cb_TermsAndCond'))
			}
			else {
				println("Terms and Conditions field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			}

			Thread.sleep(10000)


			// Select the Continue button
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/btn_Continue'),30)) {
				WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/btn_Continue'))
			}
			else {
				println("Continue field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			}
		}

		else {
			println("Not on ACH Corporate Payment Entry Page")
		}

		// End of SetData
	}
}


