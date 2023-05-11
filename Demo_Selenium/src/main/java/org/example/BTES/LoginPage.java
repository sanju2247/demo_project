package org.example.BTES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage
{
    By userName = By.cssSelector("div.form-group input[id='username']");
    By password = By.cssSelector("div.form-group input[id='password']");
    By rememberMe= By.cssSelector("div input[id='rememberusername']");
    By login = By.cssSelector("button[id='loginbtn']");

    WebDriver driver=DriverManager.getDriver();

    public LoginPage openUrl(String url)
    {
        driver.get(url);
        return this;
    }

    public LoginPage enterUser(String username)
    {
        driver.findElement(userName).sendKeys("Sanjeev");
        return this;
    }

    public LoginPage enterPassword(String username)
    {
        driver.findElement(password).sendKeys("Sanjeev@123");
        return this;
    }

    public LoginPage selectRememberMe()
    {
        driver.findElement(rememberMe).click();
        return this;
    }

    public HomePage clickLoginButton()
    {
        driver.findElement(login).click();
        return new HomePage();
    }
}