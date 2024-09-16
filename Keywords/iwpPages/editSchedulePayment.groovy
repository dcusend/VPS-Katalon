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

	String NewCCSPC, NewCCDate, CCUDF8

	@Keyword
	def setDataSchedPayment(int rowS, String dataFileS) {
		CCUDF8 = findTestData(dataFileS).getValue('CCUDF8', rowS)
		NewCCSPC = findTestData(dataFileS).getValue('NewCCSPC', rowS)
		NewCCDate = findTestData(dataFileS).getValue('NewCCDate', rowS)


		if (WebUI.verifyTextPresent("Edit Payment Plan", false)) {
			if ((!CCUDF8.isEmpty())) {
				WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8')),CCUDF8,false)
			}
			else {
				println("UDF8 data is not present in the Excel Spreadsheet")
			}

			if ((!NewCCSPC.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),NewCCSPC)
			}
			else {
				println("CCSPC is not present in the Excel Spreadsheet")
			}


			if ((!NewCCDate.isEmpty())) {
				//This js script is written to set the future date
				String js = '''
				   document.getElementById('processDate').value = '08/09/2045'
				  '''
				WebUI.executeJavaScript(js, null)
				//				WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ProcessDate'),CCDate)
			}
			else {
				println("CCDate is not present in the Excel Spreadsheet")
			}
		}
	}
}
