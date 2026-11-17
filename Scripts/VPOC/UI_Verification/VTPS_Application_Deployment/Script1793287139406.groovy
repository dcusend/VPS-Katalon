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


// This Test Case works only in QA2 environment

// Log into VPOC
	CustomKeywords.'vpoc.loginPage_VPOC.login_VPOC'()
	WebUI.delay(GlobalVariable.shortTimeDelay)

// Navigate to URL with Customer ID 177
	WebUI.navigateToUrl('https://qa2.velocitypayment.com/vpoc/customer/products/index.do?id=177')
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_IVR'), '/vtps', false)
	
	WebUI.click(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Create_New_Product'))

	WebUI.delay(GlobalVariable.shortTimeDelay)
	WebUI.click(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Continue'))

	WebUI.delay(GlobalVariable.shortTimeDelay)
	
	WebUI.verifyTextPresent('Customer ID:', true)
	
	WebUI.verifyTextPresent('177', true)
	
	WebUI.verifyTextPresent('Application ID:', true)
	
	WebUI.verifyTextPresent('569', true)
	
	WebUI.verifyTextPresent('Application:', true)
	
	WebUI.verifyTextPresent('melanieqa', true)
	
	WebUI.verifyTextPresent('Enabled', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Enabled_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Enabled_False'), 10)
	
	WebUI.verifyTextPresent('Payment Data Retrieval URL:', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Payment_Data_Retrieval_URL'), 10)
	
	WebUI.verifyTextPresent('Payment Data Notification URL:', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Payment_Data_Notification_URL'), 10)
	
	WebUI.verifyTextPresent('DNIS:', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_Dialed_Number'), 10)
	
	WebUI.verifyTextPresent('Cutoff Time:', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_Cutoff_Hour'), 10)
	
	WebUI.verifyOptionsPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_Cutoff_Hour'),['00','01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20','21','22','23'])
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_Cutoff_Minute'), 10)
	
	WebUI.verifyOptionsPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_Cutoff_Minute'),['00','01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30','31','32','33','34','35','36','37','38','39','40','41','42','43','44','45','46','47','48','49','50','51','52','53','54','55', '56', '57', '58', '59'])
	
	WebUI.verifyTextPresent('Enable SMS Texting: ', true)

	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Enable_SMS_Texting_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Enable_SMS_Texting_False'), 10)
	
	WebUI.verifyTextPresent('SMS Template:', true)
	
	WebUI.verifyTextPresent('Payment Transaction', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_SMS_Template_Ids'), 10)
	
	WebUI.verifyTextPresent('Enable Stored Payment Methods: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Enabled_Saved_Payment_Methods_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Enabled_Saved_Payment_Methods_False'), 10)
	
	WebUI.verifyTextPresent('Customer Profile Group', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_Profile_Group_ID'), 10)
	
	WebUI.verifyOptionsPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_Profile_Group_ID'),['None','melanieqa','Add New Group'])
	
	WebUI.verifyTextPresent('IVR Callback', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Enabled_Callback_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Enabled_Callback_False'), 10)
	
	WebUI.verifyTextPresent('IVR Call Postback URL: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_IVR_Call_Postback_URL'), 10)
	
	WebUI.verifyTextPresent('Username: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Username'), 10)
	
	WebUI.verifyTextPresent('Basic Authentication Username: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Basic_Authentication_Username'), 10)
	
	WebUI.verifyTextPresent('Basic Authentication Password: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Basic_Authentication_Password'), 10)
	
	WebUI.verifyTextPresent('Client Token URL: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Client_Token_URL'), 10)
	
	WebUI.verifyTextPresent('Client Endpoint URL: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Client_End_Point_URL'), 10)
	
	WebUI.verifyTextPresent('Client Token ID: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Client_Token_ID'), 10)
	
	WebUI.verifyTextPresent('Client Token Key: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Client_Token_Key'), 10)
	
	WebUI.verifyTextPresent('Post back type: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_Postback_Type'), 10)
	
	WebUI.verifyOptionsPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_Postback_Type'),['Velocity','Spindle Media', 'MVA IVR'])
	
	WebUI.verifyTextPresent('Number Lookup:', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_Number_Lookup'), 10)
	
	WebUI.verifyOptionsPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_Number_Lookup'),['1','2', '3'])
	
	WebUI.verifyTextPresent('Service Fee Type: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Service_Type_VELOCITY'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Service_Type_CERTPAY'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Service_Type_Empty'), 10)
	
	WebUI.verifyTextPresent('Number Payment Methods: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_Number_Payment_Methods'), 10)
	
	WebUI.verifyOptionsPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/select_Number_Payment_Methods'),['1','2', '3'])
	
	WebUI.verifyTextPresent('Payment Method 1: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Payment_Method_1_CREDIT_CARD'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Payment_Method_1_PERSONAL'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Payment_Method_1_BUSINESS'), 10)
	
	WebUI.verifyTextPresent('Visa: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Visa_Enabled_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Visa_Enabled_False'), 10)
	
	WebUI.verifyTextPresent('Mastercard: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Mastercard_Enabled_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Mastercard_Enabled_False'), 10)
	
	WebUI.verifyTextPresent('Discover: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Discover_Enabled_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Discover_Enabled_False'), 10)
	
	WebUI.verifyTextPresent('American Express: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_American_Express_Enabled_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_American_Express_Enabled_False'), 10)
	
	WebUI.verifyTextPresent('Operator Enable: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Operator_Enabled_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Operator_Enabled_False'), 10)
	
	WebUI.verifyTextPresent('OptOut Enabled: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_OptOut_Enabled_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_OptOut_Enabled_False'), 10)
	
	WebUI.verifyTextPresent('Transfer Options: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Transfer_Options_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Transfer_Options_False'), 10)
	
	WebUI.verifyTextPresent('Transfer Type: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Transfer_Type_AGENT'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Transfer_Type_END'), 10)
	
	WebUI.verifyTextPresent('Bureau Code Enabled: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Bureau_Code_Enabled_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Bureau_Code_Enabled_False'), 10)
	
	WebUI.verifyTextPresent('OverPay Enabled: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_OverPay_Enabled_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_OverPay_Enabled_False'), 10)
	
	WebUI.verifyTextPresent('UnderPay Enabled: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_UnderPay_Enabled_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_UnderPay_Enabled_False'), 10)
	
	WebUI.verifyTextPresent('Allow Late Payment: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Late_Payment_Enabled_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Late_Payment_Enabled_False'), 10)
	
	WebUI.verifyTextPresent('TextToPay: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Text_To_Pay_Enabled_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Text_To_Pay_Enabled_False'), 10)
	
	WebUI.verifyTextPresent('TokenizeUDF: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Tokenize_UDF_Enabled_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Tokenize_UDF_Enabled_False'), 10)

	WebUI.verifyTextPresent('AllowCreditBalancePayment: ', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Allow_Credit_Balance_Payment_True'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Allow_Credit_Balance_Payment_False'), 10)
	
	WebUI.verifyTextPresent('Max Amount:', true)	
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_Max_Amount'), 10)
	
	WebUI.verifyTextPresent('Validate CAN:', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_validate_CAN_true'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_validate_CAN_false'), 10)
	
	WebUI.verifyTextPresent('Validate CAN Length:', true)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_validate_CAN_Length_true'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/input_validate_CAN_Length_false'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/btn_Deploy'), 10)
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/VPOC/Product_Deployment_Page/btn_Clearform'), 10)
	
	
	
	
	
	
	
	
	
	
	
	
	