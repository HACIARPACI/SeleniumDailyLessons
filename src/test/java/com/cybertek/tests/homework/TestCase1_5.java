package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1_5 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
    }
  /*  @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }*/
    @Test
    public void test1(){
        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a[.='Registration Form']")).click();

        driver.findElement(By.name("birthday")).sendKeys("wrong_dob");

        String expected="The date of birth is not valid";

        String actual = driver.findElement(By.xpath("//small[.='The date of birth is not valid']")).getText();

        Assert.assertEquals(expected,actual,"verify texts are same");
    }
        @Test
    public void test2(){
        driver.get("https://practice-cybertekschool.herokuapp.com");

        driver.findElement(By.xpath("//a[.='Registration Form']")).click();

            WebElement Cplus= driver.findElement(By.xpath("//label[.='C++']"));
            WebElement Java= driver.findElement(By.xpath("//label[.='Java']"));
            WebElement JavaScript= driver.findElement(By.xpath("//label[.='JavaScript']"));

            Assert.assertTrue(Cplus.isDisplayed());
            Assert.assertTrue((Java.isDisplayed()));
            Assert.assertTrue(JavaScript.isDisplayed());
        }
        @Test
    public void test3(){
            driver.get("https://practice-cybertekschool.herokuapp.com");

            driver.findElement(By.xpath("//a[.='Registration Form']")).click();

            driver.findElement(By.name("firstname")).sendKeys("a");

            String expected="first name must be more than 2 and less than 64 characters long";
            String actual = driver.findElement(By.xpath("//small[.='first name must be more than " +
                    "2 and less than 64 characters long']")).getText();

            Assert.assertEquals(expected,actual,"verify texts are same");


        }
         @Test
    public void test4(){
             driver.get("https://practice-cybertekschool.herokuapp.com");

             driver.findElement(By.xpath("//a[.='Registration Form']")).click();

             driver.findElement(By.name("lastname")).sendKeys("a");

             String expected="The last name must be more than 2 and less than 64 characters long";
             String actual = driver.findElement(By.xpath("//small[.='The last name must be more than 2 and less than 64 characters long']")).getText();

             Assert.assertEquals(expected,actual,"verify texts are same");

         }
         @Test
    public void test5() throws InterruptedException {
             driver.get("https://practice-cybertekschool.herokuapp.com");

             driver.findElement(By.xpath("//a[.='Registration Form']")).click();
             driver.findElement(By.name("firstname")).sendKeys("haci");
             driver.findElement(By.name("lastname")).sendKeys("arpaci");
             driver.findElement(By.name("username")).sendKeys("arpaciHaci11");
             driver.findElement(By.name("email")).sendKeys("haciarpaci@gmail.com");
             driver.findElement(By.name("password")).sendKeys("arpaciHaci123");
             driver.findElement(By.name("phone")).sendKeys("111-222-333333");
             driver.findElement(By.cssSelector("input[value='male']")).click();
             driver.findElement(By.name("birthday")).sendKeys("12/23/1895");

             driver.findElement(By.name("department")).click();
             WebElement Depart  = driver.findElement(By.name("department"));
             Select department = new Select(Depart);
             department.selectByVisibleText("MCR");

             driver.findElement(By.name("job_title")).click();
             WebElement jobTitle= driver.findElement(By.name("job_title"));
             Select job= new Select(jobTitle);
             job.selectByIndex(4);

             driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
             driver.findElement(By.cssSelector("button[type")).click();

             Thread.sleep(3000);

             String actual = driver.findElement(By.xpath("//div/p")).getText();
             String expected="You've successfully completed registration!";

                Assert.assertEquals(expected,actual,"verify messages are same");


         }
     @Test
    public  void test8(){
         driver.get("https://practice-cybertekschool.herokuapp.com");
         driver.findElement(By.xpath("//a[.='Autocomplete']")).click();
         driver.findElement(By.cssSelector("#myCountry")).sendKeys("United States of America");
         driver.findElement(By.cssSelector("input[value='Submit']")).click();
         String actual = driver.findElement(By.cssSelector("p[id")).getText();
         String expected="You selected: United States of America";
         Assert.assertEquals(expected,actual);

     }

}
