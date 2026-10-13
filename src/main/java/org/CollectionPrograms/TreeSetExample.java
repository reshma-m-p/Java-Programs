package org.CollectionPrograms;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> tSet = new TreeSet<>();
        tSet.add("Maya");
        tSet.add("Tiya");
        tSet.add("Niya");
        tSet.add("Diya");
        System.out.println("String TreeSet elements:");
        Iterator<String> iterator = tSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(4);
        System.out.println();
        System.out.println("Integer TreeSet elements:");
        Iterator<Integer> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
