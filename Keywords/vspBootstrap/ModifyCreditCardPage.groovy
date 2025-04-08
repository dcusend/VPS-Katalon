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

public class ModifyCreditCardPage {


	@Keyword
	def setDataModifyCreditCard(int rowS, String dataFileS) {

		String expMonth, expYear

		// GetData
		expMonth = findTestData(dataFileS).getValue('ExpMonthCCMod', rowS)
		expYear = findTestData(dataFileS).getValue('ExpYearCCMod', rowS)


		// SetData

		String path_ModifyCreditCard = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/ModifyCreditCard/"
		WebUI.selectOptionByLabel(findTestObject(path_ModifyCreditCard + 'select_ExpMonth'), expMonth, true)
		WebUI.selectOptionByLabel(findTestObject(path_ModifyCreditCard + 'select_ExpYear'), expYear, true)

		// Select the Modify button
		WebUI.click(findTestObject(path_ModifyCreditCard + 'button_Modify'))
	}
	
	
	@Keyword
	def setDataModifyCreditCard_EF(int rowS, dataFileS) {

		String expMonth, expYear

		// GetData
		expMonth = dataFileS.getValue('ExpMonthCCMod', rowS)
		expYear = dataFileS.getValue('ExpYearCCMod', rowS)


		// SetData

		String path_ModifyCreditCard = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/ModifyCreditCard/"
		WebUI.selectOptionByLabel(findTestObject(path_ModifyCreditCard + 'select_ExpMonth'), expMonth, true)
		WebUI.selectOptionByLabel(findTestObject(path_ModifyCreditCard + 'select_ExpYear'), expYear, true)

		// Select the Modify button
		WebUI.click(findTestObject(path_ModifyCreditCard + 'button_Modify'))
	}
}
