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

def executionProfile = RC.getExecutionProfile()

def deepAdminSuiteURL, deepUsername, deepPassword

def PaymentAppName, CAN, FirstName, LastORcompanyName, Look1, Look2, Look3

def numOfRows, dataFile, nameSheet, isRequiredTextPresent = false

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/EmailTextToPay/BillFileLookUp.xlsx"
nameSheet = "BFLU"


  dataFile = ExcelFactory.getExcelDataWithDefaultSheet("KatalonData/EmailTextToPay/BillFileLookUp.xlsx", nameSheet, true)
	
	
switch(executionProfile)
{
	case "QAProfile":
			 deepAdminSuiteURL = "https://qa.velocitypayment.com/admin/deep"
		
		break

	case "QA2Profile":
			deepAdminSuiteURL = "https://qa2.velocitypayment.com/admin/deep"
	
		break
}

//Retreive  Username and Password from Profile
deepUsername = GlobalVariable.Username
deepPassword = GlobalVariable.Password


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
				
				 PaymentAppName = dataFile.getValue("PaymentAppName", row)
				 CAN = dataFile.getValue("CAN", row)
				 FirstName = dataFile.getValue("FirstName", row)
				 LastORcompanyName = dataFile.getValue("LastORcompanyName", row)
				 Look1 = dataFile.getValue("Look1", row)
				 Look2 = dataFile.getValue("Look2", row)
				 Look3 = dataFile.getValue("Look3", row)						

				 
// Log into Admin Suite
CustomKeywords.'adminSuiteBootstrap.loginFunctionality.setDataAdminSuiteLogin'(deepUsername,deepPassword,deepAdminSuiteURL)

// Select Issue Email or Text to Pay Link
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/link_LeftNavEmailTextToPay'))

WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/DashBoard_Bootstrap/Link_leftNav_IssueEmail_TaxtoPay'))

//Validating all scnearios
CustomKeywords.'issueEmailTextToPay.BillFileLookupPage.setDataBillFileLookup'(PaymentAppName, CAN, FirstName, LastORcompanyName, Look1, Look2, Look3)

CustomKeywords.'issueEmailTextToPay.BillFileLookupPage.Search'()

WebUI.delay(2)

if (WebUI.verifyTextPresent('Found 1 Bill File Record(s) Matching the Search Criteria.', false)) {
		isRequiredTextPresent = true
			println(isRequiredTextPresent)
		}
		else {
			isRequiredTextPresent = false
		}									

if (isRequiredTextPresent) {
    if (WebUI.verifyTextPresent('Search Results', false)) {
        isRequiredTextPresent = true
        println(isRequiredTextPresent)
    } else {
        isRequiredTextPresent = false
    }
}
		
if (isRequiredTextPresent) {
	if (WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Radio_button'), 2)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
	
if (isRequiredTextPresent) {
	if (WebUI.verifyElementClickable(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Radio_button'))) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
	
if (isRequiredTextPresent) {
	if (WebUI.verifyTextPresent('Select', false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
	
if (isRequiredTextPresent) {
	if (WebUI.verifyTextPresent('Name', false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}

if (isRequiredTextPresent) {
	if (WebUI.verifyTextPresent('Account Number', false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}

if (isRequiredTextPresent) {
	if (WebUI.verifyTextPresent('Amount Due', false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
		
if (isRequiredTextPresent) {
	if (WebUI.verifyTextPresent('Email', false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
			
if (isRequiredTextPresent) {
	if (WebUI.verifyTextPresent('Phone', false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
	
if (isRequiredTextPresent) {
	if (WebUI.verifyTextPresent('Jesse Gonzalez', false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
	
if (isRequiredTextPresent) {
	if (WebUI.verifyTextPresent('50020006', false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}

if (isRequiredTextPresent) {
	if (WebUI.verifyTextPresent('$85.50', false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
		
if (isRequiredTextPresent) {
	if (WebUI.verifyTextPresent('Send Payment Link', false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
	
if (isRequiredTextPresent) {
	if (WebUI.verifyTextPresent('Email Address', false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
	
if (isRequiredTextPresent) {
	if (WebUI.verifyTextPresent('Phone Number', false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}

if (isRequiredTextPresent) {
	if (WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Email_address'),2)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
	
if (isRequiredTextPresent) {
	if (WebUI.verifyElementClickable(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Email_address'))) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
	
if (isRequiredTextPresent) {
	if (WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Phone_number'),2)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
	
if (isRequiredTextPresent) {
	if (WebUI.verifyElementClickable(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Phone_number'))) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}

if (isRequiredTextPresent) {
	if (WebUI.verifyTextPresent('At least one contact method (email or phone) must be provided', false)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
		
if (isRequiredTextPresent) {
	if (WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Send_payment_link'),2)) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
}
		
if (isRequiredTextPresent) {
	if (WebUI.verifyElementClickable(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/ManageEmailOrTextToPay/SearchResults/Send_payment_link'))
) {
		isRequiredTextPresent = true
		println(isRequiredTextPresent)
	} else {
		isRequiredTextPresent = false
	}
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
	
//WebUI.closeBrowser()

