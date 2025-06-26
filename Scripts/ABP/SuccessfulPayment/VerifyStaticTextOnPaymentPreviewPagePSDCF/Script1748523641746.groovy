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
import com.kms.katalon.core.testdata.reader.ExcelFactory
import internal.GlobalVariable
import com.kms.katalon.core.util.KeywordUtil

//*******************Created by @Komal Mishra***************************************************
 
 String resText = "Fail"
 String resColumn = "Result"
 String datCloumn = "Date"
 String fileLoc = "KatalonData/ABPTestData/PaymentsACH.xlsx"
 String path = fileLoc
 nameSheet = "VerifyStaticTextOnPPPSDCF"
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
				  udfID = dataFile.getValue("UDFID", row)
				  AddressID = dataFile.getValue("AddressID", row)
				  nickNameID = dataFile.getValue("NickName", row)
				  ACHID = dataFile.getValue("ACHID", row)
				  nameID = dataFile.getValue("NameID", row)
				 def VerificationText = dataFile.getValue("VTList", row)
				 def stringArray = VerificationText.split(",")
				 print(stringArray)
				 
				 WebUI.openBrowser(GlobalVariable.abpURL)
				 WebUI.maximizeWindow()
				 
				 //Login to ABP Application
				 CustomKeywords.'abpPages.LoginPage.setLoginDataMethod'(username,password)
				 
				 //Click on Check box to select check to Pay
				 CustomKeywords.'abpPages.PendingBillPage.checkToPayMethod'()
				 
				 //select personal saving payment method from drop down
				  CustomKeywords.'abpPages.PendingBillPage.selectPaymentMethodPersonalSavings'()
				 
				 //Uncheck save payment method so the payment method is not stored
				 CustomKeywords.'abpPages.PendingBillPage.uncheckSavePaymentMethod'()
				 
				 //this method populates credit card data
				 CustomKeywords.'abpPages.PendingBillPage.setPersonalACHData'(ACHID)
				 
				 //this method populates udf data
				 CustomKeywords.'abpPages.PendingBillPage.setDataUDF'(udfID)
				 
				 println(nameID)
				 
				 CustomKeywords.'abpPages.PendingBillPage.setDataCompanyNameID'(nameID)
				 
				 //this method populates address data
				 CustomKeywords.'abpPages.PendingBillPage.setDataAddress'(AddressID)
				 
				 //this method will click on accept terms and condition 
				 CustomKeywords.'abpPages.PendingBillPage.clickACHTermsConditionsButtonMethod'()
				 
				 //to click on nect button
				 CustomKeywords.'abpPages.PendingBillPage.clickNextButtonMethod'()
				 //Nickname textbox gets Disabled once you uncheck saved payment method hence disabling below code
				 //CustomKeywords.'abpPages.PendingBillPage.setDataNickNameID'(nickNameID)
				 
				 //CustomKeywords.'abpPages.PaymentPreviewPage.clickPaybtnMethod'()
				 
				 Thread.sleep(shortDelay)
				 if (WebUI.verifyTextPresent("Payment Preview", false))
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
								
								if (isRequiredTextPresent) {
									
									println "All the relevant texts are present on Receipt Page"
									KeywordUtil.markPassed("All the relevant texts are present on Receipt Page")
									resText = "Pass"
									CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
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
				WebUI.closeBrowser()		