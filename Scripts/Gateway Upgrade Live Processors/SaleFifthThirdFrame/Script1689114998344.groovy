import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

def cc_Number = GlobalVariable.cc_Number
def expMo = GlobalVariable.expMo
def expYear = GlobalVariable.expYear
String baseUrl = 'https://dev-algorithm.govolution.com/vlinktest/'
int pageLoadTimeoutSeconds = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getDefaultPageLoadTimeoutSeconds'()

Map<String, String> saleFields = [
    'name=transaction_type':'104','name=message_version':'2.0C','name=application_id':'2248','name=username':'username','name=password':'password',
    'name=response_format':'fixed_width','name=category':'ECOM','name=transaction_id':'','name=approval_code':'','name=card_name':'James Smith',
    'name=card_address':'2000 14th Street N','name=card_address2':'Suite 600','name=card_city':'Arlington','name=card_state':'VA','name=card_zip':'22201',
    'name=country_id':'840','name=amount':'0.11','name=card_number':cc_Number,'name=card_exmo':expMo,'name=card_exyr':expYear,
    'name=cvv_data':'','name=cvv_state':'','name=track_data':'','name=track_1_data':'','name=track_2_data':'','name=entry_mode':'manual','name=email':'',
    'name=order_number':'','name=tax_amount':'6.57','name=charge_description':'','name=client_account_number':'852852','name=bill_payment_indicator':'',
    'name=user_defined1':'udf1','name=user_defined2':'udf2','name=user_defined3':'udf3','name=user_defined4':'udf4','name=user_defined5':'udf5',
    'name=user_defined6':'udf6','name=user_defined7':'udf7','name=user_defined8':'udf8','name=user_defined9':'udf9','name=user_defined10':'udf10'
]

CustomKeywords.'customClasses.LegacyVLinkScriptUtils.openVLinkBrowser'()
try {
    String remSeed = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
    WebUI.navigateToUrl(baseUrl + 'Upgrade/version_2_0/authcap.html')
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.fillFields'(saleFields + ['name=remittance_id': remSeed])
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.clickByLocator'('css=input[type="submit"]')
    WebUI.waitForPageLoad(pageLoadTimeoutSeconds)
    String receiptText = CustomKeywords.'customClasses.LegacyVLinkScriptUtils.getTextByLocator'('css=pre')
    WebUI.verifyMatch(receiptText, '(?s).*Transaction failed.*', true)
    WebUI.verifyMatch(receiptText, '(?s).*105Processor reported error.*', true)
} finally {
    CustomKeywords.'customClasses.LegacyVLinkScriptUtils.closeVLinkBrowser'()
}