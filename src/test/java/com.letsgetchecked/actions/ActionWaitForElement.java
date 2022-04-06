package com.letsgetchecked.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.letsgetchecked.TechChallenge.driver;
import static com.letsgetchecked.TechChallenge.waitTimeout;

public class ActionWaitForElement {

    public static void css(String locator, int timeout) {
        new WebDriverWait(driver, Duration.ofSeconds(timeout).toSeconds()).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
    }

    public static void css(String locator) {
        css(locator, waitTimeout);
    }

}
