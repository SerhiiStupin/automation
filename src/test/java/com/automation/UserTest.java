package com.automation;

import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;


public class UserTest {
    private User user;
    @BeforeClass
    public void beforeClass(){
        System.out.println("Setup enviroment");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("Stop");
    }

    @BeforeMethod
    public void
    beforeMethod() {
        System.out.println("Before");
        user = new User("Bob", 30);
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfetrMethod");
        user = null;
    }
@Test
    public void userTest() {
    System.out.println("NameTest");
    assertEquals(user.getName(), "Bob");
    }
    @Test
    public void userAgeTest() {
        System.out.println("AgeTest");
        assertEquals(user.getAge(), 30);
    }
}
