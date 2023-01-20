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


String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/VLinkSmokeDataACH.xlsx"
def numOfRows, dataFile, nameSheet


	
	nameSheet = "Debit-MRF"
	numOfRows = findTestData('QA/VLinkTestData/VLinkDebitMRFData').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "QA/VLinkTestData/VLinkDebitMRFData"


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

					
					def appID = findTestData(dataFile).getValue('AppID', row)
					def username = findTestData(dataFile).getValue('Username', row)
					def password = findTestData(dataFile).getValue('Password', row)
					def errorMsg = findTestData(dataFile).getValue('ErrorMsg', row)
					def tranType = findTestData(dataFile).getValue('TranType', row)
					def mv = findTestData(dataFile).getValue('MV', row)
					def resFormat = findTestData(dataFile).getValue('ResFormat', row)
					def fName = findTestData(dataFile).getValue('Fname', row)
					def lName = findTestData(dataFile).getValue('Lname', row)
					def al1 = findTestData(dataFile).getValue('AL1', row)
					def city = findTestData(dataFile).getValue('City', row)
					def state = findTestData(dataFile).getValue('State', row)
					def zip = findTestData(dataFile).getValue('ZIP', row)
					def checkType = findTestData(dataFile).getValue('CheckType', row)
					def acNumber = findTestData(dataFile).getValue('AcNumber', row)
					def company = findTestData(dataFile).getValue('Company', row)
					def acType = findTestData(dataFile).getValue('AcType', row)
					def rtn = findTestData(dataFile).getValue('RTN', row)
					def amount = findTestData(dataFile).getValue('Amount', row)
					def sec = findTestData(dataFile).getValue('SEC', row)

					WebUI.openBrowser(GlobalVariable.VLinkURL + "debit.html")
					WebUI.maximizeWindow()


					
				WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Debit/input_Transaction Type'), tranType)
				
				WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Debit/input_Message Version'), mv)
				
				
				
				
				def genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Remittance Id'), genRemID)
				
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Application Id'), appID)
				
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Username'), username)
				
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Password'), password)
				
				WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Debit/input_Response Format'), resFormat)
				
				
				WebUI.setText(findTestObject('RecAndPlayBk/Page-Vlink-Debit/input_Check Type'), checkType)
				
				
				WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Debit/input_First Name'), fName)
				
				WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Debit/input_Last Name'), lName)
				
				WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Debit/input_Address'), al1)
				
				WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Debit/input_City'), city)
				
				WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Debit/input_State'), state)
				
				WebUI.setText(findTestObject('Object Repository/RecAndPlayBk/Page-Vlink-Debit/input_Zip'), zip)
				
				
				
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