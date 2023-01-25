package com.guryanov;

public class Task10 {
    public static void main(String[] args) {
        String[] task = new String[10];
        task[0] = "2+4=5";
        task[1] = "6*3=18";
        task[2] = "21/3=7";
        task[3] = "5+10=16";
        task[4] = "3*3=9";
        task[5] = "20*20=399";
        task[6] = "25*25=625";
      /*task[7] =
        task[8] =
        task[9] = */
        for (String a : task) calc(a);
    }

    public static void calc(String mystring) {
        if (mystring != null) {
            mystring += " ";
            int[] num = new int[3];
            char[] sign = new char[3];
            int index = 0;
            String tempString = "";

            for (int i = 0; i < mystring.length(); i++) {
                if (Character.isDigit(mystring.charAt(i))) {
                    tempString += mystring.charAt(i);
                } else {
                    num[index] = Integer.parseInt(tempString);
                    sign[index] = mystring.charAt(i);
                    tempString = "";
                    index++;
                }
            }
            System.out.println();
            System.out.println(mystring);

            switch (sign[0]) {
                case ('+'): {
                    if (num[0] + num[1] == num[2]) System.out.println("Выражение верно");
                    else System.out.println("Выражение НЕ верно");
                    break;
                }
                case ('-'): {
                    if (num[0] - num[1] == num[2]) System.out.println("Выражение верно");
                    else System.out.println("Выражение НЕ верно");
                    break;
                }
                case ('*'): {
                    if (num[0] * num[1] == num[2]) System.out.println("Выражение верно");
                    else System.out.println("Выражение НЕ верно");
                    break;
                }
                case ('/'): {
                    if (num[0] / num[1] == num[2]) System.out.println("Выражение верно");
                    else System.out.println("Выражение НЕ верно");
                    break;
                }
            }
        }
    }
}