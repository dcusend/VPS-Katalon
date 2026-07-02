import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.com/')
String baseUrl = 'https://www.google.com/'
int pageLoadTimeoutSeconds = 30

def to = { String locator -> CustomKeywords.'customClasses.LegacyLocatorUtils.testObjectFromLegacyLocator'(locator) }

println('Begin Test: AmpersandCorp')

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
WebUI.click(to("xpath=(//input[@name='paymentMethod'])[3]"))
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.setText(to('name=amount'), '10.50')
WebUI.setText(to('name=userDefined2'), 'udf2 data')
WebUI.setText(to('name=userDefined3'), 'udf3 data')
WebUI.selectOptionByLabel(to('name=variableField4DropdownGroupItemID'), 'Purple', false)
WebUI.selectOptionByLabel(to('name=variableField5DropdownGroupItemID'), 'Tennis', false)
WebUI.setText(to('name=billingCompanyname'), 'CompName & Son MaintenanceA')
WebUI.setText(to('id=routingNumber'), '256072691')
WebUI.setText(to('id=accountNumber'), '33333333')
WebUI.setText(to('id=confirmAccountNumber'), '33333333')
WebUI.setText(to('name=ein'), '123456789')
WebUI.setText(to('name=billingAddress'), 'AddLine1 & Son Mai Johnson & Son Mai Johnson & S')
WebUI.setText(to('name=billingAddress2'), 'AddLine2 & Son Mai Johnson & Son Mai Johnson & S')
WebUI.setText(to('id=billing-zip-input'), '22201')
WebUI.setText(to('name=emailAddress'), 'iahmed@govolution.com')
WebUI.click(to('id=checkedAcceptCondition'))
WebUI.click(to('name=achSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.verifyTextPresent('Please verify the following information:', true)
WebUI.verifyTextPresent('Is this information correct', true)
WebUI.verifyTextPresent('\$10.50', false)
WebUI.verifyTextPresent('CompName & Son MaintenanceA', true)
WebUI.verifyTextPresent('AddLine1 & Son Mai Johnson & Son Mai Johnson & S', true)
WebUI.verifyTextPresent('AddLine2 & Son Mai Johnson & Son Mai Johnson & S', true)

WebUI.click(to('name=confirmNotifyAction'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(8)

WebUI.verifyTextPresent('Successful Payment Receipt', true)
WebUI.verifyTextPresent('Please print this receipt for your records', true)
WebUI.verifyTextPresent('\$10.50', false)
WebUI.verifyTextPresent('Debit', true)
WebUI.verifyTextPresent('Corporate', true)
WebUI.verifyTextPresent('Checking', true)
WebUI.verifyTextPresent('CompName & Son MaintenanceA', true)
WebUI.verifyTextPresent('AddLine1 & Son Mai Johnson & Son Mai Johnson & S', true)
WebUI.verifyTextPresent('AddLine2 & Son Mai Johnson & Son Mai Johnson & S', true)

println('End Test: AmpersandCorp')