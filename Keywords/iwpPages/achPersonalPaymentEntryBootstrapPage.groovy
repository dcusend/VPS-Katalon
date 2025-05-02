package iwpPages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testdata.reader.ExcelFactory.getExcelDataWithDefaultSheet
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static org.assertj.core.api.Assertions.assertThatIllegalStateException

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import bsh.This
import internal.GlobalVariable

public class achPersonalPaymentEntryBootstrapPage {

	def firstName,lastName,routingTransitNumber,typeOfAccount,accountNumber,confirmAccountNumber, AL1, AL2, ZIP, email, phone, amount, appID
	def udf1, udf2, udf3, udf4, udf5, udf6, udf7, udf8, udf9, udf10,ccDate

	String pathSharedData = "KatalonData/IWPBootstrapData/NormalizedSharedData.xlsx"
	String pathOR = "Object Repository/IWP_Bootstrap/Page_PaymentEntryPersonal_Bootstrap/"
	String nameID,ACHID,EmailPhoneID,AddressID,AmountS, UDFID



	@Keyword
	def setDataACHMain(nameID,ACHID,EmailPhoneID,AddressID,AmountS, UDFID) {
		this.setFirstNameLastName(nameID)
		this.setACHData(ACHID)
		this.setAddressData(AddressID)
		this.setEmailAndPhoneData(EmailPhoneID)
		this.setUDFData(UDFID)
		this.selectCheckboxStoredPaymentMethod()
		this.selectCheckboxACHTANDC()
		this.selectContinueButton()
	}

	@Keyword
	def setDataACHDefferedMain(nameID,ACHID,EmailPhoneID,AddressID,AmountS, UDFID,ccDate) {
		this.setFirstNameLastName(nameID)
		this.setACHData(ACHID)
		this.setAddressData(AddressID)
		this.setEmailAndPhoneData(EmailPhoneID)
		this.setUDFData(UDFID)
		this.setDataCCDate(ccDate)
		this.selectCheckboxStoredPaymentMethod()
		this.selectCheckboxACHTANDC()
		this.selectContinueButton()
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
			WebUI.setText(findTestObject(pathOR+'input_billingFirstname'),firstName)
		}
		if ((!lastName.isEmpty())) {
			WebUI.setText(findTestObject(pathOR+'input_billingLastname'),lastName)
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
			WebUI.setText(findTestObject(pathOR+'input_routingNumber'),routingTransitNumber)
		}
		if ((!accountNumber.isEmpty())) {
			WebUI.setText(findTestObject(pathOR+'input_accountNumber'),accountNumber)
		}

		if(!typeOfAccount.isEmpty()) {

			if(typeOfAccount.equals("2")) {
				def typeOfAccountName = "Saving"

				WebUI.click(findTestObject(pathOR+'input_Saving_accountType'))
			}else if (typeOfAccount.equals("1")) {

				def typeOfAccountName = "Checking"

				WebUI.click(findTestObject(pathOR+'input_Checking_accountType'))
			}
		}
		else {
			System.out.println("Type of account is empty.Please provide the value and try to rerun")
			KeywordUtil.logInfo("Type of account is empty.Please provide the value and try to rerun")
		}

