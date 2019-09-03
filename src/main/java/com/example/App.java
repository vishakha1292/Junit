package com.example;

import java.util.Arrays;

public class App {
    public static void main(String args[]) {
        System.out.println(addnumber.add(1, 2, 3));
        addnumber.DivideNumbers(12, 0);
    }
}

class addnumber {
    public static int add(int a, int b, int c) {
        try {
            int result = a + b / c;
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static boolean areFirstAndLastCharactersTheSame(String str) {
        if (str.length() <= 1)
            return false;
        else if (str.length() >= 2) {
            String first2Chars = str.substring(0, 2);
            String last2Chars = str.substring(str.length() - 2);
            boolean result = first2Chars.equals(last2Chars);
            return result;
        }
        return false;
    }

    public static void DivideNumbers(int dividend, int divisor) {
        int result = dividend / divisor;
        System.out.println(result);
    }

    public static int[] sortArrays(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
}
