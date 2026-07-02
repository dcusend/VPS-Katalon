import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.google.com/')
String baseUrl = 'https://www.google.com/'
int pageLoadTimeoutSeconds = 30

def to = { String locator -> CustomKeywords.'customClasses.LegacyLocatorUtils.testObjectFromLegacyLocator'(locator) }

def bwpURL = GlobalVariable.BWPURL
if (bwpURL?.startsWith('http://') || bwpURL?.startsWith('https://')) {
    WebUI.navigateToUrl(bwpURL)
} else {
    WebUI.navigateToUrl(baseUrl + bwpURL)
}

def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)

WebUI.setText(to('name=application_id'), '623')
WebUI.setText(to('name=message_version'), '1.5')
WebUI.setText(to('name=remittance_id'), genRemIDVoid)

WebUI.setText(to('name=amount'), '20.00')
WebUI.setText(to('name=taxAmount'), '1.59')
WebUI.setText(to('name=clientAccountNumber'), 'abcdefr')
WebUI.setText(to('name=user_defined1'), 'udf1 data Hello')
WebUI.setText(to('name=user_defined2'), 'udf2 data Hello')
WebUI.setText(to('name=user_defined3'), 'udf3 data Hello')
WebUI.setText(to('name=user_defined4'), 'udf4 data Hello')
WebUI.setText(to('name=user_defined5'), 'udf5 data Hello')
WebUI.setText(to('name=user_defined6'), 'udf6 data Hello')
WebUI.setText(to('name=user_defined7'), 'udf7 data Hello')
WebUI.setText(to('name=user_defined8'), 'udf8 data Hello')
WebUI.setText(to('name=user_defined9'), 'udf9 data Hello')
WebUI.setText(to('name=user_defined10'), 'udf10 data Hello')
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.click(to('name=paymentMethod'))
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.setText(to('id=billing-zip-input'), '22201')
WebUI.setText(to('name=amount'), '10.00')
WebUI.setText(to('name=userDefined1'), 'udf1 data')
WebUI.setText(to('name=userDefined2'), 'udf2 data')
WebUI.setText(to('name=userDefined3'), 'udf3 data')
WebUI.selectOptionByLabel(to('name=variableField4DropdownGroupItemID'), 'Vanilla', false)
WebUI.selectOptionByLabel(to('name=variableField5DropdownGroupItemID'), 'Chocolate', false)
WebUI.setText(to('name=userDefined6'), 'udf6 data')
WebUI.setText(to('name=userDefined7'), 'udf7 data')
WebUI.setText(to('name=userDefined8'), 'udf8 data')
WebUI.setText(to('name=userDefined9'), 'udf9 data')
WebUI.setText(to('name=billingName'), 'Mark Zober')
WebUI.setText(to('id=cardNumber'), '4111111111111111')
WebUI.setText(to('id=spc'), '111')
WebUI.selectOptionByLabel(to('name=cardExpMonth'), '04', false)
WebUI.selectOptionByLabel(to('name=cardExpYear'), '2028', false)
WebUI.setText(to('name=billingAddress'), '2311 york road')
WebUI.setText(to('name=billingAddress2'), 'suite 600')
WebUI.setText(to('name=emailAddress'), 'iahmed@govolution.com')
WebUI.click(to('id=checkedAcceptCondition'))
WebUI.click(to('name=ccSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.verifyTextPresent('Please verify the following information:', true)
WebUI.verifyTextPresent('Is this information correct', true)

WebUI.click(to('name=confirmNotifyAction'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
Thread.sleep(10000)

WebUI.verifyTextPresent('Successful Payment Receipt', true)
WebUI.verifyTextPresent('Authorization and Capture', true)