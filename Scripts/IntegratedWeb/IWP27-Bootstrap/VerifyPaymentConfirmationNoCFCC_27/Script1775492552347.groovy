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
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

String resText = 'Fail'

String resColumn = 'Result'

String datCloumn = 'Date'

String fileLoc = 'KatalonData/IWPBootstrapData/VRelayPaymentsCC_27.xlsx'

def numOfRows

def dataFile

def nameSheet

def dataFileEmulator

def isRequiredTextPresent = false

def ExecuteTC

def EmulatorDataKey

def MessageVersion

def Amount

def UDFID

def NameID

def CardID

def CalDate

def AppID

def AddressID

def EmailPhoneID

def Notes

String path = fileLoc

nameSheet = 'VerifyPaymentConfPayNowCC'

dataFileEmulator = 'IWPTestData/EmulatorData'

dataFile = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)

//excelData = ExcelFactory.getExcelDataWithDefaultSheet(path, nameSheet, true)
numOfRows = dataFile.getRowNumbers()

println('Number of Rows : ' + numOfRows)

for (def row = 1; row <= numOfRows; row++) {
    ExecuteTC = dataFile.getValue('Execute', row)

    if (ExecuteTC.equalsIgnoreCase('Y')) {
        System.out.println('Begin Record Number: ' + row)

        Date today = new Date()

        println(today)

        String datText = today

        // Retrieve Foreign Keys
        EmulatorDataKey = dataFile.getValue('EmulatorData', row)

        Notes = dataFile.getValue('Notes', row)

        AppID = dataFile.getValue('AppID', row)

        MessageVersion = dataFile.getValue('MessageVersion', row)

        Amount = dataFile.getValue('Amount', row)

        UDFID = dataFile.getValue('UDFID', row)

        NameID = dataFile.getValue('NameID', row)

        CardID = dataFile.getValue('CardID', row)

        CalDate = dataFile.getValue('CalDate', row)

        AddressID = dataFile.getValue('AddressID', row)

        EmailPhoneID = dataFile.getValue('EmailPhoneID', row)

        // Open Emulator URL and populate
        CustomKeywords.'iwpPages.emulatorIWP30.setDataEmulator_DD'(EmulatorDataKey)

        def testHarnessURL = GlobalVariable.urlTestHarness

        WebUI.openBrowser(testHarnessURL)

        WebUI.maximizeWindow()

        // Populate Test Harness
        CustomKeywords.'iwpPages.TestHarnessPage.setDataMethodEF'(row, dataFile)

        // Select Credit Card Payment Method
        CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectRadioPayByCreditCard'()

        // Select Make a Payment Button
        CustomKeywords.'iwpPages.selectPaymentMethodBootstrapPage.selectButtonMakeAPayment'()

        WebUI.delay(GlobalVariable.shortTimeDelay)

        // setData for Cardholder Name
        CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardName'(NameID)

        // setData for Card Information
        CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardInfo'(CardID)

        // setData for Address
        CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardAddress'(AddressID)

        // setData for Email and Phone Number
        CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardEmailAndPhone'(EmailPhoneID)

        // setData for Amount
        CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataAmount'(Amount)

        // setData for UDFs
        CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.setDataCardUDF'(UDFID)

        // Select Customer CC Terms Checkbox
        CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.selectCheckboxCCTerms'()

        // Select Continue Button
        CustomKeywords.'iwpPages.ccPaymentEntryBootstrapPage.selectButtonContinue'()

        WebUI.verifyTextPresent('Payment Confirmation', false)

        WebUI.verifyTextPresent('Payment Information', false)

        WebUI.verifyTextPresent("Cardholder's Name:", false)

        WebUI.verifyTextPresent('Bridges Waters', false)

        WebUI.verifyTextPresent('Card Type:', false)

        WebUI.verifyTextPresent('Card Number: ', false)

        WebUI.verifyTextPresent('************1003', false)

        WebUI.verifyTextPresent('Card Security Code:', false)

        WebUI.verifyTextPresent('****', false)

        WebUI.verifyTextPresent('Expiration Date:', false)

        WebUI.verifyTextPresent('2/2028', false)

        WebUI.verifyTextPresent('Payment Date:', false)

        WebUI.verifyTextPresent('Address Line 1:', false)

        WebUI.verifyTextPresent('698 manadan terrace', false)

        WebUI.verifyTextPresent('Address Line 2:', false)

        WebUI.verifyTextPresent('Suite 600', false)

        WebUI.verifyTextPresent('Country:', false)

        WebUI.verifyTextPresent('United States', false)

        WebUI.verifyTextPresent('City:', false)

        WebUI.verifyTextPresent('HOOKSETT', false)

        WebUI.verifyTextPresent('State:', false)

        WebUI.verifyTextPresent('New Hampshire', false)

        WebUI.verifyTextPresent('ZIP Code:', false)

        WebUI.verifyTextPresent('03106', false)

        WebUI.verifyTextPresent('Email Address:', false)

        WebUI.verifyTextPresent('iahmed1@govolution.com', false)

        WebUI.verifyTextPresent('Bill/Invoice Information', false)

        WebUI.verifyTextPresent('Tax Amount:', false)

        WebUI.verifyTextPresent('$0.00', false)

        WebUI.verifyTextPresent('Amount:', false)

        WebUI.verifyTextPresent('$10.50', false)

        WebUI.verifyTextPresent('UDF1 Label:', false)

        WebUI.verifyTextPresent('udf data 1', false)

        WebUI.verifyTextPresent('UDF2 Label:', false)

        WebUI.verifyTextPresent('udf data 2', false)

        WebUI.verifyTextPresent('UDF3 Label:', false)

        WebUI.verifyTextPresent('udf data 3', false)

        WebUI.verifyTextPresent('UDF4 Label:', false)

        WebUI.verifyTextPresent('udf data 4', false)

        WebUI.verifyTextPresent('UDF6 Label:', false)

        WebUI.verifyTextPresent('udf data 6', false)

        WebUI.verifyTextPresent('UDF7 Label:', false)

        WebUI.verifyTextPresent('Orange', false)

        WebUI.verifyTextPresent('UDF8 Label:', false)

        WebUI.verifyTextPresent('Soccer', false)

        WebUI.verifyTextPresent('UDF9 Label:', false)

        WebUI.verifyTextPresent('udf data 9', false)

		WebUI.verifyTextPresent('Item No', false)
		
		WebUI.verifyTextPresent('Description', false)
		
		WebUI.verifyTextPresent('Amount', false)
		
		WebUI.verifyTextPresent('1234', false)
		
		WebUI.verifyTextPresent('Whole Wheat', false)
		
		WebUI.verifyTextPresent('$5', false)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_Confirmation_Bootstrap/input_Confirm'), 10)		

		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_Confirmation_Bootstrap/input_changePaymentMethodButton'), 10)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_Confirmation_Bootstrap/input_Exit'), 10)
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/IWP_Bootstrap/Page_Confirmation_Bootstrap/input_Modify'), 10)
		
		
        // Select Confirm Button on Payment Confirmation Page
        CustomKeywords.'iwpPages.paymentConfirmationBootstrapPage.selectButtonConfirm'()

        WebUI.delay(GlobalVariable.longTimeDelay)

        if (WebUI.verifyTextPresent('Successful Payment Receipt', false)) {
            println('Successful Payment Receipt text is present on the Receipt page')

            KeywordUtil.markPassed('Successful Payment Receipt text is present on the Receipt page')

            resText = 'Pass'

            CustomKeywords.'pages.WriteExcel.demoKey'(resText, datText, resColumn, datCloumn, fileLoc, nameSheet, row)
        } else {
            println('Successful Payment Receipt text is not present on the Receipt page')

            KeywordUtil.markFailed('Error on Page is : ' + WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode')))

            resText = 'Fail'

            CustomKeywords.'pages.WriteExcel.demoKey'(resText, datText, resColumn, datCloumn, fileLoc, nameSheet, row)

            println(WebUI.getText(findTestObject('Object Repository/IWP30/Page_Receipt/div_ReceiptSourceCode')))
        }
        
        WebUI.closeBrowser()
    }
}

