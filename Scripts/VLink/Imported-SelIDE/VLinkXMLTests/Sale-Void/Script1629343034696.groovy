import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

CustomKeywords.'customClasses.LegacyVLinkScriptUtils.openVLinkBrowser'()
int pageLoadTimeoutSeconds = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getDefaultPageLoadTimeoutSeconds'()

Map<String, String> authFields = [
	'name=transaction_type': "${tranType}",
	'name=message_version': "${msgVer}",
	'name=application_id': "${appID}",
	'name=username': "${userName}",
	'name=password': "${password}",
	'name=response_format': "${responseFormat}",
	'name=category': "${category}",
	'name=transaction_id': "${tranID}",
	'name=approval_code': "${apprCode}",
	'name=card_name': "${name}",
	'name=card_address': "${al1}",
	'name=card_address2': "${al2}",
	'name=card_city': "${city}",
	'name=card_state': "${state}",
	'name=card_zip': "${zip}",
	'name=country_id': "${country}",
	'name=amount': "${amount}",
	'name=card_number': "${cardnumber}",
	'name=card_exmo': "${month}",
	'name=card_exyr': "${year}",
	'name=cvv_data': "${cvv}",
	'name=cvv_state': "${cvvState}",
	'name=track_data': "${trackData}",
	'name=track_1_data': "${track1Data}",
	'name=track_2_data': "${track2Data}",
	'name=entry_mode': "${entryMode}",
	'name=email': "${email}",
	'name=order_number': "${orderNum}",
	'name=tax_amount': "${tax}",
	'name=charge_description': "${charge}",
	'name=client_account_number': "${CAN}",
	'name=bill_payment_indicator': "${BillPayInd}",
	'name=user_defined1': "${udf1}",
	'name=user_defined2': "${udf2}",
	'name=user_defined3': "${udf3}",
	'name=user_defined4': "${udf4}",
	'name=user_defined5': "${udf5}",
	'name=user_defined6': "${udf6}",
	'name=user_defined7': "${udf7}",
	'name=user_defined8': "${udf8}",
	'name=user_defined9': "${udf9}",
	'name=user_defined10': "${udf10}"
]

Map<String, String> voidFields = [
	'name=transaction_type': "${tTypeVoid}",
	'name=message_version': "${mvVoid}",
	'name=application_id': "${appIDVoid}",
	'name=username': "${userVoid}",
	'name=password': "${pwdVoid}",
	'name=response_format': "${resFormVoid}",
	'name=original_transaction_type': "${origtTypeVoid}",
	'name=track_data': "${trackDataVoid}",
	'name=track_1_data': "${track1DataVoid}",
	'name=track_2_data': "${track2DataVoid}",
	'name=tax_amount': "${taxVoid}",
	'name=client_account_number': "${CANVoid}"
]

try {
	println("Begin Record Number: ${rn}")
	String remID = System.currentTimeMillis().toString()

	WebUI.navigateToUrl('https://dev-algorithm.govolution.com/vlinktest/QA/version_2_0/authcap.html')
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.fillFields'(authFields + ['name=remittance_id': remID])
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="submit"]')
	WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
	WebUI.verifyTextPresent("${expText}", false)
	String resText = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getTextByLocator'('css=pre')
	println(resText)
	String resolvedTranID = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.extractTranIdWithLegacySlice'(resText)
	WebUI.verifyMatch(resolvedTranID, '\\d+', true)
	println(resolvedTranID)

	String remIDVoid = System.currentTimeMillis().toString()
	WebUI.navigateToUrl('https://dev-algorithm.govolution.com/vlinktest/QA/version_2_0/CC_void.html')
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.fillFields'(voidFields + ['name=remittance_id': remIDVoid, 'name=transaction_id': resolvedTranID])
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="submit"]')
	WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
	WebUI.verifyTextPresent('Transaction approved, no errors', false)
	String resTextVoid = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getTextByLocator'('css=pre')
	println(resTextVoid)
	String tranIDVoid = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.extractTranIdWithLegacySlice'(resTextVoid)
	println(tranIDVoid)
	println("End Record Number: ${rn}")
} finally {
	CustomKeywords.'customClasses.LegacyVLinkScriptUtils.closeVLinkBrowser'()
}