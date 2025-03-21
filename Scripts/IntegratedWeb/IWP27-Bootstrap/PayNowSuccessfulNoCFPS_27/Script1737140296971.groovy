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

import groovy.transform.ThreadInterrupt
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

String path = fileLoc
nameSheet = "PayNowNoCFPS_27"
dataFileEmulator = "IWPTestData/EmulatorData"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)
def stringArray=["Item No","Description","Amount","1234","Whole Wheat","\$5"]

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
			//CustomKeywords.'iwpPages.emulatorIWP30.setDataEmulator_DD'(EmulatorDataKey)
			
			def testHarnessURL = GlobalVariable.urlTestHarness
			
			WebUI.openBrowser(testHarnessURL)
			WebUI.maximizeWindow()
			
			// Populate Test Harness
			CustomKeywords.'iwpPages.TestHarnessPage.setDataMethodEF'(row,dataFile)
	
			// Select Pay by Personal Check Payment Method
			
			CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByPersonal'()
			
			// Select Make a Payment Method
			
			CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()
			
				
				if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input__viewParcelButton'), 0))
					{
						
						KeywordUtil.logInfo("View Parcel button Exists")
						//Click on View Parcel
						WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input__viewParcelButton'))
						
						isRequiredTextPresent = CustomKeywords.'pages.VerifyParcelTextUsingArray.getSetDataArrayParcel'(stringArray)
						
						println("isRequired Text value :" + isRequiredTextPresent)
						
						/*for(def item in stringArray) {
							println(item)
						
							if(WebUI.verifyTextPresent(item, false))
								 {
									 isRequiredTextPresent = true
								 }
								 else {
								isRequiredTextPresent = false
							}
							}*/
		
							if (isRequiredTextPresent == true)
								{
									println "All the relevant texts are present on CC Payment Entry Page"
									KeywordUtil.markPassed("All the relevant texts are present on CC Payment Entry Page")
									
									WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_ViewParcel/button_close'))
									
									CustomKeywords.'iwpPages.achPersonalPaymentEntryBootstrapPage.setDataACHMain'(NameID, ACHID, EmailPhoneID, AddressID, Amount, UDFID)
									
									isRequiredTextPresent = CustomKeywords.'pages.VerifyParcelTextUsingArray.getSetDataArrayParcel'(stringArray) 
									
									/*for(def item in stringArray) {
										println(item)
									
										if(WebUI.verifyTextPresent(item, false))
											 {
												 isRequiredTextPresent = true
											 }
											 else {
											isRequiredTextPresent = false
											KeywordUtil.logInfo("Text missing :" + item)
										}
										}*/
										if(isRequiredTextPresent == true) {
											
											CustomKeywords.'iwpPages.paymentConfirmationBootstrapPage.selectButtonConfirm'()
											Thread.sleep(10000)
											
											isRequiredTextPresent = CustomKeywords.'pages.VerifyParcelTextUsingArray.getSetDataArrayParcel'(stringArray)
					
										}
										else {
											
											isRequiredTextPresent = false
											KeywordUtil.logInfo("Some Text is missing at Payment Information Page")
										}
										
										/*for(def item in stringArray) {
											println(item)
										
											if(WebUI.verifyTextPresent(item, false))
												 {
													 isRequiredTextPresent = true
												 }
												 else {
												isRequiredTextPresent = false
												KeywordUtil.logInfo("Text missing :" + item)
											}
											}*/
											if(isRequiredTextPresent == true) {
												
												if (WebUI.verifyTextPresent(("Successful Payment Receipt"), false))
													{
														println "Successful Payment Receipt text is present on the Receipt page"
														KeywordUtil.markPassed("Successful Payment Receipt text is present on the Receipt page")
														resText = "Pass"
														CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
								
												KeywordUtil.logInfo("All text present at Reciept page")
																							
											}
											else
												{
													println "Successful Payment Receipt text is not present on the Receipt page"
													KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode')))
													resText = "Fail"
													CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
													println WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode'))
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
		
							
						
													

						
					

						
					
			
			
			
			
			
			
		