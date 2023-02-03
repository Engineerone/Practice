package com.guryanov;

import java.util.HashMap;
import java.util.Map;

public class GetName {

    Map<Integer, String> name;

    GetName(String fio) throws MyExeption{
        if (fio=="") throw new MyExeption( "Имя указанно не верно");
        this.name = new HashMap<>();
        fio = clearRLSpaceFio(fio);
        String result = "";
        String tempString = "";
        int i = 0;
        int ind=0;
        boolean newWord = false;
        boolean firstName = true;

        while (i < fio.length()) {
            if (fio.charAt(i) != ' ') {
                tempString += fio.charAt(i);
                newWord = true;
            } else {
                if (newWord) {
                    result = name.put(ind, tempString);

                    //       result += firstName ? tempString + " " : tempString.substring(0, 1) + ".";
                    tempString = "";
                    firstName = false;
                    newWord = false;
                    ind++;
                }
            }
            i++;
        }
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