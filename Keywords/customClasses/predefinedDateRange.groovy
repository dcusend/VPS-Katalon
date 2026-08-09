package customClasses

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import java.time.LocalDate
import java.time.format.DateTimeFormatter

public class predefinedDateRange {
	
	String path_User_Reports = "Object Repository/AdminSuiteBootstrap_Pages/Reporting_Bootstrap/Page_User Reports/"
	

	def verifyPredefinedDateRangeOptions() {
	
		def totalOptionsDateRange = WebUI.getNumberOfTotalOption(findTestObject(path_User_Reports + 'date_range_options'))
		WebUI.verifyEqual(totalOptionsDateRange, 7)
		
		WebUI.verifyOptionsPresent(findTestObject(path_User_Reports + 'date_range_options'),['-- Select a Predefined Range --','Today','Yesterday','This Week','Last Week','This Month','Last Month'])
		
	}
	
	
	def selectDateRange(value) {
		
		
		switch(value) {
			
			case "today":
		        WebUI.selectOptionByValue(findTestObject(path_User_Reports + 'date_range_options'), value, false)
				
				WebUI.verifyTextPresent('Start Date and Time:', false)
				String startDate = WebUI.getAttribute(findTestObject(path_User_Reports + 'transaction_start_date'), 'value')
				
				Date todaysDate = new Date() 
					
				WebUI.verifyMatch(startDate, todaysDate.format("MM/dd/yyyy") + " 00:00", false)
				
				WebUI.verifyTextPresent('End Date and Time:', false)
				
				String endDate = WebUI.getAttribute(findTestObject(path_User_Reports + 'transaction_end_date'), 'value')
				
				WebUI.verifyMatch(endDate, todaysDate.format("MM/dd/yyyy") + " 23:59", false)
				break;
				
			case "yesterday":
                WebUI.selectOptionByValue(findTestObject(path_User_Reports + 'date_range_options'), value, false)
                
                WebUI.verifyTextPresent('Start Date and Time:', false)
                String startDate = WebUI.getAttribute(findTestObject(path_User_Reports + 'transaction_start_date'), 'value')
                
                Date yesterdaysDate = new Date() 
                yesterdaysDate = yesterdaysDate - 1
                    
                WebUI.verifyMatch(startDate, yesterdaysDate.format("MM/dd/yyyy") + " 00:00", false)
                
                WebUI.verifyTextPresent('End Date and Time:', false)
                
                String endDate = WebUI.getAttribute(findTestObject(path_User_Reports + 'transaction_end_date'), 'value')
                
                WebUI.verifyMatch(endDate, yesterdaysDate.format("MM/dd/yyyy") + " 23:59", false)
                break;
				
			case "thisWeek":
                WebUI.selectOptionByValue(findTestObject(path_User_Reports + 'date_range_options'), value, false)
                
                WebUI.verifyTextPresent('Start Date and Time:', false)
                String startDate = WebUI.getAttribute(findTestObject(path_User_Reports + 'transaction_start_date'), 'value')
                
                Date todaysDate = new Date() 
                Date firstDayOfWeek = todaysDate - todaysDate.format("u").toInteger() + 1 // Get the first day of the week (Monday)
                Date lastDayOfWeek = todaysDate + (7 - todaysDate.format("u").toInteger()) // Get the last day of the week (Sunday)
				
                WebUI.verifyMatch(startDate, firstDayOfWeek.format("MM/dd/yyyy") + " 00:00", false)
                
                WebUI.verifyTextPresent('End Date and Time:', false)
                
                String endDate = WebUI.getAttribute(findTestObject(path_User_Reports + 'transaction_end_date'), 'value')
                
                WebUI.verifyMatch(endDate, lastDayOfWeek.format("MM/dd/yyyy") + " 23:59", false)
                break;
				
				case "lastWeek":
                WebUI.selectOptionByValue(findTestObject(path_User_Reports + 'date_range_options'), value, false)
                
                WebUI.verifyTextPresent('Start Date and Time:', false)
                String startDate = WebUI.getAttribute(findTestObject(path_User_Reports + 'transaction_start_date'), 'value')
                
                Date todaysDate = new Date() 
                Date firstDayOfLastWeek = todaysDate - todaysDate.format("u").toInteger() - 6 // Get the first day of last week (Monday)
                Date lastDayOfLastWeek = todaysDate - todaysDate.format("u").toInteger() // Get the last day of last week (Sunday)
                
                WebUI.verifyMatch(startDate, firstDayOfLastWeek.format("MM/dd/yyyy") + " 00:00", false)
                
                WebUI.verifyTextPresent('End Date and Time:', false)
                
                String endDate = WebUI.getAttribute(findTestObject(path_User_Reports + 'transaction_end_date'), 'value')
                
                WebUI.verifyMatch(endDate, lastDayOfLastWeek.format("MM/dd/yyyy") + " 23:59", false)
                break;
				
				case "thisMonth":
                WebUI.selectOptionByValue(findTestObject(path_User_Reports + 'date_range_options'), value, false)
                
                WebUI.verifyTextPresent('Start Date and Time:', false)
                String startDate = WebUI.getAttribute(findTestObject(path_User_Reports + 'transaction_start_date'), 'value')
                
                LocalDate today = LocalDate.now()
                String firstDayStr = today.withDayOfMonth(1).format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))
                String lastDayStr = today.withDayOfMonth(today.lengthOfMonth()).format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))

                WebUI.verifyMatch(startDate, firstDayStr + " 00:00", false)

                WebUI.verifyTextPresent('End Date and Time:', false)

                String endDate = WebUI.getAttribute(findTestObject(path_User_Reports + 'transaction_end_date'), 'value')

                WebUI.verifyMatch(endDate, lastDayStr + " 23:59", false)
                break;
				
				case "lastMonth":
				WebUI.selectOptionByValue(findTestObject(path_User_Reports + 'date_range_options'), value, false)
                
                WebUI.verifyTextPresent('Start Date and Time:', false)
                String startDate = WebUI.getAttribute(findTestObject(path_User_Reports + 'transaction_start_date'), 'value')
                
                LocalDate today = LocalDate.now()
                LocalDate firstDayLastMonth = today.minusMonths(1).withDayOfMonth(1)
                LocalDate lastDayLastMonth = today.minusMonths(1).withDayOfMonth(today.minusMonths(1).lengthOfMonth())

                WebUI.verifyMatch(startDate, firstDayLastMonth.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + " 00:00", false)

                WebUI.verifyTextPresent('End Date and Time:', false)

                String endDate = WebUI.getAttribute(findTestObject(path_User_Reports + 'transaction_end_date'), 'value')

                WebUI.verifyMatch(endDate, lastDayLastMonth.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + " 23:59", false)
                break;
				

		}
		
    }
	
}
