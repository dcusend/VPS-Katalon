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

public class SalePage {

	String transCat, cvv, sms, amount
	String UDF1,UDF2,UDF3,UDF4,UDF5,UDF6,UDF7,UDF8,UDF9,UDF10
	String path_SaleVSP = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/VSP_Authcap/"

	@Keyword
	def setDataSaleAndAuth(int rowS, String dataFileS) {

		// GetData
		transCat = findTestData(dataFileS).getValue('TranCat', rowS)
		cvv = findTestData(dataFileS).getValue('CVV', rowS)
		sms = findTestData(dataFileS).getValue('SMSnumber', rowS)
		amount = findTestData(dataFileS).getValue('Amount', rowS)
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
		WebUI.selectOptionByValue(findTestObject(path_SaleVSP + 'select_TransactionCategory'), transCat, true)
		WebUI.setText(findTestObject(path_SaleVSP + 'input_cvv'), cvv)
		
		if ((!sms.isEmpty())) {
			WebUI.setText(findTestObject(path_SaleVSP + 'input_smsNumber'), sms)
		}
		else {
			println("Phone Number is not present in the Excel Spreadsheet")
		}
		
		
		//WebUI.setText(findTestObject(path_SaleVSP + 'input_smsNumber'), sms)
		WebUI.setText(findTestObject(path_SaleVSP + 'input_amount'), amount)
		WebUI.setText(findTestObject(path_SaleVSP + 'input_userDefined1'), UDF1)
		WebUI.setText(findTestObject(path_SaleVSP + 'input_userDefined2'), UDF2)
		WebUI.setText(findTestObject(path_SaleVSP + 'input_userDefined3'), UDF3)
		WebUI.setText(findTestObject(path_SaleVSP + 'input_userDefined4'), UDF4)

		WebUI.selectOptionByLabel(findTestObject(path_SaleVSP + 'select_UDF5'), UDF5, true)
		WebUI.selectOptionByLabel(findTestObject(path_SaleVSP + 'select_UDF6'), UDF6, true)

		WebUI.setText(findTestObject(path_SaleVSP + 'input_userDefined7'), UDF7)
		WebUI.setText(findTestObject(path_SaleVSP + 'input_userDefined8'), UDF8)
		WebUI.setText(findTestObject(path_SaleVSP + 'input_userDefined9'), UDF9)
		WebUI.setText(findTestObject(path_SaleVSP + 'input_userDefined10'), UDF10)

		WebUI.click(findTestObject(path_SaleVSP + 'button_Submit'))



	}
}
