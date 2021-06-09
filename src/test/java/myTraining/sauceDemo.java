package myTraining;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class sauceDemo {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    //enter username
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
    //enter password
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
    //click login
        driver.findElement(By.cssSelector("#login-button")).click();
        //add to bag 'Sauce Labs Backpack'
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        //get price
        String backPackPrice = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]")).getText();
        System.out.println(backPackPrice);
        //add-basket Sauce Labs Onesie
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-onesie")).click();
        //go to chart
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        //remove labas Onesie
        driver.findElement(By.cssSelector("#remove-sauce-labs-onesie")).click();
        //find uce labs backpack price one checkout page
        String chechoutBackPrice = driver.findElement(By.cssSelector(".inventory_item_price")).getText();
        if (chechoutBackPrice.equals(backPackPrice)) {
            System.out.println("same");
        }else{
    System.out.println("differentPrice");
    System.out.println("checkoutBackPrice:"+chechoutBackPrice);
    System.out.println("backPackPrice:"+backPackPrice);
    }
     //click checkout
    driver.findElement(By.cssSelector("button[id='checkout']")).click();
        //enter firstname lastname zipcode
    driver.findElement(By.cssSelector("#first-name")).sendKeys("Hacı");
    driver.findElement(By.cssSelector("#last-name")).sendKeys("Arpacı");
    driver.findElement(By.cssSelector("#postal-code")).sendKeys("35680");
    //continue
    driver.findElement(By.cssSelector("#continue")).click();
        //does checkout overview price equal main page's price
    String finalPrice=driver.findElement(By.cssSelector(".item_pricebar div")).getText();
    if(finalPrice.equals(backPackPrice)){
        System.out.println("PASS");
    }else{
        System.out.println("FAIL");
    }
    //click finish
    driver.findElement(By.cssSelector("#finish")).click();

}



    }

