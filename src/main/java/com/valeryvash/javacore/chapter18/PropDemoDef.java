package main.java.com.valeryvash.javacore.chapter18;

import java.util.Properties;
import java.util.Set;

public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties();

        defList.put("Флорида","Телеси");
        defList.put("Висконсин", "Мэдисон");

        Properties capitals = new Properties(defList);
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джеферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индиаполис");

        Set<?> states = capitals.keySet();

        for (Object name : states){
            System.out.println("Столица штата: " + name + " - "+
                    capitals.get((String) name));
        }
        System.out.println();

        String str = capitals.getProperty("Флорида", "не найдена");
        System.out.println("Cтолица штата Флорида "+ str + ".");

    }
}
