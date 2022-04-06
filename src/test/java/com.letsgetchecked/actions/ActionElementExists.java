package com.letsgetchecked.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.letsgetchecked.TechChallenge.driver;
import static com.letsgetchecked.TechChallenge.waitTimeout;

public class ActionElementExists {

    public static boolean css(String locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(waitTimeout).toSeconds()).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator))).isDisplayed();
    }

    public static boolean xpath(String locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(waitTimeout).toSeconds()).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator))).isDisplayed();
    }

}
