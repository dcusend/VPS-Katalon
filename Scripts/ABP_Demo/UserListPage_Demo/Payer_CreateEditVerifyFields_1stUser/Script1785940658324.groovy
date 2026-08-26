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
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditUser.xlsx"
	nameSheet = "PayerEditFields"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/ABPTestDataDemo/ABPEditUser.xlsx", nameSheet, true)
	
		break
		
	case "QA2Profile":
			abpURL = "https://qa2.velocitypayment.com/vbills/imtiazcustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditUser.xlsx"
	nameSheet = "PayerEditFields"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/ABPTestDataDemo/ABPEditUser.xlsx", nameSheet, true)
		
		break
			
	case "DemoProfile":
			abpURL = "https://demo.velocitypayment.com/vbills/imtiazdemocustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditUser.xlsx"
	nameSheet = "PayerEditFields"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/ABPTestDataDemo/ABPEditUser.xlsx", nameSheet, true)
	
		break
		
	case "Production":
			abpURL = "https://qa2.velocitypayment.com/vbills/imtiazcustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditUser.xlsx"
	nameSheet = "PayerEditFields"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/ABPTestDataDemo/ABPEditUser.xlsx", nameSheet, true)

		break
		
		
	case "Upgrade":
			abpURL = "https://qa2.velocitypayment.com/vbills/imtiazcustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
		
	fileLoc = "KatalonData/ABPTestDataDemo/ABPEditUser.xlsx"
	nameSheet = "PayerEditFields"
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
				
				CustomKeywords.'abpPages.UserListPage_1stUser.clickAddButton'()
				
				CustomKeywords.'abpPages.UserListPage_1stUser.selectRolePayer'()
				
				CustomKeywords.'abpPages.UserListPage_1stUser.setDataFirstNameLastName'()
				
				CustomKeywords.'abpPages.UserListPage_1stUser.setDataUserName'()
				
				CustomKeywords.'abpPages.UserListPage_1stUser.setDataLoginConfirmLogin'()					
				
				CustomKeywords.'abpPages.UserListPage_1stUser.setDataEmailConfirmEmail'(email)
				
				WebUI.delay(5)
				CustomKeywords.'abpPages.UserListPage.clickSaveButton'()
				
				
//Part B- Changing field values of Payer
																			
				String selectedUsername = CustomKeywords.'abpPages.UserListPage_1stUser.clickEditNonProfileOwnerUser'()   //to select only non loggedin 'User Name' (Payer)
				println("Returned 'User Name' = " + selectedUsername)
				
				def payerData = CustomKeywords.'abpPages.UserListPage.setDataPayerFirstNamePayerLastName'()		
				println("First Name = " + payerData.firstName)
				println("Last Name = " + payerData.lastName)
									
				CustomKeywords.'abpPages.UserListPage_1stUser.setDataPayerEmailConfirmEmail'(newEmail)
				
				//Current Password- user login password
				WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/CurrentPassword'),password)  
				println(password)
				
				WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/PhoneNumber'),phone)
				println(phone)
				
				WebUI.delay(5)
				CustomKeywords.'abpPages.UserListPage_1stUser.clickSaveButton'()

				
//Part C- Verify Payer's fields name on 'User List' page
				
				WebUI.delay(5)				
				CustomKeywords.'abpPages.UserListPage_1stUser.verifyEditedPayerUser'(selectedUsername, payerData.firstName, payerData.lastName, "Payer")
				

//Part D- Logging results in Excel Sheet
								
			WebUI.delay(2)		
			if (WebUI.verifyTextPresent("Your changes have been saved", false)) {
					isRequiredTextPresent = true
						println(isRequiredTextPresent)
					}
			else {
					isRequiredTextPresent = false
					}
			
			
			
				if (isRequiredTextPresent == true)
					{
						println "Payer User Name, Name, Role matched successfully"
						KeywordUtil.markPassed("All the relevant texts are present on Receipt Page")
						resText = "Pass"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				
					}
				else
					{
						println "Payer User Name, Name, Role didn't match successfully"
						KeywordUtil.markFailed("Some texts are missing on the Receipt page")
						resText = "Fail"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
			
					}
			
			}
	}