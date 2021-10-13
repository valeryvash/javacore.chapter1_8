package com.valeryvash.javacore.chapter1_8;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> stringTreeSet = new TreeSet<>();

        stringTreeSet.add("C");
        stringTreeSet.add("A");
        stringTreeSet.add("B");
        stringTreeSet.add("E");
        stringTreeSet.add("F");
        stringTreeSet.add("D");

        System.out.println(stringTreeSet);

        System.out.println(stringTreeSet.subSet("C",true,"F",true));
        System.out.println(stringTreeSet.subSet("C","F"));
    }
}
