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

public class ccPaymentEntryBootstrapPage {
	
	def cardholderName, cardNumber, cvv, expMM, expYYYY, AL1, AL2, ZIP, email, phone, amount
	
	String pathSharedData = "KatalonData/IWPBootstrapData/NormalizedSharedData.xlsx"
	String pathOR = "Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/"

	 
	
//*********************************************************************************************
	
	/*GetData and SetData for Card Name
	 Takes the argument for Name ID and queries NormalizedSharedData spreadsheet for NameData*/
	
	
//*********************************************************************************************
	
	@Keyword
	def getDataCardName(String nameIDG)
	{
		
		def dataFileCardName = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "NameData", true)
		
		def numOfRowsCardName = dataFileCardName.getRowNumbers()

		for (def row = 1; row <= numOfRowsCardName; row++) 
			{
	
	
				def ID = dataFileCardName.getValue("ID", row)
				
				if (ID.equals(nameIDG)) 
					{
						cardholderName = dataFileCardName.getValue("CardholderName", row)
					}
			}
		
		}
	
	
	
	@Keyword
	def setDataCardName(String nameIDS)
	{
		
		this.getDataCardName(nameIDS)
		
		if ((!cardholderName.isEmpty()))
		{
				WebUI.setText(findTestObject(pathOR + 'input_billingName'),cardholderName)
		}
		
	
	}
	
	
//*********************************************************************************************
	 
	 /*END*/
	 
	 
//*********************************************************************************************
	
	
	
	
	
//*********************************************************************************************
	 
	 /*GetData and SetData for Card Information like Card Number, CVV and Expiration Date
	  Takes the argument for Card ID and queries NormalizedSharedData spreadsheet for Card Data*/
	 
	 
//*********************************************************************************************
	
	
	@Keyword
	def getDataCardInfo(String CardIDG)
	{
		
		def dataFileCardInfo = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "CardData", true)
		
		def numOfRowsCardInfo = dataFileCardInfo.getRowNumbers()
		
		for (def row = 1; row <= numOfRowsCardInfo; row++)
			{
	
				def ID = dataFileCardInfo.getValue("ID", row)
				
				if (ID.equals(CardIDG))
					{
					
					cardNumber = dataFileCardInfo.getValue("CardNumber", row)
					cvv = dataFileCardInfo.getValue("CVV", row)
					expMM = dataFileCardInfo.getValue("ExpMM", row)
					expYYYY = dataFileCardInfo.getValue("ExpYYYY", row)
					
					}
			}
	}
	
	
	
	@Keyword
	def setDataCardInfo(String CardIDS)
	{
		this.getDataCardInfo(CardIDS)
		
	
		
			if ((!cardNumber.isEmpty())) 
				{
					WebUI.setText(findTestObject(pathOR + 'input_cardNumber'),cardNumber)
				}
			
		
			if ((!cvv.isEmpty())) 
				{
					WebUI.setText(findTestObject(pathOR + 'input_spc'),cvv)
				}
		

			if ((!expMM.isEmpty())) 
				{
					WebUI.selectOptionByLabel(findTestObject(pathOR + 'select_MM'),expMM,false)
				}
			
		
			if ((!expYYYY.isEmpty())) 
				{
					WebUI.selectOptionByLabel(findTestObject(pathOR + 'select_YYYY'),expYYYY,false)
				}
			
	}
	
	
	
//*********************************************************************************************
	 
	 /*END*/
	 
	 
//*********************************************************************************************
	
	
	
//*********************************************************************************************
	 
	 /*GetData and SetData for Address like AL1, AL2 and ZIP
	  Takes the argument for Address ID and queries NormalizedSharedData spreadsheet for Address Data*/
	 
	 
