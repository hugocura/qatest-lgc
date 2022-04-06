package com.letsgetchecked.pom;

import com.letsgetchecked.actions.ActionClick;
import com.letsgetchecked.actions.ActionEnterText;
import com.letsgetchecked.validates.ValidateContainsText;
import com.letsgetchecked.validates.ValidateTextExists;

public class MapsNavPanelComponent {

    // Locators
    private final static String searchBox = "searchboxinput";
    private final static String searchResultHeadline = ".x3AX1-LfntMc-header-title-title > span:nth-child(1)";
    private final static String directionsBtn = ".pChizd .EgL07d";
    private final static String directionsSearchBox = "#sb_ifc52 > .tactile-searchbox-input";

    public static void search(String location) {
        ActionEnterText.execute(searchBox, location, true);
    }

    public static void tapNavigate() {
        ActionClick.css(directionsBtn);
    }

    public static void validateResultHeadline(String expectedText) {
        ValidateTextExists.execute(searchResultHeadline, expectedText);
    }

    public static void validateNavigationDestiny(String expectedText) {
        ValidateContainsText.execute(directionsSearchBox, expectedText);
    }

}
