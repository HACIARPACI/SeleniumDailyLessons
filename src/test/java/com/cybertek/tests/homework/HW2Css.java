package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HW2Css {
    public static void main(String[] args) {
         /*XPATH PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_passwordHarici bir siteye bağlantılar.
3. Locate all the WebElements on the page using XPATH locator only (total of 6)
   a. “Home” link
   b. “Forgot password” header
   c. “E-mail” text
   d. E-mail input box
   e. “Retrieve password” button
4.Print text of a,b,c,e and put some email to d */
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement homeButton= driver.findElement(By.cssSelector(".nav-link"));
        WebElement forgotPasswordButton= driver.findElement(By.cssSelector(".example>h2"));
        WebElement emailTextButton= driver.findElement(By.cssSelector("label[for='email']"));
        WebElement emailBox= driver.findElement(By.cssSelector("input[name='email']"));
        WebElement retrievePasswordButton= driver.findElement(By.cssSelector("i[class^='icon-2x']"));
        System.out.println(homeButton.getText());
        System.out.println(forgotPasswordButton.getText());
        System.out.println(emailTextButton.getText());
        emailBox.sendKeys("mike@smith.com");
        System.out.println(retrievePasswordButton.getText());

        driver.quit();






    }



}
