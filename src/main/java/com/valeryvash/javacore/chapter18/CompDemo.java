package main.java.com.valeryvash.javacore.chapter18;


import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String aStr, bStr;
        aStr = o1;
        bStr = o2;
        return bStr.compareTo(aStr);
    }
}


public class CompDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>(new MyComp());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String s:
             ts) {
            System.out.print(s + " ");
        }
        System.out.println();

        /*
            Reversed comparator
         */

        System.out.println("Comparator with reversed() method");

        ts = new TreeSet<>(new MyComp().reversed());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String s:
                ts) {
            System.out.print(s + " ");
        }
        System.out.println();

        /*
         Lambda in constructor
         */
        System.out.println("Lambda in constructor");

        ts = new TreeSet<>((a, b) -> a.compareTo(b));

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String s:
                ts) {
            System.out.print(s + " ");
        }
        System.out.println();


    }
}
