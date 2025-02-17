import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.github.fge.jsonschema.library.Keyword
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
String fileLoc = "KatalonData/IWPBootstrapData/VRelayPaymentsCC_27.xlsx"

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, EmulatorDataKey, AppID, MessageVersion, Amount, UDFID, NameID
def CardID, CalDate, AddressID, EmailPhoneID, Notes
def stringArray=["Item No","Description","Amount","1234","Whole Wheat","\$5"]

String path = fileLoc
nameSheet = "CCDeferredCC_27"
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

				Thread.sleep(10000)
				
				if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input__viewParcelButton'), 0))
					{
						
						println("isRequired Text value :" + isRequiredTextPresent)
						
						// setData for Cardholder Name
						CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardName'(NameID)
					
					// setData for Card Information
						CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardInfo'(CardID)
					
					// setData for Address
						CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardAddress'(AddressID)
						
						
					//set Future Payment Date 	
						CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCCDate'(CalDate)
					
					// setData for Email and Phone Number
						CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardEmailAndPhone'(EmailPhoneID)
						
					// setData for Amount
						CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataAmount'(Amount)
					
					// setData for UDFs
						CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardUDF'(UDFID)	
		
						
						KeywordUtil.logInfo("View Parcel button Exists")
						//Click on View Parcel
						WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input__viewParcelButton'))
					
						isRequiredTextPresent = CustomKeywords.'pages.VerifyParcelTextUsingArray.getSetDataArrayParcel'(stringArray)
						
							if (isRequiredTextPresent == true)
								{
									println "All the relevant texts are present on CC Payment Entry Page"
									KeywordUtil.markPassed("All the relevant texts are present on CC Payment Entry Page")
									
									WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_ViewParcel/button_close'))
									
									// Select Customer CC Terms Checkbox
									CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.selectCheckboxCCTerms'()
									
									
									// Select Continue Button
									CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.selectButtonContinue'()
									
									Thread.sleep(10000)
									
									isRequiredTextPresent = CustomKeywords.'pages.VerifyParcelTextUsingArray.getSetDataArrayParcel'(stringArray)
									
										if(isRequiredTextPresent == true) {
											
											CustomKeywords.'iwpPages.paymentConfirmationBootstrapPage.selectButtonConfirm'()
											Thread.sleep(10000)
											
											isRequiredTextPresent = CustomKeywords.'pages.VerifyParcelTextUsingArray.getSetDataArrayParcel'(stringArray)
					
										}
										else {
											
											isRequiredTextPresent = false
											KeywordUtil.logInfo("Some Text is missing at Payment Information Page")
										}
										
									if(isRequiredTextPresent == true) 
										{
												
												if (WebUI.verifyTextPresent("Deferred", false))
													{
						
														println "Deferred is present on page. Deferred Pay is created"
					
														WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_SelectPaymentMethod_Bootstrap/input_ViewScheduledPayments'))
						
														/*WebUI.switchToWindowTitle('View Scheduled Payments')*/
														Thread.sleep(100)
						
//														def payment_id_obj = WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/payment_plan_id')).toString()
//														def payment_id = payment_id_obj.substring(17,23)
//														def new_href = 'javascript:deferredPaymentAction(\'cancel\', \'' + payment_id + '\');'
//														def paymentplan_cancelLink = WebUI.modifyObjectProperty(findTestObject('Object Repository/IWP30/Page_ScheduledPayments/cancel_payment'),'href','equals',new_href,true)
//
						
														if (WebUI.verifyTextPresent("View Scheduled Payments", false)) 
															{
															WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_ScheduledPayments_Bootstrap/a_Cancel'))
//															WebUI.click(paymentplan_cancelLink)
							
															}
						
														if (WebUI.verifyTextPresent("Cancel Payment Plan", false)) 
															{
																WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_CancelPaymentPlan/btn_CancelPlan'))
																/*WebUI.acceptAlert()*/
																WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_ImportantOperation/input_OK'))
															}
						
															if (WebUI.verifyTextPresent("Your payment plan has been successfully canceled", false)) 
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
										}
											
					else {
												
												isRequiredTextPresent = false
												KeywordUtil.logInfo("Some Text is missing at Payment Reciept Page")
												resText = "Fail"
												CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
											}
							
								}
							else
								{
									println "Some texts are missing on the CC Payment Entry page"
	//								KeywordUtil.logInfo("Some texts are missing on the Receipt page")
									resText = "Fail"
									CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
	//								println WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode'))
								}
								
								
								}
							else {
								
								KeywordUtil.logInfo("View Parcel button missing on CC Payment Entry page")
								resText = "Fail"
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
							}
							
							WebUI.closeBrowser()
						
					}}
													

						
					

						
					
			
			
			
			
			
			
		