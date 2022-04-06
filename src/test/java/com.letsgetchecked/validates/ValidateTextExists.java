package com.letsgetchecked.validates;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.letsgetchecked.TechChallenge.driver;
import static com.letsgetchecked.TechChallenge.waitTimeout;

public class ValidateTextExists {

    // validation using cssSelector
    public static void execute(String locator, String textToValidate) {
        new WebDriverWait(driver, Duration.ofSeconds(waitTimeout).toSeconds()).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
        Assertions.assertEquals(textToValidate, driver.findElement(By.cssSelector(locator)).getText());
    }

}
