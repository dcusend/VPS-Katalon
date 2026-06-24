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
WebUI.click(to("name=paymentMethod"))
WebUI.click(to("css=input[type=\"submit\"]"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

WebUI.verifyTextPresent(("Required fields are highlighted with an asterisk."), true)
WebUI.verifyTextPresent(("Please enter the following information about your payment:"), true)


WebUI.setText(to("name=amount"), "")
WebUI.setText(to("name=userDefined2"), ("UDF2 Data1").toString())
WebUI.setText(to("name=userDefined3"), "")
WebUI.selectOptionByLabel(to("name=variableField4DropdownGroupItemID"), "Purple", false)
WebUI.selectOptionByLabel(to("name=variableField5DropdownGroupItemID"), "--Select One--", false)
WebUI.setText(to("name=userDefined6"), ("UDF6 Data1").toString())
WebUI.setText(to("name=userDefined7"), "")
WebUI.setText(to("name=userDefined8"), ("UDF8 Data1").toString())
WebUI.setText(to("name=billingName"), "")
WebUI.setText(to("id=cardNumber"), "")
WebUI.setText(to("id=spc"), "")
WebUI.selectOptionByLabel(to("name=cardExpMonth"), "MM", false)
WebUI.selectOptionByLabel(to("name=cardExpYear"), "YYYY", false)
WebUI.setText(to("name=billingAddress"), "")
WebUI.setText(to("name=billingAddress2"), ("Suite 600").toString())
WebUI.setText(to("id=billing-zip-input"), "")
WebUI.setText(to("name=emailAddress"), ("iahmed@govolution.com").toString())
WebUI.click(to("name=ccSubmit"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
//softAssertion.assertEquals("Amount is required", selenium.getText("css=span.vrelay-error"))
//softAssertion.assertEquals("UDF3 is required", selenium.getText("//form[@id='process']/table/tbody/tr[8]/td[3]/span"))
//softAssertion.assertEquals("UDF5 is required", selenium.getText("//form[@id='process']/table/tbody/tr[10]/td[3]/span"))
//softAssertion.assertEquals("UDF7 is required", selenium.getText("//form[@id='process']/table/tbody/tr[12]/td[3]/span"))
//softAssertion.assertEquals("Card name is required", selenium.getText("//form[@id='process']/table/tbody/tr[15]/td[3]/span"))
//softAssertion.assertEquals("Card number is required", selenium.getText("//form[@id='process']/table/tbody/tr[17]/td[3]/span"))
//softAssertion.assertEquals("Card Security Code is required", selenium.getText("//form[@id='process']/table/tbody/tr[19]/td[3]/span"))
//softAssertion.assertEquals("Card expiration date is required", selenium.getText("//form[@id='process']/table/tbody/tr[20]/td[3]/span"))
//softAssertion.assertEquals("Card address Line 1 is required", selenium.getText("//form[@id='process']/table/tbody/tr[22]/td[3]/span"))
//softAssertion.assertEquals("Card ZIP Code is required", selenium.getText("id=billing-zip-input-err-from-formbean"))
//softAssertion.assertEquals("You must review and accept the Credit Card terms and conditions in order to process a credit transaction.", selenium.getText("//form[@id='process']/table/tbody/tr[31]/td[2]/span"))


WebUI.verifyTextPresent(("Amount is required"), true)
WebUI.verifyTextPresent(("UDF3 is required"), true)
WebUI.verifyTextPresent(("UDF5 is required"), true)
WebUI.verifyTextPresent(("UDF7 is required"), true)
WebUI.verifyTextPresent(("Card name is required"), true)
WebUI.verifyTextPresent(("Card number is required"), true)
WebUI.verifyTextPresent(("Card Security Code is required"), true)
WebUI.verifyTextPresent(("Card expiration date is required"), true)
WebUI.verifyTextPresent(("Card address Line 1 is required"), true)
WebUI.verifyTextPresent(("Card ZIP Code is required"), true)
WebUI.verifyTextPresent(("You must review and accept the Credit Card terms and conditions in order to process a credit transaction."), true)


