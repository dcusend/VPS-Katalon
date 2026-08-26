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
import com.kms.katalon.core.testobject.ConditionType


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
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditUser.xlsx"
	nameSheet = "PayerEditPassword"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/ABPTestDataDemo/ABPEditUser.xlsx", nameSheet, true)
	
		break
		
	case "QA2Profile":
			abpURL = "https://qa2.velocitypayment.com/vbills/imtiazcustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditUser.xlsx"
	nameSheet = "PayerEditPassword"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/ABPTestDataDemo/ABPEditUser.xlsx", nameSheet, true)
		
		break
			
	case "DemoProfile":
			abpURL = "https://demo.velocitypayment.com/vbills/imtiazdemocustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditUser.xlsx"
	nameSheet = "PayerEditPassword"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/ABPTestDataDemo/ABPEditUser.xlsx", nameSheet, true)
	
		break
		
	case "Production":
			abpURL = "https://qa2.velocitypayment.com/vbills/imtiazcustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditUser.xlsx"
	nameSheet = "PayerEditPassword"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/ABPTestDataDemo/ABPEditUser.xlsx", nameSheet, true)

		break
		
		
	case "Upgrade":
			abpURL = "https://qa2.velocitypayment.com/vbills/imtiazcustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditUser.xlsx"
	nameSheet = "PayerEditPassword"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/ABPTestDataDemo/ABPEditUser.xlsx", nameSheet, true)

		break
		
}
	
//Part A- Create Payer


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
				
				WebUI.openBrowser(GlobalVariable.abpURL)
				WebUI.maximizeWindow()
				
				//Login to ABP Application 
				CustomKeywords.'abpPages.LoginPage.setLoginDataMethod'(username,password)
				
				CustomKeywords.'abpPages.PendingBillPage.clickUserList'()
				
				CustomKeywords.'abpPages.UserListPage.clickAddButton'()
				
				CustomKeywords.'abpPages.UserListPage.selectRolePayer'()
				
				CustomKeywords.'abpPages.UserListPage.setDataFirstNameLastName'()
				
				String createdUserName = CustomKeywords.'abpPages.UserListPage.setDataUserName'()
				println("Created 'User Name' = " + createdUserName)
								
				CustomKeywords.'abpPages.UserListPage.setDataLoginConfirmLogin'()  //Password
								
				CustomKeywords.'abpPages.UserListPage.setDataEmailConfirmEmail'(email)
				
				WebUI.delay(2)
				CustomKeywords.'abpPages.UserListPage.clickSaveButton'()
				
				
//Part B- Change Password of Payer
															 			  					
				String selectedUsername = CustomKeywords.'abpPages.UserListPage.clickEditByUserName'(createdUserName)   //to select only newly created 'Payer'
				println("Selected 'Payer' = " + selectedUsername)
									
				//Current Password- user login password
				WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/CurrentPassword'),password)  
				println(password)
				
				//change password
				CustomKeywords.'abpPages.UserListPage.setDataPayerPasswordPayerConfirmPassword'()				
				
				WebUI.delay(2)
				CustomKeywords.'abpPages.UserListPage.clickSaveButton'()
															
				
//Part C- Delete the newly created 'Payer'.
				
				CustomKeywords.'abpPages.UserListPage.deleteUserByUserName'(createdUserName)				
													

//Part D- Verify whether deleted user still exist? + Logging results in Excel Sheet.
								
			WebUI.delay(2)		
			
			boolean isUserDeleted =	CustomKeywords.'abpPages.UserListPage.verifyUserDeleted'(createdUserName)
			println(" isUserDeleted = " + isUserDeleted)
			
	
	if (isUserDeleted) {
	
		println("User deleted successfully")
		resText = "Pass"
	
		CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row) }
			
				
	else {
	
		println("User still exists after delete")
		resText = "Fail"
	
		CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row) }
					
			}
			
	}
	