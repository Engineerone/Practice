package com.guryanov;

public class Task10 {
    public static void main(String[] args) {
        String mystring = "80+42=122 ";
        System.out.println("Результат: " + calc(mystring));
    }

    В РАБОТЕ !!!!!!!!!!!!!!!!!!!!!!!!



    public static double calc(String mystring) {
        double result = 0;
        int[] mynum = new int[3];
        char[] mysign = new char[2];
        int ind = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        char sign = 'a';
        String numstring = "";

        for (int i = 0; i < mystring.length(); i++) {
            if (Character.isDigit(mystring.charAt(i))) {
                numstring += mystring.charAt(i);
            } else {
               mynum[ind] = Integer.parseInt(numstring);
               numstring = "";
               ind++;
               /*num1 = Integer.parseInt(numstring);*/
               mysign[ind-1]= mystring.charAt(i);

                /*sign = mystring.charAt(i);*/

            }
        }
        //num2 = Integer.parseInt(numstring);

     /*   switch (sign) {
            case ('+'): {
                result = num1 + num2;
                break;
            }
            case ('-'): {
                result = num1 - num2;
                break;
            }
            case ('*'): {
                result = num1 * num2;
                break;
            }
            case ('/'): {
                result = (double) num1 / num2;
                break;
            }
        }*/

        return result;
    }
}