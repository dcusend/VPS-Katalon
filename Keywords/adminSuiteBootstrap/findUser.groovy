package adminSuiteBootstrap

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

public class findUser {

	String usernameFU, fNameFU, lNameFU, searchTypeFU

	String path_FindUser = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/FindUser/"

	@Keyword
	def findUser_DD(int rowS, String dataFileS) {


		// GetData
		usernameFU = findTestData(dataFileS).getValue('Username', rowS)
		fNameFU = findTestData(dataFileS).getValue('Firstname', rowS)
		lNameFU = findTestData(dataFileS).getValue('Lastname', rowS)
		searchTypeFU = findTestData(dataFileS).getValue('SearchType', rowS)


		// SetData
		WebUI.setText(findTestObject(path_FindUser + 'input_Username'), usernameFU)
		WebUI.setText(findTestObject(path_FindUser + 'input_FirstName'), fNameFU)
		WebUI.setText(findTestObject(path_FindUser + 'input_LastName'), lNameFU)
		WebUI.selectOptionByLabel(findTestObject(path_FindUser + 'select_SearchType'),searchTypeFU , false)

		// Select the Submit button
		WebUI.click(findTestObject(path_FindUser + 'button_Search'))
	}

	@Keyword
	def findUser_DD_EF(int rowS, dataFileS) {


		// GetData
		usernameFU = dataFileS.getValue('Username', rowS)
		fNameFU = dataFileS.getValue('Firstname', rowS)
		lNameFU = dataFileS.getValue('Lastname', rowS)
		searchTypeFU = dataFileS.getValue('SearchType', rowS)


		// SetData
		WebUI.setText(findTestObject(path_FindUser + 'input_Username'), usernameFU)
		WebUI.setText(findTestObject(path_FindUser + 'input_FirstName'), fNameFU)
		WebUI.setText(findTestObject(path_FindUser + 'input_LastName'), lNameFU)
		WebUI.selectOptionByLabel(findTestObject(path_FindUser + 'select_SearchType'),searchTypeFU , false)

		// Select the Submit button
		WebUI.click(findTestObject(path_FindUser + 'button_Search'))
	}
	
	@Keyword
	def findUser_DD_EF_Profile(int rowS, dataFileS, execProfile) {


		// GetData
		if(execProfile == 'Production') {
			usernameFU = dataFileS.getValue('UsernameProd', rowS)
		}
		else if(execProfile == 'DemoProfile' || execProfile == 'Upgrade') {
			usernameFU = dataFileS.getValue('UsernameDemo', rowS)
		}

		fNameFU = dataFileS.getValue('Firstname', rowS)
		lNameFU = dataFileS.getValue('Lastname', rowS)
		searchTypeFU = dataFileS.getValue('SearchType', rowS)


		// SetData
		WebUI.setText(findTestObject(path_FindUser + 'input_Username'), usernameFU)
		WebUI.setText(findTestObject(path_FindUser + 'input_FirstName'), fNameFU)
		WebUI.setText(findTestObject(path_FindUser + 'input_LastName'), lNameFU)
		WebUI.selectOptionByLabel(findTestObject(path_FindUser + 'select_SearchType'),searchTypeFU , false)

		// Select the Submit button
		WebUI.click(findTestObject(path_FindUser + 'button_Search'))
	}
}
