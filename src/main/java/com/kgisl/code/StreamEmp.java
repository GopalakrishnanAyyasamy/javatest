package com.kgisl.code;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * StreamEmp
 */
public class StreamEmp {

    public static void main(String[] args) {
        Emp c1 = new Emp(10, "GK", 10000f);
        Emp c2 = new Emp(11, "Gopal", 13000f);
        Emp c3 = new Emp(12, "krish", 14000f);
        Emp c4 = new Emp(13, "prabha", 15000f);

        ArrayList<Emp> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);

    }
}