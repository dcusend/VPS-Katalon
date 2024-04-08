package rad

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
import internal.GlobalVariable as GlobalVariable
import internal.GlobalVariable

public class getSetDataRAD {

	String orPath_TaxPayer = "Object Repository/RAD_Pages/Taxpayer_Page"
	String orPath_FilingStatus = "Object Repository/RAD_Pages/FilingStatus_Page"
	String orPath_TaxInfo = "Object Repository/RAD_Pages/TaxInfo_Page"
	String orPath_AddressContact = "Object Repository/RAD_Pages/AddressAndContactInfo_Page"


	//----------------------------------------------

	@Keyword
	def setDataRADssnAndName()
	{

		// Get Data
		def rad_ssn = GlobalVariable.rad_SSN
		def rad_ssn_lastName = GlobalVariable.rad_SSN_LastName

		// Set Data
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),"Jimmy")
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),rad_ssn_lastName)
		WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatSSN'), rad_ssn)
		WebUI.setText(findTestObject('RAD_RecordAndPlay/input_concatReSSN'), rad_ssn)


	}


	//----------------------------------------------

	@Keyword
	def setDataRADssnAndNameJointFiler()
	{

		// Get Data
		def rad_ssn_joint = GlobalVariable.rad_SSN_Joint
		def rad_ssn_lastName_joint = GlobalVariable.rad_SSN_Joint_LastName

		// Set Data
		WebUI.setText(findTestObject(orPath_FilingStatus + '/input_jointFirstName'),"Larsons")
		WebUI.setText(findTestObject(orPath_FilingStatus + '/input_jointLastName'),rad_ssn_lastName_joint)
		WebUI.setText(findTestObject('Object Repository/RAD_RecordAndPlay/input_JointFilerSSN'),rad_ssn_joint)
		WebUI.setText(findTestObject('Object Repository/RAD_RecordAndPlay/input_reTypeJointFilerSSN'),rad_ssn_joint)



	}




	//-------------------------------------------


	@Keyword
	def setDataRADNameOnly()
	{

		// Get Data
		def rad_ssn = GlobalVariable.rad_SSN
		def rad_ssn_lastName = GlobalVariable.rad_SSN_LastName

		// Set Data
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),"Jimmy")
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),rad_ssn_lastName)


	}




	//-------------------------------------------


	@Keyword
	def setDataRADELSSN()
	{

		// Get Data
		def rad_ssn_EL = GlobalVariable.rad_SSN

		// Set Data
		WebUI.setText(findTestObject(orPath_TaxInfo +'/input_TaxInfo_ExisitingSSN'),rad_ssn_EL)
		WebUI.setText(findTestObject(orPath_TaxInfo + '/input_TaxInfo_reTaxTypeExisitingSSN'),rad_ssn_EL)


	}



	//-------------------------------------------


	@Keyword
	def setDataRADNoticeInvoiceTen()
	{



		// Set Data
		WebUI.setText(findTestObject(orPath_TaxInfo + '/input_NoticeInvoiceNumber'), "1234567890")
		WebUI.setText(findTestObject(orPath_TaxInfo + '/input_reTypeNoticeInvoiceNumber'), "1234567890")


	}




	//-----------------------------------------


	@Keyword
	def setDataRADNoticeInvoiceThirteen()
	{



		// Set Data
		WebUI.setText(findTestObject(orPath_TaxInfo + '/input_NoticeInvoiceNumber'), "1234567890123")
		WebUI.setText(findTestObject(orPath_TaxInfo + '/input_reTypeNoticeInvoiceNumber'), "1234567890123")


	}


	//-----------------------------------------

	@Keyword
	def setDataRADFEIN()
	{



		// Set Data
		WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN'), 'RigbBhfdqODKcAsiUrg+1Q==')
		WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_FederalEIN_ReEnter'), 'RigbBhfdqODKcAsiUrg+1Q==')


	}


	//-----------------------------------------

	@Keyword
	def setDataRADMDCRN()
	{


		// Set Data
		WebUI.setText(findTestObject(orPath_TaxInfo + '/input_MDCRegistration'),"07640126")


	}

	//-----------------------------------------

	@Keyword
	def setDataExistingRADMDCRN()
	{


		// Set Data
		WebUI.setText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_MDCRegistrationEL'),"07640126")


	}




	//--------------------------------------

	@Keyword
	def setDataRADBusinessName()
	{


		// Set Data
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_businessName'),"My Company")


	}


	//-----------------------------------------


	@Keyword
	def setDataRADAddress()
	{


		// Set Data
		WebUI.selectOptionByLabel(findTestObject(orPath_AddressContact + '/select_Country'),"United States",false)
		WebUI.setText(findTestObject(orPath_AddressContact + '/input_streetAddress1'),"2508 Mandan Terrace")
		WebUI.setText(findTestObject(orPath_AddressContact + '/input_streetAddress2'),"")
		WebUI.setText(findTestObject(orPath_AddressContact + '/input_city'),"Gambrills")
		WebUI.selectOptionByLabel(findTestObject(orPath_AddressContact + '/select_State'),"Maryland",false)
		WebUI.setText(findTestObject(orPath_AddressContact + '/input_zipCode'),"21054")
		WebUI.setText(findTestObject(orPath_AddressContact + '/input_phoneNumber'),"(703) 894-5000")
		WebUI.setText(findTestObject(orPath_AddressContact + '/input_eMailAddress'),"iahmed@govolution.com")
		WebUI.setText(findTestObject(orPath_AddressContact + '/input_reEnterEMailAddress'),"iahmed@govolution.com")


	}


	//-----------------------------------------

	@Keyword
	def setDataRADBusinessRep()
	{


		// Set Data

		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_BusinessRepfirstName'),"BusRepFname")
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_BusinessRepmiddleName'),"")
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_BusinessReplastName'),"BusRepLname")
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_BusinessRepsuffix'),"")


	}

	//-----------------------------------------


	@Keyword
	def setDataRADFEINSSN()
	{



		// Set Data
		//WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_TaxInformation_feinSsn'), 'RigbBhfdqODKcAsiUrg+1Q==')
		//WebUI.setEncryptedText(findTestObject(orPath_TaxInfo + '/input_TaxInformation_RefeinSsn'), 'RigbBhfdqODKcAsiUrg+1Q==')

		//WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_TaxInfo_FeinSSN_New'), 'RigbBhfdqODKcAsiUrg+1Q==')
		//WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_TaxInfo_RetypeFeinSSN_New'), 'RigbBhfdqODKcAsiUrg+1Q==')

		WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_TaxInfo_FeinSsn_New_2'), 'RigbBhfdqODKcAsiUrg+1Q==')
		WebUI.setEncryptedText(findTestObject('Object Repository/RAD_Pages/TaxInfo_Page/input_TaxInfo_RetypeFeinSsn_New_2'), 'RigbBhfdqODKcAsiUrg+1Q==')


	}


	//-----------------------------------------

	@Keyword
	def setDataRADDecedentSSN()
	{
		// Get Data
		def rad_ssn_Decedent = GlobalVariable.rad_SSN

		// Set Data
		WebUI.setText(findTestObject(orPath_TaxInfo +'/input_DecedentSSN'),rad_ssn_Decedent)
		WebUI.setText(findTestObject(orPath_TaxInfo + '/input_ReTypeDecedentSSN'),rad_ssn_Decedent)
	}


	//---------------------------------------


	@Keyword
	def setDataRADDecedentSSNandName()
	{
		// Get Data
		def rad_ssn_Decedent = GlobalVariable.rad_SSN
		def rad_ssn_lastName = GlobalVariable.rad_SSN_LastName

		// Set Data
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),"Jimmy")
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),rad_ssn_lastName)
		WebUI.setText(findTestObject(orPath_TaxInfo +'/input_DecedentSSN'),rad_ssn_Decedent)
		WebUI.setText(findTestObject(orPath_TaxInfo + '/input_ReTypeDecedentSSN'),rad_ssn_Decedent)
	}

	//------------------------------------


	@Keyword
	def setDataRADNewTaxDecedentSSNandName()
	{
		// Get Data
		def rad_ssn_Decedent = GlobalVariable.rad_SSN
		def rad_ssn_lastName = GlobalVariable.rad_SSN_LastName

		// Set Data
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_firstName'),"Jimmy")
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_lastName'),rad_ssn_lastName)
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_NewTax_DecedentSSN'),rad_ssn_Decedent)
		WebUI.setText(findTestObject(orPath_TaxPayer + '/input_NewTax_ReTypeDecedentSSN'),rad_ssn_Decedent)
	}


	//----------------------------------

	
	@Keyword
	def setDataRADMFLicNumFive()
	{


		// Set Data
		WebUI.setText(findTestObject(orPath_TaxInfo + '/input_MotorFuelLicNum'),"95632")


	}

	//----------------------------------
	
	
	@Keyword
	def setDataRADMFLicNumSix()
	{


		// Set Data
		WebUI.setText(findTestObject(orPath_TaxInfo + '/input_MotorFuelLicNum'),"758142")


	}

	//----------------------------------


}
