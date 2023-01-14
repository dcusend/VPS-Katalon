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



def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
//String appName, appID, username, password, cardNameV, al1V, al2V, zipV, cardTypeV, last4V

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/VLinkSmokeData.xlsx"
def numOfRows, dataFile, nameSheet


	
	nameSheet = "Auth-MRF"
	numOfRows = findTestData('QA/VLinkTestData/VLinkAuthMRFData').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "QA/VLinkTestData/VLinkAuthMRFData"


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
					def category = findTestData(dataFile).getValue('Category', row)
					def amount = findTestData(dataFile).getValue('Amount', row)
					def cardName = findTestData(dataFile).getValue('CardName', row)
					def al1 = findTestData(dataFile).getValue('AL1', row)
					def city = findTestData(dataFile).getValue('City', row)
					def state = findTestData(dataFile).getValue('State', row)
					def zip = findTestData(dataFile).getValue('ZIP', row)
					def cardNumber = findTestData(dataFile).getValue('CardNumber', row)
					def exM = findTestData(dataFile).getValue('ExM', row)
					def exY = findTestData(dataFile).getValue('ExY', row)

					WebUI.openBrowser(GlobalVariable.VLinkURL + "auth.html")
					WebUI.maximizeWindow()
					

					
					WebUI.maximizeWindow()
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/txt_TransactionType'), tranType)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/txt_MessageVersion'), mv)
					
					
					
					def genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
					//WebUI.setText(findTestObject('Object Repository/VLink/Page_CCSale/txt_RemID'),genRemID)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Remittance Id_remittance_id'), genRemID)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Application Id_application_id'),  appID)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Username_username'), username)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Password_password'), password)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/txt_ResponseFormat'), resFormat)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Category_category'), category)
					
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/txt_CardName'), cardName)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/txt_AL1'), al1)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/txt_CardCity'), city)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/txt_CardState'), state)
					
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/txt_CardZIP'), zip)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Amount_amount'), amount)
					
					
					//WebUI.doubleClick(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Card number_card_number'))
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Card number_card_number'), cardNumber)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Card ex month_card_exmo'), exM)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Card ex year_card_exyr'), exY)
					
					//WebUI.click(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Track Data_track_data'))
					
					//WebUI.click(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_CVV state_cvv_state'))
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Track Data_track_data'), '')
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_concat(Cardholder, , s email)_email'), '')
					
					WebUI.click(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_user_defined10_user_defined10'))
					
					
					
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Card on File Indicator_card_on_file_i_157dae'), '')
					
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_Stored Credential Indicator_stored_cr_4ae73c'), '')
					
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_COF Scheduled indicator_cof_scheduled_8df7d8'), '')
					
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input_COF Transaction Initiated by_cof_tran_6cded5'), '')
					
						
					WebUI.click(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-AuthOnly/input'))
					
					
					
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
						}

				}
		}
	
