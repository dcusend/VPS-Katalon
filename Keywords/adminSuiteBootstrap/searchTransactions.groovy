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

public class searchTransactions {
	
	
	
	@Keyword
	def searchTransactions_DataDriven(int rowS, String dataFileS, String remmID, String payyID)
	{
		
		String searchBy, searchValue, advancedSearch, startCal, endCal
		String ccType, achType, pinlessType, showSuccessful, showFailure
		
		// GetData
		searchBy = findTestData(dataFileS).getValue('SearchBy', rowS)
		
		if (searchBy.equalsIgnoreCase('Remittance ID'))
		{
			searchValue = remmID
		}
		else if (searchBy.equalsIgnoreCase('Payment ID'))
		{
			searchValue = payyID
		}
		else 
		{
			searchValue = findTestData(dataFileS).getValue('SearchValue', rowS)
		}
		
		
		// SetData
		
		String path_CCSearch = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/CCCreditOrVoidSearch/"
		
		
		WebUI.selectOptionByLabel(findTestObject(path_CCSearch + 'select_SearchBy'),searchBy , false)
		
		WebUI.setText(findTestObject(path_CCSearch + 'input_Search By_searchValue'), searchValue)
		
		/*	WebUI.click(findTestObject(path_CCSearch + 'input_StartCalendar'))
		WebUI.click(findTestObject(path_CCSearch + 'span_StartCalendar_Today'))
		WebUI.click(findTestObject(path_CCSearch + 'span_StartCalendar_Close'))
		
		WebUI.click(findTestObject(path_CCSearch + 'input_EndCalendar'))
		WebUI.click(findTestObject(path_CCSearch + 'span_EndCalendar_Today'))
		WebUI.click(findTestObject(path_CCSearch + 'span_EndCalendar_Close'))
		
		WebUI.delay(30)*/

		WebUI.click(findTestObject(path_CCSearch + 'button_Submit'))
		
		
	} 
	
	
	
	
	
}
