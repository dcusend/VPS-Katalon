package com.thoughtworks.selenium

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.NoSuchElementException
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.support.ui.WebDriverWait

import java.time.Duration

class Selenium {

    protected final WebDriver driver
    protected final String baseUrl

    Selenium(WebDriver driver, String baseUrl) {
        this.driver = driver
        this.baseUrl = baseUrl ?: ''
    }

    void open(String url) {
        if (url?.startsWith('http://') || url?.startsWith('https://')) {
            driver.get(url)
            return
        }

        if (baseUrl.endsWith('/') && url?.startsWith('/')) {
            driver.get(baseUrl + url.substring(1))
            return
        }

        driver.get(baseUrl + (url ?: ''))
    }

    void type(String locator, String value) {
        WebElement element = findElement(locator)
        element.clear()
        element.sendKeys(value ?: '')
    }

    void click(String locator) {
        if (isDocumentExpression(locator)) {
            executeDocumentClick(locator)
            return
        }

        findElement(locator).click()
    }

    void select(String locator, String option) {
        Select select = new Select(findElement(locator))
        if (option?.startsWith('label=')) {
            select.selectByVisibleText(option.substring('label='.length()))
            return
        }
        if (option?.startsWith('value=')) {
            select.selectByValue(option.substring('value='.length()))
            return
        }
        if (option?.startsWith('index=')) {
            select.selectByIndex(option.substring('index='.length()).toInteger())
            return
        }

        select.selectByVisibleText(option)
    }

    void waitForPageToLoad(String timeoutInMillis) {
        long timeoutMs = timeoutInMillis?.isLong() ? timeoutInMillis.toLong() : 30000L
        long timeoutSeconds = Math.max(1L, timeoutMs / 1000L)
        new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds)).until {
            ((JavascriptExecutor) driver).executeScript('return document.readyState') == 'complete'
        }
    }

    String getText(String locator) {
        return findElement(locator).getText()
    }

    String getValue(String locator) {
        return findElement(locator).getAttribute('value')
    }

    void selectWindow(String windowId) {
        // Legacy SelIDE placeholder; current suites do not require a switch.
    }

    protected WebElement findElement(String locator) {
        return driver.findElement(byFromLegacyLocator(locator))
    }

    protected By byFromLegacyLocator(String locator) {
        if (locator == null) {
            throw new NoSuchElementException('Locator is null')
        }

        if (locator.startsWith('id=')) {
            return By.id(locator.substring('id='.length()))
        }
        if (locator.startsWith('name=')) {
            return By.name(locator.substring('name='.length()))
        }
        if (locator.startsWith('css=')) {
            return By.cssSelector(locator.substring('css='.length()))
        }
        if (locator.startsWith('xpath=')) {
            return By.xpath(locator.substring('xpath='.length()))
        }
        if (locator.startsWith('//') || locator.startsWith('(//')) {
            return By.xpath(locator)
        }

        // Default to CSS for raw locators without an explicit prefix.
        return By.cssSelector(locator)
    }

    protected boolean isDocumentExpression(String locator) {
        return locator?.startsWith('document.')
    }

    protected void executeDocumentClick(String locator) {
        ((JavascriptExecutor) driver).executeScript("${locator}.click();")
    }
}
