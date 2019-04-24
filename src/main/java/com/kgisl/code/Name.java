package com.kgisl.code;

import java.util.Scanner;

/**
 * Name
 */
public class Name {

    public static void main(String[] args) {
        System.out.println("ENter your first name");
        Scanner s=new Scanner(System.in);
        String f=s.next();
        System.out.println("ENter your second name");
        String l=s.next();
        System.out.println("Your first name has "+ f.length() +" characters");
        System.out.println("Your last name has "+ l.length() + " characters");
        
    System.out.println("Enter your speed");
    int m=s.nextInt();
    System.out.println("Enter your distance in miles");
    int n=s.nextInt();
    float o=n/m;
    System.out.println("At "+m+ " mph, it will take "+o+ " hrs to travel " +n+" miles");
    }
}