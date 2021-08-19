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

public class encryptedTrackPage {


	String TranType,MV,AppID,Username,Password,ResFormat,Category,TranID,ApprovalCode,CardName,AL1,AL2,City,State,ZIP,CountryID
	String Amount,CardNumber,ExM,ExY,CVVData,CVVState,TrackData,Track1Data,Track2Data,POSEntryMode,Email,OrderNumber,TaxAmount
	String ChargeDesc,CAN,BillPaymentInd,UDF1,UDF2,UDF3,UDF4,UDF5,UDF6,UDF7,UDF8,UDF9,UDF10,EncTrack1Data,EncTrack2Data,SlotNumber,KSN




	@Keyword
	def getDataETD(int rowM, String dataFileM) {

		TranType = findTestData(dataFileM).getValue('TranType', rowM)

		println(TranType)

		MV = findTestData(dataFileM).getValue('MV', rowM)

		println(MV)

		AppID = findTestData(dataFileM).getValue('AppID', rowM)

		println(AppID)

		Username = findTestData(dataFileM).getValue('Username', rowM)

		println(Username)

		Password = findTestData(dataFileM).getValue('Password', rowM)

		println(Password)

		ResFormat = findTestData(dataFileM).getValue('ResFormat', rowM)

		println(ResFormat)

		Category = findTestData(dataFileM).getValue('Category', rowM)

		println(Category)

		TranID = findTestData(dataFileM).getValue('TranID', rowM)

		println(TranID)

		ApprovalCode = findTestData(dataFileM).getValue('ApprovalCode', rowM)

		println(ApprovalCode)

		CardName = findTestData(dataFileM).getValue('CardName', rowM)

		println(CardName)

		AL1 = findTestData(dataFileM).getValue('AL1', rowM)

		println(AL1)

		AL2 = findTestData(dataFileM).getValue('AL2', rowM)

		println(AL2)

		City = findTestData(dataFileM).getValue('City', rowM)

		println(City)

		State = findTestData(dataFileM).getValue('State', rowM)

		println(State)

		ZIP = findTestData(dataFileM).getValue('ZIP', rowM)

		println(ZIP)

		CountryID = findTestData(dataFileM).getValue('CountryID', rowM)

		println(CountryID)

		Amount = findTestData(dataFileM).getValue('Amount', rowM)

		println(Amount)

		CardNumber = findTestData(dataFileM).getValue('CardNumber', rowM)

		println(CardNumber)


		ExM = findTestData(dataFileM).getValue('ExM', rowM)

		println(ExM)

		ExY = findTestData(dataFileM).getValue('ExY', rowM)

		println(ExY)

		CVVData = findTestData(dataFileM).getValue('CVVData', rowM)

		println(CVVData)

		CVVState = findTestData(dataFileM).getValue('CVVState', rowM)

		println(CVVState)

		TrackData = findTestData(dataFileM).getValue('TrackData', rowM)

		println(TrackData)

		Track1Data = findTestData(dataFileM).getValue('Track1Data', rowM)

		println(Track1Data)

		Track2Data = findTestData(dataFileM).getValue('Track2Data', rowM)

		println(Track2Data)

		POSEntryMode = findTestData(dataFileM).getValue('POSEntryMode', rowM)

		println(POSEntryMode)

		Email = findTestData(dataFileM).getValue('Email', rowM)

		println(Email)

		OrderNumber = findTestData(dataFileM).getValue('OrderNumber', rowM)

		println(OrderNumber)

		TaxAmount = findTestData(dataFileM).getValue('TaxAmount', rowM)

		println(TaxAmount)

		ChargeDesc = findTestData(dataFileM).getValue('ChargeDesc', rowM)

		println(ChargeDesc)

		CAN = findTestData(dataFileM).getValue('CAN', rowM)

		println(CAN)

		BillPaymentInd = findTestData(dataFileM).getValue('BillPaymentInd', rowM)

		println(BillPaymentInd)

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

		EncTrack1Data = findTestData(dataFileM).getValue('EncTrack1Data', rowM)

		println(EncTrack1Data)

		EncTrack2Data = findTestData(dataFileM).getValue('EncTrack2Data', rowM)

		println(EncTrack2Data)

		SlotNumber = findTestData(dataFileM).getValue('SlotNumber', rowM)

		println(SlotNumber)

		KSN = findTestData(dataFileM).getValue('KSN', rowM)

		println(KSN)

		// End of getData
	}





