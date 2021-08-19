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

WebUI.callTestCase(findTestCase('VirtualTerminal/Login'), [('username') : 'iahmed', ('password') : 'hello2222'], FailureHandling.STOP_ON_FAILURE)

//WebUI.verifyTextPresent('System dashboard', false)
//WebUI.callTestCase(Login, null)
WebUI.click(findTestObject('Dashboard/AccessAhmedPayment'))

WebUI.click(findTestObject('Object Repository/Issue Transactions/a_Debit'))

WebUI.click(findTestObject('Object Repository/Page_V-POS - On-Line Check Debit/input_Personal_achtype'))

WebUI.click(findTestObject('Object Repository/Page_V-POS - On-Line Check Debit/input'))

WebUI.setText(findTestObject('Object Repository/Page_V-POS - On-Line Personal Check Debit/input__firstName'), "Imtiaz")

WebUI.setText(findTestObject('Object Repository/Page_V-POS - On-Line Personal Check Debit/input__lastName'), "Ahmed")

WebUI.setText(findTestObject('Object Repository/Page_V-POS - On-Line Personal Check Debit/input__address'), "2311 york road")

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_V-POS - On-Line Personal Check Debit/select_SelectCountry'), "United States", false)

WebUI.setText(findTestObject('Object Repository/Page_V-POS - On-Line Personal Check Debit/input__zip'), "22201")

WebUI.setText(findTestObject('Object Repository/Page_V-POS - On-Line Personal Check Debit/input__city'),"Crofton")

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_V-POS - On-Line Personal Check Debit/select_SelectState'), "Maryland", false)

WebUI.setText(findTestObject('Object Repository/Page_V-POS - On-Line Personal Check Debit/input__routingNumber'), "256072691")

WebUI.setText(findTestObject('Object Repository/Page_V-POS - On-Line Personal Check Debit/input__password_accountNumber'), "11111111")

WebUI.setText(findTestObject('Object Repository/Page_V-POS - On-Line Personal Check Debit/input__password_confirmAccountNumber'), "11111111")

WebUI.setText(findTestObject('Object Repository/Page_V-POS - On-Line Personal Check Debit/input__amount'), "10.00")

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_V-POS - On-Line Personal Check Debit/select_Select OneVanillaChocolateEnt-Dancer'),"groupItem68",false)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_V-POS - On-Line Personal Check Debit/select_Select OneCricketSoccerTennisWaiterWait'),"groupItem85",false)

//WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_V-POS - On-Line Personal Check Debit/input_udf4_submit'))

