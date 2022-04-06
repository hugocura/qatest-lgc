package com.letsgetchecked.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static com.letsgetchecked.TechChallenge.driver;

public class ActionEnterText {
    // default text input element using id
    public static void execute(String element, String text, boolean submit) {
        WebElement textBox = driver.findElement(By.id(element));

        textBox.sendKeys(text);

        if (submit) {
            textBox.sendKeys(Keys.ENTER);
        }
    }

    public static void execute(String element, String text) {
        execute(element, text, false);
    }

}
