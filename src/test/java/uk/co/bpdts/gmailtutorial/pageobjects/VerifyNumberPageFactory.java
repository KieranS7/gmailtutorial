package uk.co.bpdts.gmailtutorial.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyNumberPageFactory {


    WebDriver driver;

    public VerifyNumberPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='phoneNumberId']")
    WebElement phoneNumber;


    public WebElement phoneNumber() {
        phoneNumber.click();
        return null;
    }
}

