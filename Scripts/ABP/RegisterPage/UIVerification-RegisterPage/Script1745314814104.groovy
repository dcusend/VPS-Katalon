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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.console.ui.Console
import internal.GlobalVariable

import static org.assertj.core.api.Assertions.registerCustomDateFormat
import static org.assertj.core.api.InstanceOfAssertFactories.CHAR_SEQUENCE

import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory

def abpURL = GlobalVariable.abpURL

String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/ABPTestData/ABPTestData.xlsx"
String billType ,LookupField1,LookupField2,LookupField3

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, searchString
def rows_count
def VerificationText,stringArray
def shortDelay = GlobalVariable.shortDelay
def firstName,lastName,companyName,addressLine1,Zip,City,State

String path = fileLoc
nameSheet = "UIVerification-RegisterPayPage"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)

numOfRows = dataFile.getRowNumbers()


println ("Number of Rows : " + numOfRows)


for (def row = 1; row <= numOfRows; row++)
{

	ExecuteTC = dataFile.getValue("Execute", row)
	
	if (ExecuteTC.equalsIgnoreCase("Y"))
		{
			System.out.println('Begin Record Number: ' + row)

			Date today = new Date()
			println (today)
			String datText = today
			billType = dataFile.getValue("BillType", row)
			LookupField1 = dataFile.getValue("LookupField1", row)
			LookupField2 = dataFile.getValue("LookupField2", row)
			LookupField3 = dataFile.getValue("LookupField3", row)

		WebUI.openBrowser(abpURL)
		WebUI.maximizeWindow()
		Thread.sleep(shortDelay)
		CustomKeywords.'abpPages.LoginPage.selectBillTypeMethod'(billType)
		CustomKeywords.'abpPages.LoginPage.setDataLookUpField'(LookupField1,LookupField2,LookupField3)
		CustomKeywords.'abpPages.LoginPage.clickRegisterPayMethod'()
		VerificationText = dataFile.getValue("VTList", row)
		stringArray = VerificationText.split(",")
		print(stringArray)
		for(def item in stringArray)
			 {  
			
			println(item.trim())
			
			WebUI.verifyTextPresent(item.trim(),false) 
			}
			
		 firstName  =	WebUI.getAttribute(findTestObject('Object Repository/ABP/RegisterAndPay/input_FirstName'), "value")
		 lastName = WebUI.getAttribute(findTestObject('Object Repository/ABP/RegisterAndPay/input_LastName'), "value")
		 companyName = WebUI.getAttribute(findTestObject('Object Repository/ABP/RegisterAndPay/input_CompanyName'), "value")
		 addressLine1 = WebUI.getAttribute(findTestObject('Object Repository/ABP/RegisterAndPay/input_Addressline1'), "value")
		 Zip = WebUI.getAttribute(findTestObject('Object Repository/ABP/RegisterAndPay/input_ZipCode'), "value")
		City = WebUI.getAttribute(findTestObject('Object Repository/ABP/RegisterAndPay/input_City'), "value")
		State = WebUI.getAttribute(findTestObject('Object Repository/ABP/RegisterAndPay/select_State'), "value")
		
		println(firstName+lastName+addressLine1+Zip+City+State)
		
		WebUI.verifyEqual(firstName,dataFile.getValue("FirstName", row))
		WebUI.verifyEqual(lastName,dataFile.getValue("LastName", row))
		WebUI.verifyEqual(companyName,dataFile.getValue("CompanyName", row))
		WebUI.verifyEqual(addressLine1,dataFile.getValue("AddressLine1", row))
		WebUI.verifyEqual(Zip,dataFile.getValue("Zip", row))
		WebUI.verifyEqual(City,dataFile.getValue("City", row))	
		//WebUI.verifyEqual(State,dataFile.getValue("State", row))	
			 
		//WebUI.verifyTextPresent("Confirm Password:", false)
		}
}