package main.java.com.valeryvash.javacore.chapter18;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
//        Enumeration<String> names;

        String str;
        double bal;

        balance.put("John Dow", 3434.66d);
        balance.put("Tom Smith", 123.22d);
        balance.put("Jane Baker", 1378.00d);
        balance.put("Games Bookstore", 1378.00d);
        balance.put("Tod Hall", 99.22d);
        balance.put("Ralf Smith", -19.308d);

//        names = balance.keys();
//        while (names.hasMoreElements()) {
//            str = names.nextElement();
//            System.out.println(str + ": " + balance.get(str));
//        }
//        System.out.println();

        Set<String> set = balance.keySet();

        Iterator<String> itr = set.iterator();

        while(itr.hasNext())
        {
            str = itr.next();
            System.out.println(str + " : " + balance.get(str));
        }


        str = "John Dow";
        bal = balance.get(str);
        balance.put(str, bal);

        System.out.println("New balance for " + str + " : " + balance.get(str));


    }
}
