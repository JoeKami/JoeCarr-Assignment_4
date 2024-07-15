package com.coderscampus.assignment4;

import java.io.IOException;
import java.util.Arrays;

public class MainStudentInquiryApplication {
    public static void main(String[] args) throws IOException {

        String masterFile = "student-master-list.csv";

        Student[] students = FileReadingService.readStudentsFromFile(masterFile);

        StudentService studentService = new StudentService();

        String[] courses = {"COMPSCI", "APMTH", "STAT"};
        for (int i = 0; i < courses.length; i++) {
            Student[] courseStudents = studentService.orderStudentsByCourse(students, courses[i]);
            studentService.sortStudentsByGrade(courseStudents);
            studentService.writeStudentsToFile(courseStudents, "course" + (i + 1) + ".csv");
        }

    }
}
