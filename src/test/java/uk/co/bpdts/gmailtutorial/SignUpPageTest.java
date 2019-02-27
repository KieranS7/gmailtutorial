package uk.co.bpdts.gmailtutorial;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import uk.co.bpdts.gmailtutorial.pageobjects.LandingPagePageObject;
import uk.co.bpdts.gmailtutorial.pageobjects.SignUpPagePageObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.ArrayList;

public class SignUpPageTest {
private WebDriver driver;

    @Before
    public void windowmanagement() throws MalformedURLException{
        System.setProperty("webdriver.chrome.driver", "/Users/kieran.slater/IdeaProjects/gmailtutorial/src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
        //driver.manage().window().maximize();
    }

    @Test
    public void SignUp() {

        LandingPagePageObject land = new LandingPagePageObject(driver);
        land.Createaccount().click();


        SignUpPagePageObject signup = new SignUpPagePageObject(driver);
        signup.Firstname().sendKeys("John");
        signup.Surname().sendKeys("Smith");
        signup.Username().sendKeys("jsmithselenium");
        signup.Password().sendKeys("Newpassword_123");
        signup.Confirm().sendKeys("Newpassword_123");
        signup.Nextbutton().click();


    }
/*@After

    public void tearDown() {driver.quit;}*/

}
