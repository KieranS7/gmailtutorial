package uk.co.bpdts.gmailtutorial.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPagePageObject {
    private WebDriver driver;

    public LandingPagePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPagePageObject signUp() {
        driver.findElement(By.xpath("//a[contains(text(),'Create an account')]")).click();
        return new SignUpPagePageObject(driver);

    }

}