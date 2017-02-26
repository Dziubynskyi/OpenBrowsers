package ru.testing;

import org.junit.After;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Comp on 2/26/2017.
 */
public class OpenMazilaOld45  {
    private WebDriver driver;
    private WebDriverWait wait;



    @BeforeMethod
    public  void StartFireFox45oldSchem(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(FirefoxDriver.MARIONETTE, false);
        WebDriver driver = new FirefoxDriver(caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(((HasCapabilities)driver).getCapabilities());
        wait = new WebDriverWait(driver,10);
    }
    @Test
    public void OpenMazila(){
        driver.navigate().to("https://www.facebook.com/");
        driver.quit();
    }
    @After
    public void stop(){
        driver.quit();
        driver=null;
    }

}