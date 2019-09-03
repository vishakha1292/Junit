package com.example;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestArrays {
    @Test
    public void testSortArray(){
        int[] actual={12,6,2,8,4};
        int[] arr={2,4,6,8,12};
        assertArrayEquals(arr,addnumber.sortArrays(actual));
    }
}
