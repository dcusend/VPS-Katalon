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

WebUI.navigateToUrl('https://qa.velocitypayment.com/client/rad/index.html')

WebUI.selectOptionByValue(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/select_Select    Estimated Tax    Personal _7587a1'), 
    '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/select_SelectAlcohol TaxBay Restoration Fun_1d1c37'), 
    '550', true)

WebUI.click(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/div_Tax TypeFiling Year      Select    Esti_e6768c'))

WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_ReEnterFEIN'), 'RigbBhfdqODKcAsiUrg+1Q==')

