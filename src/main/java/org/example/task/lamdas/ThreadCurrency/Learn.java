package org.example.task.lamdas.ThreadCurrency;

public class Learn extends Thread{
    public static int amount = 0;

    public static void main(String[] args) {
        Learn learn = new Learn();
        learn.start();
        amount++;
        System.out.println(amount);
    }

    @Override
    public void run() {
        amount++;
    }
}
