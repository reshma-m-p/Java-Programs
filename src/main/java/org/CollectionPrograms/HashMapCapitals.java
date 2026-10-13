package org.CollectionPrograms;

import java.util.HashMap;

public class HashMapCapitals {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Germany", "Berlin");
        capitals.put("Japan", "Tokyo");
        capitals.put("India", "New delhi");
        capitals.put("USA", "Washington DC");
        System.out.println("HashMap" + capitals);
        System.out.println("----------To get value of the key-Japan-----------");
        System.out.println(capitals.get("Japan"));
        System.out.println("----------To Remove an item with key (India)-----------------");
        capitals.remove("India");
        System.out.println(capitals);
        System.out.println("-----To get the size of HashMap-----------");
        System.out.println(capitals.size());
        System.out.println("-------To clear the HashMap-------");
        capitals.clear();
        System.out.println(capitals);


    }
}
