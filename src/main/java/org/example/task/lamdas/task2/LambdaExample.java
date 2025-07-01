package org.example.task.lamdas.task2;

public class LambdaExample {
    public static void main(String[] args) {
//       MyFunctionalInterface greeting = () -> System.out.println("welcome Hi");
//       greeting.sayHi();

       MathOperation add = (l,b)-> l + b;
     int area =  add.araeOfRectangle(3,5);
        System.out.println(area);


    }


}
