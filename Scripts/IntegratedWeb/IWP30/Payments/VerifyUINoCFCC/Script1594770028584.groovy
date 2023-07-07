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


	def numOfRows = findTestData('IWPTestData/VerifyUINoCFCCTestData').getRowNumbers()
	
	println(numOfRows)
	
	def dataFile = "IWPTestData/VerifyUINoCFCCTestData"

	for (def row = 1; row <= numOfRows; row++) {

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
			
			
			
// Verify static text and Exit button on Select Payment Method page
						
			WebUI.verifyTextPresent(("Select Payment Method"), false)
			WebUI.verifyTextPresent(("Please Choose the Method of Payment"), false)
			
			WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCreditCard'), 30)
			WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCorporateCheck'), 30)
			WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByPersonalCheck'), 30)
			WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/ExitButton'), 30)
			
			
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
			
			
// Verify Static text on Credit Card Payment Entry page
			
			WebUI.verifyTextPresent(("Required fields are highlighted with an asterisk"), false)
			WebUI.verifyTextPresent(("Please enter the following information about your payment"), false)
			WebUI.verifyTextPresent(("CAN Label"), false)
			WebUI.verifyTextPresent(("Tax Amount"), false)
			WebUI.verifyTextPresent(("Amount"), false)
			WebUI.verifyTextPresent(("UDF1 Label"), false)
			WebUI.verifyTextPresent(("UDF2 Label"), false)
			WebUI.verifyTextPresent(("UDF3 Label"), false)
			WebUI.verifyTextPresent(("UDF4 Label"), false)
			WebUI.verifyTextPresent(("UDF6 Label"), false)
			WebUI.verifyTextPresent(("UDF7 Label"), false)
			WebUI.verifyTextPresent(("UDF8 Label"), false)
			WebUI.verifyTextPresent(("UDF9 Label"), false)
			WebUI.verifyTextPresent(("Please enter the following information about your payment method"), false)
			WebUI.verifyTextPresent(("Cardholder's Name"), false)
			WebUI.verifyTextPresent(("Cards Accepted"), false)
			WebUI.verifyTextPresent(("Card Number"), false)
			WebUI.verifyTextPresent(("Card Security Code"), false)
			WebUI.verifyTextPresent(("Expiration Date"), false)
			WebUI.verifyTextPresent(("Payment Date"), false)
			WebUI.verifyTextPresent(("Billing Information"), false)
			WebUI.verifyTextPresent(("Address Line 1"), false)
			WebUI.verifyTextPresent(("Address Line 2"), false)
			WebUI.verifyTextPresent(("Country"), false)
			WebUI.verifyTextPresent(("ZIP Code"), false)
			WebUI.verifyTextPresent(("City"), false)
			WebUI.verifyTextPresent(("State"), false)
			WebUI.verifyTextPresent(("Receipt Information"), false)
			WebUI.verifyTextPresent(("Email Address"), false)
			WebUI.verifyTextPresent(("Please check here to store the payment method for future use"), false)
			WebUI.verifyTextPresent(("These are Customer CC Terms"), false)
			WebUI.verifyTextPresent(("These are CC Custom HTML"), false)
			WebUI.verifyTextPresent(("54654701"), false)
			WebUI.verifyTextPresent(("data 4"), false)
			WebUI.verifyTextPresent(("data 6"), false)
			WebUI.verifyTextPresent(("data 9"), false)
			
			
			WebUI.verifyTextNotPresent(("UDF5 Label"), false)
			WebUI.verifyTextNotPresent(("UDF10 Label"), false)
			
			
// Verify Elements on the Credit Card Payment Entry page
			
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ProcessDate'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CountryDropDown'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/City'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/State'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/EmailAddress'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/StorePaymentMethodCheckBox'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ChangePaymentMethodButton'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ExitButton'),30)
		


			
// Verify if we are on Credit Card Payment Entry page and populate the page
		
		CustomKeywords.'iwpPages.ccPaymentEntryPage.setDataCCPM'(row,dataFile)
		
		
// Get Verification data from Excel spreadsheet
		
		def Amount = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('CCAmount', row)
		def UDF2 = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('CCUDF2', row)
		def UDF3 = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('CCUDF3', row)
		def UDF7 = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('CCUDF7', row)
		def UDF8 = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('CCUDF8', row)
		def CName = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('CCName', row)
		def CardType = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('VerCardType', row)
		def Last4 = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('VerLast4', row)
		def CExp = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('VerExp', row)
		def AL1 = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('CCAL1', row)
		def AL2 = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('CCAL2', row)
		def City = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('VerCity', row)
		def State = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('VerState', row)
		def CZIP = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('CCZIP', row)
		def Email = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('CCEmail', row)
		def State2 = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('VerState2', row)
		def CName2 = findTestData('IWPTestData/VerifyUINoCFCCTestData').getValue('VerCCName', row)
		
		
		
