package org.itstep;

import java.sql.SQLOutput;

public class ApplicationRunner {

    String text;

    public static void main(String[] args) {
        someMethod("Hi! My name is Anna!");
    }

    static void someMethod(String msg) {
        System.out.println(msg);
    }
}
