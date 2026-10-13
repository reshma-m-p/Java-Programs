package org.CollectionPrograms;

import java.util.HashMap;

public class HashMapPeople {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("John", 30);
        people.put("Steve", 32);
        people.put("Annie", 28);
        System.out.println("The keys and values:");
        for (String name : people.keySet()) {
            System.out.println("Key - " + name + " : value - " + people.get(name));
        }
        System.out.println();
        System.out.println("The Value set:");
        for (int age : people.values()) {
            System.out.print(age + " ");
        }
    }
}
