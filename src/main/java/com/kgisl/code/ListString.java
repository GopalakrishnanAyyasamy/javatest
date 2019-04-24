package com.kgisl.code;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ListString
 */
public class ListString {

    public static void main(String[] args) {
        System.out.println("ARRAY to ARRAYlist");
        String s[] = { "JK", "FG", "DFG", "Gj" };
        ArrayList<String> list0 = new ArrayList<>(Arrays.asList(s));
        System.out.println(list0);
        System.out.println("***************************************");
        System.out.println("BINARY search");
        System.out.println(Arrays.binarySearch(s, "Gj"));
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("hi");
        list1.add("helo");
        list1.add("head");
        list1.add("hold");
        System.out.println(list1);

    }
}