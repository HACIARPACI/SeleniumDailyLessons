package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElements {
    @Test
    public void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenRadioBtn = driver.findElement(By.cssSelector("#green"));

        //how to chech any webelementt enabled or not
        System.out.println("greenRadioBtn.isEnabled() = " + greenRadioBtn.isEnabled());
        //verify greenRadioBtn is not enable to click
        Assert.assertFalse(greenRadioBtn.isEnabled(),"verify green radio button is NOT enabled");

        greenRadioBtn.click();
    }


    @Test
    public void test2(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox= driver.findElement(By.cssSelector("#input-example>input"));
        inputBox.sendKeys("some message");
    //    inputBox.click();

    }

}
