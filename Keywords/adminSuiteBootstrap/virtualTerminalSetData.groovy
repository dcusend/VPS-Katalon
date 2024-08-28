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

	def AppID, AppName, CardName, TranxCategory, CardNumber, CSC, ExpMM, ExpYYYY, AL1, AL2, ZIP, Amount, UDF1, UDF2, UDF3, UDF4, UDF5, UDF6, UDF7, UDF8, UDF9, UDF10

	@Keyword
	def saleKeyboard_HardCoded() {

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
	def saleKeyboard_HardCoded_AllCardTypes(String numCard) {
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
		//WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_UDF5_DropDown'), 'groupItem231', true)
		//WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_UDF6_DropDown'), 'groupItem232', true)

		WebUI.selectOptionByLabel(findTestObject(path_SaleKB + 'select_UDF5_DropDown'), 'Orange', true)
		WebUI.selectOptionByLabel(findTestObject(path_SaleKB + 'select_UDF6_DropDown'), 'Yellow', true)

		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined7'), 'Norway')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined8'), 'Netherlands')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined9'), 'Switzerland')
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined10'), 'France')



		WebUI.click(findTestObject(path_SaleKB + 'button_Submit'))
	}

	//##################################################################################################################################




	@Keyword
	def saleKeyboard_DataDriven(int rowS, String dataFileS) {

		String cardName,transCat, cardNumber, CSC, expM, expY, al1, al2, zipCode, emailAddress, phoneNumber, amount
		String UDF1,UDF2,UDF3,UDF4,UDF5,UDF6,UDF7,UDF8,UDF9,UDF10

		// GetData
		cardName = findTestData(dataFileS).getValue('CardName', rowS)
		transCat = findTestData(dataFileS).getValue('TranxCategory', rowS)
		cardNumber = findTestData(dataFileS).getValue('CardNumber', rowS)
		CSC = findTestData(dataFileS).getValue('CSC', rowS)
		expM = findTestData(dataFileS).getValue('ExpMM', rowS)
		expY = findTestData(dataFileS).getValue('ExpYYYY', rowS)
		al1 = findTestData(dataFileS).getValue('AL1', rowS)
		al2 = findTestData(dataFileS).getValue('AL2', rowS)
		zipCode = findTestData(dataFileS).getValue('ZIP', rowS)
		emailAddress = findTestData(dataFileS).getValue('Email', rowS)
		phoneNumber = findTestData(dataFileS).getValue('Phone', rowS)
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

		String path_SaleKB = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SaleKeyboard/"

		WebUI.setText(findTestObject(path_SaleKB + 'input_cardName'), cardName)
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_transactionCategory'), transCat, true)
		WebElement element = WebUiCommonHelper.findWebElement(findTestObject(path_SaleKB + 'input__cardNumber2'),30)
		WebUI.executeJavaScript("arguments[0].value ='"+ cardNumber+"' "  , Arrays.asList(element))
		WebElement element2 = WebUiCommonHelper.findWebElement(findTestObject(path_SaleKB + 'input__cvv'),30)
		WebUI.executeJavaScript("arguments[0].value ='"+ CSC+"' ", Arrays.asList(element2))
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_MM'), expM, true)
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_YYYY'), expY, true)
		WebUI.setText(findTestObject(path_SaleKB + 'input__address'), al1)
		WebUI.setText(findTestObject(path_SaleKB + 'input__address2'), al2)
		WebUI.setText(findTestObject(path_SaleKB + 'input__zip'), zipCode)
		WebUI.setText(findTestObject(path_SaleKB + 'input_emailAddress'), emailAddress)
		WebUI.setText(findTestObject(path_SaleKB + 'input_smsNumber'), phoneNumber)
		WebUI.setText(findTestObject(path_SaleKB + 'input_amount'), amount)

		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined1'), UDF1)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined2'), UDF2)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined3'), UDF3)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined4'), UDF4)
		WebUI.selectOptionByLabel(findTestObject(path_SaleKB + 'select_UDF5_DropDown'), UDF5, true)
		WebUI.selectOptionByLabel(findTestObject(path_SaleKB + 'select_UDF6_DropDown'), UDF6, true)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined7'), UDF7)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined8'), UDF8)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined9'), UDF9)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined10'), UDF10)

		WebUI.click(findTestObject(path_SaleKB + 'button_Submit'))
	}
	//##################################################################################################################################




	@Keyword
	def ManualAuthKeyboard_DataDriven(int rowS, String dataFileS) {

		String cardName,transCat, cardNumber, CSC, expM, expY, al1, al2, zipCode, emailAddress, phoneNumber, amount
		String UDF1,UDF2,UDF3,UDF4,UDF5,UDF6,UDF7,UDF8,UDF9,UDF10

		// GetData
		cardName = findTestData(dataFileS).getValue('CardName', rowS)
		transCat = findTestData(dataFileS).getValue('TranxCategory', rowS)
		cardNumber = findTestData(dataFileS).getValue('CardNumber', rowS)
		CSC = findTestData(dataFileS).getValue('CSC', rowS)
		expM = findTestData(dataFileS).getValue('ExpMM', rowS)
		expY = findTestData(dataFileS).getValue('ExpYYYY', rowS)
		al1 = findTestData(dataFileS).getValue('AL1', rowS)
		al2 = findTestData(dataFileS).getValue('AL2', rowS)
		zipCode = findTestData(dataFileS).getValue('ZIP', rowS)
		emailAddress = findTestData(dataFileS).getValue('Email', rowS)
		phoneNumber = findTestData(dataFileS).getValue('Phone', rowS)
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

		String path_ManAuth = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/ManualAuthKeyboard/"



		def genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
		WebUI.setText(findTestObject(path_ManAuth + 'input_RemittanceID'), genRemID)

		WebUI.setText(findTestObject(path_ManAuth + 'input__cardName'), cardName)


		WebElement element = WebUiCommonHelper.findWebElement(findTestObject(path_ManAuth + 'input__cardNumber2'),30)
		WebUI.executeJavaScript("arguments[0].value ='"+ cardNumber+"' "  , Arrays.asList(element))




		WebUI.selectOptionByValue(findTestObject(path_ManAuth + 'select_MM'), expM, true)
		WebUI.selectOptionByValue(findTestObject(path_ManAuth + 'select_YYYY'), expY, true)

		WebUI.selectOptionByValue(findTestObject(path_ManAuth + 'select_TransactionCategory'), transCat, true)

		WebUI.setText(findTestObject(path_ManAuth + 'input_AuthCode'), '123456')


		WebUI.setText(findTestObject(path_ManAuth + 'input_Authorization Code_address'), al1)
		WebUI.setText(findTestObject(path_ManAuth + 'input__address2'), al2)
		WebUI.setText(findTestObject(path_ManAuth + 'input__zip'), zipCode)
		WebUI.setText(findTestObject(path_ManAuth + 'input_State_emailAddress'), emailAddress)
		WebUI.setText(findTestObject(path_ManAuth + 'input_smsNumber'), phoneNumber)
		WebUI.setText(findTestObject(path_ManAuth + 'input_amount'), amount)

		WebUI.setText(findTestObject(path_ManAuth + 'input__userDefined1'), UDF1)
		WebUI.setText(findTestObject(path_ManAuth + 'input__userDefined2'), UDF2)
		WebUI.setText(findTestObject(path_ManAuth + 'input_userDefined3'), UDF3)
		WebUI.setText(findTestObject(path_ManAuth + 'input_userDefined4'), UDF4)
		WebUI.selectOptionByLabel(findTestObject(path_ManAuth + 'select_UDF5'), UDF5, true)
		WebUI.selectOptionByLabel(findTestObject(path_ManAuth + 'select_UDF6'), UDF6, true)
		WebUI.setText(findTestObject(path_ManAuth + 'input_userDefined7'), UDF7)
		WebUI.setText(findTestObject(path_ManAuth + 'input_userDefined8'), UDF8)
		WebUI.setText(findTestObject(path_ManAuth + 'input_userDefined9'), UDF9)
		WebUI.setText(findTestObject(path_ManAuth + 'input_userDefined10'), UDF10)

		WebUI.click(findTestObject(path_ManAuth + 'button_Submit'))
	}

	//##################################################################################################################################



	@Keyword
	def setDataSaleKeyboard(CardName, TranxCategory, CardNumber, CSC, ExpMM, ExpYYYY, AL1, AL2, ZIP, Email, Phone, Amount, UDF1, UDF2, UDF3, UDF4, UDF5, UDF6, UDF7, UDF8, UDF9, UDF10) {

		String path_SaleKB = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SaleKeyboard/"

		WebUI.setText(findTestObject(path_SaleKB + 'input_cardName'), CardName)
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_transactionCategory'), TranxCategory, true)
		WebElement element = WebUiCommonHelper.findWebElement(findTestObject(path_SaleKB + 'input__cardNumber2'),30)
		WebUI.executeJavaScript("arguments[0].value ='"+ CardNumber+"' "  , Arrays.asList(element))
		WebElement element2 = WebUiCommonHelper.findWebElement(findTestObject(path_SaleKB + 'input__cvv'),30)
		WebUI.executeJavaScript("arguments[0].value ='"+ CSC+"' ", Arrays.asList(element2))
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_MM'), ExpMM, true)
		WebUI.selectOptionByValue(findTestObject(path_SaleKB + 'select_YYYY'), ExpYYYY, true)
		WebUI.setText(findTestObject(path_SaleKB + 'input__address'), AL1)
		WebUI.setText(findTestObject(path_SaleKB + 'input__address2'), AL2)
		WebUI.setText(findTestObject(path_SaleKB + 'input__zip'), ZIP)
		WebUI.setText(findTestObject(path_SaleKB + 'input_emailAddress'), Email)
		WebUI.setText(findTestObject(path_SaleKB + 'input_smsNumber'), Phone)
		WebUI.setText(findTestObject(path_SaleKB + 'input_amount'), Amount)

		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined1'), UDF1)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined2'), UDF2)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined3'), UDF3)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined4'), UDF4)
		WebUI.selectOptionByLabel(findTestObject(path_SaleKB + 'select_UDF5_DropDown'), UDF5, true)
		WebUI.selectOptionByLabel(findTestObject(path_SaleKB + 'select_UDF6_DropDown'), UDF6, true)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined7'), UDF7)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined8'), UDF8)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined9'), UDF9)
		WebUI.setText(findTestObject(path_SaleKB + 'input_userDefined10'), UDF10)

		WebUI.click(findTestObject(path_SaleKB + 'button_Submit'))
	}
}
