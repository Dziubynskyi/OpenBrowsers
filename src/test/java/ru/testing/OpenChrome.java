package ru.testing;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Comp on 2/25/2017.
 */
public class OpenChrome {
    private WebDriver driver;


    @BeforeMethod
  public void Start(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("unexpectedAlertBehaviour", "dismiss");
        driver=new ChromeDriver(caps);
        System.out.println(((HasCapabilities) driver).getCapabilities());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,10);
    }
    @Test
    public void OpenGoogleChrome(){
        driver.get("https://www.facebook.com/");
        driver.quit();
    }
    @After
    public void stop(){
        driver.quit();
        driver=null;
    }

}