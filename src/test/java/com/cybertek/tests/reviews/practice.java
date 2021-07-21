package com.cybertek.tests.reviews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class practice {
    WebDriver driver;

    @BeforeMethod
    public void Setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://datatables.net/examples/data_sources/dom");
    }

    @Test
    public void test1() throws InterruptedException {
        int ages = driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();
        //table[@id='example']/tbody/tr[1]/td[4]
        int[] list = new int[ages];
     //   int i=0;
        for (int i = 1; i <= ages; i++) {
            WebElement age = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[4]"));
            System.out.println(age.getText());

            //    Integer.parseInt(age.getText());

            list[i] = Integer.parseInt(age.getText());
            //Integer.parseInt(age.getText());
            System.out.println(list[i]);

            }
        for (int i = 1; i <=ages ; i++) {
            if (list[i] > 60) {
                System.out.println(driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[1]")).getText());

            }
        }


        }
    }
/* /*tep 1. Go to “https://datatables.net/examples/data_sources/dom"
        Step 2.  Get name and age of personnel over 60 years old  and print to console
        Step 3. Verify that personnel over 60 years old less than 3

        (hint: use Map Interface)


        console:
        Ashton Cox:66
        Brielle Williamson:61 */