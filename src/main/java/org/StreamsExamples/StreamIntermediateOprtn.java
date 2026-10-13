package org.StreamsExamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamIntermediateOprtn {
    public static void main(String[] args) {
        List<List<String>> listOfList = Arrays.asList(Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"), Arrays.asList("Sorting", "Mapping", "Reduction", "Stream"));
        Set<String> resultSet = new HashSet<>();
        List<String> result = listOfList.stream().flatMap(List::stream).filter(name -> name.startsWith("S")).map(String::toUpperCase).sorted().peek(s -> resultSet.add(s)).distinct().collect(Collectors.toList());
        System.out.println("Intermediate result:::");
        resultSet.forEach(System.out::println);
        System.out.println("Final result:::");
        result.forEach(System.out::println);
    }
}
