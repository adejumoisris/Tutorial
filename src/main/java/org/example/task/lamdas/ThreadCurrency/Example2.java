package org.example.task.lamdas.ThreadCurrency;

public class Example2 implements Runnable {

    public static void main(String[] args) {
        Example2 obj = new  Example2();
        Thread thread = new Thread(obj);
        System.out.println("we are making use of Threading and concurrency");
        thread.start();

    }
    @Override
    public void run() {
        System.out.println("My Code is running ");
    }
}