// Verify Static text on Credit Card Confirmation page
		
		WebUI.verifyTextPresent(("Please verify the following information"), false)
		
		WebUI.verifyTextPresent(("CAN Label"), false)
		WebUI.verifyTextPresent(("54654701"), false)
		
		WebUI.verifyTextPresent(("Tax Amount"), false)
		WebUI.verifyTextPresent(("\$0.00"), false)
		
		WebUI.verifyTextPresent(("Amount"), false)
		WebUI.verifyTextPresent((Amount), false)
		
		WebUI.verifyTextPresent(("UDF2 Label"), false)
		WebUI.verifyTextPresent((UDF2), false)
		
		WebUI.verifyTextPresent(("UDF3 Label"), false)
		WebUI.verifyTextPresent((UDF3), false)
		
		WebUI.verifyTextPresent(("UDF4 Label"), false)
		WebUI.verifyTextPresent(("data 4"), false)
		
		WebUI.verifyTextPresent(("UDF6 Label"), false)
		WebUI.verifyTextPresent(("data 6"), false)
		
		WebUI.verifyTextPresent(("UDF7 Label"), false)
		WebUI.verifyTextPresent((UDF7), false)
		
		WebUI.verifyTextPresent(("UDF8 Label"), false)
		WebUI.verifyTextPresent((UDF8), false)
		
		WebUI.verifyTextPresent(("UDF9 Label"), false)
		WebUI.verifyTextPresent(("data 9"), false)
		
		WebUI.verifyTextPresent(("Card Information"), false)
		
		WebUI.verifyTextPresent(("Cardholder's Name"), false)
		WebUI.verifyTextPresent((CName), false)
		
		WebUI.verifyTextPresent(("Card Type"), false)
		WebUI.verifyTextPresent((CardType), false)
		
		WebUI.verifyTextPresent(("Card Number"), false)
		WebUI.verifyTextPresent((Last4), false)
		
		WebUI.verifyTextPresent(("Card Security Code"), false)
		
		WebUI.verifyTextPresent(("Expiration Date"), false)
		WebUI.verifyTextPresent((CExp), false)
		
		WebUI.verifyTextPresent(("Payment Date"), false)
		
		WebUI.verifyTextPresent(("Billing Information"), false)
		
		WebUI.verifyTextPresent(("Address Line 1"), false)
		WebUI.verifyTextPresent((AL1), false)
		
		WebUI.verifyTextPresent(("Address Line 2"), false)
		WebUI.verifyTextPresent((AL2), false)
		
		WebUI.verifyTextPresent(("Country"), false)
		WebUI.verifyTextPresent(("United States"), false)
		
		WebUI.verifyTextPresent(("City"), false)
		WebUI.verifyTextPresent((City), false)
		
		WebUI.verifyTextPresent(("State"), false)
		WebUI.verifyTextPresent((State), false)
		
		WebUI.verifyTextPresent(("ZIP Code"), false)
		WebUI.verifyTextPresent((CZIP), false)
		
		WebUI.verifyTextPresent(("Email Address"), false)
		WebUI.verifyTextPresent((Email), false)
		
		WebUI.verifyTextPresent(("Is this information correct"), false)
		
		WebUI.verifyTextPresent(("These are CC Custom HTML"), false)
		
		
// Verify buttons on Credit Card Confirmation page
		
		
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_Confirmation/ChangePaymentMethodButton'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmButton'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_Confirmation/ExitButton'),30)
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_Confirmation/ModifyButton'),30)
		
		
// Select Confirm button		
		
		WebUI.click(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmButton'))
		
		Thread.sleep(10000)
		
// Verify static text on Receipt page
		
		WebUI.verifyTextPresent(("Successful Payment Receipt"), false)
		WebUI.verifyTextPresent(("Please print this receipt for your records"), false)
		WebUI.verifyTextPresent(("Remittance ID"), false)
		
		WebUI.verifyTextPresent(("CAN Label"), false)
		WebUI.verifyTextPresent(("54654701"), false)
		
		WebUI.verifyTextPresent(("Received"), false)
		
		WebUI.verifyTextPresent(("UDF1 Label"), false)
		
		WebUI.verifyTextPresent(("UDF2 Label"), false)
		WebUI.verifyTextPresent((UDF2), false)
		
		WebUI.verifyTextPresent(("UDF3 Label"), false)
		WebUI.verifyTextPresent((UDF3), false)
		
		WebUI.verifyTextPresent(("UDF4 Label"), false)
		WebUI.verifyTextPresent(("data 4"), false)
		
		WebUI.verifyTextPresent(("UDF6 Label"), false)
		WebUI.verifyTextPresent(("data 6"), false)
		
		WebUI.verifyTextPresent(("UDF7 Label"), false)
		WebUI.verifyTextPresent((UDF7), false)
		
		WebUI.verifyTextPresent(("UDF8 Label"), false)
		WebUI.verifyTextPresent((UDF8), false)
		
		WebUI.verifyTextPresent(("UDF9 Label"), false)
		WebUI.verifyTextPresent(("data 9"), false)
		
		WebUI.verifyTextPresent(("Tax Amount"), false)
		WebUI.verifyTextPresent(("\$0.00"), false)
		
		WebUI.verifyTextPresent(("Amount"), false)
		WebUI.verifyTextPresent((Amount), false)
		
		WebUI.verifyTextPresent(("Transaction Type"), false)
		WebUI.verifyTextPresent(("Authorization and Capture"), false)
		
		WebUI.verifyTextPresent(("Card Information"), false)
		WebUI.verifyTextPresent((CardType), false)
		
		WebUI.verifyTextPresent((CName2), false)
		
		WebUI.verifyTextPresent((Last4), false)
		
		
		WebUI.verifyTextPresent(("Billing Information"), false)
		
		WebUI.verifyTextPresent(("Address Line 1"), false)
		WebUI.verifyTextPresent((AL1), false)
		
		WebUI.verifyTextPresent(("Address Line 2"), false)
		WebUI.verifyTextPresent((AL2), false)
		
		WebUI.verifyTextPresent(("Country"), false)
		WebUI.verifyTextPresent(("United States"), false)
		
		WebUI.verifyTextPresent(("City"), false)
		WebUI.verifyTextPresent((City), false)
		
		WebUI.verifyTextPresent(("State"), false)
		WebUI.verifyTextPresent((State2), false)
		
		WebUI.verifyTextPresent(("ZIP Code"), false)
		WebUI.verifyTextPresent((CZIP), false)
		
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_Receipt/ExitButton'),30)
		
		
		WebUI.closeBrowser()
		
		
		
	}	