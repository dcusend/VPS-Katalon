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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

/* This test case will perform the following steps:
 *		Open Demo Encrypted track data vlink Sale page 		
 * 		Retrieve test data from the Excel spreadsheet
 * 		Populate and submit the Encrypted track data vlink Sale page 
 *		If the transaction is successful then Void it, otherwise do nothing
 *		This is to verify that HSM is still working in Demo
 *		Use the test data for Live Processors like FDMS and FAPS Payment Switch
 */


def numOfRows = findTestData('Demo/VLinkTestData/DemoVlinkEncryptedTrackTestData').getRowNumbers()

	println(numOfRows)

	def dataFile = "Demo/VLinkTestData/DemoVlinkEncryptedTrackTestData"


// For each row in the spreadsheet, execute the given steps
for (def row = 1; row <= numOfRows; row++) {
	
	
	//=======================================
	
//Step1	Open Browser with Emulator URL
	WebUI.openBrowser('https://dev-algorithm.govolution.com/vlinktest/demo/version_2_0/vlinkEncryptedSwipe.html')
	
	WebUI.maximizeWindow()
//========================================
	
	
//Step2 Get data from spreadsheet and populate data
	
	CustomKeywords.'vlinkPages.encryptedTrackPage.setDataETD'(row,dataFile)

//=======================================
	
	
//Step 3 Verify if Transaction is successful by verifying the static text of 
// Transaction Approved, No Errors.  If transaction was successful then Void it
	
	if (WebUI.verifyTextPresent(("Transaction approved, no errors"), false))
	{
		def sdfo = WebUI.getText(findTestObject('Object Repository/Page_VLinkReceipt/pre_STX'))
		
		System.out.println('sdfo: ' + sdfo)
		
		def remID = sdfo.substring(5, 35).trim()
		
		System.out.println('remID: ' + remID)
		
		def traxID = sdfo.substring(35,55).trim()
		
		System.out.println('traxID: ' + traxID)
		
		GlobalVariable.VLinkSaleRemID = remID
		GlobalVariable.VLinkSaleTranxID = traxID
		
		println("Remittance ID: " + GlobalVariable.VLinkSaleRemID)
		println("Transaction ID: " + GlobalVariable.VLinkSaleTranxID)
		
// Void the transaction
		
		WebUI.closeBrowser()
		
		WebUI.openBrowser('https://dev-algorithm.govolution.com/vlinktest/demo/version_2_0/CC_void.html')
		
		WebUI.maximizeWindow()
		
		
		CustomKeywords.'vlinkPages.voidCCPage.setDataVCC'(row,dataFile)
		
			if (WebUI.verifyTextPresent(("Transaction approved, no errors"), false))
			{
				println("Void transaction was successful")
			}
			else {println("Void transaction failed")}
		
		
	}
	else {println("Sale Transaction Failed, nothing to Void")}
	
	WebUI.closeBrowser()
	
}