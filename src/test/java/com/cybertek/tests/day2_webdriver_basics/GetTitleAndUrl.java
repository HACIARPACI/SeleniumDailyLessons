package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAndUrl {
    public static void main(String[] args) {
        // open chrome an navigate http:// practice.cybertekschool.com
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com");
// getting title with selenium
// short cut creating variable Alt+ enter
        String title = driver.getTitle();
//soutv short cut to print
        System.out.println("title = " + title);
//get current url        
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
// get source code but it s too much codes
        String pageSource = driver.getPageSource();
        System.out.println("pageSource = " + pageSource);








    }
}
