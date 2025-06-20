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
nameSheet = "VerifyStreetAddressSearch"
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
		
		Thread.sleep(20000)
		
		// Open multibill URL and populate search criteria
		CustomKeywords.'multiBillPages.searchPage.setDataSearchString'(searchString)
		Thread.sleep(10000)
		
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement Table = driver.findElement(By.xpath("//table/tbody"))
		
		//To locate rows of table it will Capture all the rows available in the table
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		
		//To calculate no of rows In table
		 rows_count = rows_table.size()
		println(rows_count)
			
			//If We have more than 1 row in table match the value on page with datasheet
			if(rows_count>0) {
				if(WebUI.verifyTextPresent(dataFile.getValue("PayerName", row), false)) {
				KeywordUtil.logInfo("PayerName present")
				isRequiredTextPresent = true
				}
				else {
					isRequiredTextPresent = false
				}
				
				if(WebUI.verifyTextPresent(dataFile.getValue("PayerAddress", row), false)) {
				KeywordUtil.logInfo("PayerAddress present")
				isRequiredTextPresent = true
				}
				else {
					isRequiredTextPresent = false
				}
				if(WebUI.verifyTextPresent(dataFile.getValue("DueDate", row), false)) {
					
				KeywordUtil.logInfo("DueDate present")
				isRequiredTextPresent = true
				}
				else {
					isRequiredTextPresent = false
				}
				//WebUI.setText(findTestObject('Object Repository/MultiBill/MultibillSearch/input__amount'),"Amount")
				//WebUI.verifyTextPresent("\$"+dataFile.getValue("Amount", row), false)
				//KeywordUtil.logInfo("Amount present")
				if(WebUI.verifyTextPresent(dataFile.getValue("AccountNumber", row), false)) {
					
				KeywordUtil.logInfo("AccountNumber present")
				isRequiredTextPresent = true
				}
				else {
					isRequiredTextPresent = false
				}
				
				if(isRequiredTextPresent)
				{
					KeywordUtil.logInfo("All Data Found and matching with data sheet")
					KeywordUtil.markPassed("Data found and Payer Name Address and Account Number are matching")
					resText = "Pass"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				}
				else {
					KeywordUtil.logInfo("No Matching Items Found")
					KeywordUtil.markFailed("No Matching Items Found")
					resText = "Fail"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				}
			}
				else {
					if(WebUI.verifyTextPresent("No Matching Items Found", false)) {
						KeywordUtil.logInfo("No records Found")
						KeywordUtil.markFailed("No records Found")
						resText = "Fail"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
			}
		}
		}
		
	
}