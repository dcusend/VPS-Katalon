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
import internal.GlobalVariable
import net.sf.jasperreports.data.DataFile

import org.openqa.selenium.Keys as Keys

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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testdata.reader.ExcelFactory

String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/ABPTestData/ABPTestData.xlsx"
String path = fileLoc
nameSheet = "sheet1"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)

numOfRows = dataFile.getRowNumbers()


WebUI.openBrowser(GlobalVariable.abpURL)
WebUI.maximizeWindow()


//CustomKeywords.'abpPages.LoginPage.setLoginDataMethod'()
//CustomKeywords.'abpPages.LoginPage.clickForgotPassword'()
//CustomKeywords.'abpPages.LoginPage.setForgotPasswordDataMethod'("t476640@deluxe.com","abc")
//Thread.sleep(GlobalVariable.shortDelay)
 CustomKeywords.'abpPages.LoginPage.setLoginDataMethod'()
 CustomKeywords.'abpPages.PendingBillPage.checkToPayMethod'()
 CustomKeywords.'abpPages.PendingBillPage.selectPaymentMethodCC'()
 //CustomKeywords.'abpPages.PendingBillPage.selectPaymentMethodPersonalChecking'()
 //CustomKeywords.'abpPages.PendingBillPage.selectPaymentMethodBusinessChecking'()
 //CustomKeywords.'abpPages.PendingBillPage.selectPaymentMethodPersonalSavings'()
 
 
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
				 def achID = dataFile.getValue("ACHID", row)
				 def nickNameID = dataFile.getValue("NickName", row)
				 //CustomKeywords.'abpPages.PendingBillPage.setDataACHCorp'(achID)
				 CustomKeywords.'abpPages.PendingBillPage.selectPaymentMethodCC'()
				 CustomKeywords.'abpPages.PendingBillPage.uncheckSavePaymentMethod'()
				 CustomKeywords.'abpPages.PendingBillPage.setDataUDF'(udfID)
				 CustomKeywords.'abpPages.PendingBillPage.setDataAddress'(AddressID)
				 //CustomKeywords.'abpPages.PendingBillPage.setDataNickNameID'(nickNameID)
			 }
	 }
//CustomKeywords.'abpPages.LoginPage.selectBillTypeMethod'("459bills")
//CustomKeywords.'abpPages.LoginPage.setDataLookUpField'("abc","01234","03456")
//CustomKeywords.'abpPages.LoginPage.clickPayAsGuest'()
 
 Thread.sleep(GlobalVariable.shortDelay)
WebUI.closeBrowser()