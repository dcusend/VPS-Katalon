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
import com.kms.katalon.core.testdata.reader.ExcelFactory
import com.kms.katalon.core.util.KeywordUtil
import java.text.DecimalFormat
import java.util.Random
import org.apache.commons.lang.RandomStringUtils




def Url, Environment, UserName, Password, PartnerToken, JSONBody

def Show, DueAmount
 
def CardNo_Out, ExpMM_Out, ExpYYYY_Out, SecurityCode_Out, Name_Out,
	Email_Out, Phone_Out, PaymentDate_Out, Country_Out, Address_Out, Zip_Out, State_Out, City_Out,
	UDF1_Out, UDF2_Out, UDF3_Out, UDF4_Out, UDF5_Out, UDF6_Out, UDF7_Out, UDF8_Out, UDF9_Out, UDF10_Out

def fileLoc, nameSheet, numOfRows, isRequiredTextPresent= false, submitData, parcelData, creditDebitData

def executionProfile = RC.getExecutionProfile()


switch(executionProfile)
{
case "QAProfile":
		 Url = "https://dev-algorithm.govolution.com/vvtapi/VVTAPI_FORM_POST_TEST_PAGE.html"
		 UserName = GlobalVariable.IVTUserName
		 Password = GlobalVariable.IVTPassword
		 PartnerToken= GlobalVariable.IVTPartnerToken
					  
	fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx'
	nameSheet = 'SubmitRequest'
	submitData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx', nameSheet, true)
	
	break
	
case "QA2Profile":
		 Url = "https://dev-algorithm.govolution.com/vvtapi/VVTAPI_FORM_POST_TEST_PAGE.html"
		 UserName = GlobalVariable.IVTUserName
		 Password = GlobalVariable.IVTPassword
		 PartnerToken= GlobalVariable.IVTPartnerToken
					  
	fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx'
	nameSheet = 'SubmitRequest'
	submitData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx', nameSheet, true)

	break
			
case "DemoProfile":
		 Url = "https://dev-algorithm.govolution.com/vvtapi/VVTAPI_FORM_POST_TEST_PAGE.html"
		 UserName = GlobalVariable.IVTUserName
		 Password = GlobalVariable.IVTPassword
		 PartnerToken= GlobalVariable.IVTPartnerToken
					  
	fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx'
	nameSheet = 'SubmitRequest'
	submitData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx', nameSheet, true)

	break
	
case "Production":
		 Url = "https://dev-algorithm.govolution.com/vvtapi/VVTAPI_FORM_POST_TEST_PAGE.html"
		 UserName = GlobalVariable.IVTUserName
		 Password = GlobalVariable.IVTPassword
		 PartnerToken= GlobalVariable.IVTPartnerToken
					  
	fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx'
	nameSheet = 'SubmitRequest'
	submitData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx', nameSheet, true)

	break
		
}

          				
							//Part 1- VVTApiIVT login


numOfRows = submitData.getRowNumbers()
println("Number of Records: " + numOfRows)


