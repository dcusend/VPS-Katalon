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

public class AddCreditCardPage {

	String title, fName, mName, lName, suffix, nickName, cardNumber, expM, expY, al1, al2, zip, zipExt

	String path_Add_CC = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/AddCreditCard/"

	@Keyword
	def setDataCreditCardNotPre(int rowS, String dataFileS) {



		// GetData
		title = findTestData(dataFileS).getValue('TitleCC', rowS)
		fName = findTestData(dataFileS).getValue('FirstNameCC', rowS)
		mName = findTestData(dataFileS).getValue('MiddleNameCC', rowS)
		lName = findTestData(dataFileS).getValue('LastNameCC', rowS)
		suffix = findTestData(dataFileS).getValue('SuffixCC', rowS)
		nickName = findTestData(dataFileS).getValue('NickNameCC', rowS)
		cardNumber = findTestData(dataFileS).getValue('CardNumberCC', rowS)
		expM = findTestData(dataFileS).getValue('ExpMonthCC', rowS)
		expY = findTestData(dataFileS).getValue('ExpYearCC', rowS)
		al1 = findTestData(dataFileS).getValue('AL1CC', rowS)
		al2 = findTestData(dataFileS).getValue('AL2CC', rowS)
		zip = findTestData(dataFileS).getValue('ZIPCC', rowS)
		zipExt = findTestData(dataFileS).getValue('ZIPExtCC', rowS)


		// SetData


		WebUI.setText(findTestObject(path_Add_CC + 'input_postalCode'), zip)

		WebUI.selectOptionByLabel(findTestObject(path_Add_CC + 'select_Title'), title, true)
		WebUI.setText(findTestObject(path_Add_CC + 'input_firstName'), fName)
		WebUI.setText(findTestObject(path_Add_CC + 'input_MiddleName'), mName)
		WebUI.setText(findTestObject(path_Add_CC + 'input_lastName'), lName)
		WebUI.selectOptionByLabel(findTestObject(path_Add_CC + 'select_Suffix'), suffix, true)

		WebUI.setText(findTestObject(path_Add_CC + 'input_nickName'), nickName)
		WebUI.setText(findTestObject(path_Add_CC + 'input_cardNumber'), cardNumber)
		WebUI.selectOptionByLabel(findTestObject(path_Add_CC + 'select_ExpMonth'), expM, true)
		WebUI.selectOptionByLabel(findTestObject(path_Add_CC + 'select_ExpYear'), expY, true)

		WebUI.setText(findTestObject(path_Add_CC + 'input_address1'), al1)
		WebUI.setText(findTestObject(path_Add_CC + 'input_AddressLine2'), al2)
		WebUI.setText(findTestObject(path_Add_CC + 'input_postalCodeExtension'), zipExt)


		// Select the Create button
		WebUI.click(findTestObject(path_Add_CC + 'button_Create'))



	}



	@Keyword
	def setDataCreditCardPre(int rowS, String dataFileS) {

		// GetData
		nickName = findTestData(dataFileS).getValue('NickNameCC', rowS)
		cardNumber = findTestData(dataFileS).getValue('CardNumberCC', rowS)
		expM = findTestData(dataFileS).getValue('ExpMonthCC', rowS)
		expY = findTestData(dataFileS).getValue('ExpYearCC', rowS)


		// SetData
		WebUI.setText(findTestObject(path_Add_CC + 'input_nickName'), nickName)
		WebUI.setText(findTestObject(path_Add_CC + 'input_cardNumber'), cardNumber)
		WebUI.selectOptionByLabel(findTestObject(path_Add_CC + 'select_ExpMonth'), expM, true)
		WebUI.selectOptionByLabel(findTestObject(path_Add_CC + 'select_ExpYear'), expY, true)

		// Select the Create button
		WebUI.click(findTestObject(path_Add_CC + 'button_Create'))




	}
}
