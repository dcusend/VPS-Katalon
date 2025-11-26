import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
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



String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/MultibillTestData/MultibillCCData.xlsx"

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, searchString
def shortDelay = GlobalVariable.shortDelay
def multibillURL=GlobalVariable.MultiBillNoCFURL

String path = fileLoc
nameSheet = "CCData"
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
			
			//Assign search String
			
		searchString = dataFile.getValue("SearchString", row)
		
		WebUI.openBrowser(multibillURL)
		WebUI.maximizeWindow()
		
		WebUI.delay(2)
		
		// Open multibill URL and populate search criteria
		CustomKeywords.'multiBillPages.searchPage.setDataSearchString'(searchString)
		
		WebUI.delay(2)
		
		//select add to cart icon
		CustomKeywords.'multiBillPages.searchPage.selectAddtoCart'()
		WebUI.delay(2)
		
		//click on ViewCart icon
		CustomKeywords.'multiBillPages.searchPage.selectViewCart'()
		WebUI.delay(2)
		
		//select check out on cart content page 
		CustomKeywords.'multiBillPages.cartContentPage.selectCheckout'()
		WebUI.delay(2)
		
		//SelectPayment Method Radio button
		CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByCreditCard'()
		WebUI.delay(2)
		
		//Select Make a Payment button 
		CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()
		WebUI.delay(2)
		
		def cardholder_Name = WebUI.getAttribute(findTestObject('Object Repository/MultiBill/Page_PaymentEntry_CC/CardholderName'), 'value')
		WebUI.verifyMatch("PAMELA SMITH", cardholder_Name, false)
		
		def al1 = WebUI.getAttribute(findTestObject('Object Repository/MultiBill/Page_PaymentEntry_CC/AL1'), 'value')
		WebUI.verifyMatch("3940 GRANGE RD", al1, false)
		
		def zip_Code = WebUI.getAttribute(findTestObject('Object Repository/MultiBill/Page_PaymentEntry_CC/ZipCode'), 'value')
		WebUI.verifyMatch("28650", zip_Code, false)
		
		WebUI.verifyTextPresent('By checking this box I am giving Hicksville Water District permission to process this payment on my behalf', true)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/Page_PaymentEntry_CC/TandC_Checkbox'), 30)
		
		
		}}