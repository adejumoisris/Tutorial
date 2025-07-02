package org.example.task.lamdas.task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiterLamda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "John", "Angela", "Ade");
        List<String> outPut = names.stream().filter(p -> p.startsWith("A"))
                .toList();
        System.out.println(outPut);

    }
}
