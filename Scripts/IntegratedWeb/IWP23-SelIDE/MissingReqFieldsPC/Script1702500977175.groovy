import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.com/')
String baseUrl = 'https://www.google.com/'
int pageLoadTimeoutSeconds = 30

def to = { String locator -> CustomKeywords.'customClasses.LegacyLocatorUtils.testObjectFromLegacyLocator'(locator) }

println('Begin Test: MissingReqFieldsPC')

def emulatorURL = GlobalVariable.urlEmulator
if (emulatorURL?.startsWith('http://') || emulatorURL?.startsWith('https://')) {
    WebUI.navigateToUrl(emulatorURL)
} else {
    WebUI.navigateToUrl(baseUrl + emulatorURL)
}

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

WebUI.setText(to('name=application_id'), '635')
WebUI.setText(to('name=message_version'), '2.3')
def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
WebUI.setText(to('name=remittance_id'), genRemIDVoid)

WebUI.click(to('css=input.formSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.click(to("xpath=(//input[@name='paymentMethod'])[2]"))
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.setText(to('name=amount'), '')
WebUI.setText(to('name=userDefined2'), 'udf2 data')
WebUI.setText(to('name=userDefined3'), '')
WebUI.selectOptionByLabel(to('name=variableField4DropdownGroupItemID'), 'Purple', false)
WebUI.selectOptionByLabel(to('name=variableField5DropdownGroupItemID'), '--Select One--', false)
WebUI.setText(to('name=billingFirstname'), '')
WebUI.setText(to('name=billingLastname'), '')
WebUI.setText(to('id=routingNumber'), '')
WebUI.setText(to('id=accountNumber'), '')
WebUI.setText(to('id=confirmAccountNumber'), '')
WebUI.setText(to('name=billingAddress'), '')
WebUI.setText(to('name=billingAddress2'), 'Room 1')
WebUI.setText(to('id=billing-zip-input'), '')
WebUI.setText(to('name=emailAddress'), 'iahmed@govolution.com')
WebUI.click(to('name=achSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.verifyTextPresent('Required fields are highlighted with an asterisk', true)
WebUI.verifyTextPresent('Amount is required', true)
WebUI.verifyTextPresent('UDF3 Label is required', true)
WebUI.verifyTextPresent('UDF5 Label is required', true)
WebUI.verifyTextPresent('First name is required', true)
WebUI.verifyTextPresent('Last name is required', true)
WebUI.verifyTextPresent('Account number is required', true)
WebUI.verifyTextPresent('The Confirm Account Number field is a required field', true)
WebUI.verifyTextPresent('Account type is required', true)
WebUI.verifyTextPresent('Address Line 1 is required', true)
WebUI.verifyTextPresent('ZIP Code is required', true)
WebUI.verifyTextPresent('You must review and accept the ACH terms and conditions in order to process an electronic debit transaction', true)

println('End Test: MissingReqFieldsPC')