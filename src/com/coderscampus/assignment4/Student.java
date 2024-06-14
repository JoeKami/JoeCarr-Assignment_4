package com.coderscampus.assignment4;

public class Student {
    private String studentName;
    private String course;
    private Integer studentID;
    private Integer grade;

    Student(Integer studentID, String studentName, String course, Integer grade) {
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

    public Integer getStudentID() {
        return studentID;
    }

    public Integer getGrade() {
        return grade;
    }
}
