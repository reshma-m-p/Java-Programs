package org.CollectionPrograms;

import java.util.*;

public class SetInterfaceExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); // Set<String> set1=new TreeSet<>();  Set<String> set2=new LinkedHashSet<>();
        set.add("Riya");
        set.add("Miya");
        set.add("Tiya");
        set.add("Riya");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) { //returns true if and only this scanner has another token(value/data)
            System.out.print(iterator.next() + " ");  //next item
        }
    }
}
