package customClasses

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject

public class LegacyLocatorUtils {

	@Keyword
	def testObjectFromLegacyLocator(String locator) {
		TestObject testObject = new TestObject(locator)

		if (locator.startsWith('id=')) {
			testObject.addProperty('id', ConditionType.EQUALS, locator.substring('id='.length()))
			return testObject
		}
		if (locator.startsWith('name=')) {
			testObject.addProperty('name', ConditionType.EQUALS, locator.substring('name='.length()))
			return testObject
		}
		if (locator.startsWith('css=')) {
			testObject.addProperty('css', ConditionType.EQUALS, locator.substring('css='.length()))
			return testObject
		}
		if (locator.startsWith('xpath=')) {
			testObject.addProperty('xpath', ConditionType.EQUALS, locator.substring('xpath='.length()))
			return testObject
		}

		// Fallback keeps compatibility for simple raw CSS locators.
		testObject.addProperty('css', ConditionType.EQUALS, locator)
		return testObject
	}
}
