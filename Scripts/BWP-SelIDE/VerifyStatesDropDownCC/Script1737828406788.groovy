import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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


WebUI.setText(to('name=amount'), '20.00')
WebUI.setText(to('name=taxAmount'), '1.59')
WebUI.setText(to('name=clientAccountNumber'), 'abcdefr')
WebUI.setText(to('name=user_defined1'), 'udf1 data Hello')
WebUI.setText(to('name=user_defined2'), 'udf2 data Hello')
WebUI.setText(to('name=user_defined3'), 'udf3 data Hello')
WebUI.setText(to('name=user_defined4'), 'udf4 data Hello')
WebUI.setText(to('name=user_defined5'), 'udf5 data Hello')
WebUI.setText(to('name=user_defined6'), 'udf6 data Hello')
WebUI.setText(to('name=user_defined7'), 'udf7 data Hello')
WebUI.setText(to('name=user_defined8'), 'udf8 data Hello')
WebUI.setText(to('name=user_defined9'), 'udf9 data Hello')
WebUI.setText(to('name=user_defined10'), 'udf10 data Hello')
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
WebUI.click(to('name=paymentMethod'))
WebUI.click(to('css=input[type="submit"]'))
WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
//softAssertion.assertEquals("--Select One-- Armed Forces Americas Armed Forces Europe Armed Forces Canada Armed Forces Africa Armed Forces Middle East Armed Forces Pacific Alabama Alaska American Samoa Arizona Arkansas California Colorado Connecticut Delaware District of Columbia Federated States of Micronesia Florida Georgia Guam Hawaii Idaho Illinois Indiana Iowa Kansas Kentucky Louisiana Maine Maryland Massachusetts Michigan Minnesota Mississippi Missouri Montana Nebraska Nevada New Hampshire New Jersey New Mexico New York North Carolina North Dakota Northern Mariana Islands Ohio Oklahoma Oregon Palau Pennsylvania Puerto Rico Rhode Island South Carolina South Dakota Tennessee Texas Utah Vermont Virgin Islands Virginia Washington West Virginia Wisconsin Wyoming Marshall Island", selenium.getText("id=billingState-select"))


WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_BWP/stateDropDown'), '--Select One--', false, 10)
WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_BWP/stateDropDown'), 'Florida', false, 10)
WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_BWP/stateDropDown'), 'District of Columbia', false, 10)
WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_BWP/stateDropDown'), 'Maryland', false, 10)
WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_BWP/stateDropDown'), 'New Hampshire', false, 10)
WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_BWP/stateDropDown'), 'South Carolina', false, 10)
WebUI.verifyOptionPresentByLabel(findTestObject('Object Repository/Page_BWP/stateDropDown'), 'Virginia', false, 10)



