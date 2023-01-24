package com.guryanov;

import java.util.Arrays;

public class Task6 {
    static int pos = 0;

    public static void main(String[] args) {
        int[] myArray = {1, 8, 0, 8, 6, 5, 5, 7, 7, 8, 8, 8, 6, 4, 4, 3};
        int num = 8;
        System.out.println("Мой массив: " + Arrays.toString(myArray));
        System.out.println("Позиции цфры: " + num + " " + Arrays.toString(getPos(myArray, num)));
    }

    static int[] getPos(int[] myArray, int num) {
        int[] result = new int[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == num) result = addToTempArray(i, result.length, result).clone();
        }
        return result;
    }

    static int[] addToTempArray(int i, int resultLength, int[] result) {
        int[] temp = new int[resultLength + 1];
        for (int j = 0; j < temp.length - 1; j++) temp[j] = result[j];
        temp[pos] = i + 1;
        pos++;
        return temp;
    }
}


