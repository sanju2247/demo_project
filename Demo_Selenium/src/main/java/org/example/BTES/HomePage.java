package org.example.BTES;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class HomePage
{
    WebDriver driver= DriverManager.getDriver();

    By SDET = By.cssSelector("div [id=\"course-info-container-10-3\"] a[href='https://online.btes.co.in/course/view.php?id=10']");

    public CoursesPage clickOnCourse(String courseName){
        By coursesBy=By.cssSelector("label[name='"+courseName+"']");
        driver.findElement(coursesBy).click();
        return new CoursesPage();
    }


}