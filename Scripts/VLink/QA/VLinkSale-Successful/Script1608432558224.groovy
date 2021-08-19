import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.testdata.reader.ExcelFactory


/*
	Object excelData = ExcelFactory.getExcelDataWithDefaultSheet("C:\\KatalonData\\VLinkCCTestData.xlsx", "CCSaleData", true)	
		
	def numOfRows = excelData.rowNumbers
	def nameOfSheet = excelData.sheetNames
	
	println "Number of Rows: " +  numOfRows
	println "Name of Sheet: " + nameOfSheet*/
	

		//Date today = new Date()
		//println (today)
		
		String resText = "Fail"
		//String datText = today
		String resColumn = "Result"
		String datCloumn = "Date"
		String fileLoc = "C:\\KatalonData\\VLinkCCTestData.xlsx"
		String nameSheet = "CCSaleData"


	

		def numOfRows = findTestData('QA/VLinkTestData/VLinkCCTestData').getRowNumbers()
		
			println("Number of Records: " + numOfRows)
		
			def dataFile = "QA/VLinkTestData/VLinkCCTestData"
		
		
		// For each row in the spreadsheet, execute the given steps
		for (def row = 1; row <= numOfRows; row++) {
			
			System.out.println('Begin Record Number: ' + row)
			
			Date today = new Date()
			println (today)
			String datText = today
			
//=======================================
			
//Step1	Open Browser with VLink Authcap URL
			
			WebUI.openBrowser(GlobalVariable.VLinkURL + "authcap.html")
			WebUI.maximizeWindow()
//========================================
			
			
//Step2 Verify if we are on Credit Card Payment Entry page and populate the page
			
			CustomKeywords.'vlinkPages.saleCCPage.setDataSCC'(row,dataFile)
			
//=======================================
			
//Step3 Verify if the transaction is successful
			if (WebUI.verifyTextPresent(("Transaction approved, no errors"), true))
			{
				println "Transaction Approved, no errors text is present on the Confirmation page"
				System.out.println('Pass Record Number: ' + row)
				resText = "Pass"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
			}
			else 
			{
				println "Transaction Approved, no errors text is not present on the Confirmation page"
				System.out.println('Fail Record Number: ' + row)
				resText = "Fail"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
			}
	
//=======================================
			
//Step4 Grab and Print the Remittance ID and Payment ID
					
		def sdfo = WebUI.getText(findTestObject('Object Repository/Page_VLinkReceipt/pre_STX'))
		
		System.out.println('sdfo: ' + sdfo)
		
		def remID = sdfo.substring(5, 35).trim()
		
		System.out.println('Remittance ID: ' + remID)
		
		def traxID = sdfo.substring(35,55).trim()
		
		System.out.println('Transaction ID: ' + traxID)
		
		
//=======================================
			
		System.out.println('End Record Number: ' + row)
		
		WebUI.closeBrowser()
			
	
			
			
			
		}
  