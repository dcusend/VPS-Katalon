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

	String CCAmount, CCUDF1, CCUDF2, CCUDF3, CCUDF4, CCUDF5, CCUDF6, CCUDF7, CCUDF8, CCUDF9, CCUDF10
	String CCName, CCCardNum, CCSPC, CCExpM, CCExpY, CCDate, CCAL1, CCAL2, CCZIP, CCEmail, EmulatorData






	@Keyword
	def getDataCCPM(int rowM, String dataFileM) {

		CCAmount = findTestData(dataFileM).getValue('CCAmount', rowM)

		println(CCAmount)


		CCUDF1 = findTestData(dataFileM).getValue('CCUDF1', rowM)

		println(CCUDF1)

		CCUDF2 = findTestData(dataFileM).getValue('CCUDF2', rowM)

		println(CCUDF2)

		CCUDF3 = findTestData(dataFileM).getValue('CCUDF3', rowM)

		println(CCUDF3)

		CCUDF4 = findTestData(dataFileM).getValue('CCUDF4', rowM)

		println(CCUDF4)

		CCUDF5 = findTestData(dataFileM).getValue('CCUDF5', rowM)

		println(CCUDF5)

		CCUDF6 = findTestData(dataFileM).getValue('CCUDF6', rowM)

		println(CCUDF6)

		CCUDF7 = findTestData(dataFileM).getValue('CCUDF7', rowM)

		println(CCUDF7)

		CCUDF8 = findTestData(dataFileM).getValue('CCUDF8', rowM)

		println(CCUDF8)

		CCUDF9 = findTestData(dataFileM).getValue('CCUDF9', rowM)

		println(CCUDF9)

		CCUDF10 = findTestData(dataFileM).getValue('CCUDF10', rowM)

		println(CCUDF10)

		CCName = findTestData(dataFileM).getValue('CCName', rowM)

		println(CCName)

		CCCardNum = findTestData(dataFileM).getValue('CCCardNum', rowM)

		println(CCCardNum)

		CCSPC = findTestData(dataFileM).getValue('CCSPC', rowM)

		println(CCSPC)

		CCExpM = findTestData(dataFileM).getValue('CCExpM', rowM)

		println(CCExpM)

		CCExpY = findTestData(dataFileM).getValue('CCExpY', rowM)

		println(CCExpY)

		CCDate = findTestData(dataFileM).getValue('CCDate', rowM)

		println(CCDate)

		CCAL1 = findTestData(dataFileM).getValue('CCAL1', rowM)

		println(CCAL1)

		CCAL2 = findTestData(dataFileM).getValue('CCAL2', rowM)

		println(CCAL2)

		CCZIP = findTestData(dataFileM).getValue('CCZIP', rowM)

		println(CCZIP)

		CCEmail = findTestData(dataFileM).getValue('CCEmail', rowM)

		println(CCEmail)
	}


	@Keyword
	def setDataCCPM(int rowS, String dataFileS) {


		this.getDataCCPM(rowS, dataFileS)


		// Verify if we are on Credit Card Payment Entry page and populate the page

		if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'), 30))
		{

			println("We are on Credit Card Payment Entry page, start populating")



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),30))
			{
				if ((!CCAmount.isEmpty()))
				{
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),CCAmount)
				}
				else {println("Amount is not present in the Excel Spreadsheet")}
			}
			else {println("Amount field is either missing or not modifiable on CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),30))
			{
				if ((!CCUDF2.isEmpty()))
				{
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),CCUDF2)
				}
				else {println("UDF2 data is not present in the Excel Spreadsheet")}
			}
			else {println("UDF2 field is either missing or not modifiable on CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),30))
			{
				if ((!CCUDF3.isEmpty()))
				{
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),CCUDF3)
				}
				else {println("UDF3 data is not present in the Excel Spreadsheet")}
			}
			else {println("UDF3 field is either missing or not modifiable on CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7'),30))
			{
				if ((!CCUDF7.isEmpty()))
				{
					WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7')),CCUDF7,false)
				}
				else {println("UDF7 data is not present in the Excel Spreadsheet")}
			}
			else {println("UDF7 field is either missing or not modifiable on CC Payment Entry page")}




			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8'),30))
			{
				if ((!CCUDF8.isEmpty()))
				{
					WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8')),CCUDF8,false)
				}
				else {println("UDF8 data is not present in the Excel Spreadsheet")}
			}
			else {println("UDF8 field is either missing or not modifiable on CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'),30))
			{
				if ((!CCName.isEmpty()))
				{
					WebUI.setText((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name')),CCName)
				}
				else {println("CCName data is not present in the Excel Spreadsheet")}
			}
			else {println("Name field is either missing or not modifiable on CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),30))
			{
				if ((!CCCardNum.isEmpty()))
				{
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),CCCardNum)
				}
				else {println("Card Number is not present in the Excel Spreadsheet")}
			}
			else {println("Card Number field is missing on CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),30))
			{
				if ((!CCSPC.isEmpty()))
				{
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),CCSPC)
				}
				else {println("CCSPC is not present in the Excel Spreadsheet")}
			}
			else {println("SPC field is missing on CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),30))
			{
				if ((!CCExpM.isEmpty()))
				{
					WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),CCExpM,false)
				}
				else {println("CCExpM is not present in the Excel Spreadsheet")}
			}
			else {println("Month field is missing on CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),30))
			{
				if ((!CCExpY.isEmpty()))
				{
					WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),CCExpY,false)
				}
				else {println("CCExpY is not present in the Excel Spreadsheet")}
			}
			else {println("Year field is missing on CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ProcessDate'),30))
			{
				if ((!CCDate.isEmpty()))
				{
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ProcessDate'),CCDate)
				}
				else {println("CCDate is not present in the Excel Spreadsheet")}
			}
			else {println("ProcessDate field is missing on CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),30))
			{
				if ((!CCAL1.isEmpty()))
				{
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),CCAL1)
				}
				else {println("CCAL1 is not present in the Excel Spreadsheet")}
			}
			else {println("AL1 field is missing on CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),30))
			{
				if ((!CCAL2.isEmpty()))
				{
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),CCAL2)
				}
				else {println("CCAL2 is not present in the Excel Spreadsheet")}
			}
			else {println("AL2 field is missing on CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),30))
			{
				if ((!CCZIP.isEmpty()))
				{
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),CCZIP)
				}
				else {println("CCZIP is not present in the Excel Spreadsheet")}
			}
			else {println("ZIP field is missing on CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/EmailAddress'),30))
			{
				if ((!CCEmail.isEmpty()))
				{
					WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/EmailAddress'),CCEmail)
				}
				else {println("CCEmail is not present in the Excel Spreadsheet")}
			}
			else {println("Email field is missing on CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'),30))
			{
				WebUI.check(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'))
			}
			else {println("Terms and Condition checkbox is missing on the CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'),30))
			{
				WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'))
			}
			else {println("Continue button is missing on the CC Payment Entry page")}

			//End Populating the Credit Card Payment Entry page



		}
		else
		{
			println("Not on Credit Card Payment Entry Page")
		}



	}



	@Keyword
	def setDataIWPCreditCard(int rowS, String dataFileS)
	{

		// Get Data
		EmulatorData = findTestData(dataFileS).getValue('EmulatorData', rowS)
		CCAmount = findTestData(dataFileS).getValue('CCAmount', rowS)
		CCUDF1 = findTestData(dataFileS).getValue('CCUDF1', rowS)
		CCUDF2 = findTestData(dataFileS).getValue('CCUDF2', rowS)
		CCUDF3 = findTestData(dataFileS).getValue('CCUDF3', rowS)
		CCUDF4 = findTestData(dataFileS).getValue('CCUDF4', rowS)
		CCUDF5 = findTestData(dataFileS).getValue('CCUDF5', rowS)
		CCUDF6 = findTestData(dataFileS).getValue('CCUDF6', rowS)
		CCUDF7 = findTestData(dataFileS).getValue('CCUDF7', rowS)
		CCUDF8 = findTestData(dataFileS).getValue('CCUDF8', rowS)
		CCUDF9 = findTestData(dataFileS).getValue('CCUDF9', rowS)
		CCUDF10 = findTestData(dataFileS).getValue('CCUDF10', rowS)
		CCName = findTestData(dataFileS).getValue('CCName', rowS)
		CCCardNum = findTestData(dataFileS).getValue('CCCardNum', rowS)
		CCSPC = findTestData(dataFileS).getValue('CCSPC', rowS)
		CCExpM = findTestData(dataFileS).getValue('CCExpM', rowS)
		CCExpY = findTestData(dataFileS).getValue('CCExpY', rowS)
		CCDate = findTestData(dataFileS).getValue('CCDate', rowS)
		CCAL1 = findTestData(dataFileS).getValue('CCAL1', rowS)
		CCAL2 = findTestData(dataFileS).getValue('CCAL2', rowS)
		CCZIP = findTestData(dataFileS).getValue('CCZIP', rowS)
		CCEmail = findTestData(dataFileS).getValue('CCEmail', rowS)


		// Set Data

		// Open TestHarness and populate data

		//def testHarness_URL = GlobalVariable.urlTestHarness

		//WebUI.openBrowser(testHarness_URL)
		//WebUI.maximizeWindow()


		// Verify if we are on Credit Card Payment Entry page and populate the page


		if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'), 30))
		{

			println("We are on Credit Card Payment Entry page, start populating")



			if ((!CCAmount.isEmpty()))
			{
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),CCAmount)
			}
			else {println("Amount is not present in the Excel Spreadsheet")}




			if ((!CCUDF1.isEmpty()))
			{
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined1'),CCUDF1)
			}
			else {println("UDF1 data is not present in the Excel Spreadsheet")}



			if ((!CCUDF2.isEmpty()))
			{
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),CCUDF2)
			}
			else {println("UDF2 data is not present in the Excel Spreadsheet")}




			if ((!CCUDF3.isEmpty()))
			{
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),CCUDF3)
			}
			else {println("UDF3 data is not present in the Excel Spreadsheet")}



			if ((!CCUDF4.isEmpty()))
			{
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined4'),CCUDF4)
			}
			else {println("UDF4 data is not present in the Excel Spreadsheet")}


			if ((!CCUDF5.isEmpty()))
			{
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined5'),CCUDF5)
			}
			else {println("UDF5 data is not present in the Excel Spreadsheet")}


			if ((!CCUDF6.isEmpty()))
			{
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined6'),CCUDF6)
			}
			else {println("UDF6 data is not present in the Excel Spreadsheet")}




			if ((!CCUDF7.isEmpty()))
			{
				WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7')),CCUDF7,false)
			}
			else {println("UDF7 data is not present in the Excel Spreadsheet")}




			if ((!CCUDF8.isEmpty()))
			{
				WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8')),CCUDF8,false)
			}
			else {println("UDF8 data is not present in the Excel Spreadsheet")}


			if ((!CCUDF9.isEmpty()))
			{
				WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined9')),CCUDF9,false)
			}
			else {println("UDF9 data is not present in the Excel Spreadsheet")}


			if ((!CCUDF10.isEmpty()))
			{
				WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined10')),CCUDF10,false)
			}
			else {println("UDF10 data is not present in the Excel Spreadsheet")}




			if ((!CCName.isEmpty()))
			{
				WebUI.setText((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name')),CCName)
			}
			else {println("CCName data is not present in the Excel Spreadsheet")}




			if ((!CCCardNum.isEmpty()))
			{
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),CCCardNum)
			}
			else {println("Card Number is not present in the Excel Spreadsheet")}



			if ((!CCSPC.isEmpty()))
			{
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),CCSPC)
			}
			else {println("CCSPC is not present in the Excel Spreadsheet")}




			if ((!CCExpM.isEmpty()))
			{
				WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),CCExpM,false)
			}
			else {println("CCExpM is not present in the Excel Spreadsheet")}



			if ((!CCExpY.isEmpty()))
			{
				WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),CCExpY,false)
			}
			else {println("CCExpY is not present in the Excel Spreadsheet")}



			if ((!CCDate.isEmpty()))
			{
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ProcessDate'),CCDate)
			}
			else {println("CCDate is not present in the Excel Spreadsheet")}



			if ((!CCAL1.isEmpty()))
			{
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),CCAL1)
			}
			else {println("CCAL1 is not present in the Excel Spreadsheet")}



			if ((!CCAL2.isEmpty()))
			{
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),CCAL2)
			}
			else {println("CCAL2 is not present in the Excel Spreadsheet")}




			if ((!CCZIP.isEmpty()))
			{
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),CCZIP)
			}
			else {println("CCZIP is not present in the Excel Spreadsheet")}





			if ((!CCEmail.isEmpty()))
			{
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/EmailAddress'),CCEmail)
			}
			else {println("CCEmail is not present in the Excel Spreadsheet")}




			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'),30))
			{
				WebUI.check(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'))
			}
			else {println("Terms and Condition checkbox is missing on the CC Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'),30))
			{
				WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'))
			}
			else {println("Continue button is missing on the CC Payment Entry page")}

			//End Populating the Credit Card Payment Entry page



		}
		else
		{
			println("Not on Credit Card Payment Entry Page")
		}




	}





}
