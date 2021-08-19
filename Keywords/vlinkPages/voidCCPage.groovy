package vlinkPages

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

public class voidCCPage {



	String Void_TranType,Void_MV,Void_RemID,Void_AppID,Void_Username,Void_Password,Void_ResFormat
	String Void_TranID,Void_OrigTranType,Void_TrackData,Void_Track1Data,Void_Track2Data,Void_TaxAmount,Void_CAN,Void_UDF2



	@Keyword
	def getDataVCC(int rowM, String dataFileM) {


		Void_TranType = findTestData(dataFileM).getValue('Void_TranType', rowM)
		println(Void_TranType)

		Void_MV = findTestData(dataFileM).getValue('Void_MV', rowM)
		println(Void_MV)

		Void_RemID = findTestData(dataFileM).getValue('Void_RemID', rowM)
		println(Void_RemID)

		Void_AppID = findTestData(dataFileM).getValue('Void_AppID', rowM)
		println(Void_AppID)

		Void_Username = findTestData(dataFileM).getValue('Void_Username', rowM)
		println(Void_Username)

		Void_Password = findTestData(dataFileM).getValue('Void_Password', rowM)
		println(Void_Password)

		Void_ResFormat = findTestData(dataFileM).getValue('Void_ResFormat', rowM)
		println(Void_ResFormat)

		Void_TranID = findTestData(dataFileM).getValue('Void_TranID', rowM)
		println(Void_TranID)

		Void_OrigTranType = findTestData(dataFileM).getValue('Void_OrigTranType', rowM)
		println(Void_OrigTranType)

		Void_TrackData = findTestData(dataFileM).getValue('Void_TrackData', rowM)
		println(Void_TrackData)

		Void_Track1Data = findTestData(dataFileM).getValue('Void_Track1Data', rowM)
		println(Void_Track1Data)

		Void_Track2Data = findTestData(dataFileM).getValue('Void_Track2Data', rowM)
		println(Void_Track2Data)

		Void_TaxAmount = findTestData(dataFileM).getValue('Void_TaxAmount', rowM)
		println(Void_TaxAmount)

		Void_CAN = findTestData(dataFileM).getValue('Void_CAN', rowM)
		println(Void_CAN)

		Void_UDF2 = findTestData(dataFileM).getValue('Void_UDF2', rowM)
		println(Void_UDF2)



		// End of getData
	}

	//	findTestObject('Object Repository/VLink/Page_CCVoid/txt_ApplicationID')


	@Keyword
	def setDataVCC(int rowS, String dataFileS) {


		this.getDataVCC(rowS, dataFileS)


		// Verify if we are on Credit Card Void page and populate the page

		if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_OriginalTransactionType'), 30))
		{

			println("We are on Void Credit Card Page, start populating")





			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_TransactionType'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_TransactionType'),Void_TranType)

			}
			else {println("Transaction Type field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_MessageVersion'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_MessageVersion'),Void_MV)

			}
			else {println("Message Version field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_RemID'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_RemID'),GlobalVariable.VLinkSaleRemID)

			}
			else {println("Remittance ID field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_ApplicationID'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_ApplicationID'),Void_AppID)

			}
			else {println("Application ID field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_Username'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_Username'),Void_Username)

			}
			else {println("Username field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_Password'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_Password'),Void_Password)

			}
			else {println("Password field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_ResponseFormat'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_ResponseFormat'),Void_ResFormat)

			}
			else {println("Response Format field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_TransactionID'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_TransactionID'),GlobalVariable.VLinkSaleTranxID)

			}
			else {println("Transaction ID field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_OriginalTransactionType'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_OriginalTransactionType'),Void_OrigTranType)

			}
			else {println("Original Transaction Type field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_TrackData'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_TrackData'),Void_TrackData)

			}
			else {println("Track Data field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_Track1Data'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_Track1Data'),Void_Track1Data)

			}
			else {println("Track 1 Data field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_Track2Data'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_Track2Data'),Void_Track2Data)

			}
			else {println("Track 2 Data field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_TaxAmount'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_TaxAmount'),Void_TaxAmount)

			}
			else {println("Tax Amount field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_CAN'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_CAN'),Void_CAN)

			}
			else {println("CAN field is either missing or not modifiable on Void Credit Card Ppage")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCVoid/txt_UDF2'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCVoid/txt_UDF2'),Void_UDF2)

			}
			else {println("UDF2 field is either missing or not modifiable on Void Credit Card Ppage")}


			// Select the Process VLink Transaction button
			WebUI.click(findTestObject('Object Repository/VLink/Page_CCVoid/btn_ProcessVLinkTransaction'))
			Thread.sleep(2000)




			// End of if statement
		}
		else {println("We are not on Void Credit Card Page")}




		// End of setData
	}















}