// For each row in the spreadsheet, execute the given steps
for (def row = 1; row <= numOfRows; row++)
{

	ExecuteTC = submitData.getValue('Execute', row)
	System.out.println('Value of Execute is : ' + ExecuteTC)
	
	
	if (ExecuteTC.equalsIgnoreCase("Y"))
		{
			System.out.println('Begin Record Number: ' + row)
							
			 
				Environment = submitData.getValue("Environment", row)
				JSONBody   = submitData.getValue("JSONBody", row)
									  
			 
// Login(Submit Request)
CustomKeywords.'ivtPages.VVTApiIVTlogin.SetDataVVTApiIVTlogin'(Url, Environment, UserName, Password, PartnerToken, JSONBody)

		

							//Part 2- Parcels Label page validation


WebUI.delay(2)
WebUI.verifyTextPresent('Parcels Label', true)

fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx'
nameSheet = 'ParcelsLabel'
parcelData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx', nameSheet, true)


numOfRows = parcelData.getRowNumbers()
println("Number of Records: " + numOfRows)

for (def ParcelsRow = 1; ParcelsRow <= numOfRows; ParcelsRow++)
{

	ExecuteTC = parcelData.getValue('Execute', ParcelsRow)
	System.out.println('Value of Execute is : ' + ExecuteTC)
	
	
	if (ExecuteTC.equalsIgnoreCase("Y"))
		{
			System.out.println('Begin Record Number: ' + ParcelsRow)
							
			 					 
			 Show = parcelData.getValue("Show", ParcelsRow)
			 println(Show)
			 DueAmount = parcelData.getValue("DueAmount", ParcelsRow)
			 println(DueAmount)
		 

CustomKeywords.'ivtPages.ParcelsLabel.SetDataParcelsLabel'(Show, DueAmount )

		 

							//Part 3- Credit/Debit Card page validation

		 
WebUI.verifyTextPresent('Credit/Debit Card', true)
WebUI.click(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/label_CreditCard'))

fileLoc = 'KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx'
nameSheet = 'CreditDebitCard'
creditDebitData = ExcelFactory.getExcelDataWithDefaultSheet('KatalonData/VVTApiIVT/VVTApiIVT_CreditDebit_Card.xlsx', nameSheet, true)


numOfRows = creditDebitData.getRowNumbers()
println("Number of Records: " + numOfRows)

for (def CrediDebitRow = 1; CrediDebitRow <= numOfRows; CrediDebitRow++)
{

	ExecuteTC = creditDebitData.getValue('Execute', CrediDebitRow)
	System.out.println('Value of Execute is : ' + ExecuteTC)
	
	
	if (ExecuteTC.equalsIgnoreCase("Y"))
		{
			System.out.println('Begin Record Number: ' + CrediDebitRow)
							
								  
			 CardNo_Out = creditDebitData.getValue("CardNo", CrediDebitRow)

			 ExpMM_Out = creditDebitData.getValue("ExpMM", CrediDebitRow)
			 
			 ExpYYYY_Out = creditDebitData.getValue("ExpYYYY", CrediDebitRow)
			 
			 SecurityCode_Out = creditDebitData.getValue("SecurityCode", CrediDebitRow)
						 
			 //Generate random name
			 Name_Out = RandomStringUtils.randomAlphabetic(10)
			 println(Name_Out)
			 			 
			 Email_Out = creditDebitData.getValue("Email", CrediDebitRow)
			 
			 Phone_Out = creditDebitData.getValue("Phone", CrediDebitRow)
			 
			 PaymentDate_Out = creditDebitData.getValue("Date", CrediDebitRow)
			 
			 Country_Out = creditDebitData.getValue("Country", CrediDebitRow)
			 			 
			 Address_Out = creditDebitData.getValue("Address", CrediDebitRow)
			 			 
			 Zip_Out = creditDebitData.getValue("Zip", CrediDebitRow)
			 			 
			 State_Out = creditDebitData.getValue("State", CrediDebitRow)
			 
			 City_Out = creditDebitData.getValue("City", CrediDebitRow)
			 
			 UDF1_Out = creditDebitData.getValue("UDF1", CrediDebitRow)
			 println(UDF1_Out)
			 
			 UDF2_Out = creditDebitData.getValue("UDF2", CrediDebitRow)
			 			 
			 UDF3_Out = creditDebitData.getValue("UDF3", CrediDebitRow)
			 
			 UDF4_Out = creditDebitData.getValue("UDF4", CrediDebitRow)
			 			 
			 UDF5_Out = creditDebitData.getValue("UDF5", CrediDebitRow)
			 			 
			 UDF6_Out = creditDebitData.getValue("UDF6", CrediDebitRow)
			 
			 UDF7_Out = creditDebitData.getValue("UDF7", CrediDebitRow)
			 
			 UDF8_Out = creditDebitData.getValue("UDF8", CrediDebitRow)
			 
			 UDF9_Out = creditDebitData.getValue("UDF9", CrediDebitRow)
			 
			 UDF10_Out = creditDebitData.getValue("UDF10", CrediDebitRow)
			 			 
		 
CustomKeywords.'ivtPages.CreditDebitCard.SetDataDebitCreditCard'(
				CardNo_Out, ExpMM_Out, ExpYYYY_Out, SecurityCode_Out, Name_Out,
				Email_Out, Phone_Out, PaymentDate_Out, Country_Out, Address_Out, Zip_Out, State_Out, City_Out,
				UDF1_Out, UDF2_Out, UDF3_Out, UDF4_Out, UDF5_Out, UDF6_Out, UDF7_Out, UDF8_Out, UDF9_Out, UDF10_Out)


//Continue
WebUI.click(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/button_Continue'))


//Pop up handling
WebUI.delay(4)
WebUI.executeJavaScript("""let buttons = document.querySelectorAll('button');
    					buttons.forEach(btn => {
        				if(btn.innerText.trim() === 'X')
						{
        			   		 btn.click(); } 
						}); """, null)

WebUI.waitForPageLoad(5)

//Payment Information page vaidation
	 
 	 // displayed values from UI
	 String CardholderName_Info = WebUI.getText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CardHolderNameInfo')).trim()
	 String PaymentAmount_Info = WebUI.getText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/PaymentAmountInfo')).trim()
	 String UserDefinedField1_Info = WebUI.getText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/UserDefinedField1Info')).trim()
	 	 	 	 
	 // normalize expected values
	 String expectedName_Info = (Name_Out != null) ? Name_Out.trim() : ""
	 String expectedAmount_Info = String.format('$%.2f', Double.parseDouble(DueAmount))   // adjust if formatting differs
	 String expectedUDF1_Info = (UDF1_Out != null) ? UDF1_Out.trim() : ""
	 
	 
	 // static texts verification
	 def textsToVerify_Info = [
			 'Parcels Label',
			 'Payment Information',
			 'Invoice',
			 'Fee Acceptance',
			 'This transaction is subject to a Fee of $2.00.',
			 'Accept Fee and Process Payment',
			 'Modify',
			 'Exit'
	 		]
	 
	 boolean allTextsPresent_Info = true
	 
	 def missingTexts_Info = []
	 
	 textsToVerify_Info.each { text ->
	 
		 boolean isPresent_Info = WebUI.verifyTextPresent(text, false)
		 println(text + " => " + isPresent_Info)
	 
		 if (!isPresent_Info) {
			 allTextsPresent_Info = false
			 missingTexts_Info.add(text)
		 }
	  }
	 	 	 
	 
   // validation
   if (		 	 	 	
		 allTextsPresent_Info &&
		 CardholderName_Info.equals(expectedName_Info) &&
		 PaymentAmount_Info.equals(expectedAmount_Info) &&
		 UserDefinedField1_Info.equals(expectedUDF1_Info)
	   ) 
		 
	 {
		  println("User is on 'Payment Information' page")
	  	
	   WebUI.delay(2)
	   WebUI.click(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/AcceptFee_ProcessPayment'))	 	  	   
	   WebUI.waitForPageLoad(20)
	   WebUI.delay(10)
	   
	 }
	 
   else
	 {
		 println("User is not on 'Payment Information' page")
		 
		 if (!allTextsPresent_Info) {
			 println("Missing texts on page: " + missingTexts_Info) }
		 			 		 
		 println("Expected Name: " + expectedName_Info + " | Actual: " + CardholderName_Info)
		 println("Expected Amount: " + expectedAmount_Info + " | Actual: " + PaymentAmount_Info)
		 println("Expected UDF1: " + expectedUDF1_Info + " | Actual: " + UserDefinedField1_Info)
	 }
	 

	 	 
//Payment & Billing Confirmation page vaidation

	 // displayed values from UI
	 	 
	 WebUI.waitForElementVisible(
		 findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CreditDebit_PaymentConfirmation/CardholderNameConfirm'),10
	 )
	 
	 String CardholderName_Confirm = WebUI.getText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CreditDebit_PaymentConfirmation/CardholderNameConfirm')).trim()	 
	 String PaymentAmount_Confirm = WebUI.getText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CreditDebit_PaymentConfirmation/PaymentAmountConfirm')).trim()
	 String UserDefinedField1_Confirm = WebUI.getText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CreditDebit_PaymentConfirmation/UserDefinedField1Confirm')).trim()
			
	 String TransactionType_Confirm = WebUI.getText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CreditDebit_PaymentConfirmation/TransactionType')).trim()	 
	 String Fee_Confirm = WebUI.getText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CreditDebit_PaymentConfirmation/Fee')).trim() 
	 String FeeType_Confirm = WebUI.getText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CreditDebit_PaymentConfirmation/FeeType')).trim()	 
	 String TotalAmount_Confirm = WebUI.getText(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CreditDebit_PaymentConfirmation/TotalAmount')).trim()
	  		
	 // normalize expected values
	 String expectedName_Confirm = (Name_Out != null) ? Name_Out.trim() : ""
	 String expectedAmount_Confirm = String.format('$%.2f', Double.parseDouble(DueAmount))   // adjust if formatting differs
	 String expectedUDF1_Confirm = (UDF1_Out != null) ? UDF1_Out.trim() : ""
	 
	 String expectedTransactionType_Confirm = "Authorization and Capture"
	 String expectedFee_Confirm = '$2.00'
	 String expectedFeeType_Confirm = "Single Transaction"
	 String expectedTotalAmount_Confirm = '$' + String.format("%.2f", Double.parseDouble(DueAmount) + 2.00) 
	 
	 
	 // static texts verification
	 def textsToVerify_Confirm = [
			 'Parcels Label',
			 'Payment and Billing Information',
			 'Remittance ID',
			 'Payment ID',
			 'Transaction Type',
			 'Cardholder Name',
			 'Card Type',
			 'Card Number',
			 'Card Security Code',
			 'Expiration Date',
			 'Payment Date',
			 'Address Line 1',
			 'Country',
			 'City',
			 'State',
			 'ZIP Code',
			 'Email Address',
			 'Phone Number',
			 'Invoice',
			 'Fee',			 
			 'Fee Type',
			 'Total Amount',
			 'user_defined_1',
			 'user_defined_2',
			 'user_defined_3',
			 'user_defined_4',
			 'user_defined_5',
			 'user_defined_6',
			 'user_defined_7',
			 'user_defined_8',
			 'user_defined_9',
			 'user_defined_10',
			 'Print',
			 'Exit'
		 
	     ]
	 
	 boolean allTextsPresent_Confirm = true
	 
	 def missingTexts_Confirm = []
	 
	 textsToVerify_Confirm.each { text ->
	 
		 boolean isPresent_Confirm = WebUI.verifyTextPresent(text, false)
		 println(text + " => " + isPresent_Confirm)
	 
		 if (!isPresent_Confirm) {
			 allTextsPresent_Confirm = false
			 missingTexts_Confirm.add(text)
		 }
	  }
			   
	 
   // validation
   if (
		 allTextsPresent_Confirm &&
		 CardholderName_Confirm.equals(expectedName_Confirm) &&
		 PaymentAmount_Confirm.equals(expectedAmount_Confirm) &&
		 UserDefinedField1_Confirm.equals(expectedUDF1_Confirm) &&
		 
		 TransactionType_Confirm.equals(expectedTransactionType_Confirm) &&
		 Fee_Confirm.equals(expectedFee_Confirm) &&
		 FeeType_Confirm.equals(expectedFeeType_Confirm) &&
		 TotalAmount_Confirm.equals(expectedTotalAmount_Confirm)	 
		 
	   )
		 
	 {
		  println("User is on 'Payment & Billing Confirmation' page")
	 
	   //Print button  
	   WebUI.click(findTestObject('Object Repository/IntegratedVT/CreditDebitCard/CreditDebit_PaymentInformation/CreditDebit_PaymentConfirmation/Print'))
		   WebUI.delay(4)
		 
	 }
	 
   else
	 {
		 println("User is not on 'Payment & Billing Confirmation' pagee")
		 
		 if (!allTextsPresent_Confirm) {
			 println("Missing texts on page: " + missingTexts_Confirm) }
							   
		 println("Expected Name: " + expectedName_Confirm + " | Actual: " + CardholderName_Confirm)
		 println("Expected Amount: " + expectedAmount_Confirm + " | Actual: " + PaymentAmount_Confirm)
		 println("Expected UDF1: " + expectedUDF1_Confirm + " | Actual: " + UserDefinedField1_Confirm)
		 		 
		 println("Transaction Type: Expected: " + expectedTransactionType_Confirm + " | Actual: " + TransactionType_Confirm)
		 println("Fee: Expected: " + expectedFee_Confirm + " | Actual: " + Fee_Confirm)
		 println("Fee Type: Expected: " + expectedFeeType_Confirm + " | Actual: " + FeeType_Confirm)
		 println("Total Amount: Expected: " + expectedTotalAmount_Confirm + " | Actual: " + TotalAmount_Confirm)
		 	 
	  }
	 
	 
	 
//Print/Success page validation	 
	 
	 
	 
	 
	 
	 



		}

	}  }

		}	}
		
}
