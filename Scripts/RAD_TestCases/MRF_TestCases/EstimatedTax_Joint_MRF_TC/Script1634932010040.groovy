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

//	WebUI.openBrowser('')

//	WebUI.maximizeWindow()

//	WebUI.navigateToUrl(GlobalVariable.RADurl)
	
	String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
	String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
	String orPath_FilingStatus = "Object Repository/RAD_Pages/FilingStatus_Page"
	String orPath_TaxPayer = "Object Repository/RAD_Pages/Taxpayer_Page"
	

	def taxTypeDropList = ["Estimated Tax","Personal Income Tax","Extension Payments"]
	def listSize = taxTypeDropList.size()
	println listSize
	
	
	for (def i = 0; i < listSize; i++)
	{
		WebUI.openBrowser('')
		
		WebUI.maximizeWindow()
		
		WebUI.navigateToUrl(GlobalVariable.RADurl)
		
		System.out.println ("Value of taxTypeDropList : " + taxTypeDropList[i])
		
		WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), taxTypeDropList[i], false)
		
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),"Anderson")
		WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatSSN'), "123441234")
		WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatReSSN'), "123441234")
		
		
		
	// Joint Filing Error Message
		WebUI.scrollToElement(findTestObject(orPath_Amount + '/input__paymentAmount'), 3)
			
		WebUI.waitForElementClickable(findTestObject(orPath_FilingStatus + '/input_userType_Joint'),5)
			
		WebUI.click(findTestObject(orPath_FilingStatus + '/input_userType_Joint'))
			
		WebUI.setText(findTestObject(orPath_FilingStatus + '/input_jointLastName'),"Stokes")
		WebUI.setText(findTestObject('Object Repository/RAD_RecordAndPlay/input_JointFilerSSN'),"123443210")
		WebUI.setText(findTestObject('Object Repository/RAD_RecordAndPlay/input_reTypeJointFilerSSN'),"123443210")
		
		//WebUI.setText(findTestObject(orPath_FilingStatus + '/input_jointSSN'),"123456523")
		//WebUI.setText(findTestObject(orPath_FilingStatus + '/input_reEnterjointSSN'),"123456523")
		//WebUI.setText(findTestObject(orPath_TaxPayer + '/input_suffix'),"")
		
		//WebUI.setText(findTestObject('Object Repository/RAD_RecordAndPlay/input_JP_SSN_Re'),"123443210")
		
		WebUI.delay(2)
		
		WebUI.scrollToElement(findTestObject(orPath_Amount + '/input__paymentAmount'), 3)
		
		WebUI.setText(findTestObject(orPath_Amount + '/input__paymentAmount'),'')
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject(orPath_Landing + '/button_Continue'))
			
		WebUI.verifyTextPresent('Enter joint payer first name', true)
		
	}
	
	
	
		
	
	
	
	