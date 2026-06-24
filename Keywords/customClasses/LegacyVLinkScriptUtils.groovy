package customClasses

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class LegacyVLinkScriptUtils {

	private static final int DEFAULT_PAGE_LOAD_TIMEOUT_SECONDS = 30
	private final LegacyLocatorUtils locatorUtils = new LegacyLocatorUtils()

	@Keyword
	def openVLinkBrowser(String startUrl = 'https://www.google.com/') {
		WebUI.openBrowser(startUrl)
	}

	@Keyword
	def closeVLinkBrowser() {
		WebUI.closeBrowser()
	}

	@Keyword
	int getDefaultPageLoadTimeoutSeconds() {
		return DEFAULT_PAGE_LOAD_TIMEOUT_SECONDS
	}

	@Keyword
	def clickByLocator(String locator) {
		def testObject = locatorUtils.testObjectFromLegacyLocator(locator)
		WebUI.click(testObject)
	}

	@Keyword
	String getTextByLocator(String locator) {
		def testObject = locatorUtils.testObjectFromLegacyLocator(locator)
		return WebUI.getText(testObject)
	}

	@Keyword
	def fillFields(Map<String, String> fields) {
		fields.each { locator, value ->
			def testObject = locatorUtils.testObjectFromLegacyLocator(locator)
			WebUI.setText(testObject, value)
		}
	}

	@Keyword
	String extractTranId(String responseText) {
		if (!responseText) {
			return ''
		}

		if (responseText.length() >= 44) {
			String fixedWidthTranId = responseText.substring(35, 44).trim()
			if (fixedWidthTranId) {
				return fixedWidthTranId
			}
		}

		def matcher = (responseText =~ /\b\d{9,}\b/)
		return matcher.find() ? matcher.group(0) : ''
	}

	@Keyword
	String extractTranIdWithLegacySlice(String responseText) {
		if (!responseText) {
			return ''
		}

		if (responseText.length() >= 44) {
			String fixedWidthTranId = responseText.substring(35, 44).trim()
			if (fixedWidthTranId) {
				return fixedWidthTranId
			}
		}

		if (responseText.length() >= 28) {
			String legacyTranId = responseText.substring(19, 28).trim()
			if (legacyTranId) {
				return legacyTranId
			}
		}

		def matcher = (responseText =~ /\b\d{8,}\b/)
		return matcher.find() ? matcher.group(0) : ''
	}
}
