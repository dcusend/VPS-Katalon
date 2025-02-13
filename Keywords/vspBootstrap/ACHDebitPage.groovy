package vspBootstrap

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

public class ACHDebitPage {

	String sec, sms, amount, ein, profName
	String UDF1,UDF2,UDF3,UDF4,UDF5,UDF6,UDF7,UDF8,UDF9,UDF10
	String path_DebitVSP = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/VSP_Debit/"

	@Keyword
	def setDataACHDebit(int rowS, String dataFileS) {

		// GetData
		sec = findTestData(dataFileS).getValue('SEC', rowS)
		sms = findTestData(dataFileS).getValue('SMSnumber', rowS)
		amount = findTestData(dataFileS).getValue('Amount', rowS)

		profName = findTestData(dataFileS).getValue('ProfileName', rowS)
		ein = findTestData(dataFileS).getValue('EIN', rowS)

		UDF1 = findTestData(dataFileS).getValue('UDF1', rowS)
		UDF2 = findTestData(dataFileS).getValue('UDF2', rowS)
		UDF3 = findTestData(dataFileS).getValue('UDF3', rowS)
		UDF4 = findTestData(dataFileS).getValue('UDF4', rowS)
		UDF5 = findTestData(dataFileS).getValue('UDF5', rowS)
		UDF6 = findTestData(dataFileS).getValue('UDF6', rowS)
		UDF7 = findTestData(dataFileS).getValue('UDF7', rowS)
		UDF8 = findTestData(dataFileS).getValue('UDF8', rowS)
		UDF9 = findTestData(dataFileS).getValue('UDF9', rowS)
		UDF10 = findTestData(dataFileS).getValue('UDF10', rowS)

		// SetData
		WebUI.selectOptionByValue(findTestObject(path_DebitVSP + 'select_StdEntryClass'), sec, true)
		
		
		if ((!sms.isEmpty())) {
			WebUI.setText(findTestObject(path_DebitVSP + 'input_smsNumber'), sms)
		}
		else {
			println("Phone Number is not present in the Excel Spreadsheet")
		}

		
		
//		WebUI.setText(findTestObject(path_DebitVSP + 'input_smsNumber'), sms)
		WebUI.setText(findTestObject(path_DebitVSP + 'input_amount'), amount)

		if (profName.equalsIgnoreCase("PaymentsCorp"))
		{
			WebUI.setText(findTestObject(path_DebitVSP + 'input_ein'), ein)
		}

		WebUI.setText(findTestObject(path_DebitVSP + 'input_userDefined1'), UDF1)
		WebUI.setText(findTestObject(path_DebitVSP + 'input_userDefined2'), UDF2)
		WebUI.setText(findTestObject(path_DebitVSP + 'input_userDefined3'), UDF3)
		WebUI.setText(findTestObject(path_DebitVSP + 'input_userDefined4'), UDF4)

		WebUI.selectOptionByLabel(findTestObject(path_DebitVSP + 'select_UDF5'), UDF5, true)
		WebUI.selectOptionByLabel(findTestObject(path_DebitVSP + 'select_UDF6'), UDF6, true)

		WebUI.setText(findTestObject(path_DebitVSP + 'input_userDefined7'), UDF7)
		WebUI.setText(findTestObject(path_DebitVSP + 'input_userDefined8'), UDF8)
		WebUI.setText(findTestObject(path_DebitVSP + 'input_userDefined9'), UDF9)
		WebUI.setText(findTestObject(path_DebitVSP + 'input_userDefined10'), UDF10)

		WebUI.click(findTestObject(path_DebitVSP + 'button_Submit'))













	}

}
