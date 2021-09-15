package com.cybertek.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenBrowser {
    public static void main(String[] args) {
 /*   //hey webdriver can you make chrome ready for me for automation
        WebDriverManager.chromedriver().setup();
    //we are creating driver for chrome browser
        WebDriver driver= new ChromeDriver();
    //.get(url) method use for naviation to pageq
        driver.get("https://cybertekschool.com");*/

   WebDriverManager.firefoxdriver().setup();

    WebDriver driver= new FirefoxDriver();

    driver.get("https://www.facebook.com");




    }


}
