package com.example;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestJavaException {
    @Test(expected = ArithmeticException.class)
    public void testDivideNumbers() {
        addnumber.DivideNumbers(12, 0);
    }
}
