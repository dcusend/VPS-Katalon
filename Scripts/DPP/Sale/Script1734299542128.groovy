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

		WebUI.openBrowser("https://payments2.deluxe.com/gateway/login")
		
		WebUI.maximizeWindow()

		WebUI.setText(findTestObject('Object Repository/DPP/Page_DPPLogin/input_Username'),'t465179@deluxe.com')
		
		WebUI.setText(findTestObject('Object Repository/DPP/Page_DPPLogin/input_Password'),'R@jdhani3')
		
		WebUI.click(findTestObject('Object Repository/DPP/Page_DPPLogin/input_LogIn'),)
		
		
		WebUI.click(findTestObject('Object Repository/DPP/Page_DPPDashboard/span_Take a Payment'))
		
		WebUI.click(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/div_Search Merchant'))
		
		WebUI.setText(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/div_Search Merchant'),'QA Fee Test')
		
		WebUI.setText(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/input_Total'),'1.50')
		
		WebUI.setText(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/input_FirstName'),'Imtiaz')
		
		WebUI.setText(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/input_LastName'),'Ahmed')
		
		WebUI.setText(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/input_cardnumber'),'4111111111111111')
		
		WebUI.setText(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/input_inputexpriration'),'1225')
		
		WebUI.setText(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/input_CVV'),'123')
		
		WebUI.click(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/button_Charge'))