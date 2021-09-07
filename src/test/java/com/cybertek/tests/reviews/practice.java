package com.cybertek.tests.reviews;

import com.cybertek.pages.CalendarEventsPage;
import com.cybertek.pages.CreateCalendarEventsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class practice extends TestBase {

  @Test
  public void test1() {


      LoginPage log = new LoginPage();
      log.loginAsDriver();

      DashboardPage dash= new DashboardPage();
      String expected="Quick Launchpad";
      String actual = dash.getPageSubTitle();
      Assert.assertEquals(actual,expected);

      dash.navigateToModule("Activities","Calendar Events");
      CalendarEventsPage cal= new CalendarEventsPage();
      String expectedAC="Calendar Events";
      String actualAC= cal.getPageSubTitle();
      Assert.assertEquals(actualAC,expectedAC);



  }
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
    public void test2(){

    LoginPage log=new LoginPage();
    log.loginAsDriver();
    DashboardPage dash= new DashboardPage();
    dash.navigateToModule("Activities","Calendar Events");

    CalendarEventsPage cal= new CalendarEventsPage();
    cal.waitUntilLoaderScreenDisappear();
    BrowserUtils.waitForClickablility(cal.createCalendarEvent,10);
    cal.createCalendarEvent.click();

    CreateCalendarEventsPage create= new CreateCalendarEventsPage();
    create.repeat.click();

    Assert.assertTrue(create.days.isSelected());
    Assert.assertFalse(create.weekday.isSelected());





}
    /*
        VERIFY REPEAT OPTIONS
           Open Chrome browser
           Login as driver
           Go to Activities->Calendar Events
           Click on create calendar events button
           Click on repeat checkbox
           Verify that repeat options are Daily, Weekly, Monthly,Yearly(in this order)
        */
@Test
    public void test3(){
    LoginPage log=new LoginPage();
    log.loginAsDriver();
    DashboardPage dash= new DashboardPage();
    dash.navigateToModule("Activities","Calendar Events");

    CalendarEventsPage cal= new CalendarEventsPage();
    cal.waitUntilLoaderScreenDisappear();
    BrowserUtils.waitForClickablility(cal.createCalendarEvent,10);
    cal.createCalendarEvent.click();

    CreateCalendarEventsPage create= new CreateCalendarEventsPage();
    create.repeat.click();

    Select dropdown = create.repeatOptionsList();
    List<String>actualOp= new ArrayList<>();


    List<WebElement> options = dropdown.getOptions();
 /*   for (WebElement option : options) {
        actualOp.add(option.getText());

    }*/

    List<String> actual = BrowserUtils.getElementsText(options);
    List<String>expected= Arrays.asList("Daily","Weekly","Monthly","Yearly");

   Assert.assertEquals(actual,expected);



}

}