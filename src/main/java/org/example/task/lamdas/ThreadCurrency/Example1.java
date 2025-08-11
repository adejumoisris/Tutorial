package org.example.task.lamdas.ThreadCurrency;

public class Example1 extends Thread {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        example1.start();
        System.out.println("we are learning Threding ");
    }
    @Override
    public void run() {
        System.out.println("Good work ");
    }
}
