import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'customClasses.LegacyVLinkScriptUtils.openVLinkBrowser'()
int pageLoadTimeoutSeconds = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getDefaultPageLoadTimeoutSeconds'()

Map<String, String> fields = [
	'name=transaction_type': '104',
	'name=message_version': '2.0C',
	'name=application_id': '234',
	'name=username': 'username',
	'name=password': 'password',
	'name=response_format': 'fixed_width',
	'name=category': 'RETL',
	'name=transaction_id': '',
	'name=approval_code': '',
	'name=card_name': '',
	'name=card_address': '2311 york road',
	'name=card_address2': '',
	'name=card_city': 'Arlington',
	'name=card_state': 'VA',
	'name=card_zip': '22201',
	'name=country_id': '',
	'name=amount': '9.00',
	'name=card_number': '',
	'name=card_exmo': '',
	'name=card_exyr': '',
	'name=cvv_data': '',
	'name=cvv_state': '',
	'name=track_data': '',
	'name=track_1_data': '',
	'name=track_2_data': '',
	'name=entry_mode': 'track',
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
	'name=encrypted_track_1_data': '8CC5F2E7D8E5F1B8B3D7E884E119C94C968815CAD2DFD5FC9E6C5A470F98215174A2FC6703FF121CABA8263000A6E77B2C64A319A559F013554E12A5FA8122E7DC5F398937E52B55425F08DCB1C73C9CE2DB0C5F4E322B5B9C7A39E8C6765E96',
	'name=encrypted_track_2_data': '',
	'name=slot_number': '11',
	'name=ksn': 'FFFF862134D00140005A'
]

try {
	int ran1 = Math.round(Math.random() * 99999) as int
	int ran2 = Math.round(Math.random() * 999) as int
	int ran3 = Math.round(Math.random() * 9999) as int
	String remittanceId = "${ran1}|${ran2}|${ran3}"
	println(remittanceId)

	WebUI.navigateToUrl('https://dev-algorithm.govolution.com/vlinktest/QA/version_2_0/vlinkEncryptedSwipe.html')
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.fillFields'(fields + ['name=remittance_id': remittanceId])
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="submit"]')

	WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
	WebUI.verifyTextPresent('Transaction approved, no errors', false)
	String resText = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getTextByLocator'('css=pre')
	println(resText)
	String tranID = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.extractTranId'(resText)
	println(tranID)
} finally {
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.closeVLinkBrowser'()
}