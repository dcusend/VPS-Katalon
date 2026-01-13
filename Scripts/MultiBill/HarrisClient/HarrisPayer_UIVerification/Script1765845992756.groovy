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


def multibillHarrisPayerURL = GlobalVariable.MultiBillHarrisPayerURL

//searchString = "Lenna Paprocki"
//searchString = GlobalVariable.RegisterSearchString

WebUI.openBrowser(multibillHarrisPayerURL)

WebUI.maximizeWindow()

WebUI.delay(2)

// Verify Search By Drop Down
def totalSearchByOptions = WebUI.getNumberOfTotalOption(findTestObject('Object Repository/MultiBill/MultibillSearch/dd_Harris_SearchBy'))


		if (WebUI.verifyEqual(totalSearchByOptions, 3, FailureHandling.CONTINUE_ON_FAILURE))
		{
			System.out.println('Total Options for Search By are correct: ' + totalSearchByOptions)
			//KeywordUtil.markPassed("Total Options are correct for Search By")
		}
	else
		{
			System.out.println('Total Options for Search By are NOT correct: ' + totalSearchByOptions)
			KeywordUtil.markFailed("Total Options for Search By are NOT correct")
		}

		
		WebUI.verifyOptionsPresent(findTestObject('Object Repository/MultiBill/MultibillSearch/dd_Harris_SearchBy'),['Payer Name'])
		WebUI.verifyOptionNotPresentByLabel(findTestObject('Object Repository/MultiBill/MultibillSearch/dd_Harris_SearchBy'),'Payer Account Number',false,10)
		WebUI.verifyOptionNotPresentByLabel(findTestObject('Object Repository/MultiBill/MultibillSearch/dd_Harris_SearchBy'),'Payer Address',false,10)
		 
		
		
// Verify Enter Search Value text box
		WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/MultibillSearch/txt_Harris_SearchValue'), 10, FailureHandling.CONTINUE_ON_FAILURE)
		
// Verify Search Button
		WebUI.verifyElementPresent(findTestObject('Object Repository/MultiBill/MultibillSearch/btn_Harris_Search'), 10, FailureHandling.CONTINUE_ON_FAILURE)
		


// End Here

