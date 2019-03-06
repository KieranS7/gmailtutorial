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
import uk.co.bpdts.gmailtutorial.pageobjects.VerifyNumberPageFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.ArrayList;

public class SignUpPageTest {
    private WebDriver driver;

    @Before
    public void windowmanagement() {
        System.setProperty("webdriver.chrome.driver", "/Users/kieran.slater/IdeaProjects/gmailtutorial/src/test/resources/chromedriver");
        // Kieran, this is the line that is broken - we're only declearing WebDriver internally to this method
        // WebDriver driver = new ChromeDriver();
        // If we change that line ^^ to this line next line, everything starts working!
        this.driver = new ChromeDriver();
        driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
        //driver.manage().window().maximize();
    }

    @Test
    public void SignUp() {
        LandingPagePageObject land = new LandingPagePageObject(driver);
        SignUpPagePageObject signUpPagePageObject = land.signUp();

        signUpPagePageObject
            .firstName("John")
            .surname("Smith")
            .enterUsername("jsmithselenium")
            .password("Newpassword_123")
            .confirm("Newpassword_123");

        /*VerifyNumberPageFactory number = new signUpPagePageObject.nextbutton();
        VerifyNumberPageFactory */

    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
