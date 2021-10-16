package main.java.com.valeryvash.proselyte.collections.comparator;

import java.util.*;

public class DeveloperDemo {
    public static void main(String[] args) {

        //Comparable interface implementation

        TreeSet<Developer> devCompareTreeSet = new TreeSet<>();

        // compareTo() method call after each element addition

        System.out.println("Addition elements in devCompareTreeSet");

        devCompareTreeSet.add(new Developer("James Baxter", 1500));
        devCompareTreeSet.add(new Developer("Games Bookstore", 1499));
        devCompareTreeSet.add(new Developer("Aldrin Baker", 1600));
        devCompareTreeSet.add(new Developer("Alice Cooper", 1120));
        devCompareTreeSet.add(new Developer("Neo Matrix", 900));

        System.out.println("===devTreeSet===");
        System.out.println("Print devCompareTreeSet: \n" + devCompareTreeSet);

        //Comparator interface implementation
        System.out.println("\nInit devCompareTreeSet with comparator");
        devCompareTreeSet = new TreeSet<>((d1, d2) ->
        {
            System.out.println("compare(D d1,D d2) called for " +
                    System.identityHashCode(d1) +
                    "\tand\t" +
                    System.identityHashCode(d2));
            return d1.getSalary()-d2.getSalary();
        });

        //compare() method call after each element's addition

        devCompareTreeSet.add(new Developer("James Baxter", 1500));
        devCompareTreeSet.add(new Developer("Games Bookstore", 1499));
        devCompareTreeSet.add(new Developer("Aldrin Baker", 1600));
        devCompareTreeSet.add(new Developer("Alice Cooper", 1120));
        devCompareTreeSet.add(new Developer("Neo Matrix", 900));

        System.out.println("===devTreeSet===");
        System.out.println("Print devCompareTreeSet:\t" + devCompareTreeSet);
    }
}
