package com.coderscampus.assignment4;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StudentService {
    private Student[] students;

    public StudentService() {
        FileReadingService fileReadingService = new FileReadingService();
        try {
            students = fileReadingService.readStudentsFromFile();
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public Student getStudentsByCourse (String course) {

    }
}
