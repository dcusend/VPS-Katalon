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
String path_VT = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/"

// VSP Paths
String path_App_Plan = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/AddPaymentPlan/"
String path_ViewProfile = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/View Profile/"

//Reports Paths
String path_Reporting = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/"
String path_Operation_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_Operational Reports/"


// Get the Execution Profile like QA or Demo
def executionProfile = RC.getExecutionProfile()
System.out.println ("executionProfile : " + executionProfile)
String appName, appID, cardNameV, al1V, al2V, zipV, cardTypeV, last4V, paymentPlanType

String resText = "Fail"
String resColumn = "Result"
String datCloumn = "Date"
String fileLoc = "KatalonData/Bootstrap/Reporting.xlsx"


	String path = fileLoc
	nameSheet = "APPR"
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


					// Log into Admin Suite
						CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
					
					// Select the Payment Application Name
						WebUI.click(findTestObject(path_Dashboard + 'a_Access AutoDualCFtpQA'))
						
					// Select the Find Profile button
						WebUI.click(findTestObject(path_VT + 'a_Find Profile'))
						
					// Call setDataSearchProfile Method
						CustomKeywords.'vspBootstrap.SearchProfilePage.setDataSearchProfileEF'(row,dataFile)
												
						WebUI.click(findTestObject(path_ViewProfile + 'a_176234_TestPP'))
						
					// Click Add Payment Method
						WebUI.click(findTestObject(path_ViewProfile + 'button_Add Payment Plan'))
						
							paymentPlanType = dataFile.getValue("PaymentPlanType", row)
						
							if(paymentPlanType.equalsIgnoreCase("Installment")) {
                          	// Populate Payment Plan fields
		                        CustomKeywords.'vspBootstrap.AddPaymentPlanPage.setDataPaymentPlanInstallment'(row,dataFile)
		                        WebUI.delay(GlobalVariable.shortTimeDelay)	
							}
							else if(paymentPlanType.equalsIgnoreCase("Recurring")) {
							// Populate Payment Plan fields
								 CustomKeywords.'vspBootstrap.AddPaymentPlanPage.setDataPaymentPlanRecurring'(row,dataFile)
								 WebUI.delay(GlobalVariable.shortTimeDelay)							
							}
										
						
						if(WebUI.verifyTextPresent('View Payment Plan', false, FailureHandling.STOP_ON_FAILURE))
                        {
                          		String url = WebUI.getUrl()
								String paymentPlanID = url.find(/PaymentPlanID=(\d+)/) { it[1] }
								
														
								WebUI.click(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/ViewPaymentPlan/btn_return'))
						
								// Navigate to Reports Section and select Auto Pay Payment Plan Report to verify the report is generated successfully								
								WebUI.click(findTestObject(path_Dashboard + 'span_Reporting'))
								
								WebUI.click(findTestObject(path_Dashboard + 'a_Operational Reports'))
								
								
								WebUI.click(findTestObject(path_Operation_Reports + 'a_Active Payment Plan Report'))
								
								
								WebUI.verifyTextPresent('Active Payment Plan Report', false)
								
								WebUI.verifyTextPresent('Please select a payment application on which to base this report.', false)
								
								WebUI.verifyOptionsPresent(findTestObject(path_Operation_Reports + 'select_customer'),['imtiaz'])
								
								WebUI.selectOptionByLabel(findTestObject(path_Operation_Reports + 'select_app'), 'AutoDualCFtpQA(1234567891111111)', false)
								
								WebUI.click(findTestObject(path_Operation_Reports + 'btn_Continue'))
								
								// Verify Text and Elements at APPR Page
								
//								WebUI.verifyTextPresent('Active Payment Plan Report', false)								
								
								WebUI.verifyTextPresent('Application:', false)
								
								WebUI.verifyTextPresent('AutoDualCFtpQA(1234567891111111)', false)
								
								WebUI.verifyTextPresent('Date Generated:', false)
								
								Date todaysDate = new Date()
								
								println(todaysDate)
								
								SimpleDateFormat outputFormat = new SimpleDateFormat('MMMM dd, yyyy')
								String formatted = outputFormat.format(todaysDate)
								
								println('Formatted Date: ' + formatted)
								
								WebUI.verifyTextPresent(formatted, false)
								
								WebUI.verifyTextPresent('Time Zone:', false)
								
								WebUI.verifyTextPresent('EDT', false)
								
								WebUI.verifyTextPresent('Payment Plan ID', false)
								
								WebUI.verifyTextPresent('Payer Name', false)
								
								WebUI.verifyTextPresent('Total Plan Amount', false)	
								
								WebUI.verifyTextPresent('Plan Type', false)

								WebUI.verifyTextPresent('Plan Frequency', false)
																
								WebUI.verifyTextPresent('Payment Type', false)
																
								WebUI.verifyTextPresent(paymentPlanID, false)
								
								WebUI.verifyTextPresent('Testpayment planreport', false)
								
								
								
								if(paymentPlanType.equalsIgnoreCase("Installment")) {
									WebUI.verifyTextPresent('Installment Plan', false)
									WebUI.verifyTextPresent('Weekly', false)
									WebUI.verifyTextPresent('$10.00', false)
								}
								else if(paymentPlanType.equalsIgnoreCase("Recurring")) {
									WebUI.verifyTextPresent('Recurring', false)	
									WebUI.verifyTextPresent('Monthly', false)	
									WebUI.verifyTextPresent('N/A', false)
								}
								
								WebUI.verifyTextPresent('Credit Card', false)
								
								WebUI.verifyTextPresent('Export Options:', false)
								
								WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_CSV'), 30)
								
								WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_EXCEL'), 30)
								
								WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_PDF'), 30)
								
								WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'a_btn_XML'), 30)
								
								WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_First_Pagination'), 30)
								
								WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Last_Pagination'), 30)
								
								WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Next_Pagination'), 30)
								
								WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'link_Previous_Pagination'), 30)
								
								
								WebUI.verifyTextPresent('Customer:', false)
								
								WebUI.verifyTextPresent('Payment Application:', false)
								
								WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'select_customer'), 30)
								
								WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'select_app'),30)
								
								WebUI.verifyElementPresent(findTestObject(path_Operation_Reports + 'btn_GO'), 30)
								
								TestObject planID = new TestObject()
								planID.addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, "//a[@href=\"javascript:showDetail('" + paymentPlanID + "')\"]")
								
								WebUI.delay(GlobalVariable.shortTimeDelay)
							
								WebUI.click(planID)
								
								WebUI.verifyTextPresent('Payment Plan Detail', false)
								
								WebUI.verifyTextPresent('Payment Plan ID:  ' + paymentPlanID , false)
																
								WebUI.verifyTextPresent('Payer Name:  Testpayment planreport', false)
																
								WebUI.verifyTextPresent('Client Acct Number: ', false)
								
								WebUI.verifyTextPresent('Bill Lookup 1:', false)
								
								WebUI.verifyTextPresent('Bill Lookup 2:', false)
								
								WebUI.verifyTextPresent('Bill Lookup 3:', false)
								
								
								
								SimpleDateFormat outputFormatNew = new SimpleDateFormat('MM/dd/yyyy')
								String formattedTodaysDate = outputFormatNew.format(todaysDate)
								
								Calendar calendar = Calendar.getInstance()
								calendar.setTime(todaysDate)
								calendar.add(Calendar.DAY_OF_MONTH, 1)
								Date tomorrowDate = calendar.getTime()
								String formattedTomDate = outputFormatNew.format(tomorrowDate)
								
								Calendar calendarWeek = Calendar.getInstance()
								calendarWeek.setTime(todaysDate)
								calendarWeek.add(Calendar.DAY_OF_MONTH, 8)
								Date WeekDate = calendarWeek.getTime()
								String formattedWeekDate = outputFormatNew.format(WeekDate)
								
								println('Formatted Todays Date: ' + formattedTodaysDate)
								
								println('Formatted Tomorrows Date: ' + formattedTomDate)
								
								println('Formatted Week Date: ' + formattedWeekDate)
																
