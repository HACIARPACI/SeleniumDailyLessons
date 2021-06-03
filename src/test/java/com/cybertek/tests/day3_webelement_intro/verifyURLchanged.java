package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLchanged {
    public static void main(String[] args) {
        /* Verify URL changed
        open chrome browser
        go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        enter any email
        click on Retrieve password
        verify that url changed to http://practice.cybertekschool.com/email_sent
    */
        //open chrome browser,go to
        WebDriver driver = WebDriverFactory.getDriver("chROme");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email and send keys
        WebElement emailInputBox= driver.findElement(By.name("email"));
        emailInputBox.sendKeys("mike@smith.com");

        //click retrievePasswordButton
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        // create expected
        String expectedUrl="http://practice.cybertekschool.com/email_senthaci";
        //saving actual url after enter email end and click on retrievePasswordButton
        String actualUrl= driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedUrl ="+ expectedUrl);
            System.out.println("actualUrl ="+actualUrl);

        }
        driver.quit();



    }
}
