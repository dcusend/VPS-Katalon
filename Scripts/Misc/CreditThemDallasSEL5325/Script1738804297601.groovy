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

import com.kms.katalon.core.configuration.RunConfiguration as RC
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


//def executionProfile = RC.getExecutionProfile()
//System.out.println ("executionProfile : " + executionProfile)
String appName, appID, username, password, cardNameV, al1V, al2V, zipV, cardTypeV, last4V

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/VoidCreditThem.xlsx"
def numOfRows, dataFile, nameSheet


	
	//nameSheet = "CreditThem"
	//numOfRows = findTestData('Misc/CreditThem').getRowNumbers()
	//println("Number of Records: " + numOfRows)
	//dataFile = "Misc/CreditThem"
	
	
	nameSheet = "CreditThemDallas5325"
	numOfRows = findTestData('Misc/CreditThemDallas5325').getRowNumbers()
	println("Number of Records: " + numOfRows)
	dataFile = "Misc/CreditThemDallas5325"


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			
			//appID = "2465"
			//username = "voiduser"
			//password = "HUp7StV9p4w9Bv"
			
			appID = "5325"
			username = "dallascounty"
			password = "nxndOzBg7"
			
			
			
						

			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today

					
					
					
					def transactionID = findTestData(dataFile).getValue('ParentTranxID', row)
					def genRemID = findTestData(dataFile).getValue('RemID', row)
					def amount = findTestData(dataFile).getValue('Amount', row)
					def cat = findTestData(dataFile).getValue('Category', row)
					
					
					//def genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
					//WebUI.setText(findTestObject('Object Repository/VLink/Page_CCSale/txt_RemID'),genRemID)
					
					
							
							// Credit the Sale
							
							//WebUI.openBrowser("https://dev-algorithm.govolution.com/vlinktest/Production/version_2_0/CC_credit.html")
							
							selenium.open("https://dev-algorithm.govolution.com/vlinktest/Production/version_2_0/CC_credit.html")
							
							//WebUI.maximizeWindow()
							
							
							selenium.type("name=remittance_id", genRemID)
							selenium.type("name=application_id", appID)
							selenium.type("name=username", username)
							selenium.type("name=password", password)
							selenium.type("name=transaction_id", transactionID)
							selenium.type("name=amount", amount)
							selenium.type("name=card_number", "")
							selenium.type("name=card_exmo", "")
							selenium.type("name=card_exyr", "")
							selenium.type("name=track_data", "")
							selenium.type("name=category", cat)
							selenium.click("xpath=//input[@value='Process V-Link Transaction']")
							
							
							
			
							
							
							
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
									KeywordUtil.markFailed("Credit Failed, Error on Page is : " + WebUI.getText(findTestObject('Object Repository/Page_VLinkReceipt/pre_STX')))
								}
							
							
							
						

				}
		}
	
