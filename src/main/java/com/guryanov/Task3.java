package com.guryanov;

public class Task3 {
    public static void main(String[] args) {
        int year = 1000;
        System.out.println(year+"год это "+getCenture(year)+"век");
    }

    static int getCenture(int year) {
        String result;
        Integer intYear = year;
        String srtYear = intYear.toString();
        if (year >= 1000) result = srtYear.substring(0, 2);
        else result = srtYear.substring(0, 1);
        return Integer.parseInt(result)+1;
    }
}
