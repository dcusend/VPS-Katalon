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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory



String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/IWPTestData/VRelay25PaymentsExtension.xlsx"
def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false


	
	nameSheet = "CMCAutoPayPlanPC"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/IWPTestData/VRelay25PaymentsExtension.xlsx", nameSheet, true)
	dataFileEmulator = "IWPTestData/EmulatorData"
	
	
	numOfRows = dataFile.getRowNumbers()
	println("Number of Records: " + numOfRows)
	
	
	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = dataFile.getValue('Execute', row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					// Retrieve EmulatorData Foreign Key
					def EmulatorDataKey = dataFile.getValue('EmulatorData', row)
					System.out.println('Value of Emulator Key is : ' + EmulatorDataKey)
					
					// Open Emulator URL and populate
					CustomKeywords.'iwpPages.emulatorIWP30.setDataEmulator_DD'(EmulatorDataKey)
					
					def testHarnessURL = GlobalVariable.urlTestHarness
					
					WebUI.openBrowser(testHarnessURL)
					WebUI.maximizeWindow()
					
					// Populate Test Harness
					CustomKeywords.'iwpPages.TestHarnessPage.setDataMethodEF'(row,dataFile)
					
					
					// Select Personal Check Payment Method
					WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByPersonalCheck'))
					
					// Select Continue on Confirm page
					WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))
					
					
					// Set Data on Credit Payment Entry page
					CustomKeywords.'iwpPages.achPersonalPaymentEntryPage.setDataACHPPM'(row,dataFile)
					
					// Select Continue on Confirm page
//					WebUI.click(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmButton'))
					WebUI.click(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmAndSubmitACHButton'))
					
					
					Thread.sleep(2000)
					if (WebUI.verifyTextPresent("AutoPay", false))
						{
							WebUI.openBrowser(testHarnessURL)
							WebUI.maximizeWindow()
							
							// Populate Test Harness
							CustomKeywords.'iwpPages.TestHarnessPage.setDataMethodEF'(row,dataFile)
							
							//Click on Cancel Payment Button
							WebUI.click(findTestObject('Object Repository/IWP30/Page_ManagePlan_Autopay/btn_modify'))	
							WebUI.click(findTestObject('Object Repository/IWP30/Page_Modify/btn_savechanges'))
							
							if (WebUI.verifyTextPresent("Edits to your payment plan were completed successfully", false)) {
								WebUI.click(findTestObject('Object Repository/IWP30/Page_ManagePlan_Autopay/btn_cancel'))
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