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

CustomKeywords.'iwpPages.TestHarnessPage.setDataHarnessParameters'('653', '2.3')


//---Landing Page

WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCreditCard'))
WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))

//Credit Card payment page

String Amount_Out= '3500.00'
String UDF1_Out=''
String UDF2_Out=''
String UDF3_Out=''
String UDF4_Out=''
String UDF5_Out=''
String Name_Out=''
String CardNo_Out= '4111111111111111'
String ExpM_Out= '04'
String ExpY_Out= '2028'
String AL1_Out=''
String AL2_Out=''
String Country_Out=''
String Zip_Out=''
String City_Out=''
String State_Out=''
String Email_Out= 'iahmed@govolution.com'


CustomKeywords.'iwpPages.CreditCardPayment23NonBootstrap.setDataCCIWP'(Amount_Out, CardNo_Out, ExpM_Out, ExpY_Out, Email_Out,
	UDF1_Out, UDF2_Out, UDF3_Out, UDF4_Out, UDF5_Out, Name_Out, AL1_Out, AL2_Out, Zip_Out, Country_Out, City_Out, State_Out)

WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'))

//WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ChangePaymentMethodButton'))

//WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ExitButton'))

////WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Modify'))

WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'))

WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)
WebUI.verifyTextPresent(("\$3,500.00"), false)

WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Confirm'))

WebUI.delay(8)
WebUI.verifyTextPresent(("Successful Payment Receipt"), true)
WebUI.verifyTextPresent(("\$3,500.00"), false)



