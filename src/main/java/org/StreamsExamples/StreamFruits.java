package org.StreamsExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFruits {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("jackfruit");
        fruits.add("Apple");
        fruits.add("java apple");
        fruits.add("Jam");
        List<String> result = fruits.stream().filter(name -> name.startsWith("j")).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(result);
    }
}
