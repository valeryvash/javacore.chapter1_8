package main.java.com.valeryvash.javacore.chapter18;

import java.util.LinkedList;

class Address{
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return
                this.name + "\n" +
                this.street + "\n" +
                this.city + "\t" + this.state + "\t" + this.code;
    }
}

public class MailList {

    public static void main(String[] args) {
        LinkedList<Address> listOfAdresses = new LinkedList<>();

        listOfAdresses.add(new Address("J.W. West", "11 Oak Ave",
                "Urbania", "IL", "61801"));
        listOfAdresses.add(new Address("Ralf Baker", "1142 Maple Lane",
                "Mahomet", "IL", "61853"));
        listOfAdresses.add(new Address("Tom Carlton", "867 Elm St",
                "Champaign", "IL", "61820"));

        for (Address element:
             listOfAdresses) {
            System.out.print(element + "\n");
            System.out.println();
        }

    }
}
