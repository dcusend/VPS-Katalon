import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.com/')
def to = { String locator -> CustomKeywords.'customClasses.LegacyLocatorUtils.testObjectFromLegacyLocator'(locator) }

//bbpURL = GlobalVariable.BBPURL
WebUI.navigateToUrl("https://qa2.velocitypayment.com/vbillslookup/lookup/iahmedvbills")

//selenium.open("/vbillslookup/lookup/iahmedvbills")
WebUI.setText(to("id=field1"), "soleja")
WebUI.setText(to("id=field2"), "123456")
WebUI.click(to("name=Test"))
//softAssertion.assertEquals(Pattern.matches('selenium.getText("name=paymentform")', "Please Utilize The Section Below to Lookup Your bill. If you have any questions please contact your system administrator.*"), true)
//softAssertion.assertEquals("Bill Number :", selenium.getText("css=nobr"))
//softAssertion.assertEquals("Phone Number :", selenium.getText("//tr[2]/td/nobr"))
//softAssertion.assertEquals("Search For Bill", selenium.getValue("name=Test"))
//softAssertion.assertEquals("Modify Search", selenium.getValue("//input[@value='Modify Search']"))
//softAssertion.assertEquals("Continue", selenium.getValue("name=paysubmit"))

WebUI.verifyTextPresent(("This portal is for full Reston assessment payments only"), true)
WebUI.verifyTextPresent(("To make an installment or tax relief payment by credit card"), true)
WebUI.verifyTextPresent(("Please lookup your bill by entering your Account Number"), true)
WebUI.verifyTextPresent(("The information is highlighted on the sample invoice"), true)
WebUI.verifyTextPresent(("Bill Number:"), true)
WebUI.verifyTextPresent(("Phone Number:"), true)


WebUI.verifyElementVisible(findTestObject('Object Repository/BBP/BillLookup_Page/button_Continue'))
WebUI.verifyElementVisible(findTestObject('Object Repository/BBP/BillLookup_Page/button_ModifySearch'))
WebUI.verifyElementVisible(findTestObject('Object Repository/BBP/BillLookup_Page/button_SearchForBill'))


