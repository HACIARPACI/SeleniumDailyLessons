package com.cybertek.tests.reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class checkBox {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/dynamic-properties");
        WebElement willEnable5Seconds = driver.findElement(By.cssSelector("#enableAfter"));
        WebDriverWait wait = new WebDriverWait(driver,6);
        wait.until(ExpectedConditions.elementToBeClickable(willEnable5Seconds));
        willEnable5Seconds.click();

       WebElement colorChanged = driver.findElement(By.cssSelector("#colorChange"));
        String className=colorChanged.getAttribute("class");
      //  WebDriverWait wait1= new WebDriverWait(driver,6);
        wait.until(ExpectedConditions.attributeToBe(colorChanged, "class", "mt-4 text-danger btn btn-primary"));
        className=colorChanged.getAttribute("class");
        System.out.println(className);

        WebDriverWait wait1= new WebDriverWait(driver,6);
        wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#visibleAfter")));
        driver.findElement(By.cssSelector("#visibleAfter")).click();










    }
    }

