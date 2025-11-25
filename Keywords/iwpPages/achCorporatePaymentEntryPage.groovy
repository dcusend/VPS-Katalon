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

import internal.GlobalVariable

public class achCorporatePaymentEntryPage {


	String Amount, UDF1, UDF2, UDF3, UDF4, UDF5, UDF6, UDF7, UDF8, UDF9, UDF10
	String CompanyName, EIN, RTN, ACNumber, CACNumber, CCDate, AL1, AL2, ZIP, Email
	def MV


	@Keyword
	def getDataCorporate(int rowM, dataFileM) {

		CompanyName = findTestData(dataFileM).getValue('CompanyName', rowM)
		println(CompanyName)

		EIN = findTestData(dataFileM).getValue('EIN', rowM)
		println(EIN)

		Amount = findTestData(dataFileM).getValue('Amount', rowM)
		println(Amount)

		UDF1 = findTestData(dataFileM).getValue('UDF1', rowM)
		println(UDF1)

		UDF2 = findTestData(dataFileM).getValue('UDF2', rowM)
		println(UDF2)

		UDF3 = findTestData(dataFileM).getValue('UDF3', rowM)
		println(UDF3)

		UDF4 = findTestData(dataFileM).getValue('UDF4', rowM)
		println(UDF4)

		UDF5 = findTestData(dataFileM).getValue('UDF5', rowM)
		println(UDF5)

		UDF6 = findTestData(dataFileM).getValue('UDF6', rowM)
		println(UDF6)

		UDF7 = findTestData(dataFileM).getValue('UDF7', rowM)
		println(UDF7)

		UDF8 = findTestData(dataFileM).getValue('UDF8', rowM)
		println(UDF8)

		UDF9 = findTestData(dataFileM).getValue('UDF9', rowM)
		println(UDF9)

		UDF10 = findTestData(dataFileM).getValue('UDF10', rowM)
		println(UDF10)

		RTN = findTestData(dataFileM).getValue('RTN', rowM)
		println(RTN)

		ACNumber = findTestData(dataFileM).getValue('ACNumber', rowM)
		println(ACNumber)

		CACNumber = findTestData(dataFileM).getValue('CACNumber', rowM)
		println(CACNumber)

		CCDate = findTestData(dataFileM).getValue('CCDate', rowM)
		println(CCDate)

		AL1 = findTestData(dataFileM).getValue('AL1', rowM)
		println(AL1)

		AL2 = findTestData(dataFileM).getValue('AL2', rowM)
		println(AL2)

		ZIP = findTestData(dataFileM).getValue('ZIP', rowM)
		println(ZIP)

		Email = findTestData(dataFileM).getValue('Email', rowM)
		println(Email)

		MV = findTestData(dataFileM).getValue('MessageVersion', rowM)
		println(MV)
		// End of getData
	}


	@Keyword
	def getDataCorporateEF(int rowM, dataFileM) {

		CompanyName = dataFileM.getValue('CompanyName', rowM)
		println(CompanyName)

		EIN = dataFileM.getValue('EIN', rowM)
		println(EIN)

		Amount = dataFileM.getValue('Amount', rowM)
		println(Amount)

		UDF1 = dataFileM.getValue('UDF1', rowM)
		println(UDF1)

		UDF2 = dataFileM.getValue('UDF2', rowM)
		println(UDF2)

		UDF3 = dataFileM.getValue('UDF3', rowM)
		println(UDF3)

		UDF4 = dataFileM.getValue('UDF4', rowM)
		println(UDF4)

		UDF5 = dataFileM.getValue('UDF5', rowM)
		println(UDF5)

		UDF6 = dataFileM.getValue('UDF6', rowM)
		println(UDF6)

		UDF7 = dataFileM.getValue('UDF7', rowM)
		println(UDF7)

		UDF8 = dataFileM.getValue('UDF8', rowM)
		println(UDF8)

		UDF9 = dataFileM.getValue('UDF9', rowM)
		println(UDF9)

		UDF10 = dataFileM.getValue('UDF10', rowM)
		println(UDF10)

		RTN = dataFileM.getValue('RTN', rowM)
		println(RTN)

		ACNumber = dataFileM.getValue('ACNumber', rowM)
		println(ACNumber)

		CACNumber = dataFileM.getValue('CACNumber', rowM)
		println(CACNumber)

		CCDate = dataFileM.getValue('CCDate', rowM)
		println(Date)

		AL1 = dataFileM.getValue('AL1', rowM)
		println(AL1)

		AL2 = dataFileM.getValue('AL2', rowM)
		println(AL2)

		ZIP = dataFileM.getValue('ZIP', rowM)
		println(ZIP)

		Email = dataFileM.getValue('Email', rowM)
		println(Email)

		MV = dataFileM.getValue('MessageVersion', rowM)
		println(MV)
		// End of getData
	}

