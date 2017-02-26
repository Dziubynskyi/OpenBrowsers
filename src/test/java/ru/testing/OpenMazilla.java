package ru.testing;

import org.junit.After;
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


public class OpenMazilla {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public  void StartFireFoxNightlyLast(){
        DesiredCapabilities caps = new DesiredCapabilities();
        FirefoxBinary bin = new FirefoxBinary(new File("C:\\Program Files\\Nightly\\firefox.exe"));// указываем путь на браузер
        driver = new FirefoxDriver(bin, new FirefoxProfile());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,10);
    }
    @Test
    public void OpenMazila(){
        driver.get("https://www.facebook.com/");
        driver.quit();
    }
    @After
    public void stop(){
        driver.quit();
        driver=null;
    }

}
