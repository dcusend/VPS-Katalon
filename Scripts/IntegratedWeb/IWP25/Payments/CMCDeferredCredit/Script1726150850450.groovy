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


String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/IWPTestData/VRelay25PaymentsExtension.xlsx"
def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false


	
	nameSheet = "CMCDeferredPlanCredit"
	dataFile = "IWPTestData/IWP25CMCDeferredCredit"
	dataFileEmulator = "IWPTestData/EmulatorData"
	
	
	numOfRows = findTestData(dataFile).getRowNumbers()
	println("Number of Records: " + numOfRows)
	
	
	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					// Retrieve EmulatorData Foreign Key
					def EmulatorDataKey = findTestData(dataFile).getValue('EmulatorData', row)
					System.out.println('Value of Emulator Key is : ' + EmulatorDataKey)
					
					// Open Emulator URL and populate
					CustomKeywords.'iwpPages.emulatorIWP30.setDataEmulator_DD'(EmulatorDataKey)
					
					def testHarnessURL = GlobalVariable.urlTestHarness
					
					WebUI.openBrowser(testHarnessURL)
					WebUI.maximizeWindow()
					
					// Populate Test Harness
					CustomKeywords.'iwpPages.TestHarnessPage.setDataMethod'(row,dataFile)
					
					
					// Select Credit Card Payment Method
					WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCreditCard'))
					
					// Select Continue on Confirm page
					WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))
					
					
					// Set Data on Credit Card Payment Entry page
					CustomKeywords.'iwpPages.ccPaymentEntryPage.setDataCCPM'(row,dataFile)
					
					// Select Continue on Confirm page
//					WebUI.click(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmButton'))
					WebUI.click(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmAndSubmitACHButton'))
					
					
					Thread.sleep(2000)
					if (WebUI.verifyTextPresent("Deferred", false))
						{
							println "Deferred is present on page. Deferred Pay is created"
						
							WebUI.click(findTestObject('Object Repository/IWP30/Page_Receipt/ViewScheduledPaymentsButton'))							
							
							def title = findTestData(dataFile).getValue('Title', row)
							
							WebUI.switchToWindowTitle(title + 'View Scheduled Payments')
							Thread.sleep(5000)
							
//							def payment_id_obj = WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/payment_plan_id')).toString()
//							def payment_id = payment_id_obj.substring(17,23)
//							def new_href = 'javascript:deferredPaymentAction(\'cancel\', \'' + payment_id + '\');'
//							def paymentplan_cancelLink = WebUI.modifyObjectProperty(findTestObject('Object Repository/IWP30/Page_ScheduledPayments/cancel_payment'),'href','equals',new_href,true)
//							
							
							if (WebUI.verifyTextPresent("View Scheduled Payments", false)) {
								WebUI.click(findTestObject('Object Repository/IWP30/Page_ScheduledPayments/edit_payment'))	
//								WebUI.click(paymentplan_cancelLink)
								
								// Set Data on Edit page
								CustomKeywords.'iwpPages.editSchedulePayment.setDataSchedPayment'(row,dataFile)
								WebUI.click(findTestObject('Object Repository/Page_EditSchedPayment/chkbox_acceptterms'))
								WebUI.click(findTestObject('Object Repository/Page_EditSchedPayment/btn_update'))
								
								WebUI.delay(2)
								
								if (WebUI.verifyTextPresent("Successful Payment Plan Update", false)) {						
								WebUI.click(findTestObject('Object Repository/IWP30/Page_SuccesfulUpdate/btn_back'))
								}
								WebUI.click(findTestObject('Object Repository/IWP30/Page_ScheduledPayments/cancel_payment'))
								
							}
							
							if (WebUI.verifyTextPresent("Cancel Payment Plan", false)) {
								WebUI.click(findTestObject('Object Repository/IWP30/Page_PaymentPlan/btn_cancel'))
								WebUI.acceptAlert()				
							}
							
							Thread.sleep(2000)
							
							if (WebUI.verifyTextPresent("Your payment plan has been successfully canceled", false)) {								
								KeywordUtil.markPassed("Your payment plan has been successfully created, modified and canceled")
								resText = "Pass"
								println row 
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)																	
							}
							else {
								KeywordUtil.markFailed("Your payment plan is not created, modified and cancelled")
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
				WebUI.closeBrowser()		
	}