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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.text.SimpleDateFormat
import java.util.Calendar


String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"

String path_VT = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/"

String path_Reporting = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/"

String path_Operation_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_Operational Reports/"


String resText = "Fail"
//String datText = today
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/Bootstrap/Reporting.xlsx"
def numOfRows, dataFile, nameSheet


String path = fileLoc
nameSheet = "ER_SR"
dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)
numOfRows = dataFile.getRowNumbers()



// For each row in the spreadsheet, execute the given steps
for (def row = 1; row <= numOfRows; row++)
	{
		
				ExecuteTC = dataFile.getValue("Execute", row)
				System.out.println('Value of Execute is : ' + ExecuteTC)
	
		if (ExecuteTC.equalsIgnoreCase("Y"))
			{
				System.out.println('Begin Record Number: ' + row)
	
				Date today = new Date()
				println (today)
				String datText = today
				
				
			ExecuteTC = dataFile.getValue("Execute", row)
			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			
			CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()
			
			WebUI.delay(GlobalVariable.shortTimeDelay)
			
			// Select the Payment Application Name
			WebUI.click(findTestObject(path_Dashboard + 'a_Access AutoDualCFtpQA'))
			
			WebUI.click(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
			
			WebUI.click(findTestObject(path_VT + 'a_KeyboardEntry_Sale'))

			CustomKeywords.'adminSuiteBootstrap.virtualTerminalSetData.saleKeyboard_DataDriven_EF'(row,dataFile)			
			
			if(WebUI.verifyTextPresent('Reason: The credit card type you submitted is not supported. Please choose a different card type.', false)) {
				
				WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))
				
				WebUI.click(findTestObject(path_Dashboard + 'a_Operational Reports'))
				
				WebUI.delay(GlobalVariable.shortTimeDelay)
				
				WebUI.click(findTestObject(path_Operation_Reports + 'a_Exceptions Report'))
				
				WebUI.selectOptionByValue(findTestObject(path_Operation_Reports + 'select_customer'),'108', false)
				
				WebUI.selectOptionByLabel(findTestObject(path_Operation_Reports + 'select_app'), 'AutoDualCFtpQA(1234567891111111)', false)
				
				WebUI.click(findTestObject(path_Operation_Reports + 'btn_Continue'))
				
				WebUI.selectOptionByValue(findTestObject(path_Operation_Reports + 'date_range_options'), 'today', false)
				
				WebUI.click(findTestObject(path_Operation_Reports + 'btn_report'))
				
				WebUI.delay(GlobalVariable.shortTimeDelay)
				
			           
                
				WebUI.verifyTextPresent('Exceptions Report', false)
								
				WebUI.verifyTextPresent('Application', false)
				
				WebUI.verifyTextPresent('AutoDualCFtpQA(1234567891111111)', false)
				
				WebUI.verifyTextPresent('Date Range:', false)
				
				Date todaysDate = new Date()
				println(todaysDate)
				
				// Calculate previous month's first and last dates
				Calendar calendar = Calendar.getInstance()
				calendar.setTime(todaysDate)
				
				SimpleDateFormat dateOnlyFormat = new SimpleDateFormat('MM/dd/yyyy')
				String formattedTodaysDate = dateOnlyFormat.format(todaysDate)
								
				
				WebUI.verifyTextPresent(formattedTodaysDate + ' 00:00 — ' + formattedTodaysDate + ' 23:59.', false)
				
				WebUI.verifyTextPresent('Date Generated:', false)
				
				SimpleDateFormat outputFormat = new SimpleDateFormat('MMMM dd, yyyy')
				String formattedDate = outputFormat.format(todaysDate)
				
				println('Formatted Date: ' + formattedDate)
				
				WebUI.verifyTextPresent(formattedDate, false)
				
				WebUI.verifyTextPresent('Time Zone:', false)
				WebUI.verifyTextPresent('EDT', false)
				
							// If the page shows "Nothing found to display." (or "No items found."), retry by clicking GO
							// Use FailureHandling.OPTIONAL so verifyTextPresent returns false instead of throwing when not found
							int retry = 0
							int maxRetries = 6 // try up to ~6 times (adjust as needed)
							
							
							while ((WebUI.verifyTextPresent('Nothing found to display.', false, FailureHandling.OPTIONAL) ||
								   WebUI.verifyTextPresent('No items found.', false, FailureHandling.OPTIONAL)) && retry < maxRetries) {
								KeywordUtil.logInfo("Results not found yet - retry #" + (retry + 1) + " - will wait and click GO")
								// wait a bit for backend processing (seconds)
								WebUI.delay(120)
								WebUI.click(findTestObject(path_Operation_Reports + 'btn_GO'))
								retry++
							}
							if (retry >= maxRetries) {
								KeywordUtil.logInfo('Max retries reached and results still not found.')
							}
				
				WebUI.verifyTextPresent('Date', false)
				
				WebUI.verifyTextPresent('Number of CC Exceptions', false)
				
				WebUI.verifyTextPresent('Number of ACH Exceptions', false)
				
				WebUI.verifyTextPresent('Total', false)
				
				
			
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_First_Pagination'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Last_Pagination'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Next_Pagination'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Previous_Pagination'), 30)
				
				WebUI.verifyTextPresent('Adjust Dates:', false)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'startDate'), 30)
				
				WebUI.verifyTextPresent('to', false)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'endDate'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_GO'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_newreport'), 30)
				
				if(formattedDate)  {
				WebUI.verifyTextPresent(formattedDate, false)
					
				TestObject dateBtn = new TestObject()
				dateBtn.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, "//a[@href=\"javascript:goDetailForm('" + formattedTodaysDate + "')\"]")
				
				WebUI.click(dateBtn)
				
				
				WebUI.verifyTextPresent('Export Options:', false)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_CSV'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_EXCEL'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_PDF'), 30)
				
				WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_XML'), 30)
				
				
				WebUI.verifyTextPresent('Transaction ID', false)
				
				WebUI.verifyTextPresent('Type', false)
				
				WebUI.verifyTextPresent('Date', false)
				
				WebUI.verifyTextPresent('Total Amount', false)
				
				WebUI.verifyTextPresent('Payer Name', false)
				
				WebUI.verifyTextPresent('Client Acct Number', false)
				
				WebUI.verifyTextPresent('Reason', false)

				WebUI.verifyTextPresent('Pay Now', false)
				
				WebUI.verifyTextPresent('$10.01', false)
				
				WebUI.verifyTextPresent('Florea', false)
				
				WebUI.verifyTextPresent('The credit card type you submitted is not supported. Please choose a different card type.', false)
			
							// --- begin: find specific row link by multiple td conditions and get its href ---
							// Adjust these values as needed (or replace with variables computed earlier)
							String timeString = formattedTodaysDate 
							String amount = '$10.01'
							String lastName = 'Florea'
							String messageSnippet = 'The credit card type you submitted is not supported. Please choose a different card type.'
			
							String xpathRowLink = "//tr[normalize-space(td[2])='Pay Now' and contains(normalize-space(td[3]), '" + timeString + "') and normalize-space(td[4])='" + amount + "' and normalize-space(td[5])='" + lastName + "' and contains(normalize-space(td[7]), '" + messageSnippet + "')]/td[1]/a"
			
							TestObject rowLinkObj = new TestObject('dynamicRowLink')
							rowLinkObj.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, xpathRowLink)
			
							println(rowLinkObj)
							if (WebUI.verifyElementPresent(rowLinkObj, 5, FailureHandling.OPTIONAL)) {
								String href = WebUI.getAttribute(rowLinkObj, 'href')
								KeywordUtil.logInfo('Found href: ' + href)
								// extract tid param if present
								def m = (href =~ /[?&]tid=(\d+)/)
								String tid = ''
								if (m) {
									 tid = m[0][1]
									KeywordUtil.logInfo('Extracted tid: ' + tid)
								} else {
									KeywordUtil.logInfo('No tid parameter found in href')
								}
				
								// Optional: click the link to navigate to transaction detail
								 WebUI.click(rowLinkObj)
								 
								 WebUI.delay(GlobalVariable.shortTimeDelay)
								//	Verify Transaction Details Page 
								 
								 WebUI.verifyTextPresent('Transaction Details', false)
								 
								 WebUI.verifyTextPresent('Transaction ID', false)
								 
								 WebUI.verifyTextPresent(tid, false)
								 
								 WebUI.verifyTextPresent('Tender Type', false)
								 
								 WebUI.verifyTextPresent('Credit Card', false)
								 
								 WebUI.verifyTextPresent('Transaction Type', false)
								 
								 WebUI.verifyTextPresent('Authorization and Capture', false)
								 				
								 WebUI.verifyTextPresent('Remittance ID', false)
								 
								 WebUI.verifyTextPresent('Remittance ID', false)
								 
								 WebUI.verifyTextPresent('Client Account Number', false)
								 
								 WebUI.verifyTextPresent('Tax Amount', false)
								 
								 WebUI.verifyTextPresent('$0.00', false)
								 
								 WebUI.verifyTextPresent('Total Amount', false)
								 							 
								 WebUI.verifyTextPresent(amount, false)
								 
								 WebUI.verifyTextPresent('Transaction Date', false)
								 
								 WebUI.verifyTextPresent('Parent Transaction', false)
								 						 
								 WebUI.verifyTextPresent('Status', false)
								 
								 WebUI.verifyTextPresent('Failure', false)
								 
								 WebUI.verifyTextPresent('Fail Message', false)
								 
								 WebUI.verifyTextPresent('The credit card type you submitted is not supported. Please choose a different card type. [Card type not valid]', false)
								 
								 WebUI.verifyTextPresent('Received Via', false)
								 
								 WebUI.verifyTextPresent('Virtual Terminal', false)
								 
								 WebUI.verifyTextPresent('AVS Response', false)
								 
								 WebUI.verifyTextPresent('Approval Code', false)
								 
								 WebUI.verifyTextPresent('Transaction Posted by', false)
								 
								 WebUI.verifyTextPresent('Phone Number', false)
								 
								 WebUI.verifyTextPresent('Credit Card Information', false)
								 
								 WebUI.verifyTextPresent('Company', false)
								 								 
								 WebUI.verifyTextPresent('Name on Card', false)
								 
								 WebUI.verifyTextPresent(lastName, false)
								 
								 WebUI.verifyTextPresent('Address Line 1', false)
								 
								 WebUI.verifyTextPresent('City', false)
								 
								 WebUI.verifyTextPresent('State', false)
								 
								 WebUI.verifyTextPresent('ZIP Code', false)
								 
								 WebUI.verifyTextPresent('Country', false)
								 
								 WebUI.verifyTextPresent('Card Type', false)
								 
								 WebUI.verifyTextPresent('Partial Card Number', false)
								 
								 WebUI.verifyTextPresent('Expiration Date', false)
								 
								 WebUI.verifyTextPresent('Custom Information', false)
								 
								 WebUI.verifyTextPresent('Payment Application', false)
								 
								 WebUI.verifyTextPresent('AutoDualCFtpQA', false)
								 
								 WebUI.verifyTextPresent('UDF1', false)
								 
								 WebUI.verifyTextPresent('UDF6', false)
								 		 
								 
								 
							} else {
								KeywordUtil.logInfo('No matching row link found for XPath: ' + xpathRowLink)
							}
							// --- end
				}
				else {
                    KeywordUtil.logInfo('Condition not met: "Nothing found to display" was not present after waiting.')
				}
				
				WebUI.closeBrowser()
			}
				
			}
	}



