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

WebUI.setText(to("id=field1"), "soleja")
WebUI.setText(to("id=field2"), "123456")
WebUI.click(to("name=Test"))
WebUI.delay(5)
WebUI.verifyTextPresent(("The information you have entered does not match our records. Please try again"), true)
WebUI.setText(to("id=field1"), "111150")
WebUI.setText(to("id=field2"), "111151")
WebUI.click(to("name=Test"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(5)
WebUI.verifyTextPresent(("Match Found. Please verify the Amount Due below and click \"Continue\" to review your bill information and make a payment"), true)
