package com.kgisl.code;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ListDup
 */
public class ListDup {
   public static void main(String[] args) {

      ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 1, 2, 3, 2, 3, 4, 45));
      ArrayList<Integer> list2 = new ArrayList<Integer>();
      for (Integer o : list) {
         if (!list2.contains(o)) {
            list2.add(o);

         }
      }
      System.out.println("Duplicate elements removed ArrayList");
      for (Integer var : list2) {
         System.out.println(var);
      }

   }
}