package com.cybertek.tests.day14_extent_reports;

import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestWithReport extends TestBase {

    @Test
    public void wrongPasswordTest() {
        //name of the test
        extentLogger=report.createTest("Wrong Password Test");

        LoginPage loginPage = new LoginPage();
        extentLogger.info("Enter username : is user1");
        loginPage.usernameInput.sendKeys("user1");

        extentLogger.info("Enter password : somepassword ");
        loginPage.passwordInput.sendKeys("somepassword");

        extentLogger.info("Click login button");
        loginPage.loginBtn.click();


        extentLogger.info("verify page url");//önce yazıyoruz
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/user/login");
        extentLogger.info("Wrong password test is passed");//sonra yazıyoruz

    }

    @Test
    public void wrongUsernameTest() {
        extentLogger= report.createTest("Wrong username test");

        LoginPage loginPage = new LoginPage();

        extentLogger.info("enterusername :someusername");
        loginPage.usernameInput.sendKeys("someusername");

        extentLogger.info("enter password : UserUser123");
        loginPage.passwordInput.sendKeys("UserUser123");

        extentLogger.info("click login button");
        loginPage.loginBtn.click();

        extentLogger.info("verify page url");
        Assert.assertEquals(driver.getCurrentUrl(), "https://qa1.vytrack.com/user/login123");
        extentLogger.info("PASSED");


    }
}