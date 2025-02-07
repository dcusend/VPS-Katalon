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

import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.testobject.SelectorMethod

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join
import org.testng.asserts.SoftAssert
import com.kms.katalon.core.testdata.CSVData
import org.openqa.selenium.Keys as Keys

SoftAssert softAssertion = new SoftAssert();
WebUI.openBrowser('')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.google.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)

String appID, remID, username, password, transactionID, checkType, sec

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/VoidCreditThem.xlsx"
def numOfRows, dataFile, nameSheet


nameSheet = "VoidTranxACH"
numOfRows = findTestData('Misc/VoidTranxACH').getRowNumbers()
println("Number of Records: " + numOfRows)
dataFile = "Misc/VoidTranxACH"




for (def row = 1; row <= numOfRows; row++)
	{
	
		ExecuteTC = findTestData(dataFile).getValue('Execute', row)
		System.out.println('Value of Execute is : ' + ExecuteTC)
		
		
		//appID = "2465"
		//username = "voiduser"
		//password = "HUp7StV9p4w9Bv"

		
		if (ExecuteTC.equalsIgnoreCase("Y"))
			{
				System.out.println('Begin Record Number: ' + row)
	
				Date today = new Date()
				println (today)
				String datText = today

				
				
				transactionID = findTestData(dataFile).getValue('TransactionID', row)
				appID = findTestData(dataFile).getValue('AppID', row)
				username = findTestData(dataFile).getValue('Username', row)
				password = findTestData(dataFile).getValue('Password', row)
				remID = findTestData(dataFile).getValue('RemID', row)
				checkType = findTestData(dataFile).getValue('CheckType', row)
				sec = findTestData(dataFile).getValue('SEC', row)


				
				selenium.open("https://dev-algorithm.govolution.com/vlinktest/Production/version_2_0/ACH_void.html")
				
				
				selenium.type("name=remittance_id", remID)
				
				selenium.type("name=application_id", appID)
				
				selenium.type("name=username", username)
				
				selenium.type("name=password", password)
				
				selenium.type("name=check_type", checkType)
				
				selenium.type("name=standard_entry_class", sec)
				
				selenium.type("name=original_transaction_id", transactionID)
				
				selenium.type("name=original_transaction_type", "200")
			   
				selenium.click("xpath=//input[@value='Process V-Link Transaction']")
				
				
				
				


//selenium.open("https://dev-algorithm.govolution.com/vlinktest/QA2/version_2_0/ACH_void.html")
//selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Message Version :'])[1]/following::tr[1]")
//selenium.type("name=remittance_id", "147852369")
//selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Unique transaction Identifier, assigned by customer/agency. (maximum length = 30)'])[1]/following::tr[1]")
//selenium.type("name=application_id", "125")
//selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Value provided by Govolution.'])[1]/following::tr[1]")
//selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Value provided by Govolution.'])[1]/following::tr[1]")
//selenium.click("name=password")
//selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Value provided by Govolution.'])[2]/following::tr[1]")
//selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='fixed_width or xml'])[1]/following::tr[1]")
//selenium.click("name=standard_entry_class")
//selenium.type("name=standard_entry_class", "WEB")
//selenium.click("name=original_transaction_id")
//selenium.type("name=original_transaction_id", "369852")
//selenium.click("name=original_transaction_type")
//selenium.type("name=original_transaction_type", "200")
//selenium.click("xpath=//input[@value='Process V-Link Transaction']")
//selenium.open("https://qa2.velocitypayment.com/vlink/PostTransaction")
				
				
				
				
				if (WebUI.verifyTextPresent(("Transaction approved, no errors"), true))
					{
						println "Transaction Approved, no errors text is present on the Confirmation page"
						System.out.println('Pass Record Number: ' + row)
						resText = "Pass"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
					}
					else
					{
						println "Transaction Approved, no errors text is not present on the Confirmation page"
						System.out.println('Fail Record Number: ' + row)
						resText = "Fail"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						KeywordUtil.markFailed("Void Failed, Error on Page is : " + WebUI.getText(findTestObject('Object Repository/Page_VLinkReceipt/pre_STX')))
					}
				
				
				
			

	}
}

				
				
				
