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
String fileLoc = "KatalonData/IWPBootstrapData/VRelayPaymentsACH_27.xlsx"

def numOfRows, dataFile, nameSheet, dataFileEmulator, isRequiredTextPresent = false
def ExecuteTC, EmulatorDataKey, AppID, MessageVersion, Amount, UDFID, NameID
def CardID, CalDate, AddressID, EmailPhoneID, Notes
def stringArray=["Item No","Description","Amount","1234","Whole Wheat","\$5"]

String path = fileLoc
nameSheet = "CMCAutopayPC_27"
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
			
			CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByPersonal'()
			
			
			// Select Make a Payment Button
				CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonEnrollAutopay'()

				Thread.sleep(10000)
				
				if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input__viewParcelButton'), 0))
					{
						
						println("isRequired Text value :" + isRequiredTextPresent)
						
						//Click on View Parcel
						WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input__viewParcelButton'))
					
						isRequiredTextPresent = CustomKeywords.'pages.VerifyParcelTextUsingArray.getSetDataArrayParcel'(stringArray)													
						
						KeywordUtil.logInfo("View Parcel button Exists")
											
						
							if (isRequiredTextPresent == true)
								{
									println "All the relevant texts are present on CC Payment Entry Page"
									KeywordUtil.markPassed("All the relevant texts are present on CC Payment Entry Page")
									
									WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_ViewParcel/button_close'))
									
									CustomKeywords.'iwpPages.achPersonalPaymentEntryBootstrapPage.setDataACHDefferedMain'(NameID, ACHID, EmailPhoneID, AddressID, Amount, UDFID,CalDate)
									
									
									Thread.sleep(1000)
									
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
											if (WebUI.verifyTextPresent("AutoPay", false))
												{
													WebUI.openBrowser(testHarnessURL)
													WebUI.maximizeWindow()
													
													// Populate Test Harness
													CustomKeywords.'iwpPages.TestHarnessPage.setDataMethodEF'(row,dataFile)
													
													//Blocked with issue : https://deluxe.atlassian.net/browse/GOV-1145
													
													//Click on Modify Payment Button
												WebUI.click(findTestObject('Object Repository/Page_ManagePaymentPlan_Autopay/btn_modify'))
												WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_EditPaymentPlan_Autopay/btn_savechanges'))
												
												if (WebUI.verifyTextPresent("Edits to your payment plan were completed successfully", false)) {
													WebUI.click(findTestObject('Object Repository/Page_ManagePaymentPlan_Autopay/btn_cancel'))
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
														KeywordUtil.markFailed("Autopay is not present on page")
														resText = "Fail"
														CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
													}}
													else {
														
														isRequiredTextPresent = false
														KeywordUtil.logInfo("Some Text is missing at Payment Reciept Page")
														resText = "Fail"
														CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
													}
													KeywordUtil.markPassed("Parcels are present in all pages")
													resText = "Pass"
													println row
													CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
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
										