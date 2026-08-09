package iwpPages

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

public class EmulatorIWP23NonBootstarp {

	
String  MsgV, Amount, CAN, Action, Lang, Fname, Lname, AL1, AL2, Country, City, State, ZIP, Order, 
		CompName, Email, UDF1, UDF2, UDF3, UDF4, UDF5 
	
@Keyword
def setDataIWP23 (MsgV, Amount, CAN, Action, Lang, Fname, Lname, AL1, AL2, Country, City, State, ZIP, Order, 
			CompName, Email, UDF1, UDF2, UDF3, UDF4, UDF5) {
		

			WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/select_MessageVer2.3'), MsgV, false)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_Amount'), Amount)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_ClientAccountNo'), CAN)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_ActionType'), Action)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_Language'), Lang)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_FirstName'), Fname)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_LastName'), Lname)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_AddressLine1'), AL1)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_AddressLine2'), AL2)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_Country'), Country)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_City'), City)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_State'), State)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_ZIP'), ZIP)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_OrderNo'), Order)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_CompanyName'), CompName)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_EmailAddress'), Email)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_UDF1'), UDF1)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_UDF2'), UDF2)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_UDF3'), UDF3)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_UDF4'), UDF4)
			
			WebUI.setText(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/input_UDF5'), UDF5)
				
		
}
			
	
@Keyword
	def Submit() {
		WebUI.click(findTestObject('Object Repository/IWP23NonBootstarp/Emulator23/Submit_btn'))	
	}
	
	
}

