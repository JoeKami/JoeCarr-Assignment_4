package com.coderscampus.assignment4;

public class Student {
    private final String studentName;
    private final String course;
    private final String studentID;
    private final int grade;

    Student(String studentID, String studentName, String course, int grade) {
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

    public String getStudentID() {
        return studentID;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return studentID + "," + studentName + "," + course + "," + grade;
    }
}
