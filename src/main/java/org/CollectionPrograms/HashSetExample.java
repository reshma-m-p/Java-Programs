package org.CollectionPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String>hashSet=new HashSet<>();
        hashSet.add("Rita");
        hashSet.add("Sita");
        hashSet.add("Nita");
        System.out.println("HashSet elements are:");
        Iterator<String>iterator=hashSet.iterator();
        while ((iterator.hasNext())){
            System.out.print(iterator.next()+" ");
        }
        LinkedHashSet<Integer>linked=new LinkedHashSet<>();
        linked.add(1);
        linked.add(4);
        linked.add(3);
        System.out.println();
        System.out.println("LinkedHashSet elements are:");
        Iterator<Integer>itr=linked.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }


    }
}
