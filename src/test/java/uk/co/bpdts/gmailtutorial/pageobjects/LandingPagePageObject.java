package uk.co.bpdts.gmailtutorial.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPagePageObject {
   private WebDriver driver;

    public LandingPagePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public SignUpPagePageObject openCreateAccountPage() {
        driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__create-account']")).click();
        return new SignUpPagePageObject(driver);
    }

}