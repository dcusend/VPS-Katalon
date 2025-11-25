package iwpPages

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

import internal.GlobalVariable as GlobalVariable

public class ccPaymentEntryPage {

	String Amount, UDF1, UDF2, UDF3, UDF4, UDF5, UDF6, UDF7, UDF8, UDF9, UDF10
	String Name, CardNum, SPC, ExpM, ExpY, CCDate, AL1, AL2, ZIP, Email, EmulatorData






	@Keyword
	def getDataCCPM(int rowM, dataFileM) {

		Amount = findTestData(dataFileM).getValue('Amount', rowM)

		println(Amount)


		UDF1 = findTestData(dataFileM).getValue('UDF1', rowM)

		println(UDF1)

		UDF2 = findTestData(dataFileM).getValue('UDF2', rowM)

		println(UDF2)

		UDF3 = findTestData(dataFileM).getValue('UDF3', rowM)

		println(UDF3)

		UDF4 = findTestData(dataFileM).getValue('UDF4', rowM)

		println(UDF4)

		UDF5 = findTestData(dataFileM).getValue('UDF5', rowM)

		println(UDF5)

		UDF6 = findTestData(dataFileM).getValue('UDF6', rowM)

		println(UDF6)

		UDF7 = findTestData(dataFileM).getValue('UDF7', rowM)

		println(UDF7)

		UDF8 = findTestData(dataFileM).getValue('UDF8', rowM)

		println(UDF8)

		UDF9 = findTestData(dataFileM).getValue('UDF9', rowM)

		println(UDF9)

		UDF10 = findTestData(dataFileM).getValue('UDF10', rowM)

		println(UDF10)

		Name = findTestData(dataFileM).getValue('Name', rowM)

		println(Name)

		CardNum = findTestData(dataFileM).getValue('CardNum', rowM)

		println(CardNum)

		SPC = findTestData(dataFileM).getValue('SPC', rowM)

		println(SPC)

		ExpM = findTestData(dataFileM).getValue('ExpM', rowM)

		println(ExpM)

		ExpY = findTestData(dataFileM).getValue('ExpY', rowM)

		println(ExpY)

		CCDate = findTestData(dataFileM).getValue('CCDate', rowM)

		println(CCDate)

		AL1 = findTestData(dataFileM).getValue('AL1', rowM)

		println(AL1)

		AL2 = findTestData(dataFileM).getValue('AL2', rowM)

		println(AL2)

		ZIP = findTestData(dataFileM).getValue('ZIP', rowM)

		println(ZIP)

		Email = findTestData(dataFileM).getValue('Email', rowM)

		println(Email)
	}

	@Keyword
	def getDataCCPMEF(int rowM, dataFileM) {

		Amount = dataFileM.getValue('Amount', rowM)

		println(Amount)


		UDF1 = dataFileM.getValue('UDF1', rowM)

		println(UDF1)

		UDF2 = dataFileM.getValue('UDF2', rowM)

		println(UDF2)

		UDF3 = dataFileM.getValue('UDF3', rowM)

		println(UDF3)

		UDF4 = dataFileM.getValue('UDF4', rowM)

		println(UDF4)

		UDF5 = dataFileM.getValue('UDF5', rowM)

		println(UDF5)

		UDF6 = dataFileM.getValue('UDF6', rowM)

		println(UDF6)

		UDF7 = dataFileM.getValue('UDF7', rowM)

		println(UDF7)

		UDF8 = dataFileM.getValue('UDF8', rowM)

		println(UDF8)

		UDF9 = dataFileM.getValue('UDF9', rowM)

		println(UDF9)

		UDF10 = dataFileM.getValue('UDF10', rowM)

		println(UDF10)

		Name = dataFileM.getValue('Name', rowM)

		println(Name)

		CardNum = dataFileM.getValue('CardNum', rowM)

		println(CardNum)

		SPC = dataFileM.getValue('SPC', rowM)

		println(SPC)

		ExpM = dataFileM.getValue('ExpM', rowM)

		println(ExpM)

		ExpY = dataFileM.getValue('ExpY', rowM)

		println(ExpY)

		CCDate = dataFileM.getValue('CCDate', rowM)

		println(CCDate)

		AL1 = dataFileM.getValue('AL1', rowM)

		println(AL1)

		AL2 = dataFileM.getValue('AL2', rowM)

		println(AL2)

		ZIP = dataFileM.getValue('ZIP', rowM)

		println(ZIP)

		Email = dataFileM.getValue('Email', rowM)

		println(Email)
	}


