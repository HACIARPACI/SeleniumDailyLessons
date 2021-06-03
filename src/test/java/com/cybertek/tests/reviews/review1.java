package com.cybertek.tests.reviews;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class review1 {
    public static void main(String[] args) throws InterruptedException {
      WebDriverManager.chromedriver().setup();
      WebDriver driver= new ChromeDriver();
    /*  driver.get("https://www.facebook.com");
      Thread.sleep(3000);
      driver.navigate().to("https://www.google.com");
      Thread.sleep(3000);
      driver.navigate().back();
      Thread.sleep(3000);
      driver.navigate().forward();
      driver.navigate().refresh();
      String title = driver.getTitle();
      System.out.println("title = " + title);
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
      String pageSource = driver.getPageSource();
      System.out.println("pageSource = " + pageSource);   */
        driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/open_new_tab");
      WebDriverManager.firefoxdriver().setup();
      WebDriver driver1 =new FirefoxDriver();
      driver1.get("https://www.facebook.com/open_new_tab");
        WebDriverManager.edgedriver().setup();
        WebDriver driver2= new EdgeDriver();
        driver2.get("https://www.facebook.com");


    }





}
