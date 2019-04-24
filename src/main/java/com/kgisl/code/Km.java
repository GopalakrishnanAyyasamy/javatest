package com.kgisl.code;

import java.util.Scanner;

/**
 * Km
 */
public class Km {

    public static void main(String[] args) {
        String a = "k";
        String b = "m";
        float f = 16.09f;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter conversion table");
        String t = s.next();
        System.out.println("ENter size of your table");
        int size = s.nextInt();
        if (t.equals(b)) {
            for (int i = 0; i < size; i++) {

                System.out.println("Enter values");
                int v = s.nextInt();
                float j = v * f;
                j = j / 10;
                System.out.println("Converted value is:" + j + "km");
            }

        }
        if (t.equals(a)) {
            for (int i = 0; i < size; i++) {

                System.out.println("Enter values");
                int v = s.nextInt();
                float j = v / f;

                j = j * 10;
                System.out.println("Converted value is:" + j + " km");
            }

        }
    }
}