package com.guryanov;

public class Task7 {

    public static void main(String[] args) {
        String fio, fio1, fio2, fio3, fio4;

        fio = "                                              Гурьянов  Антон               Валерьевич                 ";
        fio1 = "Гурьянов  Антон               Валерьевич                 ";
        fio2 = "                                              Гурьянов  Антон               Валерьевич";
        fio3 = "Гурьянов Антон Валерьевич";
        fio4 = "Гурьянов Антон Иван Валерьевич";

        System.out.println(getShortFio(fio));
        System.out.println(getShortFio(fio1));
        System.out.println(getShortFio(fio2));
        System.out.println(getShortFio(fio3));
        System.out.println(getShortFio(fio4));
    }

    static String getShortFio(String fio) {
        fio = clearRLSpaceFio(fio);
        String result = "";
        String tempString = "";
        int i = 0;
        boolean newWord = false;
        boolean firstName = true;

        while (i < fio.length()) {
            if (fio.charAt(i) != ' ') {
                tempString += fio.charAt(i);
                newWord = true;
            } else {
                if (newWord) {
                    result += firstName ? tempString + " " : tempString.substring(0, 1) + ".";
                    tempString = "";
                    firstName = false;
                    newWord = false;
                }
            }
            i++;
        }
        return result;
    }

    static String clearRLSpaceFio(String fio) {
        int i = 0;
        while (fio.charAt(i) == ' ') {
            fio = fio.substring(1, fio.length());
        }
        while (fio.charAt(fio.length() - 1) == ' ') {
            fio = fio.substring(0, fio.length() - 1);
        }
        return fio + " ";
    }
}