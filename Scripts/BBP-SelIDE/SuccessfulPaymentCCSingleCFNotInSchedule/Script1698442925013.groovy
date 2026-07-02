import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.com/')
String baseUrl = "https://www.google.com/"
int pageLoadTimeoutSeconds = 30
def to = { String locator -> CustomKeywords.'customClasses.LegacyLocatorUtils.testObjectFromLegacyLocator'(locator) }

def sCFBBPURL = GlobalVariable.SCFBBPURL
if (sCFBBPURL?.startsWith('http://') || sCFBBPURL?.startsWith('https://')) {
	WebUI.navigateToUrl(sCFBBPURL)
} else {
	WebUI.navigateToUrl(baseUrl + sCFBBPURL)
}


//selenium.open("/vbillslookup/lookup/testvbillsautoscf")
WebUI.setText(to("id=field1"), "666160")
WebUI.setText(to("id=field2"), "666161")
WebUI.setText(to("id=field3"), "666162")
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


WebUI.setText(to("name=amount"), ("10.00").toString())
WebUI.setText(to("name=userDefined2"), ("UDF2 Data1").toString())
WebUI.setText(to("name=userDefined3"), ("UDF3 Data1").toString())
WebUI.setText(to("name=billingName"), ("Hunter Helms").toString())
WebUI.setText(to("id=cardNumber"), "5424000000000015")
WebUI.setText(to("id=spc"), "123")
WebUI.selectOptionByLabel(to("name=cardExpMonth"), "04", false)
WebUI.selectOptionByLabel(to("name=cardExpYear"), "2028", false)
WebUI.setText(to("name=billingAddress"), ("2311 york road").toString())
WebUI.setText(to("name=billingAddress2"), ("Suite 600").toString())
WebUI.setText(to("id=billing-zip-input"), "21054")
WebUI.setText(to("name=emailAddress"), ("iahmed@govolution.com").toString())
WebUI.click(to("id=checkedAcceptCondition"))
WebUI.click(to("name=ccSubmit"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
//softAssertion.assertEquals("Please verify the following information:", selenium.getText("css=span.vrelay-header"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)

WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)


WebUI.click(to("name=confirmNotifyAction"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(15)
//softAssertion.assertEquals("Total Amount:", selenium.getText("//tr[7]/td"))
//softAssertion.assertEquals("$10.00", selenium.getText("//tr[7]/td[2]"))

WebUI.verifyTextPresent(("Total Amount:"), true)
WebUI.verifyTextPresent(("\$10.00"), false)


