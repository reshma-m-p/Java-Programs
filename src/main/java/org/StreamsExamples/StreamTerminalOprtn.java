package org.StreamsExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOprtn {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("Reflection", "Collection", "Stream",
                "Structure", "Sorting", "State");
        System.out.println("ForEach");
        listOfString.forEach(System.out::println);
        List<String> startWithS = listOfString.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());
        System.out.println(startWithS);
        String singleName = listOfString.stream().reduce("", (partialString, element) -> partialString + " " + element);
        System.out.println("Concatenated with reduce :" + singleName.trim());
        Optional<String> firstName = listOfString.stream().findFirst();
        System.out.println("First name using findFirst");
        firstName.ifPresent(System.out::println);
        Boolean allNameStartWithS = listOfString.stream().allMatch(name -> name.startsWith("S"));
        System.out.println("All name start with S?" + allNameStartWithS);
        Boolean anyNameStartWithS = listOfString.stream().anyMatch(name -> name.startsWith("S"));
        System.out.println("Any name start with S?" + anyNameStartWithS);
    }
}
