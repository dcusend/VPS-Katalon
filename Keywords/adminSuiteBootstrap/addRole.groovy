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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

import internal.GlobalVariable

public class addRole {


	String roleName

	String path_Role = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/Role/"

	@Keyword
	def setDataAddRole(int rowS, String dataFileS) {
		// GetData
		roleName = findTestData(dataFileS).getValue('RoleName', rowS)

		// SetData

		if (WebUI.verifyElementPresent(findTestObject(path_Role + 'input_roleName'), 30)) {
			WebUI.setText(findTestObject(path_Role + 'input_roleName'), roleName)

			WebUI.click(findTestObject(path_Role + 'button_CreateRole'))
		}
		else {
			KeywordUtil.markFailed("Not on the Add Role page")
		}
	}

	@Keyword
	def setDataAddRoleEF(int rowS, dataFileS) {
		// GetData
		roleName = dataFileS.getValue('RoleName', rowS)

		// SetData

		if (WebUI.verifyElementPresent(findTestObject(path_Role + 'input_roleName'), 30)) {
			WebUI.setText(findTestObject(path_Role + 'input_roleName'), roleName)

			WebUI.click(findTestObject(path_Role + 'button_CreateRole'))
		}
		else {
			KeywordUtil.markFailed("Not on the Add Role page")
		}
	}
}





















