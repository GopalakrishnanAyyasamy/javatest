package com.kgisl.code;

import java.util.Scanner;

/**
 * Bill
 */
public class Bill {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       System.out.println("Enter id");
        int id=s.nextInt();
     
        System.out.println("Enter name");
        String name=s.next();
        System.out.println("Enter units");
        int unit=s.nextInt();
        System.out.println("Customer IDNO : "+id);
        System.out.println("Customer Name : "+name); 
        System.out.println("Unit consumed : " +unit);


        if(unit<200){
            float c=unit*1.20f;
            System.out.println("Amount Charges Rs.1.20 is: "+c);
        }
        if(unit>200 && unit<400)
        {
            float c=unit*1.50f;
            System.out.println("Amount Charges Rs.1.50 is: "+c);
        }
        if(unit>400 && unit<600)
        {
            float c=unit*1.80f;
            System.out.println("Amount Charges Rs.1.80 is: "+c);
        }
        if(unit>600)
        {
            float c=unit*2.0f;
            System.out.println("      Amount Charges Rs.2.00 is: "+c);
                float ll=(c/100)*15;
            System.out.println("               Surcharge Amount: "+ll);
            float t=ll+c;
            System.out.println("Net Amount Paid By the Customer: "+t);
        }
    
    }
}