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
	

		                                      
//NOTE- this will only skip to select logged in user(id=328618) but will select only first, Payer and Profile Owner.
	
//@Keyword								//skipping loggedin user 'AutoABPUser6211' from edit. It has href id=328618
//def clickEditNonLoggedinUser() {
//
//    WebDriver driver = DriverFactory.getWebDriver()
//    List<WebElement> rows = driver.findElements(By.tagName("tr"))
//
//    for (WebElement row : rows) {
//
//        List<WebElement> links = row.findElements(By.linkText("edit"))  	//select only which has 'edit' link
//
//        if (!links.isEmpty()) {
//
//            String href = links.get(0).getAttribute("href")  				//store the URL behind 'edit' link.
//            println(href)
//
//            if (!href.contains("id=328618")) {								//imp- if we remove ! then it will select loggedin user
//              
//                String Username = row.findElements(By.tagName("td")).get(0).getText()   //it doesn't randomly pick Username. It picks first Username from 'User List' not having id=328618
//
//                println("Selected Username: " + Username)
//
//                links.get(0).click()
//
//                return Username
//            }
//        }
//    }
//
//    return null
//}
	

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




//1. always select first 'Profile Owner' user whose href is not id=328618. 2. to change Profile Owner to Payer. 
//3. to select a user whose Role is not 'Payer' in User List.              4. to edit 'Profile Owner' fields value.


@Keyword
def clickEditNonPayerUser() {

	WebDriver driver = DriverFactory.getWebDriver()
	List<WebElement> rows = driver.findElements(By.tagName("tr"))

	for (WebElement row : rows) {

		List<WebElement> cols = row.findElements(By.tagName("td"))

		
		if (cols.size() < 4) {     								// Skip header row
			continue
		}

		String userName = cols.get(0).getText().trim()
		String role     = cols.get(2).getText().trim()

		List<WebElement> editLinks = row.findElements(By.linkText("edit"))

		if (!editLinks.isEmpty()) {

			String href = editLinks.get(0).getAttribute("href")

									
			if (href.contains("id=328618")) {    			  // Skip logged-in user
				continue
			}

			
			if (role.equalsIgnoreCase("Payer")) {             // Skip existing Payers. select Profile Owner
				continue
			}
			
			println("User Name      : ${userName}")
			println("Current 'Role' : ${role}")
			println("Href Id        : ${href}")

			println("Selected Profile Owner: " + userName)
			editLinks.get(0).click()

			return userName
		}
		
	}
		KeywordUtil.markFailed("No non-Payer user found in User List")
		return null
	}	




//to verify 'Profile Owner' OR 'Payer' 'Role' in 'User List' page after changing user from Payer to Profile Owner OR from Profile Owner to Payer
//common keyword for both 'Profile Owner' and 'Payer'.

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
																								 

  
 //1. always select first 'Payer' and user whose href is not id=328618. 2. to change Payer to Profile Owner. 
 //3. to select a user whose Role is not 'Profile Owner' in User List.  4. to edit 'Payer' fields value.
  
  
  @Keyword
  def clickEditNonProfileOwnerUser() {
  
	  WebDriver driver = DriverFactory.getWebDriver()
	  List<WebElement> rows = driver.findElements(By.tagName("tr"))
  
	  for (WebElement row : rows) {
  
		  List<WebElement> cols = row.findElements(By.tagName("td"))
  
		  
		  if (cols.size() < 4) {     								// Skip header row
			  continue
		  }
  
		  String userName = cols.get(0).getText().trim()
		  String role     = cols.get(2).getText().trim()
  
		  List<WebElement> editLinks = row.findElements(By.linkText("edit"))
  
		  if (!editLinks.isEmpty()) {
  
			  String href = editLinks.get(0).getAttribute("href")
  
									  
			  if (href.contains("id=328618")) {    			  			// Skip logged-in user
				  continue
			  }
  
			  
			  if (role.equalsIgnoreCase("Profile Owner")) {             // Skip existing Profile Owner. select only Payer
				  continue
			  }
			  
			  println("'User Name' 	   : ${userName}")
			  println("Current 'Role'  : ${role}")
			  println("Href Id         : ${href}")
  
			  println("Selected Payer: " + userName)
			  editLinks.get(0).click()
  
			  return userName
		  }
		  
	  }
		  KeywordUtil.markFailed("No non-'Profile Owner' user found in User List")
		  return null
	  }
  


//for UI verification in 'User List' after editing 'Payer'-> 1. adding getters 2. creating a new UI verification keyword

  
@Keyword
def getPayerFirstName() {
	return OwnerFirstName	
}

@Keyword
def getPayerLastName() {
	return OwnerLastName
}

@Keyword
def getPayerUserName() {
	return OwnerUserName
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





