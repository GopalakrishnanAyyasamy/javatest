package com.kgisl.code;

import java.util.Scanner;

/**
 * Num
 */
public class Num {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("You typed in");
        int a=s.nextInt();
            int x=a*2;
            System.out.println("My numbers are:");
            System.out.println(x);
            x++;
            System.out.println(x);
            x++;
            System.out.println(x);
            System.out.println("You typed in");
        int b=s.nextInt();
        System.out.println("My numbers are:");
         for (int i = 0; i < 3; i++) {
                b=b/2;
            System.out.println(b);
        }


    }
}