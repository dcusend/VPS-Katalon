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


WebUI.setText(to("name=amount"), ("12.00").toString())
WebUI.setText(to("name=userDefined2"), ("UDF2 Data1").toString())
WebUI.setText(to("name=userDefined3"), ("UDF3 Data1").toString())
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


WebUI.click(to("name=confirmNotifyAction"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
//softAssertion.assertEquals("This transaction is subject to a Convenience Fees of $2.00.", selenium.getText("css=td.payor_opt > p"))
//softAssertion.assertEquals("Payment Amount:", selenium.getText("//td[2]"))
//softAssertion.assertEquals("$12.00", selenium.getText("//td[3]"))
//softAssertion.assertEquals("Convenience Fees:", selenium.getText("//tr[2]/td[2]"))
//softAssertion.assertEquals("$2.00", selenium.getText("//tr[2]/td[3]"))
//softAssertion.assertEquals("Total Amount:", selenium.getText("css=b"))
//softAssertion.assertEquals("$14.00", selenium.getText("//td[3]/b"))
//softAssertion.assertEquals("One transaction in the amount of $14.00 will appear on your bank statement.", selenium.getText("//td/p[2]"))
	
WebUI.verifyTextPresent(("This transaction is subject to a Convenience Fees of \$2.00."), false)
WebUI.verifyTextPresent(("Payment Amount:"), true)
WebUI.verifyTextPresent(("\$12.00"), false)
WebUI.verifyTextPresent(("Convenience Fees:"), true)
WebUI.verifyTextPresent(("Total Amount:"), true)
WebUI.verifyTextPresent(("\$14.00"), false)
WebUI.verifyTextPresent(("One transaction in the amount of \$14.00 will appear on your bank statement."), false)
WebUI.verifyTextPresent(("\$2.00"), false)
	
	

WebUI.click(to("name=convFeeNotifyAction"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(15)
//softAssertion.assertEquals("$12.00", selenium.getText("//tr[7]/td[2]"))
//softAssertion.assertEquals("$2.00", selenium.getText("//tr[8]/td[2]"))
//softAssertion.assertEquals("Single Transaction", selenium.getText("//tr[9]/td[2]"))
//softAssertion.assertEquals("$14.00", selenium.getText("//tr[10]/td[2]"))
//softAssertion.assertEquals("Authorization and Capture", selenium.getText("//tr[11]/td[2]"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[12]/td[2]")', "Visa.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[12]/td[2]")', "HUNTER HELMS.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[12]/td[2]")', "1111.*"), true)

WebUI.verifyTextPresent(("\$12.00"), false)
WebUI.verifyTextPresent(("\$2.00"), false)
WebUI.verifyTextPresent(("Single Transaction"), true)
WebUI.verifyTextPresent(("\$14.00"), false)
WebUI.verifyTextPresent(("Authorization and Capture"), true)
WebUI.verifyTextPresent(("Visa"), true)
WebUI.verifyTextPresent(("HUNTER HELMS"), true)
WebUI.verifyTextPresent(("1111"), true)

