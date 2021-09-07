package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Fleet extends BasePage{

 public Fleet(){

     PageFactory.initElements(Driver.get(),this);
 }
@FindBy(xpath = "(//ul[@class='icons-holder']//i)[2]")
    public WebElement increaseButton;
 @FindBy(xpath = "//label[starts-with(.,'Total')]")
    public WebElement totalNumber;
@FindBy(xpath = "((//ul[@class='dropdown-menu'])[3]//a)[1]")
    public WebElement CSV;
@FindBy(css = "a[title^='With']")
public WebElement exportGrid;
@FindBy(xpath = "(//ul[@class='dropdown-menu pull-right'])/li/a")
public List<WebElement> viewPages;
@FindBy(xpath = "//button[@data-toggle='dropdown']")
public WebElement dropdown;

    public String getPageTotalNum() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForStaleElement(pageSubTitle);
        return totalNumber.getText();
    }

}
//export grid  (//div[@class='extra-actions-panel']//a)[1]