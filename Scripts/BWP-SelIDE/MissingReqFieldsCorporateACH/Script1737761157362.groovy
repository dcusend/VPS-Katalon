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

WebUI.setText(to('name=amount'), '10.00')
WebUI.setText(to('name=taxAmount'), '1.59')
WebUI.setText(to('name=clientAccountNumber'), '1234567')
WebUI.setText(to('name=user_defined1'), 'udf1 data')
WebUI.setText(to('name=user_defined2'), 'udf2 data')
WebUI.setText(to('name=user_defined3'), 'udf3 data')
WebUI.setText(to('name=user_defined4'), 'udf4 data')
WebUI.setText(to('name=user_defined5'), 'udf5 data')
WebUI.setText(to('name=user_defined6'), 'udf6 data')
WebUI.setText(to('name=user_defined7'), 'udf7 data')
WebUI.setText(to('name=user_defined8'), 'udf8 data')
WebUI.setText(to('name=user_defined9'), 'udf9 data')
WebUI.setText(to('name=user_defined10'), 'udf10 data')
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.click(to("xpath=(//input[@name='paymentMethod'])[3]"))
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
WebUI.setText(to('name=billingCompanyname'), '')
WebUI.setText(to('id=routingNumber'), '')
WebUI.setText(to('id=accountNumber'), '')
WebUI.setText(to('id=confirmAccountNumber'), '')
WebUI.setText(to('name=ein'), '123456789')
WebUI.setText(to('name=billingAddress'), '')
WebUI.setText(to('name=billingAddress2'), 'suite 600')
WebUI.setText(to('name=emailAddress'), 'iahmed@govolution.com')
WebUI.click(to('name=achSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)



/*
 * softAssertion.assertEquals("Amount is required",
 * selenium.getText("css=span.vrelay-error"))
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "UDF3 is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "UDF5 is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "UDF8 is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Company Name is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Account number is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "The Confirm Account Number field is a required field.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "Address Line 1 is required.*"), true)
 * softAssertion.assertEquals("ZIP Code is required",
 * selenium.getText("id=billing-zip-input-err-from-formbean"))
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "City is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ', "State is required.*"), true)
 * softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")
 * ',
 * "You must review and accept the ACH terms and conditions in order to process an electronic debit transaction.*"
 * ), true)
 */

WebUI.verifyTextPresent(("Amount is required"), true)
WebUI.verifyTextPresent(("UDF3 is required.*"), true)
WebUI.verifyTextPresent(("UDF5 is required.*"), true)
WebUI.verifyTextPresent(("UDF8 is required.*"), true)
WebUI.verifyTextPresent(("Company Name is required.*"), true)
WebUI.verifyTextPresent(("Account number is required.*"), true)
WebUI.verifyTextPresent(("The Confirm Account Number field is a required field.*"), true)
WebUI.verifyTextPresent(("Address Line 1 is required.*"), true)
WebUI.verifyTextPresent(("ZIP Code is required"), true)
WebUI.verifyTextPresent(("City is required.*"), true)
WebUI.verifyTextPresent(("State is required.*"), true)
WebUI.verifyTextPresent(("You must review and accept the ACH terms and conditions in order to process an electronic debit transaction.*"), true)




