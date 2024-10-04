package iwpPages
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

//import MobileBuiltInKeywords as Mobile
//import WSBuiltInKeywords as WS
//import WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException



class emulatorIWP30 {
	/**
	 * Refresh browser
	 */


	def MV, Amount, CAN, Action, Lang, Fname, Lname, AL1, AL2
	def Country, City, State, ZIP, Order, CompanyName, Email
	def UDF1, UDF2, UDF3, UDF4, UDF5, UDF6, UDF7, UDF8, UDF9, UDF10
	def AppID, MessageVersion, RemID, ID, em_Username, em_Password, Parcels

	@Keyword
	def getSetData(int row, String gsdDataFile) {

		println("Hello World")

		//Begin Get Data

		def dFile = gsdDataFile
		println(dFile)

		MV = findTestData(dFile).getValue('MV', row)
		println(MV)


		Amount = findTestData(dFile).getValue('Amount', row)

		println(Amount)

		CAN = findTestData(dFile).getValue('CAN', row)

		println(CAN)

		Action = findTestData(dFile).getValue('Action', row)

		println(Action)

		Lang = findTestData(dFile).getValue('Lang', row)

		println(Lang)

		Fname = findTestData(dFile).getValue('Fname', row)

		println(Fname)

		Lname = findTestData(dFile).getValue('Lname', row)

		println(Lname)

		AL1 = findTestData(dFile).getValue('AL1', row)

		println(AL1)

		AL2 = findTestData(dFile).getValue('AL2', row)

		println(AL2)

		Country = findTestData(dFile).getValue('Country', row)

		println(Country)

		City = findTestData(dFile).getValue('City', row)

		println(City)

		State = findTestData(dFile).getValue('State', row)

		println(State)

		ZIP = findTestData(dFile).getValue('ZIP', row)

		println(ZIP)

		Order = findTestData(dFile).getValue('Order', row)

		println(Order)

		CompanyName = findTestData(dFile).getValue('CompanyName', row)

		println(CompanyName)

		Email = findTestData(dFile).getValue('Email', row)

		println(Email)

		UDF1 = findTestData(dFile).getValue('UDF1', row)

		println(UDF1)

		UDF2 = findTestData(dFile).getValue('UDF2', row)

		println(UDF2)

		UDF3 = findTestData(dFile).getValue('UDF3', row)

		println(UDF3)

		UDF4 = findTestData(dFile).getValue('UDF4', row)

		println(UDF4)

		UDF5 = findTestData(dFile).getValue('UDF5', row)

		println(UDF5)

		UDF6 = findTestData(dFile).getValue('UDF6', row)

		println(UDF6)

		UDF7 = findTestData(dFile).getValue('UDF7', row)

		println(UDF7)

		UDF8 = findTestData(dFile).getValue('UDF8', row)

		println(UDF8)

		UDF9 = findTestData(dFile).getValue('UDF9', row)

		println(UDF9)

		UDF10 = findTestData(dFile).getValue('UDF10', row)

		println(UDF10)

		//End Get Data

		//WebUI.openBrowser('https://qa.velocitypayment.com/agency/config.do?action=editor')

		//WebUI.maximizeWindow()

		//Begin setData

		//  findTestObject('IWP30/Page_VRelay30Emulator/MV')

		WebUI.selectOptionByValue(findTestObject('IWP30/Page_VRelay30Emulator/MV'),MV, true)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Amount'),Amount)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/CAN'),CAN)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Action'),Action)

		//WebUI.click(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/td'))

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lang'),Lang)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Fname'),Fname)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lname'),Lname)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL1'),AL1)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL2'),AL2)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Country'),Country)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/City'),City)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/State'),State)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/ZIP'),ZIP)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Order'),Order)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Company'),CompanyName)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Email'),Email)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF1'),UDF1)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF2'),UDF2)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF3'),UDF3)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF4'),UDF4)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF5'),UDF5)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF6'),UDF6)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF7'),UDF7)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF8'),UDF8)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF9'),UDF9)

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF10'),UDF10)
		Thread.sleep(10000)

		WebUI.click(findTestObject('IWP30/Page_VRelay30Emulator/Submit'))

		// End Set Data
	}


	// This method populates the Emulator with very few fields like Amount, MV, CAN, Action, Lang
	// UDFs 3, 4, 5, 6, 7, 8, 9, 10

	@Keyword
	def setDataEmulatorStandard() {


		if (WebUI.verifyElementPresent(findTestObject('IWP30/Page_VRelay30Emulator/Amount'), 30)) {

			println ("We are on the Emulator page, start populating")

			WebUI.selectOptionByValue(findTestObject('IWP30/Page_VRelay30Emulator/MV'),"3.0", true)

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Amount'),"10.50")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/CAN'),"54654701")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Action'),"PayNow")


			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lang'),"en_US")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Fname'),"")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lname'),"")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL1'),"")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL2'),"")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Country'),"")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/City'),"")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/State'),"")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/ZIP'),"")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Order'),"")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Company'),"")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Email'),"")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF1'),"")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF2'),"")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF3'),"data 3")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF4'),"data 4")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF5'),"data 5")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF6'),"data 6")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF7'),"Orange")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF8'),"Soccer")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF9'),"data 9")

			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF10'),"data 10")
			Thread.sleep(2000)

			WebUI.click(findTestObject('IWP30/Page_VRelay30Emulator/Submit'))

			Thread.sleep(5000)

			// End setData

			WebUI.closeBrowser()
		}
		else {
			println ("We are not on Emulator page")
		}
	}



	@Keyword
	def setDataEmulator_DD(String emulatorID) {

		// GetData


		//nameSheet = "PayNowData"


		def dataFileE = "IWPTestData/EmulatorData"

		def numOfRowsE = findTestData('IWPTestData/EmulatorData').getRowNumbers()
		println("Number of Records: " + numOfRowsE)


		for (def rowE = 1; rowE <= numOfRowsE; rowE++) {


			ID = findTestData(dataFileE).getValue('ID', rowE)


			if (ID.equals(emulatorID)) {


				MV = findTestData(dataFileE).getValue('MV', rowE)
				Amount = findTestData(dataFileE).getValue('Amount', rowE)

				println(CAN)
				if((CAN == null)) {
					CAN = org.apache.commons.lang.RandomStringUtils.random(12, true, true)

				}
				else {
					CAN = findTestData(dataFileE).getValue('CAN', rowE)
				}
				Action = findTestData(dataFileE).getValue('Action', rowE)
				Lang = findTestData(dataFileE).getValue('Lang', rowE)
				Fname = findTestData(dataFileE).getValue('Fname', rowE)
				Lname = findTestData(dataFileE).getValue('Lname', rowE)
				AL1 = findTestData(dataFileE).getValue('AL1', rowE)
				AL2 = findTestData(dataFileE).getValue('AL2', rowE)
				Country = findTestData(dataFileE).getValue('Country', rowE)
				City = findTestData(dataFileE).getValue('City', rowE)
				State = findTestData(dataFileE).getValue('State', rowE)
				ZIP = findTestData(dataFileE).getValue('ZIP', rowE)
				Order = findTestData(dataFileE).getValue('Order', rowE)
				CompanyName = findTestData(dataFileE).getValue('CompanyName', rowE)
				Email = findTestData(dataFileE).getValue('Email', rowE)
				UDF1 = findTestData(dataFileE).getValue('UDF1', rowE)
				UDF2 = findTestData(dataFileE).getValue('UDF2', rowE)
				UDF3 = findTestData(dataFileE).getValue('UDF3', rowE)
				UDF4 = findTestData(dataFileE).getValue('UDF4', rowE)
				UDF5 = findTestData(dataFileE).getValue('UDF5', rowE)
				UDF6 = findTestData(dataFileE).getValue('UDF6', rowE)
				UDF7 = findTestData(dataFileE).getValue('UDF7', rowE)
				UDF8 = findTestData(dataFileE).getValue('UDF8', rowE)
				UDF9 = findTestData(dataFileE).getValue('UDF9', rowE)
				UDF10 = findTestData(dataFileE).getValue('UDF10', rowE)
				em_Username = findTestData(dataFileE).getValue('Username', rowE)
				em_Password = findTestData(dataFileE).getValue('Password', rowE)
				Parcels = findTestData(dataFileE).getValue('Parcels', rowE)



				// SetData


				def emulator_url = GlobalVariable.urlEmulator
				def useThisURL

				switch (MV) {
					case "2.3":
						useThisURL = emulator_url + "&message_version=2_3"
						break

					case "2.5":
						useThisURL = emulator_url + "&message_version=2_5"
						break

					case "2.7":
						useThisURL = emulator_url + "&message_version=2_7"
						break

					case "3.0":
						useThisURL = emulator_url + "&message_version=3_0"
						break
				}




				WebUI.openBrowser(useThisURL)
				WebUI.maximizeWindow()
				//Thread.sleep(5000)



				WebUI.selectOptionByValue(findTestObject('IWP30/Page_VRelay30Emulator/MV'),MV, true)
				//Thread.sleep(5000)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Amount'),Amount)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/CAN'),CAN)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Action'),Action)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lang'),Lang)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Fname'),Fname)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lname'),Lname)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL1'),AL1)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL2'),AL2)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Country'),Country)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/City'),City)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/State'),State)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/ZIP'),ZIP)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Order'),Order)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Company'),CompanyName)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Email'),Email)

				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF1'),UDF1)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF2'),UDF2)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF3'),UDF3)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF4'),UDF4)
				WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF5'),UDF5)

				if (MV != "2.3") {
					println "MV is not 2.3"
					WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF6'),UDF6)
					WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF7'),UDF7)
					WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF8'),UDF8)
					WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF9'),UDF9)
					WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF10'),UDF10)
				}



				if (MV == "2.7") {
					println "MV is 2.7"

					WebUI.setText(findTestObject('Object Repository/IWP30/Page_VRelay30Emulator/input_Username'),em_Username)
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_VRelay30Emulator/input_Password'),em_Password)
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_VRelay30Emulator/textarea_Parcel'),Parcels)
				}





				/*if ((!UDF1.isEmpty()))
				 {
				 WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF1'),UDF1)
				 }
				 else {println("UDF1 is not present in the Excel Spreadsheet")}
				 if ((!UDF2.isEmpty()))
				 {
				 WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF2'),UDF2)
				 }
				 else {println("UDF2 is not present in the Excel Spreadsheet")}
				 if ((!UDF3.isEmpty()))
				 {
				 WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF3'),UDF3)
				 }
				 else {println("UDF3 is not present in the Excel Spreadsheet")}
				 if ((!UDF4.isEmpty()))
				 {
				 WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF4'),UDF4)
				 }
				 else {println("UDF4 is not present in the Excel Spreadsheet")}
				 if ((!UDF5.isEmpty()))
				 {
				 WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF5'),UDF5)
				 }
				 else {println("UDF5 is not present in the Excel Spreadsheet")}
				 if ((!UDF6.isEmpty()))
				 {
				 WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF6'),UDF6)
				 }
				 else {println("UDF6 is not present in the Excel Spreadsheet")}
				 if ((!UDF7.isEmpty()))
				 {
				 WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF7'),UDF7)
				 }
				 else {println("UDF7 is not present in the Excel Spreadsheet")}
				 if ((!UDF8.isEmpty()))
				 {
				 WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF8'),UDF8)
				 }
				 else {println("UDF8 is not present in the Excel Spreadsheet")}
				 if ((!UDF9.isEmpty()))
				 {
				 WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF9'),UDF9)
				 }
				 else {println("UDF9 is not present in the Excel Spreadsheet")}
				 if ((!UDF10.isEmpty()))
				 {
				 WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF10'),UDF10)
				 }
				 else {println("UDF10 is not present in the Excel Spreadsheet")}
				 */



				//WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF1'),UDF1)
				//WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF2'),UDF2)
				//WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF3'),UDF3)
				//WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF4'),UDF4)
				//WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF5'),UDF5)
				//WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF6'),UDF6)
				//WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF7'),UDF7)
				//WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF8'),UDF8)
				//WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF9'),UDF9)
				//WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF10'),UDF10)
				//Thread.sleep(2000)

				WebUI.click(findTestObject('IWP30/Page_VRelay30Emulator/Submit'))
				Thread.sleep(4000)

				WebUI.closeBrowser()

				Thread.sleep(4000)
			}
		}
	}




	//	@Keyword
	//	def getSetTestHarness(int gsthRow, String gsthDataFile) {
	//
	//		def gsthDFile = gsthDataFile
	//		println(gsthDFile)
	//
	//		// Begin Get Data
	//		AppID = findTestData(gsthDFile).getValue('AppID', gsthRow)
	//		println(MV)
	//
	//		MessageVersion = findTestData(gsthDFile).getValue('MessageVersion', gsthRow)
	//		println(MessageVersion)
	//
	//		def genRandomRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
	//
	//		//Verify if we are on the TestHarness page and Populate the TestHarness
	//
	//		if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'), 30))
	//		{
	//			println("We are on Test Harness page, start populating")
	//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/ApplicationID'),AppID)
	//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/MessageVersion'),MessageVersion)
	//			WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'),genRandomRemID)
	//			WebUI.click(findTestObject('Object Repository/IWP30/Page_QATestHarness/SubmitButton'))
	//
	//		}
	//		else {
	//
	//			println ("Not on Test Harness page")
	//		}
	//
	//
	//	}





	//	@Keyword
	//	def setData() {
	//
	//		WebUI.openBrowser('https://qa.velocitypayment.com/agency/config.do?action=editor')
	//
	//		WebUI.maximizeWindow()
	//
	//		//Begin setData
	//
	//		//  findTestObject('IWP30/Page_VRelay30Emulator/MV')
	//
	//		WebUI.selectOptionByValue(findTestObject('IWP30/Page_VRelay30Emulator/MV'),MV, true)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Amount'),Amount)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/CAN'),CAN)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Action'),Action)
	//
	//		//WebUI.click(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/td'))
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lang'),Lang)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Fname'),Fname)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lname'),Lname)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL1'),AL1)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL2'),AL2)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Country'),Country)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/City'),City)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/State'),State)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/ZIP'),ZIP)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Order'),Order)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Company'),CompanyName)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Email'),Email)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF1'),UDF1)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF2'),UDF2)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF3'),UDF3)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF4'),UDF4)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF5'),UDF5)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF6'),UDF6)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF7'),UDF7)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF8'),UDF8)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF9'),UDF9)
	//
	//		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF10'),UDF10)
	//		Thread.sleep(10000)
	//
	//		WebUI.click(findTestObject('IWP30/Page_VRelay30Emulator/Submit'))
	//
	//
	//
	//
	//
	//	}



	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}
}