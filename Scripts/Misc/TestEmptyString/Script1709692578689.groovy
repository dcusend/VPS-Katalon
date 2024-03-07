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

/*
 * def value = "ffr"
 * 
 * if (value?.trim()) { println "String is not empty" } else { println
 * "String is empty" }
 */



WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.RADurl)

String orPath_Landing = "Object Repository/RAD_Pages/Landing_Page"
String orPath_TaxTypeFilingYear = "Object Repository/RAD_Pages/TaxTypeFilingYear_Page"
String orPath_TaxPayer = "Object Repository/RAD_Pages/Taxpayer_Page"
String orPath_AddressContact = "Object Repository/RAD_Pages/AddressAndContactInfo_Page"
String orPath_FilingStatus = "Object Repository/RAD_Pages/FilingStatus_Page"
String orPath_Amount = "Object Repository/RAD_Pages/PaymentAmount_Page"
String orPath_TaxInfo = "Object Repository/RAD_Pages/TaxInfo_Page"




// Select Estimated Tax from the Main Index Page
		WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'), "New Tax Return Amount Due", false)

		
// Select Fiduciary Tax from the Payment Type dropwown
		//WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_TaxType_ExistingLiability'),'Fiduciary Tax',false)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/RAD_Pages/Landing_Page/select_NewTaxReturnAmountDue_TaxType'),'Bay Restoration Fee',false)
		

	//	WebUI.verifyOptionNotPresentByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PeriodEnding'), 'January', true,20)
		
		
		//  String js = 'return document.querySelector("#salesUseMonth").class.toString();' 
		//  String  classes = WebUI.executeJavaScript(js, null); 
		//  println classes
		 
		  
		 // String jsa = 'return document.querySelectorAll("#salesUseMonth").toString();'
		  //String  all = WebUI.executeJavaScript(jsa, null);
		  //println all
		
		
	def attribute = WebUI.getAttribute(findTestObject('Object Repository/RAD_Pages/TaxTypeFilingYear_Page/select_PeriodEnding'), 'outerHTML')
		println "attribute: " + attribute
		
		
		if (attribute.contains('<option value="01" class="hideMonth">January</option>'))
		{
			println "hooray"
		}
		
		
		
	//	def jhund = result = WebUI.getText(findTestObject('Object Repository/RAD_Pages/TaxTypeFilingYear_Page/select_PeriodEnding'))
		//println "jhund: " + jhund
		
		
		
		
		