package org.example;

public class Malik {

    public  String welcome(){
        return " welcome to semeter 2";
    }

    public static void main(String[] args) {
       Malik malik = new  Malik();
        System.out.println(malik.welcome());
        System.out.println(" welcome to semester two ");

        for (int i = 0; i <=10; i++) {
            System.out.println(i);
        }

        String[] names = {"Malik", "Akerele", "Shitta"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

}
