package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase_2HW1 {
    public static void main(String[] args) {
      /*  Go to Ebay
        search Selenium
        click on search button
        verify title contains Selenium*/

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");

        WebElement searchBox= driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchBox.click();
        searchBox.sendKeys("Selenium");

        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        String title= driver.getTitle();
      //  String expected="Selenium";

        if(title.contains("Selenium")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.quit();
    }



}
