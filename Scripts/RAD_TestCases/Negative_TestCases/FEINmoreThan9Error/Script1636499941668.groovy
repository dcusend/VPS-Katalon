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

String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
String orPath_FilingStatus = "Object Repository/RAD_Pages/FilingStatus_Page"
String orPath_TaxPayer = "Object Repository/RAD_Pages/Taxpayer_Page"
String orPath_TaxInfo = "Object Repository/RAD_Pages/TaxInfo_Page"
String orPath_TaxTypeFilingYear = "Object Repository/RAD_Pages/TaxTypeFilingYear_Page"


def taxTypeDropList = ["Estimated Tax","Extension Payments","Existing Liability","Sales and Use","Withholding Tax"]
def listSize = taxTypeDropList.size()
println listSize




for (def i = 0; i < listSize; i++)
	{
		WebUI.openBrowser('')
		
		WebUI.maximizeWindow()
		
		WebUI.navigateToUrl(GlobalVariable.RADurl)
		
		System.out.println ("Value of taxTypeDropList : " + taxTypeDropList[i])
		
		WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), taxTypeDropList[i], false)
		
		
		switch (taxTypeDropList[i])
		{
			case "Estimated Tax":
				WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PaymentType'),"Corporate",false)
				WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN'), 'RigbBhfdqOBDK95asqKeHw==')
				WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN_ReEnter'), '')
				WebUI.verifyTextPresent('Please enter a valid FEIN with 9 digits.', true)
				WebUI.closeBrowser()
			break
			
			
			
			case "Extension Payments":
				WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PaymentType'),"Corporate",false)
				WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN'), 'RigbBhfdqOBDK95asqKeHw==')
				WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN_ReEnter'), '')
				WebUI.verifyTextPresent('Please enter a valid FEIN with 9 digits.', true)
				WebUI.closeBrowser()
			break
			
			
			
			case "Existing Liability":
				WebUI.setText(findTestObject(orPath_TaxInfo + '/input_FEIN'), '1234567890')
				WebUI.setText(findTestObject(orPath_TaxInfo + '/input_ReTypeFEIN'), '')
				WebUI.verifyTextPresent('Please enter a valid FEIN with 9 digits.', true)
				WebUI.closeBrowser()
			break
			
			
			
			case "Sales and Use":
				WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN'), 'RigbBhfdqOBDK95asqKeHw==')
				WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN_ReEnter'), '')
				WebUI.verifyTextPresent('Please enter a valid FEIN with 9 digits.', true)
				WebUI.closeBrowser()
			break
			
			
			
			
			case "Withholding Tax":
				WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN'), 'RigbBhfdqOBDK95asqKeHw==')
				WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN_ReEnter'), '')
				WebUI.verifyTextPresent('Please enter a valid FEIN with 9 digits.', true)
				WebUI.closeBrowser()
			break
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}