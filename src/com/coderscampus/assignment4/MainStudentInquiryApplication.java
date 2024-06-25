package com.coderscampus.assignment4;

import java.io.IOException;
import java.util.Arrays;

public class MainStudentInquiryApplication {
    public static void main(String[] args) throws IOException {
    FileReadingService fileReadingService = new FileReadingService();
        System.out.println(Arrays.toString(fileReadingService.readStudentsFromFile()));
    }
}
