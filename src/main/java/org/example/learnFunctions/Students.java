package org.example.learnFunctions;

public class Students {
    // OOP
    // Class & Object
//    class is the blueprint of an Object
//    Object is an Instance or example of a class

    // Fruits -> mangos , banana,
    // Cars -> benz , toyota

    // Atrribute of students

    String name ;
    String address;
    String phoneNumber ;

    public static void main(String[] args) {
        Students students = new Students();
        students.name = "rume";
        students.address = "Egbeda";
        students.phoneNumber = "0987890";
        System.out.println(students.name);
        System.out.println(students.phoneNumber);
        System.out.println(students.address);
        System.out.println("---------------------------------");

        Students students1 = new Students();
        students1.name = "faith";
        students1.address = "alimosho";
        students1.phoneNumber = "09087868987";

        System.out.println(students1.name);
        System.out.println(students1.address);
        System.out.println(students1.phoneNumber);
    }
}
