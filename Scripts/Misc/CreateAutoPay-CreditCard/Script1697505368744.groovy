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



for (def row = 1; row <= 1; row++)
	{


WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa2.velocitypayment.com/agency/config.do?action=editor&message_version=2_7')

//WebUI.selectOptionByValue(findTestObject('Object Repository/Misc/AutoPay/select_MV'),'2_7', true)
//WebUI.click(findTestObject('Object Repository/Misc/AutoPay/td_Amount'))
WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input_Amount_amount'), '10.00')

def genAutoPayCAN = org.apache.commons.lang.RandomStringUtils.random(12, true, true)

WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input_Client Account Number'), genAutoPayCAN)

WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input_Action Type_action_type'), 'Autopay')

WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_Parcel testing_submit'))

WebUI.navigateToUrl('https://dev-algorithm.govolution.com/vrelaytest/QA2/version_2_2/vrelaytest.html')

WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input_application_id_application_id'), '656')

WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input_message_version_message_version'), '2.7')

def genAutoPayRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)

WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input_remittance_id_remittance_id'), genAutoPayRemID)

WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_true_formSubmit'))


WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_Pay by Credit'))

WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_Pay by Corporate Check_payNowSubmit'))

WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input__cardNumber'), '4111111111111111')

WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input__spc'), '111')



WebUI.selectOptionByValue(findTestObject('Object Repository/Misc/AutoPay/select_MM'), '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Misc/AutoPay/select_YYYY'),'2029', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Misc/AutoPay/select_UDFQuarter'),'Red', true)



//WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_endDate'))
//WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input_endDate'), '12/16/2023')

//WebUI.click(findTestObject('Object Repository/Misc/AutoPay/span_Payment Plan End Date_glyphicon glyphicon-calendar'))
//WebUI.click(findTestObject('Object Repository/Misc/AutoPay/td_16'))


//WebUI.click(findTestObject('Object Repository/Misc/AutoPay/selectCalendar1'))
//WebUI.click(findTestObject('Object Repository/Misc/AutoPay/selectCalendar2'))
//WebUI.click(findTestObject('Object Repository/Misc/AutoPay/selectCalendar3'))
//WebUI.click(findTestObject('Object Repository/Misc/AutoPay/selectCalendar4'))
//WebUI.click(findTestObject('Object Repository/Misc/AutoPay/selectCalendar5'))


WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_Please check here to store the paymen_ae9779'))


WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_true_formSubmit'))


WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_confirmNotifyAction'))

WebUI.verifyTextPresent(("Your payment plan has been successfully created"), false)

	}
//WebUI.closeBrowser()

