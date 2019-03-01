package uk.co.bpdts.gmailtutorial.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPagePageObject {

    WebDriver driver;

    public SignUpPagePageObject(WebDriver driver)
    {
        this.driver = driver;
    }

    By firstname = By.id("firstName");
    By surname = By.id("lastName");
    By username = By.id("username");
    By password = By.name("Passwd");
    By confirm = By.name("ConfirmPasswd");
    By nextbutton = By.xpath("//*[@id=\"accountDetailsNext\"]/content/span");


    public void firstName(String targetFirstname)
    {
        driver.findElement(firstname).sendKeys(targetFirstname);
    }

    public void surname(String targetSurname)
    {
        driver.findElement(surname).sendKeys(targetSurname);
    }

    public void enterUsername(String targetUsername)
    {
        driver.findElement(username).sendKeys(targetUsername);
    }

    public SignUpPagePageObject password(String targetPassword) {driver.findElement(password).sendKeys(targetPassword);
        return this;
    }

    public void confirm(String targetConfirm)
    {
        driver.findElement(confirm).sendKeys(targetConfirm);
    }

    /*public SignUpPagePageObject nextButton(String nextButton) {driver.findElement(By.xpath(nextbutton)).click();
        return this;*/


    public SignUpPagePageObject nextbutton() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(nextbutton)).click();
        return null;
    }

}
