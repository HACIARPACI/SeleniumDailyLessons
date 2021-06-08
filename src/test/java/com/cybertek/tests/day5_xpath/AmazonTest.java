package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    /**
     * TASK
     * go to amazon.com
     * search for selenium
     * click search button
     * verify 1-48 of 304 results for "Java"
     *
     */
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
      WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.click();
        searchBox.sendKeys("Java");

        driver.findElement(By.xpath("//input[@value='Go']")).click();

        WebElement resultJava= driver.findElement(By.xpath("//span[contains(text(),'ts for')]"));
        String actualResult= resultJava.getText();

        String expectedResult="1-48 of 304 results for";

        if(expectedResult.equals(actualResult)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expected:"+expectedResult);
            System.out.println("actual"+actualResult);

        }
    driver.quit();

    }



}
