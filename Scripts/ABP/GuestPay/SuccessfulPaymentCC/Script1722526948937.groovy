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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser("https://qa.velocitypayment.com/vbills/mbills/login.go")
WebUI.maximizeWindow()

WebUI.selectOptionByValue(findTestObject('Object Repository/ABP/LoginABP/select_BillType'), "485", false)
//WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/LoginABP/select_BillType'), "485bills", false)



WebUI.setText(findTestObject('Object Repository/ABP/LoginABP/input__billLookupForm.lookupValue1'),"1409092")
WebUI.setText(findTestObject('Object Repository/ABP/LoginABP/input__billLookupForm.lookupValue2'),"1409093")
WebUI.setText(findTestObject('Object Repository/ABP/LoginABP/input__billLookupForm.lookupValue3'),"1409094")
WebUI.click(findTestObject('Object Repository/ABP/LoginABP/input__guestBillSubmitBtn'))


WebUI.click(findTestObject('Object Repository/ABP/PaymentEntryCC/img_Amount to Pay_arrow1'))
//WebUI.check(findTestObject('Object Repository/ABP/PaymentEntryCC/img_Amount to Pay_arrow1'))

//WebUI.click(findTestObject('Object Repository/ABP/PaymentEntryCC/CustomCheckToPay'))



//WebDriver driver = DriverFactory.getWebDriver()

//WebElement element = driver.findElement(By.xpath("//img[@id = 'arrow1' and @src = '/vbills/_assets/img/a.gif' and @alt = 'Check to Pay']")).click();
//WebElement element = driver.findElement(By.xpath("//img[@id = 'arrow1' and @src = '/vbills/_assets/img/a.gif']")).click();

//WebElement element = driver.findElement(By.name('billDetailForms[0].payCheckbox')).click();

//WebElement element = driver.findElement(By.xpath("//img[@id='arrow1' and src='/vbills/_assets/img/a.gif' and align='abstop' and width='25' and height='25' and alt='Check to Pay']")).click();




//WebUI.clearText(findTestObject('Object Repository/ABP/PaymentEntryCC/input__billDetailForms0.payAmount'))

//WebUI.sendKeys(findTestObject('Object Repository/ABP/PaymentEntryCC/input__billDetailForms0.payAmount'), Keys.chord(Keys.CONTROL, 'a'));

//WebUI.sendKeys(findTestObject('Object Repository/ABP/PaymentEntryCC/input__billDetailForms0.payAmount'), "");
WebUI.sendKeys(findTestObject('Object Repository/ABP/PaymentEntryCC/input__billDetailForms0.payAmount'), "10.50");


//WebUI.setText(findTestObject('Object Repository/ABP/PaymentEntryCC/input__billDetailForms0.payAmount'),"10.50")


WebUI.selectOptionByLabel(findTestObject('Object Repository/ABP/PaymentEntryCC/select_PaymentMethod'), "Credit Card", false)

WebUI.setText(findTestObject('Object Repository/ABP/PaymentEntryCC/input_accountHolderName'),"Tinu Jakia")


WebUI.setText(findTestObject('Object Repository/ABP/PaymentEntryCC/input_cardAccountNumber'),"4111111111111111")


WebUI.setText(findTestObject('Object Repository/ABP/PaymentEntryCC/input_cvv'),"123")


WebUI.selectOptionByValue(findTestObject('Object Repository/ABP/PaymentEntryCC/select_Month'), "10", false)

WebUI.selectOptionByValue(findTestObject('Object Repository/ABP/PaymentEntryCC/select_Year'), "2025", false)

//element = driver.findElement(By.xpath("//img[@id = 'arrow1' and @src = '/vbills/_assets/img/a.gif']")).click();

//WebUI.click(findTestObject('Object Repository/ABP/PaymentEntryCC/img_Amount to Pay_arrow1'))
//WebUI.click(findTestObject('Object Repository/ABP/PaymentEntryCC/img_Amount to Pay_arrow1'))

//WebUI.clearText(findTestObject('Object Repository/ABP/PaymentEntryCC/input__billDetailForms0.payAmount'))

//WebUI.sendKeys(findTestObject('Object Repository/ABP/PaymentEntryCC/input__billDetailForms0.payAmount'), Keys.chord(Keys.CONTROL, 'a'));
//WebUI.sendKeys(findTestObject('Object Repository/ABP/PaymentEntryCC/input__billDetailForms0.payAmount'), "10.50");


//println WebUI.verifyElementChecked(findTestObject('Object Repository/ABP/PaymentEntryCC/img_Amount to Pay_arrow1'), 30)


WebUI.click(findTestObject('Object Repository/ABP/PaymentEntryCC/input_Submit'))

