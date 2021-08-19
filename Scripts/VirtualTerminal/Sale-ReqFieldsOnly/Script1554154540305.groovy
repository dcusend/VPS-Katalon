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





WebUI.verifyTextPresent('Transaction Successful',true)


WebUI.verifyTextPresent('Authorization and Capture',true)


WebUI.verifyTextPresent('Visa',true)


WebUI.verifyTextPresent('IMTIAZ AHMED',true)


WebUI.verifyTextPresent('************1111',false)


WebUI.verifyTextPresent('The transaction has been successfully processed',true)


WebUI.verifyTextPresent('2311 york road',true)

WebUI.verifyTextPresent('United States',true)

WebUI.verifyTextPresent('ARLINGTON',true)

WebUI.verifyTextPresent('Virginia',true)

WebUI.verifyTextPresent('22201',true)

println "VT-Sale-ReqFieldsOnly executed successfully"

//WebUI.closeBrowser()

