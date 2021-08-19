import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


// Emulator URL: https://qa.velocitypayment.com/agency/config.do?action=editor
def numOfRows = findTestData('IWPTestData/IWP30PayNowCC').getRowNumbers()

println(numOfRows)

for (def row = 1; row <= numOfRows; row++) {
	
	
// Exception Handling	
	
	try {
	
    // Begin getData	
    def MV = findTestData('IWPTestData/IWP30PayNowCC').getValue('MV', row)

    println(MV)

    def Amount = findTestData('IWPTestData/IWP30PayNowCC').getValue('Amount', row)

    println(Amount)

    def CAN = findTestData('IWPTestData/IWP30PayNowCC').getValue('CAN', row)

    println(CAN)

    def Action = findTestData('IWPTestData/IWP30PayNowCC').getValue('Action', row)

    println(Action)

    def Lang = findTestData('IWPTestData/IWP30PayNowCC').getValue('Lang', row)

    println(Lang)

    def Fname = findTestData('IWPTestData/IWP30PayNowCC').getValue('Fname', row)

    println(Fname)

    def Lname = findTestData('IWPTestData/IWP30PayNowCC').getValue('Lname', row)

    println(Lname)

    def AL1 = findTestData('IWPTestData/IWP30PayNowCC').getValue('AL1', row)

    println(AL1)

    def AL2 = findTestData('IWPTestData/IWP30PayNowCC').getValue('AL2', row)

    println(AL2)

    def Country = findTestData('IWPTestData/IWP30PayNowCC').getValue('Country', row)

    println(Country)

    def City = findTestData('IWPTestData/IWP30PayNowCC').getValue('City', row)

    println(City)

    def State = findTestData('IWPTestData/IWP30PayNowCC').getValue('State', row)

    println(State)

    def ZIP = findTestData('IWPTestData/IWP30PayNowCC').getValue('ZIP', row)

    println(ZIP)

    def Order = findTestData('IWPTestData/IWP30PayNowCC').getValue('Order', row)

    println(Order)

    def CompanyName = findTestData('IWPTestData/IWP30PayNowCC').getValue('CompanyName', row)

    println(CompanyName)

    def Email = findTestData('IWPTestData/IWP30PayNowCC').getValue('Email', row)

    println(Email)

    def UDF1 = findTestData('IWPTestData/IWP30PayNowCC').getValue('UDF1', row)

    println(UDF1)

    def UDF2 = findTestData('IWPTestData/IWP30PayNowCC').getValue('UDF2', row)

    println(UDF2)

    def UDF3 = findTestData('IWPTestData/IWP30PayNowCC').getValue('UDF3', row)

    println(UDF3)

    def UDF4 = findTestData('IWPTestData/IWP30PayNowCC').getValue('UDF4', row)

    println(UDF4)

    def UDF5 = findTestData('IWPTestData/IWP30PayNowCC').getValue('UDF5', row)

    println(UDF5)

    def UDF6 = findTestData('IWPTestData/IWP30PayNowCC').getValue('UDF6', row)

    println(UDF6)

    def UDF7 = findTestData('IWPTestData/IWP30PayNowCC').getValue('UDF7', row)

    println(UDF7)

    def UDF8 = findTestData('IWPTestData/IWP30PayNowCC').getValue('UDF8', row)

    println(UDF8)

    def UDF9 = findTestData('IWPTestData/IWP30PayNowCC').getValue('UDF9', row)

    println(UDF9)

    def UDF10 = findTestData('IWPTestData/IWP30PayNowCC').getValue('UDF10', row)
	
	println(UDF10)
	
	
	def AppID = findTestData('IWPTestData/IWP30PayNowCC').getValue('AppID', row)

	println(AppID)
	
	def MessageVersion = findTestData('IWPTestData/IWP30PayNowCC').getValue('MessageVersion', row)
	
	println(MessageVersion)
    
	def CCAmount = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCAmount', row)
	
	println(CCAmount)
	
	def CCUDF1 = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCUDF1', row)
	
	println(CCUDF1)
	
	def CCUDF2 = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCUDF2', row)
	
	println(CCUDF2)
	
	def CCUDF3 = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCUDF3', row)
	
	println(CCUDF3)
	
	def CCUDF4 = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCUDF4', row)
	
	println(CCUDF4)
	
	def CCUDF5 = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCUDF5', row)
	
	println(CCUDF5)
	
	def CCUDF6 = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCUDF6', row)
	
	println(CCUDF6)
	
	def CCUDF7 = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCUDF7', row)
	
	println(CCUDF7)
	
	def CCUDF8 = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCUDF8', row)
	
	println(CCUDF8)
	
	def CCUDF9 = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCUDF9', row)
	
	println(CCUDF9)
	
	def CCUDF10 = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCUDF10', row)
	
	println(CCUDF10)
	
	def CCName = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCName', row)
	
	println(CCName)
	
	def CCCardNum = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCCardNum', row)
	
	println(CCCardNum)
	
	def CCSPC = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCSPC', row)
	
	println(CCSPC)
	
	def CCExpM = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCExpM', row)
	
	println(CCExpM)
	
	def CCExpY = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCExpY', row)
	
	println(CCExpY)
	
	def CCDate = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCDate', row)
	
	println(CCDate)
	
	def CCAL1 = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCAL1', row)
	
	println(CCAL1)
	
	def CCAL2 = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCAL2', row)
	
	println(CCAL2)
	
	def CCZIP = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCZIP', row)
	
	println(CCZIP)
	
	def CCEmail = findTestData('IWPTestData/IWP30PayNowCC').getValue('CCEmail', row)
	
	println(CCEmail)
	
	
	
	

    // End getData
    //WebUI.openBrowser('https://qa.velocitypayment.com/agency/config.do?action=editor')
	WebUI.openBrowser(GlobalVariable.urlEmulator)
    WebUI.maximizeWindow() 
	
	//Begin setData

									//  findTestObject('IWP30/Page_VRelay30Emulator/MV')

			WebUI.selectOptionByValue(findTestObject('IWP30/Page_VRelay30Emulator/MV'),MV, true)
				
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Amount'),Amount)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/CAN'),CAN)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Action'),Action)
			
			//WebUI.click(findTestObject('IWP30/IWP30Emulator/Page_VRelay30Emulator/Page_VRelay30Emulator/td'))
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lang'),Lang)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Fname'),Fname)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Lname'),Lname)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL1'),AL1)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/AL2'),AL2)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Country'),Country)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/City'),City)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/State'),State)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/ZIP'),ZIP)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Order'),Order)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Company'),CompanyName)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/Email'),Email)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF1'),UDF1)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF2'),UDF2)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF3'),UDF3)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF4'),UDF4)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF5'),UDF5)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF6'),UDF6)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF7'),UDF7)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF8'),UDF8)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF9'),UDF9)
			
			WebUI.setText(findTestObject('IWP30/Page_VRelay30Emulator/UDF10'),UDF10)
			Thread.sleep(5000)
			
			WebUI.click(findTestObject('IWP30/Page_VRelay30Emulator/Submit'))
			
			

			// End setData

			WebUI.closeBrowser()
			
			//WebUI.openBrowser('https://dev-algorithm.govolution.com/vrelaytest/QA/version_2_2/vrelaytest.html')
			WebUI.openBrowser(GlobalVariable.urlTestHarness)
			WebUI.maximizeWindow()
			
			def genRemIDVoid = org.apache.commons.lang.RandomStringUtils.random(12, true, true)
			
