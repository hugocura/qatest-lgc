package com.letsgetchecked.testcase;

import com.letsgetchecked.pom.MapsNavPanelComponent;

public class Navigate {

    public static void execute(String location) {
        MapsNavPanelComponent.tapNavigate();
        MapsNavPanelComponent.validateNavigationDestiny(location);
    }

}
