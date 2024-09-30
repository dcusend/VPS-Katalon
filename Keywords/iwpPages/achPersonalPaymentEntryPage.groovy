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

public class achPersonalPaymentEntryPage {


	String Amount, UDF1, UDF2, UDF3, UDF4, UDF5, UDF6, UDF7, UDF8, UDF9, UDF10
	String Fname, Lname, RTN, ACNumber, CACNumber, ACType, AL1, AL2, ZIP, Email, CCDate


	@Keyword
	def getDataACHPPM(int rowM, String dataFileM) {

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

		Fname = findTestData(dataFileM).getValue('Fname', rowM)
		println(Fname)

		Lname = findTestData(dataFileM).getValue('Lname', rowM)
		println(Lname)

		RTN = findTestData(dataFileM).getValue('RTN', rowM)
		println(RTN)

		ACNumber = findTestData(dataFileM).getValue('ACNumber', rowM)
		println(ACNumber)

		CACNumber = findTestData(dataFileM).getValue('CACNumber', rowM)
		println(CACNumber)

		ACType = findTestData(dataFileM).getValue('ACType', rowM)
		println(ACType)

		CCDate = findTestData(dataFileM).getValue('CCDate', rowM)
		println(Date)

		AL1 = findTestData(dataFileM).getValue('AL1', rowM)
		println(AL1)

		AL2 = findTestData(dataFileM).getValue('AL2', rowM)
		println(AL2)

		ZIP = findTestData(dataFileM).getValue('ZIP', rowM)
		println(ZIP)

		Email = findTestData(dataFileM).getValue('Email', rowM)
		println(Email)

		//		CCDate = findTestData(dataFileM).getValue('CCDate', rowM)
		//
		//		println(CCDate)

		// End of getData
	}

	@Keyword
	def getDataACHPPMEF(int rowM, dataFileM) {

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

		Fname = dataFileM.getValue('Fname', rowM)
		println(Fname)

		Lname = dataFileM.getValue('Lname', rowM)
		println(Lname)

		RTN = dataFileM.getValue('RTN', rowM)
		println(RTN)

		ACNumber = dataFileM.getValue('ACNumber', rowM)
		println(ACNumber)

		CACNumber = dataFileM.getValue('CACNumber', rowM)
		println(CACNumber)

		ACType = dataFileM.getValue('ACType', rowM)
		println(ACType)

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
		else {
			this.getDataACHPPM(rowS, dataFileS)
		}

		// Verify if we are on ACH Personal Payment Entry page and populate the page

		if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_accountNumber'), 30)) {

			println("We are on ACH Personal Payment Entry page, start populating")



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Amount'),30)) {
			if ((!Amount.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Amount'),Amount)
			}
			else {
				println("Amount is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("Amount field is either missing or not modifiable on ACH Personal Payment Entry Page")
			//			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_UDF2'),30)) {
				if ((!UDF2.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_UDF2'),UDF2)
				}
				else {
					println("UDF2 is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("UDF2 field is either missing or not modifiable on ACH Personal Payment Entry Page")
			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_UDF3'),30)) {
			if ((!UDF3.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_UDF3'),UDF3)
			}
			else {
				println("UDF3 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF3 field is either missing or not modifiable on ACH Personal Payment Entry Page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/dd_UDF7'),30)) {
			if ((!UDF7.isEmpty())) {
				WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/dd_UDF7'),UDF7, false)
			}
			else {
				println("UDF7 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF7 field is either missing or not modifiable on ACH Personal Payment Entry Page")
			//			}


			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/dd_UDF8'),30)) {
			if ((!UDF8.isEmpty())) {
				WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/dd_UDF8'),UDF8, false)
			}
			else {
				println("UDF8 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF8 field is either missing or not modifiable on ACH Personal Payment Entry Page")
			//			}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Firstname'),30)) {
				if ((!Fname.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Firstname'),Fname)
				}
				else {
					println("First Name is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("First Name field is either missing or not modifiable on ACH Personal Payment Entry Page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Lastname'),30)) {
				if ((!Lname.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Lastname'),Lname)
				}
				else {
					println("Last Name is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Last Name field is either missing or not modifiable on ACH Personal Payment Entry Page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_routingNumber'),30)) {
				if ((!RTN.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_routingNumber'),RTN)
				}
				else {
					println("RTN is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("RTN field is either missing or not modifiable on ACH Personal Payment Entry Page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_accountNumber'),30)) {
				if ((!ACNumber.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_accountNumber'),ACNumber)
				}
				else {
					println("Account Number is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Account Number field is either missing or not modifiable on ACH Personal Payment Entry Page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_confirmAccountNumber'),30)) {
				if ((!CACNumber.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_confirmAccountNumber'),CACNumber)
				}
				else {
					println("Confirm Account Number is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Confirm Account Number field is either missing or not modifiable on ACH Personal Payment Entry Page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/rd_accountType'),30)) {
				if ((!ACType.isEmpty())) {
					println(ACType)
					if (ACType == '1'){
						// select Checking
						println(ACType)

						def accountTypeChecking = WebUI.modifyObjectProperty(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/rd_accountType'),'value','equals',"1",true)
						println(accountTypeChecking)
						WebUI.click(accountTypeChecking)
					}
					else if (ACType == '2'){
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



			if ((!CCDate.isEmpty())) {
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
				if ((!Email.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/txt_Email'),Email)
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
