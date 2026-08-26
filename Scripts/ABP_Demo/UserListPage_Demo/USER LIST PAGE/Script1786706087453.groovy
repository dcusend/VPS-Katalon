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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.transform.ThreadInterrupt
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testdata.reader.ExcelFactory
import internal.GlobalVariable
import java.text.SimpleDateFormat

import com.kms.katalon.core.configuration.RunConfiguration as RC

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.apache.poi.ss.usermodel.*
import java.io.FileOutputStream


//*******************Created by @Bharat Bhushan***************************************************


def shortDelay = GlobalVariable.shortDelay
def abpURL, username, password 

def executionProfile = RC.getExecutionProfile()


switch(executionProfile)
{
	
	case "QAProfile":
			abpURL = "https://qa.velocitypayment.com/vbills/imtiazcustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
	
		break
		
	case "QA2Profile":
			abpURL = "https://qa2.velocitypayment.com/vbills/imtiazcustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
		
		break
			
	case "DemoProfile":
			abpURL = "https://demo.velocitypayment.com/vbills/imtiazdemocustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword
	
		break
		
	case "Production":
			abpURL = "https://qa2.velocitypayment.com/vbills/imtiazcustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword

		break
				
	case "Upgrade":
			abpURL = "https://qa2.velocitypayment.com/vbills/imtiazcustomer/login.go"
			username = GlobalVariable.abpDCFUsername
			password = GlobalVariable.abpDCFPassword

		break
		
}
	
	
WebUI.openBrowser(abpURL)
WebUI.maximizeWindow()

CustomKeywords.'abpPages.LoginPage.setLoginDataMethod'(username, password)

CustomKeywords.'abpPages.PendingBillPage.clickUserList'()

////////////////////////////////////////////////////////////////////////////////////////

//Note- If We Need Only User Name and Href IDs

//WebDriver driver = DriverFactory.getWebDriver()
//
//List<WebElement> rows = driver.findElements(By.xpath("//table//tr[position() > 1]"))	
//		
//rows.each { row ->
//	
//		String userName = row.findElement(By.xpath("./td[1]")).getText().trim()
//	
//		String editHref = row.findElement(
//				By.xpath(".//a[contains(text(),'edit')]")
//		).getAttribute("href")
//	
//		String editId = (editHref =~ /id=(\d+)/)[0][1]
//	
//		println "${userName} -> href Id: ${editId}"
//      
//	 }

////////////////////////////////////////////////////////////////////////////////////////

//Note- To Print Entire Table HTML Content in Katalon

//WebUI.delay(2)
//
//def driver = DriverFactory.getWebDriver()
//
//List<WebElement> tables = driver.findElements(By.tagName("table"))
//
//println "Total Tables: ${tables.size()}"
//
//tables.eachWithIndex { table, index ->
//    println "Table ${index + 1}"
//    println table.getAttribute("outerHTML")
//}


//////////////////////////////////////////////////////////////////////////////////////
//Extracting data of User List page

WebUI.delay(2)

def driver = DriverFactory.getWebDriver()

// Get all rows except the header row
List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'billTable')]//tbody/tr"))

List<Map> userDataList = []

rows.each { row ->

    List<WebElement> cols = row.findElements(By.tagName("td"))

    if (cols.size() < 3) {
        println "Skipping row: ${row.getText()}"
        return
    }

    Map userData = [:]

    userData.userName = cols[0].getText().trim()
    userData.name     = cols[1].getText().trim()
    userData.role     = cols[2].getText().trim()

	// Edit Link
	WebElement editLink = row.findElement(By.xpath(".//a[contains(text(),'edit')]"))

	userData.editLink = editLink.getAttribute("href")

	// Extract Edit ID
	def editMatcher = (userData.editLink =~ /id=(\d+)/)
	userData.editId = editMatcher.find() ? editMatcher.group(1) : ""

	// Delete Link & ID
	List<WebElement> deleteLinks = row.findElements(By.xpath(".//a[contains(text(),'delete')]"))

	if (!deleteLinks.isEmpty()) {

		String onclick = deleteLinks[0].getAttribute("onclick")

		def urlMatcher = (onclick =~ /'(\/vbills.*?id=\d+)'/)
		userData.deleteLink = urlMatcher.find() ? urlMatcher.group(1) : ""

		def deleteMatcher = (onclick =~ /id=(\d+)/)
		userData.deleteId = deleteMatcher.find() ? deleteMatcher.group(1) : ""

	} else {

		userData.deleteLink = ""
		userData.deleteId = ""
	}

	userDataList.add(userData)
}


println "Rows Found = ${rows.size()}"

// Print all extracted records
userDataList.eachWithIndex { user, index ->
	
	println "==============================="
	println "Record #${index + 1}"
	println "User Name : ${user.userName}"
	println "Name : ${user.name}"
	println "Role : ${user.role}"
	println "Edit Link : ${user.editLink}"
	println "Edit ID : ${user.editId}"
	println "Delete Link : ${user.deleteLink}"
	println "Delete ID : ${user.deleteId}"
		
}

//Generating results in Excel(ref 'Reports' folder)

String outputFile = "Reports/ABP_UserList_Report.xlsx"

Workbook workbook = new XSSFWorkbook()
Sheet sheet = workbook.createSheet("Users")

// Header Row
Row header = sheet.createRow(0)

header.createCell(0).setCellValue("User Name")
header.createCell(1).setCellValue("Name")
header.createCell(2).setCellValue("Role")
header.createCell(3).setCellValue("Edit Link")
header.createCell(4).setCellValue("Edit ID")
header.createCell(5).setCellValue("Delete Link")
header.createCell(6).setCellValue("Delete ID")

// Data Rows
userDataList.eachWithIndex { user, index ->

	Row row = sheet.createRow(index + 1)

	row.createCell(0).setCellValue(user.userName ?: "")
	row.createCell(1).setCellValue(user.name ?: "")
	row.createCell(2).setCellValue(user.role ?: "")
	row.createCell(3).setCellValue(user.editLink ?: "")
	row.createCell(4).setCellValue(user.editId ?: "")
	row.createCell(5).setCellValue(user.deleteLink ?: "")
	row.createCell(6).setCellValue(user.deleteId ?: "")
}

// Auto-size columns
(0..6).each { sheet.autoSizeColumn(it) }

// Save file
FileOutputStream fos = new FileOutputStream(outputFile)
workbook.write(fos)

fos.close()
workbook.close()

println "Excel report generated successfully: ${outputFile}"


//////////////////////////////////////////////////////////////////////////////////////////
//for Manual way:

//Navigate to 'User List' page.
//Inspect it in Console.
//Run this in Console- document.querySelector('table.billTable').outerHTML
//Collect this output and paste in Microsoft Copilot.
//It can generate extracted data in any desirable format.


