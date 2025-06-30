package org.example.task;

import java.util.List;

public class Student extends Person{
    private List<Course> courses;

    public Student(int id, String name, int age, List<Course> courses) {
        super(id, name, age);
        this.courses = courses;
    }

    public void takeCourse(Course course){
        courses.add(course);
        System.out.println(name  + "is taking " + course.getTitle() + " " + course.getCode());
    }
}
