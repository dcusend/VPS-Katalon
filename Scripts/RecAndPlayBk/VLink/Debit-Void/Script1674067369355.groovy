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
String appName, appID, username, password, cardNameV, al1V, al2V, zipV, cardTypeV, last4V

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/VLinkSmokeDataACH.xlsx"
def numOfRows, dataFile, nameSheet


	
	nameSheet = "Debit-Void"
	numOfRows = findTestData('QA/VLinkTestData/VLinkDebitVoidData').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "QA/VLinkTestData/VLinkDebitVoidData"


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

															
					def checkType = findTestData(dataFile).getValue('CheckType', row)
					def acNumber = findTestData(dataFile).getValue('AcNumber', row)
					def company = findTestData(dataFile).getValue('Company', row)
					def acType = findTestData(dataFile).getValue('AcType', row)
					def rtn = findTestData(dataFile).getValue('RTN', row)
					def amount = findTestData(dataFile).getValue('Amount', row)
					def sec = findTestData(dataFile).getValue('SEC', row)

					WebUI.openBrowser(GlobalVariable.VLinkURL + "debit.html")
					WebUI.maximizeWindow()


						
				def genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Remittance Id'), genRemID)
				
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Application Id'), appID)
				
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Username'), username)
				
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Password'), password)
				
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Check Type'), checkType)
				
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Account_check'), acNumber)
				
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Company_check'), company)
				
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Account Type'), acType)
				
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Routing Number'), rtn)
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Amount'), amount)
				
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Check Email'), '')
				
				WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Debit/input_concat(CheckWriter, , s SSN)_check_ssn'), '')
				
				WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Debit/input_concat(CheckWriter, , s License Numbe_020fef'),'')
				
				WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Debit/input_concat(CheckWriter, , s License State_21e3e7'),'')
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Standard Entry Class'),sec)
				
				WebUI.click(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Debit/input'))
				
				
				if (WebUI.verifyTextPresent(("Transaction approved, no errors"), true))
					{
						println "Transaction Approved, no errors text is present on the Confirmation page"
						
						def sdfo = WebUI.getText(findTestObject('Object Repository/Page_VLinkReceipt/pre_STX'))
						
						System.out.println('sdfo: ' + sdfo)
						
						def remID = sdfo.substring(5, 35).trim()
						
						System.out.println('remID: ' + remID)
						
						def traxID = sdfo.substring(35,55).trim()
						
						System.out.println('traxID: ' + traxID)
						
						GlobalVariable.VLinkSaleRemID = remID
						GlobalVariable.VLinkSaleTranxID = traxID
						
						
						
						// Void the Debit
						
						WebUI.openBrowser(GlobalVariable.VLinkURL + "ACH_void.html")
						WebUI.maximizeWindow()
						
				
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-ACH-Void/input_Remittance Id'), GlobalVariable.VLinkSaleRemID)
				
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-ACH-Void/input_Application Id'), appID)
						
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-ACH-Void/input_Username'), username)
						
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-ACH-Void/input_Password'), password)
						
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-ACH-Void/input_Check Type'), checkType)
						
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-ACH-Void/input_Standard Entry Class'), sec)
						
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-ACH-Void/input_Transaction ID'), GlobalVariable.VLinkSaleTranxID)
						
						WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-ACH-Void/input_Original Transaction Type'), '200')
						
						WebUI.click(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-ACH-Void/input'))
						
	
				
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
					}
				}
				
		}