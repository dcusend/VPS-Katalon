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


	
	//nameSheet = "CreditThem"
	//numOfRows = findTestData('Misc/CreditThem').getRowNumbers()
	//println("Number of Records: " + numOfRows)
	//dataFile = "Misc/CreditThem"
	
	
	nameSheet = "CreditThemDallas"
	numOfRows = findTestData('Misc/CreditThemDallas').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "Misc/CreditThemDallas"


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			
			//appID = "2465"
			//username = "voiduser"
			//password = "HUp7StV9p4w9Bv"
			
			appID = "5324"
			username = "user5324"
			password = "pwd5324"
			
			
			
						

			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today

					
					
					
					def transactionID = findTestData(dataFile).getValue('ParentTranxID', row)
					def genRemID = findTestData(dataFile).getValue('RemID', row)
					def amount = findTestData(dataFile).getValue('Amount', row)
					
					
					//def genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
					//WebUI.setText(findTestObject('Object Repository/VLink/Page_CCSale/txt_RemID'),genRemID)
					
					
							
							// Credit the Sale
							
							WebUI.openBrowser("https://dev-algorithm.govolution.com/vlinktest/Production/version_2_0/CC_credit.html")
							WebUI.maximizeWindow()
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Credit/input_Remittance Id'), genRemID)
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Credit/input_Application Id'), appID)
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Credit/input_Username'), username)
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Credit/input_Password'), password)
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Credit/input_Transaction ID'), transactionID)
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Credit/input_Amount'), amount)
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Credit/input_Card number'), '')
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Credit/input_Card ex month'), '')
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Credit/input_Card ex year'), '')
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Credit/input_Track Data'), '')
							
							WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Credit/input_Category Code'), "ECOM")
							
							WebUI.click(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-CC-Credit/input'))
							
							
							
							
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
									KeywordUtil.markFailed("Credit Failed, Error on Page is : " + WebUI.getText(findTestObject('Object Repository/Page_VLinkReceipt/pre_STX')))
								}
							
							
							
						

				}
		}
	
