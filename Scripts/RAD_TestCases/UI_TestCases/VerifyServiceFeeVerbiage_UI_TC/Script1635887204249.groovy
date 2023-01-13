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

import com.kms.katalon.core.configuration.RunConfiguration as RC


def taxTypeDropList = ["Estimated Tax","Personal Income Tax","Extension Payments","Existing Liability","Sales and Use","Withholding Tax"]
def listSize = taxTypeDropList.size()
println listSize

def executionProfile = RC.getExecutionProfile()

for (def i = 0; i < listSize; i++)
{

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.RADurl)

String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
String orPath = "Object Repository/RAD_Pages/Landing_Page"
String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"

WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'),taxTypeDropList[i] , false)

WebUI.delay(1)

WebUI.setText(findTestObject(orPath_Amount + '/input__paymentAmount'),"")

WebUI.click(findTestObject(orPath_Landing + '/a_Click here for details'))

//Old CF Verbiage
//String cfVerbiage = "This electronic government service includes a 2.45% service/convenience fee for payments processed through this application. This fee is assessed by Govolution LLC, Maryland's eGovernment service provider, a third party working under a contract administered by the Maryland Department of Information Technology (DoIT). The service fee is used to develop, maintain, and expand the online service offerings of the state and is non-refundable. Accepted credit cards include Visa, MasterCard, Discover and American Express."


// New CF Verbiage
String cfVerbiageQA = "This electronic government service includes a 2.45% service/convenience fee, with a \$1.00 minimum, for payments processed through this application. This fee is assessed by Govolution, LLC and will post as a separate transaction. Accepted credit cards include Visa, Mastercard, and Discover."

//WebUI.verifyElementText(findTestObject(orPath_Landing + '/div_ServiceFeesVerbiage'), cfVerbiageQA)

String cfVerbiageDemo = "This electronic government service includes a 2.45% service/convenience fee, with a \$1.00 minimum, for payments processed through this application. This fee is assessed by Govolution, LLC and will post as a separate transaction. Accepted credit cards include Visa, MasterCard, and Discover."


switch(executionProfile)
{
	case "QAProfile":
			 WebUI.verifyElementText(findTestObject(orPath_Landing + '/div_ServiceFeesVerbiage'), cfVerbiageQA)
	break
	
	case "DemoProfile":
			WebUI.verifyElementText(findTestObject(orPath_Landing + '/div_ServiceFeesVerbiage'), cfVerbiageDemo)
	break
	
//	case "Production":
			
//	break
	
//	case "Upgrade":
//			appName = findTestData(dataFile).getValue('AppNameProd', row)
//			appID = findTestData(dataFile).getValue('AppIDProd', row)
//	break
}





WebUI.verifyElementPresent(findTestObject(orPath_Landing + '/button_Close'), 30)

WebUI.click(findTestObject(orPath_Landing + '/button_Close'))



}