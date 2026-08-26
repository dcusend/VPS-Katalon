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

import com.kms.katalon.core.configuration.RunConfiguration as RC



//*******************Created by @Bharat Bhushan***************************************************

String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"

def shortDelay = GlobalVariable.shortDelay
def abpURL, username, password 
def fileLoc, numOfRows, dataFile, nameSheet, email, phone, isRequiredTextPresent = false

def executionProfile = RC.getExecutionProfile()


switch(executionProfile)
{
	
	case "QAProfile":
			abpURL = "https://qa.velocitypayment.com/vbills/imtiazcustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditOwner_Demo.xlsx"
	nameSheet = "OwnerEditPassword"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/ABPTestDataDemo/ABPEditOwner_Demo.xlsx", nameSheet, true)
	
		break
		
	case "QA2Profile":
			abpURL = "https://qa2.velocitypayment.com/vbills/imtiazcustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditOwner_Demo.xlsx"
	nameSheet = "OwnerEditPassword"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/ABPTestDataDemo/ABPEditOwner_Demo.xlsx", nameSheet, true)
		
		break
			
	case "DemoProfile":
			abpURL = "https://demo.velocitypayment.com/vbills/imtiazdemocustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditOwner_Demo.xlsx"
	nameSheet = "OwnerEditFields"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/ABPTestDataDemo/ABPEditOwner_Demo.xlsx", nameSheet, true)
	
		break
		
	case "Production":
			abpURL = "https://qa2.velocitypayment.com/vbills/imtiazcustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditOwner_Demo.xlsx"
	nameSheet = "OwnerEditPassword"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/ABPTestDataDemo/ABPEditOwner_Demo.xlsx", nameSheet, true)

		break
		
		
	case "Upgrade":
			abpURL = "https://qa2.velocitypayment.com/vbills/imtiazcustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditOwner_Demo.xlsx"
	nameSheet = "OwnerEditPassword"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/ABPTestDataDemo/ABPEditOwner_Demo.xlsx", nameSheet, true)

		break
		
}
	
//Part A- Create Owner


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
				phone = dataFile.getValue("Phone", row)
				newEmail = dataFile.getValue("NewEmail", row)
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
				
				
//Part B- Change field values of Owner
															
				CustomKeywords.'abpPages.UserListPage.clickEdit'()
				
				CustomKeywords.'abpPages.UserListPage.setDataOwnerFirstNameOwnerLastName'()				
				
				CustomKeywords.'abpPages.UserListPage.setDataOwnerUserName'()
					
				CustomKeywords.'abpPages.UserListPage.setDataOwnerEmailConfirmEmail'(newEmail)
				
				//Current Password- user login password
				WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/CurrentPassword'),password)  
				println(password)
				
				WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/PhoneNumber'),phone)
				println(phone)
				
				CustomKeywords.'abpPages.UserListPage.clickSaveButton'()
				
				
//Part C- Verify Owner's fields name
				
				CustomKeywords.'abpPages.UserListPage.clickEdit'()
				
				WebUI.verifyTextPresent("Profile Owner", false)
				WebUI.verifyTextPresent(OwnerFirstName, false)
				WebUI.verifyTextPresent(OwnerLaststName, false)
				WebUI.verifyTextPresent(OwnerUserName, false)
				WebUI.verifyTextPresent(newEmail, false)
				WebUI.verifyTextPresent(Phone, false)
				
//Part D- Logging results in Excel Sheet
				
				
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