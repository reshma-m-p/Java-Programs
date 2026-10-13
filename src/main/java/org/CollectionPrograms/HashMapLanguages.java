package org.CollectionPrograms;

import java.util.HashMap;

public class HashMapLanguages {
    public static void main(String[] args) {
        HashMap<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Python");
        languages.put(4, "Java script");
        System.out.println("Languages HashMap = " + languages);
        System.out.println("The value of the key 2 is " + languages.get(2));
        boolean val = languages.remove(2, "Python");
        System.out.println("Removed Python? " + val);
        System.out.println("Updated HashMap : " + languages);
    }
}
