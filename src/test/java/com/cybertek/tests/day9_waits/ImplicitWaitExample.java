package com.cybertek.tests.day9_waits;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        //her find element için bu süreye kadar bulmasını bekler
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
 /*  @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }*/
@Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

  //  Thread.sleep(5000);
    // bu saniyeye kadar bekle ama gelince çık yani maksimum bu kadar bekle diyor.

  //  WebDriverWait wait = new WebDriverWait(driver,10);
    WebElement element= driver.findElement(By.cssSelector("#finish"));
   // wait.until(ExpectedConditions.invisibilityOf(element));

    System.out.println(element.getText());
}

}
