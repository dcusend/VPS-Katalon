package customClasses

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

public class Vrelay30class {

	def AppID
	def MessageVersion


	def getDataMethod(int rowM, String dataFileM) {

		def fileM = dataFileM
		println(fileM)

		AppID = findTestData(fileM).getValue('AppID', rowM)
		println(AppID)


		MessageVersion = findTestData(fileM).getValue('MessageVersion', rowM)
		println(MessageVersion)
	}


	def setDataMethod(int rowS, String dataFileS) {

		this.getDataMethod(rowS, dataFileS)

		def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)

		if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'), 30)) {
			println("We are on Test Harness page, start populating")

			WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/ApplicationID'),AppID)
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/MessageVersion'),MessageVersion)
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'),genRemIDVoid)
		}

		else {
			println ("Not on Test Harness page")
		}
	}
}
