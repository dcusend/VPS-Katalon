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

public class ModifyProfilePage {

	String profileName, compName, title, firstName, middleName, lastName, suffix, al1, al2, zipCode, zipCodeExt, emailAddress
	String homePhone1, homePhone2, homePhone3, Comments



	@Keyword
	def setDataModifyProfile(int rowS, String dataFileS) {

		// GetData
		profileName = findTestData(dataFileS).getValue('ProfileNameMod', rowS)
		compName = findTestData(dataFileS).getValue('CompNameMod', rowS)
		title = findTestData(dataFileS).getValue('TitleMod', rowS)
		firstName = findTestData(dataFileS).getValue('FNameMod', rowS)
		middleName = findTestData(dataFileS).getValue('MNameMod', rowS)
		lastName = findTestData(dataFileS).getValue('LNameMod', rowS)
		suffix = findTestData(dataFileS).getValue('SuffixMod', rowS)
		al1 = findTestData(dataFileS).getValue('AL1Mod', rowS)
		al2 = findTestData(dataFileS).getValue('AL2Mod', rowS)
		zipCode = findTestData(dataFileS).getValue('ZIPMod', rowS)
		zipCodeExt = findTestData(dataFileS).getValue('ZIPExtMod', rowS)
		emailAddress = findTestData(dataFileS).getValue('EmailMod', rowS)

		homePhone1 = findTestData(dataFileS).getValue('HomePhone1Mod', rowS)
		homePhone2 = findTestData(dataFileS).getValue('HomePhone2Mod', rowS)
		homePhone3 = findTestData(dataFileS).getValue('HomePhone3Mod', rowS)
		Comments = findTestData(dataFileS).getValue('CommentsMod', rowS)





		// SetData

		String path_ModifyProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/ModifyProfile/"

		WebUI.setText(findTestObject(path_ModifyProfile + 'input_postalCode'), zipCode)


		WebUI.setText(findTestObject(path_ModifyProfile + 'input_profileName'), profileName)


		WebUI.setText(findTestObject(path_ModifyProfile + 'input_CompanyName'), compName)
		WebUI.selectOptionByLabel(findTestObject(path_ModifyProfile + 'select_Title'), title, true)
		WebUI.setText(findTestObject(path_ModifyProfile + 'input_FirstName'), firstName)
		WebUI.setText(findTestObject(path_ModifyProfile + 'input_MiddleName'), middleName)
		WebUI.setText(findTestObject(path_ModifyProfile + 'input_LastName'), lastName)
		WebUI.selectOptionByLabel(findTestObject(path_ModifyProfile + 'select_Suffix'), suffix, true)
		WebUI.setText(findTestObject(path_ModifyProfile + 'input_address1'), al1)
		WebUI.setText(findTestObject(path_ModifyProfile + 'input_AddressLine2'), al2)


		WebUI.setText(findTestObject(path_ModifyProfile + 'input_postalCodeExtension'), zipCodeExt)

		WebUI.setText(findTestObject(path_ModifyProfile + 'input_EmailAddress'), emailAddress)
		WebUI.setText(findTestObject(path_ModifyProfile + 'input_Home Phone Number_homeAreaCode'), homePhone1)
		WebUI.setText(findTestObject(path_ModifyProfile + 'input_homePrefixNumber'), homePhone2)
		WebUI.setText(findTestObject(path_ModifyProfile + 'input_homeSuffixNumber'), homePhone3)

		WebUI.setText(findTestObject(path_ModifyProfile + 'textarea_NotesComments_note'), Comments)


		// Select Modify button
		WebUI.click(findTestObject(path_ModifyProfile + 'button_Modify'))




	}
}
