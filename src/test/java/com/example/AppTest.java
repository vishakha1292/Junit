package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest
{
@Test
    public void addTest(){
    int expected =5;
    assertEquals(expected,addnumber.add(1,3,1));
}
@Test
    public void addNegativeNumber(){
    assertEquals(-7,addnumber.add(-5,-2,1));
    assertEquals(8,addnumber.add(4,4,1));
}

    @Test
    public void divideByZero(){
        int Expected=0;
        assertEquals(Expected,addnumber.add(-5,-2,0));
    }

    @Test
    public void areFistAndLastTwoChractersAreTheSame(){
    assertEquals(true,addnumber.areFirstAndLastCharactersTheSame("AAbnmAA"));
    }

    @Test
    public void testarefirstAndLastChractersAreTheSame(){
    assertFalse(addnumber.areFirstAndLastCharactersTheSame("AAbCC"));
    }

    @Test
    public void testarefirstAndLastChractersAreTheSame_ExpectedTrue(){
        assertTrue(addnumber.areFirstAndLastCharactersTheSame("AAbnmAA"));
    }
}
