package org.CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String>aList=new ArrayList<>();
        aList.add("Abi");
        aList.add("Niya");
        aList.add("Femi");
        aList.add("Neethu");
        aList.add("Binu");
        System.out.println("Array before sort = "+aList);
        Collections.sort(aList);
        System.out.println("Sorted array = "+ aList);
        System.out.println("----------Convert array to arrayList----------u");
        String [] srt={"Riya","miya","niya"};
        ArrayList<String>strcon=new ArrayList<>();
        Collections.addAll(strcon,srt);
        strcon.add("diya");
        System.out.println(strcon);
    }
}
