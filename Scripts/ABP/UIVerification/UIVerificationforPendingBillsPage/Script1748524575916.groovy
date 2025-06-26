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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.console.ui.Console
import internal.GlobalVariable
import static org.assertj.core.api.Assertions.registerCustomDateFormat
import static org.assertj.core.api.InstanceOfAssertFactories.CHAR_SEQUENCE
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.util.KeywordUtil

def abpURL = GlobalVariable.abpURL

String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/ABPTestData/ABPTestData.xlsx"
 String path = fileLoc
 nameSheet = "UIVerificationPendingBillsPage"
 def shortDelay = GlobalVariable.shortDelay
 dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)
 def username,password,udfID,AddressID,CardID,ACHID,nameID,isRequiredTextPresent = false
 
 username = GlobalVariable.abpSCFUsername
 password = GlobalVariable.abpSCFPassword
 
 numOfRows = dataFile.getRowNumbers()
 for (def row = 1; row <= numOfRows; row++)
	 {
		 ExecuteTC = dataFile.getValue("Execute", row)
		 
		 if (ExecuteTC.equalsIgnoreCase("Y"))
			 {
				 System.out.println('Begin Record Number: ' + row)
	 
				 Date today = new Date()
				 println (today)
				 String datText = today
				 def VerificationText = dataFile.getValue("VTList", row)
				 def stringArray = VerificationText.split(",")
				 print(stringArray)
				 
				 WebUI.openBrowser(GlobalVariable.abpURL)
				 WebUI.maximizeWindow()
				 
				 //Login to ABP Application
				 CustomKeywords.'abpPages.LoginPage.setLoginDataMethod'(username,password)
				 
				 //Click on Check box to select check to Pay
				 CustomKeywords.'abpPages.PendingBillPage.checkToPayMethod'()
				 if (WebUI.verifyTextPresent("Available Bills Label", false))
					 {
						 
						 for(def item in stringArray)
							  {
							 
							 //println(item.trim())
							 
							 if(WebUI.verifyTextPresent(item.trim(),false)) {
								 isRequiredTextPresent = true
								 
								  }
								  else {
									  println(item + " text is missing")
									  isRequiredTextPresent = false
								  }
								}
								WebUI.verifyElementPresent(findTestObject('Object Repository/ABP/BillsLabelPage/a_BillsLabel'), 10)
								WebUI.verifyElementClickable(findTestObject('Object Repository/ABP/BillsLabelPage/a_BillsLabel'))
								WebUI.verifyElementClickable(findTestObject('Object Repository/ABP/BillsLabelPage/a_FAQ'))
								WebUI.verifyElementClickable(findTestObject('Object Repository/ABP/BillsLabelPage/a_FindOtherBillsLabel'))
								WebUI.verifyElementClickable(findTestObject('Object Repository/ABP/BillsLabelPage/a_HideAll'))
								WebUI.verifyElementClickable(findTestObject('Object Repository/ABP/BillsLabelPage/a_PaymentMethods'))
								WebUI.verifyElementClickable(findTestObject('Object Repository/ABP/BillsLabelPage/a_LogOut'))
								WebUI.verifyElementClickable(findTestObject('Object Repository/ABP/BillsLabelPage/a_PaymentsList'))
								WebUI.verifyElementClickable(findTestObject('Object Repository/ABP/BillsLabelPage/a_SelectAll'))
								WebUI.verifyElementClickable(findTestObject('Object Repository/ABP/BillsLabelPage/a_ShowAll'))
								WebUI.verifyElementClickable(findTestObject('Object Repository/ABP/BillsLabelPage/a_UnselectAll'))
								WebUI.verifyElementClickable(findTestObject('Object Repository/ABP/BillsLabelPage/a_UserList'))
								WebUI.verifyElementClickable(findTestObject('Object Repository/ABP/BillsLabelPage/a_AccountProfile'))
								
								if (isRequiredTextPresent) {
									
									println "All the relevant texts are present on Receipt Page"
									KeywordUtil.markPassed("All the relevant texts are present on Receipt Page")
									resText = "Pass"
									CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
									//WebUI.click(findTestObject('Object Repository/ABP/BillsLabelPage/a_FAQ'))
									}
									  else
									{
										println "Some texts are missing on the Receipt page"
		//								KeywordUtil.markFailed("Error on Page is : " + WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode')))
										resText = "Fail"
										CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
		//								println WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode'))
										
										
									}
					
				}
			 }	}
				//WebUI.closeBrowser()