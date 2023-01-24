package com.guryanov;

public class Task5 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        System.out.println(checkSide(14, 27, 12));
        System.out.println(checkSide(5, 5, 5));
        System.out.println(checkSide(9, 4, 6));
    }

    public static boolean checkSide(int a, int b, int c) {
        boolean result = false;
        if (a <= b + c && b <= a + c && c <= a + b) result = true;
        return result;
    }
}
