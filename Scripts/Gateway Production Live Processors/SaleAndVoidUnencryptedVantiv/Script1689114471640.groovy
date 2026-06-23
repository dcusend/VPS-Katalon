import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling

String baseUrl = 'https://dev-algorithm.govolution.com/vlinktest/'
int pageLoadTimeoutSeconds = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getDefaultPageLoadTimeoutSeconds'()

Map<String, String> saleFields = [
	'name=transaction_type': '104',
	'name=message_version': '2.0C',
	'name=application_id': '3576',
	'name=username': 'username',
	'name=password': 'password',
	'name=response_format': 'fixed_width',
	'name=category': 'RETL',
	'name=transaction_id': '',
	'name=approval_code': '',
	'name=card_name': 'James Smith',
	'name=card_address': '2000 14th Street N',
	'name=card_address2': 'Suite 600',
	'name=card_city': 'Arlington',
	'name=card_state': 'VA',
	'name=card_zip': '22201',
	'name=country_id': '840',
	'name=amount': '0.12',
	'name=card_number': '',
	'name=card_exmo': '',
	'name=card_exyr': '',
	'name=cvv_data': '',
	'name=cvv_state': '',
	'name=track_data': '%B5291158864584555^AHMED/IMTIAZ ^2803201000000000023241992904000?;5291158864584555=280320123241992904?',
	'name=track_1_data': '',
	'name=track_2_data': '',
	'name=entry_mode': 'track',
	'name=email': '',
	'name=order_number': '',
	'name=tax_amount': '6.57',
	'name=charge_description': '',
	'name=client_account_number': '852852',
	'name=bill_payment_indicator': '',
	'name=user_defined1': 'udf1',
	'name=user_defined2': 'udf2',
	'name=user_defined3': 'udf3',
	'name=user_defined4': 'udf4',
	'name=user_defined5': 'udf5',
	'name=user_defined6': 'udf6',
	'name=user_defined7': 'udf7',
	'name=user_defined8': 'udf8',
	'name=user_defined9': 'udf9',
	'name=user_defined10': 'udf10'
]

Map<String, String> voidFields = [
	'name=transaction_type': '106',
	'name=message_version': '2.0C',
	'name=application_id': '3576',
	'name=username': 'username',
	'name=password': 'password',
	'name=response_format': 'fixed_width',
	'name=original_transaction_type': '104',
	'name=track_data': '',
	'name=track_1_data': '',
	'name=track_2_data': '',
	'name=tax_amount': '',
	'name=client_account_number': ''
]

def parseReceipt = { String receiptText, String fallbackRemId ->
	String remID = fallbackRemId
	String tranID = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.extractTranId'(receiptText)
	if (receiptText && receiptText.length() >= 55) {
		remID = receiptText.substring(5, 35).trim()
		String slicedTranId = receiptText.substring(35, 55).trim()
		if (slicedTranId) {
			tranID = slicedTranId
		}
	}
	[remID: remID, tranID: tranID]
}

CustomKeywords.'customClasses.LegacyVLinkScriptUtils.openVLinkBrowser'()

try {
	println('Begin SaleAndVoidUnencryptedVantiv')
	String genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)

	WebUI.navigateToUrl(baseUrl + 'Production/version_2_0/authcap.html')
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.fillFields'(saleFields + ['name=remittance_id': genRemID])
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="submit"]')
	WebUI.waitForPageLoad(pageLoadTimeoutSeconds)

	boolean saleApproved = WebUI.verifyTextPresent('Transaction approved, no errors', false, FailureHandling.OPTIONAL)
	if (!saleApproved) {
		println('Sale transaction failed, cannot void')
		return
	}

	String saleText = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getTextByLocator'('css=pre')
	def saleReceipt = parseReceipt(saleText, genRemID)

	WebUI.navigateToUrl(baseUrl + 'Production/version_2_0/CC_void.html')
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.fillFields'(voidFields + [
		'name=remittance_id': saleReceipt.remID,
		'name=transaction_id': saleReceipt.tranID
	])
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="submit"]')
	WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
	WebUI.verifyTextPresent('Transaction approved, no errors', false)
} finally {
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.closeVLinkBrowser'()
}

