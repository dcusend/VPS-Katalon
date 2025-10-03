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
import groovy.transform.ThreadInterrupt
import internal.GlobalVariable
import static org.assertj.core.api.Assertions.registerCustomDateFormat
import static org.assertj.core.api.InstanceOfAssertFactories.CHAR_SEQUENCE
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.annotation.Keyword 


def abpURL = GlobalVariable.abpURL

String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/ABPTestData/SchedulePaymentABP_SCF.xlsx"
 String path = fileLoc
 nameSheet = "CVCSPSCFCC_AutomaticPayment"
 def shortDelay = GlobalVariable.shortDelay
 dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)
 def username,password,udfID,AddressID,CardID,ACHID,nameID,paymentMethod,paymentPlanType,paymentPlanFrequency,dividePaymentPlanBy,isRequiredTextPresent = false
 
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
				 udfID = dataFile.getValue("UDFID", row)
				 paymentMethod = dataFile.getValue("PaymentMethod", row).trim()
				 paymentPlanType = dataFile.getValue("PaymentPlanType", row)
				 paymentPlanFrequency = dataFile.getValue("PaymentPlanFrequency", row)
				 def VerificationText = dataFile.getValue("VTList", row)
				 def stringArray = VerificationText.split(",")
				 print(stringArray)
				 
				 WebUI.openBrowser(GlobalVariable.abpURL)
				 WebUI.maximizeWindow()
				 
				 //Login to ABP Application
				 CustomKeywords.'abpPages.LoginPage.setLoginDataMethod'(username,password)
				 
				 //Click on Check box to select check to Pay
				 CustomKeywords.'abpPages.PendingBillPage.checkToPayMethod'()
				 
				 CustomKeywords.'abpPages.PendingBillPage.clickSchedulePaymentIcon'()
				 
				 CustomKeywords.'abpPages.ScheduledPaymentPage.setDataUDF'(udfID)
				 
				 CustomKeywords.'abpPages.ScheduledPaymentPage.selectPaymentMethod'(paymentMethod)
				 
				 CustomKeywords.'abpPages.ScheduledPaymentPage.checkRadioPaymentPlanType'(paymentPlanType)
				 
				 //Thread.sleep(GlobalVariable.shortDelay)
				 
				 //CustomKeywords.'abpPages.ScheduledPaymentPage.clickACHTANDConditionsButton'()
				 
				 Thread.sleep(GlobalVariable.shortDelay)
				 
				 
				 //CustomKeywords.'abpPages.ScheduledPaymentPage.selectPaymentPlanFrequency'(paymentPlanFrequency)
				 
					 
					 println(dividePaymentPlanBy)
					 
					 //CustomKeywords.'abpPages.ScheduledPaymentPage.checkRadioDivideYourPaymentPlan'(dividePaymentPlanBy)
				 Thread.sleep(GlobalVariable.shortDelay)
				 
				 CustomKeywords.'abpPages.ScheduledPaymentPage.clickSaveButton'()
				 
				 if (WebUI.verifyTextPresent("Your changes have been saved", false)) {
					 
											
					 CustomKeywords.'abpPages.PaymentsListPage.clickViewButton'()
					 
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
						   if (isRequiredTextPresent) {
							   
							   Thread.sleep(GlobalVariable.shortDelay)
							   
							   CustomKeywords.'abpPages.PaymentsListPage.clickBackButton'()
							   
							   CustomKeywords.'abpPages.PaymentsListPage.clickCancelButton'()
							   
							  // WebUI.waitForAlert(GlobalVariable.shortDelay)
							   WebUI.acceptAlert()
							   
							   println "All the relevant texts are present on View Scheduled Payment  Page"
							   KeywordUtil.markPassed("All the relevant texts are present on View Scheduled Payment Page")
							   resText = "Pass"
							   CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
							   
							   }
								 else
							   {
								   println "Some texts are missing on the View Scheduled Payment page"
								   resText = "Fail"
								   CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
 
								   }
			   
		   }
					 
					 //
							
							
				  
					 KeywordUtil.markPassed("Your changes have been saved message appeared")
					 
					 resText = "Pass"
					 CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				 }
				 else {
					 KeywordUtil.markFailed("Your changes have been saved text not present")
					 resText = "Fail"
					 CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
				 }
				 
			 }