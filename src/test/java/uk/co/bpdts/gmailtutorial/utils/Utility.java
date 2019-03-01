package uk.co.bpdts.gmailtutorial.utils;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class Utility
{

    public static void navigateToNewTab(WebDriver driver) throws Exception
    {
        String parent=driver.getWindowHandle();
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> I1= s1.iterator();
        while(I1.hasNext())
        {
            String child_window=I1.next();
            if(!parent.equals(child_window))
            {
                Thread.sleep(500);
                driver.switchTo().window(child_window);
                System.out.println("Switched to new tab...");

            }
        }
    }



}
