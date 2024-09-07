import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI



for (def row = 1; row <= 1; row++)
	{


WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa2.velocitypayment.com/agency/config.do?action=editor&message_version=2_5')

//WebUI.selectOptionByValue(findTestObject('Object Repository/Misc/AutoPay/select_MV'),'2_7', true)
//WebUI.click(findTestObject('Object Repository/Misc/AutoPay/td_Amount'))
WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input_Amount_amount'), '10.00')

def genAutoPayCAN = org.apache.commons.lang.RandomStringUtils.random(12, true, true)

WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input_Client Account Number'), genAutoPayCAN)

WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input_Action Type_action_type'), 'Paynow')

WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Fname'),"FirstName")

WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lname'),"LName")

	WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL1'),"25 Main st")

		
	WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/ZIP'),"22201")

		WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Company'),"Twadi Company")

	WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Email'),"iahmed1@govolution.com")

WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_Parcel testing_submit'))

WebUI.navigateToUrl('https://dev-algorithm.govolution.com/vrelaytest/QA2/version_2_2/vrelaytest.html')

WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input_application_id_application_id'), '656')

WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input_message_version_message_version'), '2.5')

def genAutoPayRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)

WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input_remittance_id_remittance_id'), genAutoPayRemID)

WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_true_formSubmit'))


WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_Pay by Credit'))

WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_Pay by Corporate Check_payNowSubmit'))

WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input__cardNumber'), '4111111111111111')

WebUI.setText(findTestObject('Object Repository/Misc/AutoPay/input__spc'), '111')



WebUI.selectOptionByValue(findTestObject('Object Repository/Misc/AutoPay/select_MM'), '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Misc/AutoPay/select_YYYY'),'2029', true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Misc/AutoPay/select_UDFQuarter'),'Red', true)


String js = "document.getElementById('processDate').value = '12/04/2024'"
WebUI.executeJavaScript(js,null)




WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_Please check here to store the paymen_ae9779'))

WebUI.scrollToElement(findTestObject('Object Repository/Misc/AutoPay/input_ContinueOnPaymentEntry'), 3)

WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_ContinueOnPaymentEntry'))

//WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_true_formSubmit'))


WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_confirmNotifyAction'))

Thread.sleep(10000)

WebUI.verifyTextPresent(("Your payment plan has been successfully created"), false)

def payment_id_obj = WebUI.getText(findTestObject('Object Repository/Misc/AutoPay/div_PaymentPlanID')).toString()
//def payment_id = payment_id_obj.substring(17,23)
println("Payment Plan ID is :" + payment_id_obj)


WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_ViewScheduledPayment'))

WebUI.click(findTestObject('Object Repository/Misc/AutoPay/a_CancelPaymentPlan'))

WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_ConfirmCancelPlan'))

WebUI.click(findTestObject('Object Repository/Misc/AutoPay/input_x_mb_btn_ok'))

WebUI.verifyTextPresent(("Your payment plan has been successfully canceled"), false)

	}
//WebUI.closeBrowser()

