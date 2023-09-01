package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        long l;
        float f;
        double d;
        byte bt;
        short sh;
        boolean b;
        char c = 'F';

        int[] ints = {3, 7, 1, 7, 9};
        ints[1] = 6;

        int[] tmp = new int[ints.length+1];
        for (int i = 0; i< ints.length; i++) {
            tmp[i] = ints[i];

        }
        ints = tmp;
        String s = new String("Hello World!"); // полная реализация
        String str = "ÖLLOLOL"; //коротка реализация

        System.out.println("Hello World");
    }
}