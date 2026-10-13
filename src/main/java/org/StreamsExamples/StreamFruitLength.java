package org.StreamsExamples;

import java.util.Arrays;
import java.util.List;

public class StreamFruitLength {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Kiwi", "Jackfruit");
        List<String> result = fruits.stream().filter(fruit ->{
           System.out.println(fruit+" filter");
           return fruit.length() > 5;
        }).map(fruit -> {
            System.out.println(fruit+" map");
            return fruit.toUpperCase();
        }).toList();
        System.out.println(result);
    }
}
