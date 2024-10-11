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

//def executionProfile = RC.getExecutionProfile()
//System.out.println ("executionProfile : " + executionProfile)
String appName, appID, username, password, cardNameV, al1V, al2V, zipV, cardTypeV, last4V

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/VoidCreditThem.xlsx"
def numOfRows, dataFile, nameSheet


	
	nameSheet = "VoidThem"
	numOfRows = findTestData('Misc/VoidThem').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "Misc/VoidThem"


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			
			//appID = "2465"
			//username = "voiduser"
			//password = "HUp7StV9p4w9Bv"

			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today

					
					
					def transactionID = findTestData(dataFile).getValue('TransactionID', row)
					appID = findTestData(dataFile).getValue('AppID', row)
					username = findTestData(dataFile).getValue('Username', row)
					password = findTestData(dataFile).getValue('Password', row)
					def remID = findTestData(dataFile).getValue('RemID', row)
					
					
					//def genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
					//WebUI.setText(findTestObject('Object Repository/VLink/Page_CCSale/txt_RemID'),genRemID)
					
					
							
							
							
							// Void the Sale
							
							WebUI.openBrowser("https://dev-algorithm.govolution.com/vlinktest/Production/version_2_0/CC_void.html")
							WebUI.maximizeWindow()
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Void/txt_RemID'), remID)
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Void/txt_ApplicationID'), appID)
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Void/txt_Username'), username)
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Void/txt_Password'), password)
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Void/txt_TransactionID'), transactionID)
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Void/txt_OriginalTransactionType'), '104')
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Void/txt_TrackData'), '')
							
							WebUI.click(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Void/btn_ProcessVLinkTransaction'))
							
							
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
									KeywordUtil.markFailed("Void Failed, Error on Page is : " + WebUI.getText(findTestObject('Object Repository/Page_VLinkReceipt/pre_STX')))
								}
							
							
							
						

				}
		}
	
