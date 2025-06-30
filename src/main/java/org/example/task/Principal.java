package org.example.task;

import java.util.List;

public class Principal extends Person {
    public Principal(int id, String name, int age) {
        super(id, name, age);
    }

    public void admitApplicant(Applicant applicant){

        if (applicant.getAge() >=16){
            System.out.println(" you are admitted "); ;
        }else {
            System.out.println("you are not admitted");
        }
    }

    public void expelStudent(Student student , List<Student> students){
        int offence = 3;
        if (offence >= 3){
            students.remove(student);
            System.out.println(student.getName() + "you have been expel");
        }else {
            students.add(student);
            System.out.println(student.getName() + " you have been retain");
        }


    }
}
