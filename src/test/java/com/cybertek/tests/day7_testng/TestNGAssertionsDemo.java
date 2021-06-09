package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {

    @Test
    public void test1(){
        System.out.println("first assertion");
        Assert.assertEquals("title","tiTle");

        System.out.println("second assertion");
        Assert.assertEquals("url","url");




    }



}
