package adminSuiteBootstrap

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
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable
import pages.GenerateRandom

public class addUser {

	final genRand = new GenerateRandom()

	String userName, fName, lName, email, pwd, confirPwd, lockAC, randomUserName, randomFirstName, randomLastName

	String path_AddUser = "Object Repository/AdminSuiteBootstrap_Pages/UM_Bootstrap/AddUser/"

	@Keyword
	def setDataAddUser(int rowS, String dataFileS) {
		// GetData
		userName = findTestData(dataFileS).getValue('Username', rowS)
		email = findTestData(dataFileS).getValue('Email', rowS)
		pwd = findTestData(dataFileS).getValue('Password', rowS)
		confirPwd = findTestData(dataFileS).getValue('ConfirmPassword', rowS)
		lockAC = findTestData(dataFileS).getValue('Lock', rowS)


		// SetData
		WebUI.setText(findTestObject(path_AddUser + 'input_EmailAddress'), email)

		// Get Random UserName as per test data
		switch(userName) {
			case "A":
			//def randomUserName = CustomKeywords.'pages.GenerateRandom.getRandomAlpha'()
				randomUserName = genRand.getRandomAlpha()
				break

			case "AN":
			//def randomUserName = CustomKeywords.'pages.GenerateRandom.getRandomAlphaNum'()
				randomUserName = genRand.getRandomAlphaNum()
				break

			case "N":
			//def randomUserName = CustomKeywords.'pages.GenerateRandom.getRandomNum'()
				randomUserName = genRand.getRandomNum()
				break
		}


		WebUI.setText(findTestObject(path_AddUser + 'input_Username'), randomUserName)

		// Get random First and Last Names
		randomFirstName = genRand.getRandomAlpha()
		randomLastName = genRand.getRandomAlpha()

		//randomFirstName = CustomKeywords.'pages.GenerateRandom.getRandomAlpha'()
		//randomLastName = CustomKeywords.'pages.GenerateRandom.getRandomAlpha'()

		WebUI.setText(findTestObject(path_AddUser + 'input_FirstName'), randomFirstName)
		WebUI.setText(findTestObject(path_AddUser + 'input_LastName'), randomLastName)

		WebUI.setText(findTestObject(path_AddUser + 'input_Password'), pwd)
		WebUI.setText(findTestObject(path_AddUser + 'input_ConfirmPassword'), confirPwd)

		if (lockAC.equalsIgnoreCase("N")) {
			// Select No for Lock Account
			WebUI.check(findTestObject(path_AddUser + 'input_No_lock'))
		}
		else if (lockAC.equalsIgnoreCase("Y")) {
			// Select Yes for Lock Account
			WebUI.check(findTestObject(path_AddUser + 'input_Yes_lock'))
		}
		else {
			// Select No for Lock Account
			WebUI.check(findTestObject(path_AddUser + 'input_No_lock'))
		}


		// Select the Create button
		WebUI.click(findTestObject(path_AddUser + 'button_Create'))
	}


	@Keyword
	def setDataAddUserEF(int rowS, dataFileS) {
		// GetData
		userName = dataFileS.getValue('Username', rowS)
		email = dataFileS.getValue('Email', rowS)
		pwd = dataFileS.getValue('Password', rowS)
		confirPwd = dataFileS.getValue('ConfirmPassword', rowS)
		lockAC = dataFileS.getValue('Lock', rowS)


		// SetData
		WebUI.setText(findTestObject(path_AddUser + 'input_EmailAddress'), email)

		// Get Random UserName as per test data
		switch(userName) {
			case "A":
			//def randomUserName = CustomKeywords.'pages.GenerateRandom.getRandomAlpha'()
				randomUserName = genRand.getRandomAlpha()
				break

			case "AN":
			//def randomUserName = CustomKeywords.'pages.GenerateRandom.getRandomAlphaNum'()
				randomUserName = genRand.getRandomAlphaNum()
				break

			case "N":
			//def randomUserName = CustomKeywords.'pages.GenerateRandom.getRandomNum'()
				randomUserName = genRand.getRandomNum()
				break
		}

		println(randomUserName)
		WebUI.setText(findTestObject(path_AddUser + 'input_Username'), randomUserName)

		// Get random First and Last Names
		randomFirstName = genRand.getRandomAlpha()
		randomLastName = genRand.getRandomAlpha()

		//randomFirstName = CustomKeywords.'pages.GenerateRandom.getRandomAlpha'()
		//randomLastName = CustomKeywords.'pages.GenerateRandom.getRandomAlpha'()

		WebUI.setText(findTestObject(path_AddUser + 'input_FirstName'), randomFirstName)
		WebUI.setText(findTestObject(path_AddUser + 'input_LastName'), randomLastName)

		WebUI.setText(findTestObject(path_AddUser + 'input_Password'), pwd)
		WebUI.setText(findTestObject(path_AddUser + 'input_ConfirmPassword'), confirPwd)

		if (lockAC.equalsIgnoreCase("N")) {
			// Select No for Lock Account
			WebUI.check(findTestObject(path_AddUser + 'input_No_lock'))
		}
		else if (lockAC.equalsIgnoreCase("Y")) {
			// Select Yes for Lock Account
			WebUI.check(findTestObject(path_AddUser + 'input_Yes_lock'))
		}
		else {
			// Select No for Lock Account
			WebUI.check(findTestObject(path_AddUser + 'input_No_lock'))
		}


		// Select the Create button
		WebUI.click(findTestObject(path_AddUser + 'button_Create'))
	}
}
