package uk.co.bpdts.gmailtutorial;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import uk.co.bpdts.gmailtutorial.pageobjects.SignUpPagePageObject;

import java.net.URL;
import java.sql.Driver;

public class SignUpPageTest {

    //@Before


    @Test
    public void SignUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/kieran.slater/IdeaProjects/gmailtutorial/src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
        SignUpPagePageObject signup=new SignUpPagePageObject(driver);
        signup.Firstname().sendKeys("John");
        signup.Surname().sendKeys("Smith");
        signup.Username().sendKeys("jsmithselenium");
        signup.Password().sendKeys("Newpassword_123");
        signup.Confirm().sendKeys("Newpassword_123");
        signup.Nextbutton().click();


    }


}
