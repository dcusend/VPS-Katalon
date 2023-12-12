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

import com.kms.katalon.core.configuration.RunConfiguration as RC
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil



def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
//String appName, appID, username, password, cardNameV, al1V, al2V, zipV, cardTypeV, last4V

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/VLinkSmokeData.xlsx"
def numOfRows, dataFile, nameSheet


	
	nameSheet = "Cap-MRF"
	numOfRows = findTestData('QA/VLinkTestData/VLinkCapMRFData').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "QA/VLinkTestData/VLinkCapMRFData"


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
	
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					def errorMsg = findTestData(dataFile).getValue('ErrorMsg', row)
					def appID = findTestData(dataFile).getValue('AppID', row)
					def username = findTestData(dataFile).getValue('Username', row)
					def password = findTestData(dataFile).getValue('Password', row)
					def tranType = findTestData(dataFile).getValue('TranType', row)
					def mv = findTestData(dataFile).getValue('MV', row)
					def resFormat = findTestData(dataFile).getValue('ResFormat', row)
					def tranxID = findTestData(dataFile).getValue('TranxID', row)
					def amount = findTestData(dataFile).getValue('Amount', row)
					

					WebUI.openBrowser(GlobalVariable.VLinkURL + "capture.html")
					WebUI.maximizeWindow()
					

					
					WebUI.maximizeWindow()
					
					
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/txt_TransactionType'), tranType)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/txt_MessageVersion'), mv)
					
					def genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
	
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-VLink-Capture/input_Remittance Id_remittance_id'), genRemID)
					
					//WebUI.click(findTestObject('RecAndPlayBk/Page-VLink-Capture/tr_Application Id'))
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-VLink-Capture/input_Application Id_application_id'), appID)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-VLink-Capture/input_Username_username'), username)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-VLink-Capture/input_Password_password'), password)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-VLink-Capture/txt_ResponseFormat'), resFormat)
															
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-VLink-Capture/input_Transaction ID_transaction_id'), tranxID)
															
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-VLink-Capture/input_Amount_amount'), amount)
					
					WebUI.click(findTestObject('Object Repository/RecAndPlayBk/Page-VLink-Capture/input'))
					
					
					
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

				}
		}
	