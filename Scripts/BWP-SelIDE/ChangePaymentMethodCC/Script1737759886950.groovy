import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
WebUI.click(to('name=changePaymentMethodButton'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.verifyTextPresent('Select Payment Method', true)
WebUI.verifyTextPresent('Pay by Credit or Debit Card', true)

WebUI.click(to('name=paymentMethod'))
WebUI.verifyElementPresent(findTestObject('Object Repository/BWP/SelectPaymentMethod/input_PayByCreditOrDebitCard'), 30)
WebUI.verifyTextPresent('Pay by Personal Check', true)

WebUI.click(to("xpath=(//input[@name='paymentMethod'])[2]"))
WebUI.verifyElementPresent(findTestObject('Object Repository/BWP/SelectPaymentMethod/input_PayByPersonalCheck'), 30)
WebUI.verifyTextPresent('Pay by Corporate Check', true)

WebUI.click(to("xpath=(//input[@name='paymentMethod'])[3]"))
WebUI.verifyElementPresent(findTestObject('Object Repository/BWP/SelectPaymentMethod/input_PayByCorporateCheck'), 30)
WebUI.verifyElementPresent(findTestObject('Object Repository/BWP/SelectPaymentMethod/input_MakeAPayment'), 30)