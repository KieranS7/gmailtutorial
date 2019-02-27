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



    public WebElement Firstname() {
        return driver.findElement(firstname);
    }

    public WebElement Surname() {
        return driver.findElement(surname);
    }

    public WebElement Username() {
        return driver.findElement(username);
    }

    public WebElement Password() {
        return driver.findElement(password);
    }

    public WebElement Confirm() {
        return driver.findElement(confirm);
    }

    public WebElement Nextbutton() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(nextbutton));
        return driver.findElement(nextbutton);
    }

}
