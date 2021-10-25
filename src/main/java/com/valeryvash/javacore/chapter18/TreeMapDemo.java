package main.java.com.valeryvash.javacore.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<String, Double> tm = new TreeMap<>();

        tm.put("John Dow", 3434.12);
        tm.put("Tom Smith", 123.12);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralf Smith", -19.08);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> temp : set) {
            System.out.print(temp.getKey() + " : ");
            System.out.println(temp.getValue());
        }

        System.out.println();

        String user = "John Dow";
        double balance = tm.get(user);
        tm.put(user, balance + 1000);

        System.out.print("New balance of " + user + ": ");

        System.out.println(tm.get(user));

    }
}