//								WebUI.verifyTextPresent(formattedTomDate, false)
								
								WebUI.verifyTextPresent('Plan Create Date:  ' + formattedTodaysDate, false)
								
								WebUI.verifyTextPresent('Plan Start Date:  ' + formattedTomDate, false)
								
												
								if(paymentPlanType.equalsIgnoreCase("Installment")) {								
									WebUI.verifyTextPresent('Plan End Date:  ' + formattedWeekDate, false)
										
									WebUI.verifyTextPresent('Total Plan Amount:  $10.00', false)
								
									WebUI.verifyTextPresent('Remaining Plan Amount:  $10.00', false)
																
									WebUI.verifyTextPresent('Plan Type:  Installment Plan', false)
									
									WebUI.verifyTextPresent('Plan Frequency:  Weekly', false)
									
								}
								else if(paymentPlanType.equalsIgnoreCase("Recurring")) {
								
									WebUI.verifyTextPresent('Plan End Date:  N/A', false)
									
									WebUI.verifyTextPresent('Total Plan Amount:  N/A', false)
									WebUI.verifyTextPresent('Remaining Plan Amount:  N/A', false)
																	
									WebUI.verifyTextPresent('Plan Type:  Recurring', false)
								
									WebUI.verifyTextPresent('Plan Frequency:  Monthly', false)
									
								}
								
								WebUI.verifyTextPresent('Total Number of Plan Payments:  2', false)
															
								WebUI.verifyTextPresent('Original Bill Amount:  N/A', false)
								
														
								WebUI.verifyTextPresent('Individual Payment Amount:  $10.00', false)
															
								WebUI.verifyTextPresent('Fee Amount:  $0.00', false)
																
								WebUI.verifyTextPresent('Number of Processed Payments:  0', false)
															
								WebUI.verifyTextPresent('Payment Type:  Credit Card', false)
								
//								WebUI.click(findTestObject(path_Operation_Reports + 'btn_close'))
								
//								WebUI.click(findTestObject(path_Dashboard + 'span_Dashboard'))
							
								WebUI.navigateToUrl(GlobalVariable.AdminSuiteURL)	
								
								// Select the Payment Application Name
								WebUI.click(findTestObject(path_Dashboard + 'a_Access AutoDualCFtpQA'))
								
							// Select the Find Profile button
								WebUI.click(findTestObject(path_VT + 'a_Find Profile'))
								
							// Call setDataSearchProfile Method
								CustomKeywords.'vspBootstrap.SearchProfilePage.setDataSearchProfileEF'(row,dataFile)
														
								WebUI.click(findTestObject(path_ViewProfile + 'a_176234_TestPP'))
								
								//Get Payment Plan ID from URL and call DeletePaymentPlan method to delete the payment plan created															
								CustomKeywords.'vspBootstrap.DeletePaymentPlan.deletePaymentPlan'(paymentPlanID)
							
								KeywordUtil.markPassed("Active Payment Plan Report is generated successfully and verified the details of the payment plan created")
								resText = "Pass"
								println row
								CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
                        }
						else
                        {
                            KeywordUtil.markFailed("Payment Plan is not created successfully")
                            resText = "Fail"
                            CustomKeywords.'pages.WriteExcel.demoKey'(resText,datText,resColumn,datCloumn,fileLoc,nameSheet,row)
                        }
				
				
						WebUI.closeBrowser()
	
				}
	
	
		}
