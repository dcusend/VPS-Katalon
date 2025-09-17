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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import com.kms.katalon.core.testdata.reader.ExcelFactory

import internal.GlobalVariable

public class ccPaymentEntryBootstrapPage {

	def cardholderName, cardNumber, cvv, expMM, expYYYY, AL1, AL2, ZIP, email, phone, amount, appID
	def udf1, udf2, udf3, udf4, udf5, udf6, udf7, udf8, udf9, udf10 ,ccDate

	String pathSharedData = "KatalonData/IWPBootstrapData/NormalizedSharedData.xlsx"
	String pathOR = "Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/"



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
			WebUI.setText(findTestObject(pathOR + 'input_billingName'),cardholderName)
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
			WebUI.setText(findTestObject(pathOR + 'input_cardNumber'),cardNumber)
		}


		if ((!cvv.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'input_spc'),cvv)
		}


		if ((!expMM.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject(pathOR + 'select_MM'),expMM,false)
		}


		if ((!expYYYY.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject(pathOR + 'select_YYYY'),expYYYY,false)
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
			WebUI.setText(findTestObject(pathOR + 'input_billingAddress'),AL1)
		}


		if ((!AL2.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'input_billingAddress2'),AL2)
		}


		if ((!ZIP.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'input_billingZip'),ZIP)
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
			WebUI.setText(findTestObject(pathOR + 'input_amount'),amount)
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

		// populate only UDFs 2, 3, 7, 8 since they are the only ones modifiable

		if ((!udf2.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'input_userDefined2'),udf2)
		}


		if ((!udf3.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'input_userDefined3'),udf3)
		}


		if ((!udf7.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject(pathOR + 'select_userDefined7'),udf7,false)
		}


		if ((!udf8.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject(pathOR + 'select_userDefined8'),udf8,false)
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
	def selectButtonContinue() {
		WebUI.click(findTestObject(pathOR + 'input_Continue'))
	}

	// placeholder for selecting Change Payment Method button


	// placeholder for selecting Exit button



	@Keyword
	def getDataCCPMEF(int rowM, dataFileM) {

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

		cardholderName = dataFileM.getValue('Name', rowM)

		println(cardholderName)

		cardNumber = dataFileM.getValue('CardNum', rowM)

		println(cardNumber)

		cvv = dataFileM.getValue('SPC', rowM)

		println(cvv)

		expMM = dataFileM.getValue('ExpM', rowM)

		println(expMM)

		expYYYY = dataFileM.getValue('ExpY', rowM)

		println(expYYYY)

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

		appID = dataFileM.getValue('AppID', rowM)

		println(appID)
	}


	@Keyword
	def setDataCCPM(int rowS, dataFileS) {


		def String datafile_class = dataFileS.getClass()
		if(datafile_class.contains('com.kms.katalon.core.testdata.reader.SheetPOI')) {
			this.getDataCCPMEF(rowS, dataFileS)
		}

		// Verify if we are on Credit Card Payment Entry page and populate the page

		if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'), 30)) {

			println("We are on Credit Card Payment Entry page, start populating")



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),30)) {
			if ((!amount.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),amount)
			}
			else {
				println("Amount is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("Amount field is either missing or not modifiable on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),30)) {
			if ((!udf2.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),udf2)
			}
			else {
				println("UDF2 data is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF2 field is either missing or not modifiable on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),30)) {
			if ((!udf3.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),udf3)
			}
			else {
				println("UDF3 data is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF3 field is either missing or not modifiable on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7'),30)) {
			if ((!udf7.isEmpty())) {
				WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7'),udf7,false)
			}
			else {
				println("UDF7 data is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF7 field is either missing or not modifiable on CC Payment Entry page")
			//			}




			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8'),30)) {
			if ((!udf8.isEmpty())) {
				WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8'),udf8,false)
			}
			else {
				println("UDF8 data is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF8 field is either missing or not modifiable on CC Payment Entry page")
			//			}
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'),30)) {
				if ((!cardholderName.isEmpty())) {
					WebUI.setText((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name')),cardholderName)
				}
				else {
					println("CCName data is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Name field is either missing or not modifiable on CC Payment Entry page")
			}



			if( appID == '920' || appID == '921' || appID == '936' || appID == '938'  || appID == '941' || appID == '942' || appID == '943' || appID == '944' || appID == '5100' || appID == '5101'  || appID == '5103' || appID == '6116') {

				if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),30)) {
					if ((!cardNumber.isEmpty())) {
						WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),cardNumber)
					}
					else {
						println("Card Number is not present in the Excel Spreadsheet")
					}
				}
				else {
					println("Card Number field is missing on CC Payment Entry page")
				}

				if ((!cvv.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),cvv)
				}
				else {
					println("CCSPC is not present in the Excel Spreadsheet")
				}
			}
			else if(appID == '914' || appID == '915' || appID == '937' || appID == '939' || appID == '940' || appID == '5102' || appID == '6114' || appID == '6115' || appID == '6117') {

				if (WebUI.verifyElementPresent(findTestObject('Object Repository/DisplayConvFees/Page_CC_DataEntry/input__password_cardNumber'),30)) {
					if ((!cardNumber.isEmpty())) {
						WebUI.setText(findTestObject('Object Repository/DisplayConvFees/Page_CC_DataEntry/input__password_cardNumber'),cardNumber)
					}
					else {
						println("Card Number is not present in the Excel Spreadsheet")
					}
				}
				else {
					println("Card Number field is missing on CC Payment Entry page")
				}

				Thread.sleep(1000)

				if ((!cvv.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/DisplayConvFees/Page_CC_DataEntry/input__password_spc'),cvv)
				}
				else {
					println("CCSPC is not present in the Excel Spreadsheet")
				}

				Thread.sleep(2000)
			}


			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),30)) {

			//			}
			//			else {
			//				println("SPC field is missing on CC Payment Entry page")
			//			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),30)) {
				if ((!expMM.isEmpty())) {
					WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),expMM,false)
				}
				else {
					println("CCExpM is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Month field is missing on CC Payment Entry page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),30)) {
				if ((!expYYYY.isEmpty())) {
					WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),expYYYY,false)
				}
				else {
					println("CCExpY is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Year field is missing on CC Payment Entry page")
			}

			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ProcessDate'),30)) {
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
			//			}
			//			else {
			//				println("ProcessDate field is missing on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),30)) {
			if ((!AL1.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),AL1)
			}
			else {
				println("CCAL1 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("AL1 field is missing on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),30)) {
			if ((!AL2.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),AL2)
			}
			else {
				println("CCAL2 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("AL2 field is missing on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),30)) {
			if ((!ZIP.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),ZIP)
			}
			else {
				println("CCZIP is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("ZIP field is missing on CC Payment Entry page")
			//			}

			findTestObject('Object Repository/DisplayConvFees/Page_CC_DataEntry/input_Receipt_emailAddress')

			if (WebUI.verifyElementPresent(findTestObject('Object Repository/DisplayConvFees/Page_CC_DataEntry/input_Receipt_emailAddress'),30)) {
				if ((!email.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/DisplayConvFees/Page_CC_DataEntry/input_Receipt_emailAddress'),email)
				}
				else {
					println("CCEmail is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Email field is missing on CC Payment Entry page")
			}


			if( appID == '914' || appID == '915' ||  appID == '937' || appID == '939' ||  appID == '941' || appID == '942' || appID == '943' || appID == '944' ) {

				if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'),30)) {
					WebUI.check(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'))
				}
				else {
					println("Terms and Condition checkbox is missing on the CC Payment Entry page")
				}
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'),30)) {
				WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'))
			}
			else {
				println("Continue button is missing on the CC Payment Entry page")
			}

			//End Populating the Credit Card Payment Entry page
		}
		else {
			println("Not on Credit Card Payment Entry Page")
		}
	}
}





