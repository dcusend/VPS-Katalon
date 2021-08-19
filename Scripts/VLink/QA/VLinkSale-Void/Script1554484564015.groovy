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

WebUI.callTestCase(findTestCase('VLink/QA/VLinkSale-ReqFieldsOnly'), [:], FailureHandling.CONTINUE_ON_FAILURE)


System.out.println("Global RemID: " + GlobalVariable.VLinkSaleRemID)
System.out.println("Global TranxID: " + GlobalVariable.VLinkSaleTranxID)

WebUI.openBrowser('https://dev-algorithm.govolution.com/vlinktest/QA/version_2_0/CC_void.html')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Transaction Type_transaction_type'),'106')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Message Version _message_version'),'2.0C')

def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Remittance Id_remittance_id'),genRemIDVoid)

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Application Id_application_id'),'234')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Username_username'),'username')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Password_password'),'password')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Response Format_response_format'),'fixed_width')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Transaction ID_transaction_id'),GlobalVariable.VLinkSaleTranxID)

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Original Transaction Type_original_transaction_type'),'104')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Track Data_track_data'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Track 1 Data_track_1_data'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Track 2 Data_track_2_data'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Tax Amount_tax_amount'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_Client Account Number_client_account_number'),'')

WebUI.setText(findTestObject('Object Repository/Page_QAVLinkCCVoid/input_user_defined2_user_defined2'),'')

WebUI.click(findTestObject('Object Repository/Page_QAVLinkCCVoid/btn_SubmitTransaction'))

WebUI.verifyTextPresent('Transaction approved, no errors', true)



