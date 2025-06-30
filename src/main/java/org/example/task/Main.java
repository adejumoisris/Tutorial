package org.example.task;

public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal(1, "Emamma", 60);
        Applicant applicant1= new Applicant("chidera", 9);
        Applicant applicant2 = new Applicant("chibuzo", 17);

        principal.admitApplicant(applicant1);
        principal.admitApplicant(applicant2);

        Teacher teacher1 = new Teacher(1, "bayomi", 45);
        Course course = new Course("Mathematice", "MTH101");
        teacher1.assignCourse(course);

    }
}
