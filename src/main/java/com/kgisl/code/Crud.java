package com.kgisl.code;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Crud
 */
public class Crud {

    int empid;
    String name;
    String dept;
    float salary;

    Crud(int i, String n, String d, float s) {
        empid = i;
        name = n;
        dept = d;
        salary = s;
    }

    public String toString() {
        return "Employee id: " + empid + "  Employee name: " + name + "  Dep: " + dept + "  Salary: " + salary;
    }

    public static void main(String[] args) {
        Crud c1 = new Crud(10, "GK", "Network", 10000f);
        Crud c2 = new Crud(11, "Gopal", "Systems", 13000f);
        Crud c3 = new Crud(12, "krish", "HR", 14000f);
        Crud c4 = new Crud(13, "prabha", "Release", 15000f);
        


        ArrayList<Crud> list = new ArrayList<>();
        System.out.println("ADD operation");
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        for (Object var : list) {
            System.out.println(var);
        }
        System.out.println("*****************************************************************************");
        System.out.println("Remove Operation");
        list.remove(c3);
        for (Object var : list) {
            System.out.println(var);
        }

    }
}