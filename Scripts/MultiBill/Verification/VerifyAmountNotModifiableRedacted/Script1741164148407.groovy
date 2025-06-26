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
def multibillURL=GlobalVariable.MultiBillSingleCFURL
def shortDelay = GlobalVariable.shortDelay

String path = fileLoc
nameSheet = "VerifyNoModifyAmountandRedacted"
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
		
		Thread.sleep(shortDelay)
		
		// Open multibill URL and populate search criteria
		CustomKeywords.'multiBillPages.searchPage.setDataSearchString'(searchString)
		
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement Table = driver.findElement(By.xpath("//table/tbody"))
		
		//To locate rows of table it will Capture all the rows available in the table
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		
		//Assign boolean value if input_amount element is present
		def isAmountElementNotPresent = WebUI.verifyElementNotPresent(findTestObject('Object Repository/MultiBill/MultibillSearch/input__amount'),30)
		
		Thread.sleep(shortDelay)
		
		//Checks if Amount is modifiable it is pass else fail
		if(isAmountElementNotPresent) {
			KeywordUtil.logInfo("Amount Text box is not present")
			
			//To calculate no of rows In table
			rows_count = rows_table.size()
		   println(rows_count)
			   
			   //If We have more than 1 row in table match the value on page with datasheet
			   if(rows_count>0) {
				   WebUI.verifyTextPresent(dataFile.getValue("Amount", row), false)
				   
				   println(dataFile.getValue("Amount", row))
			
				   KeywordUtil.markPassed("Amount text box at search page is not editable and redacted")
				   resText = "Pass"
				   CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
			}}
		else {
			
			KeywordUtil.logInfo("Amount Text box is editable")
			KeywordUtil.markPassed("Amount text box at search page is editable")
			resText = "Fail"
			CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
			
			}
		
		}
}