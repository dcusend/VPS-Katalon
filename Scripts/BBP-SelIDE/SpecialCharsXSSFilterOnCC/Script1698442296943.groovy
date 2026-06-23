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


WebUI.setText(to("id=field1"), "444150")
WebUI.setText(to("id=field2"), "444151")
WebUI.click(to("name=Test"))
WebUI.delay(2)
WebUI.click(to("name=paysubmit"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.click(to("name=paymentMethod"))
WebUI.click(to("css=input[type=\"submit\"]"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
//softAssertion.assertEquals("Required fields are highlighted with an asterisk.", selenium.getText("css=span.required"))
//softAssertion.assertEquals("Please enter the following information about your payment:", selenium.getText("css=span.vrelay-header"))

WebUI.verifyTextPresent(("Required fields are highlighted with an asterisk."), true)
WebUI.verifyTextPresent(("Please enter the following information about your payment:"), true)


WebUI.setText(to("name=amount"), ("12.00").toString())
WebUI.setText(to("name=userDefined1"), ("ab").toString())
WebUI.setText(to("name=userDefined2"), ("<>").toString())
WebUI.setText(to("name=userDefined3"), ("&").toString())
WebUI.selectOptionByLabel(to("name=variableField4DropdownGroupItemID"), "Purple", false)
WebUI.selectOptionByLabel(to("name=variableField5DropdownGroupItemID"), "Orange", false)
WebUI.setText(to("name=userDefined6"), ("%").toString())
WebUI.setText(to("name=userDefined7"), ("=").toString())
WebUI.setText(to("name=userDefined8"), ("?").toString())
WebUI.setText(to("name=billingName"), ("Hunter Cañon").toString())
WebUI.setText(to("id=cardNumber"), "4111111111111111")
WebUI.setText(to("id=spc"), "123")
WebUI.selectOptionByLabel(to("name=cardExpMonth"), "04", false)
WebUI.selectOptionByLabel(to("name=cardExpYear"), "2028", false)
WebUI.setText(to("name=billingAddress"), ("2311 york \"\" road").toString())
WebUI.setText(to("name=billingAddress2"), ("Suite ' 600").toString())
WebUI.setText(to("id=billing-zip-input"), "21054")
WebUI.setText(to("name=emailAddress"), ("iahmed@govolution.com").toString())
WebUI.click(to("id=checkedAcceptCondition"))
WebUI.click(to("name=ccSubmit"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(2)
//softAssertion.assertEquals("Test vBills Auto - Error The following error occurred: <br> Invalid characters<br> Please&nbsp;&nbsp;click here to continue.", selenium.getText("//td[2]"))

WebUI.verifyTextPresent(("Test vBills Auto - Error"), true)
WebUI.verifyTextPresent(("The following error occurred:"), true)
WebUI.verifyTextPresent(("The following characters are not allowed"), true)
WebUI.verifyTextPresent(("[\"`=;?<>]"), false)


