package uk.co.bpdts.gmailtutorial.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPagePageObject {

    WebDriver driver;

    public SignUpPagePageObject(WebDriver driver) {
        this.driver = driver;
    }

    By firstNameField = By.id("firstName");
    By surnameField = By.id("lastName");
    By usernameField = By.id("username");
    By passwordField = By.name("Passwd");
    By passwordConfirmationField = By.name("ConfirmPasswd");
    By nextButton = By.xpath("//*[@id=\"accountDetailsNext\"]/content/span");


    public SignUpPagePageObject firstName(String targetFirstname) {
        driver.findElement(firstNameField).sendKeys(targetFirstname);
        return this;
    }

    public SignUpPagePageObject surname(String targetSurname) {
        driver.findElement(surnameField).sendKeys(targetSurname);
        return this;
    }

    public SignUpPagePageObject enterUsername(String targetUsername) {
        driver.findElement(usernameField).sendKeys(targetUsername);
        return this;
    }

    public SignUpPagePageObject password(String targetPassword) {
        driver.findElement(passwordField).sendKeys(targetPassword);
        return this;
    }

    public SignUpPagePageObject confirm(String targetConfirm) {
        driver.findElement(passwordConfirmationField).sendKeys(targetConfirm);
        return this;
    }

    public void nextbutton() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(nextButton)).click();

        // TODO: This should return the new page that we will end up on
    }

}
