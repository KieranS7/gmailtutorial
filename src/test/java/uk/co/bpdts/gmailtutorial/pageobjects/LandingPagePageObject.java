package uk.co.bpdts.gmailtutorial.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPagePageObject {
    WebDriver driver;

    public LandingPagePageObject(WebDriver driver) {
        this.driver = driver;
    }

    By createanaccount = By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__create-account']");

    public WebElement Createaccount() {
        return driver.findElement(createanaccount);

    }
}