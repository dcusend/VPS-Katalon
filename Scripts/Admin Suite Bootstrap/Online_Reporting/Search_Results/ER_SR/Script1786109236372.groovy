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
//for (def row = 1; row <= numOfRows; row++)
//	{
//		
//				ExecuteTC = dataFile.getValue("Execute", row)
//				System.out.println('Value of Execute is : ' + ExecuteTC)
//	
//		if (ExecuteTC.equalsIgnoreCase("Y"))
//			{
//				System.out.println('Begin Record Number: ' + row)
//	
//				Date today = new Date()
//				println (today)
//				String datText = today
//				
//				
//			ExecuteTC = dataFile.getValue("Execute", row)
//			System.out.println('Value of Execute is : ' + ExecuteTC)
			
			
			CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite_AdminUser'()
			
//			WebUI.delay(GlobalVariable.shortTimeDelay)
//			
//			// Select the Payment Application Name
//			WebUI.click(findTestObject(path_Dashboard + 'a_Access AutoDualCFtpQA'))
//			
//			WebUI.click(findTestObject(path_VT + 'button_Authorization  Capture (Sale)'))
//			
//			WebUI.click(findTestObject(path_VT + 'a_KeyboardEntry_Sale'))
//
//			CustomKeywords.'adminSuiteBootstrap.virtualTerminalSetData.saleKeyboard_DataDriven_EF'(row,dataFile)			
//			
//			if(WebUI.verifyTextPresent('Reason: The credit card type you submitted is not supported. Please choose a different card type.', false)) {
//				
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
				
				
				WebUI.verifyTextPresent('EDT', false)
				
				boolean isConditionMet = false
				
				while (!isConditionMet ) {
					
					isConditionMet = WebUI.verifyTextPresent('Nothing found to display.', false) && WebUI.verifyTextPresent('No items found.', false)
					
					if(isConditionMet) {						
						WebUI.delay('120')
						WebUI.click(findTestObject(path_Operation_Reports + 'btn_GO'))
                    } 
					else {
                        isConditionMet = true
                    }

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
								 
								 
								//	Verify Transaction Details Page 
								 
								 WebUI.verifyTextPresent('Transaction Details', false)
								 
								 WebUI.verifyTextPresent('Transaction ID:', false)
								 
								 WebUI.verifyTextPresent(tid, false)
								 
								 WebUI.verifyTextPresent('Tender Type', false)
								 
								 WebUI.verifyTextPresent('Credit Card', false)
								 
								 WebUI.verifyTextPresent('Transaction Type', false)
								 
								 WebUI.verifyTextPresent('Authorization and Capture', false)
								 							 
								 WebUI.verifyTextPresent('Total Amount', false)
								 
								 WebUI.verifyTextPresent(amount, false)
								 
								 WebUI.verifyTextPresent('Status', false)
								 
								 WebUI.verifyTextPresent('Name on Card', false)
								 
								 WebUI.verifyTextPresent(lastName, false)
								 
								 
								 
								 
							} else {
								KeywordUtil.logInfo('No matching row link found for XPath: ' + xpathRowLink)
							}
							// --- end
				}
				else {
                    KeywordUtil.logInfo('Condition not met: "Nothing found to display" was not present after waiting.')
				}
//			}
//				
//			}
//	}



