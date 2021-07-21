package com.cybertek.tests.homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class amazonTask {
      /*    1. Go to https://www.amazon.com
            2. Search for "hats for men" (Configurationdan cagir)
            3. Add the first hat appearing to Cart with quantity 2
            4. Open cart and assert that the total price and quantity are correct
            5. Reduce the quantity from 2 to 1 in Cart for the item selected in the step 3
            6. Assert that the total price and quantity has been correctly changed*/
 @Test
    public void test1(){
     WebDriver driver= WebDriverFactory.getDriver("chrome");
     driver.get("https://www.amazon.com");
     driver.manage().window().maximize();
     //2. Search for "hats for men" (Configurationdan cagir)
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Cast Iron Dutch Oven");
    driver.findElement(By.id("nav-search-submit-button")).click();
    driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();



    /*
  //  driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).click();
    driver.findElement(By.xpath("(//div/h2/a/span)[1]")).click();
    //find qtty dropdown
    driver.findElement(By.xpath("(//div[@class='a-section a-spacing-none a-padding-none'])[1]//span[@class='a-button-text a-declarative']")).click();
        //dropdowa atama
    List<WebElement> quantity = driver.findElements(By.xpath("//div[@class='a-popover-wrapper']//li"));
     System.out.println("quantity.size() = " + quantity.size());
     quantity.get(1).click();
//add chart
     driver.findElement(By.id("add-to-cart-button")).click();


 //first selected price befare click on teh Cart
String firstQuantity =driver.findElement(By.cssSelector("#hlb-ptc-btn-native")).getText();
     System.out.println(firstQuantity);
     String firstPrice = driver.findElement(By.xpath("(//div[@id='hlb-subcart']//span/span)[2]")).getText();
     // cart
driver.findElement(By.id("hlb-view-cart-announce")).click();

//miktarı alma
WebElement totalQuantity= driver.findElement(By.id("sc-subtotal-label-activecart"));
String Quantity=totalQuantity.getText();
Quantity.indexOf('(');
     Assert.assertEquals(Quantity,"Subtotal (2 items):","veriify tat quantities are same");
//price i alma
WebElement totalPrice = driver.findElement(By.cssSelector("#sc-subtotal-amount-buybox>span"));
String totalP= totalPrice.getText();

Assert.assertEquals(totalP,firstPrice,"verify rpice is same");

//remove one decrease to
driver.findElement(By.cssSelector("#a-autoid-0-announce")).click();
     List<WebElement> dropHat = driver.findElements(By.cssSelector("ul>li[class='a-dropdown-item quantity-option']"));
    dropHat.get(1);*/


 }

}
