import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.com/')
String baseUrl = "https://www.google.com/"
int pageLoadTimeoutSeconds = 30
def to = { String locator -> CustomKeywords.'customClasses.LegacyLocatorUtils.testObjectFromLegacyLocator'(locator) }

def dCFBBPURL = GlobalVariable.DCFBBPURL
if (dCFBBPURL?.startsWith('http://') || dCFBBPURL?.startsWith('https://')) {
	WebUI.navigateToUrl(dCFBBPURL)
} else {
	WebUI.navigateToUrl(baseUrl + dCFBBPURL)
}

//selenium.open("/vbillslookup/lookup/testvbillsautodcf")
WebUI.setText(to("id=field1"), "101110")
WebUI.setText(to("id=field2"), "101111")
WebUI.click(to("name=Test"))
WebUI.delay(2)
WebUI.click(to("name=paysubmit"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.click(to("xpath=(//input[@name='paymentMethod'])[2]"))
WebUI.click(to("css=input[type=\"submit\"]"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
//softAssertion.assertEquals("Required fields are highlighted with an asterisk.", selenium.getText("css=span.required"))
//softAssertion.assertEquals("Please enter the following billing information about your payment:", selenium.getText("css=span.vrelay-header"))

WebUI.verifyTextPresent(("Required fields are highlighted with an asterisk."), true)
WebUI.verifyTextPresent(("Please enter the following billing information about your payment:"), true)


WebUI.setText(to("name=amount"), ("101.00").toString())
WebUI.setText(to("name=userDefined2"), ("UDF2 Data1").toString())
WebUI.setText(to("name=userDefined3"), ("UDF3 Data1").toString())
WebUI.setText(to("name=userDefined5"), ("UDF5 Data1").toString())
WebUI.setText(to("name=userDefined6"), ("UDF6 Data1").toString())
WebUI.setText(to("name=userDefined8"), ("UDF8 Data1").toString())
WebUI.setText(to("name=billingFirstname"), "Molly")
WebUI.setText(to("name=billingLastname"), "Hunter")
WebUI.setText(to("id=routingNumber"), "256072691")
WebUI.setText(to("id=accountNumber"), "11111111")
WebUI.setText(to("id=confirmAccountNumber"), "11111111")
WebUI.click(to("name=accountType"))
WebUI.setText(to("name=billingAddress"), ("2311 york road").toString())
WebUI.setText(to("name=billingAddress2"), ("Suite 600").toString())
WebUI.setText(to("id=billing-zip-input"), "21054")
WebUI.setText(to("name=emailAddress"), ("iahmed@govolution.com").toString())
WebUI.click(to("id=checkedAcceptCondition"))
WebUI.click(to("name=achSubmit"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
//softAssertion.assertEquals("Please verify the following information:", selenium.getText("css=span.vrelay-header"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)

WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)


WebUI.click(to("name=confirmNotifyAction"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(15)
//softAssertion.assertEquals("$101.00", selenium.getText("//tr[13]/td[2]"))
//softAssertion.assertEquals("Debit", selenium.getText("//tr[14]/td[2]"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[15]/td[2]")', "Personal.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[15]/td[2]")', "Checking.*"), true)

WebUI.verifyTextPresent(("\$101.00"), false)
WebUI.verifyTextPresent(("Debit"), true)
WebUI.verifyTextPresent(("Personal"), true)
WebUI.verifyTextPresent(("Checking"), true)

