package com.letsgetchecked.validates;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.letsgetchecked.TechChallenge.driver;
import static com.letsgetchecked.TechChallenge.waitTimeout;

public class ValidateExists {

    // validation using cssSelector
    public static void css(String locator) {
        new WebDriverWait(driver, Duration.ofSeconds(waitTimeout).toSeconds()).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
        Assertions.assertTrue(driver.findElement(By.cssSelector(locator)).isDisplayed());
    }

    public static void xpath(String locator) {
        new WebDriverWait(driver, Duration.ofSeconds(waitTimeout).toSeconds()).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        Assertions.assertTrue(driver.findElement(By.xpath(locator)).isDisplayed());
    }

}
