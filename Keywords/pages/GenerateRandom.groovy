package pages

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

import org.apache.commons.lang.RandomStringUtils

import internal.GlobalVariable

public class GenerateRandom {

	@Keyword
	def getRandomAlphaNum() {
		String charset = (('A'..'Z') + ('a'..'z') + ('0'..'9')).join()
		Integer length = 9
		String randomAN = RandomStringUtils.random(length, charset.toCharArray())

		//String randomString = org.apache.commons.lang.RandomStringUtils.random(9, true, true)

		return randomAN

	}


	@Keyword
	def getRandomAlpha() {
		String charset = (('A'..'Z') + ('a'..'z')).join()
		Integer length = 9
		String randomA = RandomStringUtils.random(length, charset.toCharArray())
		return randomA
	}



	@Keyword
	def getRandomNum() {
		String charset = (('0'..'9')).join()
		Integer length = 9
		String randomN = RandomStringUtils.random(length, charset.toCharArray())
		return randomN
	}


	@Keyword
	def getRandomAlphaNumCustomLength(Integer sLength) {
		String charset = (('A'..'Z') + ('a'..'z') + ('0'..'9')).join()
		Integer length = sLength
		String randomAN = RandomStringUtils.random(length, charset.toCharArray())
		
		System.out.println('Password is : ' + randomAN)

		//String randomString = org.apache.commons.lang.RandomStringUtils.random(9, true, true)

		return randomAN

	}
}
