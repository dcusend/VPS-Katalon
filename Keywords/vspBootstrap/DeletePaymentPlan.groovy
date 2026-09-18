package vspBootstrap

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

public class DeletePaymentPlan {
	
	
	@Keyword
	def deletePaymentPlan(planid) {
        
        TestObject testObject = new TestObject()
        
		
        testObject.addProperty("text", com.kms.katalon.core.testobject.ConditionType.EQUALS, 'Cancel')
        testObject.addProperty("href", com.kms.katalon.core.testobject.ConditionType.EQUALS, '/admin/imtiaz/bootstrap/vsp/744/paymentplan/DeletePaymentPlan?ProfileID=176234&PaymentPlanID=' + planid)
        
        WebUI.delay(GlobalVariable.shortTimeDelay)
        WebUI.click(testObject)
        String path_Delete_PP = "Object Repository/AdminSuiteBootstrap_Pages/VSP_Bootstrap/DeletePaymentPlan/"
        WebUI.delay(GlobalVariable.shortTimeDelay)
        
        WebUI.click(findTestObject(path_Delete_PP + 'btn_Cancel'))
        
        WebUI.delay(GlobalVariable.shortTimeDelay)
        WebUI.verifyTextPresent('Payment Plan successfully deleted', false)

        
    } 

}
