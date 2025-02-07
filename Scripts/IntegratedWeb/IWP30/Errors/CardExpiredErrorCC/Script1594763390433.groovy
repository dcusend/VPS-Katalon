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
			
			
			// Verify if we are on Credit Card Payment Entry page and populate the page
			
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'), 30))
			{
				
				println("We are on Credit Card Payment Entry page, start populating")
				
			/*	if ((WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),30)) && (CCAmount!=null))
					{
						WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),CCAmount)
					}
					else{println("Amount field is not present on CC Payment Entry page")}*/
					
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),30))
						{
							
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),"10.50")
							
						}
					else {println("Amount field is either missing or not modifiable on CC Payment Entry page")}
					
					
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),30))
						{
							
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),"")
							
						}
					else {println("UDF2 field is either missing or not modifiable on CC Payment Entry page")}

				

					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),30))
						{
							
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),"data 3")
							
						}
					else {println("UDF3 field is either missing or not modifiable on CC Payment Entry page")}
				
				
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7'),30))
						{
							
								WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7')),"Orange",false)
							
						}
					else {println("UDF7 field is either missing or not modifiable on CC Payment Entry page")}
				

					
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8'),30))
						{
							
								WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8')),"Tennis",false)
							
						}
					else {println("UDF8 field is either missing or not modifiable on CC Payment Entry page")}

				
				
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'),30))
						{
							
								WebUI.setText((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name')),"Jonathan Lewis")
							
						}
					else {println("Name field is either missing or not modifiable on CC Payment Entry page")}

			
				
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),30))
						{
							
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),"4111111111111111")
							
						}
					else {println("Card Number field is missing on CC Payment Entry page")}
						
				
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),30))
						{
							
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),"147")
							
						}
					else {println("SPC field is missing on CC Payment Entry page")}
					
					
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),30))
						{
							
								WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),"01",false)
							
						}
					else {println("Month field is missing on CC Payment Entry page")}

										
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),30))
						{
							
								WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),"2025",false)
							
						}
					else {println("Year field is missing on CC Payment Entry page")}

					
					
//					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ProcessDate'),30))
//						{
//
//								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ProcessDate'),"")
//
//						}
//					else {println("ProcessDate field is missing on CC Payment Entry page")}
				
				
				
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),30))
						{
							
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),"18 Manhattan road")
							
						}
					else {println("AL1 field is missing on CC Payment Entry page")}
				
				
				
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),30))
						{
							
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),"Room 1")
							
						}
					else {println("AL2 field is missing on CC Payment Entry page")}
				
				
	
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),30))
						{
							
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),"22201")
							
						}
					else {println("ZIP field is missing on CC Payment Entry page")}
								
				
	
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/EmailAddress'),30))
						{
							
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/EmailAddress'),"Myemail@email.com")
							
						}
					else {println("Email field is missing on CC Payment Entry page")}
				
				
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'),30))
						{
							WebUI.check(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'))
						}
					else {println("Terms and Condition checkbox is missing on the CC Payment Entry page")}
					
					
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'),30))
						{
							WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'))
						}
					else {println("Continue button is missing on the CC Payment Entry page")}
					
//End Populating the Credit Card Payment Entry page
					
								
			}
			else
			{
				println("Not on Credit Card Payment Entry Page")
			}
			
			
// Verify the Amount is less than minimum error
			WebUI.verifyTextPresent(("Invalid card expiration date"), false)
			
			
// Close the Browser
			WebUI.closeBrowser()