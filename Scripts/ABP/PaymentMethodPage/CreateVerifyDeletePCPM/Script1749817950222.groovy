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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.transform.ThreadInterrupt
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory
import internal.GlobalVariable

//*******************Created by @Komal Mishra***************************************************

String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/ABPTestData/PaymentsACH.xlsx"
String path = fileLoc
nameSheet = "CreateVerifyDeletePCPM"
def shortDelay = GlobalVariable.shortDelay
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)
def username,password,isRequiredTextPresent = false

username = GlobalVariable.abpSCFUsername
password = GlobalVariable.abpSCFPassword

numOfRows = dataFile.getRowNumbers()
for (def row = 1; row <= numOfRows; row++)
	{
	
		ExecuteTC = dataFile.getValue("Execute", row)
		
		if (ExecuteTC.equalsIgnoreCase("Y"))
			{
				System.out.println('Begin Record Number: ' + row)
	
				Date today = new Date()
				println (today)
				String datText = today
				def udfID = dataFile.getValue("UDFID", row)
				def AddressID = dataFile.getValue("AddressID", row)
				def ACHID = dataFile.getValue("ACHID", row)
				String nickNameID = CustomKeywords.'abpPages.PaymentsMethodPage.generateNickName'()
				println(nickNameID)
				
				WebUI.openBrowser(GlobalVariable.abpURL)
				WebUI.maximizeWindow()
				
				//Login to ABP Application 
				CustomKeywords.'abpPages.LoginPage.setLoginDataMethod'(username,password)
				
				CustomKeywords.'abpPages.PendingBillPage.clickPaymentsMethod'()
				
				CustomKeywords.'abpPages.PaymentsMethodPage.clickAddButton'()
				
				CustomKeywords.'abpPages.PaymentsMethodPage.setDataNickNameID'(nickNameID)
				
				//select credit card payment method from drop down
				CustomKeywords.'abpPages.PaymentsMethodPage.selectPaymentMethodPersonalChecking'()
				
				//this method populates account data
				CustomKeywords.'abpPages.PaymentsMethodPage.setPersonalACHData'(ACHID)
				
				
				//this method populates address data
				CustomKeywords.'abpPages.PaymentsMethodPage.setDataAddress'(AddressID)
				
				CustomKeywords.'abpPages.PaymentsMethodPage.clickSave'()
				
				
				Thread.sleep(shortDelay)
				if (WebUI.verifyTextPresent("Your changes have been saved", false))
					{
						
						CustomKeywords.'abpPages.PendingBillPage.clickBillsLabel'()
						String optionValue = nickNameID 
						isPresent = WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/ABP/BillsLabelPage/select_PaymentMethod'), optionValue, false, 10)
						println(isPresent)
							if(isPresent) {
								
								CustomKeywords.'abpPages.PendingBillPage.clickPaymentsMethod'()
								def VerificationText = dataFile.getValue("VTList", row)
								def stringArray = VerificationText.split(",")
								print(stringArray)
								for(def item in stringArray)
									{
								   
								   //println(item.trim())
								   
								   if(WebUI.verifyTextPresent(item.trim(),false)) {
									   isRequiredTextPresent = true
									   
										}
										else {
											println(item + " text is missing")
											isRequiredTextPresent = false
										}
									}
										if(isRequiredTextPresent) {
											Thread.sleep(GlobalVariable.shortDelay)
											println("Deleting Saved Payment Method")
											CustomKeywords.'abpPages.PaymentsMethodPage.clickDelete'()
											WebUI.acceptAlert()
											KeywordUtil.logInfo("Pass")
											KeywordUtil.markPassed("Saved Payment Method stored under Select or Create Payment Method dropdown and all details available under Payment Method Tab")
											resText = "Pass"
											CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
											
								}
							}						
				else {
					KeywordUtil.logInfo("Fail")
					KeywordUtil.markFailed("Saved Payment Not present under Select or Create Payment Method dropdown")
					resText = "Fail"
					CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				}
			}
			else {
				KeywordUtil.logInfo("Fail")
				KeywordUtil.markFailed("Your changes have been saved text not present")
				resText = "Fail"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
			}
			}
	}