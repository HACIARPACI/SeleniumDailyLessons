package com.cybertek.tests.reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
    driver.findElement(By.cssSelector("img[alt ='Find your ideal TV")).click();






    }
}
