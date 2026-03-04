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
ClientAccNo= '58478CAN'
ActionType= 'PayNow'
Language='en_US'
FirstName='Ajudo'
LastName='Larenca'
AddL1='125 Main Road'
AddL2='Suite 600'
COUNTRY='840'
CITY='Manchester'
STATE='NH'
Zip='03106'
OrderNo='258741'
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

WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByPersonalCheck'))
WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))

//Personal Check payment page

String Amount_out,FirstName_out,LastName_out,Routing_out,Acc_out,ConfirmAcc_out,AL1_out,AL2_out,Zip_out,
		UDF1_out,UDF2_out,UDF3_out,UDF4_out,UDF5_out,Country_out,City_out,State_out,Email_out
def AccType_Checking_out, AccType_Saving_out

Amount_out= '3500.00'
UDF1_out= ''
UDF2_out= ''
UDF3_out= ''
UDF4_out= ''
UDF5_out= ''
FirstName_out= 'Mike'
LastName_out= 'Chingiti'
Routing_out= '256072691'
Acc_out= '11111111'
ConfirmAcc_out= '11111111'
AccType_Checking_out = 'Checking'
AccType_Saving_out=''
AL1_out= '104 main road'
AL2_out= ''
Country_out= ''
Zip_out= '22201'
City_out= ''
State_out= ''
Email_out= ''

CustomKeywords.'iwpPages.PersonalCheckPayment23NonBootstarp.setDataPCIWP'(Amount_out,FirstName_out,LastName_out,Routing_out,Acc_out,ConfirmAcc_out, AccType_Checking_out, AccType_Saving_out, AL1_out,AL2_out,Zip_out,
															UDF1_out,UDF2_out,UDF3_out,UDF4_out,UDF5_out,Country_out,City_out,State_out,Email_out)

WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/cb_TermsAndCond'))

WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/btn_Continue'))

//WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/btn_ChangePM'))

//WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/btn_Exit'))

//WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/Back'))

WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)
WebUI.verifyTextPresent(("\$3,500.00"), false)

WebUI.click(findTestObject('Object Repository/IWP30/Page_ACHPersonalPaymentEntry/Confirm'))

WebUI.delay(8)
WebUI.verifyTextPresent(("Successful Payment Receipt"), true)
WebUI.verifyTextPresent(("\$3,500.00"), false)

println("End Test: AmountInThousands1PC")


