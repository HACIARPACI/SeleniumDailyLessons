package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
      //  driver.quit();
    }

    /**
     * hover over each image in the website
     * verify each name:user text is displayed
     */

    @Test
    public void oneImage() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");

        WebElement img1=driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(img1).perform();

        WebElement text1= driver.findElement(By.xpath("(//h5)[1]"));
        Assert.assertTrue(text1.isDisplayed(),"verify text1 is dislayed");
    }
    @Test
    public void Test2(){
        driver.get("http://practice.cybertekschool.com/hovers");
        for (int i = 1; i <=3 ; i++) {
        String xPathImg="(//img)["+i+"]";
       WebElement img= driver.findElement(By.xpath(xPathImg));

       Actions action= new Actions(driver);
       action.moveToElement(img).perform();

       String textPath= "(//h5)["+i+"]";
       WebElement text= driver.findElement(By.xpath(textPath));

       Assert.assertTrue(text.isDisplayed(),"verify texts are dispşayed");



        }







    }
}