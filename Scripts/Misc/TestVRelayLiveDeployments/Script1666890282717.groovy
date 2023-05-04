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

String resText = 'Fail'

//String datText = today
String resColumn = 'Result'

String datCloumn = 'Date'

//String fileLoc = "C:\\KatalonData\\VLinkCCTestData.xlsx"
//String fileLoc = 'KatalonData/vrelay_2022.xlsx'
String fileLoc = 'KatalonData/vrelay_2023.xlsx'

String nameSheet = 'Sheet1'

//def numOfRows = findTestData('Misc/VRelayLiveAppsData').getRowNumbers()
def numOfRows = findTestData('Misc/VRelayLiveAppsData2023').getRowNumbers()

println('Number of Records: ' + numOfRows)

//def dataFile = 'Misc/VRelayLiveAppsData'
def dataFile = 'Misc/VRelayLiveAppsData2023'

// For each row in the spreadsheet, execute the given steps
for (def row = 1; row <= numOfRows; row++) {
    // Check if Execute = Y
    ExecuteTC = findTestData(dataFile).getValue('Execute', row)

    System.out.println('Value of Execute is : ' + ExecuteTC)

    if (ExecuteTC.equalsIgnoreCase('Y')) {
        System.out.println('Begin Record Number: ' + row)

        Date today = new Date()

        println(today)

        String datText = today

        def appID = findTestData(dataFile).getValue('application_id', row)

        def messageVersion = findTestData(dataFile).getValue('message_version', row)

        WebUI.openBrowser('')

        WebUI.navigateToUrl('https://dev-algorithm.govolution.com/vrelaytest/Upgrade/version_2_2/vrelaytest.html')

        WebUI.maximizeWindow()

       // String numWihoutDecimal = String.valueOf(appID).split('\\.')[0]

        //WebUI.setText(findTestObject('Object Repository/Misc/Page_VRelayLiveApps/input_application_id_application_id'), 
        //    numWihoutDecimal)

        //println(numWihoutDecimal)

		WebUI.setText(findTestObject('Object Repository/Misc/Page_VRelayLiveApps/input_application_id_application_id'),appID)

		
		WebUI.setText(findTestObject('Object Repository/Misc/Page_VRelayLiveApps/input_message_version_message_version'), messageVersion)

        def genRemID = org.apache.commons.lang.RandomStringUtils.random(12, true, true)

        WebUI.setText(findTestObject('Object Repository/Misc/Page_VRelayLiveApps/input_remittance_id_remittance_id'), genRemID)

        WebUI.click(findTestObject('Object Repository/Misc/Page_VRelayLiveApps/input_true_formSubmit'))

        WebUI.delay(20)

        String retrievedURL = WebUI.getUrl(FailureHandling.CONTINUE_ON_FAILURE)

        println(retrievedURL)

        String expectedURL = 'https://upgrade.velocitypayment.com/vrelay/verify.do'

        //retrievedURL.equalsIgnoreCase(expectedURL)
        if (retrievedURL.equalsIgnoreCase(expectedURL)) {
            println('Able to connect to Live VRelay App')

            System.out.println('Pass RecordNumber: ' + row)

            resText = 'Pass'

            CustomKeywords.'pages.WriteExcel.demoKey'(resText, datText, resColumn, datCloumn, fileLoc, nameSheet, row)
        } else {
            println('Not Able to connect to Live VRelay App')

            System.out.println('Fail Record Number: ' + row)

            resText = 'Fail'

            CustomKeywords.'pages.WriteExcel.demoKey'(resText, datText, resColumn, datCloumn, fileLoc, nameSheet, row)
        }
    }
}

