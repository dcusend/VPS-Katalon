package bwpPagesBootstrap

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

import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory


public class emulatorBootstrapPage {

	def MV, Amount, TaxAmount, CAN, Action, Lang, Fname, Lname, AL1, AL2
	def Country, City, State, ZIP, Order, CompanyName, Email
	def UDF1, UDF2, UDF3, UDF4, UDF5, UDF6, UDF7, UDF8, UDF9, UDF10
	def AppID, MessageVersion, RemID, ID, em_Username, em_Password, Parcels

	String pathEmulatorData = "KatalonData/BWPBootstrapData/EmulatorNormalizedData.xlsx"
	String pathOR = "Object Repository/BWP_Bootstrap/Page_Emulator/"

	@Keyword
	def setDataEmulator_DD(String emulatorID) {

		// GetData
		def dataFileE = ExcelFactory.getExcelDataWithDefaultSheet(pathEmulatorData, "EmulatorData", true)

		def numOfRowsE = dataFileE.getRowNumbers()
		println("Number of Records: " + numOfRowsE)

		for (def rowE = 1; rowE <= numOfRowsE; rowE++) {
			ID = dataFileE.getValue('ID', rowE)

			println(ID)
			println(dataFileE.getValue('Amount', rowE))
			if (ID.equals(emulatorID)) {
				CAN = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
				MV = dataFileE.getValue('MV', rowE)
				AppID = dataFileE.getValue('AppID', rowE)
				Amount = dataFileE.getValue('Amount', rowE)
				TaxAmount = dataFileE.getValue('TaxAmount', rowE)
				UDF1 = dataFileE.getValue('UDF1', rowE)
				UDF2 = dataFileE.getValue('UDF2', rowE)
				UDF3 = dataFileE.getValue('UDF3', rowE)
				UDF4 = dataFileE.getValue('UDF4', rowE)
				UDF5 = dataFileE.getValue('UDF5', rowE)
				UDF6 = dataFileE.getValue('UDF6', rowE)
				UDF7 = dataFileE.getValue('UDF7', rowE)
				UDF8 = dataFileE.getValue('UDF8', rowE)
				UDF9 = dataFileE.getValue('UDF9', rowE)
				UDF10 = dataFileE.getValue('UDF10', rowE)

				// SetData

				def emulator_url = GlobalVariable.BWPURL


				WebUI.openBrowser(emulator_url)
				WebUI.maximizeWindow()

				if(findTestObject(pathOR +  'ApplicationID')) {
					//	Verify if u r on correct page (Verify App id text box)
					WebUI.setText(findTestObject(pathOR + 'MessageVersion'),MV)

					WebUI.setText(findTestObject(pathOR +  'ApplicationID'), AppID)
					WebUI.setText(findTestObject(pathOR +  'TaxAmount'), TaxAmount)
					WebUI.setText(findTestObject(pathOR +  'Amount'), Amount)
					WebUI.setText(findTestObject(pathOR +  'CAN'), CAN)
					WebUI.setText(findTestObject(pathOR + 'UDF1'), UDF1)
					WebUI.setText(findTestObject(pathOR + 'UDF2'), UDF2)
					WebUI.setText(findTestObject(pathOR + 'UDF3'), UDF3)
					WebUI.setText(findTestObject(pathOR + 'UDF4'), UDF4)
					WebUI.setText(findTestObject(pathOR + 'UDF5'), UDF5)
					WebUI.setText(findTestObject(pathOR + 'UDF6'), UDF6)
					WebUI.setText(findTestObject(pathOR + 'UDF7'), UDF7)
					WebUI.setText(findTestObject(pathOR + 'UDF8'), UDF8)
					WebUI.setText(findTestObject(pathOR + 'UDF9'), UDF9)
					WebUI.setText(findTestObject(pathOR + 'UDF10'), UDF10)

					WebUI.click(findTestObject(pathOR + 'Submit_btn'))
				}
			}
		}
	}
}
