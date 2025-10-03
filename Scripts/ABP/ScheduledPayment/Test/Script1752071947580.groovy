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


def username,password,planType,paymentMethod,paymentPlanFrequency

username = GlobalVariable.abpDCFUsername
password = GlobalVariable.abpDCFPassword
planType = "InstallmentPlan"
paymentPlanFrequency = "Daily"
paymentMethod = "Smith"
WebUI.openBrowser(GlobalVariable.abpURL)
WebUI.maximizeWindow()
//Login to ABP Application
CustomKeywords.'abpPages.LoginPage.setLoginDataMethod'(username,password)
//Click on Check box to select check to Pay
CustomKeywords.'abpPages.PendingBillPage.checkToPayMethod'()
CustomKeywords.'abpPages.PendingBillPage.clickSchedulePaymentIcon'()
CustomKeywords.'abpPages.ScheduledPaymentPage.selectPaymentMethod'(paymentMethod)
CustomKeywords.'abpPages.ScheduledPaymentPage.checkRadioPaymentPlanType'(planType)
CustomKeywords.'abpPages.ScheduledPaymentPage.selectPaymentPlanFrequency'(paymentPlanFrequency)