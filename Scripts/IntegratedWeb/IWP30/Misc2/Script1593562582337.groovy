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
//import Keywords.customClasses

// Open Browser with QA Test Harness

//WebUI.openBrowser('https://dev-algorithm.govolution.com/vrelaytest/QA/version_2_2/vrelaytest.html')


//WebUI.navigateToUrl('https://dev-algorithm.govolution.com/vrelaytest/QA/version_2_2/')

//WebUI.closeBrowser()

	def numOfRows = findTestData('IWP30PayNowCC').getRowNumbers()

println(numOfRows)

	def dataFile = "IWP30PayNowCC"


// For each row in the spreadsheet, execute the given steps	
//for (def row = 1; row <= numOfRows; row++) {
//	
//	def CCAmount = findTestData('IWP30PayNowCC').getValue('CCAmount', row)
//	
//	println ("Iteration: "+row)
//	println("CCAmount: " + CCAmount)
//		
////	if ((CCAmount != null) && (!CCAmount.isEmpty()))
//	if (!CCAmount.isEmpty())
//	{
//		println 22
//	}
//	else 
//	{ println 33}
//	
//	
//}
	
//	try {
//		int x = 4/0
//		
//		println x
//		
//	}
//	catch (Exception exp) {
//		println exp.getMessage()
//	}
//	
//	//Hello from Pavneet
//	//Pavneet added another line
//	//Pavneet added one more line
//	//Imtiaz added yet another line
//	
//int a = 6
//int b = 7
//
//	
//	if (a == b)
//	{
//		println "a  is equlat to b"
//	}
//	else {println "a is not equal to b"}
//	
	
	for (def row = 1; row <= numOfRows; row++) {
		
		WebUI.openBrowser('https://dev-algorithm.govolution.com/vrelaytest/QA/version_2_2/vrelaytest.html')
		//WebUI.navigateToUrl('https://dev-algorithm.govolution.com/vrelaytest/QA/version_2_2/vrelaytest.html')
		WebUI.maximizeWindow()
		
//		Vrelay30class myMClass = new Vrelay30class()
//		myMClass.getDataMethod(row,dataFile)
		
//		CustomKeywords.'iwpPages.emulatorIWP30.getSetData'(row,dataFile)
//CustomKeywords.'customClasses.Vrelay30class.getDataMethod'(row,dataFile)
		CustomKeywords.'iwpPages.TestHarnessPage.setDataMethod'(row,dataFile)
		
	}
	
	
	//WebUI.takeScreenshot()
	