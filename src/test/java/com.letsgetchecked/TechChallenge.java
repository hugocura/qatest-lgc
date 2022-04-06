package com.letsgetchecked;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.letsgetchecked.testcase.Navigate;
import com.letsgetchecked.testcase.OpenGoogleSite;
import com.letsgetchecked.testcase.SearchLocation;

public class TechChallenge {

    // Global parameters
    public static WebDriver driver;
    public static int waitTimeout = 15;

    // Private parameters
    private final static String URL = "https://www.google.com/maps";
    private final static String searchText = "Dublin";
    private final static Dimension windowSize = new Dimension(1350, 800);

    @BeforeAll
    static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setSize(windowSize);
    }

    @DisplayName("Open Google Maps")
    @Test
    public void openGoogleMaps() {
        OpenGoogleSite.execute(URL, true);
        SearchLocation.execute(searchText);
        Navigate.execute(searchText);
    }
}
