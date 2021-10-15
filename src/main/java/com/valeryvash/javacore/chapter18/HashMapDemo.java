package main.java.com.valeryvash.javacore.chapter18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Double> hm = new HashMap<>();

        hm.put("John Dow", 3434.66d);
        hm.put("Tom Smith", 123.22d);
        hm.put("Jane Baker", 1378.00d);
        hm.put("Games Bookstore", 1378.00d);
        hm.put("Tod Hall", 99.22d);
        hm.put("Ralf Smith", -19.308d);

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double> me:
             set) {
            System.out.print(me.getKey() + ":\t");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm.get("John Dow");
        hm.put("John Dow", balance + 1000d);
        System.out.println(
                "New money balance of John Dow user: " + hm.get("John Dow") + "\n"
        );

        // Hashmap example from: https://www.baeldung.com/java-hashmap-advanced

        System.out.println("---\tCollision example\t---");

        class MyKey{
            private int id;

            @Override
            public int hashCode() {
                System.out.println("Calling MyKey hashCode()");
                return id;
            }

            public MyKey(int id) {
                this.id = id;
            }
        }

        MyKey myKey = new MyKey(1);

        Map<MyKey, String> val = new HashMap<>();

        //While hashing occurs?

        System.out.println("Put value");
        val.put(myKey, "string");
        System.out.println("Get value");
        val.get(myKey);

        //Hashing occurs then loadfactor limit reached.

    }
}
