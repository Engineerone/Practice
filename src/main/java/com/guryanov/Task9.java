package com.guryanov;

public class Task9 {
    public static void main(String[] args) {
        double height = 180;
        double weight = 85;
        getIMT(height, weight);
    }

    static void getIMT(double height, double weight) {
        double imt = weight / (height / 100 * height / 100);
        System.out.println("Ваш индекс: " + imt);
        if (imt <= 18.5) System.out.println("Недостаток веса");
        else if (imt <= 25.5) System.out.println("Норма");
        else if (imt <= 30) System.out.println("Избыток веса");
        else if (imt > 30) System.out.println("Ожирение");
    }
}


