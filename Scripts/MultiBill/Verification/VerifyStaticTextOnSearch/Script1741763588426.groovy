import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.github.fge.jsonschema.library.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.builtin.CallTestCaseKeyword
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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory



String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/MultibillTestData/MultibillCCData.xlsx"

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, searchString
def rows_count
def multibillURL=GlobalVariable.MultiBillNoCFURL

String path = fileLoc
nameSheet = "VerifyStaticTextOnSearch"
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
			
			WebUI.openBrowser(multibillURL)
			WebUI.maximizeWindow()
			
			//Assign search String
			
		searchString = dataFile.getValue("SearchString", row)
		
		Thread.sleep(10000)
		
		// Open multibill URL and populate search criteria
		CustomKeywords.'multiBillPages.searchPage.setDataSearchString'(searchString)
		
		Thread.sleep(10000)
		
		if(WebUI.verifyTextPresent(dataFile.getValue("VT1", row), false)) {
			isRequiredTextPresent = true
			print(isRequiredTextPresent)
		}
		else {
			isRequiredTextPresent = false
		}
		if(isRequiredTextPresent) {
		if(WebUI.verifyTextPresent(dataFile.getValue("VT2", row), false)) {
			isRequiredTextPresent = true
			print(isRequiredTextPresent)
		}
		else {
			isRequiredTextPresent = false
		}}
		if(isRequiredTextPresent) {
		if(WebUI.verifyTextPresent(dataFile.getValue("VT3", row), false)) {
			isRequiredTextPresent = true
			print(isRequiredTextPresent)
		}
		else {
			isRequiredTextPresent = false
		}}
		if(isRequiredTextPresent) {
		if(WebUI.verifyTextPresent(dataFile.getValue("VT4", row), false)) {
			isRequiredTextPresent = true
			print(isRequiredTextPresent)
		}
		else {
			isRequiredTextPresent = false
		}}
		if(isRequiredTextPresent) {
		if(WebUI.verifyTextPresent(dataFile.getValue("VT5", row), false)) {
			isRequiredTextPresent = true
			print(isRequiredTextPresent)
		}
		else {
			isRequiredTextPresent = false
		}}
		if(isRequiredTextPresent) {
		if(WebUI.verifyTextPresent(dataFile.getValue("VT6", row), false)) {
			isRequiredTextPresent = true
			print(isRequiredTextPresent)
		}
		else {
			isRequiredTextPresent = false
		}}
		if(isRequiredTextPresent) {
		if(WebUI.verifyTextPresent(dataFile.getValue("VT7", row), false)) {
			isRequiredTextPresent = true
			print(isRequiredTextPresent)
		}
		else {
			isRequiredTextPresent = false
		}}
		if(isRequiredTextPresent) {
		if(WebUI.verifyTextPresent(dataFile.getValue("VT8", row), false)) {
			isRequiredTextPresent = true
			print(isRequiredTextPresent)
		}
		else {
			isRequiredTextPresent = false
		}}
		if (isRequiredTextPresent == true)
			{
				println "All the relevant texts are present on Receipt Page"
				KeywordUtil.markPassed("All the relevant texts are present on Receipt Page")
				resText = "Pass"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)

			}
		else
			{
				println "Some texts are missing on the Receipt page"
//								KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode')))
				resText = "Fail"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
//								println WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode'))
			}
		
		}
}
