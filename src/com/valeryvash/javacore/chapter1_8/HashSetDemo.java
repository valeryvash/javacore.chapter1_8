package com.valeryvash.javacore.chapter1_8;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("Beta");
        hs.add("Alfa");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println(hs);

        /*
        Repeat for LinkedHashSet
         */
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Beta");
        linkedHashSet.add("Alfa");
        linkedHashSet.add("Eta");
        linkedHashSet.add("Gamma");
        linkedHashSet.add("Epsilon");
        linkedHashSet.add("Omega");

        System.out.println(linkedHashSet);
    }
}
