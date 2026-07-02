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


WebUI.setText(to("id=field1"), "Molly")
WebUI.setText(to("id=field2"), "654321")
WebUI.click(to("name=Test"))
WebUI.delay(2)
WebUI.click(to("name=paysubmit"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(10)

WebUI.verifyTextPresent(("Test vBills Auto - Error"), true)

WebUI.verifyTextPresent(("The following error occurred:"), true)

WebUI.verifyTextPresent(("Transaction cannot be processed due to missing input"), true)

WebUI.verifyTextPresent(("user_defined9"), true)

WebUI.verifyTextPresent(("click here to continue."), true)
