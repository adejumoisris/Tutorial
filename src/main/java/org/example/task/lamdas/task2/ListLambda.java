package org.example.task.lamdas.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListLambda {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Taju", "Tade", "Tawa");
        names.forEach(good -> System.out.println( "Hello" +names));
//        System.out.println(names);
    }
}
