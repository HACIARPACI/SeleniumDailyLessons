package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class walmart {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");

    }
    @Test
    public void test1(){
        driver.get("https://www.bedbathandbeyond.com/");
        driver.manage().window().maximize();
        //find search tab
        driver.findElement(By.xpath("(//input[@id='searchInput'])[1]")).click();


        
    }

}
