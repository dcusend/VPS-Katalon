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

public class CreateProfilePage {


	@Keyword
	def setDataCreateProfile(int rowS, String dataFileS) {

		String profileName, compName, title,firstName, middleName, lastName, suffix, al1, al2, country, zipCode, zipCodeExt, city, State, emailAddress
		String homePhone1, homePhone2, homePhone3, mobilePhone1, mobilePhone2, mobilePhone3, workPhone1, workPhone2, workPhone3
		String workPhoneExt, Comments


		// GetData
		compName = findTestData(dataFileS).getValue('CompanyName', rowS)
		title = findTestData(dataFileS).getValue('Title', rowS)
		firstName = findTestData(dataFileS).getValue('FirstName', rowS)
		middleName = findTestData(dataFileS).getValue('MiddleName', rowS)
		lastName = findTestData(dataFileS).getValue('LastName', rowS)
		suffix = findTestData(dataFileS).getValue('Suffix', rowS)
		al1 = findTestData(dataFileS).getValue('AL1', rowS)
		al2 = findTestData(dataFileS).getValue('AL2', rowS)
		country = findTestData(dataFileS).getValue('Country', rowS)
		zipCode = findTestData(dataFileS).getValue('ZIP', rowS)
		zipCodeExt = findTestData(dataFileS).getValue('ZipExt', rowS)
		city = findTestData(dataFileS).getValue('City', rowS)
		State = findTestData(dataFileS).getValue('State', rowS)
		emailAddress = findTestData(dataFileS).getValue('Email', rowS)

		homePhone1 = findTestData(dataFileS).getValue('HomePhone1', rowS)
		homePhone2 = findTestData(dataFileS).getValue('HomePhone2', rowS)
		homePhone3 = findTestData(dataFileS).getValue('HomePhone3', rowS)
		mobilePhone1 = findTestData(dataFileS).getValue('MobilePhone1', rowS)
		mobilePhone2 = findTestData(dataFileS).getValue('MobilePhone2', rowS)
		mobilePhone3 = findTestData(dataFileS).getValue('MobilePhone3', rowS)
		workPhone1 = findTestData(dataFileS).getValue('WorkPhone1', rowS)
		workPhone2 = findTestData(dataFileS).getValue('WorkPhone2', rowS)
		workPhone3 = findTestData(dataFileS).getValue('WorkPhone3', rowS)
		workPhoneExt = findTestData(dataFileS).getValue('WorkPhoneExt', rowS)
		Comments = findTestData(dataFileS).getValue('Comments', rowS)


		// SetData

		String path_CreateProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/CreateProfile/"

		WebUI.setText(findTestObject(path_CreateProfile + 'input_PostalCode'), zipCode)

		def genProfileName = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_profileName'), genProfileName)

		WebUI.setText(findTestObject(path_CreateProfile + 'input_CompanyName'), compName)
		WebUI.selectOptionByLabel(findTestObject(path_CreateProfile + 'select_Title'), title, true)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_FirstName'), firstName)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_MiddleName'), middleName)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_LastName'), lastName)
		WebUI.selectOptionByLabel(findTestObject(path_CreateProfile + 'select_Suffix'), suffix, true)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_address1'), al1)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_AddressLine2'), al2)
		//WebUI.selectOptionByLabel(findTestObject(path_CreateProfile + 'select_Country'), country, true)

		WebUI.setText(findTestObject(path_CreateProfile + 'input_PostalCodeExt'), zipCodeExt)
		//WebUI.setText(findTestObject(path_CreateProfile + 'input_City'), city)
		//WebUI.selectOptionByLabel(findTestObject(path_CreateProfile + 'select_State'), State, true)

		WebUI.setText(findTestObject(path_CreateProfile + 'input_EmaiAddress'), emailAddress)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_HomePhoneNumber_HomeAreaCode'), homePhone1)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_homePrefixNumber'), homePhone2)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_homeSuffixNumber'), homePhone3)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_MobilePhoneNumber_mobileAreaCode'), mobilePhone1)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_mobilePrefixNumber'), mobilePhone2)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_mobileSuffixNumber'), mobilePhone3)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_WorkPhoneNumber_workAreaCode'), workPhone1)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_workPrefixNumber'), workPhone2)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_workSuffixNumber'), workPhone3)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_Ext_workExtension'), workPhoneExt)

		WebUI.setText(findTestObject(path_CreateProfile + 'textarea_NotesComments_note'), Comments)




		// Select Save button
		WebUI.click(findTestObject(path_CreateProfile + 'button_Save'))



	}


	@Keyword
	def setDataONLYCreateProfile(int rowS, String dataFileS) {

		String profileName, compName, title,firstName, middleName, lastName, suffix, al1, al2, country, zipCode, zipCodeExt, city, State, emailAddress
		String homePhone1, homePhone2, homePhone3, mobilePhone1, mobilePhone2, mobilePhone3, workPhone1, workPhone2, workPhone3
		String workPhoneExt, Comments


		// GetData
		compName = findTestData(dataFileS).getValue('CompanyName', rowS)
		title = findTestData(dataFileS).getValue('Title', rowS)
		firstName = findTestData(dataFileS).getValue('FirstName', rowS)
		middleName = findTestData(dataFileS).getValue('MiddleName', rowS)
		lastName = findTestData(dataFileS).getValue('LastName', rowS)
		suffix = findTestData(dataFileS).getValue('Suffix', rowS)
		al1 = findTestData(dataFileS).getValue('AL1', rowS)
		al2 = findTestData(dataFileS).getValue('AL2', rowS)
		country = findTestData(dataFileS).getValue('Country', rowS)
		zipCode = findTestData(dataFileS).getValue('ZIP', rowS)
		zipCodeExt = findTestData(dataFileS).getValue('ZipExt', rowS)
		city = findTestData(dataFileS).getValue('City', rowS)
		State = findTestData(dataFileS).getValue('State', rowS)
		emailAddress = findTestData(dataFileS).getValue('Email', rowS)

		homePhone1 = findTestData(dataFileS).getValue('HomePhone1', rowS)
		homePhone2 = findTestData(dataFileS).getValue('HomePhone2', rowS)
		homePhone3 = findTestData(dataFileS).getValue('HomePhone3', rowS)
		mobilePhone1 = findTestData(dataFileS).getValue('MobilePhone1', rowS)
		mobilePhone2 = findTestData(dataFileS).getValue('MobilePhone2', rowS)
		mobilePhone3 = findTestData(dataFileS).getValue('MobilePhone3', rowS)
		workPhone1 = findTestData(dataFileS).getValue('WorkPhone1', rowS)
		workPhone2 = findTestData(dataFileS).getValue('WorkPhone2', rowS)
		workPhone3 = findTestData(dataFileS).getValue('WorkPhone3', rowS)
		workPhoneExt = findTestData(dataFileS).getValue('WorkPhoneExt', rowS)
		Comments = findTestData(dataFileS).getValue('Comments', rowS)


		// SetData

		String path_CreateProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/CreateProfile/"

		WebUI.setText(findTestObject(path_CreateProfile + 'input_PostalCode'), zipCode)

		def genProfileName = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_profileName'), genProfileName)

		WebUI.setText(findTestObject(path_CreateProfile + 'input_CompanyName'), compName)
		WebUI.selectOptionByLabel(findTestObject(path_CreateProfile + 'select_Title'), title, true)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_FirstName'), firstName)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_MiddleName'), middleName)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_LastName'), lastName)
		WebUI.selectOptionByLabel(findTestObject(path_CreateProfile + 'select_Suffix'), suffix, true)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_address1'), al1)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_AddressLine2'), al2)
		//WebUI.selectOptionByLabel(findTestObject(path_CreateProfile + 'select_Country'), country, true)

		WebUI.setText(findTestObject(path_CreateProfile + 'input_PostalCodeExt'), zipCodeExt)
		//WebUI.setText(findTestObject(path_CreateProfile + 'input_City'), city)
		//WebUI.selectOptionByLabel(findTestObject(path_CreateProfile + 'select_State'), State, true)

		WebUI.setText(findTestObject(path_CreateProfile + 'input_EmaiAddress'), emailAddress)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_HomePhoneNumber_HomeAreaCode'), homePhone1)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_homePrefixNumber'), homePhone2)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_homeSuffixNumber'), homePhone3)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_MobilePhoneNumber_mobileAreaCode'), mobilePhone1)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_mobilePrefixNumber'), mobilePhone2)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_mobileSuffixNumber'), mobilePhone3)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_WorkPhoneNumber_workAreaCode'), workPhone1)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_workPrefixNumber'), workPhone2)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_workSuffixNumber'), workPhone3)
		WebUI.setText(findTestObject(path_CreateProfile + 'input_Ext_workExtension'), workPhoneExt)

		WebUI.setText(findTestObject(path_CreateProfile + 'textarea_NotesComments_note'), Comments)




		// Select Save button
		//WebUI.click(findTestObject(path_CreateProfile + 'button_Save'))



	}
}
