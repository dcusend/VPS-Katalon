import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'customClasses.LegacyVLinkScriptUtils.openVLinkBrowser'()
int pageLoadTimeoutSeconds = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getDefaultPageLoadTimeoutSeconds'()

Map<String, String> fields = [
	'name=transaction_type': '104',
	'name=message_version': '2.0C',
	'name=application_id': '180',
	'name=username': 'hello',
	'name=password': 'world',
	'name=response_format': 'fixed_width',
	'name=category': 'ECOM',
	'name=transaction_id': '',
	'name=approval_code': '',
	'name=card_name': 'John Smith',
	'name=card_address': '2311 york road',
	'name=card_address2': '',
	'name=card_city': 'Arlington',
	'name=card_state': 'VA',
	'name=card_zip': '22201',
	'name=country_id': '',
	'name=amount': '10.00',
	'name=card_number': '4111111111111111',
	'name=card_exmo': '12',
	'name=card_exyr': '2029',
	'name=cvv_data': '',
	'name=cvv_state': '',
	'name=track_data': '',
	'name=track_1_data': '',
	'name=track_2_data': '',
	'name=entry_mode': 'manual',
	'name=email': '',
	'name=order_number': '',
	'name=tax_amount': '',
	'name=charge_description': '',
	'name=client_account_number': '',
	'name=bill_payment_indicator': '',
	'name=user_defined1': '',
	'name=user_defined2': '',
	'name=user_defined3': '',
	'name=user_defined4': '',
	'name=user_defined5': '',
	'name=user_defined6': '',
	'name=user_defined7': '',
	'name=user_defined8': '',
	'name=user_defined9': '',
	'name=user_defined10': ''
]

try {
	String genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)

	WebUI.navigateToUrl('https://dev-algorithm.govolution.com/vlinktest/QA/version_2_0/authcap.html')
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.fillFields'(fields + ['name=remittance_id': genRemID])
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="submit"]')
	WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
	WebUI.verifyTextPresent('Signon authentication error', false)
} finally {
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.closeVLinkBrowser'()
}
