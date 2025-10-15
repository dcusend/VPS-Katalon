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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

//def taxTypeDropList = ["Quarterly Estimated Tax","Extension Payments","Existing Liability w/Notice Number","New Tax Return Amount Due"]

// Changes for removing Extension payments December 2023
def taxTypeDropList = ["Quarterly Estimated Tax","Existing Liability with Notice/Invoice Number","New Tax Return Amount Due","Extension Payments"]
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

//WebUI.scrollToElement(findTestObject(orPath_Amount + '/input__paymentAmount'), 3)

//WebUI.executeJavaScript('window.scrollTo(0, document.body.scrollHeight);', null)


if (WebUI.verifyElementPresent(findTestObject(orPath_Amount + '/input__paymentAmount'), 30))
	{
		WebUI.setText(findTestObject(orPath_Amount + '/input__paymentAmount'),"1.00")
		System.out.println('Amount textbox found on the page the page')
	}
else
	{
		System.out.println('Unable to Scroll to the bottom of the page')
		KeywordUtil.markWarning("Unable to Scroll to the bottom of the page")
	}

	WebUI.delay(5)

	if (WebUI.verifyElementPresent(findTestObject(orPath_Landing + '/a_Click here for details'), 30))
		{
			WebUI.click(findTestObject(orPath_Landing + '/a_Click here for details'))
			System.out.println('Click Here for Details link was found on the page the page')
		}
	else
		{
			System.out.println('Click Here for Details link was NOT found on the page the page')
			KeywordUtil.markWarning("Click Here for Details link was NOT found on the page the page")
		}



//WebUI.scrollToElement(findTestObject(orPath_Landing + '/a_Click here for details'), 3)

//WebUI.executeJavaScript('window.scrollTo(0, document.body.scrollHeight);', null)

//WebUI.click(findTestObject(orPath_Landing + '/a_Click here for details'))

WebUI.delay(2)

//Old CF Verbiage
//String cfVerbiage = "This electronic government service includes a 2.45% service/convenience fee for payments processed through this application. This fee is assessed by Govolution LLC, Maryland's eGovernment service provider, a third party working under a contract administered by the Maryland Department of Information Technology (DoIT). The service fee is used to develop, maintain, and expand the online service offerings of the state and is non-refundable. Accepted credit cards include Visa, MasterCard, Discover and American Express."


// New CF Verbiage
//String cfVerbiageQA = "This electronic government service includes a 2.45% service/convenience fee, with a \$1.00 minimum, for payments processed through this application. This fee is assessed by Govolution, LLC and will post as a separate transaction. Accepted credit cards include Visa, Mastercard, and Discover."

//WebUI.verifyElementText(findTestObject(orPath_Landing + '/div_ServiceFeesVerbiage'), cfVerbiageQA)

//String cfVerbiageDemo = "This electronic government service includes a 2.45% service/convenience fee, with a \$1.00 minimum, for payments processed through this application. This fee is assessed by Govolution, LLC and will post as a separate transaction. Accepted credit cards include Visa, Mastercard, and Discover."


// Added 10/03/2025 as part of new changes

String cfVerbiageQA = "This electronic government service includes a 2.45% service/convenience fee, with a \$1.00 minimum, for payments processed with a credit card through this application. Accepted credit cards include Visa, Mastercard, and Discover. Payments processed with an electronic check will not be assessed a service/convenience fee. Any fee is assessed by Govolution, LLC and will post as a separate transaction."
String cfVerbiageDemo = "This electronic government service includes a 2.45% service/convenience fee, with a \$1.00 minimum, for payments processed with a credit card through this application. Accepted credit cards include Visa, Mastercard, and Discover. Payments processed with an electronic check will not be assessed a service/convenience fee. Any fee is assessed by Govolution, LLC and will post as a separate transaction."
String cfVerbiageUpgrade = "This electronic government service includes a 2.45% service/convenience fee, with a \$1.00 minimum, for payments processed with a credit card through this application. Accepted credit cards include Visa, Mastercard, and Discover. Payments processed with an electronic check will not be assessed a service/convenience fee. Any fee is assessed by Govolution, LLC and will post as a separate transaction."
String cfVerbiageProd = "This electronic government service includes a 2.45% service/convenience fee, with a \$1.00 minimum, for payments processed with a credit card through this application. Accepted credit cards include Visa, Mastercard, and Discover. Payments processed with an electronic check will not be assessed a service/convenience fee. Any fee is assessed by Govolution, LLC and will post as a separate transaction."




switch(executionProfile)
{
	case "QAProfile":
			 WebUI.verifyElementText(findTestObject(orPath_Landing + '/div_ServiceFeesVerbiage'), cfVerbiageQA)
	break
	
	case "QA2Profile":
			WebUI.verifyElementText(findTestObject(orPath_Landing + '/div_ServiceFeesVerbiage'), cfVerbiageQA)
	break
	
	case "DemoProfile":
			WebUI.verifyElementText(findTestObject(orPath_Landing + '/div_ServiceFeesVerbiage'), cfVerbiageDemo)
	break
	
	case "Production":
			WebUI.verifyElementText(findTestObject(orPath_Landing + '/div_ServiceFeesVerbiage'), cfVerbiageProd)
	break
	
	case "Upgrade":
			WebUI.verifyElementText(findTestObject(orPath_Landing + '/div_ServiceFeesVerbiage'), cfVerbiageUpgrade)
	break
}





WebUI.verifyElementPresent(findTestObject(orPath_Landing + '/button_Close'), 30)

WebUI.click(findTestObject(orPath_Landing + '/button_Close'))



}