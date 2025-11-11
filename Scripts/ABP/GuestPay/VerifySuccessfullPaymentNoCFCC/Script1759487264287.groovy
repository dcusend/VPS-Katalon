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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory
import internal.GlobalVariable

//*******************Created by @Komal Mishra***************************************************

String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/ABPTestData/PaymentsCC.xlsx"
String path = fileLoc
nameSheet = "VerifySuccessfulPaymentCCNoCF"
def shortDelay = GlobalVariable.shortDelay
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)
def username,password

username = GlobalVariable.abpNoCFUsername
password = GlobalVariable.abpNoCFPassword

numOfRows = dataFile.getRowNumbers()
for (def row = 1; row <= numOfRows; row++)
	{
	
		ExecuteTC = dataFile.getValue("Execute", row)
		
		if (ExecuteTC.equalsIgnoreCase("Y"))
			{
				System.out.println('Begin Record Number: ' + row)
	
				Date today = new Date()
				println (today)
				String datText = today
				def udfID = dataFile.getValue("UDFID", row)
				def AddressID = dataFile.getValue("AddressID", row)
				def CardID = dataFile.getValue("CardID", row)
				def nickNameID = dataFile.getValue("NickName", row)
				def billType ="ImtiazABPnoCF916"
				def lookup1,lookup2,lookup3
				lookup1 = "123"
				lookup2 = "1234"
				lookup3 = "12345"
				WebUI.openBrowser(GlobalVariable.abpURL)
				WebUI.maximizeWindow()
				
				CustomKeywords.'abpPages.LoginPage.selectBillTypeMethod'(billType)
				CustomKeywords.'abpPages.LoginPage.setDataLookUpField'(lookup1, lookup2, lookup3)
				
				
			}}