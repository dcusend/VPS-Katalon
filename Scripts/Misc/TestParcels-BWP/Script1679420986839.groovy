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

for (def n = 0; n < 10; i++)
{

def signsToUse = ["Isis~Flores~0.00~0~0~0~0.00~0~0~0~0~0.00~0~0.00~0.00~0~0.00~0.00~0.00~0~0~0.00~N~N~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~Raul~Vasquez~~2511 Baltimore Rd Unit 4~Rockville~MD~20853",
	"~~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~N~N~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~Ashanta~crosby~~5911 radecke ave~Baltimore~MD~21206",
	"~~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~N~N~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~Theophilus ~Azu ~~11215 Georgia Avenue 1534~Wheaton ~MD~20902",
	"~~0.00~0~0~0~0.00~0~0~0~0~0.00~0~0.00~0.00~0~0.00~0.00~0.00~0~0~0.00~N~N~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~Joel~Gibbs~~121 Warwickshire Ln~Glen Burnie~MD~21061",
	"~~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~N~N~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~Ashanta ~crosby~~5911 radecke ave, ~Baltimore~MD~21206",
	"~~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~N~N~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~0~Marvin~Clark~~8519 Westerman Circle~Nottingham ~MD~21236"]
def listSize = signsToUse.size()
println listSize

for (def i = 0; i < listSize; i++)
{


WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-algorithm.govolution.com/vrelaytest/QA/version_1_0/vrelaytest.html')
WebUI.maximizeWindow()



WebUI.setText(findTestObject('Object Repository/Page_BWP/input_Application ID_application_id'), '194')

WebUI.setText(findTestObject('Object Repository/Page_BWP/input_Message Version_message_version'), '1.5')

WebUI.setText(findTestObject('Object Repository/Page_BWP/input_Remittance ID_remittance_id'), 'gdfgdf453454dgdf2')

WebUI.setText(findTestObject('Object Repository/Page_BWP/input_Amount_amount'), '10.50')

WebUI.setText(findTestObject('Object Repository/Page_BWP/input_Client Account Number_clientAccountNumber'), '1234567')

WebUI.setText(findTestObject('Object Repository/Page_BWP/input_Parcels_parcels'), signsToUse[i])

WebUI.click(findTestObject('Object Repository/Page_BWP/input'))



WebUI.click(findTestObject('Object Repository/Page_BWP/input_Pay by Credit or Debit Card_paymentMe_d1d1dd'))

WebUI.click(findTestObject('Object Repository/Page_BWP/input_Pay by Corporate Check_btn btn-primar_88b6cf'))

WebUI.setText(findTestObject('Object Repository/Page_BWP/input__billingName'), 'Wang Yu')

WebUI.setText(findTestObject('Object Repository/Page_BWP/input__cardNumber'), '4111111111111111')

WebUI.setText(findTestObject('Object Repository/Page_BWP/input__spc'), '123')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BWP/select_MM010203040506070809101112'), '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BWP/select_YYYY20232024202520262027202820292030_146ff8'), 
    '2028', true)

WebUI.setText(findTestObject('Object Repository/Page_BWP/input__billingAddress'), '2311 york road')

WebUI.setText(findTestObject('Object Repository/Page_BWP/input__billingZip'), '21054')

WebUI.setText(findTestObject('Object Repository/Page_BWP/input_Receipt Email Address_emailAddress'), 'iahmed@govolution.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BWP/select_--Select One--test667test778tes767Aw_93240d'), 
    '92', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_BWP/select_--Select One--test667test778tes767Aw_93240d_1'), 
    '93', true)

WebUI.click(findTestObject('Object Repository/Page_BWP/input_Label 5_checkedAcceptCondition'))

WebUI.click(findTestObject('Object Repository/Page_BWP/input_Label 5_ccSubmit'))

WebUI.click(findTestObject('Object Repository/Page_BWP/input_Flores_confirmNotifyAction'))

Thread.sleep(5000)

WebUI.verifyTextPresent(("Successful Payment Receipt"), true)

}
}
