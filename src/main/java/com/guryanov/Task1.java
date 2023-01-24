package com.guryanov;

public class Task1 {
    public static void main(String[] args) {
        String firstString = "холодильник";
        String secondString = "ХОЛОД";
        System.out.println(TwoString(firstString, secondString));
    }

    static String TwoString(String firstString, String seconString) {
        String result = "Не входит";
        firstString = firstString.toLowerCase();
        seconString = seconString.toLowerCase();
        if (firstString.contains(seconString)) result = "Входит";
        else result = "Не входит";
        return result;
    }
}
