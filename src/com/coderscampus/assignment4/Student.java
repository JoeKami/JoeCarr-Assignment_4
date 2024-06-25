package com.coderscampus.assignment4;

public class Student {
    private String studentName;
    private String course;
    private String studentID;
    private String  grade;

    Student(String studentID, String studentName, String course, String grade) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.course = course;
        this.grade = grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourse() {
        return course;
    }

    public String  getStudentID() {
        return studentID;
    }

    public String  getGrade() {
        return grade;
    }
}
