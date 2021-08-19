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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


for (def i=1;i<10;i++){
	

WebUI.openBrowser('https://demo.velocitypayment.com/admin/mdccu/vpos/3444/transactions/')

WebUI.maximizeWindow()



WebUI.setText(findTestObject('Object Repository/Misc/Login_Page/Login_Username'), 'iahmed')

WebUI.setText(findTestObject('Object Repository/Misc/Login_Page/Login_Password'), 'hello2222')

WebUI.click(findTestObject('Object Repository/Misc/Login_Page/Login_Submit'))

WebUI.click(findTestObject('Object Repository/Misc/Page_V-POS - Transactions Menu/a_Ingenico EMVSwipe'))

//WebUI.navigateToUrl('https://demo.velocitypayment.com/admin/mdccu/vpos/3444/emvtransactions/AuthCapAutoForm/')

WebUI.setText(findTestObject('Object Repository/Misc/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__amount'), 
    '1.00')

WebUI.setText(findTestObject('Object Repository/Misc/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__userDefined1'), 
    '12')

WebUI.setText(findTestObject('Object Repository/Misc/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__userDefined2'), 
    '123')

WebUI.setText(findTestObject('Object Repository/Misc/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__userDefined3'), 
    'test')

WebUI.click(findTestObject('Object Repository/Misc/Page_V-POS - Credit Card Authorization  Cap_44e99e/input__submit'))

Thread.sleep(10000)

WebUI.click(findTestObject('Object Repository/Misc/Page_V-POS - Credit Card Authorization  Cap_44e99e/input_Transaction Submitted Waiting on Cust_20c7e5'))



WebUI.click(findTestObject('Object Repository/Misc/Page_V-POS - Transactions Menu/div_Application BaltimorevPOSIssue Transact_a9d125'))

WebUI.closeBrowser()
}
