import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://payments2.deluxe.com/gateway/login')

WebUI.setText(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/input_Email or Username_username'), 't465179@deluxe.com')

WebUI.setEncryptedText(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/input_Password_password'), 'fR2LgvVWgCT51+b957yjUw==')

WebUI.click(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/input_Remember me_okta-signin-submit'))

WebUI.click(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/span_Take a Payment (1)'))

WebUI.click(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/div_Search Merchant (1)'))

//WebUI.setText(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/input_Sale_ngx-select__search form-control _b49add'), 
    //'QA Fee Test (6280888815760052)')

WebUI.setText(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/input_Sale_ngx-select__search form-control _b49add'),'QA Fee Test')

WebUI.sendKeys(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/input_Sale_ngx-select__search form-control _b49add'),Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/div_Search Merchant (1)'))

//WebUI.setText(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/input_Sale_ngx-select__search form-control _b49add'), 
//    'QA Fee Test')



//WebUI.click(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/span_QA Fee Test (6280888815760052)'))

WebUI.setText(findTestObject('Object Repository/DPP/Page_DPPTakeAPaymentSale/input_Total'),'1.50')

//WebUI.closeBrowser()

