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


for (def i = 1; i < 5; i++) {

	System.out.println('Iteration Number : ' + i)
	
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.AdminSuiteURL)

if (WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Username'), 30)) {
	System.out.println('We are on Login Page, start populating the fields')

	WebUI.setText(findTestObject('Login_Page/Login_Username'), GlobalVariable.Username)

	WebUI.setText(findTestObject('Login_Page/Login_Password'), GlobalVariable.Password)

	WebUI.click(findTestObject('Login_Page/Login_Submit'))
	
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard/a_Logout'), 30))
				{
					System.out.println('Login was successful, Logging out now')
					
					WebUI.click(findTestObject('Object Repository/Dashboard/a_Logout'))
					
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Logout/a_here'), 30))
						{
							System.out.println('Logout was successful')
						}
					else
					{
						System.out.println('Logout was not successful')
					}	
					
				}
			else
			{
				System.out.println('Login was not successful')
			}
		
	
} else {
	System.out.println('Not on the Login Page, exiting test')
}

WebUI.closeBrowser()

}