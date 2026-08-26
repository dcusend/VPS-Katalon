package abpPages

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

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.util.KeywordUtil



public class UserListPage {

	def firstName,lastName,login,confirmLogin,userName,email,wrongPassword,wrongUserName
	def OwnerFirstName, OwnerLastName, OwnerUserName, newEmail, OwnerPassword, OwnerConfirmPassword
	def PayerFirstName, PayerLastName, PayerUserName, PayerPassword, PayerConfirmPassword
	

	@Keyword
	def clickAddButton() {
		WebUI.click(findTestObject('Object Repository/ABP/Page_UserList/input_Add'))
	}

	@Keyword
	def clickEdit() {
		WebUI.click(findTestObject('Object Repository/ABP/Page_UserList/a_edit'))
	}

	@Keyword
	def clickSaveButton() {
		WebUI.click(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_save'))
	}

	@Keyword
	def generatefirstName() {
		firstName = org.apache.commons.lang.RandomStringUtils.random(8, true, false)

		return  firstName
	}

	@Keyword
	def generatelastName() {
		lastName = org.apache.commons.lang.RandomStringUtils.random(8, true, false)

		return  lastName
	}

	@Keyword
	def generateuserName() {
		userName = org.apache.commons.lang.RandomStringUtils.random(8, true, false)

		return  userName
	}

	@Keyword    //Password
	def generateLogin() {
		login = org.apache.commons.lang.RandomStringUtils.random(9,true,true) + "!"
		confirmLogin = login
		println(login +  confirmLogin)
		return  login
	}

	@Keyword
	def selectRoleProfileOwner() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/select_Role'), "Profile Owner", false)
	}