		if ((!confirmAccountNumber.isEmpty())) {
			WebUI.setText(findTestObject(pathOR+'input_confirmAccountNumber'),confirmAccountNumber)
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

			WebUI.setText(findTestObject(pathOR + 'input_emailAddress'), email)
		}
		if(!phone.isEmpty()) {

			/*WebUI.setText(findTestObject(pathOR + 'input_emailAddress'), phone)*/
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
	def getDataACHPPMEF(int rowM, dataFileM) {

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

		firstName = dataFileM.getValue('Fname', rowM)
		println(firstName)

		lastName = dataFileM.getValue('Lname', rowM)
		println(lastName)

		routingTransitNumber = dataFileM.getValue('RTN', rowM)
		println(routingTransitNumber)

		accountNumber = dataFileM.getValue('ACNumber', rowM)
		println(accountNumber)

		confirmAccountNumber = dataFileM.getValue('CACNumber', rowM)
		println(confirmAccountNumber)

		typeOfAccount = dataFileM.getValue('ACType', rowM)
		println(typeOfAccount)

		ccDate = dataFileM.getValue('CCDate', rowM)
		println(Date)

		AL1 = dataFileM.getValue('AL1', rowM)
		println(AL1)

		AL2 = dataFileM.getValue('AL2', rowM)
		println(AL2)

		ZIP = dataFileM.getValue('ZIP', rowM)
		println(ZIP)

		email = dataFileM.getValue('Email', rowM)
		println(email)
		
		appID = dataFileM.getValue('AppID', rowM)
		
		println(appID)

		//		CCDate = dataFileM.getValue('CCDate', rowM)
		//
		//		println(CCDate)

		// End of getData
	}


	@Keyword
	def setDataACHPPM(int rowS, dataFileS) {


		def String datafile_class = dataFileS.getClass()
		if(datafile_class.contains('com.kms.katalon.core.testdata.reader.SheetPOI')) {
			this.getDataACHPPMEF(rowS, dataFileS)
		}


		// Verify if we are on ACH Personal Payment Entry page and populate the page

		if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_accountNumber'), 30)) {

			println("We are on ACH Personal Payment Entry page, start populating")



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Amount'),30)) {
			if ((!amount.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Amount'),amount)
			}
			else {
				println("Amount is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("Amount field is either missing or not modifiable on ACH Personal Payment Entry Page")
			//			}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/DisplayConvFees/Page_DataEntryPage/input_UDF2_userDefined2'),30)) {
				if ((!udf2.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/DisplayConvFees/Page_DataEntryPage/input_UDF2_userDefined2'),udf2)
				}
				else {
					println("UDF2 is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("UDF2 field is either missing or not modifiable on ACH Personal Payment Entry Page")
			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_UDF3'),30)) {
			if ((!udf3.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_UDF3'),udf3)
			}
			else {
				println("UDF3 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF3 field is either missing or not modifiable on ACH Personal Payment Entry Page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/dd_UDF7'),30)) {
			if ((!udf7.isEmpty())) {
				WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/dd_UDF7'),udf7, false)
			}
			else {
				println("UDF7 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF7 field is either missing or not modifiable on ACH Personal Payment Entry Page")
			//			}


			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/dd_UDF8'),30)) {
			if ((!udf8.isEmpty())) {
				WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/dd_UDF8'),udf8, false)
			}
			else {
				println("UDF8 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF8 field is either missing or not modifiable on ACH Personal Payment Entry Page")
			//			}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Firstname'),30)) {
				if ((!firstName.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Firstname'),firstName)
				}
				else {
					println("First Name is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("First Name field is either missing or not modifiable on ACH Personal Payment Entry Page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Lastname'),30)) {
				if ((!lastName.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Lastname'),lastName)
				}
				else {
					println("Last Name is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Last Name field is either missing or not modifiable on ACH Personal Payment Entry Page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_routingNumber'),30)) {
				if ((!routingTransitNumber.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_routingNumber'),routingTransitNumber)
				}
				else {
					println("RTN is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("RTN field is either missing or not modifiable on ACH Personal Payment Entry Page")
			}


			if(appID == '914' || appID == '915') {
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
			else if(appID == '920' || appID == '921') {
				if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_accountNumber'),30)) {
					if ((!accountNumber.isEmpty())) {
						WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_accountNumber'),accountNumber)
					}
					else {
						println("Account Number is not present in the Excel Spreadsheet")
					}
				}
				else {
					println("Account Number field is either missing or not modifiable on ACH Personal Payment Entry Page")
				}
	
	
	
				if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_confirmAccountNumber'),30)) {
					if ((!confirmAccountNumber.isEmpty())) {
						WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_confirmAccountNumber'),confirmAccountNumber)
					}
					else {
						println("Confirm Account Number is not present in the Excel Spreadsheet")
					}
				}
				else {
					println("Confirm Account Number field is either missing or not modifiable on ACH Personal Payment Entry Page")
				}
	
	
			}
		



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/rd_accountType'),30)) {
				if ((!typeOfAccount.isEmpty())) {
					println(typeOfAccount)
					if (typeOfAccount == '1'){
						// select Checking
						println(typeOfAccount)

						def accountTypeChecking = WebUI.modifyObjectProperty(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/rd_accountType'),'value','equals',"1",true)
						println(accountTypeChecking)
						WebUI.click(accountTypeChecking)
					}
					else if (typeOfAccount == '2'){
						// Select Savings
						def accountTypeSaving = WebUI.modifyObjectProperty(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/rd_accountType'),'value','equals',"2",true)
						WebUI.click(accountTypeSaving)
					}
					else {
						println("ACType data must be either 1 or 2")
					}
				}
				else {
					println("Account Type is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Account Type field is either missing or not modifiable on ACH Personal Payment Entry Page")
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

			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_AL1'),30)) {
			if ((!AL1.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_AL1'),AL1)
			}
			else {
				println("AL1 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("AL1 field is either missing or not modifiable on ACH Personal Payment Entry Page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_AL2'),30)) {
			if ((!AL2.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_AL2'),AL2)
			}
			else {
				println("AL2 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("AL2 field is either missing or not modifiable on ACH Personal Payment Entry Page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_ZIP'),30)) {
			if ((!ZIP.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_ZIP'),ZIP)
			}
			else {
				println("ZIP is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("ZIP field is either missing or not modifiable on ACH Personal Payment Entry Page")
			//			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Email'),30)) {
				if ((!email.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Email'),email)
				}
				else {
					println("Email is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Email field is either missing or not modifiable on ACH Personal Payment Entry Page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/cb_TermsAndCond'),30)) {
				WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/cb_TermsAndCond'))
			}
			else {
				println("Terms and Conditions field is either missing or not modifiable on ACH Personal Payment Entry Page")
			}



			// Select the Continue button
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/btn_Continue'),30)) {
				WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/btn_Continue'))
			}
			else {
				println("Continue field is either missing or not modifiable on ACH Personal Payment Entry Page")
			}
		}

		else {
			println("Not on ACH Personal Payment Entry Page")
		}

		// End of SetData
	}
}
