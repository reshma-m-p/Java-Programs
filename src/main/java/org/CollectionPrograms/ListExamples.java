package org.CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List<Integer>number=new ArrayList<>();
        number.add(1);
        number.add(3);
        number.add(4);
        for(int num:number){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("----------add(index,obj)-------------");
        number.add(1,2);
        number.add(5);
        for(int num:number){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("----------set(index,obj)-------------");//to replace/update the value in the given index with obj
        number.set(2,0);
        //number.set(7,10); cant replace to the position where no elements added
        for(int num:number){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("----------remove(index)-------------");
        number.remove(4);
        number.remove(Integer.valueOf(0)); // To remove the element 0
        for(int num:number){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("----------index()-------------"); // to get the index of an element
        System.out.println("Index of 4 is "+number.indexOf(4));
        System.out.println("----------To get value at an index-------------");
        System.out.println("The value at index 1 is "+number.get(1));
        System.out.println("-------------size()--------------");
        System.out.println("Size of list is "+number.size());
        System.out.println("-------------Contains()-----------");
        System.out.println("list contains 5? "+number.contains(5));

        System.out.println("----------To clear the list---------------------");
        number.clear();
        for(int num:number){
            System.out.println(num);
        }
        System.out.println(number);
    }
}
