package com.example;

import org.junit.*;

import static junit.framework.TestCase.assertTrue;

public class QuickBeforeAndAfter {

    @BeforeClass   //Sometimes We dont want to do somethings before every test So we use beforeclass,so that
                       //it happens once before class
    public static void beforeClass(){
 System.out.println("Before Class");
    }
    @Before
            public void intialize() {
        addnumber object = new addnumber();
        System.out.println("Before every test");
    }
    @After
    public void printMessage(){
        System.out.println("Test Successful");
    }
    @Test
    public void testAreTwoChractersTheSame(){
        assertTrue(addnumber.areFirstAndLastCharactersTheSame("AAbnmAA"));
    }
    @Test
    public void testAreTwoChractersTheSameChecvk(){
        assertTrue(addnumber.areFirstAndLastCharactersTheSame("AAbnmAA"));
    }

    @AfterClass //Sometimes We dont want to do somethings after every test So we use after class,so that
                  //it happens once after class
    public static void testAfterClass(){
        System.out.println("After Class");
    }

}
