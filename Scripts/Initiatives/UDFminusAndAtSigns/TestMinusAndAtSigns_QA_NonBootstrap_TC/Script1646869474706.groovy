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



def signsToUse = ["-1","-abc","@123","@abc","!123","!abc","#123","#abc","\$123","\$abc","%123","%abc","^123","^abc","&123","&abc",
	"*123","*abc","(123","(abc",")123",")abc","_123","_abc","+123","+abc","=123","=abc","{123","{abc","}123","}abc","[123","[abc","]123","]abc",
	"|123","|abc","\123","\\abc","/123","/abc",]
def listSize = signsToUse.size()
println listSize

for (def i = 0; i < listSize; i++)
	{


WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.velocitypayment.com/admin/imtiaz')


WebUI.maximizeWindow()


WebUI.setText(findTestObject('Object Repository/Page_TestMinusAndAtSigns/input_Username_user'), 'iahmed')

WebUI.setText(findTestObject('Object Repository/Page_TestMinusAndAtSigns/input_Password_password'), 'hello2222')

WebUI.click(findTestObject('Object Repository/Page_TestMinusAndAtSigns/input_Password_button2'))

WebUI.click(findTestObject('Object Repository/Page_TestMinusAndAtSigns/a_Access CC Test'))

WebUI.click(findTestObject('Object Repository/Page_TestMinusAndAtSigns/a_Authorization  Capture (Sale) - Keyboard Entry'))

WebUI.setText(findTestObject('Object Repository/Page_TestMinusAndAtSigns/input__cardName'), 'imtiaz ahmed')

WebUI.setText(findTestObject('Object Repository/Page_TestMinusAndAtSigns/input__address'), '2311 york road')

WebUI.setText(findTestObject('Object Repository/Page_TestMinusAndAtSigns/input__zip'), '22201')

WebUI.setText(findTestObject('Object Repository/Page_TestMinusAndAtSigns/input__password_cardNumber'), '4111111111111111')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TestMinusAndAtSigns/select_MMyear01year02year03year04year05year_e9f300'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TestMinusAndAtSigns/select_YYYY20222023202420252026202720282029_2f3e62'), 
    '2024', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TestMinusAndAtSigns/select_Select One         Retail Transactio_463d5f'), 
    'MOTO', true)

WebUI.setText(findTestObject('Object Repository/Page_TestMinusAndAtSigns/input__amount'), '10.00')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TestMinusAndAtSigns/select_Select One.-10203'), 'groupItem223', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_TestMinusAndAtSigns/input_Any label 2_userDefined2'), signsToUse[i])

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_TestMinusAndAtSigns/select_Select One.-10203_1'), 'groupItem224', 
    true)

WebUI.click(findTestObject('Object Repository/Page_TestMinusAndAtSigns/input_State of Regional Hub  Operation_submit'))

WebUI.verifyTextPresent('Transaction Successful',true)


//WebUI.verifyTextPresent('For security reasons',true)
//WebUI.verifyTextPresent('cannot exist in your input value. Please click on your browser back button to retry.',true)

WebUI.closeBrowser()

	}

