package ivtPages

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
import org.apache.commons.lang.RandomStringUtils
import java.util.Random
import org.openqa.selenium.Keys as Keys

public class BusinessChecking {


	String RoutingNo_In, AccountNo_In, ConfirmAccNo_In, BusinessName_In, FirstName_In, LastName_In,
	Email_In, Phone_In, PaymentDate_In, Country_In, Address_In, Zip_In, State_In, City_In,
	UDF1_In, UDF2_In, UDF3_In, UDF4_In, UDF5_In, UDF6_In, UDF7_In, UDF8_In, UDF9_In, UDF10_In


@Keyword
def SetDataBusinessChecking (RoutingNo_In, AccountNo_In, ConfirmAccNo_In, BusinessName_In,FirstName_In, LastName_In,
						Email_In, Phone_In, PaymentDate_In, Country_In, Address_In, Zip_In, State_In, City_In,
						UDF1_In, UDF2_In, UDF3_In, UDF4_In, UDF5_In, UDF6_In, UDF7_In, UDF8_In, UDF9_In, UDF10_In) {

	
	if ((!RoutingNo_In.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_RoutingNumber'), RoutingNo_In)}

	if ((!AccountNo_In.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AccountNumber'), AccountNo_In)}

	if ((!ConfirmAccNo_In.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_ConfirmAccountNumber'), ConfirmAccNo_In)}
	
	if ((!BusinessName_In.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_BusinessName'), BusinessName_In)}
		
	if ((!FirstName_In.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_FirstName'), FirstName_In)}
						
	if ((!LastName_In.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_LastName'), LastName_In)}
		
	if ((!Email_In.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_EmailAddress'), Email_In)}
	
	if ((!Phone_In.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_PhoneNumber'), Phone_In)}
	
	//if ((!PaymentDate_In.isEmpty())) {WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_PaymentDate'), PaymentDate_In)}
	
	if ((!Country_In.isEmpty())) {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/IntegratedVT/BusinessChecking/select_Country'), Country_In, false)}
		
	if ((!Address_In.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_AddressLine1'), Address_In)}
		
	// to move cursor/tab out
	if ((!Zip_In.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_ZipCode'), Zip_In)
		WebUI.sendKeys(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_ZipCode'), Keys.chord(Keys.TAB))}		
	
	WebUI.delay(2)
	if ((!State_In.isEmpty())) {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/IntegratedVT/BusinessChecking/select_State'), State_In, false)}
			
	if ((!City_In.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/input_City'), City_In)}
	
	if ((!UDF1_In.isEmpty())) {WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF1'), UDF1_In)}
	
	if ((!UDF2_In.isEmpty())) {WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF2'), UDF2_In)}
	
	if ((!UDF3_In.isEmpty())) {WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF3'), UDF3_In)}
	
	if ((!UDF4_In.isEmpty())) {WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF4'), UDF4_In)}
	
	if ((!UDF5_In.isEmpty())) {WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF5'), UDF5_In)}
	
	if ((!UDF6_In.isEmpty())) {WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF6'), UDF6_In)}
	
	if ((!UDF7_In.isEmpty())) {WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF7'), UDF7_In)}
	
	if ((!UDF8_In.isEmpty())) {WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF8'), UDF8_In)}
	
	if ((!UDF9_In.isEmpty())) {WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF9'), UDF9_In)}
	
	if ((!UDF10_In.isEmpty())) {WebUI.setText(findTestObject('Object Repository/IntegratedVT/BusinessChecking/UDF10'), UDF10_In)}
	
	}
	
	
}