//*********************************************************************************************
	
	
	@Keyword
	def getDataCardAddress(String AddressIDG)
	{
		
		def dataFileAddress = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "AddressData", true)
		
		def numOfRowsAddress = dataFileAddress.getRowNumbers()
		
		for (def row = 1; row <= numOfRowsAddress; row++)
			{
	
				def ID = dataFileAddress.getValue("ID", row)
				
				if (ID.equals(AddressIDG))
					{
					
					AL1 = dataFileAddress.getValue("AL1", row)
					AL2 = dataFileAddress.getValue("AL2", row)
					ZIP = dataFileAddress.getValue("ZIP", row)
					
					
					}
			}
		
	}
	
	
	
	@Keyword
	def setDataCardAddress(String AddressIDS)
	{
		
		this.getDataCardAddress(AddressIDS)
		
		if ((!AL1.isEmpty()))
			{
				WebUI.setText(findTestObject(pathOR + 'input_billingAddress'),AL1)
			}
			
			
		if ((!AL2.isEmpty()))
			{
				WebUI.setText(findTestObject(pathOR + 'input_billingAddress2'),AL2)
			}
			
			
		if ((!ZIP.isEmpty()))
			{
				WebUI.setText(findTestObject(pathOR + 'input_billingZip'),ZIP)
			}
		
	}
	
	
	
	
//*********************************************************************************************
	 
	 /*END*/
	 
//*********************************************************************************************
	
	
	
//*********************************************************************************************
	 
	 /*GetData and SetData for Email and Phone Number
	  Takes the argument for EmailPhone ID and queries NormalizedSharedData spreadsheet for EmailAndPhone Data*/
	 
	 
//*********************************************************************************************
	
	
	
	@Keyword
	def getDataCardEmailAndPhone(String EmailPhoneIDG)
	{
		
		def dataFileEmailPhone = ExcelFactory.getExcelDataWithDefaultSheet(pathSharedData, "EmailAndPhoneData", true)
		
		def numOfRowsEmailPhone = dataFileEmailPhone.getRowNumbers()
		
		for (def row = 1; row <= numOfRowsEmailPhone; row++)
			{
	
				def ID = dataFileEmailPhone.getValue("ID", row)
				
				if (ID.equals(EmailPhoneIDG))
					{
					
					email = dataFileEmailPhone.getValue("Email", row)
					//phone = dataFileEmailPhone.getValue("Phone", row)
					
					
					}
			}
	}
	
	
	
	@Keyword
	def setDataCardEmailAndPhone(String EmailPhoneIDS)
	{
		
		this.getDataCardEmailAndPhone(EmailPhoneIDS)
		
		if ((!email.isEmpty()))
			{
				WebUI.setText(findTestObject(pathOR + 'input_emailAddress'),email)
			}
		
	}
	
	
	
	
//*********************************************************************************************
	 
	 /*END*/
	 
//*********************************************************************************************
	
	
	
	
//*********************************************************************************************
	 
	 /*SetData for Amount
	  Takes the argument for Dollar Amount and populates it in the Amount field*/
	 
	 
//*********************************************************************************************
	
	
	@Keyword
	def setDataAmount(String AmountS)
	{
		amount = AmountS
		
		if ((!amount.isEmpty()))
			{
				WebUI.setText(findTestObject(pathOR + 'input_amount'),amount)
			}
	}
	
	
	
//*********************************************************************************************
	 
	 /*END*/
	 
//*********************************************************************************************
	
	
	
//*********************************************************************************************
	 
	 /*SetData for UDF 1 to 10
	  Takes the argument for UDF ID and queries NormalizedSharedData spreadsheet for UDF Data*/
	 
	 
//*********************************************************************************************
	
	@Keyword
	def setDataCardUDF(int rowS, String dataFileS)
	{
		
		
		
	}
	
	
	
//*********************************************************************************************
	 
	 /*END*/
	 
//*********************************************************************************************
	
	
	// placeholder for PaymentDate for Deferred
	
	
	
	// placeholder for Store Payment Method checkbox
	
	
	// placeholder for Customer CC Terms checkbox
	
	
	// placeholder for selecting Continue button
	
	
	// placeholder for selecting Change Payment Method button
	
	
	// placeholder for selecting Exit button
	
	
}





