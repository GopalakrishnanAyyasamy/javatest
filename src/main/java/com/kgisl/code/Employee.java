package com.kgisl.code;

/**
 * Employee
 */
public class Employee {
    int empid;
    String name;
    float salary;

    Employee()
     {
            System.out.println("No Argument Constructor");
          
    }
    Employee(int id,String n,float sal)     //Parameterized
    {
        this();
        empid=id;
        name=n;
        salary=sal;
        System.out.println(empid+"   "+name+"   "+salary);
    }
    public static void main(String[] args) {
        // Employee e=new Employee();
         Employee E=new Employee(22, "GK", 10000);
      
    }
}