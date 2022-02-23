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

String path_Dashboard = "Object Repository/AdminSuiteBootstrap_Pages/Dashboard_Bootstrap/"
String path_VT = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/IssueTransactions/"
String path_SaleKB = "Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/SaleKeyboard/"
//String hrefAppID = "/admin/imtiaz/bootstrap/vpos/238/transactions/AuthCapForm/"
String appliID = "255"
String li_1 = "/admin/imtiaz/bootstrap/vpos/"
String li_2 = "/transactions/AuthOnlyForm/"
String hrefAppID = li_1 + appliID + li_2

System.out.println('hrefID is : ' + hrefAppID)

def cardNumbers = ["4012000098765439","5146312200000035","371449635392376","6011000993026909"]
def listSize = cardNumbers.size()
println listSize

for (def i = 0; i < listSize; i++)
	{

	CustomKeywords.'adminSuiteBootstrap.loginFunctionality.login_AdminSuite'()
	
	WebUI.click(findTestObject(path_Dashboard + 'span_Payment'))
	WebUI.scrollToElement(findTestObject(path_Dashboard + 'span_Reporting'), 3)
	
		WebUI.click(findTestObject(path_Dashboard + 'a_Sabu 1'))
		
			WebUI.click(findTestObject(path_VT + 'button_Authorization Only'))
			
				//WebUI.click(findTestObject(path_VT + 'a_KeyboardEntry_Sale'))
				
				def authOnlyKeyboardEntryLink = WebUI.modifyObjectProperty(findTestObject(path_VT + 'a_KeyboardEntry_Sale'),'href','equals',hrefAppID,true)
				WebUI.click(authOnlyKeyboardEntryLink)
				
				//CustomKeywords.'adminSuiteBootstrap.virtualTerminalSetData.saleKeyboard_HardCoded'()
				CustomKeywords.'adminSuiteBootstrap.virtualTerminalSetData.saleKeyboard_HardCoded_AllCardTypes'(cardNumbers[i])
				
				WebUI.verifyTextPresent('Transaction Successful', true)
				
				WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/Receipt/button_Continue'))
				WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/Receipt/button_Continue'), 20)
				
				WebUI.verifyElementVisible(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/Receipt/button_Print'))
				WebUI.verifyElementPresent(findTestObject('Object Repository/AdminSuiteBootstrap_Pages/VT_Bootstrap/Receipt/button_Print'), 20)
				
				
				WebUI.verifyTextPresent('Remittance ID', true)
				WebUI.verifyTextPresent('Received', true)
				
				WebUI.verifyTextPresent('UDF1', true)
				WebUI.verifyTextPresent('UDF2', true)
				WebUI.verifyTextPresent('UDF3', true)
				WebUI.verifyTextPresent('UDF4', true)
				WebUI.verifyTextPresent('UDF5', true)
				WebUI.verifyTextPresent('UDF6', true)
				WebUI.verifyTextPresent('UDF7', true)
				WebUI.verifyTextPresent('UDF8', true)
				WebUI.verifyTextPresent('UDF9', true)
				WebUI.verifyTextPresent('UDF 10', true)
				
				WebUI.verifyTextPresent('Australia', true)
				WebUI.verifyTextPresent('Denmark', true)
				WebUI.verifyTextPresent('Sweden', true)
				WebUI.verifyTextPresent('Austria', true)
				WebUI.verifyTextPresent('Orange Recorded', true)
				WebUI.verifyTextPresent('Yellow Recorded', true)
				WebUI.verifyTextPresent('Norway', true)
				WebUI.verifyTextPresent('Netherlands', true)
				WebUI.verifyTextPresent('Switzerland', true)
				WebUI.verifyTextPresent('France', true)
				
				
				WebUI.verifyTextPresent('Amount', true)
				WebUI.verifyTextPresent('Convenience Fee', true)
				WebUI.verifyTextPresent('Convenience Fee Type', true)
				WebUI.verifyTextPresent('Total Amount', true)
				WebUI.verifyTextPresent('Transaction Type', true)
				
				WebUI.verifyTextPresent('10.50', true)
				WebUI.verifyTextPresent('5.00', true)
				WebUI.verifyTextPresent('Dual Transaction', true)
				WebUI.verifyTextPresent('15.50', true)
				WebUI.verifyTextPresent('Authorization', true)
				
				WebUI.verifyTextPresent('Card Information', true)
				WebUI.verifyTextPresent('SHIV HARI', true)
				
				switch(cardNumbers[i])
				{
					case "4012000098765439":
						WebUI.verifyTextPresent('Visa', true)
						WebUI.verifyTextPresent('5439', true)
					break
					
					case "5146312200000035":
						WebUI.verifyTextPresent('MasterCard', true)
						WebUI.verifyTextPresent('0035', true)
					break
					
					case "371449635392376":
						WebUI.verifyTextPresent('American Express', true)
						WebUI.verifyTextPresent('2376', true)
					break
					
					case "6011000993026909":
						WebUI.verifyTextPresent('Discover', true)
						WebUI.verifyTextPresent('6909', true)
					break
				}
				
				
				
				
				WebUI.verifyTextPresent('Address Line 1', true)
				WebUI.verifyTextPresent('Address Line 2', true)
				WebUI.verifyTextPresent('Country', true)
				WebUI.verifyTextPresent('City', true)
				WebUI.verifyTextPresent('State', true)
				WebUI.verifyTextPresent('ZIP Code', true)
				
				
				WebUI.verifyTextPresent('2311 York road', true)
				WebUI.verifyTextPresent('Suite 500', true)
				WebUI.verifyTextPresent('United States', true)
				WebUI.verifyTextPresent('LUTHERVILLE TIMONIUM', true)
				WebUI.verifyTextPresent('Maryland', true)
				WebUI.verifyTextPresent('21093', true)
				
	}