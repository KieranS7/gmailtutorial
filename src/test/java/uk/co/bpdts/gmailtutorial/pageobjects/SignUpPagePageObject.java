package uk.co.bpdts.gmailtutorial.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPagePageObject {

    WebDriver driver;

    public SignUpPagePageObject(WebDriver driver) {
        this.driver = driver;
    }

    By firstname = By.id("firstName");
    By surname = By.id("lastName");
    By username = By.id("username");
    By password = By.name("Passwd");
    By confirm = By.name("ConfirmPasswd");
    By nextbutton = By.xpath("//*[@id=\"accountDetailsNext\"]/content/span");


    public SignUpPagePageObject firstName(String firstname) {driver.findElement(By.id(firstname)).sendKeys(firstname);
    return this;
    }

    public SignUpPagePageObject surname(String surname) {driver.findElement(By.id(surname)).sendKeys(surname);
        return this;
    }

    public SignUpPagePageObject enterUsername(String username) {driver.findElement(By.id(username)).sendKeys(username);
    return this;
    }

    public SignUpPagePageObject password(String password) {driver.findElement(By.name(password)).sendKeys(password);
        return this;
    }

    public SignUpPagePageObject confirm(String confirm) {driver.findElement(By.name(confirm)).sendKeys(confirm);
        return this;
    }

    /*public SignUpPagePageObject nextButton(String nextButton) {driver.findElement(By.xpath(nextbutton)).click();
        return this;*/


    public SignUpPagePageObject nextbutton() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(nextbutton)).click();
        return null;
    }

}
