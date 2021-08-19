import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qa.velocitypayment.com/admin/imtiaz')

if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username'), 30)) {
    System.out.println('We are on Login Page, start populating the fields')

    WebUI.setText(findTestObject('Login_Page/Login_Username'), username)

    WebUI.setText(findTestObject('Login_Page/Login_Password'), password)

    WebUI.click(findTestObject('Login_Page/Login_Submit'))
} else {
    System.out.println('Not on the Login Page, exiting test')
}



/*//WebUI.click(findTestObject('Login_Page/Login_Logout'))

//WebUI.closeBrowser()
*/
