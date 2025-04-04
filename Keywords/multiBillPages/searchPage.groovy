package multiBillPages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.jsoup.select.Evaluator.IsEmpty

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class searchPage {


	String pathOR = "Object Repository/MultiBill/MultiBillSearch/"

	//*********************************************************************************************

	/*GetData and SetData for Search 
	 Takes the argument for Search transaction* and click on search
	 */
	//*********************************************************************************************


	@Keyword
	def setDataSearchString(String searchStringS) {

		if(WebUI.verifyElementVisible(findTestObject(pathOR + 'input_Search_searchInput'))) {
			if(searchStringS!=IsEmpty) {
				WebUI.setText(findTestObject(pathOR + 'input_Search_searchInput'),searchStringS)
				WebUI.click(findTestObject(pathOR +'btn_Search'))
			}
			else {
				KeywordUtil.logInfo("Search String is not provided in test data sheet")
			}
		}
		else {
			KeywordUtil.logInfo("Search input text box not present.Please check the env")
		}
	}

	//Select Add to Cart icon
	@Keyword
	def selectAddtoCart() {

		WebUI.check(findTestObject(pathOR+'btn_addToCartIcon'))
	}

	//select remove from Cart icon
	@Keyword
	def selectRemoveFromCart() {

		WebUI.check(findTestObject(pathOR+'btn_removeFromCartIcon'))
	}

	//clear the search
	@Keyword
	def selectClearSearch() {

		WebUI.check(findTestObject(pathOR+'btn_ClearSearch'))
	}

	//Click on View Cart
	@Keyword
	def selectViewCart() {

		WebUI.check(findTestObject(pathOR+'btn_ViewCart'))
	}
}

