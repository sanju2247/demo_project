package org.example.Excel;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import  org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginFromExcel {
    WebDriver driver;
    @BeforeClass
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @Test(dataProvider = "LoginData")
    public void loginTest(String user,String pwd,String exp)
    {
        System.out.println(user+pwd+exp);
    }

    @DataProvider(name="LoginData")
    public String [][] getData()
    {
        String loginData[][] = {
                {"admin@yourstore.com","admin","Valid"},
                {"admin@yourstore.com","aadim","Invalid"},
                {"adim@yourstore.com","admin","Invalid"},
                {"adami@yourstore.com","dmim","Invalid"},
        };
        return loginData;
    }
    @AfterClass
    void tearDown()
    {
        driver.close();
    }
}
