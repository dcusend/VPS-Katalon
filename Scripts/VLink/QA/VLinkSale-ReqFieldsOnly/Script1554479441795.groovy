import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://dev-algorithm.govolution.com/vlinktest/QA/version_2_0/authcap.html')

WebUI.maximizeWindow()



WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Transaction Type'),'104')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Message Version'),'2.0C')

def genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Remittance Id_remittance_id'),genRemID)

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Application Id_application_id'),'234')


WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Username_username'),'username')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Password_password'),'password')


WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Response Format_response_format'),'fixed_width')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Category_category'),'ECOM')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Transaction ID_transaction_id'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Approval Code_approval_code'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Card name_card_name'),'Imtiaz Ahmed')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Card address_card_address'),'2311 york road')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Card address2_card_address2'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Card city_card_city'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Card state_card_state'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Card zip_card_zip'),'22201')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Country ID_country_id'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Amount_amount'),'10.00')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Card number_card_number'),'4111111111111111')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Card ex month_card_exmo'),'06')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Card ex year_card_exyr'),'2020')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_CVV data_cvv_data'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_CVV state_cvv_state'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Track Data_track_data'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Track 1 Data_track_1_data'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Track 2 Data_track_2_data'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_POS Entry mode_entry_mode'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_concat(Cardholder  s email)_email'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Order Number_order_number'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Tax Amount_tax_amount'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Charge Description_charge_description'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Client Account Number_client_account_number'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_Bill Payment Indicator_bill_payment_indicator'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_user_defined1_user_defined1'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_user_defined2_user_defined2'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_user_defined3_user_defined3'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_user_defined4_user_defined4'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_user_defined5_user_defined5'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_user_defined6_user_defined6'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_user_defined7_user_defined7'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_user_defined8_user_defined8'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_user_defined9_user_defined9'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkAuthCap/input_user_defined10_user_defined10'),'')

WebUI.click(findTestObject('Object Repository/Page_QAVLinkAuthCap/input'))

WebUI.verifyTextPresent('Transaction approved, no errors', true)


def sdfo = WebUI.getText(findTestObject('Object Repository/Page_VLinkReceipt/pre_STX'))

System.out.println('sdfo: ' + sdfo)

def remID = sdfo.substring(5, 35).trim()

System.out.println('remID: ' + remID)

def traxID = sdfo.substring(35,55).trim()

System.out.println('traxID: ' + traxID)

GlobalVariable.VLinkSaleRemID = remID
GlobalVariable.VLinkSaleTranxID = traxID

