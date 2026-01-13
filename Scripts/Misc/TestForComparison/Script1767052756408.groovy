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


def mainStr = "Bills Label,Due Date,Date Submitted,Date Modified,Amount Due,Amount to Pay,ImtiazABPdoubleCFBills,EST,UDF1:,	udf data 1,UDF2:,udf data 2,UDF3:,udf3,UDF4:,udf data4,2. Payment Method"

def VerificationText = "UDF1:,udf data 1,UDFS2:,udf data 2,UDF3:,udf3,UDF4:,udf data4"
def stringArray = VerificationText.split(",")

// Assume all are present until proven otherwise
boolean isRequiredTextPresent = true

for (def item in stringArray) {
    def trimmed = item.trim()
    //boolean found = WebUI.verifyTextPresent(trimmed, false)  // returns boolean
	boolean found = mainStr.contains(trimmed)  // returns boolean

    if (!found) {
        println("${trimmed} text is missing")
        isRequiredTextPresent = false
        // Optionally: break  // fail fast if one missing is enough to fail
    }
}

if (isRequiredTextPresent) {
    println "Pass"
} else {
    println "Fail"
}

