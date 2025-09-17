import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.wsdl.Import

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

import groovy.swing.factory.ComboBoxFactory
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
def stringArray=["TaxPayer Name","TaxPayer Address","Due Date","TaxPayer Number","Amount","UDF1","UDF2","UDF3","UDF4","UDF5","UDF6","SIGMON, VIRGINIA","238 10TH AVE NW","Dec 31, 2021","684826","\$16.51","68482620062005000000","SIGMON/ VIRGINIA","RMV","1989 OLDS CUTLASS CIERA 4 Door Sedan","2021","-"]

String path = fileLoc
nameSheet = "VerifyPaymentEntryPageCC"
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
		
		Thread.sleep(GlobalVariable.shortDelay)
		
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement Table = driver.findElement(By.xpath("//table/tbody"))
		
		//To locate rows of table it will Capture all the rows available in the table
		List<WebElement> rows_table = Table.findElements(By.tagName('tr'))
		
		//To calculate no of rows In table
		 rows_count = rows_table.size()
		println(rows_count)
			
			//If We have more than 1 row in table match the value on page with datasheet
			if(rows_count>0)
				 {
					 Thread.sleep(10000)
					 //Add item to Cart
					 CustomKeywords.'multiBillPages.searchPage.selectAddtoCart'()
		
					 Thread.sleep(10000)
					 //Click on View Cart
					 CustomKeywords.'multiBillPages.searchPage.selectViewCart'()
		
					 Thread.sleep(10000)
					 //Select Checkout option
					 CustomKeywords.'multiBillPages.cartContentPage.selectCheckout'()
		
					 // Select Credit Card Payment Method
					 CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByCreditCard'()
		
					 // Select Make a Payment Button
					 CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()
		
					 if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input__viewParcelButton'), 0))
						 {
							 KeywordUtil.logInfo("View Parcel button Exists")
							 //Click on View Parcel
							 WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input__viewParcelButton'))
							 Thread.sleep(GlobalVariable.shortDelay)
							 isRequiredTextPresent = CustomKeywords.'pages.VerifyParcelTextUsingArray.getSetDataArrayParcel'(stringArray)
				
							 if (isRequiredTextPresent == true)
								 {
									 println "All the relevant texts are present on CC Payment Entry Page"
									 KeywordUtil.markPassed("All the relevant texts are present on CC Payment Entry Page")
							
									 WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_ViewParcel/button_close'))
							
								 }else
												{
													println "Some text missing from Payment Entry Page CC"
													KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode')))
													resText = "Fail"
													CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
													
												}
											}
											else {
												
												KeywordUtil.logInfo("View Parcel button missing on CC Payment Entry page")
												resText = "Fail"
												CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
											}
											
				 }
				 else {
					 KeywordUtil.logInfo("No Data found with Search String")
					 KeywordUtil.markFailed("No Data found with Search String")
					 resText = "Fail"
					 CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				 }
											
				 }
		WebUI.closeBrowser()
		}