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

WebUI.setText(to("id=field1"), "soleja")
WebUI.setText(to("id=field2"), "123456")
WebUI.setText(to("id=field3"), "65898742")
WebUI.click(to("name=Test"))
WebUI.delay(5)

WebUI.verifyTextPresent(("The information you have entered does not match our records. Please try again"), true)


WebUI.setText(to("id=field1"), "666160")
WebUI.setText(to("id=field2"), "666161")
WebUI.setText(to("id=field3"), "666162")
WebUI.click(to("name=Test"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

//softAssertion.assertEquals(Pattern.matches('selenium.getText("id=error_msg")', "Match Found. Please verify the Amount Due below and click \"Continue\" to review your bill information and make a payment."), true)

WebUI.verifyTextPresent(("Match Found. Please verify the Amount Due below and click \"Continue\" to review your bill information and make a payment."), true)
