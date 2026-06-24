import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
WebUI.openBrowser('https://www.google.com/')
String baseUrl = "https://www.google.com/"
int pageLoadTimeoutSeconds = 30
def to = { String locator -> CustomKeywords.'customClasses.LegacyLocatorUtils.testObjectFromLegacyLocator'(locator) }
//selenium.open("vrelaytest.html")

def bwpURL = GlobalVariable.BWPURL
if (bwpURL?.startsWith('http://') || bwpURL?.startsWith('https://')) {
	WebUI.navigateToUrl(bwpURL)
} else {
	WebUI.navigateToUrl(baseUrl + bwpURL)
}

WebUI.setText(to("name=application_id"), "623")
WebUI.setText(to("name=message_version"), ("1.5").toString())


//selenium.type("name=remittance_id", "sdfsdfsdfsdf")
def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
WebUI.setText(to("name=remittance_id"), genRemIDVoid)


WebUI.setText(to("name=amount"), ("20.00").toString())
WebUI.setText(to("name=taxAmount"), ("1.59").toString())
WebUI.setText(to("name=clientAccountNumber"), "abcdefr")
WebUI.setText(to("name=user_defined1"), ("udf1 data Hello").toString())
WebUI.setText(to("name=user_defined2"), ("udf2 data Hello").toString())
WebUI.setText(to("name=user_defined3"), ("udf3 data Hello").toString())
WebUI.setText(to("name=user_defined4"), ("udf4 data").toString())
WebUI.setText(to("name=user_defined5"), ("udf5 data").toString())
WebUI.setText(to("name=user_defined6"), ("udf6 data").toString())
WebUI.setText(to("name=user_defined7"), ("udf7 data").toString())
WebUI.setText(to("name=user_defined8"), ("udf8 data").toString())
WebUI.setText(to("name=user_defined9"), ("udf9 data").toString())
WebUI.setText(to("name=user_defined10"), ("udf10 data").toString())
WebUI.click(to("css=input[type=\"submit\"]"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.click(to("name=paymentMethod"))
WebUI.click(to("css=input[type=\"submit\"]"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.setText(to("id=billing-zip-input"), "22201")
WebUI.setText(to("name=amount"), ("201.00").toString())
WebUI.setText(to("name=userDefined1"), ("udf1 data").toString())
WebUI.setText(to("name=userDefined2"), ("udf2 data").toString())
WebUI.setText(to("name=userDefined3"), ("udf3 data").toString())
WebUI.selectOptionByLabel(to("name=variableField4DropdownGroupItemID"), "Vanilla", false)
WebUI.selectOptionByLabel(to("name=variableField5DropdownGroupItemID"), "Strawberry", false)
WebUI.setText(to("name=userDefined8"), ("udf8 data").toString())
WebUI.setText(to("name=billingName"), ("Mark Zober").toString())
WebUI.setText(to("id=cardNumber"), "4111111111111111")
WebUI.setText(to("id=spc"), "111")
WebUI.selectOptionByLabel(to("name=cardExpMonth"), "04", false)
WebUI.selectOptionByLabel(to("name=cardExpYear"), "2028", false)
WebUI.setText(to("name=billingAddress"), ("2311 york road").toString())
WebUI.setText(to("name=billingAddress2"), ("suite 600").toString())
WebUI.setText(to("name=emailAddress"), ("iahmed@govolution.com").toString())
WebUI.click(to("id=checkedAcceptCondition"))
WebUI.click(to("name=ccSubmit"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
//softAssertion.assertEquals("Amount is greater than maximum", selenium.getText("css=span.vrelay-error"))
WebUI.verifyTextPresent(("Amount is greater than maximum"), true)
