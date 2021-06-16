package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {
@BeforeMethod
public void setUp(){
    System.out.println("openBrowser");
}
    @Test
    public void test1(){
        System.out.println("first assertion");
        Assert.assertEquals("title","tiTle");

        System.out.println("second assertion");
        Assert.assertEquals("url","url");

    }
    @Test
    public void test2(){

    Assert.assertEquals("haci","haci");
        System.out.println("second test runnig");
    }
    @Test
    public void test3(){
    String expectedTitle="Cyt";
    String actualTitle="Cybertek";
    Assert.assertTrue(actualTitle.startsWith(expectedTitle),"Verify title starts with Cyb");

    }
    @Test
    public void test4(){
    // verify email contain @ sign
        String email= "mikesmith@.com";
        Assert.assertTrue(email.contains("@"),"verify email contains @");

    }
@Test
public void test5(){     // false olunca pass verir  false olmasını verify ederiz
    Assert.assertFalse(0>1,"verify that 0 is greater han 1");


}
@Test
public void test6(){

    Assert.assertNotEquals("one","two");
}


    @AfterMethod//test fail olsa da AfterMethod calısır..
    public void tearDown(){
        System.out.println("close browser");

    }




}
