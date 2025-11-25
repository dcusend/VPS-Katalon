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
nameSheet = "VerifyRemoveCartContent"
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
		
		CustomKeywords.'multiBillPages.searchPage.selectAddtoCart'()
		
		Thread.sleep(GlobalVariable.shortDelay)
		
		CustomKeywords.'multiBillPages.searchPage.selectViewCart'()
		
		Thread.sleep(10000)
		
		if(WebUI.verifyTextPresent("Cart Contents", false)) {
			
			Thread.sleep(10000)
			
			
			
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/CartContents/btn_removefromCartIcon'),10))
			{
				WebUI.verifyTextPresent("VIRGINIA", false)
				CustomKeywords.'multiBillPages.cartContentPage.selectRemovefromCart'()
				WebUI.delay(5)
				
				if (WebUI.verifyTextNotPresent("VIRGINIA", false))
				{
					KeywordUtil.markPassed("Bill was removed from the Cart")
					resText = "Pass"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				}
				else
				{
					KeywordUtil.markFailed("Bill was not removed from the Cart")
					resText = "Fail"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				}
			}
			
			
			
			
//			def isRemoveFromCartExist = WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/CartContents/btn_removefromCartIcon'),10)
			
//			if(isRemoveFromCartExist) {
//				CustomKeywords.'multiBillPages.cartContentPage.selectRemovefromCart'()
//				KeywordUtil.logInfo("No Matching Items Found")
//				KeywordUtil.markPassed("Data found and Payer Name Address and Account Number are matching")
//				resText = "Pass"
//				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
//				}
//				else {
//					KeywordUtil.logInfo("Remove from Cart Icon not present")
//					KeywordUtil.markFailed("Remove from Cart Icon not present")
//					resText = "Fail"
//					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
//				}
//			}
			
//		else {
//				KeywordUtil.logInfo("User is not on Cart Contents Page")
//				KeywordUtil.markFailed("User is not on Cart Contents Page")
//				resText = "Fail"
//				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
//			}
			
			
			
		}
		
			
		}}