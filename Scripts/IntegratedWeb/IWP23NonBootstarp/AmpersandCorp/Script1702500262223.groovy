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

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

//Emulator

String 	MsgVer, AMOUNT, ClientAccNo, ActionType, Language, FirstName, LastName, AddL1, AddL2,
		COUNTRY, CITY, STATE, Zip, OrderNo, CompanyName, EmailAdd, UDF1st, UDF2nd, UDF3rd, UDF4th, UDF5th


def urlEmulator

urlEmulator = GlobalVariable.urlEmulator

WebUI.openBrowser(urlEmulator)
WebUI.maximizeWindow()

MsgVer= '2.3'
AMOUNT= '10.00'
ClientAccNo= 'CAN12345'
ActionType= 'PayNow'
Language='en_US'
FirstName='Mandy'
LastName='Iguera'
AddL1='56 World Center Drive'
AddL2='Suite 600'
COUNTRY='840'
CITY='Orlando'
STATE='NH'
Zip='03106'
OrderNo='PPPPOOOO'
CompanyName=''
EmailAdd=''
UDF1st='udf1'
UDF2nd='udf2'
UDF3rd='udf3'
UDF4th='Orange Label'
UDF5th='Soccer Label'


CustomKeywords.'iwpPages.EmulatorIWP23NonBootstarp.setDataIWP23'(MsgVer, AMOUNT, ClientAccNo, ActionType, Language, FirstName, LastName, AddL1, AddL2,
		COUNTRY, CITY, STATE, Zip, OrderNo, CompanyName, EmailAdd, UDF1st, UDF2nd, UDF3rd, UDF4th, UDF5th)

CustomKeywords.'iwpPages.EmulatorIWP23NonBootstarp.Submit'()
WebUI.delay(1)

//TestHarness
//remittance_id will be unique

def testHarnessURL = GlobalVariable.urlTestHarness

WebUI.openBrowser(testHarnessURL)
WebUI.maximizeWindow()

CustomKeywords.'iwpPages.TestHarnessPage.setDataHarnessParameters'('635', '2.3')

//---Landing Page

WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCorporateCheck'))
WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))

//Corporate Check payment page

String Amount_out, UDF2_out,UDF3_out,UDF4_out,UDF5_out,CompName_out,Routing_out,Acc_out,ConfirmAcc_out,EIN_out,AL1_out,AL2_out,Zip_out,Email_out,
		Country_out,City_out,State_out
		
Amount_out='10.50'
UDF2_out= 'udf2'
UDF3_out= 'udf3'
UDF4_out= 'Purple'
UDF5_out= 'Tennis'
CompName_out='CompName & Son MaintenanceA'
Routing_out= '256072691'
Acc_out= '33333333'
ConfirmAcc_out= '33333333'
EIN_out='123456789'
AL1_out= 'AddLine1 & Son Mai Johnson & Son Mai Johnson & S'
AL2_out= 'AddLine2 & Son Mai Johnson & Son Mai Johnson & S'
Country_out= ''
Zip_out= '22201'
City_out= ''
State_out= ''
Email_out= 'iahmed@govolution.com'


CustomKeywords.'iwpPages.CorporateCheckPayment23NonBootstarp.setDataCorpCheckIWP'(Amount_out, UDF2_out,UDF3_out,UDF4_out,UDF5_out,CompName_out,Routing_out,Acc_out,ConfirmAcc_out,EIN_out,AL1_out,AL2_out,Zip_out,Email_out,
																			Country_out,City_out,State_out)

WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/cb_TermsAndCond'))

WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/btn_Continue'))

//WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/btn_ChangePM'))

//WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/btn_Exit'))

//WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/Back'))

//WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/Modify'))

WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)
WebUI.verifyTextPresent(("\$10.50"), false)
WebUI.verifyTextPresent(("CompName & Son MaintenanceA"), true)
WebUI.verifyTextPresent(("AddLine1 & Son Mai Johnson & Son Mai Johnson & S"), true)
WebUI.verifyTextPresent(("AddLine2 & Son Mai Johnson & Son Mai Johnson & S"), true)

WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHCorporatePaymentEntry/Confirm'))

WebUI.delay(8)
WebUI.verifyTextPresent(("Successful Payment Receipt"), true)
WebUI.verifyTextPresent(("Please print this receipt for your records"), true)
WebUI.verifyTextPresent(("\$10.50"), false)
WebUI.verifyTextPresent(("Debit"), true)
WebUI.verifyTextPresent(("Corporate"), true)
WebUI.verifyTextPresent(("Checking"), true)
WebUI.verifyTextPresent(("CompName & Son MaintenanceA"), true)
WebUI.verifyTextPresent(("AddLine1 & Son Mai Johnson & Son Mai Johnson & S"), true)
WebUI.verifyTextPresent(("AddLine2 & Son Mai Johnson & Son Mai Johnson & S"), true)

println("End Test: AmpersandCorp")


