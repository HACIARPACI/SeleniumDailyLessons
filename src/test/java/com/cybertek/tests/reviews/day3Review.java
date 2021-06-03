package com.cybertek.tests.reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day3Review {
    public static void main(String[] args) {
  /*
    Verify confirmation message
        open chrome browser
        go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        enter any email
        verify that email is displayed in the input box
        click on Retrieve password
        verify that confirmation message says 'Your e-mail's been sent!'
     */
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement mailInputBox = driver.findElement(By.name("email"));
        mailInputBox.sendKeys("haci@yahoo.com");
        String expectedMessage="haci@yahoo.com";

        String value = mailInputBox.getAttribute("value");

        if(expectedMessage.equals(value)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        WebElement retrievePasswordButton= driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

    String expectedmsg="Your e-mail's been sent!";
    WebElement currentmsg= driver.findElement(By.name("confirmation_message"));
    String text = currentmsg.getText();

    if(expectedmsg.equals(text)){
        System.out.println("pass");
    }else{
        System.out.println("fail");
        System.out.println(text);
        System.out.println(expectedmsg);
    }


    }
}
