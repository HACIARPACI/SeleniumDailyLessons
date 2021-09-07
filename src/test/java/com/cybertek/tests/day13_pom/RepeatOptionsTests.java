package com.cybertek.tests.day13_pom;

import com.cybertek.pages.*;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatOptionsTests extends TestBase {
 /*VERIFY RADIO BUTTONS
    Open Chrome browser
    Login as driver
    Go to Activities->Calendar Events
    Click on create calendar events
    Click on repeat
    Verify that repeat every days is checked
    verify that repeat weekday is not checked


  */

    @Test
    public void test1(){

        LoginPage loginPage= new LoginPage();
        //Login as driver
        loginPage.loginAsDriver();

        DashboardPage dashboardPage= new DashboardPage();
        //Go to Activities->Calendar Events
        dashboardPage.navigateToModule("Activities","Calendar Events");

        CalendarEventsPage calendarEventsPage= new CalendarEventsPage();
        //Click on create calendar events
        //wait for loader mask
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEvent,5);//neden sadece buraya koyma ihtiyacı hissediyor

        calendarEventsPage.createCalendarEvent.click();

        CreateCalendarEventsPage createCalendarEventsPage= new CreateCalendarEventsPage();
        // Click on repeat
        createCalendarEventsPage.repeat.click();
        //Verify that repeat every days is checked
        Assert.assertTrue(createCalendarEventsPage.days.isSelected(),"verify days is selected");
        //verify that repeat weekday is not checked
        Assert.assertFalse(createCalendarEventsPage.weekday.isSelected());


         /*
     VERIFY REPEAT OPTIONS
        Open Chrome browser
        Login as driver
        Go to Activities->Calendar Events
        Click on create calendar events button
        Click on repeat checkbox
        Verify that repeat options are Daily, Weekly, Monthly,Yearly(in this order)
     */

    }

    @Test
    public void test2(){

        LoginPage loginPage= new LoginPage();
        //Login as driver
        loginPage.loginAsDriver();

        DashboardPage dashboardPage= new DashboardPage();
        //Go to Activities->Calendar Events
        dashboardPage.navigateToModule("Activities","Calendar Events");

        CalendarEventsPage calendarEventsPage= new CalendarEventsPage();
        //Click on create calendar events
        //wait for loader mask
        calendarEventsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForClickablility(calendarEventsPage.createCalendarEvent,5);//neden sadece buraya koyma ihtiyacı hissediyor

        calendarEventsPage.createCalendarEvent.click();
        CreateCalendarEventsPage createCalendarEventsPage= new CreateCalendarEventsPage();
        // Click on repeat
        createCalendarEventsPage.repeat.click();

        Select repeatDropdown = createCalendarEventsPage.repeatOptionsList();// new Select(repeatOptions)

        // Verify that repeat options are Daily, Weekly, Monthly,Yearly(in this order)
        List<String> expectedList = Arrays.asList("Daily", "Weekly", "Monthly", "Yearly");//buna bak!!

        List<String>actualList=new ArrayList<>();


        List<WebElement> actualOptions = repeatDropdown.getOptions();
        for (WebElement actualOption : actualOptions) {
            //get text of eahc element and get text of these add to actual list
            actualList.add(actualOption.getText());
        }
        //ready list on BrowserUtils

        List<String>actualList2=BrowserUtils.getElementsText(actualOptions);//bunu kullanacaz!!! içeri webelemnts yazıyoz
        //Verify that repeat options are Daily, Weekly, Monthly,Yearly(in this order)
        Assert.assertEquals(actualList,expectedList,"verify listes are same");



    }

}
