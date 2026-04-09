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
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.util.KeywordUtil
import java.text.DecimalFormat
import java.util.Random
import org.apache.commons.lang.RandomStringUtils

def executionProfile = RC.getExecutionProfile()

def deepAdminSuiteURL, deepUsername, deepPassword

def M_PaymentApp, M_CAN, M_Amount, M_FirstName, M_LastName, M_Email, M_Phone, M_CompanyName, M_AddressLine1, M_AddressLine2, 
	 	M_City, M_State, M_ZipCode, M_UDF1,M_UDF2,M_UDF3,M_UDF4,M_UDF5,M_UDF6,M_UDF7,M_UDF8,M_UDF9,M_UDF10,
		 M_PaymentId, M_FilterText

def fileLoc, numOfRows, dataFile, nameSheet, isRequiredTextPresent = false

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"

								//Part 1 Manual Entry page

switch(executionProfile)
{
	
	case "QAProfile":	
		deepAdminSuiteURL = "https://qa.velocitypayment.com/admin/deep"
		deepUsername = GlobalVariable.Username
		deepPassword = GlobalVariable.Password
	
	fileLoc = "KatalonData/EmailTextToPay/Manage_EmailText_1.xlsx"
	nameSheet = "ManageEmailText"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/EmailTextToPay/Manage_EmailText_1.xlsx", nameSheet, true)
	
		break
		
	case "QA2Profile":	
		deepAdminSuiteURL = "https://qa2.velocitypayment.com/admin/deep"
		deepUsername = GlobalVariable.Username
		deepPassword = GlobalVariable.Password
		
	fileLoc = 'KatalonData/EmailTextToPay/Manage_EmailText_1.xlsx'
	nameSheet = 'ManageEmailText'
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/EmailTextToPay/Manage_EmailText_1.xlsx', nameSheet, true)
		
		break
			
	case "DemoProfile":
			deepAdminSuiteURL = "https://demo.velocitypayment.com/admin/imtiazdemo"
			deepUsername = GlobalVariable.AutoUserAdminSuite
			deepPassword = GlobalVariable.AutoPasswordAdminSuite
		
	fileLoc = 'KatalonData/EmailTextToPay/Manage_EmailText_Demo_1.xlsx'
	nameSheet = 'ManageEmailText'
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/EmailTextToPay/Manage_EmailText_Demo_1.xlsx', nameSheet, true)
	
		break
		
	case "Production":
		deepAdminSuiteURL = "https://www.velocitypayment.com/admin/testcustomer"
		deepUsername = GlobalVariable.AutoUserAdminSuite
		deepPassword = GlobalVariable.AutoPasswordAdminSuite
		
	fileLoc = 'KatalonData/EmailTextToPay/Manage_EmailText_Prod_1.xlsx'
	nameSheet = 'ManageEmailText'
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/EmailTextToPay/Manage_EmailText_Prod_1.xlsx', nameSheet, true)

		break		
		
}
	

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
				
				
				 M_PaymentApp = dataFile.getValue("PaymentApp", row)
				 				 
				// Ignore CAN from Excel and generate random 8-digit CAN, bcoz CAN value should not be repeated
				int randomCAN = 10000000 + new Random().nextInt(90000000)
				M_CAN = randomCAN.toString()
				KeywordUtil.logInfo(M_CAN)				 
				
				// Ignore Amount from Excel and generate between 0.00 and 999.99, bcoz Amount value should not be repeated
				Random random = new Random()
				double amount = random.nextDouble() * 1000
				DecimalFormat df = new DecimalFormat("###.00")
				M_Amount = df.format(amount)
				println(M_Amount)
				
				 M_FirstName = RandomStringUtils.randomAlphabetic(10)
				 println(M_FirstName)
				 
				 M_LastName = RandomStringUtils.randomAlphabetic(10)
				 println(M_LastName)
				 
				 M_Email = dataFile.getValue("Email", row)	
				 M_Phone = dataFile.getValue("Phone", row)
				 
				 M_CompanyName = RandomStringUtils.randomAlphabetic(10)
				 println(M_CompanyName)
				 
				 M_AddressLine1 = dataFile.getValue("AddressLine1", row)
				 M_AddressLine2 = dataFile.getValue("AddressLine2", row)
				 M_City = dataFile.getValue("City", row)
				 M_ZipCode = dataFile.getValue("ZipCode", row)
				 WebUI.delay(2)
				 M_State = dataFile.getValue("State", row)
				 
				 M_UDF1 = dataFile.getValue("UDF1", row)
				 M_UDF2 = dataFile.getValue("UDF2", row)
				 M_UDF3 = dataFile.getValue("UDF3", row)
				 M_UDF4 = dataFile.getValue("UDF4", row)
				 M_UDF5 = dataFile.getValue("UDF5", row)
				 M_UDF6 = dataFile.getValue("UDF6", row)
				 M_UDF7 = dataFile.getValue("UDF7", row)
				 M_UDF8 = dataFile.getValue("UDF8", row)
				 M_UDF9 = dataFile.getValue("UDF9", row)
				 M_UDF10 = dataFile.getValue("UDF10", row)
				 

