package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String MONTH_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select";
    public static final String DAY_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String YEAR_SELECT = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://facebook.com");

        WebElement cookieButton = driver.findElement(By.id("u_0_h"));
        cookieButton.click();

        WebElement createAccountButton = driver.findElement(By.id("u_0_2"));
        createAccountButton.click();

        Thread.sleep(5000);

        WebElement selectMonth = driver.findElement(By.xpath(MONTH_SELECT));
        Select month = new Select(selectMonth);
        month.selectByIndex(12);

        WebElement selectDay = driver.findElement(By.xpath(DAY_SELECT));
        Select day = new Select(selectDay);
        day.selectByIndex(30);

        WebElement selectYear = driver.findElement(By.xpath(YEAR_SELECT));
        Select year = new Select(selectYear);
        year.selectByValue("1993");








    }
}
