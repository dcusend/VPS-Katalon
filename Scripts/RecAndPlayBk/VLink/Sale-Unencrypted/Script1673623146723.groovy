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
String appName, appID, username, password, cardNameV, al1V, al2V, zipV, cardTypeV, last4V, trackData

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/VLinkSmokeData.xlsx"
def numOfRows, dataFile, nameSheet


	
	nameSheet = "Sale-Unencrypted"
	numOfRows = findTestData('QA/VLinkTestData/VLinkSaleUnencryptedData').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "QA/VLinkTestData/VLinkSaleUnencryptedData"


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			
			switch(executionProfile)
			{
				case "QAProfile":
						appID = findTestData(dataFile).getValue('AppIDQA', row)
						username = findTestData(dataFile).getValue('UsernameQA', row)
						password = findTestData(dataFile).getValue('PasswordQA', row)
				break
				
				case "QA2Profile":
						appID = findTestData(dataFile).getValue('AppIDQA', row)
						username = findTestData(dataFile).getValue('UsernameQA', row)
						password = findTestData(dataFile).getValue('PasswordQA', row)
				break
				
				case "DemoProfile":
						appID = findTestData(dataFile).getValue('AppIDDemo', row)
						username = findTestData(dataFile).getValue('UsernameDemo', row)
						password = findTestData(dataFile).getValue('PasswordDemo', row)
				break
				
				case "Demo2Profile":
						appID = findTestData(dataFile).getValue('AppIDDemo', row)
						username = findTestData(dataFile).getValue('UsernameDemo', row)
						password = findTestData(dataFile).getValue('PasswordDemo', row)
				break
				
				/*
				 * case "Production": appName = findTestData(dataFile).getValue('AppNameProd',
				 * row) appID = findTestData(dataFile).getValue('AppIDProd', row) break
				 *
				 * case "Upgrade": appName = findTestData(dataFile).getValue('AppNameProd', row)
				 * appID = findTestData(dataFile).getValue('AppIDProd', row) break
				 */
			}
			

			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today

					
					category = findTestData(dataFile).getValue('Category', row)
					amount = findTestData(dataFile).getValue('Amount', row)
					trackData = findTestData(dataFile).getValue('TrackData', row)

					WebUI.openBrowser(GlobalVariable.VLinkURL + "authcap.html")
					WebUI.maximizeWindow()
					

					
					WebUI.maximizeWindow()
					
					//WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/txt_TransactionType'),'104')
					
					def genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
					//WebUI.setText(findTestObject('Object Repository/VLink/Page_CCSale/txt_RemID'),genRemID)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_Remittance Id_remittance_id'), genRemID)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_Application Id_application_id'),  appID)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_Username_username'), username)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_Password_password'), password)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_Category_category'), category)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_Amount_amount'), amount)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_Card number_card_number'), '')
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_Card ex month_card_exmo'), '')
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_Card ex year_card_exyr'), '')
					
										
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_Track Data_track_data'), trackData)
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/txt_POSEntryMode'), 'track')
					
					WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_concat(Cardholder, , s email)_email'), '')
					
					WebUI.click(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_user_defined10_user_defined10'))
					
					
					if (executionProfile.equalsIgnoreCase("QAProfile") || executionProfile.equalsIgnoreCase("DemoProfile"))
						{
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_Card on File Indicator_card_on_file_i_157dae'), '')
					
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_Stored Credential Indicator_stored_cr_4ae73c'), '')
					
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_COF Scheduled indicator_cof_scheduled_8df7d8'), '')
					
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input_COF Transaction Initiated by_cof_tran_6cded5'), '')
					
						}
						
					WebUI.click(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Sale/input'))
					
					
					
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
							KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/Page_VLinkReceipt/pre_STX')))
						}

				}
		}
	
