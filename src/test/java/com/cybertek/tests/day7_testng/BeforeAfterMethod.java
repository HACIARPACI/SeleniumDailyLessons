package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;

public class BeforeAfterMethod {
@BeforeClass
public void setUpClass(){
    System.out.println("BEFORE CLASS");
    System.out.println(" executed one time before the class");
}
 @Test
 public void test1(){
     System.out.println("First Test Case");
 }
  @Ignore //test2 yi kosturmak istemez isek @Ignore yaparız
 @Test
 public void test2(){
     System.out.println("second test case");
 }
 @Test
 public void test3(){
     System.out.println("third test case");
 }

    @BeforeMethod
    public void setUp(){
        System.out.println("WebDriver.Opening Browser");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Closing Browser.Quit");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("AFTER CLASS");
        System.out.println("some reporting code here");

    }
}
