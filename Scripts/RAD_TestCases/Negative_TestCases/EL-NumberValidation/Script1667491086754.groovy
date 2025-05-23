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

String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/RADTestData/EL-NumberValidation.xlsx"
String nameSheet = "NumberError"
String dataFile = "RADTestData/EL-NumberValidation"

def ExecuteTC, Taxtype, TaxTypeEL
def notInvNumber, errorMsg


	def numOfRows = findTestData(dataFile).getRowNumbers()
	println("Number of Records: " + numOfRows)

	
	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			Taxtype = findTestData(dataFile).getValue('TaxType', row)
			TaxTypeEL = findTestData(dataFile).getValue('TaxTypeEL', row)
			notInvNumber = findTestData(dataFile).getValue('NotiInvoNumber', row)
			errorMsg  = findTestData(dataFile).getValue('ErrorMessage', row)
			
						
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					Taxtype = findTestData(dataFile).getValue('TaxType', row)
					
					System.out.println('Taxtype value is : ' + Taxtype)
					
					
					WebUI.openBrowser('')
					
					WebUI.maximizeWindow()
					
					WebUI.navigateToUrl(GlobalVariable.RADurl)
					
					String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
					String orPath_TaxTypeFilingYear = "Object Repository/RAD_Pages/TaxTypeFilingYear_Page"
					String orPath_TaxPayer = "Object Repository/RAD_Pages/Taxpayer_Page"
					String orPath_AddressContact = "Object Repository/RAD_Pages/AddressAndContactInfo_Page"
					String orPath_FilingStatus = "Object Repository/RAD_Pages/FilingStatus_Page"
					String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
					String orPath_TaxInfo = "Object Repository/RAD_Pages/TaxInfo_Page"
					String orPath_Withholding = "Object Repository/RAD_Pages/Withholding_Page"
					String orPath_Summary = "Object Repository/RAD_Pages/Summary_Page"
					String orPath_PaymentReady = "Object Repository/RAD_Pages/PaymentReady_Page"
					String orPath_PaymentEntry = "Object Repository/RAD_Pages/PaymentEntry_Page"
					String orPath_PaymentConfirmation = "Object Repository/RAD_Pages/PaymentConfirmation_Page"
					String orPath_ServiceFeesAccept = "Object Repository/RAD_Pages/ServiceFeeAccept_Page"
					
					
					// Populate Tax Type/Filing Year
					
					WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'),Taxtype , false)
					
					WebUI.delay(1)
					
					WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_TaxType_ExistingLiability'),TaxTypeEL , false)
					
					WebUI.setText(findTestObject(orPath_TaxInfo + '/input_NoticeInvoiceNumber'),notInvNumber)
					WebUI.setText(findTestObject(orPath_TaxInfo + '/input_reTypeNoticeInvoiceNumber'),notInvNumber)
					println notInvNumber
					
					//WebUI.verifyTextPresent(errorMsg, true)
					
					if (WebUI.verifyTextPresent(errorMsg, true))
						{
							println "Error Message is present on the page"
							System.out.println('Pass Record Number: ' + row)
							resText = "Pass"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						}
					else
						{
							println "Error Message is present on the page"
							System.out.println('Fail Record Number: ' + row)
							resText = "Fail"
							CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
						}
					
						//WebUI.closeBrowser()
				}
			
			
		}