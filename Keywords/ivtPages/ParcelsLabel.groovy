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

import groovy.json.JsonSlurper
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.util.KeywordUtil
import internal.GlobalVariable

public class ParcelsLabel {
	
	
	String Show_In, DueAmount_In, JSONBody
		   	

@Keyword
def SetDataParcelsLabel (String Show_In, String DueAmount_In) 
	
	{	
	   if ((!Show_In.isEmpty())) {
		   WebUI.selectOptionByLabel(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Show'), Show_In, false)
	   }
	
	   if ((!DueAmount_In.isEmpty())) {
		   WebUI.setText(findTestObject('Object Repository/IntegratedVT/ParcelsLabel/Due_Amount'), DueAmount_In)
	   }
	}

	
	
		
@Keyword
def verifyParcelData(String JSONBody) {
	
			def json = new JsonSlurper().parseText(JSONBody)
	
			def expectedParcelData = json.parcel
	
			for(int row=0; row<expectedParcelData.size(); row++) {
	
				String expRef    = expectedParcelData[row][0]
				String expQty    = expectedParcelData[row][1]
				String expAmount = expectedParcelData[row][2]
	
				String actRef = WebUI.getText(getCell(row+1,1)).trim()
	
				String actQty = WebUI.getText(getCell(row+1,2)).trim()
	
				String actAmount = WebUI.getText(getCell(row+1,3)).trim()
	
				println("Expected : ${expRef} | ${expQty} | ${expAmount}")
				println("Actual   : ${actRef} | ${actQty} | ${actAmount}")
	
				assert expRef == actRef
				assert expQty == actQty
				assert expAmount == actAmount
				
			}
	
			KeywordUtil.markPassed("Parcel table data verified successfully")
		 }
	
		private TestObject getCell(int row,int col) {
	
			TestObject to = new TestObject()
	
			to.addProperty('xpath',ConditionType.EQUALS,"//table/tbody/tr[${row}]/td[${col}]")	
			
			return to
			
		}
		
 }




