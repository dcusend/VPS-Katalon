import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
WebUI.setText(to('name=user_defined4'), 'udf4 data')
WebUI.setText(to('name=user_defined5'), 'udf5 data')
WebUI.setText(to('name=user_defined6'), 'udf6 data')
WebUI.setText(to('name=user_defined7'), 'udf7 data')
WebUI.setText(to('name=user_defined8'), 'udf8 data')
WebUI.setText(to('name=user_defined9'), 'udf9 data')
WebUI.setText(to('name=user_defined10'), 'udf10 data')
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.click(to('name=paymentMethod'))
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.setText(to('id=billing-zip-input'), '')
WebUI.setText(to('name=amount'), '')
WebUI.setText(to('name=userDefined1'), 'udf1 data')
WebUI.setText(to('name=userDefined2'), 'udf2 data')
WebUI.setText(to('name=userDefined3'), '')
WebUI.selectOptionByLabel(to('name=variableField4DropdownGroupItemID'), 'Vanilla', false)
WebUI.selectOptionByLabel(to('name=variableField5DropdownGroupItemID'), '--Select One--', false)
WebUI.setText(to('name=userDefined6'), 'udf6 data')
WebUI.setText(to('name=userDefined7'), 'udf7 data')
WebUI.setText(to('name=userDefined8'), '')
WebUI.setText(to('name=userDefined9'), 'udf9 data')
WebUI.setText(to('name=billingName'), '')
WebUI.setText(to('id=cardNumber'), '')
WebUI.setText(to('id=spc'), '')
WebUI.selectOptionByLabel(to('name=cardExpMonth'), 'MM', false)
WebUI.selectOptionByLabel(to('name=cardExpYear'), 'YYYY', false)
WebUI.setText(to('name=billingAddress'), '')
WebUI.setText(to('name=billingAddress2'), 'suite 600')
WebUI.setText(to('name=emailAddress'), 'iahmed@govolution.com')
WebUI.click(to('name=ccSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)



/*
 * softAssertion.assertEquals("Amount is required",
 * selenium.getText("css=span.vrelay-error"))
 * softAssertion.assertEquals("UDF3 is required",
 * selenium.getText("//form[@id='process']/table/tbody/tr[8]/td[3]/span"))
 * softAssertion.assertEquals("UDF5 is required",
 * selenium.getText("//form[@id='process']/table/tbody/tr[10]/td[3]/span"))
 * softAssertion.assertEquals("UDF8 is required",
 * selenium.getText("//form[@id='process']/table/tbody/tr[13]/td[3]/span"))
 * softAssertion.assertEquals("Card name is required",
 * selenium.getText("//form[@id='process']/table/tbody/tr[17]/td[3]/span"))
 * softAssertion.assertEquals("Card number is required",
 * selenium.getText("//form[@id='process']/table/tbody/tr[19]/td[3]/span"))
 * softAssertion.assertEquals("Card Security Code is required",
 * selenium.getText("//form[@id='process']/table/tbody/tr[20]/td[3]/span"))
 * softAssertion.assertEquals("Card expiration date is required",
 * selenium.getText("//form[@id='process']/table/tbody/tr[21]/td[3]/span"))
 * softAssertion.assertEquals("Card address Line 1 is required",
 * selenium.getText("//form[@id='process']/table/tbody/tr[23]/td[3]/span"))
 * softAssertion.assertEquals("Card ZIP Code is required",
 * selenium.getText("id=billing-zip-input-err-from-formbean")) softAssertion.
 * assertEquals("You must review and accept the Credit Card terms and conditions in order to process a credit transaction."
 * , selenium.getText("//form[@id='process']/table/tbody/tr[32]/td[2]/span"))
 */


WebUI.verifyTextPresent(("Amount is required"), true)
WebUI.verifyTextPresent(("UDF3 is required"), true)
WebUI.verifyTextPresent(("UDF5 is required"), true)
WebUI.verifyTextPresent(("UDF8 is required"), true)
WebUI.verifyTextPresent(("Card name is required"), true)
WebUI.verifyTextPresent(("Card number is required"), true)
WebUI.verifyTextPresent(("Card Security Code is required"), true)
WebUI.verifyTextPresent(("Card expiration date is required"), true)
WebUI.verifyTextPresent(("Card address Line 1 is required"), true)
WebUI.verifyTextPresent(("Card ZIP Code is required"), true)
WebUI.verifyTextPresent(("You must review and accept the Credit Card terms and conditions in order to process a credit transaction."), true)





