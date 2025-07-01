package org.example.task.lamdas;

public class Main {
    public static void main(String[] args) {

        Printable emma = () -> System.out.println("meow");

        printThing(emma);
    }




    static void printThing(Printable thing){
        thing.print();
    }


}