	@Keyword
	def setDataCorporate(int rowS, dataFileS) {

		def String datafile_class = dataFileS.getClass()
		if(datafile_class.contains('com.kms.katalon.core.testdata.reader.SheetPOI')) {
			this.getDataCorporateEF(rowS, dataFileS)
		}
		else {
			this.getDataCorporate(rowS, dataFileS)
		}


		// Verify if we are on ACH Corporate Payment Entry page and populate the page

		if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_accountNumber'), 30)) {

			println("We are on ACH Corporate Payment Entry page, start populating")

			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/input_CompanyName'),30)) {
				if ((!CompanyName.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/input_CompanyName'),CompanyName)
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
			if ((!Amount.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_Amount'),Amount)
			}
			else {
				println("Amount is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("Amount field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_UDF2'),30)) {
			if ((!UDF2.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_UDF2'),UDF2)
			}
			else {
				println("UDF2 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF2 field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_UDF3'),30)) {
			if ((!UDF3.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_UDF3'),UDF3)
			}
			else {
				println("UDF3 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF3 field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			//			}


			if (MV != "2.3") {

				//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/dd_UDF7'),30)) {
				if ((!UDF7.isEmpty())) {
					WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/dd_UDF7'),UDF7, false)
				}
				else {
					println("UDF7 is not present in the Excel Spreadsheet")
				}
				//			}
				//			else {
				//				println("UDF7 field is either missing or not modifiable on ACH Corporate Payment Entry Page")
				//			}



				//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/dd_UDF8'),30)) {
				if ((!UDF8.isEmpty())) {
					WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/dd_UDF8'),UDF8, false)
				}
				else {
					println("UDF8 is not present in the Excel Spreadsheet")
				}
				//			}
				//			else {
				//				println("UDF8 field is either missing or not modifiable on ACH Corporate Payment Entry Page")
				//			}
			}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_routingNumber'),30)) {
				if ((!RTN.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_routingNumber'),RTN)
				}
				else {
					println("RTN is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("RTN field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_accountNumber'),30)) {
				if ((!ACNumber.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_accountNumber'),ACNumber)
				}
				else {
					println("Account Number is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Account Number field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_confirmAccountNumber'),30)) {
				if ((!CACNumber.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_confirmAccountNumber'),CACNumber)
				}
				else {
					println("Confirm Account Number is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Confirm Account Number field is either missing or not modifiable on ACH Corporate Payment Entry Page")
			}


			if ((!CCDate.isEmpty())) {
				//This js script is written to set the future date
				String js = '''
				let date = new Date(); // Now
				date.setDate(date.getDate() + 30); // Set now + 30 days as the new date
				console.log(date);

				
				let dateString = date;
				let new_date = new Date(dateString);
				
				let month = (new_date.getMonth() + 1).toString().padStart(2, '0');
				let day = new_date.getDate().toString().padStart(2, '0');
				let year = new_date.getFullYear();
				
				let formattedDate = `${month}/${day}/${year}`;

				console.log(formattedDate)
				   document.getElementById('processDate').value = formattedDate
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
				if ((!Email.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/txt_Email'),Email)
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
