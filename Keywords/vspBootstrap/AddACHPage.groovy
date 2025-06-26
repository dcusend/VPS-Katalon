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

public class AddACHPage {


	String path_Add_ACH = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/AddACH/"
	String payType, rtn, nickNameACH, acNumber, zipCode, zipCodeExt

	@Keyword
	def setDataAddACH(int rowS, String dataFileS) {


		// GetData
		payType = findTestData(dataFileS).getValue('PaymentType', rowS)
		rtn = findTestData(dataFileS).getValue('RTN', rowS)
		nickNameACH = findTestData(dataFileS).getValue('NicknameACH', rowS)
		acNumber = findTestData(dataFileS).getValue('ACNumber', rowS)

		// SetData
		WebUI.setText(findTestObject(path_Add_ACH + 'input_routingTransitNumber'), rtn)
		WebUI.selectOptionByLabel(findTestObject(path_Add_ACH + 'select_PaymentType'), payType, true)
		WebUI.setText(findTestObject(path_Add_ACH + 'input_nickName'), nickNameACH)
		WebUI.setText(findTestObject(path_Add_ACH + 'input_accountNumber'), acNumber)

		// Select Create button
		WebUI.click(findTestObject(path_Add_ACH + 'button_Create'))
	}


	@Keyword
	def setDataAddACH_EF(int rowS, dataFileS) {


		// GetData
		payType = dataFileS.getValue('PaymentType', rowS)
		rtn = dataFileS.getValue('RTN', rowS)
		nickNameACH = dataFileS.getValue('NicknameACH', rowS)
		acNumber = dataFileS.getValue('ACNumber', rowS)
//		zipCode = dataFileS.getValue('ZIP', rowS)


		// SetData
		WebUI.setText(findTestObject(path_Add_ACH + 'input_routingTransitNumber'), rtn)
		WebUI.selectOptionByLabel(findTestObject(path_Add_ACH + 'select_PaymentType'), payType, true)
		WebUI.setText(findTestObject(path_Add_ACH + 'input_nickName'), nickNameACH)
		WebUI.setText(findTestObject(path_Add_ACH + 'input_accountNumber'), acNumber)
		Thread.sleep(10000)
		

		// Select Create button
		WebUI.click(findTestObject(path_Add_ACH + 'button_Create'))
	}
}
