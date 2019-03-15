package uk.co.bpdts.gmailtutorial.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyNumberPageFactory {


    WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//input[@id='phoneNumberId']")
    WebElement phoneNumberField;
    @FindBy(xpath = "//*[@id=\"gradsIdvPhoneNext\"]/content/span")
    WebElement next;

    public VerifyNumberPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,10);
    }



    public void enterPhoneNumber(String phoneNumber) {
        wait.until(ExpectedConditions.visibilityOf(phoneNumberField)).sendKeys(phoneNumber);
        wait.until(ExpectedConditions.visibilityOf(next)).click();
    }
}

