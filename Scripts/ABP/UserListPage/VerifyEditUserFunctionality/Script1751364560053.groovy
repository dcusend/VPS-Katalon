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
String fileLoc = "KatalonData/ABPTestData/ABPTestData.xlsx"
String path = fileLoc
nameSheet = "CreateDeleteProfileOwner"
def shortDelay = GlobalVariable.shortDelay
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)
def username,password,email,isRequiredTextPresent = false

username = GlobalVariable.abpDCFUsername
password = GlobalVariable.abpDCFPassword

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
				email = dataFile.getValue("Email", row)
				String nickNameID = CustomKeywords.'abpPages.PaymentsMethodPage.generateNickName'()
				println(nickNameID)
				
				WebUI.openBrowser(GlobalVariable.abpURL)
				WebUI.maximizeWindow()
				
				//Login to ABP Application 
				CustomKeywords.'abpPages.LoginPage.setLoginDataMethod'(username,password)
				
				CustomKeywords.'abpPages.PendingBillPage.clickUserList'()
				
				CustomKeywords.'abpPages.UserListPage.clickAddButton'()
				
				CustomKeywords.'abpPages.UserListPage.selectRoleProfileOwner'()
				
				CustomKeywords.'abpPages.UserListPage.setDataFirstNameLastName'()
				
				CustomKeywords.'abpPages.UserListPage.setDataPasswordConfirmPassword'()
				
				CustomKeywords.'abpPages.UserListPage.setDataUserName'()
				
				CustomKeywords.'abpPages.UserListPage.setDataEmailConfirmEmail'(email)
				
				CustomKeywords.'abpPages.UserListPage.clickSaveButton'()
				
				CustomKeywords.'abpPages.UserListPage.clickEdit'()
				
				
				/*Thread.sleep(shortDelay)
				if (WebUI.verifyTextPresent("Your changes have been saved", false))
					{
											Thread.sleep(GlobalVariable.shortDelay)
											println("Deleting Saved Payment Method")
											CustomKeywords.'abpPages.PaymentsMethodPage.clickDelete'()
											WebUI.acceptAlert()
											KeywordUtil.logInfo("Pass")
											KeywordUtil.markPassed("Saved Payment Method stored under Select or Create Payment Method dropdown and all details available under Payment Method Tab")
											resText = "Pass"
											CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
								}				

			else {
				KeywordUtil.logInfo("Fail")
				KeywordUtil.markFailed("Your changes have been saved text not present")
				resText = "Fail"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
			}*/
			}
	}