import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.com/')
String baseUrl = 'https://www.google.com/'
int pageLoadTimeoutSeconds = 30

def to = { String locator -> CustomKeywords.'customClasses.LegacyLocatorUtils.testObjectFromLegacyLocator'(locator) }

println('Begin Test: NoCFModifyCC')

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

def testHarnessURL = GlobalVariable.urlTestHarness
if (testHarnessURL?.startsWith('http://') || testHarnessURL?.startsWith('https://')) {
    WebUI.navigateToUrl(testHarnessURL)
} else {
    WebUI.navigateToUrl(baseUrl + testHarnessURL)
}

WebUI.delay(2)
WebUI.setText(to('name=application_id'), '635')
WebUI.setText(to('name=message_version'), '2.3')
def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
WebUI.setText(to('name=remittance_id'), genRemIDVoid)

WebUI.click(to('css=input.formSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.click(to('name=paymentMethod'))
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.setText(to('name=amount'), '11.50')
WebUI.setText(to('name=userDefined2'), '')
WebUI.setText(to('name=userDefined3'), 'udf3 new')
WebUI.selectOptionByLabel(to('name=variableField4DropdownGroupItemID'), '--Select One--', false)
WebUI.selectOptionByLabel(to('name=variableField5DropdownGroupItemID'), 'Tennis', false)
WebUI.setText(to('name=billingName'), 'Leslie Howard')
WebUI.setText(to('id=cardNumber'), '4111111111111111')
WebUI.setText(to('id=spc'), '568')
WebUI.selectOptionByLabel(to('name=cardExpMonth'), '02', false)
WebUI.selectOptionByLabel(to('name=cardExpYear'), '2028', false)
WebUI.setText(to('name=billingAddress'), '778 Main street')
WebUI.setText(to('name=billingAddress2'), '')
WebUI.setText(to('id=billing-zip-input'), '22201')
WebUI.setText(to('name=emailAddress'), '')
WebUI.click(to('id=checkedAcceptCondition'))
WebUI.click(to('name=ccSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.verifyTextPresent('Please verify the following information:', true)
WebUI.verifyTextPresent('Is this information correct', true)
WebUI.verifyTextPresent('udf1', true)
WebUI.verifyTextPresent('udf3 new', true)
WebUI.verifyTextPresent('Tennis', true)
WebUI.verifyTextPresent('Leslie Howard', true)
WebUI.verifyTextPresent('Visa', true)
WebUI.verifyTextPresent('778 Main street', true)
WebUI.verifyTextPresent('ARLINGTON', true)
WebUI.verifyTextPresent('Virginia', true)
WebUI.verifyTextPresent('22201', true)
WebUI.verifyTextPresent('1111', true)
WebUI.verifyTextPresent('2/2028', true)

WebUI.executeJavaScript('document.process?.confirmNotifyAction?.[1]?.click()', null)
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.setText(to('name=amount'), '25.50')
WebUI.setText(to('name=userDefined2'), 'udf2 modified')
WebUI.setText(to('name=userDefined3'), 'udf3 modified')
WebUI.selectOptionByLabel(to('name=variableField4DropdownGroupItemID'), '--Select One--', false)
WebUI.selectOptionByLabel(to('name=variableField5DropdownGroupItemID'), 'Soccer', false)
WebUI.setText(to('name=billingName'), 'Mashr Mortaza')
WebUI.setText(to('id=cardNumber'), '5424000000000015')
WebUI.setText(to('id=spc'), '568')
WebUI.selectOptionByLabel(to('name=cardExpMonth'), '06', false)
WebUI.selectOptionByLabel(to('name=cardExpYear'), '2029', false)
WebUI.setText(to('name=billingAddress'), '1589 Left Turn')
WebUI.setText(to('name=billingAddress2'), '')
WebUI.setText(to('id=billing-zip-input'), '21054')
WebUI.setText(to('name=emailAddress'), '')
WebUI.click(to('name=ccSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.verifyTextPresent('Please verify the following information:', true)
WebUI.verifyTextPresent('Is this information correct', true)
WebUI.verifyTextPresent('udf1', true)
WebUI.verifyTextPresent('udf2 modified', true)
WebUI.verifyTextPresent('udf3 modified', true)
WebUI.verifyTextPresent('Soccer', true)
WebUI.verifyTextPresent('Mashr Mortaza', true)
WebUI.verifyTextPresent('MasterCard', true)
WebUI.verifyTextPresent('1589 Left Turn', true)
WebUI.verifyTextPresent('GAMBRILLS', true)
WebUI.verifyTextPresent('Maryland', true)
WebUI.verifyTextPresent('21054', true)
WebUI.verifyTextPresent('0015', true)
WebUI.verifyTextPresent('6/2029', true)

WebUI.click(to('name=confirmNotifyAction'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(8)

WebUI.verifyTextPresent('Successful Payment Receipt', true)
WebUI.verifyTextPresent('Please print this receipt for your records', true)
WebUI.verifyTextPresent('udf1', true)
WebUI.verifyTextPresent('udf2 modified', true)
WebUI.verifyTextPresent('udf3 modified', true)
WebUI.verifyTextPresent('Soccer Label', true)
WebUI.verifyTextPresent('\$25.50', false)
WebUI.verifyTextPresent('MASHR MORTAZA', true)
WebUI.verifyTextPresent('MasterCard', true)
WebUI.verifyTextPresent('1589 Left Turn', true)
WebUI.verifyTextPresent('GAMBRILLS', true)
WebUI.verifyTextPresent('MD', true)
WebUI.verifyTextPresent('21054', true)
WebUI.verifyTextPresent('Authorization and Capture', true)
WebUI.verifyTextPresent('0015', true)

println('End Test: NoCFModifyCC')