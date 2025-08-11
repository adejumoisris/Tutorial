package org.example.task.lamdas.ThreadCurrency;

public class Example implements Runnable{


    public static void main(String[] args) {
        System.out.println("welcome to thread");

    }

    @Override
    public void run() {
        System.out.println( "Good to learn Thread ");
    }
}
