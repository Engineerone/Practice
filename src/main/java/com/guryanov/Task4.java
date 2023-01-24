package com.guryanov;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[] arroyOne = {1, 2, 3, 4,10};
        int[] arroyTwo = {5, 6, 7, 8, 9};
        int[] result;
        result = getSingleArroy(arroyOne, arroyTwo);
        System.out.println(Arrays.toString(result));
    }

    public static int[] getSingleArroy(int[] arroyOne, int[] arroyTwo) {
        int[] result = new int[arroyOne.length + arroyTwo.length];
        int index = 0;
        for (int i = 0; i < arroyOne.length; i++) {
            result[i] = arroyOne[i];
            index++;
        }
        for (int i = 0; i < arroyTwo.length; i++)
        {result[index] = arroyTwo[i];
        index++;
        };
        return result;
    }
}
