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



WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.RADurl)

String orPath = "Object Repository/RAD_Pages/Landing_Page"



if (WebUI.verifyElementPresent(findTestObject(orPath + '/dd_TaxType'), 30))
{
	System.out.println('Tax Type/Filing Year drop down was found on the Landing Page')
}
else 
{
	System.out.println('Tax Type/Filing Year drop down was NOT found on the Landing Page')
}



if (WebUI.verifyTextPresent('Your Progress', true))
	{
		System.out.println('Your Progress Static text was found on the Landing Page')
	}
	else
	{
		System.out.println('Your Progress Static text was NOT found on the Landing Page')
	}

	
	
	if (WebUI.verifyTextPresent('Tax Type/Taxpayer Information', true))
		{
			System.out.println('Tax Type/Taxpayer Information text was found on the Landing Page')
		}
	else
		{
			System.out.println('Tax Type/Taxpayer Information Static text was NOT found on the Landing Page')
		}
		
		
	if (WebUI.verifyTextPresent('Summary', true))
			{
				System.out.println('Summary Static text was found on the Landing Page')
			}
	else
			{
				System.out.println('Summary Static text was NOT found on the Landing Page')
			}
			
			
	if (WebUI.verifyTextPresent('Need Help?', true))
			{
				System.out.println('Need Help? Static text was found on the Landing Page')
			}
	else
			{
				System.out.println('Need Help? Static text was NOT found on the Landing Page')
			}
				
			/*
			 * if (WebUI.verifyTextPresent('Contact 1-800-MD TAXES (1-800-638-2937)', true))
			 * { System.out.println('Contact 1-800-MD TAXES (1-800-638-2937) or
			 * taxhelp@marylandtaxes.gov Static text was found on the Landing Page') } else
			 * { System.out.println('Contact 1-800-MD TAXES (1-800-638-2937) or
			 * taxhelp@marylandtaxes.gov Static text was NOT found on the Landing Page') }
			 */
					
			/*
			 * if (WebUI.verifyTextPresent('FOR TAX RELATED QUESTIONS', true)) {
			 * System.out.println('FOR TAX RELATED QUESTIONS Static text was found on the
			 * Landing Page') } else { System.out.println('FOR TAX RELATED QUESTIONS Static
			 * text was NOT found on the Landing Page') }
			 */
			
			
	if (WebUI.verifyElementPresent(findTestObject(orPath + '/button_Continue'), 30))
		{
			System.out.println('Continue Button was found on the Landing Page')
		}
	else
		{
			System.out.println('Continue Button was NOT found on the Landing Page')
		}

		
		
	if (WebUI.verifyElementPresent(findTestObject(orPath + '/a_taxhelpmarylandtaxes.gov'), 30))
		{
			System.out.println('Tax Help Maryland.gov link was found on the Landing Page')
		}
	else
		{
			System.out.println('Tax Help Maryland.gov link was NOT found on the Landing Page')
		}
		

		
		/*
		 * if (WebUI.verifyElementPresent(findTestObject(orPath + '/a_For technical
		 * questions and support'), 30)) { System.out.println('For technical questions
		 * and support link was found on the Landing Page') } else {
		 * System.out.println('For technical questions and support link was NOT found on
		 * the Landing Page') }
		 */
		
		
		
	if (WebUI.verifyElementPresent(findTestObject(orPath + '/a_Comptroller of Maryland'), 30))
		{
			System.out.println('Comptroller of Maryland link was found on the Landing Page')
		}
	else
		{
			System.out.println('Comptroller of Maryland link was NOT found on the Landing Page')
		}
		
		
		/*
		 * if (WebUI.verifyElementPresent(findTestObject(orPath + '/a_Department of
		 * Information Technology (DoIT)'), 30)) { System.out.println('Department of
		 * Information Technology link was found on the Landing Page') } else {
		 * System.out.println('Department of Information Technology link was NOT found
		 * on the Landing Page') }
		 */
		
		
		/*
		 * if (WebUI.verifyElementPresent(findTestObject(orPath + '/a_double_arrow Click
		 * for 247 Support'), 30)) { System.out.println('Click for 24/7 Support link was
		 * found on the Landing Page') } else { System.out.println('Click for 24/7
		 * Support link was NOT found on the Landing Page') }
		 */
				
		
		
		/*
		 * if (WebUI.verifyElementPresent(findTestObject(orPath + '/a_Maryland.gov'),
		 * 30)) { System.out.println('Mayrland.gov link was found on the Landing Page')
		 * } else { System.out.println('Mayrland.gov link was NOT found on the Landing
		 * Page') }
		 */
		
		def totalOptions = WebUI.getNumberOfTotalOption(findTestObject(orPath + '/dd_TaxType'))

//		if (totalOptions == 6)
		
// Updates for December 2023			
		if (totalOptions == 4)
			{
				System.out.println('Total Options are correct: ' + totalOptions)
				KeywordUtil.markPassed("Total Options are correct")
			}
		else
			{
				System.out.println('Total Options are NOT correct: ' + totalOptions)
				KeywordUtil.markFailed("Total Options are NOT correct")
			}
			
			
			
		if (WebUI.verifyOptionPresentByLabel(findTestObject(orPath + '/dd_TaxType'), "Quarterly Estimated Tax", false, 60))
			{
				System.out.println('Estimated Tax Option is present in the Tax Type Drop Down')
			}
		else
			{
				System.out.println('Estimated Tax Option is NOT present in the Tax Type Drop Down')
			}
		
		
			// Updates for August 2023
			
			
			/*
			 * if (WebUI.verifyOptionPresentByLabel(findTestObject(orPath + '/dd_TaxType'),
			 * "Personal Income Tax", false, 60)) { System.out.println('Personal Income Tax
			 * Option is present in the Tax Type Drop Down') } else {
			 * System.out.println('Personal Income Tax Option is NOT present in the Tax Type
			 * Drop Down') }
			 */			
		
//		if (WebUI.verifyOptionPresentByLabel(findTestObject(orPath + '/dd_TaxType'), "Extension Payments", false, 60))
//			{
//				System.out.println('Extension Payments Option is present in the Tax Type Drop Down')
//			}
//		else
//			{
//				System.out.println('Extension Payments Option is NOT present in the Tax Type Drop Down')
//			}
		
		
		if (WebUI.verifyOptionPresentByLabel(findTestObject(orPath + '/dd_TaxType'), "Existing Liability w/Notice Number", false, 60))
			{
				System.out.println('Existing Liability Option is present in the Tax Type Drop Down')
			}
		else
			{
				System.out.println('Existing Liability Option is NOT present in the Tax Type Drop Down')
			}
		
			// Updates for August 2023
		
		if (WebUI.verifyOptionPresentByLabel(findTestObject(orPath + '/dd_TaxType'), "New Tax Return Amount Due", false, 60))
			{
				System.out.println('New Liability Option is present in the Tax Type Drop Down')
			}
		else
			{
				System.out.println('New Liability Option is NOT present in the Tax Type Drop Down')
			}
		
		
		
			/*
			 * if (WebUI.verifyOptionPresentByLabel(findTestObject(orPath + '/dd_TaxType'),
			 * "Withholding Tax", false, 60)) { System.out.println('Withholding Tax Option
			 * is present in the Tax Type Drop Down') } else {
			 * System.out.println('Withholding Tax Option is NOT present in the Tax Type
			 * Drop Down') }
			 */
		
		
		
		
		
		
		
		