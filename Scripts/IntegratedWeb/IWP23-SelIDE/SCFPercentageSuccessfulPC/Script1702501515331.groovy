import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.com/')
String baseUrl = 'https://www.google.com/'
int pageLoadTimeoutSeconds = 30

def to = { String locator -> CustomKeywords.'customClasses.LegacyLocatorUtils.testObjectFromLegacyLocator'(locator) }

println('Begin Test: SCFPercentageSuccessfulPC')

def emulatorURL = GlobalVariable.urlEmulator
if (emulatorURL?.startsWith('http://') || emulatorURL?.startsWith('https://')) {
    WebUI.navigateToUrl(emulatorURL)
} else {
    WebUI.navigateToUrl(baseUrl + emulatorURL)
}

WebUI.delay(2)
WebUI.selectOptionByLabel(to('name=message_version'), '2.3', false)
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.setText(to('name=amount'), '10.00')
WebUI.setText(to('name=client_account_number'), 'CAN12345')
WebUI.setText(to('name=action_type'), 'PayNow')
WebUI.setText(to('name=language'), 'en_US')
WebUI.setText(to('name=billing_firstname'), 'Mandy')
WebUI.setText(to('name=billing_lastname'), 'Iguera')
WebUI.setText(to('name=billing_address'), '56 World Center Drive')
WebUI.setText(to('name=billing_address2'), 'Suite 600')
WebUI.setText(to('name=billing_country_id'), '840')
WebUI.setText(to('name=billing_city'), 'Orlando')
WebUI.setText(to('name=billing_state'), 'NH')
WebUI.setText(to('name=billing_zip'), '03106')
WebUI.setText(to('name=order_number'), 'PPPPOOOO')
WebUI.setText(to('name=user_defined1'), 'udf1')
WebUI.setText(to('name=user_defined2'), 'udf2')
WebUI.setText(to('name=user_defined3'), 'udf3')
WebUI.setText(to('name=user_defined4'), 'Orange Label')
WebUI.setText(to('name=user_defined5'), 'Soccer Label')
WebUI.click(to('name=submit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(2)

def testHarnessURL = GlobalVariable.urlTestHarness
if (testHarnessURL?.startsWith('http://') || testHarnessURL?.startsWith('https://')) {
    WebUI.navigateToUrl(testHarnessURL)
} else {
    WebUI.navigateToUrl(baseUrl + testHarnessURL)
}

WebUI.delay(2)
WebUI.setText(to('name=application_id'), '636')
WebUI.setText(to('name=message_version'), '2.3')
def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
WebUI.setText(to('name=remittance_id'), genRemIDVoid)
WebUI.click(to('css=input.formSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(2)

WebUI.click(to("xpath=(//input[@name='paymentMethod'])[2]"))
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(2)

WebUI.setText(to('name=amount'), '100.00')
WebUI.setText(to('name=billingFirstname'), 'Mike')
WebUI.setText(to('name=billingLastname'), 'Chingiti')
WebUI.setText(to('id=routingNumber'), '256072691')
WebUI.setText(to('id=accountNumber'), '11111111')
WebUI.setText(to('id=confirmAccountNumber'), '11111111')
WebUI.click(to('name=accountType'))
WebUI.setText(to('name=billingAddress'), '104 main road')
WebUI.setText(to('name=billingAddress2'), '')
WebUI.setText(to('id=billing-zip-input'), '22201')
WebUI.setText(to('name=billingAddress2'), '')
WebUI.click(to('id=checkedAcceptCondition'))
WebUI.click(to('name=achSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(2)

WebUI.verifyTextPresent('Please verify the following information:', true)
WebUI.verifyTextPresent('Is this information correct', true)

WebUI.click(to('name=confirmNotifyAction'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(2)

WebUI.verifyTextPresent('This transaction is subject to a Convenience Fees of \$10.00', false)
WebUI.verifyTextPresent('Payment Amount:', true)
WebUI.verifyTextPresent('\$100.00', false)
WebUI.verifyTextPresent('Convenience Fees:', true)
WebUI.verifyTextPresent('\$10.00', false)
WebUI.verifyTextPresent('Total Amount:', true)
WebUI.verifyTextPresent('\$110.00', false)
WebUI.verifyTextPresent('One transaction in the amount of \$110.00 will appear on your bank statement', false)

WebUI.click(to('name=convFeeNotifyAction'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(8)

WebUI.verifyTextPresent('Successful Payment Receipt', true)
WebUI.verifyTextPresent('Please print this receipt for your records', true)
WebUI.verifyTextPresent('100.00', true)
WebUI.verifyTextPresent('10.00', true)
WebUI.verifyTextPresent('Single Transaction', true)
WebUI.verifyTextPresent('110.00', true)
WebUI.verifyTextPresent('Debit', true)
WebUI.verifyTextPresent('Personal', true)
WebUI.verifyTextPresent('Checking', true)
WebUI.verifyTextPresent('1111', true)
WebUI.verifyTextPresent('2691', true)
WebUI.verifyTextPresent('MIKE CHINGITI', true)
WebUI.verifyTextPresent('104 main road', true)
WebUI.verifyTextPresent('United States', true)
WebUI.verifyTextPresent('ARLINGTON', true)
WebUI.verifyTextPresent('Virginia', true)
WebUI.verifyTextPresent('22201', true)

println('End Test: SCFPercentageSuccessfulPC')