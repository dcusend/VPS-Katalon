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
 nameSheet = "UiVerificationForAccountProfile"
 def shortDelay = GlobalVariable.shortDelay
 dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)
 def username,password,udfID,AddressID,CardID,ACHID,nameID,isRequiredTextPresent = false
 
 username = GlobalVariable.abpDCFUsername
 password = GlobalVariable.abpDCFPassword
 
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
				 CustomKeywords.'abpPages.PendingBillPage.clickAccountProfile'()
				
				 if (WebUI.verifyTextPresent("Account Profile", false))
					 {
						 
						 for(def item in stringArray)
							  {
							 
							 println(item.trim())
							 
							 if(WebUI.verifyTextPresent(item.trim(),false)) {
								 isRequiredTextPresent = true
								 
								  }
								  else {
									  println(item + " text is missing")
									  isRequiredTextPresent = false
								  }
								}
								
								
								if (isRequiredTextPresent) {
									
									println "All the relevant texts are present on Account Profile Page"
									KeywordUtil.markPassed("All the relevant texts are present on Account Profile Page")
									resText = "Pass"
									CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
									}
									  else
									{
										println "Some texts are missing on the Account Profile Page"
										resText = "Fail"
										CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
										
										
									}
									
									firstName  =	WebUI.getAttribute(findTestObject('Object Repository/ABP/Page_AccountProfile/input_firstname'), "value")
									lastName = WebUI.getAttribute(findTestObject('Object Repository/ABP/Page_AccountProfile/input_lastName'), "value")
									companyName = WebUI.getAttribute(findTestObject('Object Repository/ABP/Page_AccountProfile/input_companyName'), "value")
									addressLine1 = WebUI.getAttribute(findTestObject('Object Repository/ABP/Page_AccountProfile/input_addressLine1'), "value")
									Zip = WebUI.getAttribute(findTestObject('Object Repository/ABP/Page_AccountProfile/input_zipCode'), "value")
								   City = WebUI.getAttribute(findTestObject('Object Repository/ABP/Page_AccountProfile/input_City'), "value")
								   State = WebUI.getAttribute(findTestObject('Object Repository/ABP/Page_AccountProfile/select_State'), "value")
								   
								   println(firstName+lastName+addressLine1+Zip+City+State)
								   
								   WebUI.verifyEqual(firstName,dataFile.getValue("FirstName", row))
								   WebUI.verifyEqual(lastName,dataFile.getValue("LastName", row))
								   WebUI.verifyEqual(companyName,dataFile.getValue("CompanyName", row))
								   WebUI.verifyEqual(addressLine1,dataFile.getValue("AddressLine1", row))
								   WebUI.verifyEqual(Zip,dataFile.getValue("Zip", row))
								   WebUI.verifyEqual(City,dataFile.getValue("City", row))
					
				}
			 }	}
				//WebUI.closeBrowser()