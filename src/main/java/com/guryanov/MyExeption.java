package com.guryanov;

public class MyExeption extends Exception {

    public MyExeption() {
    }
    public MyExeption(String message) {
        super(message);
    }
    public MyExeption(String message, Throwable cause) {
        super(message, cause);
    }
}
