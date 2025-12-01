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
		
		WebUI.delay(5)
		
		// Open multibill URL and populate search criteria
		CustomKeywords.'multiBillPages.searchPage.setDataSearchString'(searchString)
		
		WebUI.delay(5)
		
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
					 WebUI.delay(5)
					 //Add item to Cart
					 CustomKeywords.'multiBillPages.searchPage.selectAddtoCart'()
		
					 //Click on View Cart
					 CustomKeywords.'multiBillPages.searchPage.selectViewCart'()
					 
					 WebUI.delay(5)
		
					 //Select Checkout option
					 CustomKeywords.'multiBillPages.cartContentPage.selectCheckout'()
					 
					 WebUI.delay(5)
		
					 // Select Credit Card Payment Method
					 CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByCreditCard'()
		
					 // Select Make a Payment Button
					 CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()
		
					 def cardHolderName =WebUI.getAttribute(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input_billingName'), "value")
					 println(cardHolderName)
		
					 def addressLine1 =WebUI.getAttribute(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input_billingAddress'), "value")
					 println(addressLine1)
		
					 def amount = WebUI.getAttribute(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input_amount'), "value")
					 println(amount)
		
					 if(WebUI.verifyTextPresent("Payment Information", false))
						 {
		
							 if(cardHolderName.equalsIgnoreCase(dataFile.getValue("SearchString", row))) {
								 isRequiredTextPresent = true
								 println(isRequiredTextPresent)
								 
							 }
							 else{
								 isRequiredTextPresent = false
								 println("Cardholder Name is not pre-populated")
							 }
			
							 if(isRequiredTextPresent) {
								 if(addressLine1.equalsIgnoreCase(dataFile.getValue("PayerAddress", row))) {
									 isRequiredTextPresent = true
									 println(isRequiredTextPresent)
								 }
								 else{
									 isRequiredTextPresent = false
									 println("Payer Address is not pre-populated")
								 }
							 }
				
							 if(isRequiredTextPresent) {
								 if(amount.equalsIgnoreCase(dataFile.getValue("Amount", row))) {
									 isRequiredTextPresent = true
									 println(isRequiredTextPresent)
								 }
								 else{
									 isRequiredTextPresent = false
									 println("Amount is not pre-populated")
								 }
							 }
						 }
						 else {
							 KeywordUtil.logInfo("User not on Payer Information Page")
						 }
			
						 if(isRequiredTextPresent) {
							 KeywordUtil.logInfo("All data matching")
							 KeywordUtil.markPassed("All data are matching")
							 resText = "Pass"
							 CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						 }
						 else {
							 KeywordUtil.logInfo("Data not matching")
							 KeywordUtil.markFailed("Data not matching with Datasheet")
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
		
}
		