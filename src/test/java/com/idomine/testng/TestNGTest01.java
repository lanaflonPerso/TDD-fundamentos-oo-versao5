package com.idomine.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGTest01
{
    @Test(dataProvider = "dp")
    public void f(Integer n, String s)
    {
        System.out.println("Inside @Test");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Inside @BeforeMethod");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("Inside @AfterMethod");
    }

    @DataProvider
    public Object[][] dp()
    {
        System.out.println("Inside @DataProvider");
        return new Object[][] {
                new Object[] { 1, "a" },
                new Object[] { 2, "b" },
        };
    }

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Inside @BeforeClass");
    }

    @AfterClass
    public void afterClass()
    {
        System.out.println("Inside @AfterClass");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Inside @BeforeTest");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("Inside @AfterTest");
    }

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Inside @BeforeSuite");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("Inside @AfterSuite");
    }

}
