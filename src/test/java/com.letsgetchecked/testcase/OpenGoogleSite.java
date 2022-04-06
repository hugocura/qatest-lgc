package com.letsgetchecked.testcase;

import com.letsgetchecked.pom.GoogleConsentPage;

import static com.letsgetchecked.TechChallenge.driver;

public class OpenGoogleSite {

    public static void execute(String URL, boolean consent) {
        driver.navigate().to(URL);

        if (GoogleConsentPage.isPresent()) {
            GoogleConsentPage.validate();

            if (consent) {
                GoogleConsentPage.tapIAgree();
            }
        }
    }

}