	@Keyword
	def setDataETD(int rowS, String dataFileS) {


		this.getDataETD(rowS, dataFileS)


		// Verify if we are on Credit Card Payment Entry page and populate the page

		if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Amount'), 30))
		{

			println("We are on Encrypted Track Credit Card Payment Entry page, start populating")



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_TransactionType'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_TransactionType'),TranType)

			}
			else {println("Transaction Type field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_MV'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_MV'),MV)

			}
			else {println("Message Version field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_AppID'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_AppID'),AppID)

			}
			else {println("Application ID field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Username'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Username'),Username)

			}
			else {println("Username field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Password'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Password'),Password)

			}
			else {println("Password field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_ResponseFormat'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_ResponseFormat'),ResFormat)

			}
			else {println("Response Format field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Category'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Category'),Category)

			}
			else {println("Category field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_TransactionID'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_TransactionID'),TranID)

			}
			else {println("Transaction ID field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_ApprovalCode'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_ApprovalCode'),ApprovalCode)

			}
			else {println("Approval Code field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CardName'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CardName'),CardName)

			}
			else {println("Card Name field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_AL1'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_AL1'),AL1)

			}
			else {println("Address Line 1 field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_AL2'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_AL2'),AL2)

			}
			else {println("Address Line 2 field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CardCity'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CardCity'),City)

			}
			else {println("City field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CardState'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CardState'),State)

			}
			else {println("State field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CardZIP'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CardZIP'),ZIP)

			}
			else {println("ZIP field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CountryID'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CountryID'),CountryID)

			}
			else {println("Country ID field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Amount'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Amount'),Amount)

			}
			else {println("Amount field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CardNumber'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CardNumber'),CardNumber)

			}
			else {println("Card Number field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CardExpMonth'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CardExpMonth'),ExM)

			}
			else {println("Expiry Month field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CardExpYear'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CardExpYear'),ExY)

			}
			else {println("Expiry Year field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CVVData'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CVVData'),CVVData)

			}
			else {println("CVV Data field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CVVState'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CVVState'),CVVState)

			}
			else {println("CVV State field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_TrackData'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_TrackData'),TrackData)

			}
			else {println("Track Data field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Track1Data'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Track1Data'),Track1Data)

			}
			else {println("Track 1 Data field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Track2Data'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Track2Data'),Track2Data)

			}
			else {println("Track 2 Data field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_POSEntryMode'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_POSEntryMode'),POSEntryMode)

			}
			else {println("POS Entry Mode field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Email'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_Email'),Email)

			}
			else {println("Email field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_OrderNumber'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_OrderNumber'),OrderNumber)

			}
			else {println("Order Number field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_TaxAmount'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_TaxAmount'),TaxAmount)

			}
			else {println("Tax Amount field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_ChargeDescription'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_ChargeDescription'),ChargeDesc)

			}
			else {println("Charge Description field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CAN'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_CAN'),CAN)

			}
			else {println("CAN field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_BillPayIndicator'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_BillPayIndicator'),BillPaymentInd)

			}
			else {println("Bill Payment Indicator field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF1'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF1'),UDF1)

			}
			else {println("UDF1 field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF2'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF2'),UDF2)

			}
			else {println("UDF2 field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF3'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF3'),UDF3)

			}
			else {println("UDF3 field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF4'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF4'),UDF4)

			}
			else {println("UDF4 field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF5'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF5'),UDF5)

			}
			else {println("UDF5 field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF6'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF6'),UDF6)

			}
			else {println("UDF6 field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF7'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF7'),UDF7)

			}
			else {println("UDF7 field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF8'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF8'),UDF8)

			}
			else {println("UDF8 field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF9'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF9'),UDF9)

			}
			else {println("UDF9 field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF10'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_UDF10'),UDF10)

			}
			else {println("UDF10 field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_EncTrack1Data'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_EncTrack1Data'),EncTrack1Data)

			}
			else {println("Encrypted Track 1 Data field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_EncTrack2Data'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_EncTrack2Data'),EncTrack2Data)

			}
			else {println("Encrypted Track 2 Data field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_SlotNumber'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_SlotNumber'),SlotNumber)

			}
			else {println("Slot Number field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}


			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_KSN'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_EncryptedTrack/txt_KSN'),KSN)

			}
			else {println("KSN field is either missing or not modifiable on Encrypted Track Credit Card Payment Entry page")}



			// Select the Generate Remittance ID button

			WebUI.click(findTestObject('Object Repository/VLink/Page_EncryptedTrack/btn_GenerateRemID'))

			Thread.sleep(1000)

			// Select the Process VLink Transaction button

			WebUI.click(findTestObject('Object Repository/VLink/Page_EncryptedTrack/btn_ProcessVLinkTran'))

			Thread.sleep(5000)


		}
		else {println("We are NOT on Encrypted Track Credit Card Payment Entry page")}
		// End of setData
	}





















}
