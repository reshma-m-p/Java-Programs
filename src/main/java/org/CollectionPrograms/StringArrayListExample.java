package org.CollectionPrograms;

import java.util.ArrayList;

public class StringArrayListExample {
    public static void main(String[] args) {
        ArrayList<String>aList=new ArrayList<>();
        aList.add("Anu");
        aList.add("Renu");
        aList.add("Chinnu");
        aList.add("Renu");
        for(String str:aList){
            System.out.print(str+" ");
        }
        System.out.println();
        System.out.println("----------add(index,obj)-------------");
        aList.add(2,"Seena");
        for(String str:aList){
            System.out.print(str+" ");
        }
        System.out.println();
        System.out.println("----------set(index,obj)-------------");
        aList.set(0,"Maya");
        for(String str:aList){
            System.out.print(str+" ");
        }
        System.out.println();
        System.out.println("----------remove(index)-------------");
        aList.remove(3);
        aList.remove("Maya");
        for(String str:aList){
            System.out.print(str+" ");
        }
        System.out.println();
        System.out.println("----------index()-------------");
        System.out.println("index of Seena = "+aList.indexOf("Seena"));
        System.out.println("-------------size()--------------");
        System.out.println("Size of list is "+aList.size());
        System.out.println("-------------Contains()-----------");
        System.out.println("list contains Maya? "+aList.contains("Maya"));
        System.out.println("list contains Renu? "+aList.contains("Renu"));
        System.out.println("----------To get value at an index-------------");
        System.out.println("The value at index 1 is "+aList.get(1));
        aList.clear();
        System.out.println(aList);
    }
}
