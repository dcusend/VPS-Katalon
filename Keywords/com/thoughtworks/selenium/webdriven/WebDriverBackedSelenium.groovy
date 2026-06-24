package com.thoughtworks.selenium.webdriven

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.WebDriver

class WebDriverBackedSelenium extends Selenium {

    WebDriverBackedSelenium(WebDriver driver, String baseUrl) {
        super(driver, baseUrl)
    }
}
