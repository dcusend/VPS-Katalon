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

public class editSchedulePayment {

	String SPC, CCDate, UDF8, UDF7


	@Keyword
	def getDataSchedPayment(int rowM, dataFileM) {

		UDF8 = findTestData(dataFileM).getValue('UDF8', rowM)

		UDF7 = findTestData(dataFileM).getValue('UDF7', rowM)

		SPC = findTestData(dataFileM).getValue('SPC', rowM)

		CCDate = findTestData(dataFileM).getValue('CCDate', rowM)
	}


	@Keyword
	def getDataSchedPaymentEF(int rowM, dataFileM) {

		UDF8 = dataFileM.getValue('UDF8', rowM)

		UDF7 = dataFileM.getValue('UDF7', rowM)

		SPC = dataFileM.getValue('SPC', rowM)

		CCDate = dataFileM.getValue('CCDate', rowM)
	}

	@Keyword
	def setDataSchedPayment(int rowS, dataFileS) {

		def String datafile_class = dataFileS.getClass()


		println  dataFileS
		if(datafile_class.contains('com.kms.katalon.core.testdata.reader.SheetPOI')) {
			this.getDataSchedPaymentEF(rowS, dataFileS)
		}
		else {
			this.getDataSchedPayment(rowS, dataFileS)
		}



		if (WebUI.verifyTextPresent("Edit Payment Plan", false)) {
			if ((!UDF7.isEmpty())) {
				WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7')),UDF7,false)
			}
			else {
				println("UDF7 data is not present in the Excel Spreadsheet")
			}

			if ((!UDF8.isEmpty())) {
				WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8')),UDF8,false)
			}
			else {
				println("UDF8 data is not present in the Excel Spreadsheet")
			}

			if ((!SPC.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),SPC)
			}
			else {
				println("CCSPC is not present in the Excel Spreadsheet")
			}

			if ((!CCDate.isEmpty())) {
				//This js script is written to set the future date
				String js = '''
				   document.getElementById('processDate').value = '08/09/2045'
				  '''
				WebUI.executeJavaScript(js, null)
				//				WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ProcessDate'),CCDate)
			}
			else {
				println("Date is not present in the Excel Spreadsheet")
			}
		}
	}


	@Keyword
	def setDataSchedPaymentEF(int rowS, dataFileS) {
		def String datafile_class = dataFileS.getClass()

		if(datafile_class.contains('com.kms.katalon.core.testdata.reader.SheetPOI')) {
			this.getDataSchedPaymentEF(rowS, dataFileS)
		}
		else {
			this.getDataSchedPayment(rowS, dataFileS)
		}



		if (WebUI.verifyTextPresent("Edit Payment Plan", false)) {
			if ((!UDF7.isEmpty())) {
				WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7')),UDF7,false)
			}
			else {
				println("UDF7 data is not present in the Excel Spreadsheet")
			}

			if ((!UDF8.isEmpty())) {
				WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8')),UDF8,false)
			}
			else {
				println("UDF8 data is not present in the Excel Spreadsheet")
			}

			if ((!SPC.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),SPC)
			}
			else {
				println("CCSPC is not present in the Excel Spreadsheet")
			}

			if ((!CCDate.isEmpty())) {
				//This js script is written to set the future date
				String js = '''
				   document.getElementById('processDate').value = '08/09/2045'
				  '''
				WebUI.executeJavaScript(js, null)
				//				WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ProcessDate'),CCDate)
			}
			else {
				println("Date is not present in the Excel Spreadsheet")
			}
		}
	}
}