	@Keyword
	def selectRolePayer() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/select_Role'), "Payer", false)
	}

	@Keyword     //Password
	def setDataLoginConfirmLogin() {
		this.generateLogin()

		if ((!login.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_password'),login)
		}


		if ((!confirmLogin.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_confirmPassword'),confirmLogin)
		}
	}

	@Keyword
	def setDataWrongPassword(wrongPassword) {

		if ((!wrongPassword.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_password'),wrongPassword)
		}


		if ((!wrongPassword.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_confirmPassword'),wrongPassword)
		}
	}

	@Keyword
	def setDataFirstNameLastName() {
		this.generatefirstName()
		this.generatelastName()
		if ((!firstName.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_firstName'),firstName)
			
			println(firstName)
		}


		if ((!lastName.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_lastName'),lastName)
			
			println(lastName)
		}
	}

	@Keyword
	def setDataUserName() {
		this.generateuserName()
		if ((!userName.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_username'),userName)
			
			println(userName)
		}
		
		return userName	
	}

	@Keyword
	def setDataWrongUserName(wrongUserName) {
		if ((!wrongUserName.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_username'),wrongUserName)
		}
	}

	@Keyword
	def setDataEmailConfirmEmail(email) {
		if ((!email.isEmpty())) {
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_email'),email)
			WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_confirmEmail'),email)
			
			println(email)
		}
	}

	

										  //created by Bharat Bhushan
	
											//Part A: Profile Owner 
	
		                                      	
@Keyword
def generateOwnerFirstName() {
	OwnerFirstName = org.apache.commons.lang.RandomStringUtils.random(8, true, false)

	return  OwnerFirstName
}


@Keyword
def generateOwnerLastName() {
	OwnerLastName = org.apache.commons.lang.RandomStringUtils.random(8, true, false)

	return  OwnerLastName
}


@Keyword
def generateOwnerUserName() {
	OwnerUserName = org.apache.commons.lang.RandomStringUtils.random(8, true, false)

	return  OwnerUserName
}


@Keyword
def generateOwnerPassword() {
	OwnerPassword = org.apache.commons.lang.RandomStringUtils.random(9,true,true) + "!"
	OwnerConfirmPassword = OwnerPassword
	println(OwnerPassword +  OwnerConfirmPassword)
	return  OwnerPassword
}


@Keyword
def setDataOwnerFirstNameOwnerLastName() {
	this.generateOwnerFirstName()
	this.generateOwnerLastName()
	if ((!OwnerFirstName.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_firstName'),OwnerFirstName)
		
		println(OwnerFirstName)
	}


	if ((!OwnerLastName.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_lastName'),OwnerLastName)
		
		println(OwnerLastName)
	}
	
	return [
		firstName: OwnerFirstName,
		lastName : OwnerLastName
	]
	
}



@Keyword
def setDataOwnerUserName() {
	this.generateOwnerUserName()
	if ((!OwnerUserName.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_username'),OwnerUserName)
		
		println(OwnerUserName)
	}
}


@Keyword
def setDataOwnerEmailConfirmEmail(newEmail) {
	if ((!newEmail.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_email'),newEmail)
		WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_confirmEmail'),newEmail)
		
		println(newEmail)
	}
}


@Keyword
def setDataOwnerPasswordOwnerConfirmPassword() {
	this.generateOwnerPassword()

	if ((!OwnerPassword.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_password'),OwnerPassword)

	}


	if ((!OwnerConfirmPassword.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_confirmPassword'),OwnerConfirmPassword)

	}

  }
											   												  

  
//to edit newly created 'Profile Owner' OR 'Payer'. (common keyword)
  
  @Keyword
  def clickEditByUserName(String targetUserName) {
  
	  WebDriver driver = DriverFactory.getWebDriver()
  
	  List<WebElement> rows = driver.findElements(By.tagName("tr"))
  
	  for (WebElement row : rows) {
  
		  List<WebElement> cols = row.findElements(By.tagName("td"))
  
		  if (cols.size() < 4) {
			  continue
		  }
  
		  String actualUserName = cols.get(0).getText().trim()
  
		  if (actualUserName.equalsIgnoreCase(targetUserName.trim())) {
  
			  println("Selected 'User Name' = " + actualUserName)
  
			  row.findElement(By.linkText("edit")).click()
  
			  return actualUserName
		  }
	  }
  
	  KeywordUtil.markFailed("User not found : " + targetUserName)
  
	  return null
  }
  
    

//for UI verification in 'User List' after editing 'Owner'-> 1. adding getters 2. creating a new UI verification keyword
 
@Keyword
def getOwnerFirstName() {
	return OwnerFirstName	
}

@Keyword
def getOwnerLastName() {
	return OwnerLastName
}

@Keyword
def getOwnerUserName() {
	return OwnerUserName
}



@Keyword
def verifyEditedOwnerUser(String expectedUserName, String expectedFirstName, String expectedLastName, String expectedRole) {

    WebDriver driver = DriverFactory.getWebDriver()

    boolean userFound = false
	
    String expectedName   = expectedFirstName + " " + expectedLastName
	println("Expected 'Name': " + expectedName)

    List<WebElement> rows = driver.findElements(By.tagName("tr"))

    for (WebElement row : rows) {

        List<WebElement> cols = row.findElements(By.tagName("td"))

        if (cols.size() < 4) {
            continue
        }

        String actualUserName = cols.get(0).getText().trim()
        String actualName     = cols.get(1).getText().trim()
        String actualRole     = cols.get(2).getText().trim()

				
		if (actualUserName.trim().equalsIgnoreCase(expectedUserName.trim())) {
			
			println("Actual 'User Name': " + actualUserName)
			println("Actual 'Name': " + actualName)
			println("Actual 'Role': " + actualRole)

            userFound = true

            assert actualName.equals(expectedName) :"Expected Name = ${expectedName}, Actual Name = ${actualName}"
            assert actualRole.equals(expectedRole) :"Expected Role = ${expectedRole}, Actual Role = ${actualRole}"

            WebElement editLink   = row.findElement(By.linkText("edit"))
            WebElement deleteLink = row.findElement(By.linkText("delete"))

            assert editLink.isDisplayed()
            assert editLink.isEnabled()

            assert deleteLink.isDisplayed()
            assert deleteLink.isEnabled()

            println("'User Name' Verified : " + actualUserName)
            println("'Name' Verified      : " + actualName)
            println("'Role' Verified      : " + actualRole)
			println("edit Link Enabled")
			println("delete Link Enabled")

            break
        }
    }

    assert userFound : "User [" + expectedUserName + "] not found in User List page"
		
    }



//to verify 'Profile Owner' OR 'Payer' 'Role' in 'User List' page after changing user from Payer to Profile Owner OR from Profile Owner to Payer
//(common keyword) for both 'Profile Owner' and 'Payer'.

@Keyword
def verifyUserRole(String expectedUserName, String expectedRole) {

	WebDriver driver = DriverFactory.getWebDriver()

	List<WebElement> rows = driver.findElements(By.tagName("tr"))

	for (WebElement row : rows) {

		List<WebElement> cols = row.findElements(By.tagName("td"))

		if (cols.size() < 3) {
			continue
		}

		String actualUserName = cols.get(0).getText().trim()
		String actualRole = cols.get(2).getText().trim()

		if (actualUserName.equalsIgnoreCase(expectedUserName)) {

			println("'User Name' : " + actualUserName)
			println("New 'Role'      : " + actualRole)

			assert actualRole.equalsIgnoreCase(expectedRole) :
				"Expected Role = ${expectedRole}, Actual Role = ${actualRole}"

			println("Role Successfully Verified")
			return
		}
	}

	KeywordUtil.markFailed("User not found : " + expectedUserName)
}



//to delete the newly created 'User Name' for both 'Profile Owner' OR 'Payer'.(common keyword)

@Keyword
def deleteUserByUserName(String targetUserName) {

    WebDriver driver = DriverFactory.getWebDriver()

    List<WebElement> rows = driver.findElements(By.tagName("tr"))

    for (WebElement row : rows) {

        List<WebElement> cols = row.findElements(By.tagName("td"))

        if (cols.size() < 4) {
            continue
        }

        String actualUserName = cols.get(0).getText().trim()

        if (actualUserName.equalsIgnoreCase(targetUserName.trim())) {

            println("Deleting 'User Name' = " + actualUserName)

            row.findElement(By.linkText("delete")).click()
			
			WebUI.delay(2)
            WebUI.acceptAlert()    //pop up handling.

            return actualUserName
        }
    }

    KeywordUtil.markFailed("User not found : " + targetUserName)

    return null
}



//after deletion, verify that user for both 'Profile Owner' OR 'Payer' no longer exists.(common keyword)

@Keyword
boolean verifyUserDeleted(String targetUserName) {

	WebDriver driver = DriverFactory.getWebDriver()

	List<WebElement> rows = driver.findElements(By.tagName("tr"))

	for (WebElement row : rows) {

		List<WebElement> cols = row.findElements(By.tagName("td"))

		if (cols.size() < 1) {
			continue
		}

		String actualUserName = cols.get(0).getText().trim()

		if (actualUserName.equalsIgnoreCase(targetUserName.trim())) {

			println(
				"User still exists after delete : " + targetUserName
			)

			return false
		  }
	    }

		println(
		"successfully deleted user : " + targetUserName				
		  )
	
		return true
		
}




										//Part B: Payer


@Keyword
def generatePayerFirstName() {
	PayerFirstName = org.apache.commons.lang.RandomStringUtils.random(8, true, false)

	return  PayerFirstName
}


@Keyword
def generatePayerLastName() {
	PayerLastName = org.apache.commons.lang.RandomStringUtils.random(8, true, false)

	return  PayerLastName
}


@Keyword
def generatePayerUserName() {
	PayerUserName = org.apache.commons.lang.RandomStringUtils.random(8, true, false)

	return  PayerUserName
}


@Keyword
def generatePayerPassword() {
	PayerPassword = org.apache.commons.lang.RandomStringUtils.random(9,true,true) + "!"
	PayerConfirmPassword = PayerPassword
	println(PayerPassword +  PayerConfirmPassword)
	return  PayerPassword
}


@Keyword
def setDataPayerFirstNamePayerLastName() {
	this.generatePayerFirstName()
	this.generatePayerLastName()
	if ((!PayerFirstName.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_firstName'),PayerFirstName)
		
		println(PayerFirstName)
	}


	if ((!PayerLastName.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_lastName'),PayerLastName)
		
		println(PayerLastName)
	}
	
	return [
		firstName: PayerFirstName,
		lastName : PayerLastName
	]
	
}



@Keyword
def setDataPayerUserName() {
	this.generatePayerUserName()
	if ((!PayerUserName.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_username'),PayerUserName)
		
		println(PayerUserName)
	}
}


@Keyword
def setDataPayerEmailConfirmEmail(newEmail) {
	if ((!newEmail.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_email'),newEmail)
		WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_confirmEmail'),newEmail)
		
		println(newEmail)
	}
}


@Keyword
def setDataPayerPasswordPayerConfirmPassword() {
	this.generatePayerPassword()

	if ((!PayerPassword.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_password'),PayerPassword)

	}


	if ((!PayerConfirmPassword.isEmpty())) {
		WebUI.setText(findTestObject('Object Repository/ABP/Page_UserList/Page_Profile/input_confirmPassword'),PayerConfirmPassword)

	}

  }
																								 


//for UI verification in 'User List' after editing 'Payer'-> 1. adding getters 2. creating a new UI verification keyword

  
@Keyword
def getPayerFirstName() {
	return PayerFirstName	
}

@Keyword
def getPayerLastName() {
	return PayerLastName
}

@Keyword
def getPayerUserName() {
	return PayerUserName
}



@Keyword
def verifyEditedPayerUser(String expectedUserName, String expectedFirstName, String expectedLastName, String expectedRole) {

    WebDriver driver = DriverFactory.getWebDriver()

    boolean userFound = false
	
    String expectedName   = expectedFirstName + " " + expectedLastName
	println("Expected 'Name': " + expectedName)

    List<WebElement> rows = driver.findElements(By.tagName("tr"))

    for (WebElement row : rows) {

        List<WebElement> cols = row.findElements(By.tagName("td"))

        if (cols.size() < 4) {
            continue
        }

        String actualUserName = cols.get(0).getText().trim()
        String actualName     = cols.get(1).getText().trim()
        String actualRole     = cols.get(2).getText().trim()

				
		if (actualUserName.trim().equalsIgnoreCase(expectedUserName.trim())) {
			
			println("Actual 'User Name': " + actualUserName)
			println("Actual 'Name': " + actualName)
			println("Actual 'Role': " + actualRole)

            userFound = true

            assert actualName.equals(expectedName) :"Expected Name = ${expectedName}, Actual Name = ${actualName}"
            assert actualRole.equals(expectedRole) :"Expected Role = ${expectedRole}, Actual Role = ${actualRole}"

            WebElement editLink   = row.findElement(By.linkText("edit"))
            WebElement deleteLink = row.findElement(By.linkText("delete"))

            assert editLink.isDisplayed()
            assert editLink.isEnabled()

            assert deleteLink.isDisplayed()
            assert deleteLink.isEnabled()

            println("'User Name' Verified : " + actualUserName)
            println("'Name' Verified      : " + actualName)
            println("'Role' Verified      : " + actualRole)
			println("edit Link Enabled")
			println("delete Link Enabled")

            break
        }
    }

    assert userFound : "User [" + expectedUserName + "] not found in User List page"
		
    }

}





