package org.example.task;

import java.util.List;

public class School {
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Applicant> applicants;
    private Principal principal;

    public School(List<Student> students, List<Teacher> teachers, List<Applicant> applicants, Principal principal) {
        this.students = students;
        this.teachers = teachers;
        this.applicants = applicants;
        this.principal = principal;
    }

    public void  addmitedApplicant(Applicant applicant){
//        if (principal.admitApplicant(applicant)){
//
//        }
    }
}
