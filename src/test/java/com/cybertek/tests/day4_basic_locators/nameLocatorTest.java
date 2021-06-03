package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //make browser fulll screen
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        //task
        //put email ant click on signup button


           //proper way
        //WebElement emailInput = driver.findElement(By.name("email"));
        //emailInput.sendKeys("haciarpa@gmail.com");

        //lazy way
      driver.findElement(By.name("email")).sendKeys("mike@smith.com");

      //  WebElement  signUpButton = driver.findElement(By.name("wooden_spoon")) ;
        //signUpButton.click();

        //lazyway
        driver.findElement(By.name("wooden_spoon")).click();


    }


}
