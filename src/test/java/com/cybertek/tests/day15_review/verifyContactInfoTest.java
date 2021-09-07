package com.cybertek.tests.day15_review;

import com.cybertek.pages.ContactInfoPage;
import com.cybertek.pages.ContactsPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifyContactInfoTest extends TestBase {
    /**
     * open the chrome
     * go to qa1.vytrack
     * login as a sales manager
     * navigate to customers ->contacts
     * click on email mbrackstone9@example.com
     * verify that full name is Mariam Brackstone
     * verify that email is mbrackstone9@example.com
     * verify that phone number is +18982323434
     */
@Test
    public void contactDetailsTest(){

    extentLogger= report.createTest("Contact Info Verification");
    LoginPage login= new LoginPage();

    String userName= ConfigurationReader.get("salesmanager_username");
    String passWord= ConfigurationReader.get("salesmanager_password");
    extentLogger.info("salesmanager uesrname :"+userName);
    extentLogger.info("salesmanager passWord :"+passWord);

    extentLogger.info("login as a sales manager");
    login.login(userName,passWord);

    DashboardPage dash= new DashboardPage();
    extentLogger.info("navigating to Customers--> Contact");
    dash.navigateToModule("Customers","Contacts");
   // new DashboardPage().navigateToModule(); 1 defa kullancaksak böyle kullanablilirz
    ContactsPage contactPage= new ContactsPage();

    extentLogger.info("Click on mbrackstone9@example.com");
    contactPage.waitUntilLoaderScreenDisappear();
    BrowserUtils.waitFor(5);
    contactPage.getContactEmail("mbrackstone9@example.com").click();

    ContactInfoPage contactInfoPage= new ContactInfoPage();

    String expectedFullName="Mariam Brackstone";
    String actualName=contactInfoPage.fullName.getText();

    extentLogger.info("verify full name is "+expectedFullName);
    Assert.assertEquals(actualName,expectedFullName,"verify fullname");

    extentLogger.info("verify  email is :mbrackstone9@example.com");
    Assert.assertEquals(contactInfoPage.email.getText(),"mbrackstone9@example.coms","verify email");

    extentLogger.info("verify phone number is: +18982323434 ");
    Assert.assertEquals(contactInfoPage.phone.getText(),"+18982323434", "verify phone number");

    extentLogger.pass("PASSED");

}


}
