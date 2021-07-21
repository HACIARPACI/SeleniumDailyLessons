package com.cybertek.tests.reviews;

import com.cybertek.utilities.WebDriverFactory;
import com.google.gson.internal.LinkedHashTreeMap;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.security.util.Password;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class waits {
    WebDriver driver;

    @BeforeMethod
    public void Setup() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");
    }

    @Test
    public void test1() throws InterruptedException {

        WebElement table = driver.findElement(By.cssSelector("table[id='table2']"));
        System.out.println(table.getText());
        Thread.sleep(1000);

        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table2']//th"));
        for (WebElement header : headers) {
            System.out.println(header.getText());


        }
        Thread.sleep(1000);

        List<WebElement> rowWithoutHeader = driver.findElements(By.xpath("//table[@id='table2']/tbody/tr"));
        for (WebElement element : rowWithoutHeader) {
            System.out.println(element.getText());

        }
        WebElement element = driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[4]/td[3]"));
        System.out.println(element.getText());
        Thread.sleep(1000);

        WebElement cell= driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[4]/td[3]/../td[1]"));
        System.out.println(cell.getText());

        int row= getRow();
        int column =getColumn();
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=column ; j++) {
                WebElement innerCell= driver.findElement(By.xpath("//table[@id='table2']/tbody/tr["+i+"]/td["+j+"]"));
                System.out.println(innerCell.getText());


            }
        }

    }

    private int getColumn() {
        return driver.findElements(By.xpath("//table[@id='table2']//th")).size();
    }

    private int getRow() {
        return driver.findElements(By.xpath("//table[@id='table2']/tbody/tr")).size();
    }

}
/*tep 1. Go to “https://datatables.net/examples/data_sources/dom"
        Step 2.  Get name and age of personnel over 60 years old  and print to console
        Step 3. Verify that personnel over 60 years old less than 3

        (hint: use Map Interface)


        console:
        Ashton Cox:66
        Brielle Williamson:61*/








