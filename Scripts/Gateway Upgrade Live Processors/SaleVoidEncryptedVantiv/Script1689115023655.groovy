import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

String baseUrl = 'https://dev-algorithm.govolution.com/vlinktest/'
int pageLoadTimeoutSeconds = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getDefaultPageLoadTimeoutSeconds'()

def parseReceipt = { String t ->
    String remID = ''
    String tranID = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.extractTranId'(t)
    if (t && t.length() >= 55) {
        remID = t.substring(5, 35).trim(); String s = t.substring(35, 55).trim(); if (s) tranID = s
    }
    [remID: remID, tranID: tranID]
}

Map<String, String> saleFields = [
    'name=transaction_type':'104','name=message_version':'2.0C','name=application_id':'3576','name=username':'username','name=password':'password',
    'name=transaction_id':'','name=approval_code':'','name=card_name':'','name=card_address':'200 14th street','name=card_address2':'','name=card_city':'Arlington',
    'name=card_state':'VA','name=card_zip':'22201','name=country_id':'','name=amount':'0.11','name=card_number':'','name=card_exmo':'','name=card_exyr':'',
    'name=cvv_data':'','name=cvv_state':'','name=track_data':'','name=track_1_data':'','name=track_2_data':'','name=entry_mode':'track','name=email':'','name=order_number':'',
    'name=tax_amount':'','name=charge_description':'','name=client_account_number':'','name=bill_payment_indicator':'','name=user_defined1':'','name=user_defined2':'','name=user_defined3':'',
    'name=user_defined4':'','name=user_defined5':'','name=user_defined6':'','name=user_defined7':'','name=user_defined8':'','name=user_defined9':'','name=user_defined10':'',
    'name=encrypted_track_1_data':'8BF482856A5A01C17C69392DCE283CDC0D64733AEBE806151EA697F4091A17B82A0D851B67CF345D',
    'name=encrypted_track_2_data':'','name=slot_number':'1','name=ksn':'FFFF7381390003600107'
]
Map<String, String> voidFields = [
    'name=transaction_type':'106','name=message_version':'2.0C','name=application_id':'3576','name=username':'username','name=password':'password',
    'name=response_format':'fixed_width','name=original_transaction_type':'104','name=track_data':'','name=track_1_data':'','name=track_2_data':'','name=tax_amount':'','name=client_account_number':''
]

CustomKeywords.'customClasses.LegacyVLinkScriptUtils.openVLinkBrowser'()
try {
    WebUI.navigateToUrl(baseUrl + 'Upgrade/version_2_0/SaleWWWEncrypted.htm')
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.fillFields'(saleFields)
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="button"]')
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="submit"]')
    WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
    if (!WebUI.verifyTextPresent('Transaction approved, no errors', false, FailureHandling.OPTIONAL)) return

    def sale = parseReceipt(CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getTextByLocator'('css=pre'))
    GlobalVariable.VLinkSaleRemID = sale.remID
    GlobalVariable.VLinkSaleTranxID = sale.tranID

    WebUI.navigateToUrl(baseUrl + 'Upgrade/version_2_0/CC_void.html')
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.fillFields'(voidFields + ['name=remittance_id': sale.remID, 'name=transaction_id': sale.tranID])
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="submit"]')
    WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
    WebUI.verifyTextPresent('Transaction approved, no errors', false)
} finally {
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.closeVLinkBrowser'()
}