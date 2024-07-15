package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileReadingService {


    public static Student[] readStudentsFromFile(String masterFile) throws IOException {

        Student[] students = new Student[101];

        try (BufferedReader reader = new BufferedReader(new FileReader(masterFile))) {
            String line;
            reader.readLine();
            int index = 0;

            while ((line = reader.readLine()) != null) {
                String[] studentElements = line.split(",");
                String studentID = studentElements[0];
                String studentName = studentElements[1];
                String course = studentElements[2];
                int grade = Integer.parseInt(studentElements[3]);
                students[index++] = new Student(studentID, studentName, course, grade);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
    }
}
