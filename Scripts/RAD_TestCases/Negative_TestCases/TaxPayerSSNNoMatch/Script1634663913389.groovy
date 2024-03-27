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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
//String fileLoc = "C:\\KatalonData\\RADTestData\\TaxPayerSSNNoMatch.xlsx"
String fileLoc = "KatalonData/RADTestData/TaxPayerSSNNoMatch.xlsx"
String nameSheet = "Sheet1"
String dataFile = "RADTestData/TaxPayerSSNNoMatch"

def ExecuteTC, Taxtype


def numOfRows = findTestData(dataFile).getRowNumbers()

	println("Number of Records: " + numOfRows)


	// For each row in the spreadsheet, execute the given steps
	for (def row = 1; row <= numOfRows; row++)
		{
		
			ExecuteTC = findTestData(dataFile).getValue('Execute', row)
			Taxtype = findTestData(dataFile).getValue('TaxType', row)
			Paymenttype = findTestData(dataFile).getValue('PaymentType', row)
			
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			
			if (ExecuteTC.equalsIgnoreCase("Y"))
				{
					System.out.println('Begin Record Number: ' + row)
		
					Date today = new Date()
					println (today)
					String datText = today
					
					Taxtype = findTestData(dataFile).getValue('TaxType', row)
					
					System.out.println('Taxtype value is : ' + Taxtype)
					
					
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
					
					
					
					WebUI.selectOptionByLabel(findTestObject(orPath_Landing + '/dd_TaxType'),Paymenttype , false)
					
					WebUI.delay(1)
					
					
// Tax Type dropdown is different
					
					switch (Paymenttype)
					{
						
						case "Existing Liability with Notice/Invoice Number":
								WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_TaxType_ExistingLiability'),Taxtype , false)
						
						break
						
						
						case "Quarterly Estimated Tax":
								WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PaymentType'),Taxtype,false)
						
						break
						
						
						case "Extension Payments":
								WebUI.selectOptionByLabel(findTestObject(orPath_TaxTypeFilingYear + '/select_PaymentType'),Taxtype,false)
						
						break
						
						
						case "New Tax Return Amount Due":
								WebUI.selectOptionByLabel(findTestObject('Object Repository/RAD_Pages/Landing_Page/select_NewTaxReturnAmountDue_TaxType'),Taxtype,false)
						
						break
						
						
					}
					

					WebUI.delay(1)
					
					WebUI.scrollToElement(findTestObject(orPath_TaxPayer + '/input_firstName'), 3)
					

					
// SSN fields are different for Existing Liability
					switch (Paymenttype)
					{
						
						case "Existing Liability with Notice/Invoice Number":
								
								if (Taxtype.equalsIgnoreCase("Estate Tax"))
									{
										WebUI.setText(findTestObject(orPath_TaxInfo +'/input_DecedentSSN'), "1111111111")
										WebUI.setText(findTestObject(orPath_TaxInfo + '/input_ReTypeDecedentSSN'), "222222222")
										WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),"Anderson")
									}
								else
									{
										WebUI.setText(findTestObject(orPath_TaxInfo + '/input_Existing_SSN'), "111111111")
										WebUI.setText(findTestObject(orPath_TaxInfo + '/input_Existing_RetypeSSN'), "222222222")
										WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),"Anderson")
									}
												
						break
						
						
						case "Quarterly Estimated Tax":
								
								WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatSSN'), "111111111")
								WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatReSSN'), "222222222")	
								WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),"Anderson")
						break
						
						
						case "Extension Payments":
								
								WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatSSN'), "111111111")
								WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatReSSN'), "222222222")	
								WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),"Anderson")
						break
						
						
						case "New Tax Return Amount Due":
						
								if (Taxtype.equalsIgnoreCase("Estate Tax"))
									{
										WebUI.setText(findTestObject(orPath_TaxPayer + '/input_NewTax_DecedentSSN'), "1111111111")
										WebUI.setText(findTestObject(orPath_TaxPayer + '/input_NewTax_ReTypeDecedentSSN'), "222222222")
										WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),"Anderson")
									}
								else
									{
										WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatSSN'), "111111111")
										WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatReSSN'), "222222222")
										WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),"Anderson")
									}
						
						break
						
						
					}
					
					
					
												
					
					WebUI.delay(2)
					
									
		
						switch (Taxtype)
						{
							
							case "Estate Tax":
							
								if (WebUI.verifyTextPresent('The Decedent SSN and Re-type Decedent SSN do not match', true))
									{
										println "Taxpayer SSN Dont match text is present"
										System.out.println('Pass Record Number: ' + row)
										resText = "Pass"
										CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
									}
								else
									{
										println "The Decedent SSN and Re-type Decedent SSN do not match" + Taxtype + "page"
										System.out.println('Fail Record Number: ' + row)
										KeywordUtil.markFailed("The Decedent SSN and Re-type Decedent SSN do not match" + Taxtype)
										resText = "Fail"
										CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
									}
							
						break
						
						
						default:
								if (WebUI.verifyTextPresent('The SSN and Re-type SSN do not match', true))
									{
										println "Taxpayer SSN Dont match text is present"
										System.out.println('Pass Record Number: ' + row)
										resText = "Pass"
										CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
									}
								else
									{
										println "Taxpayer SSN Dont match text is NOT present on " + Taxtype + "page"
										System.out.println('Fail Record Number: ' + row)
										KeywordUtil.markFailed("Taxpayer SSN Dont match text is NOT present on " + Taxtype)
										resText = "Fail"
										CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
									}
						
						break
						}
						
						
						
						
						
						
					
				}
				
		
		
		}