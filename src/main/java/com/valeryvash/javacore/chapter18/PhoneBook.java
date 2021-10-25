package main.java.com.valeryvash.javacore.chapter18;

import java.io.*;
import java.util.Properties;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String name, number;

        FileInputStream fin = null;
        boolean changed = false;

        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {

        }

        try{
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("File read error");
        }

        do {
            System.out.println("Input name" +
                    " ('exit' for exit)");
            name = br.readLine();
            if (name.equalsIgnoreCase("exit")) {
                continue;
            }
            System.out.println("input phone number: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.equalsIgnoreCase("exit"));

        if (changed)
        {
            FileOutputStream fos = new FileOutputStream("phonebook.dat");
            ht.store(fos, "Phone book");
            fos.close();
        }

        do {
            System.out.println("Input name for search: " +
                    " ('exit' for exit)");
            name = br.readLine();
            if (name.equals("exit")) {
                continue;
            }
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("exit"));
    }
}
