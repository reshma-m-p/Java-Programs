package org.CollectionPrograms;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExamples {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("Reshma");
        col.add(1);
        col.add(1.5);
        col.add(true);
        col.add('H');
        System.out.println(col);
        Collection<Integer> datacol=new ArrayList<>();
        datacol.add(1);
        datacol.add(2);
        datacol.add(3);
        datacol.add(4);
        datacol.add(5);
        for(int data:datacol){
            System.out.print(data+" ");
        }
        Collection<String>stringCol=new ArrayList<>();
        stringCol.add("Anu");
        stringCol.add("Manu");
        stringCol.add("Vinu");
        System.out.println();
        for(String data:stringCol){
            System.out.print(data+" ");
        }
    }
}
//Collection<String>vcol=new ArrayList<>();
//Collection<String>vcol=new LinkedList<>();
//Collection<String>vcol=new HashSet<>();
//Collection<String>vcol=new TreeSet<>();