package org.example.task.lamdas.task3;

import java.util.Arrays;
import java.util.List;

public class ReduceWith {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);

        int Output = numbers.stream()
                .reduce(1,(a,b) -> a * b);

        System.out.println(Output);
    }
}
