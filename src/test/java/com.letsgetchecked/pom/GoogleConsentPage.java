package com.letsgetchecked.pom;

import com.letsgetchecked.actions.ActionClick;
import com.letsgetchecked.actions.ActionElementExists;
import com.letsgetchecked.actions.ActionScrollToElement;
import com.letsgetchecked.validates.ValidateExists;

public class GoogleConsentPage {

    // Locators
    private final static String pageContent = ".G4njw";
    private final static String customiseBtn = "//body[@id='yDmH0d']/c-wiz/div/div/div/div[2]/div/div[4]/div/div/button/div[3]";
    private final static String iAgreeBtn = "//body[@id='yDmH0d']/c-wiz/div/div/div/div[2]/div/div[4]/form/div/div/button/span";

    public static boolean isPresent() {
        return ActionElementExists.css(pageContent);
    }
    public static void tapIAgree() {
        ActionScrollToElement.xpath(iAgreeBtn);
        ActionClick.xpath(iAgreeBtn);
    }

    public static void validate() {
        ValidateExists.css(pageContent);
        ActionScrollToElement.xpath(customiseBtn);
        ValidateExists.xpath(customiseBtn);
        ValidateExists.xpath(iAgreeBtn);
    }

}
