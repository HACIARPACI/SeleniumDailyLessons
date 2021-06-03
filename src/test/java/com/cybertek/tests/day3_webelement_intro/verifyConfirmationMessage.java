package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {
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

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailBox = driver.findElement(By.name("email"));

        String expectedEmail= "mike@smith.com";

        emailBox.sendKeys(expectedEmail);

        //somehow we should get text from web elements
        //two main ways to get txt from web elements
        //1.getText()--> it will work %99 and it will return string  text mesajını almak için
        //2.getAttribute("value") --> second way of getting text especially input boxes kutucuktaki değeri almak için

        String actualEmail = emailBox.getAttribute("value");
        System.out.println("actualemail= "+actualEmail);

        //verify that email is displayed in the input box
    if(expectedEmail.equals(actualEmail)){
        System.out.println("pass");
    }else{
        System.out.println("fail");
    }
        //click on retrieve password
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

    // verify that confirmation message says 'Your e-mail's been sent!'

        WebElement actualConfirmationMessage = driver.findElement(By.name("confirmation_message"));
        System.out.println(actualConfirmationMessage.getText());
        //save expected message
        String expectedMessage="Your e-mail's been sent!";

        //save actual message
        String actualMessage= actualConfirmationMessage.getText();

        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("fail");
            System.out.println("expeccted message="+ expectedMessage);
            System.out.println("actual message"+actualMessage);
        }
        driver.quit();

    } 
}