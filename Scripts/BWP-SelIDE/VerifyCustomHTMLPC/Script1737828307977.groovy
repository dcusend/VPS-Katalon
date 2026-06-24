import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.google.com/')
String baseUrl = 'https://www.google.com/'
int pageLoadTimeoutSeconds = 30
def to = { String locator -> CustomKeywords.'customClasses.LegacyLocatorUtils.testObjectFromLegacyLocator'(locator) }

def bwpURL = GlobalVariable.BWPURL
if (bwpURL?.startsWith('http://') || bwpURL?.startsWith('https://')) {
	WebUI.navigateToUrl(bwpURL)
} else {
	WebUI.navigateToUrl(baseUrl + bwpURL)
}



WebUI.setText(to('name=application_id'), '623')
WebUI.setText(to('name=message_version'), '1.5')


//selenium.type("name=remittance_id", "sdfsdfsdfsdf")
def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
WebUI.setText(to('name=remittance_id'), genRemIDVoid)


WebUI.setText(to('name=amount'), '10.00')
WebUI.setText(to('name=taxAmount'), '1.59')
WebUI.setText(to('name=clientAccountNumber'), '1234567')
WebUI.setText(to('name=user_defined1'), 'udf1 data')
WebUI.setText(to('name=user_defined2'), 'udf2 data')
WebUI.setText(to('name=user_defined3'), 'udf3 data')
WebUI.setText(to('name=user_defined4'), 'udf4 data')
WebUI.setText(to('name=user_defined5'), 'udf5 data')
WebUI.setText(to('name=user_defined6'), 'udf6 data')
WebUI.setText(to('name=user_defined7'), 'udf7 data')
WebUI.setText(to('name=user_defined8'), 'udf8 data')
WebUI.setText(to('name=user_defined9'), 'udf9 data')
WebUI.setText(to('name=user_defined10'), 'udf10 data')
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.click(to("xpath=(//input[@name='paymentMethod'])[2]"))
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.setText(to('id=billing-zip-input'), '22201')
WebUI.setText(to('name=amount'), '10.00')
WebUI.setText(to('name=userDefined1'), 'udf1 data')
WebUI.setText(to('name=userDefined2'), 'udf2 data')
WebUI.setText(to('name=userDefined3'), 'udf3 data')
WebUI.selectOptionByLabel(to('name=variableField4DropdownGroupItemID'), 'Vanilla', false)
WebUI.selectOptionByLabel(to('name=variableField5DropdownGroupItemID'), 'Chocolate', false)
WebUI.setText(to('name=userDefined6'), 'udf6 data')
WebUI.setText(to('name=userDefined7'), 'udf7 data')
WebUI.setText(to('name=userDefined8'), 'udf8 data')
WebUI.setText(to('name=userDefined9'), 'udf9 data')
WebUI.setText(to('name=billingFirstname'), 'Mark')
WebUI.setText(to('name=billingLastname'), 'Zober')
WebUI.setText(to('id=routingNumber'), '256072691')
WebUI.setText(to('id=accountNumber'), '11111111')
WebUI.setText(to('id=confirmAccountNumber'), '11111111')
WebUI.click(to('name=accountType'))
WebUI.setText(to('name=billingAddress'), '2311 york road')
WebUI.setText(to('name=billingAddress2'), 'suite 600')
WebUI.setText(to('name=emailAddress'), 'iahmed@govolution.com')
WebUI.click(to('id=checkedAcceptCondition'))




//softAssertion.assertEquals(Pattern.matches('selenium.getText("id=main-focus")', "This the ACH Custom HTML. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox.*"), true)
//softAssertion.assertEquals("This the ACH Custom HTML. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox.", selenium.getText("css=center > table > tbody > tr > td.payor_opt"))


WebUI.verifyTextPresent(("This the ACH Custom HTML. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox.*"), true)
WebUI.verifyTextPresent(("This the ACH Custom HTML. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox."), true)



WebUI.click(to('name=achSubmit'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)



//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=span.payor_opt")', '^exact:Is this information correct[\\s\\S]$'), true)
//softAssertion.assertEquals("This the ACH Custom HTML. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox.", selenium.getText("css=center > table > tbody > tr > td.payor_opt"))

WebUI.verifyTextPresent(("Is this information correct"), true)
WebUI.verifyTextPresent(("This the ACH Custom HTML. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox. This text is to verify that a scroll bar is displayed in the payment application if a large text is entered into this textbox."), true)




WebUI.click(to('name=confirmNotifyAction'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
Thread.sleep(20000);



//softAssertion.assertEquals("Successful Payment Receipt", selenium.getText("css=h2"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("css=section")', '^exact:Thank you for your business\\. Questions[\\s\\S] Please contact Stein Sperling Vanessa L\\. Seward at 301-838-3248 or vseward@steinsperling\\.com\\.$'), true)

WebUI.verifyTextPresent(("Successful Payment Receipt"), true)
WebUI.verifyTextPresent(("Thank you for your business"), true)
WebUI.verifyTextPresent(("Please contact Stein Sperling Vanessa"), true)


