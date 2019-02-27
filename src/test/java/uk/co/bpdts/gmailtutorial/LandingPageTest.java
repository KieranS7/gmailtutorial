package uk.co.bpdts.gmailtutorial;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.co.bpdts.gmailtutorial.pageobjects.LandingPagePageObject;

public class LandingPageTest {


    @Test
    public void Land() {
        System.setProperty("webdriver.chrome.driver", "/Users/kieran.slater/IdeaProjects/gmailtutorial/src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();

        LandingPagePageObject land=new LandingPagePageObject(driver);
        land.Createaccount().click();


    }
}