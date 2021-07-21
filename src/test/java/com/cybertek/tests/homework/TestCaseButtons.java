package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestCaseButtons {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement chechBox =driver.findElement(By.xpath("//div[text()='Success - Check box is checked']"));
        Assert.assertFalse(chechBox.isDisplayed());
        driver.findElement(By.cssSelector("input#isAgeSelected")).click();
        Assert.assertEquals(chechBox.getText(),"Success - Check box is checked","verified");
    }
    @Test
      public  void test2(){
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement checkAllButton= driver.findElement(By.cssSelector("#check1"));
        Assert.assertEquals(checkAllButton.getAttribute("Value"),"Check All","verify CheckAll button ");
        checkAllButton.click();
        List<WebElement> checks = driver.findElements(By.className("cb1-element"));
        for (WebElement check : checks) {
            Assert.assertTrue(check.isSelected());
        }
            Assert.assertEquals(checkAllButton.getAttribute("Value"),"Uncheck All","verified uncheckAll");
    }




}
