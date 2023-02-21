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

/*
 * def key def giveMeKey(){ String alphabet =
 * (('A'..'N')+('P'..'Z')+('a'..'k')+('m'..'z')+('2'..'9')).join() def length =
 * 6 key = new Random().with { (1..length).collect { alphabet[ nextInt(
 * alphabet.length() ) ] }.join() } return key }
 * 
 * println key
 */


/*
 * for (def row = 1; row <= 10; row++) { println new Random().with
 * {(1..9).collect {(('a'..'z')).join()[
 * nextInt((('a'..'z')).join().length())]}.join()} }
 */

import org.apache.commons.lang.RandomStringUtils

// Alpha numeric
//for (def row = 1; row <= 10; row++) {
//String charset = (('A'..'Z') + ('a'..'z') + ('0'..'9')).join()
//Integer length = 9
//String randomString = RandomStringUtils.random(length, charset.toCharArray())

//println randomString}


// Alpha only
//for (def row = 1; row <= 10; row++) {
//	String charset = (('A'..'Z') + ('a'..'z')).join()
//	Integer length = 9
//	String randomString = RandomStringUtils.random(length, charset.toCharArray())
	
//	println randomString}


// numeric only
//for (def row = 1; row <= 10; row++) {
//	String charset = (('0'..'9')).join()
//	Integer length = 9
//	String randomString = RandomStringUtils.random(length, charset.toCharArray())
	
//	println randomString}

for (def row = 1; row <= 2; row++) {
	def myRan = CustomKeywords.'pages.GenerateRandom.getRandomAlphaNum'()
	println myRan
}
	
	