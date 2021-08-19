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

WebUI.click(findTestObject('Issue Transactions/SaleLink'))

WebUI.setText(findTestObject('Sale Payment Entry/ClientAccountNumber'), '123456wwe')

WebUI.setText(findTestObject('Sale Payment Entry/CardName'), 'imtiaz ahmed')

WebUI.setText(findTestObject('Sale Payment Entry/AL1'), '2311 york road')

WebUI.setText(findTestObject('Sale Payment Entry/ZIP'), '22201')

WebUI.setText(findTestObject('Sale Payment Entry/CardNumber'), '4111111111111111')

WebUI.selectOptionByValue(findTestObject('Sale Payment Entry/MM'), '3', true)

WebUI.selectOptionByValue(findTestObject('Sale Payment Entry/YYYY'), '2024', true)

WebUI.selectOptionByValue(findTestObject('Sale Payment Entry/TransactionCategory'), 'MOTO', true)

WebUI.setText(findTestObject('Sale Payment Entry/Amount'), '10.00')

WebUI.selectOptionByValue(findTestObject('Sale Payment Entry/UDF1'), 'groupItem66', true)

WebUI.selectOptionByValue(findTestObject('Sale Payment Entry/UDF2'), 'groupItem84', true)

WebUI.click(findTestObject('Sale Payment Entry/Submit'))

WebUI.verifyTextPresent('Transaction Successful', true)

WebUI.verifyTextPresent('The transaction has been successfully processed', true)

//WebUI.rightClick(findTestObject('Receipt/div_Transaction Successful'))
def sdf = WebUI.getText(findTestObject('Receipt/div_Transaction Successful'))

System.out.println('sdf: ' + sdf)

def remID = sdf.substring(203, 227).trim()

System.out.println('remID: ' + remID)

WebUI.click(findTestObject('Page_V-POS - Transaction Successfully Processed/a_Issue Transactions'))

WebUI.click(findTestObject('Page_V-POS - Transactions Menu/a_Search Transactions'))

WebUI.setText(findTestObject('Page_V-POS - Search Transactions/input_Search Value'), remID)

WebUI.selectOptionByValue(findTestObject('Page_V-POS - Search Transactions/select_CCTranx'), '104', true)

WebUI.click(findTestObject('Page_V-POS - Search Transactions/input_AdvSearch_sbutton'))

//WebUI.navigateToUrl('https://qa.velocitypayment.com/admin/imtiaz/vpos/180/reports/TransactionSearchResults/')

//WebUI.rightClick(findTestObject('Object Repository/Page_Transaction Search Results/div_PaymentID'))

def fgr = WebUI.getText(findTestObject('Object Repository/Page_Transaction Search Results/div_PaymentID'))
def payID = fgr.substring(213,221).trim()
System.out.println('payID: '+payID)

def remIDLink = WebUI.modifyObjectProperty(findTestObject('Object Repository/Page_Transaction Search Results/a_11997044'),'text','equals',payID,true)
WebUI.click(remIDLink)



WebUI.click(findTestObject('Object Repository/Page_V-POS - Transaction Detail/a_Void this transaction'))

WebUI.click(findTestObject('Object Repository/Page_Void Confirmation/input_Date_submit'))


WebUI.verifyTextPresent('Void', true)
WebUI.verifyTextPresent('Transaction Successful', true)

WebUI.verifyTextPresent('The transaction has been successfully processed', true)
