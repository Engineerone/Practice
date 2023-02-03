package com.guryanov;

public class Main {
    public static void main(String[] args) {
        String fio;
        fio = "                                              Гурьянов  Антон               Валерьевич                 ";
      //  fio = "";

        try{
            GetName obj = new GetName(fio);
            System.out.println(obj.name.get(0));
            System.out.println(obj.name.get(1));
            System.out.println(obj.name.get(2));
        }
          catch (MyExeption e) {
        System.out.println(e );
        } 

    }
}

