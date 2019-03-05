package uk.co.bpdts.gmailtutorial.pageobjects;

import org.openqa.selenium.WebDriver;

public class LandingPagePageObject {
   private WebDriver driver;

    public LandingPagePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPagePageObject signUp() {
        return new SignUpPagePageObject(driver);

    }

}