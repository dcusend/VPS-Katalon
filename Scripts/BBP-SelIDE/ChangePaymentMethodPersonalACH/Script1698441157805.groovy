import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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
WebUI.click(to("xpath=(//input[@name='paymentMethod'])[2]"))
WebUI.click(to("css=input[type=\"submit\"]"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.click(to("name=changePaymentMethodButton"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
//softAssertion.assertEquals("Select Payment Method", selenium.getText("css=h1"))
//softAssertion.assertEquals(selenium.isElementPresent("name=paymentMethod"), true)
//softAssertion.assertEquals("Pay by Credit or Debit Card", selenium.getText("css=span.payor_opt"))
//softAssertion.assertEquals(selenium.isElementPresent("xpath=(//input[@name='paymentMethod'])[2]"), true)
//softAssertion.assertEquals("Pay by Personal Check", selenium.getText("//form[@id='selectForm']/table/tbody/tr[2]/td[2]/span[2]"))
//softAssertion.assertEquals(selenium.isElementPresent("xpath=(//input[@name='paymentMethod'])[3]"), true)
//softAssertion.assertEquals("Pay by Corporate Check", selenium.getText("//form[@id='selectForm']/table/tbody/tr[2]/td[2]/span[3]"))
//softAssertion.assertEquals(selenium.isElementPresent("css=input[type=\"submit\"]"), true)

WebUI.verifyTextPresent(("Select Payment Method"), true)
WebUI.verifyElementPresent(findTestObject('Object Repository/BBP/SelectPaymentMethod_Page/input_PayByCC'),30)
WebUI.verifyTextPresent(("Pay by Credit or Debit Card"), true)
WebUI.verifyElementPresent(findTestObject('Object Repository/BBP/SelectPaymentMethod_Page/input_PayByPC'),30)


WebUI.verifyTextPresent(("Pay by Personal Check"), true)

WebUI.verifyElementPresent(findTestObject('Object Repository/BBP/SelectPaymentMethod_Page/input_PayByCorp'),30)
WebUI.verifyTextPresent(("Pay by Corporate Check"), true)

