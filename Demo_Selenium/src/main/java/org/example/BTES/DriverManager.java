package org.example.BTES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class DriverManager
{
    public static WebDriver driver=null;
    public static WebDriver getDriver()
    {
        if(driver ==null)
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("disable-infobars");
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

            HashMap<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);

            options.setExperimentalOption("prefs", prefs);

            driver=new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        return driver;
    }
}