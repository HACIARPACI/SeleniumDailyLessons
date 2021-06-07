package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase_1HW1 {
    public static void main(String[] args) {
   /*Go to Ebay
   https://www.ebay.com/
enter search term
click on search button
print number of results*/
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com/");

        WebElement searchBox= driver.findElement(By.xpath("//input[@id='gh-ac']"));
        searchBox.click();
        searchBox.sendKeys("search");

        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

       String result= driver.findElement(By.xpath("//h1/span[1]")).getText();
        System.out.println(result);


    }


}
