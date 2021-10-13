package com.valeryvash.javacore.chapter1_8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();

        System.out.println(
                "Initial array list size is " + a1.size()
        );

        a1.add("A");
        a1.add("R");
        a1.add("T");
        a1.add("M");
        a1.add("A");
        a1.add("N");
        a1.add("!");
        a1.add(0,"C");

        System.out.println(
                "Array list size after element add " + a1.size()
        );

        System.out.println(
                "Array list content: " + a1
        );

        a1.remove(0);
        a1.remove("!");

        System.out.println(
                "Array list size after elements removal " + a1.size()
        );

        System.out.println(
                "Contents of array list after elements removal: " + a1
        );
        /*
        *   The book not contain the next part
        * */
        ArrayList<String> a2 = new ArrayList<String>(a1.subList(3, 6));
        System.out.println(
                "Sub array of a1 from 3 to 6 element: " + a2
        );

        for (int i = 0; i < a2.size(); i++) {
            System.out.println( i + " \t " + a2.get(i));
        }

        a1.retainAll(a2);

        System.out.println(
                "1st array retain 2nd array " + a1
        );

    }
}
