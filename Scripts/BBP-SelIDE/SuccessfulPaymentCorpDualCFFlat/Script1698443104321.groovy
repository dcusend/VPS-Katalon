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
WebUI.click(to("xpath=(//input[@name='paymentMethod'])[3]"))
WebUI.click(to("css=input[type=\"submit\"]"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
//softAssertion.assertEquals("Required fields are highlighted with an asterisk.", selenium.getText("css=span.required"))
//softAssertion.assertEquals("Please enter the following billing information about your payment:", selenium.getText("css=span.vrelay-header"))

WebUI.verifyTextPresent(("Required fields are highlighted with an asterisk."), true)
WebUI.verifyTextPresent(("Please enter the following billing information about your payment:"), true)


WebUI.setText(to("name=amount"), ("10.00").toString())
WebUI.setText(to("name=userDefined2"), ("UDF2 Data3").toString())
WebUI.setText(to("name=userDefined3"), ("UDF3 Data3").toString())
WebUI.setText(to("name=userDefined5"), ("UDF5 Data3").toString())
WebUI.setText(to("name=userDefined6"), ("UDF6 Data3").toString())
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


WebUI.click(to("name=confirmNotifyAction"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
//softAssertion.assertEquals("This transaction is subject to a Convenience Fees of $2.00.", selenium.getText("css=td > p"))
//softAssertion.assertEquals("Payment Amount:", selenium.getText("//td[2]"))
//softAssertion.assertEquals("$10.00", selenium.getText("//td[3]"))
//softAssertion.assertEquals("Convenience Fees:", selenium.getText("//tr[2]/td[2]"))
//softAssertion.assertEquals("$2.00", selenium.getText("//tr[2]/td[3]"))
//softAssertion.assertEquals("Total Amount:", selenium.getText("css=b"))
//softAssertion.assertEquals("$12.00", selenium.getText("//td[3]/b"))
//softAssertion.assertEquals("Two transactions will appear on your bank statement, one in the amount of $10.00 and one in the amount of $2.00.", selenium.getText("//td/p[2]"))
	
WebUI.verifyTextPresent(("This transaction is subject to a Convenience Fees of \$2.00."), false)
WebUI.verifyTextPresent(("Payment Amount:"), true)
WebUI.verifyTextPresent(("\$10.00"), false)
WebUI.verifyTextPresent(("Convenience Fees:"), true)
WebUI.verifyTextPresent(("\$2.00"), false)
WebUI.verifyTextPresent(("Total Amount:"), true)
WebUI.verifyTextPresent(("\$12.00"), false)
WebUI.verifyTextPresent(("Two transactions will appear on your bank statement, one in the amount of \$10.00 and one in the amount of \$2.00."), false)

	

WebUI.click(to("name=convFeeNotifyAction"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(15)
//softAssertion.assertEquals("$10.00", selenium.getText("//tr[12]/td[2]"))
//softAssertion.assertEquals("$2.00", selenium.getText("//tr[13]/td[2]"))
//softAssertion.assertEquals("Dual Transaction", selenium.getText("//tr[14]/td[2]"))
//softAssertion.assertEquals("$12.00", selenium.getText("//tr[16]/td[2]"))
//softAssertion.assertEquals("Debit", selenium.getText("//tr[17]/td[2]"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[18]/td[2]")', "Corporate.*"), true)


WebUI.verifyTextPresent(("\$10.00"), false)
WebUI.verifyTextPresent(("\$2.00"), false)
WebUI.verifyTextPresent(("Dual Transaction"), true)
WebUI.verifyTextPresent(("\$12.00"), false)
WebUI.verifyTextPresent(("Debit"), true)
WebUI.verifyTextPresent(("Corporate"), true)


