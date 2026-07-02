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
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/IWPBootstrapData/VRelayPaymentsACH_30.xlsx"

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, EmulatorDataKey, AppID, MessageVersion, Amount, UDFID, NameID
def ACHID, CalDate, AddressID, EmailPhoneID, Notes

String path = fileLoc
nameSheet = "CancelStaticTextAutoPayCorp"
dataFileEmulator = "IWPTestData/EmulatorData"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)
numOfRows = dataFile.getRowNumbers()


println ("Number of Rows : " + numOfRows)


for (def row = 1; row <= numOfRows; row++)
{

	ExecuteTC = dataFile.getValue("Execute", row)
	
	if (ExecuteTC.equalsIgnoreCase("Y"))
		{
			System.out.println('Begin Record Number: ' + row)

			Date today = new Date()
			println (today)
			String datText = today
			
			EmulatorDataKey = dataFile.getValue("EmulatorData", row)
			Notes = dataFile.getValue("Notes", row)
			AppID = dataFile.getValue("AppID", row)
			MessageVersion = dataFile.getValue("MessageVersion", row)
			Amount = dataFile.getValue("Amount", row)
			UDFID = dataFile.getValue("UDFID", row)
			NameID = dataFile.getValue("NameID", row)
			ACHID = dataFile.getValue("ACHID", row)
			CalDate = dataFile.getValue("CalDate", row)
			AddressID = dataFile.getValue("AddressID", row)
			EmailPhoneID = dataFile.getValue("EmailPhoneID", row)
			
			// Open Emulator URL and populate
			
			 CustomKeywords.'iwpPages.emulatorIWP30.setDataEmulator_DD'(EmulatorDataKey)
			 
			
			def testHarnessURL = GlobalVariable.urlTestHarness
			
			WebUI.openBrowser(testHarnessURL)
			WebUI.maximizeWindow()
			
			// Populate Test Harness
			
			CustomKeywords.'iwpPages.TestHarnessPage.setDataMethodEF'(row,dataFile)
			
			
			// Select Pay by Personal Check Payment Method
			
			CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByCorporate'()
			
			// Select Make a Payment Button
				CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonEnrollAutopay'()
			
			// Calling ACH Main method to populate first name ,last name ,Account details,Email,Phone ,Amount ,UDF
			
			CustomKeywords.'iwpPages.achCorporatePaymentEntryBootstrapPage.setDataACHMain'(NameID, ACHID, EmailPhoneID, AddressID, Amount, UDFID)
			
			// Select Confirm Button on Payment Confirmation Page
			CustomKeywords.'iwpPages.paymentConfirmationBootstrapPage.selectButtonConfirm'()
			
				WebUI.delay(GlobalVariable.shortTimeDelay)
			
			if (WebUI.verifyTextPresent("Your payment plan has been successfully created", false) || WebUI.verifyTextPresent("AutoPay", false))
				{
					WebUI.openBrowser(testHarnessURL)
					WebUI.maximizeWindow()
					
					WebUI.delay(GlobalVariable.mediumTimeDelay)
					
					// Populate Test Harness
					CustomKeywords.'iwpPages.TestHarnessPage.setDataMethodEF'(row,dataFile)
					
				if(WebUI.verifyTextPresent("Manage Payment Plan", false)) {
						
		
					WebUI.click(findTestObject('Object Repository/Page_ManagePaymentPlan_Autopay/btn_cancel'))
					
		
					WebUI.verifyTextPresent(('Cancel Payment Plan'), false)
					
					WebUI.verifyTextPresent(('Payment Information'), false)

					WebUI.verifyTextPresent(('Company Name*'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/Company_Name'), 10)
									
					WebUI.verifyTextPresent(('Routing Transit Number*'), false)
									
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/routing_number'), 10)
					
					WebUI.verifyTextPresent(('Type of Account'), false)
					
//					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/account_type_corp'), 10)
					
					WebUI.verifyTextPresent(('Account Number*'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/account_number'), 10)
					
					
					WebUI.verifyTextPresent(('Confirm Account Number*'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/confirm_account_number'), 10)
					
					
					WebUI.verifyTextPresent(('Employer Identification Number (EIN)'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/ein'), 10)
					
					
					WebUI.verifyTextPresent(('Address Line 1*'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/billingAddress'), 10)
					
					
					WebUI.verifyTextPresent(('Address Line 2'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/billingAddress2'), 10)
									
					WebUI.verifyTextPresent(('Country*'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/billingCountryShow'), 10)
					
					WebUI.verifyTextPresent(('ZIP Code*'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/billingZip'), 10)
					
					
					WebUI.verifyTextPresent(('City*'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/billingCity'), 10)
					
					
					WebUI.verifyTextPresent(('State*'), false)
					
//					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/billingState'), 10)
					
					
					WebUI.verifyTextPresent(('Email Address*'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/emailAddress'), 10)
					

					WebUI.verifyTextPresent(('Payment Plan Start Date*'), false)
					
//					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/startDate_Corp'), 10)
					
					
					WebUI.verifyTextPresent(('Payment Plan Information'), false)
					
					WebUI.verifyTextPresent(('Payment Plan Type'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/plan_types'), 10)
					
					
					WebUI.verifyTextPresent(('Payment Plan ID'), false)
					
//					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/plan_id'), 10)
					
					WebUI.verifyTextPresent(('Bill/Invoice Details'), false)
					
					WebUI.verifyTextPresent(('UDF2 Label'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/userDefined2'), 10)
					
					
					WebUI.verifyTextPresent(('UDF3 Label*'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/userDefined3'), 10)
					
					
					WebUI.verifyTextPresent(('UDF4 Label*'), false)
//					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/userDefined4'), 10)
					
					
					WebUI.verifyTextPresent(('UDF7 Label'), false)
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/userDefined7'), 10)
					
					
					WebUI.verifyTextPresent(('UDF8 Label*'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/userDefined8'), 10)
					
					
					WebUI.verifyTextPresent(('UDF9 Label*'), false)
					
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/userDefined9'), 10)
								
					WebUI.verifyTextPresent(('Click "Cancel Plan" in order to complete the cancellation process.Click "Exit" if you no longer want to cancel this payment plan.'), false)
							
					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CancelPlan/btn_cancel'), 10)
					
					WebUI.click(findTestObject('Object Repository/IWP30/Page_CancelPlan/btn_cancel'))
					
					if (WebUI.verifyTextPresent("Your payment plan has been cancelled successfully", false)) {
						KeywordUtil.markPassed("Your payment plan has been successfully created and canceled")
						resText = "Pass"
						println row
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
					}
					else {
						KeywordUtil.markFailed("Your payment plan is not created and cancelled")
						resText = "Fail"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
					}
					
				}
				else {
					KeywordUtil.markFailed("Manage Payment Plan was not present on page(Getting select payment method page)")
					resText = "Fail"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
					
					}
				
				
				
				}
				else
					{
						KeywordUtil.markFailed("Autopay is not present on page")
						resText = "Fail"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
					}
			}
			WebUI.closeBrowser()
}