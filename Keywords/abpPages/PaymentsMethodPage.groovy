package abpPages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.apache.commons.lang.RandomStringUtils
import org.apache.commons.text.RandomStringGenerator

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
import com.kms.katalon.core.testdata.reader.ExcelFactory

import internal.GlobalVariable
import net.bytebuddy.asm.Advice.Return

public class PaymentsMethodPage {

	def udf1, udf2, udf3, udf4,AL1,AL2,ZIP,State,cardNumber,cvv,expMM,expYYYY,firstName,lastName,nickName,
	routingTransitNumber,typeOfAccount,accountNumber,confirmAccountNumber,companyName,businessTaxID

	String pathSharedData = "KatalonData/ABPTestData/NormalizedSharedData.xlsx"
	String nameID,ACHID,AddressID,AmountS, UDFID

	@Keyword
	def clickAddButton() {
		WebUI.click(findTestObject('Object Repository/ABP/Page_Payment Method/input_Details_Add Payment Method'))
	}
	
	@Keyword
	def selectPaymentMethodCC() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/Page_Payment Method/select_SelectPaymentType'), "Credit Card", false)
	}
	
	@Keyword
	def selectPaymentMethodPersonalSaving() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/Page_Payment Method/select_SelectPaymentType'), "Personal Savings", false)
	}
	
	@Keyword
	def selectPaymentMethodPersonalChecking() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/Page_Payment Method/select_SelectPaymentType'), "Personal Checking", false)
	}
	
	@Keyword
	def selectPaymentMethodBusinessChecking() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/Page_Payment Method/select_SelectPaymentType'), "Business Checking", false)
	}
	
	@Keyword
	def clickSave() {
		WebUI.click(findTestObject('Object Repository/ABP/Page_Payment Method/input__Submit'))
	}
	
	@Keyword
	def clickDelete() {
		WebUI.click(findTestObject('Object Repository/ABP/Page_Payment Method/a_delete'))
	}
	
	//*********************************************************************************************

	/*GetData and SetData for Address like AL1, AL2 and ZIP
	 Takes the argument for Address ID and queries NormalizedSharedData spreadsheet for Address Data*/


	//*********************************************************************************************

	@Keyword
	def getDataAddress(String AddressIDG) {

		def dataFileAddress = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "AddressData", true)

		def numOfRowsAddress = dataFileAddress.getRowNumbers()

		for (def row = 1; row <= numOfRowsAddress; row++) {

			def ID = dataFileAddress.getValue("ID", row)

			if (ID.equals(AddressIDG)) {

				AL1 = dataFileAddress.getValue("AL1", row)
				AL2 = dataFileAddress.getValue("AL2", row)
				ZIP = dataFileAddress.getValue("ZIP", row)
			}
		}
	}



	@Keyword
	def setDataAddress(String AddressIDS) {

		this.getDataAddress(AddressIDS)

		if ((!AL1.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_Payment Method/input__AddressLine1'),AL1)
		}


		if ((!AL2.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_Payment Method/input_AddressLine2'),AL2)
		}


		if ((!ZIP.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_Payment Method/input_ZipCode'),ZIP)
		}
	}

	//*********************************************************************************************

	/*GetData and SetData for Card Information like cardNumber, CVV and expiry Month & Year
	 Takes the argument for Address ID and queries NormalizedSharedData spreadsheet for Address Data*/


	//*********************************************************************************************

	@Keyword
	def getDataCardInfo(String CardIDG) {

		def dataFileCardInfo = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "CardData", true)

		def numOfRowsCardInfo = dataFileCardInfo.getRowNumbers()

		for (def row = 1; row <= numOfRowsCardInfo; row++) {

			def ID = dataFileCardInfo.getValue("ID", row)

			if (ID.equals(CardIDG)) {

				cardNumber = dataFileCardInfo.getValue("CardNumber", row)
				//cvv = dataFileCardInfo.getValue("CVV", row)
				expMM = dataFileCardInfo.getValue("ExpMM", row)
				expYYYY = dataFileCardInfo.getValue("ExpYYYY", row)
			}
		}
	}
	
	@Keyword
	def setDataCardInfo(String CardIDS) {
		this.getDataCardInfo(CardIDS)

		if ((!cardNumber.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_Payment Method/input__cardNumber'),cardNumber)
		}


		/*if ((!cvv.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/BillsLabelPage/PaymentEntryCC/input_cvv'),cvv)
		}*/


		if ((!expMM.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/Page_Payment Method/select_Month'),expMM,false)
		}


		if ((!expYYYY.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/Page_Payment Method/select_Year'),expYYYY,false)
		}
	}

	/*@Keyword
	def getDataNickNameID(String NameIDG) {

		def dataFileCardName = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "NameData", true)

		def numOfRowsCardName = dataFileCardName.getRowNumbers()

		for (def row = 1; row <= numOfRowsCardName; row++) {


			def ID = dataFileCardName.getValue("ID", row)

			if (ID.equals(NameIDG)) {
				nickName = dataFileCardName.getValue("NickName", row)
			}
		}
	}*/
	


	@Keyword
	def setDataNickNameID(String nickName) {
		
		/*this.getDataNickNameID(NameIDS)*/

		if(!nickName.isEmpty()) {

			WebUI.setText(findTestObject('Object Repository/ABP/Page_Payment Method/input__nickName'),nickName)
		}
	}
	
	//Generate random text for nickname
	@Keyword
	def generateNickName() {
		nickName = org.apache.commons.lang.RandomStringUtils.random(8, true, false)
		
		return  nickName
	}
	
	def getPersonalACHData(String ACHIDG) {
		def dataFileACHData = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "ACHData", true)

		def numOfRowsACHData = dataFileACHData.getRowNumbers()

		for (def row = 1; row <= numOfRowsACHData; row++) {


			def ID = dataFileACHData.getValue("ID", row)
			println(ID+ACHIDG)

			if (ID.equals(ACHIDG)) {
				routingTransitNumber = dataFileACHData.getValue("RoutingNumber", row)
				accountNumber = dataFileACHData.getValue("AccountNumber", row)
				confirmAccountNumber = dataFileACHData.getValue("ConfirmAccountNumber", row)
			}
		}
	}
	@Keyword
	def setPersonalACHData(String ACHIDS) {
		
		this.getPersonalACHData(ACHIDS)

		if ((!routingTransitNumber.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_Payment Method/input__routingNumber'),routingTransitNumber)
		}
		if ((!accountNumber.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_Payment Method/input_AccountNumber'),accountNumber)
		}

		if ((!confirmAccountNumber.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_Payment Method/input_ConfirmAccountNumber'),confirmAccountNumber)
		}
	}
	
}
