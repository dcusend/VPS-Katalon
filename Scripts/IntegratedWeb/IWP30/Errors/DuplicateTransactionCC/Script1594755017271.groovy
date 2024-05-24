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

	WebUI.openBrowser(GlobalVariable.urlEmulator)

	WebUI.maximizeWindow()
	
	//Begin setData

			CustomKeywords.'iwpPages.emulatorIWP30.setDataEmulatorStandard'()

			
			//WebUI.openBrowser('https://dev-algorithm.govolution.com/vrelaytest/QA/version_2_2/vrelaytest.html')
			WebUI.openBrowser(GlobalVariable.urlTestHarness)
			WebUI.maximizeWindow()
			
			
			
//Verify if we are on the TestHarness page and Populate the TestHarness
						
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'), 30))
			{
				println("We are on Test Harness page, start populating")
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/ApplicationID'),"649")
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/MessageVersion'),"3.0")
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'),"test05152024101")
				WebUI.click(findTestObject('Object Repository/IWP30/Page_QATestHarness/SubmitButton'))
				WebUI.closeBrowser()
				
				
				//Reuse the same Remittance ID
				WebUI.openBrowser(GlobalVariable.urlTestHarness)
				WebUI.maximizeWindow()
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/ApplicationID'),"649")
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/MessageVersion'),"3.0")
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'),"test05152024101")
				WebUI.click(findTestObject('Object Repository/IWP30/Page_QATestHarness/SubmitButton'))
				
			}
			else {
				
				println ("Not on Test Harness page")
			}
			
			
// Verify the Error message
			
			WebUI.verifyTextPresent(("The following error occurred"), false)
			WebUI.verifyTextPresent(("ransaction cannot be processed [duplicate transaction]"), false)
			WebUI.verifyTextPresent(("Please  click here to continue"), false)
			
		WebUI.closeBrowser()	