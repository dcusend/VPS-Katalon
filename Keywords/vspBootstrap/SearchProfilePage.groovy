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

public class SearchProfilePage {
	
	@Keyword
	def setDataSearchProfile(int rowS, String dataFileS) {

		String criteria, searchBy
		
		// GetData
			criteria = findTestData(dataFileS).getValue('Criteria', rowS)
			searchBy = findTestData(dataFileS).getValue('SearchBy', rowS)
	
		// SetData
			String path_SearchProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/SearchProfile/"
			WebUI.setText(findTestObject(path_SearchProfile + 'input_Criteria'), criteria)
			WebUI.selectOptionByLabel(findTestObject(path_SearchProfile + 'select_SearchBy'), searchBy, true)
			
			WebUI.click(findTestObject(path_SearchProfile + 'button_Search'))
	
	
	}
	
	
	
}
