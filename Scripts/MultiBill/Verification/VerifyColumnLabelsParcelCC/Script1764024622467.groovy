import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.wsdl.Import

import com.github.fge.jsonschema.library.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.builtin.CallTestCaseKeyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.swing.factory.ComboBoxFactory
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory


def multibillURL=GlobalVariable.MultiBillNoCFURL


			
			WebUI.openBrowser(multibillURL)
			WebUI.maximizeWindow()
			
			//Assign search String
			
		searchString = "Virginia Sigmon"
		
		WebUI.delay(5)
		
		// Open multibill URL and populate search criteria
		CustomKeywords.'multiBillPages.searchPage.setDataSearchString'(searchString)
		
		WebUI.delay(5)
		
			

		CustomKeywords.'multiBillPages.searchPage.selectAddtoCart'()
		WebUI.delay(5)
		
		CustomKeywords.'multiBillPages.searchPage.selectViewCart'()
		WebUI.delay(5)
		
		
		

		
					
					 //Select Checkout option
					 CustomKeywords.'multiBillPages.cartContentPage.selectCheckout'()
					 WebUI.delay(5)
		
					 // Select Credit Card Payment Method
					 CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByCreditCard'()
					 WebUI.delay(5)
		
					 // Select Make a Payment Button
					 CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()
					 WebUI.delay(5)
		
					 if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input__viewParcelButton'), 0))
						 {
							 KeywordUtil.logInfo("View Parcel button Exists")
							 //Click on View Parcel
							 WebUI.click(findTestObject('Object Repository/IWP_Bootstrap/Page_PaymentEntryCC_Bootstrap/input__viewParcelButton'))
							 
							 WebUI.delay(5)
							 
							 WebUI.verifyTextPresent("TaxPayer Name", false)
							 WebUI.verifyTextPresent("TaxPayer Address", false)
							 WebUI.verifyTextPresent("Due Date", false)
							 WebUI.verifyTextPresent("TaxPayer Number", false)
							 WebUI.verifyTextPresent("Amount", false)
							 WebUI.verifyTextPresent("UDF1", false)
							 WebUI.verifyTextPresent("UDF2", false)
							 WebUI.verifyTextPresent("UDF3", false)
							 WebUI.verifyTextPresent("UDF4", false)
							 WebUI.verifyTextPresent("UDF5", false)
							 WebUI.verifyTextPresent("UDF6", false)
							 
										
						 }
						 else
						 {
							 println "View Parcels button is not present on CC Payment Entry page"
							 KeywordUtil.markFailed("View Parcels button is not present on CC Payment Entry page")
						 }
		//WebUI.closeBrowser()
		