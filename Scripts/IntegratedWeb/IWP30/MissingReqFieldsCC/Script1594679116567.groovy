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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

	


	//WebUI.openBrowser('https://qa.velocitypayment.com/agency/config.do?action=editor')
	WebUI.openBrowser(GlobalVariable.urlEmulator)
	WebUI.maximizeWindow()
	
	//Begin setData

									

			WebUI.selectOptionByValue(findTestObject('IWP30/Page_VRelay30Emulator/MV'),"3.0", true)
				
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Amount'),"10.50")
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/CAN'),"5465460")
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Action'),"PayNow")
			
						
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lang'),"")
			
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
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF3'),"")
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF4'),"data 4")
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF5'),"data 5")
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF6'),"")
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF7'),"")
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF8'),"")
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF9'),"data 9")
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF10'),"data 10")
			Thread.sleep(5000)
			
			WebUI.click(findTestObject('IWP30/Page_VRelay30Emulator/Submit'))
			
			Thread.sleep(5000)

			// End setData

			WebUI.closeBrowser()
			
			//WebUI.openBrowser('https://dev-algorithm.govolution.com/vrelaytest/QA/version_2_2/vrelaytest.html')
			WebUI.openBrowser(GlobalVariable.urlTestHarness)
			WebUI.maximizeWindow()
			
			def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
			
//Verify if we are on the TestHarness page and Populate the TestHarness
						
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'), 30))
			{
				println("We are on Test Harness page, start populating")
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/ApplicationID'),"649")
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/MessageVersion'),"3.0")
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'),genRemIDVoid)
				WebUI.click(findTestObject('Object Repository/IWP30/Page_QATestHarness/SubmitButton'))
				
			}
			else {
				
				println ("Not on Test Harness page")
			}
			
			
// Verify if we are on the Select Payment Method page and populate the page
			
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCreditCard'), 30))
			{
				println("We are on Select Payment Method page, start populating")
				WebUI.check(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCreditCard'))
				Thread.sleep(1000)
				
				WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))
				
			}
			else
			{
				println("Not on Select Payment Method page")
			}
			
// Don't populate the page and Select the Submit button.  

			
			WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),"")
			WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'))
			
// Verify the Missing Required Fields error messages
	try 
	{		
			WebUI.verifyTextPresent(("Amount is required"), false)
			WebUI.verifyTextPresent(("UDF3 Label is required"), false)
			WebUI.verifyTextPresent(("UDF8 Label is required"), false)
			WebUI.verifyTextPresent(("Card name is required"), false)
			WebUI.verifyTextPresent(("Card number is required"), false)
			WebUI.verifyTextPresent(("Signature panel code is required"), false)
			WebUI.verifyTextPresent(("Card expiration date is required"), false)
			WebUI.verifyTextPresent(("Card address Line 1 is required"), false)
			WebUI.verifyTextPresent(("Card ZIP Code is required"), false)
			WebUI.verifyTextPresent(("Email address is required"), false)
			WebUI.verifyTextPresent(("You must review and accept the Credit Card terms and conditions in order to process a credit transaction"), false)
	}	
	catch (Exception exp) 
	{
		println "Exception is: " + exp.getMessage()
		
	}
	
// Close the browser
	WebUI.closeBrowser()