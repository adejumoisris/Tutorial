package org.example.task.lamdas.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortWithLambda {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Ameer", 30),
                new Person("Roqeeb", 25),
                new Person("farouq", 32)
        );
        personList.sort(Comparator.comparingInt(p -> p.age));
        personList.forEach(System.out::println);
    }
}
