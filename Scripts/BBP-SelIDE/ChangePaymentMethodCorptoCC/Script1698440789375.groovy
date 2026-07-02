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
//softAssertion.assertEquals("Required fields are highlighted with an asterisk.", selenium.getText("css=span.required"))
//softAssertion.assertEquals("Please enter the following billing information about your payment:", selenium.getText("css=span.vrelay-header"))
WebUI.setText(to("name=amount"), ("15.00").toString())
WebUI.setText(to("name=userDefined2"), ("UDF2 Data3").toString())
WebUI.setText(to("name=userDefined3"), ("UDF3 Data3").toString())
WebUI.selectOptionByLabel(to("name=variableField4DropdownGroupItemID"), "Purple", false)
WebUI.selectOptionByLabel(to("name=variableField5DropdownGroupItemID"), "Orange", false)
WebUI.setText(to("name=userDefined6"), ("UDF6 Data3").toString())
WebUI.setText(to("name=userDefined7"), ("UDF7 Data3").toString())
WebUI.setText(to("name=userDefined8"), ("UDF8 Data3").toString())
WebUI.setText(to("name=billingCompanyname"), ("My Company").toString())
WebUI.setText(to("id=routingNumber"), "256072691")
WebUI.setText(to("id=accountNumber"), "33333333")
WebUI.setText(to("id=confirmAccountNumber"), "33333333")
WebUI.setText(to("name=ein"), "123456789")
WebUI.setText(to("name=billingAddress"), ("2311 york road").toString())
WebUI.setText(to("name=billingAddress2"), ("suite 600").toString())
WebUI.setText(to("id=billing-zip-input"), "21054")
WebUI.setText(to("name=emailAddress"), ("iahmed@govolution.com").toString())
WebUI.click(to("id=checkedAcceptCondition"))
WebUI.click(to("name=achSubmit"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
//softAssertion.assertEquals("Please verify the following information:", selenium.getText("css=span.vrelay-header"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)

WebUI.verifyTextPresent(("Please verify the following information:"), true)
WebUI.verifyTextPresent(("Is this information correct"), true)

WebUI.verifyTextPresent(("Corporate Checking"), true)
WebUI.click(to("name=changePaymentMethodButton"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.click(to("name=paymentMethod"))
WebUI.click(to("css=input[type=\"submit\"]"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.setText(to("name=amount"), ("12.00").toString())
WebUI.setText(to("name=userDefined2"), ("UDF2 Data1").toString())
WebUI.setText(to("name=userDefined3"), ("UDF3 Data1").toString())
WebUI.selectOptionByLabel(to("name=variableField4DropdownGroupItemID"), "Purple", false)
WebUI.selectOptionByLabel(to("name=variableField5DropdownGroupItemID"), "Orange", false)
WebUI.setText(to("name=userDefined6"), ("UDF6 Data1").toString())
WebUI.setText(to("name=userDefined7"), ("UDF7 Data1").toString())
WebUI.setText(to("name=userDefined8"), ("UDF8 Data1").toString())
WebUI.setText(to("name=billingName"), ("Hunter Helms").toString())
WebUI.setText(to("id=cardNumber"), "4111111111111111")
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

//softAssertion.assertEquals("Visa", selenium.getText("//tr[16]/td[3]"))

WebUI.verifyTextPresent(("Visa"), true)


WebUI.click(to("name=confirmNotifyAction"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(15)
//softAssertion.assertEquals("Authorization and Capture", selenium.getText("//tr[15]/td[2]"))

WebUI.verifyTextPresent(("Authorization and Capture"), true)
