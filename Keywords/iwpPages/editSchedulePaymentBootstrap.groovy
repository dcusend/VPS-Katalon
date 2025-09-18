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
import com.kms.katalon.core.testdata.reader.ExcelFactory
import internal.GlobalVariable

public class editSchedulePaymentBootstrap {

	def cvv, ccDate, UDF8, UDF7

	String pathSharedData = "KatalonData/IWPBootstrapData/NormalizedSharedData.xlsx"
	String pathOR = "Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/"
	@Keyword
	def getDataCardInfo(String CardIDG) {

		def dataFileCardInfo = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "CardData", true)

		def numOfRowsCardInfo = dataFileCardInfo.getRowNumbers()

		for (def row = 1; row <= numOfRowsCardInfo; row++) {

			def ID = dataFileCardInfo.getValue("ID", row)

			if (ID.equals(CardIDG)) {

				
				cvv = dataFileCardInfo.getValue("CVV", row)
			}
		}
	}


	@Keyword
	def setDataCardInfo(String CardIDS) {
		this.getDataCardInfo(CardIDS)

		if ((!cvv.isEmpty())) {
			WebUI.setText(findTestObject(pathOR + 'input_spc'),cvv)
		}
	}
	
	@Keyword
	def getDataCardUDF(String UDFIDG) {

		def dataFileUDF = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "UDFData", true)

		def numOfRowsUDF = dataFileUDF.getRowNumbers()


		for (def row = 1; row <= numOfRowsUDF; row++) {

			def ID = dataFileUDF.getValue("ID", row)

			if (ID.equals(UDFIDG)) {

				UDF7 = dataFileUDF.getValue("UDF7", row)
				UDF8 = dataFileUDF.getValue("UDF8", row)
				
			}
		}
	}



	@Keyword
	def setDataCardUDF(String UDFIDS) {
		this.getDataCardUDF(UDFIDS)

		// populate only UDFs 7, 8 since they are the only ones modifiable


		if ((!UDF7.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject(pathOR + 'select_userDefined7'),UDF7,false)
		}


		if ((!UDF8.isEmpty())) {
			WebUI.selectOptionByLabel(findTestObject(pathOR + 'select_userDefined8'),UDF8,false)
		}
	}
	
	@Keyword
	
		def setDataCCDate(String ccDateS) {
			ccDate = ccDateS
			if(!ccDate.isEmpty()) {
				//This js script is written to set the future date
				String js = '''
	 document.getElementById('processDate').value = '12/31/2026'
	 '''
				WebUI.executeJavaScript(js, null)
			}
			else {
				println("CCDate is not present in the Excel Spreadsheet")
			}
		}
		
		@Keyword
		def setDataSchedPayment(String cardIDS,udfIDS,ccDateS) {
		this.setDataCardInfo(cardIDS)
		this.setDataCardUDF(udfIDS)
		this.setDataCCDate(ccDateS)
	}
	
	@Keyword
	def setDataSchedPaymentACH(String udfIDS,ccDateS) {
	this.setDataCardUDF(udfIDS)
	this.setDataCCDate(ccDateS)
}
}
