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

public class debitCorporatesetData {


	@Keyword
	def debitCorporate_DataDriven(int rowS, String dataFileS) {

		String compName, al1, al2, zipCode, emailAddress, phoneNumber
		String acNumber, rtn, acType, sec, amount,ein
		String UDF1,UDF2,UDF3,UDF4,UDF5,UDF6,UDF7,UDF8,UDF9,UDF10


		// GetData
		compName = findTestData(dataFileS).getValue('CompanyName', rowS)
		al1 = findTestData(dataFileS).getValue('AL1', rowS)
		al2 = findTestData(dataFileS).getValue('AL2', rowS)
		zipCode = findTestData(dataFileS).getValue('ZIP', rowS)
		emailAddress = findTestData(dataFileS).getValue('EmailAddress', rowS)
		phoneNumber = findTestData(dataFileS).getValue('PhoneNumber', rowS)
		acNumber = findTestData(dataFileS).getValue('AccountNumber', rowS)
		rtn = findTestData(dataFileS).getValue('RTN', rowS)
		acType = findTestData(dataFileS).getValue('AccountType', rowS)
		sec = findTestData(dataFileS).getValue('SEC', rowS)
		amount = findTestData(dataFileS).getValue('Amount', rowS)
		ein = findTestData(dataFileS).getValue('EmployeeID', rowS)
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
		String path_DebitCorporate = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/ACHCorporate/"


		WebUI.setText(findTestObject(path_DebitCorporate + 'input_companyName'), compName)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_address'), al1)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_address2'), al2)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_zip'), zipCode)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_emailAddress'), emailAddress)



		if ((!phoneNumber.isEmpty())) {
			WebUI.setText(findTestObject(path_DebitCorporate + 'input_smsNumber'), phoneNumber)
		}
		else {
			println("Phone Number is not present in the Excel Spreadsheet")
		}


		WebUI.setText(findTestObject(path_DebitCorporate + 'input_accountNumber'), acNumber)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_routingNumber'), rtn)
		WebUI.selectOptionByLabel(findTestObject(path_DebitCorporate + 'select_Checking'), acType, true)
		WebUI.selectOptionByLabel(findTestObject(path_DebitCorporate + 'select_STD'), sec, true)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_amount'), amount)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_ein'), ein)




		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined1'), UDF1)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined2'), UDF2)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined3'), UDF3)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined4'), UDF4)
		WebUI.selectOptionByLabel(findTestObject(path_DebitCorporate + 'select_UDF5'), UDF5, true)
		WebUI.selectOptionByLabel(findTestObject(path_DebitCorporate + 'select_UDF6'), UDF6, true)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined7'), UDF7)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined8'), UDF8)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined9'), UDF9)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined10'), UDF10)

		WebUI.click(findTestObject(path_DebitCorporate + 'button_Submit'))
	}

	@Keyword
	def debitCorporate_DataDriven_EF(int rowS, dataFileS) {

		String compName, al1, al2, zipCode, emailAddress, phoneNumber
		String acNumber, rtn, acType, sec, amount,ein
		String UDF1,UDF2,UDF3,UDF4,UDF5,UDF6,UDF7,UDF8,UDF9,UDF10


		// GetData
		compName = dataFileS.getValue('CompanyName', rowS)
		al1 = dataFileS.getValue('AL1', rowS)
		al2 = dataFileS.getValue('AL2', rowS)
		zipCode = dataFileS.getValue('ZIP', rowS)
		emailAddress = dataFileS.getValue('EmailAddress', rowS)
		phoneNumber = dataFileS.getValue('PhoneNumber', rowS)
		acNumber = dataFileS.getValue('AccountNumber', rowS)
		rtn = dataFileS.getValue('RTN', rowS)
		acType = dataFileS.getValue('AccountType', rowS)
		sec = dataFileS.getValue('SEC', rowS)
		amount = dataFileS.getValue('Amount', rowS)
		ein = dataFileS.getValue('EmployeeID', rowS)
		UDF1 = dataFileS.getValue('UDF1', rowS)
		UDF2 = dataFileS.getValue('UDF2', rowS)
		UDF3 = dataFileS.getValue('UDF3', rowS)
		UDF4 = dataFileS.getValue('UDF4', rowS)
		UDF5 = dataFileS.getValue('UDF5', rowS)
		UDF6 = dataFileS.getValue('UDF6', rowS)
		UDF7 = dataFileS.getValue('UDF7', rowS)
		UDF8 = dataFileS.getValue('UDF8', rowS)
		UDF9 = dataFileS.getValue('UDF9', rowS)
		UDF10 = dataFileS.getValue('UDF10', rowS)

		// SetData
		String path_DebitCorporate = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/ACHCorporate/"
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_zip'), zipCode)

		Thread.sleep(5000)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_companyName'), compName)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_address'), al1)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_address2'), al2)
		Thread.sleep(5000)
		//		WebUI.setText(findTestObject(path_DebitCorporate + 'input_emailAddress'), emailAddress)


		if ((!emailAddress.isEmpty())) {
			WebUI.setText(findTestObject(path_DebitCorporate + 'input_emailAddress'), emailAddress)
		}
		else {
			println("Email Address is not present in the Excel Spreadsheet")
		}


		if ((!phoneNumber.isEmpty())) {
			WebUI.setText(findTestObject(path_DebitCorporate + 'input_smsNumber'), phoneNumber)
		}
		else {
			println("Phone Number is not present in the Excel Spreadsheet")
		}


		WebUI.setText(findTestObject(path_DebitCorporate + 'input_accountNumber'), acNumber)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_routingNumber'), rtn)
		WebUI.selectOptionByLabel(findTestObject(path_DebitCorporate + 'select_Checking'), acType, true)
		WebUI.selectOptionByLabel(findTestObject(path_DebitCorporate + 'select_STD'), sec, true)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_amount'), amount)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_ein'), ein)


		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined1'), UDF1)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined2'), UDF2)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined3'), UDF3)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined4'), UDF4)
		WebUI.selectOptionByLabel(findTestObject(path_DebitCorporate + 'select_UDF5'), UDF5, true)
		WebUI.selectOptionByLabel(findTestObject(path_DebitCorporate + 'select_UDF6'), UDF6, true)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined7'), UDF7)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined8'), UDF8)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined9'), UDF9)
		WebUI.setText(findTestObject(path_DebitCorporate + 'input_userDefined10'), UDF10)

		Thread.sleep(2000)

		WebUI.click(findTestObject(path_DebitCorporate + 'button_Submit'))
	}
}
