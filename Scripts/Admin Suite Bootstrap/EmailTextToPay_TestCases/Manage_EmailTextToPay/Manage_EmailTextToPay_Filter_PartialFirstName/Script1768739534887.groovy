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
import java.text.SimpleDateFormat
import java.util.Calendar

import com.kms.katalon.core.configuration.RunConfiguration as RC
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.util.KeywordUtil
import java.text.DecimalFormat
import java.util.Random
import org.apache.commons.lang.RandomStringUtils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Calendar

def executionProfile = RC.getExecutionProfile()

def deepAdminSuiteURL, deepUsername, deepPassword

def M_PaymentApp, M_CAN, M_Amount, M_FirstName, M_LastName, M_Email, M_Phone, M_CompanyName, M_AddressLine1, M_AddressLine2, 
	 	M_City, M_State, M_ZipCode, M_UDF1,M_UDF2,M_UDF3,M_UDF4,M_UDF5,M_UDF6,M_UDF7,M_UDF8,M_UDF9,M_UDF10,M_DueDate,
		 M_PaymentId, M_FilterText, partialFirstName, partialLastName, partialCompName

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
	
	fileLoc = "KatalonData/EmailTextToPay/Manage_EmailText.xlsx"
	nameSheet = "ManageEmailTxtFilter_Par1stName"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/EmailTextToPay/Manage_EmailText.xlsx", nameSheet, true)
	
		break
		
	case "QA2Profile":	
		deepAdminSuiteURL = "https://qa2.velocitypayment.com/admin/deep"
		deepUsername = GlobalVariable.Username
		deepPassword = GlobalVariable.Password
		
	fileLoc = "KatalonData/EmailTextToPay/Manage_EmailText.xlsx"
	nameSheet = "ManageEmailTxtFilter_Par1stName"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/EmailTextToPay/Manage_EmailText.xlsx", nameSheet, true)
		
		break
			
	case "DemoProfile":
			deepAdminSuiteURL = "https://demo.velocitypayment.com/admin/imtiazdemo"
			deepUsername = GlobalVariable.AutoUserAdminSuite
			deepPassword = GlobalVariable.AutoPasswordAdminSuite
		
	fileLoc = "KatalonData/EmailTextToPay/Manage_EmailText_Demo.xlsx"
	nameSheet = "ManageEmailTxtFilter_Par1stName"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/EmailTextToPay/Manage_EmailText_Demo.xlsx", nameSheet, true)
	
		break
		
	case "Production":
		deepAdminSuiteURL = "https://www.velocitypayment.com/admin/testcustomer"
		deepUsername = GlobalVariable.AutoUserAdminSuite
		deepPassword = GlobalVariable.AutoPasswordAdminSuite
		
	fileLoc = "KatalonData/EmailTextToPay/Manage_EmailText_Prod.xlsx"
	nameSheet = "ManageEmailTxtFilter_Par1stName"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/EmailTextToPay/Manage_EmailText_Prod.xlsx", nameSheet, true)

		break	
		
	case "Upgrade":
		deepAdminSuiteURL = "https://www.velocitypayment.com/admin/testcustomer"
		deepUsername = GlobalVariable.AutoUserAdminSuite
		deepPassword = GlobalVariable.AutoPasswordAdminSuite
		
	fileLoc = "KatalonData/EmailTextToPay/Manage_EmailText_Upgrade.xlsx"
	nameSheet = "ManageEmailTxtFilter_Par1stName"
	dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/EmailTextToPay/Manage_EmailText_Upgrade.xlsx", nameSheet, true)

		break
			
		
}
					 

// Log into Admin Suite
CustomKeywords.'adminSuiteBootstrap.loginFunctionality.setDataAdminSuiteLogin'(deepUsername,deepPassword,deepAdminSuiteURL)

// Select Issue Email or Text to Pay Link
WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'))

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/Link_leftNav_IssueEmail_TaxtoPay'))


//inserting values

	switch(executionProfile)
		{
			case "QAProfile":
				
					M_PaymentApp = "DeepWebPay485"
					deepUsername = "iahmed"
						
					break
											
			case "QA2Profile":
				
					M_PaymentApp = "DeepWebPay485"	
					deepUsername = "iahmed"
						
					break
										
			case "DemoProfile":
				
					M_PaymentApp = "Change Me"
					deepUsername = "iahmed1"
						
					break
								
			case "Production":
				
					M_PaymentApp = "BBP Parking Fees GovTest"
					deepUsername = "AutoUserProd"
						
					break
					
			case "Upgrade":
					
					M_PaymentApp = 'BBP Parking Fees GovTest'
					deepUsername = 'AutoUserProd'
					
					break
												 
		 }

						 
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
	// Get first 5 characters
	partialFirstName = M_FirstName.substring(0, 5)
	println(partialFirstName)
					 
	M_LastName = RandomStringUtils.randomAlphabetic(10)
	
	M_Email = "abc@deluxe.com"
	
	M_Phone = "1234567890"
	
	M_CompanyName = RandomStringUtils.randomAlphabetic(10)
			
	// Get current date
	Calendar cal = Calendar.getInstance()
	cal.add(Calendar.DAY_OF_MONTH, 1)  // future date (recommended)
	M_DueDate = new SimpleDateFormat("MM/dd/yyyy").format(cal.getTime())
	println(M_DueDate)
									
	M_AddressLine1 = "Pune, 123"
	
	M_AddressLine2 = "Kothrud"
	
	M_City = "Goa"
	
	M_ZipCode = "123456"
	WebUI.delay(2)
	M_State = "South Carolina"
	
	M_UDF1 = "PQ1"
	M_UDF2 = "PQ2"
	M_UDF3 = "PQ3"
	M_UDF4 = ""
	M_UDF5 = ""
	M_UDF6 = ""
	M_UDF7 = ""
	M_UDF8 = ""
	M_UDF9 = ""
	M_UDF10 = ""


