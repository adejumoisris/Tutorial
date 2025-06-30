package org.example.task;

import java.util.List;

public class Teacher extends  Person {
    private  List<Course> courses;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.courses = courses;
    }

    // assigncourse
    public void assignCourse(Course course){
        courses.add(course);
    }
    // teaching a course
    public void teachingCourse(Course course){
        System.out.println(name + "is teaching this course" + course.getTitle() + " " + course.getCode());

    }
}
