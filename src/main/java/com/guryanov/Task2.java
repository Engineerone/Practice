package com.guryanov;

public class Task2 {
    public static void main(String[] args) {
        int[] arrayToFind = {6, 7, 8};
        int[] arrayMain = {5, 6, 7, 9, 9, 10};
        System.out.println(TwoArray(arrayMain, arrayToFind));
    }

    static String TwoArray(int[] arrayMain, int[] arrayToFind) {
        String result = "Не входит";

        int j = 0;
        boolean include = false;
        boolean find = false;

        for (int i = 0; i <= arrayToFind.length - 1; i++) {
            for (; j <= arrayMain.length - 1; ) {
                if (arrayToFind[i] == arrayMain[j]) {
                    include = true;
                    find = true;
                    j++;
                    break;
                }
                include = false;
                j++;
                if (find & include == false) break;

            }
        }
        if (find & include) result = "Входит";
        return result;
    }
}