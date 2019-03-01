package uk.co.bpdts.gmailtutorial.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPagePageObject
{
    WebDriver driver;

    public LandingPagePageObject(WebDriver driver)
    {
        this.driver = driver;
    }

    public void createAccount()
    {
        driver.findElement(By.xpath("//a[contains(text(),'Create an account')]")).click();

    }



    public SignUpPagePageObject signUp() {
        return new SignUpPagePageObject(driver);

    }

}