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

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.WebElement

public class virtualTerminalSetData {
	
	
	@Keyword
	def saleKeyboard_HardCoded()
	{
		
		String path_SaleKB = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SaleKeyboard/"
		
		WebUI.setText(findTestObject(path_SaleKB + 'input_cardName'), 'Shiv Hari')
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_transactionCategory'), 'MOTO', true)
		
		WebElement element = WebUiCommonHelper.findWebElement(findTestObject(path_SaleKB + 'input__cardNumber2'),30)
		WebUI.executeJavaScript("arguments[0].value ='4111111111111111'", Arrays.asList(element))
		
		WebElement element2 = WebUiCommonHelper.findWebElement(findTestObject(path_SaleKB + 'input__cvv'),30)
		WebUI.executeJavaScript("arguments[0].value ='123'", Arrays.asList(element2))
				

		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_MM'), '12', true)
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_YYYY'), '2026', true)
		WebUI.setText(findTestObject(path_SaleKB + 'input__address'), '2311 York road')
		WebUI.setText(findTestObject(path_SaleKB + 'input__address2'), 'Suite 500')
		WebUI.setText(findTestObject(path_SaleKB + 'input__zip'), '21093')
		WebUI.setText(findTestObject(path_SaleKB + 'input_emailAddress'), 'iahmed@govolution.com')
		WebUI.setText(findTestObject(path_SaleKB + 'input_smsNumber'), '')
		WebUI.setText(findTestObject(path_SaleKB + 'input_amount'), '10.50')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined1'), 'Australia')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined2'), 'Denmark')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined3'), 'Sweden')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined4'), 'Austria')
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_UDF5_DropDown'), 'groupItem231', true)
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_UDF6_DropDown'), 'groupItem232', true)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined7'), 'Norway')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined8'), 'Netherlands')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined9'), 'Switzerland')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined10'), 'France')
		
		
				
		WebUI.click(findTestObject(path_SaleKB + 'button_Submit'))
		
	}	
	
//#################################################################	
	
	@Keyword
	def saleKeyboard_HardCoded_AllCardTypes(String numCard)
	{
		//String enterCardNum = numCard
		println(numCard)
		
		String path_SaleKB = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SaleKeyboard/"
		
		WebUI.setText(findTestObject(path_SaleKB + 'input_cardName'), 'Shiv Hari')
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_transactionCategory'), 'MOTO', true)
		
		WebElement element = WebUiCommonHelper.findWebElement(findTestObject(path_SaleKB + 'input__cardNumber2'),30)
		WebUI.executeJavaScript("arguments[0].value ='"+ numCard+"' "  , Arrays.asList(element))
		
		WebElement element2 = WebUiCommonHelper.findWebElement(findTestObject(path_SaleKB + 'input__cvv'),30)
		WebUI.executeJavaScript("arguments[0].value ='123'", Arrays.asList(element2))
				

		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_MM'), '12', true)
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_YYYY'), '2026', true)
		WebUI.setText(findTestObject(path_SaleKB + 'input__address'), '2311 York road')
		WebUI.setText(findTestObject(path_SaleKB + 'input__address2'), 'Suite 500')
		WebUI.setText(findTestObject(path_SaleKB + 'input__zip'), '21093')
		WebUI.setText(findTestObject(path_SaleKB + 'input_emailAddress'), 'iahmed@govolution.com')
		WebUI.setText(findTestObject(path_SaleKB + 'input_smsNumber'), '')
		WebUI.setText(findTestObject(path_SaleKB + 'input_amount'), '10.50')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined1'), 'Australia')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined2'), 'Denmark')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined3'), 'Sweden')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined4'), 'Austria')
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_UDF5_DropDown'), 'groupItem231', true)
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_UDF6_DropDown'), 'groupItem232', true)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined7'), 'Norway')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined8'), 'Netherlands')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined9'), 'Switzerland')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined10'), 'France')
		
		
				
		WebUI.click(findTestObject(path_SaleKB + 'button_Submit'))
		
	}
	
//##################################################################################################################################
	
	
	
	
	
	
	
	
	
}
