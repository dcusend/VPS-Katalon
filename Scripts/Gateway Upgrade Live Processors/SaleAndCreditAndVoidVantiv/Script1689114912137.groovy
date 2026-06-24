import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

def cc_Number = GlobalVariable.cc_Number
def expMo = GlobalVariable.expMo
def expYear = GlobalVariable.expYear
String baseUrl = 'https://dev-algorithm.govolution.com/vlinktest/'
int pageLoadTimeoutSeconds = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getDefaultPageLoadTimeoutSeconds'()

def parseReceipt = { String receiptText, String fallbackRemId ->
    String remID = fallbackRemId
    String tranID = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.extractTranId'(receiptText)
    if (receiptText && receiptText.length() >= 55) {
        remID = receiptText.substring(5, 35).trim()
        String slicedTranId = receiptText.substring(35, 55).trim()
        if (slicedTranId) tranID = slicedTranId
    }
    [remID: remID, tranID: tranID]
}

Map<String, String> saleFields = [
    'name=transaction_type':'104','name=message_version':'2.0C','name=application_id':'3576','name=username':'username','name=password':'password',
    'name=response_format':'fixed_width','name=category':'ECOM','name=transaction_id':'','name=approval_code':'','name=card_name':'James Smithy',
    'name=card_address':'2000 14th street N','name=card_address2':'Suite 600','name=card_city':'Arlington','name=card_state':'VA','name=card_zip':'22201',
    'name=country_id':'840','name=amount':'0.14','name=card_number':cc_Number,'name=card_exmo':expMo,'name=card_exyr':expYear,'name=cvv_data':'','name=cvv_state':'',
    'name=track_data':'','name=track_1_data':'','name=track_2_data':'','name=entry_mode':'manual','name=email':'','name=order_number':'','name=tax_amount':'',
    'name=charge_description':'','name=client_account_number':'852852','name=bill_payment_indicator':'','name=user_defined1':'udf1','name=user_defined2':'udf2',
    'name=user_defined3':'udf3','name=user_defined4':'udf4','name=user_defined5':'udf5','name=user_defined6':'udf6','name=user_defined7':'udf7',
    'name=user_defined8':'udf8','name=user_defined9':'udf9','name=user_defined10':'udf10'
]
Map<String, String> creditFields = [
    'name=transaction_type':'103','name=message_version':'2.0C','name=application_id':'3576','name=username':'username','name=password':'password',
    'name=response_format':'fixed_width','name=amount':'0.14','name=order_number':'','name=tax_amount':'','name=charge_description':'',
    'name=card_number':'','name=card_exmo':'','name=card_exyr':'','name=track_data':'','name=track_1_data':'','name=track_2_data':'','name=category':'ECOM','name=client_account_number':''
]
Map<String, String> voidFields = [
    'name=transaction_type':'106','name=message_version':'2.0C','name=application_id':'3576','name=username':'username','name=password':'password',
    'name=response_format':'fixed_width','name=original_transaction_type':'103','name=track_data':'','name=track_1_data':'','name=track_2_data':'','name=tax_amount':'','name=client_account_number':''
]

CustomKeywords.'customClasses.LegacyVLinkScriptUtils.openVLinkBrowser'()
try {
    String remSeed = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
    WebUI.navigateToUrl(baseUrl + 'Upgrade/version_2_0/authcap.html')
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.fillFields'(saleFields + ['name=remittance_id': remSeed])
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="submit"]')
    WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
    if (!WebUI.verifyTextPresent('Transaction approved, no errors', false, FailureHandling.OPTIONAL)) return

    def sale = parseReceipt(CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getTextByLocator'('css=pre'), remSeed)
    WebUI.navigateToUrl(baseUrl + 'Upgrade/version_2_0/CC_credit.html')
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.fillFields'(creditFields + ['name=remittance_id': sale.remID, 'name=transaction_id': sale.tranID])
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="submit"]')
    WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
    if (!WebUI.verifyTextPresent('Transaction approved, no errors', false, FailureHandling.OPTIONAL)) return

    def credit = parseReceipt(CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getTextByLocator'('css=pre'), sale.remID)
    WebUI.navigateToUrl(baseUrl + 'Upgrade/version_2_0/CC_void.html')
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.fillFields'(voidFields + ['name=remittance_id': credit.remID, 'name=transaction_id': credit.tranID])
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="submit"]')
    WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
    WebUI.verifyTextPresent('Transaction approved, no errors', false)
} finally {
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.closeVLinkBrowser'()
}