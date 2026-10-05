package ivtPages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import java.util.concurrent.ThreadLocalRandom

public class IVTlogin {
		
	
	String url_In, Environment_In, AuthUser_In, AuthPass_In, Token_In, JSONBody_In
	
	
@Keyword
def SetDataIVTlogin (url_In, Environment_In, AuthUser_In, AuthPass_In, Token_In, JSONBody_In) {
	
			
	// Part 1: Generate 10-character alphanumeric 'remittanceId'
	
	String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

	String remittanceId = (1..10).collect {chars.charAt(ThreadLocalRandom.current().nextInt(chars.length()))}.join()
			
	println("Generated RemittanceId : " + remittanceId)
	
	GlobalVariable.IVTRemittanceId = remittanceId
	
		
	JSONBody_In = JSONBody_In.replaceAll(/"remittanceId"\s*:\s*"[^"]*"/,"\"remittanceId\":\"${remittanceId}\"") // Replace remittanceId in JSON

	println("Updated JSON:")
	println(JSONBody_In)
	
		
	//Part 2: Enter values
	
		WebUI.openBrowser(url_In)
		WebUI.maximizeWindow()
			
		if (WebUI.verifyTextPresent('VVTAPI Form POST Tester', true)) {

			WebUI.selectOptionByLabel(findTestObject('Object Repository/IntegratedVT/IVTLoginPage/Environment'), Environment_In, false)
			WebUI.setText(findTestObject('Object Repository/IntegratedVT/IVTLoginPage/Basic_Auth_User'), AuthUser_In)
			WebUI.setText(findTestObject('Object Repository/IntegratedVT/IVTLoginPage/Basic_Auth_Pass'), AuthPass_In)
			WebUI.setText(findTestObject('Object Repository/IntegratedVT/IVTLoginPage/Partner_Token'), Token_In)
			WebUI.setText(findTestObject('Object Repository/IntegratedVT/IVTLoginPage/JSON_Body'), JSONBody_In)
			
			WebUI.delay(2)						
			WebUI.click(findTestObject('Object Repository/IntegratedVT/IVTLoginPage/Submit_button'))
			
		}				
		
   }
 

}
