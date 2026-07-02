import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.com/')
String baseUrl = "https://www.google.com/"
int pageLoadTimeoutSeconds = 30
def to = { String locator -> CustomKeywords.'customClasses.LegacyLocatorUtils.testObjectFromLegacyLocator'(locator) }

def bbpURL = GlobalVariable.BBPURL
if (bbpURL?.startsWith('http://') || bbpURL?.startsWith('https://')) {
	WebUI.navigateToUrl(bbpURL)
} else {
	WebUI.navigateToUrl(baseUrl + bbpURL)
}


WebUI.setText(to("id=field1"), "111150")
WebUI.setText(to("id=field2"), "111151")
WebUI.click(to("name=Test"))
WebUI.delay(2)
WebUI.click(to("name=paysubmit"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.click(to("xpath=(//input[@name='paymentMethod'])[3]"))
WebUI.click(to("css=input[type=\"submit\"]"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.verifyTextPresent(("Required fields are highlighted with an asterisk."), true)
WebUI.verifyTextPresent(("Please enter the following billing information about your payment:"), true)


WebUI.setText(to("name=amount"), "")
WebUI.setText(to("name=userDefined2"), ("UDF2 Data3").toString())
WebUI.setText(to("name=userDefined3"), "")
WebUI.selectOptionByLabel(to("name=variableField4DropdownGroupItemID"), "Purple", false)
WebUI.selectOptionByLabel(to("name=variableField5DropdownGroupItemID"), "--Select One--", false)
WebUI.setText(to("name=userDefined6"), ("UDF6 Data3").toString())
WebUI.setText(to("name=userDefined7"), "")
WebUI.setText(to("name=userDefined8"), ("UDF8 Data3").toString())
WebUI.setText(to("name=billingCompanyname"), "")
WebUI.setText(to("id=routingNumber"), "")
WebUI.setText(to("id=accountNumber"), "")
WebUI.setText(to("id=confirmAccountNumber"), "")
WebUI.setText(to("name=ein"), "123456789")
WebUI.setText(to("name=billingAddress"), "")
WebUI.setText(to("name=billingAddress2"), ("suite 600").toString())
WebUI.setText(to("id=billing-zip-input"), "")
WebUI.setText(to("name=emailAddress"), ("iahmed@govolution.com").toString())
WebUI.click(to("name=achSubmit"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
//softAssertion.assertEquals("Amount is required", selenium.getText("css=span.vrelay-error"))
//softAssertion.assertEquals("UDF3 is required", selenium.getText("//tr[8]/td[3]/span"))
//softAssertion.assertEquals("UDF5 is required", selenium.getText("//tr[10]/td[3]/span"))
//softAssertion.assertEquals("UDF7 is required", selenium.getText("//tr[12]/td[3]/span"))
//softAssertion.assertEquals("Company Name is required", selenium.getText("//tr[15]/td[3]/span"))
//softAssertion.assertEquals("Account number is required", selenium.getText("//tr[17]/td[3]/span"))
//softAssertion.assertEquals("The Confirm Account Number field is a required field.", selenium.getText("//tr[18]/td[3]/span"))
//softAssertion.assertEquals("Address Line 1 is required", selenium.getText("//tr[21]/td[3]/span"))
//softAssertion.assertEquals("ZIP Code is required", selenium.getText("id=billing-zip-input-err-from-formbean"))
//softAssertion.assertEquals("City is required", selenium.getText("//tr[25]/td[3]/span"))
//softAssertion.assertEquals("State is required", selenium.getText("//tr[26]/td[3]/span"))
//softAssertion.assertEquals("You must review and accept the ACH terms and conditions in order to process an electronic debit transaction.", selenium.getText("//tr[30]/td[2]/span"))


WebUI.verifyTextPresent(("Amount is required"), true)
WebUI.verifyTextPresent(("UDF3 is required"), true)
WebUI.verifyTextPresent(("UDF5 is required"), true)
WebUI.verifyTextPresent(("UDF7 is required"), true)
WebUI.verifyTextPresent(("Company Name is required"), true)
WebUI.verifyTextPresent(("Account number is required"), true)
WebUI.verifyTextPresent(("The Confirm Account Number field is a required field."), true)
WebUI.verifyTextPresent(("Address Line 1 is required"), true)
WebUI.verifyTextPresent(("ZIP Code is required"), true)
WebUI.verifyTextPresent(("City is required"), true)
WebUI.verifyTextPresent(("State is required"), true)
WebUI.verifyTextPresent(("You must review and accept the ACH terms and conditions in order to process an electronic debit transaction."), true)