	@Keyword
	def setDataCCPM(int rowS, dataFileS) {


		def String datafile_class = dataFileS.getClass()
		if(datafile_class.contains('com.kms.katalon.core.testdata.reader.SheetPOI')) {
			this.getDataCCPMEF(rowS, dataFileS)
		}
		else {
			this.getDataCCPM(rowS, dataFileS)
		}

		// Verify if we are on Credit Card Payment Entry page and populate the page

		if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'), 30)) {

			println("We are on Credit Card Payment Entry page, start populating")



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),30)) {
			if ((!Amount.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),Amount)
			}
			else {
				println("Amount is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("Amount field is either missing or not modifiable on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),30)) {
			if ((!UDF2.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),UDF2)
			}
			else {
				println("UDF2 data is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF2 field is either missing or not modifiable on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),30)) {
			if ((!UDF3.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),UDF3)
			}
			else {
				println("UDF3 data is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF3 field is either missing or not modifiable on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7'),30)) {
			if ((!UDF7.isEmpty())) {
				WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7'),UDF7,false)
			}
			else {
				println("UDF7 data is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF7 field is either missing or not modifiable on CC Payment Entry page")
			//			}




			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8'),30)) {
			if ((!UDF8.isEmpty())) {
				WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8'),UDF8,false)
			}
			else {
				println("UDF8 data is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF8 field is either missing or not modifiable on CC Payment Entry page")
			//			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'),30)) {
				if ((!Name.isEmpty())) {
					WebUI.setText((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name')),Name)
				}
				else {
					println("CCName data is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Name field is either missing or not modifiable on CC Payment Entry page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),30)) {
				if ((!CardNum.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),CardNum)
				}
				else {
					println("Card Number is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Card Number field is missing on CC Payment Entry page")
			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),30)) {
			if ((!SPC.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),SPC)
			}
			else {
				println("CCSPC is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("SPC field is missing on CC Payment Entry page")
			//			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),30)) {
				if ((!ExpM.isEmpty())) {
					WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),ExpM,false)
				}
				else {
					println("CCExpM is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Month field is missing on CC Payment Entry page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),30)) {
				if ((!ExpY.isEmpty())) {
					WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),ExpY,false)
				}
				else {
					println("CCExpY is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Year field is missing on CC Payment Entry page")
			}

			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ProcessDate'),30)) {
			if ((!CCDate.isEmpty())) {

				//This js script is written to set the future date
				String js = '''
				let date = new Date(); // Now
				date.setDate(date.getDate() + 30); // Set now + 30 days as the new date
				console.log(date);

				
				let dateString = date;
				let new_date = new Date(dateString);
				
				let month = (new_date.getMonth() + 1).toString().padStart(2, '0');
				let day = new_date.getDate().toString().padStart(2, '0');
				let year = new_date.getFullYear();
				
				let formattedDate = `${month}/${day}/${year}`;

				console.log(formattedDate)
				   document.getElementById('processDate').value = formattedDate
				'''
				WebUI.executeJavaScript(js, null)
			}
			else {
				println("CCDate is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("ProcessDate field is missing on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),30)) {
			if ((!AL1.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),AL1)
			}
			else {
				println("CCAL1 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("AL1 field is missing on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),30)) {
			if ((!AL2.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),AL2)
			}
			else {
				println("CCAL2 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("AL2 field is missing on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),30)) {
			if ((!ZIP.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),ZIP)
			}
			else {
				println("CCZIP is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("ZIP field is missing on CC Payment Entry page")
			//			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/EmailAddress'),30)) {
				if ((!Email.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/EmailAddress'),Email)
				}
				else {
					println("CCEmail is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Email field is missing on CC Payment Entry page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'),30)) {
				WebUI.check(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'))
			}
			else {
				println("Terms and Condition checkbox is missing on the CC Payment Entry page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'),30)) {
				WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'))
			}
			else {
				println("Continue button is missing on the CC Payment Entry page")
			}

			//End Populating the Credit Card Payment Entry page
		}
		else {
			println("Not on Credit Card Payment Entry Page")
		}
	}



	@Keyword
	def setDataIWPCreditCard(int rowS, String dataFileS) {

		// Get Data
		EmulatorData = findTestData(dataFileS).getValue('EmulatorData', rowS)
		Amount = findTestData(dataFileS).getValue('Amount', rowS)
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
		Name = findTestData(dataFileS).getValue('Name', rowS)
		CardNum = findTestData(dataFileS).getValue('CardNum', rowS)
		SPC = findTestData(dataFileS).getValue('SPC', rowS)
		ExpM = findTestData(dataFileS).getValue('ExpM', rowS)
		ExpY = findTestData(dataFileS).getValue('ExpY', rowS)
		CCDate = findTestData(dataFileS).getValue('CCDate', rowS)
		AL1 = findTestData(dataFileS).getValue('AL1', rowS)
		AL2 = findTestData(dataFileS).getValue('AL2', rowS)
		ZIP = findTestData(dataFileS).getValue('ZIP', rowS)
		Email = findTestData(dataFileS).getValue('Email', rowS)


		// Set Data

		// Open TestHarness and populate data

		//def testHarness_URL = GlobalVariable.urlTestHarness

		//WebUI.openBrowser(testHarness_URL)
		//WebUI.maximizeWindow()


		// Verify if we are on Credit Card Payment Entry page and populate the page


		if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'), 30)) {

			println("We are on Credit Card Payment Entry page, start populating")



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),30)) {
			if ((!Amount.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),Amount)
			}
			else {
				println("Amount is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("Amount field is either missing or not modifiable on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),30)) {
			if ((!UDF2.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),UDF2)
			}
			else {
				println("UDF2 data is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF2 field is either missing or not modifiable on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),30)) {
			if ((!UDF3.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),UDF3)
			}
			else {
				println("UDF3 data is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF3 field is either missing or not modifiable on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7'),30)) {
			if ((!UDF7.isEmpty())) {
				WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7'),UDF7,false)
			}
			else {
				println("UDF7 data is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF7 field is either missing or not modifiable on CC Payment Entry page")
			//			}




			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8'),30)) {
			if ((!UDF8.isEmpty())) {
				WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8'),UDF8,false)
			}
			else {
				println("UDF8 data is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("UDF8 field is either missing or not modifiable on CC Payment Entry page")
			//			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'),30)) {
				if ((!Name.isEmpty())) {
					WebUI.setText((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name')),Name)
				}
				else {
					println("CCName data is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Name field is either missing or not modifiable on CC Payment Entry page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),30)) {
				if ((!CardNum.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),CardNum)
				}
				else {
					println("Card Number is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Card Number field is missing on CC Payment Entry page")
			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),30)) {
			if ((!SPC.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),SPC)
			}
			else {
				println("CCSPC is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("SPC field is missing on CC Payment Entry page")
			//			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),30)) {
				if ((!ExpM.isEmpty())) {
					WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),ExpM,false)
				}
				else {
					println("CCExpM is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Month field is missing on CC Payment Entry page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),30)) {
				if ((!ExpY.isEmpty())) {
					WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),ExpY,false)
				}
				else {
					println("CCExpY is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Year field is missing on CC Payment Entry page")
			}

			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ProcessDate'),30)) {
			if ((!CCDate.isEmpty())) {

				//This js script is written to set the future date
				String js = '''
				   document.getElementById('processDate').value = '08/09/2025'
				  '''
				WebUI.executeJavaScript(js, null)
			}
			else {
				println("CCDate is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("ProcessDate field is missing on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),30)) {
			if ((!AL1.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),AL1)
			}
			else {
				println("CCAL1 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("AL1 field is missing on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),30)) {
			if ((!AL2.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),AL2)
			}
			else {
				println("CCAL2 is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("AL2 field is missing on CC Payment Entry page")
			//			}



			//			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),30)) {
			if ((!ZIP.isEmpty())) {
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),ZIP)
			}
			else {
				println("CCZIP is not present in the Excel Spreadsheet")
			}
			//			}
			//			else {
			//				println("ZIP field is missing on CC Payment Entry page")
			//			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/EmailAddress'),30)) {
				if ((!Email.isEmpty())) {
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/EmailAddress'),Email)
				}
				else {
					println("Email is not present in the Excel Spreadsheet")
				}
			}
			else {
				println("Email field is missing on CC Payment Entry page")
			}




			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'),30)) {
				WebUI.check(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'))
			}
			else {
				println("Terms and Condition checkbox is missing on the CC Payment Entry page")
			}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'),30)) {
				WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'))
			}
			else {
				println("Continue button is missing on the CC Payment Entry page")
			}

			//End Populating the Credit Card Payment Entry page
		}
		else {
			println("Not on Credit Card Payment Entry Page")
		}
	}
}
