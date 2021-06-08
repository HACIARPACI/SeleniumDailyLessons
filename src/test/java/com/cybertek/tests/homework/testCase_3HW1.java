package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testCase_3HW1 {
    public static void main(String[] args) {
      /*  Go to wikipedia.org (Links to an external site.)
        enter search term `selenium webdriver`
        click on search button
        click on search result `Selenium (software)`
        verify url ends with `Selenium_(software)' */

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.wikipedia.org/");

        WebElement searchBox= driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchBox.click();
        searchBox.sendKeys("Selenium webdriver");

       driver.findElement(By.xpath("//i[@data-jsl10n='search-input-button']")).click();
       driver.findElement(By.xpath("//li[@class='mw-search-result'][1]/div/a")).click();
       String url= driver.getCurrentUrl();
       /// String currentUrl= driver.getCurrentUrl();
        String expected="Selenium_(software)";
        if(url.endsWith(expected)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
        driver.quit();






    }
}
