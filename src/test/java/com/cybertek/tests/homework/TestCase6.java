package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase6 {
    WebDriver driver= WebDriverFactory.getDriver("chrome");

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.tempmailaddress.com/");
        String mail="arsalan.agasthya@zoofood.org";
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[.='Sign Up For Mailing List']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("full_name")).sendKeys("HacıArpacı");
        driver.findElement(By.name("email")).sendKeys(mail);

        driver.findElement(By.name("wooden_spoon")).click();
    }
    @Test
    public void test7() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[.='File Upload']")).click();

      WebElement file=  driver.findElement(By.name("file"));
      file.sendKeys("C:/Users/pc/Desktop/file.txt");
        Thread.sleep(2000);
        driver.findElement(By.id("file-submit")).click();
      WebElement fileName= driver.findElement(By.id("uploaded-files"));
        Assert.assertTrue(fileName.isDisplayed());

    }
    @Test
    public void test9_12() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[.='Status Codes']")).click();

        for (int i = 2; i <= 5; i++) {
            String xpath="(//li/a)["+i+"]";
            driver.findElement(By.xpath(xpath)).click();
            Thread.sleep(2000);
            WebElement message= driver.findElement(By.xpath("//div/p"));
            String first= message.getText();
            first= first.substring(0,first.indexOf("."));
            System.out.println(first);
            Assert.assertTrue(message.isDisplayed());
                driver.navigate().back();



        }


    }
}
