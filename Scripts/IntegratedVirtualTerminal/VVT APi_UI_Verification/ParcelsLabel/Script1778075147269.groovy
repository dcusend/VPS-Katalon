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

def IVTUrl, IVTUserName, IVTPassword, IVTPartnerToken, 
	resText, datText, resColumn, datCloumn, fileLoc, nameSheet, row, isRequiredTextPresent= false

def executionProfile = RC.getExecutionProfile()

IVTUrl = GlobalVariable.IVTUrl

WebUI.openBrowser('')
WebUI.maximizeWindow()
WebUI.navigateToUrl(IVTUrl)

//IVTUserName= GlobalVariable.IVTUserName
//
//IVTPassword= GlobalVariable.IVTPassword
//
//IVTPartnerToken= GlobalVariable.IVTPartnerToken


WebUI.verifyTextPresent('Parcels Label', true)

WebUI.verifyTextPresent('Show', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Show'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Show'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Show'))

WebUI.verifyTextPresent('entries', true)
WebUI.verifyTextPresent('Ref Number', true)
WebUI.verifyTextPresent('Quantity', true)
WebUI.verifyTextPresent('Amount', true)
WebUI.verifyTextPresent('Previous', true)
WebUI.verifyTextPresent('Next', true)

WebUI.verifyTextPresent('Due Amount', true)
WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount'))
WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount'), 10)
WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount'))


//reporting in excel
if (
		WebUI.verifyTextPresent('Parcels Label', true) &&
		
		WebUI.verifyTextPresent('Show', true) &&
		WebUI.verifyElementPresent(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Show'), 10) &&
		WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Show')) &&
		
		WebUI.verifyTextPresent('entries', true) &&
		WebUI.verifyTextPresent('Ref Number', true) &&
		WebUI.verifyTextPresent('Quantity', true) &&
		WebUI.verifyTextPresent('Amount', true) &&
		WebUI.verifyTextPresent('Previous', true) &&
		WebUI.verifyTextPresent('Next', true) &&
		
		WebUI.verifyTextPresent('Due Amount', true) &&
		WebUI.verifyElementVisible(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount')) &&
		WebUI.verifyElementClickable(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount')) 
	) 

		{
		isRequiredTextPresent = true
		println(isRequiredTextPresent) 
		}

else{
	 isRequiredTextPresent = false
	}

	
	if (isRequiredTextPresent == true)
			{
				println "All the relevant texts are present on 'Parcels Label' Page"
				KeywordUtil.markPassed("All the relevant texts are present on Receipt Page")
				resText = "Pass"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
		
			}
	else
			{
				println "Some texts are missing on the 'Parcels Label' page"
				KeywordUtil.markFailed("Some texts are missing on the Receipt page")
				resText = "Fail"
				CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
			}
	
	