//Verify if we are on the TestHarness page and Populate the TestHarness
						
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'), 30)) 
			{
				println("We are on Test Harness page, start populating")
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/ApplicationID'),AppID)
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/MessageVersion'),MessageVersion)
				WebUI.setText(findTestObject('Object Repository/IWP30/Page_QATestHarness/RemittanceID'),genRemIDVoid)
				WebUI.click(findTestObject('Object Repository/IWP30/Page_QATestHarness/SubmitButton'))
				
			}
			else {
				
				println ("Not on Test Harness page")
			}
			
			
// Verify if we are on the Select Payment Method page and populate the page
			
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCreditCard'), 30))
			{
				println("We are on Select Payment Method page, start populating")
				WebUI.check(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/PayByCreditCard'))
				Thread.sleep(1000)
				
				WebUI.click(findTestObject('Object Repository/IWP30/Page_SelectPaymentMethod/MakePaymentButton'))
				
			}
			else
			{
				println("Not on Select Payment Method page")	
			}
			
			
// Verify if we are on Credit Card Payment Entry page and populate the page
			
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'), 30))
			{
				
				println("We are on Credit Card Payment Entry page, start populating")
				
			/*	if ((WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),30)) && (CCAmount!=null))
					{
						WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),CCAmount)
					}
					else{println("Amount field is not present on CC Payment Entry page")}*/
					
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),30))
						{
							if ((!CCAmount.isEmpty()))
							{
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Amount'),CCAmount)
							}
							else {println("Amount is not present in the Excel Spreadsheet")}
						}
					else {println("Amount field is either missing or not modifiable on CC Payment Entry page")}	
					
					
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),30))
						{
							if ((!CCUDF2.isEmpty()))
							{
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined2'),CCUDF2)
							}
							else {println("UDF2 data is not present in the Excel Spreadsheet")}
						}
					else {println("UDF2 field is either missing or not modifiable on CC Payment Entry page")}

				

					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),30))
						{
							if ((!CCUDF3.isEmpty()))
							{
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined3'),CCUDF3)
							}
							else {println("UDF3 data is not present in the Excel Spreadsheet")}
						}
					else {println("UDF3 field is either missing or not modifiable on CC Payment Entry page")}
				
				
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7'),30))
						{
							if ((!CCUDF7.isEmpty()))
							{
								WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined7')),CCUDF7,false)
							}
							else {println("UDF7 data is not present in the Excel Spreadsheet")}
						}
					else {println("UDF7 field is either missing or not modifiable on CC Payment Entry page")}
				

					
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8'),30))
						{
							if ((!CCUDF8.isEmpty()))
							{
								WebUI.selectOptionByLabel((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/UserDefined8')),CCUDF8,false)
							}
							else {println("UDF8 data is not present in the Excel Spreadsheet")}
						}
					else {println("UDF8 field is either missing or not modifiable on CC Payment Entry page")}

				
				
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name'),30))
						{
							if ((!CCName.isEmpty()))
							{
								WebUI.setText((findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Name')),CCName)
							}
							else {println("CCName data is not present in the Excel Spreadsheet")}
						}
					else {println("Name field is either missing or not modifiable on CC Payment Entry page")}

			
				
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),30))
						{
							if ((!CCCardNum.isEmpty()))
							{
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/CardNumber'),CCCardNum)
							}
							else {println("Card Number is not present in the Excel Spreadsheet")}
						}
					else {println("Card Number field is missing on CC Payment Entry page")}
						
				
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),30))
						{
							if ((!CCSPC.isEmpty()))
							{
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/SPC'),CCSPC)
							}
							else {println("CCSPC is not present in the Excel Spreadsheet")}
						}
					else {println("SPC field is missing on CC Payment Entry page")}
					
					
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),30))
						{
							if ((!CCExpM.isEmpty()))
							{
								WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Month'),CCExpM,false)
							}
							else {println("CCExpM is not present in the Excel Spreadsheet")}
						}
					else {println("Month field is missing on CC Payment Entry page")}

										
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),30))
						{
							if ((!CCExpY.isEmpty()))
							{
								WebUI.selectOptionByLabel(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/Year'),CCExpY,false)
							}
							else {println("CCExpY is not present in the Excel Spreadsheet")}
						}
					else {println("Year field is missing on CC Payment Entry page")}

					
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ProcessDate'),30))
						{
							if ((!CCDate.isEmpty()))
							{
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ProcessDate'),CCDate)
							}
							else {println("CCDate is not present in the Excel Spreadsheet")}
						}
					else {println("ProcessDate field is missing on CC Payment Entry page")}
				
				
				
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),30))
						{
							if ((!CCAL1.isEmpty()))
							{
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL1'),CCAL1)
							}
							else {println("CCAL1 is not present in the Excel Spreadsheet")}
						}
					else {println("AL1 field is missing on CC Payment Entry page")}
				
				
				
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),30))
						{
							if ((!CCAL2.isEmpty()))
							{
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/AL2'),CCAL2)
							}
							else {println("CCAL2 is not present in the Excel Spreadsheet")}
						}
					else {println("AL2 field is missing on CC Payment Entry page")}
				
				
	
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),30))
						{
							if ((!CCZIP.isEmpty()))
							{
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ZIP'),CCZIP)
							}
							else {println("CCZIP is not present in the Excel Spreadsheet")}
						}
					else {println("ZIP field is missing on CC Payment Entry page")}
								
				
	
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/EmailAddress'),30))
						{
							if ((!CCEmail.isEmpty()))
							{
								WebUI.setText(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/EmailAddress'),CCEmail)
							}
							else {println("CCEmail is not present in the Excel Spreadsheet")}
						}
					else {println("Email field is missing on CC Payment Entry page")}
				
				
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'),30))
						{
							WebUI.check(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/TermCondCheckBox'))
						}
					else {println("Terms and Condition checkbox is missing on the CC Payment Entry page")}
					
					
					
					if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'),30))
						{
							WebUI.click(findTestObject('Object Repository/IWP30/Page_CCPaymentEntry/ContinueButton'))
						}
					else {println("Continue button is missing on the CC Payment Entry page")}
					
//End Populating the Credit Card Payment Entry page					
					
					
			
			}
			else
			{
				println("Not on Credit Card Payment Entry Page")	
			}
			
			
// After selecting the Continue button			
// On the Confirmation page
// Verify static text and select Confirm button
			
			if (WebUI.verifyTextPresent(("Please verify the following information"), false))
				{
					println "Please verify the following information text is present on the Confirmation page"
				}
			else {"Please verify the following information text is not present on the Confirmation page"}		
			
			
			
			if (WebUI.verifyTextPresent(("Is this information correct?"), false))
				{
					println "Is this information correct text is present on the Confirmation page"
				}
			else {println "Is this information correct text is not present on the Confirmation page"}
			
			
			
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmButton'),30))
				{
					WebUI.click(findTestObject('Object Repository/IWP30/Page_Confirmation/ConfirmButton'))
					//WebUI.waitForPageLoad(10)
				}
			else {println  "Confirm button is missing on the Confirmation page"}				
	
				
// After selecting the Confirm button
// On the Receipt page
// Verify static text
			
			Thread.sleep(10000)
			//WebUI.waitForPageLoad(10)
			
			if (WebUI.verifyTextPresent(("Successful Payment Receipt"), false))
				{
					println "Successful Payment Receipt text is present on the Receipt page"
				}
			else {"Successful Payment Receipt text is not present on the Receipt page"}
			
			
			if (WebUI.verifyTextPresent(("Please print this receipt for your records"), false))
				{
					println "Please print this receipt for your records text is present on the Receipt page"
				}
			else {"Please print this receipt for your records text is not present on the Receipt page"}
			
			
			if (WebUI.verifyElementPresent(findTestObject('Object Repository/IWP30/Page_Receipt/ExitButton'),30))
				{
					println "Exit Button is present on the Receipt page"
				}	
			else {println "Exit button is not present on the Receipt page"}				
			
			
	}
	catch (Exception exp)
		{
			println exp.getMessage()
		}
				
		// Close the browser
		WebUI.closeBrowser()
}			
