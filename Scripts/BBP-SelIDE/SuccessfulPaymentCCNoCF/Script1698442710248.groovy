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


//selenium.open("/vbillslookup/lookup/testvbillsauto")
WebUI.setText(to("id=field1"), "111150")
WebUI.setText(to("id=field2"), "111151")
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


WebUI.click(to("name=confirmNotifyAction"))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.delay(15)
//softAssertion.assertEquals("Successful Payment Receipt", selenium.getText("css=td > h2"))
//softAssertion.assertEquals("Please print this receipt for your records", selenium.getText("css=td > p"))
//softAssertion.assertEquals("$12.00", selenium.getText("//tr[14]/td[2]"))
//softAssertion.assertEquals("Authorization and Capture", selenium.getText("//tr[15]/td[2]"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[16]/td[2]")', "Visa.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[16]/td[2]")', "HUNTER HELMS.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "2311 york road.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "Suite 600.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "United States.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "GAMBRILLS.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "Maryland.*"), true)
//softAssertion.assertEquals(Pattern.matches('selenium.getText("//tr[17]/td[2]")', "21054.*"), true)
//softAssertion.assertEquals("UDF1 Data", selenium.getText("//tr[5]/td[2]"))
//softAssertion.assertEquals("UDF2 Data1", selenium.getText("//tr[6]/td[2]"))
//softAssertion.assertEquals("UDF3 Data1", selenium.getText("//tr[7]/td[2]"))
//softAssertion.assertEquals("Purple", selenium.getText("//tr[8]/td[2]"))
//softAssertion.assertEquals("Orange", selenium.getText("//tr[9]/td[2]"))
//softAssertion.assertEquals("UDF6 Data1", selenium.getText("//tr[10]/td[2]"))
//softAssertion.assertEquals("UDF7 Data1", selenium.getText("//tr[11]/td[2]"))
//softAssertion.assertEquals("UDF8 Data1", selenium.getText("//tr[12]/td[2]"))
//softAssertion.assertEquals("$3.65", selenium.getText("//tr[13]/td[2]"))


WebUI.verifyTextPresent(("Successful Payment Receipt"), true)
WebUI.verifyTextPresent(("Please print this receipt for your records"), true)
WebUI.verifyTextPresent(("12.00"), true)
WebUI.verifyTextPresent(("Authorization and Capture"), true)
WebUI.verifyTextPresent(("Visa"), true)
WebUI.verifyTextPresent(("HUNTER HELMS"), true)
WebUI.verifyTextPresent(("2311 york road"), true)
WebUI.verifyTextPresent(("Suite 600"), true)
WebUI.verifyTextPresent(("United States"), true)
WebUI.verifyTextPresent(("GAMBRILLS"), true)
WebUI.verifyTextPresent(("MD"), true)
WebUI.verifyTextPresent(("21054"), true)
WebUI.verifyTextPresent(("UDF1 Data"), true)
WebUI.verifyTextPresent(("UDF2 Data1"), true)
WebUI.verifyTextPresent(("UDF3 Data1"), true)
WebUI.verifyTextPresent(("Purple"), true)
WebUI.verifyTextPresent(("Orange"), true)
WebUI.verifyTextPresent(("UDF6 Data1"), true)
WebUI.verifyTextPresent(("UDF7 Data1"), true)
WebUI.verifyTextPresent(("UDF8 Data1"), true)
WebUI.verifyTextPresent(("3.65"), true)

