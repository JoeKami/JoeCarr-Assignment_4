package com.coderscampus.assignment4;

import java.util.*;
import java.io.IOException;
import java.io.FileWriter;

public class StudentService {

    public Student[] orderStudentsByCourse(Student[] students, String course) {
        Student[] orderedStudents = new Student[students.length];
        int index = 0;

        for (Student student : students) {
            if (student != null && student.getCourse().contains(course)) {
                orderedStudents[index++] = student;
            }
        }


        return orderedStudents;
    }

    public void sortStudentsByGrade(Student[] students) {
        try {
            Arrays.sort(students, (a, b) -> {
                if (a == null && b == null) return 0;
                if (a == null) return 1;
                if (b == null) return -1;
                return b.getGrade() - a.getGrade();
            });
        } catch (NullPointerException e) {
            System.out.println("Null value detected: " + e.getMessage());
        }
    }

    public void writeStudentsToFile(Student[] students, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write("Student ID,Student Name,Course,Grade\n");
//            fileWriter.write(students.toString());
            for (Student student : students) {
                if (student != null) {
                    fileWriter.write(student + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
