package com.letsgetchecked.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static com.letsgetchecked.TechChallenge.driver;

public class ActionScrollToElement {

    public static void css(String element) {
        new Actions(driver).moveToElement(driver.findElement(By.cssSelector(element))).build().perform();
    }

    public static void xpath(String element) {
        new Actions(driver).moveToElement(driver.findElement(By.xpath(element))).build().perform();
    }

}
