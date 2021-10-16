package main.java.com.valeryvash.proselyte.collections.comparator;

public class Developer implements Comparable<Developer> {
    private String name;
    private int salary;

    private Developer() {
    }

    public Developer(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /*
        Implemented method
     */

    @Override
    public int compareTo(Developer o) {
        System.out.println("compareTo() called for " +
                System.identityHashCode(this)+
                "\t;\t" +
                System.identityHashCode(o));
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return
                "\nDeveloper info {" +
                "\nname='" + name +
                "\nsalary=" + salary +
                "\n}\n";
    }
}
