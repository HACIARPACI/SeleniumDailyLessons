package com.cybertek.tests.reviews;

import com.cybertek.pages.*;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class xpath extends TestBase {

    @Test
    public void Test1() {
        LoginPage log = new LoginPage();
        log.loginAsDriver();
        String expected = "Quick Launchpad";

        DashboardPage dash = new DashboardPage();
        dash.waitUntilLoaderScreenDisappear();
        String actual = dash.getPageSubTitle();
        Assert.assertEquals(actual, expected);

        dash.navigateToModule("Activities", "Calendar Events");
        CalendarEventsPage calendar = new CalendarEventsPage();
        calendar.waitUntilLoaderScreenDisappear();
        String expectedSub = "Calendar Events";
        String actualSub = calendar.getPageSubTitle();

        Assert.assertEquals(actualSub, expectedSub);
    }
    @Test
    public void Test2(){
        LoginPage log= new LoginPage();
        log.loginAsDriver();
        DashboardPage dash= new DashboardPage();
        dash.navigateToModule("Activities","Calendar Events");

        CalendarEventsPage cal= new CalendarEventsPage();
        cal.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(cal.createCalendarEvent,55);
        cal.createCalendarEvent.click();

        CreateCalendarEventsPage create= new CreateCalendarEventsPage();
        create.repeat.click();
        create.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(create.days,5);

        Assert.assertTrue(create.days.isSelected(),"verify days selected");
        Assert.assertFalse(create.weekday.isSelected(),"verify weekday is not selected");

    }
    @Test
    public void Test3(){

        LoginPage log= new LoginPage();
        log.loginAsDriver();
        DashboardPage dash= new DashboardPage();
        dash.navigateToModule("Activities","Calendar Events");
        CalendarEventsPage cal= new CalendarEventsPage();
        cal.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(cal.createCalendarEvent,55);
        cal.createCalendarEvent.click();

        CreateCalendarEventsPage create= new CreateCalendarEventsPage();
        BrowserUtils.waitForClickablility(create.repeat,10);
        create.repeat.click();

        List<String> expectedList= Arrays.asList("Daily","Weekly","Monthly","Yearly");
     //   List<String>actualList= new ArrayList<>();

        Select dropdown= create.repeatOptionsList();
        List<WebElement> items = dropdown.getOptions();
      /*  for (WebElement item : items) {
            actualList.add(item.getText());

        }*/

        List<String> actualList = BrowserUtils.getElementsText(items);
        Assert.assertEquals(actualList,expectedList);


    }
    @Test
    public void Test4(){
        LoginPage log= new LoginPage();
        log.loginAsDriver();
        DashboardPage dash= new DashboardPage();
        dash.navigateToModule("Fleet","Vehicles");

        Fleet flee = new Fleet();
        flee.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(flee.increaseButton,55);
        flee.increaseButton.click();

        String expected="Total Of 4273 Records";
        String actual = flee.getPageTotalNum();

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void test5(){
        LoginPage log= new LoginPage();
        log.loginAsDriver();
        DashboardPage dash= new DashboardPage();
        dash.navigateToModule("Fleet","Vehicles");

        Fleet flee = new Fleet();
        flee.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(flee.increaseButton,55);

        flee.exportGrid.click();
        BrowserUtils.waitFor(2);
        flee.CSV.click();
        BrowserUtils.waitFor(5);

        flee.dropdown.click();

        List<WebElement> elements = flee.viewPages;
        System.out.println(elements.size());
        for (WebElement element : elements) {
            System.out.println("for"+element.getText());

        }
        elements.get(2).click();








    }
    }

