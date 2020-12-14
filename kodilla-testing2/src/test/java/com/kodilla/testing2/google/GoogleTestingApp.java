package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static final String SEARCHFIELD = "gh-ac";

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.ebay.com");

        WebElement search = driver.findElement(By.id(SEARCHFIELD));
        search.submit();
        search.sendKeys("Laptop");
        search.submit();

    }
}
