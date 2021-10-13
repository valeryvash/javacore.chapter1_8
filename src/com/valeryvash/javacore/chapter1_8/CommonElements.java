package com.valeryvash.javacore.chapter1_8;

import java.util.HashSet;
import java.util.Random;

public class CommonElements {
    public static void main(String[] args) {

        int numberOfElements = 100;

        HashSet leftHashSet = new HashSet(numberOfElements);
        HashSet rightHashSet = new HashSet(numberOfElements);
        HashSet intersectHashSet,temp;

        Random rnd = new Random();

        for (int i = 0; i < numberOfElements; i++) {
            leftHashSet.add((rnd.nextInt(200)-150));
            rightHashSet.add((rnd.nextInt(200)-50));
        }

        temp = (HashSet) leftHashSet;
        System.out.println("Retain method 1st call result is "+
                temp.retainAll(rightHashSet));
        intersectHashSet = (HashSet) rightHashSet.clone();
        System.out.println("Retain method 2nd call result is "+
                intersectHashSet.retainAll(temp));

        System.out.println("Result of collections intersection");
        for (Object o:
             intersectHashSet) {
            System.out.println(o);
        }



    }
}
