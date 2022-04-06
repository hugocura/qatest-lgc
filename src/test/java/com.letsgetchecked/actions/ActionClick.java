package com.letsgetchecked.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.letsgetchecked.TechChallenge.driver;

public class ActionClick {
    public static void execute(WebElement element) {
        element.click();
    }

    public static void id(String element) {
        driver.findElement(By.id(element)).click();
    }

    public static void className(String element) {
        driver.findElement(By.className(element)).click();
    }

    public static void css(String element) {
        driver.findElement(By.cssSelector(element)).click();
    }

    public static void xpath(String element) {
        driver.findElement(By.xpath(element)).click();
    }

}
