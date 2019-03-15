package uk.co.bpdts.gmailtutorial.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class SignUpPagePageObject {

    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public SignUpPagePageObject(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        switchToTab();
    }

    private void switchToTab() throws InterruptedException {
        String parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> windowsIterator = allWindows.iterator();
        while(windowsIterator.hasNext()) {
            String childWindow = windowsIterator.next();
            if(!parent.equals(childWindow)) {
                Thread.sleep(5000);
                driver.switchTo().window(childWindow);
//                System.out.println(driver.getTitle());
            }
        }
    }

    private WebElement waitForElement(By element) {
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    By firstNameField = By.id("firstName");
    By surnameField = By.id("lastName");
    By usernameField = By.id("username");
    By passwordField = By.name("Passwd");
    By passwordConfirmationField = By.name("ConfirmPasswd");
    By nextButton = By.id("accountDetailsNext");

    public SignUpPagePageObject firstName(String targetFirstname) {
        waitForElement(firstNameField).sendKeys(targetFirstname);
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

    public VerifyNumberPageFactory nextButton() {
        waitForElement(nextButton).click();
        return new VerifyNumberPageFactory(driver);
    }

}
