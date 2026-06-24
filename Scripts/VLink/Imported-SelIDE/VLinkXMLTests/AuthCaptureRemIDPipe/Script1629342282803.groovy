import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'customClasses.LegacyVLinkScriptUtils.openVLinkBrowser'()
int pageLoadTimeoutSeconds = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getDefaultPageLoadTimeoutSeconds'()

Map<String, String> authFields = [
	'name=transaction_type': '100',
	'name=message_version': '2.0C',
	'name=application_id': '234',
	'name=username': 'username',
	'name=password': 'password',
	'name=response_format': 'fixed_width',
	'name=category': 'ECOM',
	'name=transaction_id': '',
	'name=approval_code': '',
	'name=card_name': 'Michael Slater',
	'name=card_address': '2000 14th street',
	'name=card_address2': '',
	'name=card_city': 'Arlington',
	'name=card_state': 'VA',
	'name=card_zip': '22201',
	'name=country_id': '',
	'name=amount': '7.50',
	'name=card_number': '4111111111111111',
	'name=card_exmo': '06',
	'name=card_exyr': '2029',
	'name=cvv_data': '',
	'name=cvv_state': '',
	'name=track_data': '',
	'name=track_1_data': '',
	'name=track_2_data': '',
	'name=entry_mode': '',
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
	'name=user_defined10': '',
	'name=card_on_file_indicator': '',
	'name=stored_credential_indicator': '',
	'name=cof_scheduled_indicator': '',
	'name=cof_transaction_init_indicator': ''
]

Map<String, String> captureFields = [
	'name=transaction_type': '102',
	'name=message_version': '2.0C',
	'name=application_id': '234',
	'name=username': 'username',
	'name=password': 'password',
	'name=response_format': 'fixed_width',
	'name=amount': '7.50',
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
	int ran1 = Math.round(Math.random() * 99999) as int
	int ran2 = Math.round(Math.random() * 999) as int
	int ran3 = Math.round(Math.random() * 9999) as int
	String remittanceId = "${ran1}|${ran2}|${ran3}"
	println(remittanceId)

	WebUI.navigateToUrl('https://dev-algorithm.govolution.com/vlinktest/QA/version_2_0/auth.html')
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.fillFields'(authFields + ['name=remittance_id': remittanceId])
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="submit"]')

	WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
	WebUI.delay(5)
	WebUI.verifyTextPresent('Transaction approved, no errors', false)
	String resText = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getTextByLocator'('css=pre')
	println(resText)
	String tranID = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.extractTranId'(resText)
	WebUI.verifyMatch(tranID, '\\d+', true)
	println(tranID)

	WebUI.navigateToUrl('https://dev-algorithm.govolution.com/vlinktest/QA/version_2_0/capture.html')
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.fillFields'(captureFields + ['name=remittance_id': remittanceId, 'name=transaction_id': tranID])
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="submit"]')

	WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
	WebUI.delay(5)
	WebUI.verifyTextPresent('Transaction approved, no errors', false)
	String resTextCap = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getTextByLocator'('css=pre')
	println(resTextCap)
	String tranIDCap = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.extractTranId'(resTextCap)
	println(tranIDCap)
} finally {
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.closeVLinkBrowser'()
}