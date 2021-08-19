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

public class captureCCPage {


	String TranType,MV,AppID,Username,Password,ResFormat,TranID
	String Amount,OrderNumber,TaxAmount, RemID
	String ChargeDesc,CAN,BillPaymentInd,UDF1,UDF2,UDF3,UDF4,UDF5,UDF6,UDF7,UDF8,UDF9,UDF10



	@Keyword
	def getDataCCC(int rowM, String dataFileM) {

		TranType = findTestData(dataFileM).getValue('Cap_TranType', rowM)

		println(TranType)

		MV = findTestData(dataFileM).getValue('Cap_MV', rowM)

		println(MV)

		AppID = findTestData(dataFileM).getValue('Cap_AppID', rowM)

		println(AppID)

		Username = findTestData(dataFileM).getValue('Cap_Username', rowM)

		println(Username)

		Password = findTestData(dataFileM).getValue('Cap_Password', rowM)

		println(Password)

		ResFormat = findTestData(dataFileM).getValue('Cap_ResFormat', rowM)

		println(ResFormat)


		TranID = findTestData(dataFileM).getValue('Cap_TranID', rowM)

		println(TranID)


		Amount = findTestData(dataFileM).getValue('Cap_Amount', rowM)

		println(Amount)


		OrderNumber = findTestData(dataFileM).getValue('Cap_Order', rowM)

		println(OrderNumber)

		TaxAmount = findTestData(dataFileM).getValue('Cap_Tax', rowM)

		println(TaxAmount)

		ChargeDesc = findTestData(dataFileM).getValue('Cap_Charge', rowM)

		println(ChargeDesc)

		CAN = findTestData(dataFileM).getValue('Cap_CAN', rowM)

		println(CAN)

		BillPaymentInd = findTestData(dataFileM).getValue('Cap_BillPayInd', rowM)

		println(BillPaymentInd)

		UDF1 = findTestData(dataFileM).getValue('Cap_UDF1', rowM)

		println(UDF1)

		UDF2 = findTestData(dataFileM).getValue('Cap_UDF2', rowM)

		println(UDF2)

		UDF3 = findTestData(dataFileM).getValue('Cap_UDF3', rowM)

		println(UDF3)

		UDF4 = findTestData(dataFileM).getValue('Cap_UDF4', rowM)

		println(UDF4)

		UDF5 = findTestData(dataFileM).getValue('Cap_UDF5', rowM)

		println(UDF5)

		UDF6 = findTestData(dataFileM).getValue('Cap_UDF6', rowM)

		println(UDF6)

		UDF7 = findTestData(dataFileM).getValue('Cap_UDF7', rowM)

		println(UDF7)

		UDF8 = findTestData(dataFileM).getValue('Cap_UDF8', rowM)

		println(UDF8)

		UDF9 = findTestData(dataFileM).getValue('Cap_UDF9', rowM)

		println(UDF9)

		UDF10 = findTestData(dataFileM).getValue('Cap_UDF10', rowM)

		println(UDF10)



		// End of getData




	}







	@Keyword
	def setDataCCC(int rowS, String dataFileS) {

		this.getDataCCC(rowS, dataFileS)


		// Verify if we are on Capture Credit Card Payment Entry page and populate the page

		if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_Amount'), 30))
		{

			println("We are on Capture Credit Card Payment Entry page, start populating")



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_TranType'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_TranType'),TranType)

			}
			else {println("Transaction Type field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_MV'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_MV'),MV)

			}
			else {println("Message Version field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_ApplicationId'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_ApplicationId'),AppID)

			}
			else {println("Application ID field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_Username'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_Username'),Username)

			}
			else {println("Username field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_Password'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_Password'),Password)

			}
			else {println("Password field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_ResponseFormat'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_ResponseFormat'),ResFormat)

			}
			else {println("Response Format field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_TranID'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_TranID'),TranID)

			}
			else {println("Transaction ID field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_Amount'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_Amount'),Amount)

			}
			else {println("Amount field is either missing or not modifiable on Capture Credit Card Payment Entry page")}




			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_OrderNumber'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_OrderNumber'),OrderNumber)

			}
			else {println("Order Number field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_TaxAmount'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_TaxAmount'),TaxAmount)

			}
			else {println("Tax Amount field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_ChargeDescription'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_ChargeDescription'),ChargeDesc)

			}
			else {println("Charge Description field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_CAN'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_CAN'),CAN)

			}
			else {println("CAN field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_BillPaymentIndicator'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_BillPaymentIndicator'),BillPaymentInd)

			}
			else {println("Bill Payment Indicator field is either missing or not modifiable on Capture Credit Card Payment Entry page")}




			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF1'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF1'),UDF1)

			}
			else {println("UDF1 field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF2'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF2'),UDF2)

			}
			else {println("UDF2 field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF3'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF3'),UDF3)

			}
			else {println("UDF3 field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF4'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF4'),UDF4)

			}
			else {println("UDF4 field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF5'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF5'),UDF5)

			}
			else {println("UDF5 field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF6'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF6'),UDF6)

			}
			else {println("UDF6 field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF7'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF7'),UDF7)

			}
			else {println("UDF7 field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF8'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF8'),UDF8)

			}
			else {println("UDF8 field is either missing or not modifiable on Capture Credit Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF9'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF9'),UDF9)

			}
			else {println("UDF9 field is either missing or not modifiable on Capture Card Payment Entry page")}



			if (WebUI.verifyElementPresent(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF10'),30))
			{

				WebUI.setText(findTestObject('Object Repository/VLink/Page_CCCapture/txt_UDF10'),UDF10)

			}
			else {println("UDF10 field is either missing or not modifiable on Capture Credit Card Payment Entry page")}





			// Select the Process VLink Transaction button

			WebUI.click(findTestObject('Object Repository/VLink/Page_CCCapture/btn_ProcessVLinkTransaction'))

			Thread.sleep(5000)


		}
		else {println("We are NOT on Capture Credit Card Payment Entry page")}
		// End of setData

	}



}
