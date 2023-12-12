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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.testdata.reader.ExcelFactory

import com.kms.katalon.core.configuration.RunConfiguration as RC
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

		
		String resText = "Fail"
		//String datText = today
		String resColumn = "Result"
		String datCloumn = "Date"
		//String fileLoc = "C:\\KatalonData\\VLinkCCTestData.xlsx"
		String fileLoc = "KatalonData/VLinkSmokeData.xlsx"
		String nameSheet = "Sale-MRF"


		def executionProfile = RC.getExecutionProfile()
		System.out.println ("executionProfile : " + executionProfile)

		def numOfRows = findTestData('QA/VLinkTestData/VLinkSaleMRFData').getRowNumbers()
		
			println("Number of Records: " + numOfRows)
		
			def dataFile = "QA/VLinkTestData/VLinkSaleMRFData"
		
		
		// For each row in the spreadsheet, execute the given steps
		for (def row = 1; row <= numOfRows; row++) {
			

			// Check if Execute = Y
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			String errorMsg = findTestData(dataFile).getValue('ErrorMsg', row)
			
			
			
			/*
			 * switch(executionProfile) { case "QAProfile": appID =
			 * findTestData(dataFile).getValue('AppIDQA', row) username =
			 * findTestData(dataFile).getValue('UsernameQA', row) password =
			 * findTestData(dataFile).getValue('PasswordQA', row) break
			 * 
			 * case "QA2Profile": appID = findTestData(dataFile).getValue('AppIDQA', row)
			 * username = findTestData(dataFile).getValue('UsernameQA', row) password =
			 * findTestData(dataFile).getValue('PasswordQA', row) break
			 * 
			 * case "DemoProfile": appID = findTestData(dataFile).getValue('AppIDDemo', row)
			 * username = findTestData(dataFile).getValue('UsernameDemo', row) password =
			 * findTestData(dataFile).getValue('PasswordDemo', row) break
			 */
				
				/*
				 * case "Production": appName = findTestData(dataFile).getValue('AppNameProd',
				 * row) appID = findTestData(dataFile).getValue('AppIDProd', row) break
				 *
				 * case "Upgrade": appName = findTestData(dataFile).getValue('AppNameProd', row)
				 * appID = findTestData(dataFile).getValue('AppIDProd', row) break
				 */
			//}
			
			
		if (ExecuteTC.equalsIgnoreCase("Y"))
		{
			
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
			
			//String allText = WebUI.getText(findTestObject('Object Repository/Page_VLinkReceipt/pre_STX'))
			//println allText
			
			/*
			 * if (allText.contains(errorMsg)) { println "errorMsg was found" } else {
			 * println "errorMsg was found" }
			 */
			
			
//Step3 Verify if the transaction is successful
			
			  if (WebUI.verifyTextPresent((errorMsg), true))
						{
							println "Error Message is present on the Confirmation page"
							System.out.println('Pass Record Number: ' + row)
							resText = "Pass"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						}
			  else
						{
							println "Error Message is not present on the Confirmation page"
							System.out.println('Fail Record Number: ' + row)
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
							KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/Page_VLinkReceipt/pre_STX')))
						}
			 
			
			
			/*
			 * if (allText.contains(errorMsg)) { println
			 * "Error Message is present on the Confirmation page" System.out.println('Pass
			 * Record Number: ' + row) resText = "Pass"
			 * CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn
			 * ,fileLoc,nameSheet,row) } else { println
			 * "Error Message is not present on the Confirmation page"
			 * System.out.println('Fail Record Number: ' + row) resText = "Fail"
			 * CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn
			 * ,fileLoc,nameSheet,row) }
			 */
			
			
			
	
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
			
			
		}
  