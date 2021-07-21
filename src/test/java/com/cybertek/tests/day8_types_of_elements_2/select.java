package com.cybertek.tests.day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class select {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://getbootstrap.com/docs/4.3/components/dropdowns/");
        driver.findElement(By.xpath("//button[@class='btn btn-success dropdown-toggle']")).click();
        List<WebElement> Success = driver.findElements(By.xpath("//div[@class='dropdown-menu show']/a"));
        for (WebElement suc : Success) {
            System.out.println(suc.getText());
        }
      //  Success.get(0).click();


    }




    }
