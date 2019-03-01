package uk.co.bpdts.gmailtutorial;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import uk.co.bpdts.gmailtutorial.pageobjects.LandingPagePageObject;
import uk.co.bpdts.gmailtutorial.pageobjects.SignUpPagePageObject;
import uk.co.bpdts.gmailtutorial.utils.Utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.ArrayList;

public class SignUpPageTest
{
    public WebDriver driver;

    @Before
    public void windowmanagement()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();

        System.out.println("Created Driver ");

        driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
        //driver.manage().window().maximize();

        System.out.println("Navigated to Gmail");
    }

    @Test
    public void SignUp() throws Exception
    {

        System.out.println("On Page "+driver.getTitle());

        LandingPagePageObject land = new LandingPagePageObject(driver);
        land.createAccount();

        Utility.navigateToNewTab(driver);

        System.out.println("On Page "+driver.getTitle());

        SignUpPagePageObject signup = new SignUpPagePageObject(driver);
        signup.firstName("John");
        signup.surname("Smith");
        signup.enterUsername("jsmithselenium");
        signup.password("Newpassword_123");
        signup.confirm("Newpassword_123");

        System.out.println("Filled the Signup form ");



    }

    @After
    public void tearDown()
    {
        driver.quit();
    }

}
