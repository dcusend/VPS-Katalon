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


// VT Paths
String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"

//Reports Paths
String path_Reporting = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/"
String path_Operation_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_Operational Reports/"



					// Log into Admin Suite
						CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
						
						
						// Navigate to Reports Section and select Auto Pay Payment Plan Report to verify the report is generated successfully
						WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))
						
						WebUI.click(findTestObject(path_Dashboard + 'a_Operational Reports'))				
						
						WebUI.click(findTestObject(path_Operation_Reports + 'a_Auto Pay Enrollments Report'))
						
						WebUI.verifyTextPresent('Please select a payment application on which to base this report.', false)
						
						WebUI.verifyOptionsPresent(findTestObject(path_Operation_Reports + 'select_customer'),['imtiaz'])
						
						WebUI.selectOptionByLabel(findTestObject(path_Operation_Reports + 'select_app'), 'AutoDualCFtpQA(1234567891111111)', false)
						
						WebUI.click(findTestObject(path_Operation_Reports + 'btn_Continue'))
						
						WebUI.delay(GlobalVariable.shortTimeDelay)
						WebUI.verifyTextPresent('Auto Pay Enrollments Report', false)
						
						WebUI.verifyTextPresent('Application:', false)
						
						WebUI.verifyTextPresent('AutoDualCFtpQA(1234567891111111)', false)
						
						WebUI.verifyTextPresent('Date Generated:', false)
						
						
						Date newDate = new Date()
						SimpleDateFormat dateGenerated = new SimpleDateFormat('MMMM dd, yyyy')
						String formattedDateGenerated = dateGenerated.format(newDate)
						
						WebUI.verifyTextPresent(formattedDateGenerated, false)
						
						WebUI.verifyTextPresent('Time Zone:', false)
											
						WebUI.verifyTextPresent('EDT', false)
						
			
						WebUI.verifyTextPresent('Plan ID', false)	
						
						WebUI.verifyTextPresent('128745', false)
						
						WebUI.verifyTextPresent('Plan Start Date', false)
												
						
						Date todaysDate = new Date()
						SimpleDateFormat outputFormatNew = new SimpleDateFormat('MM/dd/yyyy')
						String formattedTodaysDate = outputFormatNew.format(todaysDate)
						
						println('Todays Date is : ' + formattedTodaysDate)
						WebUI.verifyTextPresent('07/30/2026', false)
						
						WebUI.verifyTextPresent('Plan Max Amount', false)
						
						WebUI.verifyTextPresent('$0.00', false)
						
						WebUI.verifyTextPresent('Payer Name', false)
						
						WebUI.verifyTextPresent('Carlos Jacinta', false)
						
						WebUI.verifyTextPresent('Client Acct Number', false)					
						
						WebUI.verifyTextPresent('t7GOH6xn09PU', false)
						
						WebUI.verifyTextPresent('Payment Type', false)
						
						WebUI.verifyTextPresent('Credit Card', false)
						
						WebUI.verifyTextPresent('Tender Type', false)
						
						WebUI.verifyTextPresent('VI-0011', false)
						
						WebUI.verifyTextPresent('Plan Type', false)
						
						WebUI.verifyTextPresent('AUTO PAY', false)
						
						WebUI.verifyTextPresent('Expiration Date(MM-YYYY)', false)
						
						WebUI.verifyTextPresent('12-2028', false)
						
								
						WebUI.verifyTextPresent('Export Options:', false)
						
						WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_CSV'), 30)
						
						WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_EXCEL'), 30)
						
						WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_PDF'), 30)
						
						WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_XML'), 30)
						
						WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_First_Pagination'), 30)
						
						WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Last_Pagination'), 30)
						
						WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Next_Pagination'), 30)
						
						WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Previous_Pagination'), 30)
						
						
						WebUI.verifyTextPresent('Adjust Customer:', false)
						
						WebUI.verifyTextPresent('Payment Application:', false)
						
						WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'select_customer'), 30)
						
						WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'select_app'),30)
						
						WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_GO'), 30)
						
						WebUI.closeBrowser()
				
		