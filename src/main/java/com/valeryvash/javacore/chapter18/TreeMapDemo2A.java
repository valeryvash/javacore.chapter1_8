package main.java.com.valeryvash.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class CompLastNames implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i, j;

        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');
        return o1.substring(i)
                .compareToIgnoreCase(
                        o2.substring(j)
                );
    }
}

class CompThenByFirstName implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int i, j;

        return o1
                .compareToIgnoreCase(
                        o2
                );
    }

}

public class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastNames compLastNames = new CompLastNames();
        Comparator<String> compLastThenFirst =
                compLastNames.thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> tm = new TreeMap<>(compLastThenFirst);

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


        String user = "John Dow";
        double balance = tm.get(user);
        tm.put(user, balance + 1000);

        System.out.print("New balance of " + user + ": ");

        System.out.println(tm.get(user));

        /*
         Lambda usage
         */

        System.out.println("Lambda usage");

        Comparator<String> compLastNamesL =
                (o1,o2) ->
                        o1.substring(o1.lastIndexOf(' '))
                                .compareToIgnoreCase(
                                        o2.substring(o2.lastIndexOf(' ')));
        Comparator<String> compLastThenFirstL =
                compLastNamesL.thenComparing(
                        (o1,o2) -> o1.compareToIgnoreCase(o2)
                );

        tm = new TreeMap<>(compLastThenFirstL);

        tm.put("John Dow", 3434.12);
        tm.put("Tom Smith", 123.12);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralf Smith", -19.08);

        set = tm.entrySet();

        for (Map.Entry<String, Double> temp : set) {
            System.out.print(temp.getKey() + " : ");
            System.out.println(temp.getValue());
        }


        user = "John Dow";
        balance = tm.get(user);
        tm.put(user, balance + 1000);

        System.out.print("New balance of " + user + ": ");

        System.out.println(tm.get(user));

    }
}
