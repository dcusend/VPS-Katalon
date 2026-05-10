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
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil



String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/IWPBootstrapData/VRelayPaymentsCC.xlsx"

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, EmulatorDataKey, AppID, MessageVersion, Amount, UDFID, NameID
def CardID, CalDate, AddressID, EmailPhoneID, Notes

String path = fileLoc
nameSheet = "CCDeferredCC"
dataFileEmulator = "IWPTestData/EmulatorData"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)


//excelData = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)

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
			
			// Retrieve Foreign Keys
			EmulatorDataKey = dataFile.getValue("EmulatorData", row)
			Notes = dataFile.getValue("Notes", row)
			AppID = dataFile.getValue("AppID", row)
			MessageVersion = dataFile.getValue("MessageVersion", row)
			Amount = dataFile.getValue("Amount", row)
			UDFID = dataFile.getValue("UDFID", row)
			NameID = dataFile.getValue("NameID", row)
			CardID = dataFile.getValue("CardID", row)
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
	
			// Select Credit Card Payment Method
				CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByCreditCard'()
			
			
			// Select Make a Payment Button
				CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()

			
			// setData for Cardholder Name
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardName'(NameID)
			
			// setData for Card Information
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardInfo'(CardID)
			
			// setData for Address
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardAddress'(AddressID)
			
			// setData for Email and Phone Number
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardEmailAndPhone'(EmailPhoneID)
				
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCCDate'(CalDate)
				
			// setData for Amount
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataAmount'(Amount)
			
			// setData for UDFs
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardUDF'(UDFID)
			
			// Select Customer CC Terms Checkbox
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.selectCheckboxCCTerms'()
				
			// Select Continue Button
				CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.selectButtonContinue'()
				
			// Select Confirm Button on Payment Confirmation Page
				CustomKeywords.'iwpPages.paymentConfirmationBootstrapPage.selectButtonConfirm'()
				
				WebUI.delay(GlobalVariable.shortTimeDelay)
				if (WebUI.verifyTextPresent("Deferred", false))
					{
						println "Deferred is present on page. Deferred Pay is created"
					
						WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_SelectPaymentMethod_Bootstrap/input_ViewScheduledPayments'))
						
						if (WebUI.verifyTextPresent("View Scheduled Payments", false)) {
							WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_ScheduledPayments_Bootstrap/a_Edit'))
								
								// Set Data on Edit page
								CustomKeywords.'iwpPages.editSchedulePaymentBootstrap.setDataSchedPayment'(CardID,UDFID,CalDate)

								WebUI.verifyTextPresent(('Edit Payment Plan'), false)
								
								
													WebUI.verifyTextPresent(('Payment Information'), false)
								
//													WebUI.verifyTextPresent((Cardholders Name*'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/cardholder_name'), 10)
																	
													WebUI.verifyTextPresent(('Card Number*'), false)
																	
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/card_number'), 10)
													
													WebUI.verifyTextPresent(('Card Security Code*'), false)
													
//													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/card_security_code'), 10)
													
													WebUI.verifyTextPresent(('Expiration Date*'), false)
																	
													WebUI.verifyTextPresent(('Address Line 1*'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/billingAddress'), 10)
													
													
													WebUI.verifyTextPresent(('Address Line 2'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/billingAddress2'), 10)
																	
													WebUI.verifyTextPresent(('Country*'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/billingCountryShow'), 10)
													
													WebUI.verifyTextPresent(('ZIP Code*'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/billingZip'), 10)
													
													
													WebUI.verifyTextPresent(('City'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/billingCity'), 10)
													
													
													WebUI.verifyTextPresent(('State'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/billingState'), 10)
													
													
													WebUI.verifyTextPresent(('Email Address'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/emailAddress'), 10)
													
													WebUI.verifyTextPresent(('Plan Information'), false)
													
													WebUI.verifyTextPresent(('Payment Plan Type'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/plan_types'), 10)
													
													WebUI.verifyTextPresent(('Payment Plan Status'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/plan_type_status'), 10)
																			
													WebUI.verifyTextPresent(('Payment Date*'), false)
													
								//					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/startDate_Corp'), 10)
													
													
													WebUI.verifyTextPresent(('Payment Plan ID'), false)
													
								//					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/plan_id'), 10)
													
													WebUI.verifyTextPresent(('Tax Amount'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/taxAmount'), 10)
													
													
													WebUI.verifyTextPresent(('UDF2 Label'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/userDefined2'), 10)
													
													
													WebUI.verifyTextPresent(('UDF3 Label*'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/userDefined3'), 10)
													
													
													WebUI.verifyTextPresent(('UDF4 Label*'), false)
								//					WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/userDefined4'), 10)
													
													
													WebUI.verifyTextPresent(('UDF7 Label'), false)
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/userDefined7'), 10)
													
													
													WebUI.verifyTextPresent(('UDF8 Label*'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/userDefined8'), 10)
													
													
													WebUI.verifyTextPresent(('UDF9 Label*'), false)
													
													WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Deferred/userDefined9'), 10)

													WebUI.click(findTestObject('Object Repository/Page_EditSchedPayment/chkbox_acceptterms'))
													WebUI.click(findTestObject('Object Repository/Page_EditSchedPayment/btn_update'))
													
													WebUI.delay(GlobalVariable.shortTimeDelay)
													
													def editmsgText = WebUI.getText(findTestObject('Object Repository/IWP_Bootstrap/Page_EditScheduledPayment/div_Your payment plan has been successfully modified'))
													println(editmsgText)
													if (editmsgText.contains("Your payment plan has been successfully modified")) {
													WebUI.click(findTestObject('Object Repository/IWP30/Page_SuccesfulUpdate/btn_back'))
													}
													
													WebUI.delay(GlobalVariable.shortTimeDelay)
													WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_ScheduledPayments_Bootstrap/a_Cancel'))
													
													/*if (WebUI.verifyTextPresent("Your payment plan has been successfully modified", false)) {
													WebUI.click(findTestObject('Object Repository/IWP30/Page_SuccesfulUpdate/btn_back'))
													}
													WebUI.click(findTestObject('Object Repository/IWP30/Page_ScheduledPayments/cancel_payment'))*/
									
											}
											WebUI.delay(GlobalVariable.shortTimeDelay)
											if (WebUI.verifyTextPresent("Cancel Payment Plan", false)) {
												WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_CancelPaymentPlan/btn_CancelPlan'))
												/*WebUI.acceptAlert()*/
												WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_ImportantOperation/input_OK'))
											}
											
											def cancelmsgText = WebUI.getText(findTestObject('Object Repository/IWP_Bootstrap/Page_EditScheduledPayment/div_Your payment plan has been successfully modified'))
											println(cancelmsgText)
					
					
											if (cancelmsgText.contains("Your payment plan has been successfully canceled"))
												{
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
									else
										{
											KeywordUtil.markFailed("Deferred is not present on page")
											resText = "Fail"
											CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
										}
								
								WebUI.closeBrowser()
								
								}
							}
								
						
					
				
		
		