// Log into Admin Suite
CustomKeywords.'adminSuiteBootstrap.loginFunctionality.setDataAdminSuiteLogin'(deepUsername,deepPassword,deepAdminSuiteURL)

// Select Issue Email or Text to Pay Link
WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'))

WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/Link_leftNav_IssueEmail_TaxtoPay'))

//filling data into 'Manual Entry' page
CustomKeywords.'issueEmailTextToPay.ManualEntry_Page.setDataManualEntry'(M_PaymentApp, M_CAN, M_Amount, M_FirstName, M_LastName, M_Email, M_Phone, M_CompanyName, M_AddressLine1, M_AddressLine2, M_City, M_State, M_ZipCode, M_UDF1, M_UDF2, M_UDF3, M_UDF4, M_UDF5, M_UDF6, M_UDF7, M_UDF8, M_UDF9, M_UDF10)

//clicking on Send Payment Link
WebUI.delay(1)
CustomKeywords.'issueEmailTextToPay.ManualEntry_Page.SendPaymentLink'()

//verifying results
WebUI.delay(2)

String expectedMsg = 'Payment Link Sent Successfully for Manual Entry with Client Account Number ' + M_CAN
println(expectedMsg)
if (WebUI.verifyTextPresent(expectedMsg, false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
		}
		else {
			isRequiredTextPresent = false
		}
		
	
	if (isRequiredTextPresent == true)
			{
				println "All the relevant texts are present on Receipt Page"
				KeywordUtil.markPassed("All the relevant texts are present on Receipt Page")
				resText = "Pass"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
		
			}
	else
			{
				println "Some texts are missing on the Receipt page"
				KeywordUtil.markFailed("Some texts are missing on the Receipt page")
				resText = "Fail"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)		
			}	
		
    }
}


								//Part 2 Manage Email or Text to Pay

switch(executionProfile)
{
	
	case "QAProfile":
		
	fileLoc = "KatalonData/EmailTextToPay/Manage_EmailText_2.xlsx"
	nameSheet = "ManageEmailTextFilter_FirstName"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/EmailTextToPay/Manage_EmailText_2.xlsx", nameSheet, true)
	
	break
		
	case "QA2Profile":
		
	fileLoc = 'KatalonData/EmailTextToPay/Manage_EmailText_2.xlsx'
	nameSheet = 'ManageEmailTextFilter_FirstName'
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/EmailTextToPay/Manage_EmailText_2.xlsx', nameSheet, true)
		
	break
			
	case "DemoProfile":
		
	fileLoc = 'KatalonData/EmailTextToPay/Manage_EmailText_Demo_2.xlsx'
	nameSheet = 'ManageEmailTextFilter_FirstName'
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/EmailTextToPay/Manage_EmailText_Demo_2.xlsx', nameSheet, true)
	
	break
		
	case "Production":
		
	fileLoc = 'KatalonData/EmailTextToPay/Manage_EmailText_Prod_2.xlsx'
	nameSheet = 'ManageEmailTextFilter_FirstName'
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/EmailTextToPay/Manage_EmailText_Prod_2.xlsx', nameSheet, true)

	break
		
}
	

numOfRows = dataFile.getRowNumbers()
println("Number of Records: " + numOfRows)


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
												
				 M_PaymentId = dataFile.getValue("PaymentId", row)				
				 
//Menu
WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'))

//Select Manage Email or Text to Pay Link
WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_ManageEmailOrTextToPay'))

//Search Results
CustomKeywords.'issueEmailTextToPay.Manage_EmailText_ToPay.SearchResults'(M_PaymentId)

//Filter (First Name)
CustomKeywords.'issueEmailTextToPay.Manage_EmailText_ToPay.FilterResults'(M_FirstName)  //T_Filtertext is M_FirstName here
			
//verifying Filter results
WebUI.verifyTextPresent('Filter applied successfully. Found 1 record(s).', false)

//verifying 'Status' as Active & 'Action' as Resend and Expire (enabled).
WebUI.verifyElementText(
	findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/Status_Active'),'Active')

WebUI.verifyTextPresent('Resend', false)
WebUI.verifyElementClickable(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/Resend'))

WebUI.verifyTextPresent('Expire', false)
WebUI.verifyElementClickable(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/Expire'))


//reporting in excel
if (
    WebUI.verifyTextPresent('Filter applied successfully. Found 1 record(s).', false) &&
    WebUI.verifyElementText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/Status_Active'),'Active') &&
    WebUI.verifyTextPresent('Resend', false) &&
    WebUI.verifyTextPresent('Expire', false)) {
	
    isRequiredTextPresent = true
    println(isRequiredTextPresent) }

else {
    isRequiredTextPresent = false
	}

	
	if (isRequiredTextPresent == true)
			{
				println "All the relevant texts are present on Receipt Page"
				KeywordUtil.markPassed("All the relevant texts are present on Receipt Page")
				resText = "Pass"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
		
			}
	else
			{
				println "Some texts are missing on the Receipt page"
				KeywordUtil.markFailed("Some texts are missing on the Receipt page")
				resText = "Fail"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
			}
	
	}
}

