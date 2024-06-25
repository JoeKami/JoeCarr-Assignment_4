package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileReadingService {

    private final String masterFile = "student-master-list.csv";
    private int fileLines = 0;

    public Student[] readStudentsFromFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(masterFile))) {
            while (reader.readLine() != null) {
                fileLines++;
            }
        }

        Student[] student = new Student[fileLines];
        BufferedReader reader = new BufferedReader(new FileReader(masterFile));
        String line;
        int index = 0;

        while ((line = reader.readLine()) != null) {
            String[] studentElements = line.split(",");
            String studentID = studentElements[0].trim();
            String studentName = studentElements[1].trim();
            String course = studentElements[2].trim();
            String grade = studentElements[3].trim();
            student[index] = new Student(studentID, studentName, course, grade);
            index++;
        }
        reader.close();
        return student;
    }
}
