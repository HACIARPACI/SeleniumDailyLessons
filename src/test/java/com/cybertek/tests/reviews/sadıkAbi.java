package com.cybertek.tests.reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class sadıkAbi {
    @Test
    public void Test() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement inputBox = driver.findElement(By.cssSelector("input[type='text']"));
        boolean enabled = inputBox.isEnabled();
        System.out.println("inputBox is enable = " + enabled);
        Assert.assertFalse(enabled, "verify inputBox is not enabled");

        WebElement enableButton= driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        System.out.println("enableButton.getAttribute(\"innerHTML\") = " + enableButton.getAttribute("innerHTML"));
        enableButton.click();
        Thread.sleep(2000);
        WebElement disableButton= driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        Thread.sleep(5000);
        System.out.println("disableButton.getAttribute(\"innerHTML\") = " + disableButton.getAttribute("innerHTML"));

    }

}
