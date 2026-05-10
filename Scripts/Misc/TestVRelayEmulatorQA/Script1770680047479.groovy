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


def numOfRows, nameSheet, dataFileEmulator
def emulator_url = GlobalVariable.urlEmulator

	
	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= 10; row++)
		{
		
			def useThisURL = emulator_url + "&message_version=2_5"
			WebUI.openBrowser(useThisURL)
			WebUI.maximizeWindow()
		
			if (WebUI.verifyElementPresent(findTestObject('IWP30/Page_VRelay30Emulator/Amount'), 30)) {
				
							println ("We are on the Emulator page, start populating")
				
							WebUI.selectOptionByValue(findTestObject('IWP30/Page_VRelay30Emulator/MV'),"2.5", true)
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Amount'),"10.50")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/CAN'),"54654785")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Action'),"AutoPay")
				
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lang'),"en_US")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Fname'),"")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lname'),"")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL1'),"")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL2'),"")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Country'),"")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/City'),"")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/State'),"")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/ZIP'),"")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Order'),"")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Company'),"")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Email'),"")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF1'),"")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF2'),"")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF3'),"data 3")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF4'),"data 4")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF5'),"data 5")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF6'),"data 6")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF7'),"Orange")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF8'),"Soccer")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF9'),"data 9")
				
							WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF10'),"data 10")
							Thread.sleep(2000)
				
							WebUI.click(findTestObject('IWP30/Page_VRelay30Emulator/Submit'))
				
							Thread.sleep(5000)
				
							// End setData
				
							WebUI.closeBrowser()
							
							def testHarnessURL = GlobalVariable.urlTestHarness
							
							WebUI.openBrowser(testHarnessURL)
							WebUI.maximizeWindow()
							
							// App ID 883, MV 2.5
							if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'), 30)) {
								println("We are on Test Harness page, start populating")
					
								def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
								
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/ApplicationID'),'883')
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/MessageVersion'),'2.5')
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'),genRemIDVoid)
								WebUI.click(findTestObject('Object Repository/IWP30/Page_QATestHarness/SubmitButton'))
								
								WebUI.check(findTestObject('Object Repository/IWP_Bootstrap/Page_SelectPaymentMethod_Bootstrap/input_Pay by Credit or Debit Card'))
								
								//WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_SelectPaymentMethod_Bootstrap/input_payNowSubmit'))
								//if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_SelectPaymentMethod_Bootstrap/input_payNowSubmit'), 10))
								if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_SelectPaymentMethod_Bootstrap/input_EnrollAutopay'), 10))
									
									
								{
									println "Payment Button was found"
								}
								else
								{
									println "Emulator changes did not work"
								}
								
							}
							else {
								println ("Not on Test Harness page")
							}
							
							
							
							
						}
						else {
							println ("We are not on Emulator page")
						}
			
				
		}