package com.letsgetchecked.testcase;

import com.letsgetchecked.pom.MapsNavPanelComponent;

public class SearchLocation {

    public static void execute(String location) {
        MapsNavPanelComponent.search(location);
        MapsNavPanelComponent.validateResultHeadline(location);
    }

}