//filling data into 'Manual Entry' page
CustomKeywords.'issueEmailTextToPay.ManualEntry_Page.setDataManualEntry'(M_PaymentApp, M_CAN, M_Amount, M_FirstName, M_LastName, M_Email, M_Phone, M_CompanyName,M_DueDate, M_AddressLine1, M_AddressLine2, M_City, M_State, M_ZipCode, M_UDF1, M_UDF2, M_UDF3, M_UDF4, M_UDF5, M_UDF6, M_UDF7, M_UDF8, M_UDF9, M_UDF10)

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
										                  	
		numOfRows = dataFile.getRowNumbers()               //Part 2 Manage Email or Text to Pay
		println("Number of Records: " + numOfRows)
		
		
		for (def searchRow = 1; searchRow <= numOfRows; searchRow++)
			{
			
				ExecuteTC = dataFile.getValue('Run', searchRow)            //changed to Run from Execute
				System.out.println('Value of Execute is : ' + ExecuteTC)
				
				
				if (ExecuteTC.equalsIgnoreCase("Y"))
					{
						System.out.println('Begin Record Number: ' + searchRow)
			
						Date today = new Date()
						println (today)
						String datText = today
														
						M_PaymentId = dataFile.getValue("PaymentId", searchRow)
						 
		//Menu
		WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'))
		
		//Select Manage Email/Text to Pay Link
		WebUI.delay(1)
		switch(executionProfile)
		{
			case "QAProfile":
				
					WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_ManageEmailOrTextToPay'))
						
					break
											
			case "QA2Profile":
				
					WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_ManageEmailOrTextToPay'))
						
					break
										
			case "DemoProfile":
				
					WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_ManageEmailOrTextToPay'))
						
					break
								
			case "Production":
				
					WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_ManageEmailOrTextToPay_Prod'))
						
					break
					
			case "Upgrade":
					
					WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_ManageEmailOrTextToPay_Prod'))
					
					break
					
		 }
		 
				
		//Search Results
		CustomKeywords.'issueEmailTextToPay.Manage_EmailText_ToPay.SearchResults'(M_PaymentId)
		
		//Filter (partialFirstName)
		CustomKeywords.'issueEmailTextToPay.Manage_EmailText_ToPay.FilterResults'(partialFirstName)  //T_Filtertext is partialFirstName here
				
			
		//verifying dates
		CustomKeywords.'issueEmailTextToPay.Manage_EmailText_ToPay.DatesVerification'()
		
		
		//verifying Search Results and message (reporting in excel)
		
		if (
			WebUI.verifyTextPresent('Filter applied successfully. Found 1 record(s).', false) &&
			
			WebUI.verifyTextPresent(partialFirstName, false) &&
			WebUI.verifyTextPresent(M_LastName, false) 	&&
			WebUI.verifyTextPresent(M_CompanyName, false) &&
			
			WebUI.verifyElementText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/AccountNumber'), M_CAN) &&
			
			WebUI.verifyElementText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/User'), deepUsername) &&
			
			WebUI.verifyElementText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/BillAmount'), "\$${M_Amount}") &&
		
			WebUI.verifyElementText(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/Status_Active'), 'Active') &&
			WebUI.verifyTextPresent('Resend', false) &&
			WebUI.verifyElementClickable(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/Resend')) &&
			WebUI.verifyTextPresent('Expire', false) &&
			WebUI.verifyElementClickable(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/Expire'))) {
			
			isRequiredTextPresent = true
			println(isRequiredTextPresent)
			println("First Name: ${partialFirstName}, Last Name: ${M_LastName}, Company Name: ${M_CompanyName}, Account Number: ${M_CAN}, User: ${deepUsername}, Bill Amount: ${"\$${M_Amount}"}")  }
		
		else {
			isRequiredTextPresent = false
			}
		
			
			
			 if (isRequiredTextPresent == true)
					{
						println "All the relevant texts are present on Receipt Page"
						KeywordUtil.markPassed("All the relevant texts are present on Receipt Page")
						resText = "Pass"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,searchRow)
				
					}
			 else
					{
						println "Some texts are missing on the Receipt page"
						KeywordUtil.markFailed("Some texts are missing on the Receipt page")
						resText = "Fail"
						CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,searchRow)
					}
			
			}
		}
		
									
		
	}
	
else {
	 isRequiredTextPresent = false
	 }
	 	
			

								

