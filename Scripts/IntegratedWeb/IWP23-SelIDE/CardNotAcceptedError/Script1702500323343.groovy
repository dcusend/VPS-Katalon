import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.com/')
String baseUrl = 'https://www.google.com/'
int pageLoadTimeoutSeconds = 30

def to = { String locator -> CustomKeywords.'customClasses.LegacyLocatorUtils.testObjectFromLegacyLocator'(locator) }

println('Begin Test: CardNotAcceptedError')

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
WebUI.click(to('name=paymentMethod'))
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.setText(to('name=amount'), '10.00')
WebUI.setText(to('name=userDefined2'), 'udf2 new')
WebUI.setText(to('name=userDefined3'), 'udf3 new')
WebUI.selectOptionByLabel(to('name=variableField4DropdownGroupItemID'), 'Purple', false)
WebUI.selectOptionByLabel(to('name=variableField5DropdownGroupItemID'), 'Soccer', false)
WebUI.setText(to('name=billingName'), 'Rosa Eliver')
WebUI.setText(to('id=cardNumber'), '6011000000000004')
WebUI.setText(to('id=spc'), '123')
WebUI.selectOptionByLabel(to('name=cardExpMonth'), '02', false)
WebUI.selectOptionByLabel(to('name=cardExpYear'), '2028', false)
WebUI.setText(to('name=billingAddress'), '55 Nolan Drive')
WebUI.setText(to('name=billingAddress2'), 'Unit 2')
WebUI.setText(to('id=billing-zip-input'), '22201')
WebUI.setText(to('name=emailAddress'), 'imtiazster@gmail.com')
WebUI.click(to('id=checkedAcceptCondition'))
WebUI.click(to('name=ccSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.verifyTextPresent('This card type is not accepted, please enter a different credit or debit card number', true)

println('End Test: CardNotAcceptedError')